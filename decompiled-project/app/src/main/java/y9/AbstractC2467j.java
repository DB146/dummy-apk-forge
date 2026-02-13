package y9;

import A9.C0098j;
import A9.C0121o2;
import A9.C0154x0;
import A9.C0160y2;
import A9.G0;
import A9.K1;
import A9.N0;
import A9.N1;
import A9.O;
import A9.O1;
import A9.Q;
import A9.S;
import A9.W;
import A9.t3;
import A9.u3;
import J1.k;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import com.kt.apps.core.base.leanback.VerticalGridView;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: y9.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2467j<T extends J1.k> extends W1.C implements S {

    /* renamed from: m0, reason: collision with root package name */
    public C0098j f27506m0;

    /* renamed from: n0, reason: collision with root package name */
    public J1.k f27507n0;

    /* renamed from: o0, reason: collision with root package name */
    public t3 f27508o0;

    /* renamed from: p0, reason: collision with root package name */
    public u3 f27509p0;

    /* renamed from: q0, reason: collision with root package name */
    public O1 f27510q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f27511r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public final Db.o f27512s0 = android.support.v4.media.session.b.z(new wa.f(13));

    /* renamed from: t0, reason: collision with root package name */
    public final Db.o f27513t0;

    /* renamed from: u0, reason: collision with root package name */
    public final Db.o f27514u0;

    /* renamed from: v0, reason: collision with root package name */
    public final Db.o f27515v0;

    public AbstractC2467j() {
        final int i7 = 0;
        this.f27513t0 = android.support.v4.media.session.b.z(new Rb.a(this) { // from class: y9.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractC2467j f27504b;

            {
                this.f27504b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return new C0160y2(this.f27504b);
                    case 1:
                        return new Ca.c(1, this.f27504b);
                    default:
                        final AbstractC2467j abstractC2467j = this.f27504b;
                        return new K1() { // from class: y9.i
                            @Override // A9.K1
                            public final void a(int i10) {
                                if (i10 == 0) {
                                    AbstractC2467j.this.w0();
                                }
                            }
                        };
                }
            }
        });
        final int i10 = 1;
        this.f27514u0 = android.support.v4.media.session.b.z(new Rb.a(this) { // from class: y9.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractC2467j f27504b;

            {
                this.f27504b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return new C0160y2(this.f27504b);
                    case 1:
                        return new Ca.c(1, this.f27504b);
                    default:
                        final AbstractC2467j abstractC2467j = this.f27504b;
                        return new K1() { // from class: y9.i
                            @Override // A9.K1
                            public final void a(int i102) {
                                if (i102 == 0) {
                                    AbstractC2467j.this.w0();
                                }
                            }
                        };
                }
            }
        });
        final int i11 = 2;
        this.f27515v0 = android.support.v4.media.session.b.z(new Rb.a(this) { // from class: y9.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractC2467j f27504b;

            {
                this.f27504b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return new C0160y2(this.f27504b);
                    case 1:
                        return new Ca.c(1, this.f27504b);
                    default:
                        final AbstractC2467j abstractC2467j = this.f27504b;
                        return new K1() { // from class: y9.i
                            @Override // A9.K1
                            public final void a(int i102) {
                                if (i102 == 0) {
                                    AbstractC2467j.this.w0();
                                }
                            }
                        };
                }
            }
        });
    }

    @Override // W1.C
    public void R(Context context) {
        kotlin.jvm.internal.l.e(context, "context");
        super.R(context);
    }

    @Override // W1.C
    public void S(Bundle bundle) {
        super.S(bundle);
        this.f27509p0 = t0();
        this.f27510q0 = v0();
        N1 u02 = u0();
        u3 u3Var = this.f27509p0;
        if (u3Var != null) {
            u3Var.f1417f = u02;
        }
        if (u3Var != null) {
            u3Var.f1416e = (O1) this.f27514u0.getValue();
        }
        this.f27506m0 = new C0098j(this.f27509p0);
        x0();
        s0();
        if (bundle == null) {
            try {
                O o10 = p0().f937c;
                p0();
                o10.g();
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // W1.C
    public final View T(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.l.e(inflater, "inflater");
        DataBinderMapperImpl dataBinderMapperImpl = J1.e.f5416a;
        J1.k b2 = J1.e.f5416a.b(inflater.inflate(R.layout.fragment_tv_grid, viewGroup, false), R.layout.fragment_tv_grid);
        kotlin.jvm.internal.l.e(b2, "<set-?>");
        this.f27507n0 = b2;
        View view = o0().f5434e;
        kotlin.jvm.internal.l.d(view, "getRoot(...)");
        r0(view);
        Db.o oVar = this.f27512s0;
        ((C0121o2) oVar.getValue()).f1327a = 500L;
        ((C0121o2) oVar.getValue()).f1329c = (ViewGroup) o0().f5434e;
        return o0().f5434e;
    }

    @Override // W1.C
    public final void d0(View view, Bundle bundle) {
        kotlin.jvm.internal.l.e(view, "view");
        View findViewById = view.findViewById(R.id.browse_grid_dock);
        kotlin.jvm.internal.l.d(findViewById, "findViewById(...)");
        ViewGroup viewGroup = (ViewGroup) findViewById;
        u3 u3Var = this.f27509p0;
        kotlin.jvm.internal.l.b(u3Var);
        t3 d10 = u3Var.d(viewGroup);
        this.f27508o0 = d10;
        viewGroup.addView(d10.f1271a);
        t3 t3Var = this.f27508o0;
        kotlin.jvm.internal.l.b(t3Var);
        t3Var.f1376c.setOnChildLaidOutListener((K1) this.f27515v0.getValue());
        E6.b.g(viewGroup, new k1.a(this, 15));
        O o10 = p0().f937c;
        p0();
        o10.h();
        x0();
        q0(view);
    }

    @Override // A9.S
    public final Q h() {
        return p0();
    }

    public final J1.k o0() {
        J1.k kVar = this.f27507n0;
        if (kVar != null) {
            return kVar;
        }
        kotlin.jvm.internal.l.j("binding");
        throw null;
    }

    public final Q p0() {
        return (Q) this.f27513t0.getValue();
    }

    public abstract void q0(View view);

    public abstract void r0(View view);

    public abstract void s0();

    public abstract u3 t0();

    public abstract N1 u0();

    public abstract O1 v0();

    public final void w0() {
        VerticalGridView verticalGridView;
        int i7;
        t3 t3Var = this.f27508o0;
        if (t3Var == null || (verticalGridView = t3Var.f1376c) == null || verticalGridView.H(this.f27511r0) == null) {
            return;
        }
        t3 t3Var2 = this.f27508o0;
        kotlin.jvm.internal.l.b(t3Var2);
        int i10 = this.f27511r0;
        N0 n02 = t3Var2.f1376c.f1419Y0;
        G0 g02 = n02.f896X;
        if (g02 != null && i10 != -1 && (i7 = g02.f829f) >= 0) {
            if (i7 <= 0) {
                int i11 = g02.k(i10).f1468a;
                for (int y10 = n02.y() - 1; y10 >= 0; y10--) {
                    int Z02 = N0.Z0(n02.x(y10));
                    C0154x0 k = n02.f896X.k(Z02);
                    if (k == null || k.f1468a != i11 || Z02 >= i10) {
                    }
                }
            }
            O o10 = p0().f937c;
            o10.f920a = false;
            W w10 = (W) o10.f921b;
            Q q10 = w10.f999M0;
            if (q10 != null && q10.f937c == o10 && w10.f1020h1) {
                w10.N0();
                return;
            }
            return;
        }
        O o11 = p0().f937c;
        o11.f920a = true;
        W w11 = (W) o11.f921b;
        Q q11 = w11.f999M0;
        if (q11 != null && q11.f937c == o11 && w11.f1020h1) {
            w11.N0();
        }
    }

    public final void x0() {
        if (this.f27508o0 != null) {
            u3 u3Var = this.f27509p0;
            kotlin.jvm.internal.l.b(u3Var);
            u3Var.c(this.f27508o0, this.f27506m0);
            if (this.f27511r0 != -1) {
                t3 t3Var = this.f27508o0;
                kotlin.jvm.internal.l.b(t3Var);
                t3Var.f1376c.setSelectedPosition(this.f27511r0);
            }
        }
    }
}
