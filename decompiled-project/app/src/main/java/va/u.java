package va;

import A9.C0098j;
import A9.O0;
import android.view.View;
import hb.C1268a;
import java.util.List;
import r7.C1947c;
import v2.C2132d;

/* loaded from: classes2.dex */
public final class u extends I {

    /* renamed from: Q0, reason: collision with root package name */
    public Kc.d f25355Q0;

    /* renamed from: R0, reason: collision with root package name */
    public final C1268a f25356R0 = new Object();

    /* renamed from: S0, reason: collision with root package name */
    public final Db.o f25357S0 = android.support.v4.media.session.b.z(new com.kt.apps.core.utils.l(23));

    /* renamed from: T0, reason: collision with root package name */
    public final Db.o f25358T0 = android.support.v4.media.session.b.z(new C2132d(this, 2));

    /* renamed from: U0, reason: collision with root package name */
    public final O0 f25359U0 = vc.i.o(this, kotlin.jvm.internal.w.a(C2161e.class), new t(this, 0), new t(this, 1), new t(this, 2));

    /* renamed from: V0, reason: collision with root package name */
    public final Mc.a f25360V0 = Mc.a.f6935d.a();

    /* renamed from: W0, reason: collision with root package name */
    public List f25361W0;

    /* renamed from: X0, reason: collision with root package name */
    public l2.H f25362X0;

    /* renamed from: Y0, reason: collision with root package name */
    public boolean f25363Y0;

    @Override // y9.AbstractC2457B
    public final void C0(View rootView) {
        kotlin.jvm.internal.l.e(rootView, "rootView");
        t0(G0());
        String.valueOf((M9.d) this.f25358T0.getValue());
        android.support.v4.media.session.b.c(G0());
    }

    @Override // y9.AbstractC2457B
    public final void D0(View view) {
        x0(new C1947c(this, 13));
    }

    public final C0098j G0() {
        return (C0098j) this.f25357S0.getValue();
    }

    @Override // y9.AbstractC2457B, A9.A2, W1.C
    public final void V() {
        super.V();
        this.f25356R0.e();
    }

    @Override // W1.C
    public final void W() {
        this.f10275S = true;
    }

    @Override // W1.C
    public final void Y() {
        this.f10275S = true;
        l2.H h10 = this.f25362X0;
        if (h10 != null) {
            h10.j(H());
        }
    }

    @Override // W1.C
    public final void Z() {
        this.f10275S = true;
        C2161e c2161e = (C2161e) this.f25359U0.getValue();
        l2.H h10 = this.f25362X0;
        c2161e.j = h10;
        if (h10 != null) {
            h10.e(H(), new Ba.j(new Ba.o(this, 24), 5));
        }
    }

    @Override // W1.C
    public final void b0() {
        this.f10275S = true;
        this.f25362X0 = ((C2161e) this.f25359U0.getValue()).d(((M9.d) this.f25358T0.getValue()).f6851b);
    }
}
