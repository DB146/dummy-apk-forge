package com.kt.apps.media.xemtv.ui.main;

import A9.O0;
import Aa.g;
import B6.j;
import B6.m;
import Db.o;
import R7.a;
import W1.C;
import W1.C0558a;
import W1.O;
import W1.U;
import ab.C0792b;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.leanback.tab.LeanbackTabLayout;
import cb.b;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.material.button.MaterialButton;
import com.kt.apps.core.base.leanback.NavDrawerView;
import com.kt.apps.core.utils.leanback.ViewUtilsKt;
import com.kt.apps.media.xemtv.beta.R;
import f.C1124h;
import java.util.Map;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.w;
import l1.AbstractC1449a;
import l2.a0;
import pa.AbstractC1863a;
import r7.C1948d;
import ta.c;
import va.C2161e;
import va.r;
import wa.h;
import y9.AbstractActivityC2461d;
import y9.AbstractC2456A;
import za.C2606e;
import za.k;

/* loaded from: classes2.dex */
public final class MainActivity extends AbstractActivityC2461d implements b {

    /* renamed from: f0, reason: collision with root package name */
    public static final /* synthetic */ int f16195f0 = 0;

    /* renamed from: V, reason: collision with root package name */
    public a f16196V;

    /* renamed from: W, reason: collision with root package name */
    public volatile C0792b f16197W;

    /* renamed from: X, reason: collision with root package name */
    public final Object f16198X = new Object();

    /* renamed from: Y, reason: collision with root package name */
    public boolean f16199Y = false;

    /* renamed from: Z, reason: collision with root package name */
    public R9.a f16200Z;

    /* renamed from: a0, reason: collision with root package name */
    public final O0 f16201a0;

    /* renamed from: b0, reason: collision with root package name */
    public final O0 f16202b0;

    /* renamed from: c0, reason: collision with root package name */
    public View f16203c0;

    /* renamed from: d0, reason: collision with root package name */
    public TextView f16204d0;

    /* renamed from: e0, reason: collision with root package name */
    public final C1124h f16205e0;

    public MainActivity() {
        g(new g(this, 7));
        this.f16201a0 = new O0(w.a(c.class), new k(this, 4), new k(this, 3), new k(this, 5));
        w.a(h.class);
        w.a(C2161e.class);
        this.f16202b0 = new O0(w.a(Ba.h.class), new k(this, 1), new k(this, 0), new k(this, 2));
        this.f16205e0 = i(new O(2), new C1948d(25));
    }

    @Override // cb.b
    public final Object e() {
        return v().e();
    }

    @Override // y9.AbstractActivityC2461d
    public final int l() {
        return R.layout.activity_main;
    }

    @Override // c.AbstractActivityC0867k, l2.InterfaceC1470n
    public final a0 n() {
        return E6.b.m(this, super.n());
    }

    @Override // y9.AbstractActivityC2461d, c.AbstractActivityC0867k, android.app.Activity
    public final void onBackPressed() {
        m mVar;
        MaterialButton materialButton;
        J1.k kVar = this.f27490N;
        if (kVar == null) {
            l.j("binding");
            throw null;
        }
        View view = ((AbstractC1863a) kVar).f23221C.f5434e;
        l.d(view, "getRoot(...)");
        if (view.getVisibility() == 0) {
            o oVar = AbstractC2456A.g2;
            Message.obtain(O5.b.q(), 100002).sendToTarget();
            return;
        }
        if (j().D(android.R.id.content) != null) {
            super.onBackPressed();
            return;
        }
        C D10 = j().D(R.id.main_browse_fragment);
        if (D10 != null) {
            if (!(D10 instanceof C2606e)) {
                D10 = null;
            }
            if (D10 != null) {
                C2606e c2606e = (C2606e) D10;
                C c10 = c2606e.f1000N0;
                if (!(c10 instanceof Ca.b)) {
                    NavDrawerView navDrawerView = c2606e.f1010X0;
                    if (navDrawerView.f15968x) {
                        c2606e.P0();
                        return;
                    } else {
                        navDrawerView.requestFocus();
                        return;
                    }
                }
                l.c(c10, "null cannot be cast to non-null type com.kt.apps.media.xemtv.ui.tv.BaseTabLayoutFragment");
                Ca.b bVar = (Ca.b) c10;
                if ((bVar instanceof r) && !c2606e.f1010X0.f15968x && (materialButton = ((r) bVar).f25351T0) != null && materialButton.isFocused()) {
                    c2606e.f1010X0.requestFocus();
                    return;
                }
                if (bVar instanceof Ca.m) {
                    Ca.m mVar2 = (Ca.m) bVar;
                    if (mVar2.B0().g) {
                        mVar2.B0().a();
                        ((c) mVar2.f3120Q0.getValue()).cancelCurrentGetStreamLinkTask();
                        return;
                    }
                }
                if (c2606e.f1010X0.f15968x) {
                    c2606e.P0();
                    return;
                }
                LeanbackTabLayout F02 = bVar.F0();
                if ((F02 != null ? ViewUtilsKt.findCurrentFocusedView(F02) : null) != null) {
                    c2606e.f1010X0.requestFocus();
                    return;
                }
                LeanbackTabLayout F03 = bVar.F0();
                int findCurrentSelectedPosition = F03 != null ? ViewUtilsKt.findCurrentSelectedPosition(F03) : -1;
                if (findCurrentSelectedPosition < 0) {
                    c2606e.f1010X0.f();
                    return;
                }
                LeanbackTabLayout F04 = bVar.F0();
                l.b(F04);
                j g = F04.g(findCurrentSelectedPosition);
                if (g == null || (mVar = g.g) == null) {
                    return;
                }
                mVar.requestFocus();
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // y9.AbstractActivityC2461d, W1.G, c.AbstractActivityC0867k, k1.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z8;
        y(bundle);
        if (getResources().getBoolean(R.bool.isBeta)) {
            R9.a aVar = this.f16200Z;
            if (aVar == null) {
                l.j("keyValueStorage");
                throw null;
            }
            try {
                z8 = ((Boolean) ((R9.b) aVar).a(Boolean.TYPE, "IsVipDb")).booleanValue();
            } catch (Exception unused) {
                z8 = false;
            }
            if (!z8) {
                R9.a aVar2 = this.f16200Z;
                if (aVar2 == null) {
                    l.j("keyValueStorage");
                    throw null;
                }
                ((R9.b) aVar2).b(Boolean.TRUE, "IsVipDb");
            }
        }
        if (Build.VERSION.SDK_INT < 33 || AbstractC1449a.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") == 0 || shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
            return;
        }
        this.f16205e0.a("android.permission.POST_NOTIFICATIONS");
    }

    @Override // y9.AbstractActivityC2461d, W1.G, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        a aVar = this.f16196V;
        if (aVar != null) {
            aVar.f8927b = null;
        }
    }

    @Override // y9.AbstractActivityC2461d, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        boolean z8;
        C D10 = j().D(R.id.main_browse_fragment);
        if (!(D10 instanceof C2606e)) {
            D10 = null;
        }
        if (D10 != null) {
            C c10 = ((C2606e) D10).f1000N0;
            if (c10 instanceof Ca.m) {
                l.c(c10, "null cannot be cast to non-null type com.kt.apps.media.xemtv.ui.tv.FragmentTVDashboardNew");
                z8 = ((Ca.m) c10).B0().g;
            } else {
                z8 = false;
            }
            if (z8 && i7 != 4) {
                return true;
            }
        }
        switch (i7) {
            case 7:
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                Integer num = (Integer) ((Map) AbstractActivityC2461d.f27489U.getValue()).get(Integer.valueOf(i7));
                if (num != null) {
                    int intValue = num.intValue();
                    o oVar = AbstractC2456A.g2;
                    Message.obtain(O5.b.q(), 100001, intValue, 0).sendToTarget();
                    break;
                }
                break;
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override // c.AbstractActivityC0867k, android.app.Activity
    public final void onNewIntent(Intent intent) {
        C D10;
        l.e(intent, "intent");
        super.onNewIntent(intent);
        Uri data = intent.getData();
        if (data != null && (D10 = j().D(R.id.main_browse_fragment)) != null) {
            if (!(D10 instanceof C2606e)) {
                D10 = null;
            }
            if (D10 != null) {
                ((C2606e) D10).R0(data);
            }
        }
        x(intent);
    }

    @Override // y9.AbstractActivityC2461d, W1.G, android.app.Activity
    public final void onResume() {
        super.onResume();
        o oVar = AbstractC2456A.g2;
        O5.b.q().f27485a = new za.j(this);
    }

    @Override // y9.AbstractActivityC2461d
    public final void p(Bundle bundle) {
        String message = getIntent().getAction() + " - " + getIntent().getExtras();
        l.e(message, "message");
        x(getIntent());
        Ba.h.e((Ba.h) this.f16202b0.getValue(), "", null, 6);
        U j = j();
        j.getClass();
        C0558a c0558a = new C0558a(j);
        c0558a.j(R.id.main_browse_fragment, new C2606e(), null);
        c0558a.f();
    }

    @Override // y9.AbstractActivityC2461d
    public final void q() {
        String message = getIntent().getAction() + " - " + getIntent().getExtras();
        l.e(message, "message");
        J1.k kVar = this.f27490N;
        if (kVar == null) {
            l.j("binding");
            throw null;
        }
        ((AbstractC1863a) kVar).f5434e.getMeasuredWidth();
        J1.k kVar2 = this.f27490N;
        if (kVar2 == null) {
            l.j("binding");
            throw null;
        }
        this.f16203c0 = ((AbstractC1863a) kVar2).f23221C.f5434e;
        if (kVar2 != null) {
            this.f16204d0 = ((AbstractC1863a) kVar2).f23221C.f5743C;
        } else {
            l.j("binding");
            throw null;
        }
    }

    @Override // y9.AbstractActivityC2461d
    public final void r() {
        C D10 = j().D(R.id.main_browse_fragment);
        if (!(D10 instanceof C2606e)) {
            D10 = null;
        }
        if (D10 != null) {
            ((C2606e) D10).Q0();
        }
    }

    @Override // y9.AbstractActivityC2461d
    public final void t() {
        C D10 = j().D(R.id.main_browse_fragment);
        if (!(D10 instanceof C2606e)) {
            D10 = null;
        }
        if (D10 != null) {
            ((C2606e) D10).Q0();
        }
    }

    public final C0792b v() {
        if (this.f16197W == null) {
            synchronized (this.f16198X) {
                try {
                    if (this.f16197W == null) {
                        this.f16197W = new C0792b((Activity) this);
                    }
                } finally {
                }
            }
        }
        return this.f16197W;
    }

    public final void x(Intent intent) {
        String stringExtra;
        if (!"android.intent.action.SEARCH".equals(intent != null ? intent.getAction() : null) || (stringExtra = intent.getStringExtra("query")) == null) {
            return;
        }
        Ba.h.e((Ba.h) this.f16202b0.getValue(), stringExtra, null, 6);
    }

    public final void y(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof b) {
            a b2 = v().b();
            this.f16196V = b2;
            if (b2.A()) {
                this.f16196V.f8927b = o();
            }
        }
    }
}
