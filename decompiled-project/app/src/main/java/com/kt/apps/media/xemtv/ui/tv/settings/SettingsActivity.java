package com.kt.apps.media.xemtv.ui.tv.settings;

import Aa.g;
import Da.t;
import R7.a;
import W1.C0558a;
import W1.U;
import ab.C0792b;
import android.app.Activity;
import android.os.Bundle;
import c2.c;
import c2.h;
import cb.b;
import com.kt.apps.media.xemtv.beta.R;
import l2.a0;
import y9.AbstractActivityC2461d;

/* loaded from: classes2.dex */
public final class SettingsActivity extends AbstractActivityC2461d implements b {

    /* renamed from: V, reason: collision with root package name */
    public a f16223V;

    /* renamed from: W, reason: collision with root package name */
    public volatile C0792b f16224W;

    /* renamed from: X, reason: collision with root package name */
    public final Object f16225X = new Object();

    /* renamed from: Y, reason: collision with root package name */
    public boolean f16226Y = false;

    public SettingsActivity() {
        g(new g(this, 2));
    }

    @Override // cb.b
    public final Object e() {
        return v().e();
    }

    @Override // y9.AbstractActivityC2461d
    public final int l() {
        return R.layout.activity_settings;
    }

    @Override // c.AbstractActivityC0867k, l2.InterfaceC1470n
    public final a0 n() {
        return E6.b.m(this, super.n());
    }

    @Override // y9.AbstractActivityC2461d, c.AbstractActivityC0867k, android.app.Activity
    public final void onBackPressed() {
        j().H();
        super.onBackPressed();
    }

    @Override // y9.AbstractActivityC2461d, W1.G, c.AbstractActivityC0867k, k1.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x(bundle);
        setContentView(R.layout.activity_settings);
        if (bundle == null) {
            U j = j();
            j.getClass();
            C0558a c0558a = new C0558a(j);
            c0558a.j(R.id.main_browse_fragment, new t(), null);
            c0558a.f();
        }
    }

    @Override // y9.AbstractActivityC2461d, W1.G, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        a aVar = this.f16223V;
        if (aVar != null) {
            aVar.f8927b = null;
        }
    }

    @Override // y9.AbstractActivityC2461d
    public final void p(Bundle bundle) {
    }

    @Override // y9.AbstractActivityC2461d
    public final void q() {
        h.c(this).a(getWindow());
        h c10 = h.c(this);
        c cVar = c10.f14149d;
        cVar.f14133a = -16777216;
        cVar.f14134b = null;
        c10.g = -16777216;
        c10.f14152h = null;
        if (c10.f14154l == null) {
            return;
        }
        c10.h(c10.b());
    }

    public final C0792b v() {
        if (this.f16224W == null) {
            synchronized (this.f16225X) {
                try {
                    if (this.f16224W == null) {
                        this.f16224W = new C0792b((Activity) this);
                    }
                } finally {
                }
            }
        }
        return this.f16224W;
    }

    public final void x(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof b) {
            a b2 = v().b();
            this.f16223V = b2;
            if (b2.A()) {
                this.f16223V.f8927b = o();
            }
        }
    }
}
