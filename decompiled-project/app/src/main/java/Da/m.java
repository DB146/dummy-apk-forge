package Da;

import A9.C0098j;
import A9.N1;
import A9.O0;
import A9.O1;
import A9.f3;
import A9.u3;
import android.os.Bundle;
import android.view.View;
import com.kt.apps.media.xemtv.beta.R;
import kotlin.jvm.internal.w;

/* loaded from: classes2.dex */
public final class m extends p<pa.m> {

    /* renamed from: B0, reason: collision with root package name */
    public String f3328B0 = "Tất cả";
    public Aa.l C0 = Aa.l.f1523a;

    /* renamed from: D0, reason: collision with root package name */
    public final O0 f3329D0 = vc.i.o(this, w.a(ta.c.class), new l(this, 0), new l(this, 1), new l(this, 2));

    @Override // y9.AbstractC2467j, W1.C
    public final void S(Bundle bundle) {
        String str;
        Aa.l lVar;
        String string;
        super.S(bundle);
        Bundle bundle2 = this.f10300u;
        str = "Tất cả";
        if (bundle2 == null) {
            if (bundle != null) {
                String string2 = bundle.getString("extra:filter_group");
                this.f3328B0 = string2 != null ? string2 : "Tất cả";
                Aa.l lVar2 = (Aa.l) bundle.getParcelable("extra:filter_type");
                if (lVar2 == null) {
                    lVar2 = Aa.l.f1523a;
                }
                this.C0 = lVar2;
                return;
            }
            return;
        }
        if (bundle2 != null && (string = bundle2.getString("extra:filter_group")) != null) {
            str = string;
        }
        this.f3328B0 = str;
        Bundle bundle3 = this.f10300u;
        if (bundle3 == null || (lVar = (Aa.l) bundle3.getParcelable("extra:filter_type")) == null) {
            lVar = Aa.l.f1523a;
        }
        this.C0 = lVar;
    }

    @Override // W1.C
    public final void a0(Bundle bundle) {
        bundle.putString("extra:filter_group", this.f3328B0);
        bundle.putParcelable("extra:filter_type", this.C0);
    }

    @Override // y9.AbstractC2467j
    public final void q0(View rootView) {
        kotlin.jvm.internal.l.e(rootView, "rootView");
        ((ta.c) this.f3329D0.getValue()).getTvChannelLiveData().e(H(), new Ba.j(new Ba.o(this, 5), 3));
    }

    @Override // y9.AbstractC2467j
    public final void r0(View rootView) {
        kotlin.jvm.internal.l.e(rootView, "rootView");
    }

    @Override // y9.AbstractC2467j
    public final void s0() {
        f3 f3Var = new f3();
        float f4 = F().getDisplayMetrics().scaledDensity;
        this.f27506m0 = new C0098j(f3Var);
        x0();
    }

    @Override // y9.AbstractC2467j
    public final u3 t0() {
        u3 u3Var = new u3();
        u3Var.f1413b = R.layout.fragment_tv_vertical_grid;
        u3Var.f1415d = false;
        u3Var.j(5);
        return u3Var;
    }

    @Override // y9.AbstractC2467j
    public final N1 u0() {
        return new A1.d(this, 14);
    }

    @Override // y9.AbstractC2467j
    public final O1 v0() {
        return new Ca.p(0);
    }
}
