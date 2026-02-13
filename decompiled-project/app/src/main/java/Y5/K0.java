package Y5;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class K0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11425a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f11426b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S0 f11427c;

    public K0(S0 s02, long j, int i7) {
        this.f11425a = i7;
        switch (i7) {
            case 1:
                this.f11426b = j;
                Objects.requireNonNull(s02);
                this.f11427c = s02;
                return;
            default:
                this.f11426b = j;
                Objects.requireNonNull(s02);
                this.f11427c = s02;
                return;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11425a) {
            case 0:
                C0646q0 c0646q0 = (C0646q0) this.f11427c.f3094a;
                C0613f0 c0613f0 = c0646q0.f11911e;
                C0646q0.j(c0613f0);
                C0610e0 c0610e0 = c0613f0.f11749y;
                long j = this.f11426b;
                c0610e0.g(j);
                W w10 = c0646q0.f11912f;
                C0646q0.l(w10);
                w10.f11572A.b(Long.valueOf(j), "Session timeout duration set");
                return;
            default:
                S0 s02 = this.f11427c;
                s02.J();
                s02.K();
                C0646q0 c0646q02 = (C0646q0) s02.f3094a;
                W w11 = c0646q02.f11912f;
                C0646q0.l(w11);
                w11.f11572A.a("Resetting analytics data (FE)");
                t1 t1Var = c0646q02.f11914v;
                C0646q0.k(t1Var);
                t1Var.J();
                A4.e eVar = t1Var.f11949f;
                ((s1) eVar.f379c).c();
                ((C0646q0) ((t1) eVar.f380d).f3094a).f11917y.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                eVar.f377a = elapsedRealtime;
                eVar.f378b = elapsedRealtime;
                c0646q02.q().O();
                boolean z8 = !c0646q02.a();
                C0613f0 c0613f02 = c0646q02.f11911e;
                C0646q0.j(c0613f02);
                c0613f02.f11744f.g(this.f11426b);
                C0646q0 c0646q03 = (C0646q0) c0613f02.f3094a;
                C0613f0 c0613f03 = c0646q03.f11911e;
                C0646q0.j(c0613f03);
                if (!TextUtils.isEmpty(c0613f03.f11738J.t())) {
                    c0613f02.f11738J.u(null);
                }
                c0613f02.f11732D.g(0L);
                c0613f02.f11733E.g(0L);
                if (!c0646q03.f11910d.W()) {
                    c0613f02.S(z8);
                }
                c0613f02.f11739K.u(null);
                c0613f02.L.g(0L);
                c0613f02.f11740M.r(null);
                C0632l1 o10 = c0646q02.o();
                o10.J();
                o10.K();
                O1 Z7 = o10.Z(false);
                o10.V();
                ((C0646q0) o10.f3094a).n().N();
                o10.X(new RunnableC0617g1(o10, Z7, 0));
                C0646q0.k(t1Var);
                t1Var.f11948e.H();
                s02.f11545G = z8;
                c0646q02.o().N(new AtomicReference());
                return;
        }
    }
}
