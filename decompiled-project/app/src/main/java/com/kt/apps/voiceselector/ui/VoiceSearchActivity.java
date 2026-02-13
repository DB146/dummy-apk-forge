package com.kt.apps.voiceselector.ui;

import A9.N2;
import Db.o;
import La.g;
import R7.a;
import W1.O;
import ab.C0792b;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import cb.b;
import com.kt.apps.media.xemtv.beta.R;
import f.C1124h;
import l2.a0;
import y9.AbstractActivityC2461d;

/* loaded from: classes2.dex */
public final class VoiceSearchActivity extends AbstractActivityC2461d implements b {

    /* renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ int f16250d0 = 0;

    /* renamed from: V, reason: collision with root package name */
    public a f16251V;

    /* renamed from: W, reason: collision with root package name */
    public volatile C0792b f16252W;

    /* renamed from: X, reason: collision with root package name */
    public final Object f16253X = new Object();

    /* renamed from: Y, reason: collision with root package name */
    public boolean f16254Y = false;

    /* renamed from: Z, reason: collision with root package name */
    public g f16255Z;

    /* renamed from: a0, reason: collision with root package name */
    public final int f16256a0;

    /* renamed from: b0, reason: collision with root package name */
    public final C1124h f16257b0;

    /* renamed from: c0, reason: collision with root package name */
    public final o f16258c0;

    public VoiceSearchActivity() {
        g(new Aa.g(this, 5));
        this.f16256a0 = R.layout.activity_voice_search;
        this.f16257b0 = i(new O(3), new Q9.a(this, 1));
        this.f16258c0 = android.support.v4.media.session.b.z(new N2(this, 17));
    }

    @Override // cb.b
    public final Object e() {
        return v().e();
    }

    @Override // y9.AbstractActivityC2461d
    public final int l() {
        return this.f16256a0;
    }

    @Override // y9.AbstractActivityC2461d
    public final boolean m() {
        return false;
    }

    @Override // c.AbstractActivityC0867k, l2.InterfaceC1470n
    public final a0 n() {
        return E6.b.m(this, super.n());
    }

    @Override // y9.AbstractActivityC2461d, W1.G, c.AbstractActivityC0867k, k1.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof b) {
            a b2 = v().b();
            this.f16251V = b2;
            if (b2.A()) {
                this.f16251V.f8927b = o();
            }
        }
    }

    @Override // y9.AbstractActivityC2461d, W1.G, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        a aVar = this.f16251V;
        if (aVar != null) {
            aVar.f8927b = null;
        }
    }

    @Override // W1.G, android.app.Activity
    public final void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }

    @Override // y9.AbstractActivityC2461d
    public final void p(Bundle bundle) {
        this.f16257b0.a((Intent) this.f16258c0.getValue());
    }

    @Override // y9.AbstractActivityC2461d
    public final void q() {
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
    }

    public final C0792b v() {
        if (this.f16252W == null) {
            synchronized (this.f16253X) {
                try {
                    if (this.f16252W == null) {
                        this.f16252W = new C0792b((Activity) this);
                    }
                } finally {
                }
            }
        }
        return this.f16252W;
    }
}
