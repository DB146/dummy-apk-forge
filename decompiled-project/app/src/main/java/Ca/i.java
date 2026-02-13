package Ca;

import A9.C0098j;
import A9.C0107l0;
import A9.C0139t1;
import A9.C0163z1;
import A9.O0;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import hb.C1268a;
import java.util.Timer;
import kotlin.jvm.internal.w;
import y9.G;

/* loaded from: classes2.dex */
public final class i extends t {

    /* renamed from: Q0, reason: collision with root package name */
    public Kc.d f3103Q0;

    /* renamed from: R0, reason: collision with root package name */
    public final C1268a f3104R0 = new Object();

    /* renamed from: S0, reason: collision with root package name */
    public String f3105S0 = "Tất cả";

    /* renamed from: T0, reason: collision with root package name */
    public Aa.l f3106T0 = Aa.l.f1523a;

    /* renamed from: U0, reason: collision with root package name */
    public final O0 f3107U0 = vc.i.o(this, w.a(ta.c.class), new g(this, 0), new g(this, 1), new g(this, 2));

    /* renamed from: V0, reason: collision with root package name */
    public final Db.o f3108V0 = android.support.v4.media.session.b.z(new C0163z1(12));

    /* renamed from: W0, reason: collision with root package name */
    public String f3109W0;

    /* renamed from: X0, reason: collision with root package name */
    public Timer f3110X0;

    /* renamed from: Y0, reason: collision with root package name */
    public final C0098j f3111Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public C0139t1 f3112Z0;

    /* renamed from: a1, reason: collision with root package name */
    public final f f3113a1;

    /* renamed from: b1, reason: collision with root package name */
    public final Handler f3114b1;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, hb.a] */
    /* JADX WARN: Type inference failed for: r0v10, types: [Ca.f, java.lang.Object] */
    public i() {
        Mc.a.f6935d.a();
        this.f3111Y0 = new C0098j(new C0107l0(4));
        this.f3113a1 = new Object();
        Looper myLooper = Looper.myLooper();
        kotlin.jvm.internal.l.b(myLooper);
        this.f3114b1 = new Handler(myLooper);
    }

    @Override // y9.AbstractC2457B
    public final void C0(View rootView) {
        kotlin.jvm.internal.l.e(rootView, "rootView");
        t0(G0());
        if (!(H0().getTvChannelLiveData().d() instanceof G)) {
            H0().getListTVChannel(false);
        }
        y0(new c(0, this));
        x0(new A1.d(this, 8));
        H0().getTvChannelLiveData().e(H(), new Ba.j(new Ba.o(this, 1), 1));
    }

    @Override // y9.AbstractC2457B
    public final void D0(View view) {
    }

    public final C0098j G0() {
        return (C0098j) this.f3108V0.getValue();
    }

    public final ta.c H0() {
        return (ta.c) this.f3107U0.getValue();
    }

    @Override // A9.A2, W1.C
    public final void S(Bundle bundle) {
        super.S(bundle);
        String string = h0().getString("extra:filter_group");
        if (string == null) {
            string = "Tất cả";
        }
        this.f3105S0 = string;
        Aa.l lVar = (Aa.l) h0().getParcelable("extra:filter_type");
        if (lVar == null) {
            lVar = Aa.l.f1523a;
        }
        this.f3106T0 = lVar;
    }

    @Override // y9.AbstractC2457B, A9.A2, W1.C
    public final void V() {
        B0().f1332f = false;
        B0().f1329c = null;
        this.f3104R0.e();
        super.V();
    }

    @Override // A9.A2, W1.C
    public final void a0(Bundle bundle) {
        bundle.putInt("currentSelectedPosition", this.f753p0);
        bundle.putAll(this.f10300u);
    }

    @Override // W1.C
    public final void c0() {
        H0().clearCurrentPlayingChannelState();
        this.f10275S = true;
    }

    @Override // W1.C
    public final void e0(Bundle bundle) {
        this.f10275S = true;
        if (bundle == null) {
            return;
        }
        String string = bundle.getString("extra:filter_group");
        if (string == null) {
            string = "Tất cả";
        }
        this.f3105S0 = string;
        Aa.l lVar = (Aa.l) bundle.getParcelable("extra:filter_type");
        if (lVar == null) {
            lVar = Aa.l.f1523a;
        }
        this.f3106T0 = lVar;
    }
}
