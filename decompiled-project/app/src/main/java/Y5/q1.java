package Y5;

import java.util.Objects;

/* loaded from: classes.dex */
public final class q1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f11920b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t1 f11921c;

    public q1(t1 t1Var, long j, int i7) {
        this.f11919a = i7;
        switch (i7) {
            case 1:
                this.f11920b = j;
                Objects.requireNonNull(t1Var);
                this.f11921c = t1Var;
                return;
            default:
                this.f11920b = j;
                Objects.requireNonNull(t1Var);
                this.f11921c = t1Var;
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b2, code lost:
    
        if (r1.f11735G.a() != false) goto L19;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        switch (this.f11919a) {
            case 0:
                t1 t1Var = this.f11921c;
                t1Var.J();
                t1Var.N();
                C0646q0 c0646q0 = (C0646q0) t1Var.f3094a;
                W w10 = c0646q0.f11912f;
                C0646q0.l(w10);
                long j = this.f11920b;
                w10.f11573B.b(Long.valueOf(j), "Activity resumed, time");
                E e2 = F.f11293U0;
                C0615g c0615g = c0646q0.f11910d;
                boolean T10 = c0615g.T(null, e2);
                A4.e eVar = t1Var.f11949f;
                if (!T10) {
                    if (!c0615g.X()) {
                        C0613f0 c0613f0 = c0646q0.f11911e;
                        C0646q0.j(c0613f0);
                        break;
                    }
                    ((t1) eVar.f380d).J();
                    ((s1) eVar.f379c).c();
                    eVar.f377a = j;
                    eVar.f378b = j;
                } else if (c0615g.X() || t1Var.f11947d) {
                    ((t1) eVar.f380d).J();
                    ((s1) eVar.f379c).c();
                    eVar.f377a = j;
                    eVar.f378b = j;
                }
                q3.e eVar2 = t1Var.f11950u;
                t1 t1Var2 = (t1) eVar2.f23377c;
                t1Var2.J();
                r1 r1Var = (r1) eVar2.f23376b;
                if (r1Var != null) {
                    t1Var2.f11946c.removeCallbacks(r1Var);
                }
                C0646q0 c0646q02 = (C0646q0) t1Var2.f3094a;
                C0613f0 c0613f02 = c0646q02.f11911e;
                C0646q0.j(c0613f02);
                c0613f02.f11735G.b(false);
                t1Var2.J();
                t1Var2.f11947d = false;
                if (c0646q02.f11910d.T(null, F.f11291T0)) {
                    S0 s02 = c0646q02.f11890A;
                    C0646q0.k(s02);
                    if (s02.f11540B) {
                        W w11 = c0646q02.f11912f;
                        C0646q0.l(w11);
                        w11.f11573B.a("Retrying trigger URI registration in foreground");
                        C0646q0.k(s02);
                        s02.h0();
                    }
                }
                R7.a aVar = t1Var.f11948e;
                t1 t1Var3 = (t1) aVar.f8927b;
                t1Var3.J();
                C0646q0 c0646q03 = (C0646q0) t1Var3.f3094a;
                if (c0646q03.a()) {
                    c0646q03.f11917y.getClass();
                    aVar.J(System.currentTimeMillis());
                    return;
                }
                return;
            default:
                t1 t1Var4 = this.f11921c;
                t1Var4.J();
                t1Var4.N();
                C0646q0 c0646q04 = (C0646q0) t1Var4.f3094a;
                W w12 = c0646q04.f11912f;
                C0646q0.l(w12);
                long j10 = this.f11920b;
                w12.f11573B.b(Long.valueOf(j10), "Activity paused, time");
                q3.e eVar3 = t1Var4.f11950u;
                t1 t1Var5 = (t1) eVar3.f23377c;
                ((C0646q0) t1Var5.f3094a).f11917y.getClass();
                r1 r1Var2 = new r1(eVar3, System.currentTimeMillis(), j10);
                eVar3.f23376b = r1Var2;
                t1Var5.f11946c.postDelayed(r1Var2, 2000L);
                if (c0646q04.f11910d.X()) {
                    ((s1) t1Var4.f11949f.f379c).c();
                    return;
                }
                return;
        }
    }
}
