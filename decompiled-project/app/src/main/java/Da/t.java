package Da;

import A9.A2;
import A9.AbstractC0132r2;
import A9.C0096i1;
import A9.C0098j;
import A9.C0163z1;
import A9.P1;
import A9.T;
import A9.W;
import A9.p3;
import W1.C;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.leanback.tab.LeanbackViewPager;
import com.kt.apps.media.xemtv.beta.R;
import g3.C1191j;
import i2.C1332t;
import java.util.HashMap;
import za.C2608g;

/* loaded from: classes2.dex */
public final class t extends W {

    /* renamed from: y1, reason: collision with root package name */
    public static final /* synthetic */ int f3343y1 = 0;

    /* renamed from: v1, reason: collision with root package name */
    public final Db.o f3344v1 = android.support.v4.media.session.b.z(new C0163z1(14));

    /* renamed from: w1, reason: collision with root package name */
    public final Db.o f3345w1;

    /* renamed from: x1, reason: collision with root package name */
    public final Db.o f3346x1;

    public t() {
        final int i7 = 0;
        this.f3345w1 = android.support.v4.media.session.b.z(new Rb.a(this) { // from class: Da.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f3341b;

            {
                this.f3341b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                t tVar = this.f3341b;
                switch (i7) {
                    case 0:
                        int i10 = t.f3343y1;
                        return new C2608g(tVar.i0(), c2.h.c(tVar.g0()));
                    default:
                        int i11 = t.f3343y1;
                        return new s(tVar);
                }
            }
        });
        final int i10 = 1;
        this.f3346x1 = android.support.v4.media.session.b.z(new Rb.a(this) { // from class: Da.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f3341b;

            {
                this.f3341b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                t tVar = this.f3341b;
                switch (i10) {
                    case 0:
                        int i102 = t.f3343y1;
                        return new C2608g(tVar.i0(), c2.h.c(tVar.g0()));
                    default:
                        int i11 = t.f3343y1;
                        return new s(tVar);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [A9.O1, java.lang.Object] */
    @Override // W1.C
    public final void O() {
        Log.i("MainSettingsFragment", "onCreate");
        this.f10275S = true;
        C1332t c1332t = new C1332t(3);
        this.f1017e1 = c1332t;
        T t5 = this.f1001O0;
        if (t5 != null) {
            ((A2) t5.f964a).x0(c1332t);
        }
        this.f1016d1 = new Object();
    }

    @Override // A9.W, W1.C
    public final View T(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.l.e(inflater, "inflater");
        return super.T(inflater, viewGroup, bundle);
    }

    @Override // A9.E, W1.C
    public final void Z() {
        ImageView imageView;
        super.Z();
        C c10 = this.f1000N0;
        if (c10 == null || c10.f10272P) {
            return;
        }
        if (c10 instanceof Ca.b) {
            LeanbackViewPager G02 = ((Ca.b) c10).G0();
            if (G02 != null) {
                G02.requestFocus();
            }
        } else if ((c10 instanceof Ba.s) && (imageView = ((Ba.s) c10).f2287b1) != null) {
            imageView.requestFocus();
        }
        int i7 = this.f1018f1;
        if (i7 >= 0) {
            this.f1010X0.h(i7);
        }
    }

    @Override // A9.D, A9.E, W1.C
    public final void d0(View view, Bundle bundle) {
        kotlin.jvm.internal.l.e(view, "view");
        super.d0(view, bundle);
        this.f1010X0.setMenu(R.menu.settings_menu);
        ((HashMap) this.f998L0.f964a).put(P1.class, (C2608g) this.f3345w1.getValue());
        F0(1);
        Bundle bundle2 = this.f10300u;
        if (bundle2 == null) {
            bundle2 = com.bumptech.glide.c.e();
        }
        l0(bundle2);
        ((p3) this.f802p0).f1345a.setTitle(null);
        h0().putInt(W.f993u1, 1);
        this.f1008V0 = true;
        D9.a aVar = this.f782A0;
        D9.d dVar = this.f785E0;
        dVar.g(aVar);
        AbstractC0132r2 abstractC0132r2 = new AbstractC0132r2(new C0096i1("Cài đặt phím số", 1000L));
        Db.o oVar = this.f3344v1;
        ((C0098j) oVar.getValue()).g(abstractC0132r2);
        E0((C0098j) oVar.getValue());
        D9.a aVar2 = this.f783B0;
        dVar.g(aVar2);
        this.f1010X0.setOnNavDrawerItemSelected(new C1191j(this, 6));
        this.f1006T0.setOnFocusSearchListener((s) this.f3346x1.getValue());
        C0(0);
        dVar.g(aVar2);
    }
}
