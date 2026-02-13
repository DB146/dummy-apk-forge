package za;

import A9.AbstractC0132r2;
import A9.C0096i1;
import A9.C0098j;
import A9.O0;
import A9.P1;
import A9.W;
import Ba.s;
import Db.o;
import W1.C;
import W1.G;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.leanback.tab.LeanbackViewPager;
import ea.C1108c;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.w;
import l1.AbstractC1449a;
import va.C2161e;
import va.C2165i;
import y9.J;

/* renamed from: za.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2606e extends h implements J {

    /* renamed from: J1, reason: collision with root package name */
    public static boolean f28342J1 = true;
    public static final o K1 = android.support.v4.media.session.b.z(new wa.f(24));

    /* renamed from: L1, reason: collision with root package name */
    public static final o f28343L1 = android.support.v4.media.session.b.z(new wa.f(25));

    /* renamed from: A1, reason: collision with root package name */
    public c2.h f28344A1;
    public long B1 = -1;

    /* renamed from: C1, reason: collision with root package name */
    public final o f28345C1 = android.support.v4.media.session.b.z(new wa.f(23));

    /* renamed from: D1, reason: collision with root package name */
    public final O0 f28346D1 = vc.i.o(this, w.a(Ba.h.class), new C2605d(this, 3), new C2605d(this, 4), new C2605d(this, 5));

    /* renamed from: E1, reason: collision with root package name */
    public final O0 f28347E1 = vc.i.o(this, w.a(ta.c.class), new C2605d(this, 6), new C2605d(this, 7), new C2605d(this, 8));

    /* renamed from: F1, reason: collision with root package name */
    public final O0 f28348F1;

    /* renamed from: G1, reason: collision with root package name */
    public final o f28349G1;

    /* renamed from: H1, reason: collision with root package name */
    public final o f28350H1;

    /* renamed from: I1, reason: collision with root package name */
    public boolean f28351I1;

    public C2606e() {
        vc.i.o(this, w.a(C2161e.class), new C2605d(this, 9), new C2605d(this, 10), new C2605d(this, 11));
        this.f28348F1 = vc.i.o(this, w.a(wa.h.class), new C2605d(this, 0), new C2605d(this, 1), new C2605d(this, 2));
        final int i7 = 0;
        this.f28349G1 = android.support.v4.media.session.b.z(new Rb.a(this) { // from class: za.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C2606e f28338b;

            {
                this.f28338b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                C2606e c2606e = this.f28338b;
                switch (i7) {
                    case 0:
                        boolean z8 = C2606e.f28342J1;
                        return new C2604c(c2606e);
                    default:
                        boolean z10 = C2606e.f28342J1;
                        return new C2608g(c2606e.i0(), c2.h.c(c2606e.g0()));
                }
            }
        });
        final int i10 = 1;
        this.f28350H1 = android.support.v4.media.session.b.z(new Rb.a(this) { // from class: za.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C2606e f28338b;

            {
                this.f28338b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                C2606e c2606e = this.f28338b;
                switch (i10) {
                    case 0:
                        boolean z8 = C2606e.f28342J1;
                        return new C2604c(c2606e);
                    default:
                        boolean z10 = C2606e.f28342J1;
                        return new C2608g(c2606e.i0(), c2.h.c(c2606e.g0()));
                }
            }
        });
    }

    public final void P0() {
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC2602a(this, 0), 3000L);
        if (this.f28351I1) {
            g0().finish();
        } else {
            Toast.makeText(i0(), "Nhấn back lần nữa để thoát ứng dụng", 0).show();
            this.f28351I1 = true;
        }
    }

    public final void Q0() {
        int i7 = this.f1018f1;
        if (i7 < 0) {
            return;
        }
        String message = "selectedPosition: " + i7;
        kotlin.jvm.internal.l.e(message, "message");
        this.f1010X0.i(this.f1018f1, true);
    }

    @Override // za.h, W1.C
    public final void R(Context context) {
        kotlin.jvm.internal.l.e(context, "context");
        this.f787G0.f14237e = false;
        super.R(context);
    }

    public final void R0(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null && scheme.hashCode() == 113939874 && scheme.equals("xemtv")) {
            kotlin.jvm.internal.l.d(uri.toString(), "toString(...)");
            String host = uri.getHost();
            if (host != null) {
                int hashCode = host.hashCode();
                if (hashCode == -1383420477) {
                    if (host.equals("bongda")) {
                        try {
                            if (g0().j().D(R.id.content) instanceof v9.c) {
                                g0().j().S();
                            }
                        } catch (Exception unused) {
                        }
                        C0(Eb.o.a0(com.bumptech.glide.c.C().keySet(), 10998L));
                        return;
                    }
                    return;
                }
                if (hashCode == 3714) {
                    if (host.equals("tv")) {
                        try {
                            if (g0().j().D(R.id.content) instanceof v9.c) {
                                g0().j().S();
                            }
                        } catch (Exception unused2) {
                        }
                        C0(Eb.o.a0(com.bumptech.glide.c.C().keySet(), 10999L));
                        return;
                    }
                    return;
                }
                if (hashCode == 108270587 && host.equals("radio")) {
                    try {
                        if (g0().j().D(R.id.content) instanceof v9.c) {
                            g0().j().S();
                        }
                    } catch (Exception unused3) {
                    }
                    C0(Eb.o.a0(com.bumptech.glide.c.C().keySet(), 10997L));
                }
            }
        }
    }

    @Override // A9.W, A9.D, W1.C
    public final void S(Bundle bundle) {
        super.S(bundle);
        ((HashMap) this.f998L0.f964a).put(P1.class, (C2608g) this.f28350H1.getValue());
    }

    @Override // A9.W, W1.C
    public final View T(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.l.e(inflater, "inflater");
        F0(1);
        Bundle bundle2 = this.f10300u;
        if (bundle2 == null) {
            bundle2 = com.bumptech.glide.c.e();
        }
        l0(bundle2);
        h0().putInt(W.f993u1, 1);
        this.f1008V0 = true;
        this.f785E0.g(this.f782A0);
        E0((C0098j) this.f28345C1.getValue());
        return super.T(inflater, viewGroup, bundle);
    }

    @Override // A9.W, A9.E, W1.C
    public final void V() {
        f28342J1 = true;
        super.V();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.concurrent.atomic.AtomicReference, hb.b] */
    @Override // A9.E, W1.C
    public final void Y() {
        super.Y();
        Ba.h hVar = (Ba.h) this.f28346D1.getValue();
        ?? r12 = hVar.j;
        if (r12 != 0) {
            r12.b();
        }
        hVar.c().l(new Object());
    }

    @Override // A9.E, W1.C
    public final void Z() {
        ImageView imageView;
        super.Z();
        C c10 = this.f1000N0;
        if (c10 != null && !c10.f10272P) {
            if (c10 instanceof Ca.b) {
                LeanbackViewPager G02 = ((Ca.b) c10).G0();
                if (G02 != null) {
                    G02.requestFocus();
                }
            } else if ((c10 instanceof s) && (imageView = ((s) c10).f2287b1) != null) {
                imageView.requestFocus();
            }
            if (!(this.f1000N0 instanceof s)) {
                Ba.h.d((Ba.h) this.f28346D1.getValue());
            }
            int i7 = this.f1018f1;
            if (i7 >= 0) {
                this.f1010X0.h(i7);
            }
        }
        c2.h hVar = this.f28344A1;
        if (hVar != null) {
            hVar.g(this.B1 == 10998 ? AbstractC1449a.getDrawable(i0(), com.kt.apps.media.xemtv.beta.R.drawable.main_background) : AbstractC1449a.getDrawable(i0(), com.kt.apps.media.xemtv.beta.R.drawable.tv_bg));
        } else {
            kotlin.jvm.internal.l.j("mBackgroundManager");
            throw null;
        }
    }

    @Override // y9.J
    public final void c() {
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.jvm.internal.t, java.lang.Object] */
    @Override // A9.D, A9.E, W1.C
    public final void d0(View view, Bundle bundle) {
        Intent intent;
        Uri data;
        kotlin.jvm.internal.l.e(view, "view");
        super.d0(view, bundle);
        ?? obj = new Object();
        obj.f19132a = -1;
        this.f1010X0.setOnNavDrawerItemSelected(new C1108c(20, obj, this));
        G A10 = A();
        if (A10 != null && (intent = A10.getIntent()) != null && (data = intent.getData()) != null) {
            R0(data);
        }
        c2.h c10 = c2.h.c(A());
        this.f28344A1 = c10;
        c10.a(g0().getWindow());
        c2.h hVar = this.f28344A1;
        if (hVar == null) {
            kotlin.jvm.internal.l.j("mBackgroundManager");
            throw null;
        }
        c2.c cVar = hVar.f14149d;
        cVar.f14133a = -16777216;
        cVar.f14134b = null;
        hVar.g = -16777216;
        hVar.f14152h = null;
        if (hVar.f14154l != null) {
            hVar.h(hVar.b());
        }
        this.f1016d1 = new Ca.c(2, this);
        for (Map.Entry entry : com.bumptech.glide.c.C().entrySet()) {
            long longValue = ((Number) entry.getKey()).longValue();
            String headerName = (String) entry.getValue();
            Object obj2 = ((Map) f28343L1.getValue()).get(entry.getKey());
            kotlin.jvm.internal.l.b(obj2);
            ((Number) obj2).intValue();
            kotlin.jvm.internal.l.e(headerName, "headerName");
            ((C0098j) this.f28345C1.getValue()).g(new AbstractC0132r2(new C0096i1(headerName, longValue)));
        }
        this.f785E0.g(this.f783B0);
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC2602a(this, 1), 200L);
        this.f1006T0.setOnFocusSearchListener((C2604c) this.f28349G1.getValue());
    }

    @Override // y9.J
    public final void f() {
    }

    @Override // y9.J
    public final void g() {
    }

    @Override // y9.J
    public final void i() {
        C c10 = this.f1000N0;
        if (c10 instanceof C2165i) {
            kotlin.jvm.internal.l.c(c10, "null cannot be cast to non-null type com.kt.apps.media.xemtv.ui.extensions.FragmentAddExtensions");
        }
    }

    @Override // y9.J
    public final void j() {
    }

    @Override // y9.J
    public final void k() {
    }

    @Override // y9.J
    public final void l() {
        View findViewById;
        View view;
        View findViewById2;
        View findViewById3;
        View findViewById4;
        C c10 = this.f1000N0;
        if (c10 instanceof C2165i) {
            kotlin.jvm.internal.l.c(c10, "null cannot be cast to non-null type com.kt.apps.media.xemtv.ui.extensions.FragmentAddExtensions");
            C2165i c2165i = (C2165i) c10;
            View view2 = c2165i.f10277U;
            if (view2 != null && (findViewById3 = view2.findViewById(com.kt.apps.media.xemtv.beta.R.id.textInputEditText_2)) != null && findViewById3.isFocused()) {
                View view3 = c2165i.f10277U;
                if (view3 == null || (findViewById4 = view3.findViewById(com.kt.apps.media.xemtv.beta.R.id.textInputEditText)) == null) {
                    return;
                }
                findViewById4.requestFocus();
                return;
            }
            View view4 = c2165i.f10277U;
            if (view4 == null || (findViewById = view4.findViewById(com.kt.apps.media.xemtv.beta.R.id.btn_save)) == null || !findViewById.isFocused() || (view = c2165i.f10277U) == null || (findViewById2 = view.findViewById(com.kt.apps.media.xemtv.beta.R.id.textInputEditText_2)) == null) {
                return;
            }
            findViewById2.requestFocus();
        }
    }

    @Override // y9.J
    public final void m(int i7) {
    }

    @Override // y9.J
    public final void p() {
    }

    @Override // y9.J
    public final void q() {
    }

    @Override // y9.J
    public final void u() {
    }

    @Override // y9.J
    public final void v() {
    }
}
