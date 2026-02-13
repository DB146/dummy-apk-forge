package Ca;

import A9.C0098j;
import A9.N1;
import A9.O0;
import A9.O1;
import A9.u3;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.kt.apps.core.utils.UtilsKt;
import com.kt.apps.media.xemtv.beta.R;
import hb.C1268a;
import kotlin.jvm.internal.w;

/* loaded from: classes2.dex */
public final class r extends v<pa.m> {

    /* renamed from: B0, reason: collision with root package name */
    public Kc.d f3127B0;
    public final C1268a C0 = new Object();

    /* renamed from: D0, reason: collision with root package name */
    public String f3128D0 = "Tất cả";

    /* renamed from: E0, reason: collision with root package name */
    public Aa.l f3129E0 = Aa.l.f1523a;

    /* renamed from: F0, reason: collision with root package name */
    public final O0 f3130F0 = vc.i.o(this, w.a(ta.c.class), new q(this, 0), new q(this, 1), new q(this, 2));

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
                this.f3128D0 = string2 != null ? string2 : "Tất cả";
                Aa.l lVar2 = (Aa.l) bundle.getParcelable("extra:filter_type");
                if (lVar2 == null) {
                    lVar2 = Aa.l.f1523a;
                }
                this.f3129E0 = lVar2;
                return;
            }
            return;
        }
        if (bundle2 != null && (string = bundle2.getString("extra:filter_group")) != null) {
            str = string;
        }
        this.f3128D0 = str;
        Bundle bundle3 = this.f10300u;
        if (bundle3 == null || (lVar = (Aa.l) bundle3.getParcelable("extra:filter_type")) == null) {
            lVar = Aa.l.f1523a;
        }
        this.f3129E0 = lVar;
    }

    @Override // W1.C
    public final void V() {
        this.C0.e();
        this.f10275S = true;
    }

    @Override // W1.C
    public final void a0(Bundle bundle) {
        bundle.putString("extra:filter_group", this.f3128D0);
        bundle.putParcelable("extra:filter_type", this.f3129E0);
    }

    @Override // y9.AbstractC2467j
    public final void q0(View rootView) {
        kotlin.jvm.internal.l.e(rootView, "rootView");
        ((ta.c) this.f3130F0.getValue()).getTvChannelLiveData().e(H(), new Ba.j(new Ba.o(this, 3), 2));
    }

    @Override // y9.AbstractC2467j
    public final void r0(View rootView) {
        kotlin.jvm.internal.l.e(rootView, "rootView");
    }

    @Override // y9.AbstractC2467j
    public final void s0() {
        sa.h hVar = new sa.h(g0());
        hVar.f24230b = Float.valueOf(150 * F().getDisplayMetrics().scaledDensity);
        this.f27506m0 = new C0098j(hVar);
        x0();
    }

    @Override // y9.AbstractC2467j
    public final u3 t0() {
        Object n6;
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        u3 u3Var = new u3();
        u3Var.f1413b = R.layout.fragment_tv_vertical_grid;
        u3Var.f1415d = false;
        try {
            Context i02 = i0();
            int i7 = Q5.e.f8664c;
            if (i7 == -1) {
                if (Build.VERSION.SDK_INT >= 30) {
                    Object systemService = i02.getSystemService("window");
                    kotlin.jvm.internal.l.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                    currentWindowMetrics = ((WindowManager) systemService).getCurrentWindowMetrics();
                    kotlin.jvm.internal.l.d(currentWindowMetrics, "getCurrentWindowMetrics(...)");
                    bounds = currentWindowMetrics.getBounds();
                    Q5.e.f8664c = bounds.width();
                } else {
                    Q5.e.f8664c = Resources.getSystem().getDisplayMetrics().widthPixels;
                }
                i7 = Q5.e.f8664c;
            }
            n6 = Integer.valueOf((i7 - UtilsKt.dpToPx(80)) / UtilsKt.dpToPx(160));
        } catch (Throwable th) {
            n6 = com.bumptech.glide.c.n(th);
        }
        if (n6 instanceof Db.l) {
            n6 = 5;
        }
        int intValue = ((Number) n6).intValue();
        u3Var.j(intValue >= 5 ? intValue : 5);
        return u3Var;
    }

    @Override // y9.AbstractC2467j
    public final N1 u0() {
        return new A1.d(this, 9);
    }

    @Override // y9.AbstractC2467j
    public final O1 v0() {
        return new p(0);
    }
}
