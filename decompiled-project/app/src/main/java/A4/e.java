package A4;

import Y5.C0605c1;
import Y5.C0613f0;
import Y5.C0646q0;
import Y5.F;
import Y5.M1;
import Y5.S0;
import Y5.W;
import Y5.s1;
import Y5.t1;
import android.os.Bundle;
import ea.C1112g;
import m5.C1604a;
import n5.AbstractC1705a;
import n5.D;
import s4.C1979g;
import s4.C1986n;
import s4.C1987o;

/* loaded from: classes.dex */
public final class e implements B4.g {

    /* renamed from: a, reason: collision with root package name */
    public long f377a;

    /* renamed from: b, reason: collision with root package name */
    public long f378b;

    /* renamed from: c, reason: collision with root package name */
    public Object f379c;

    /* renamed from: d, reason: collision with root package name */
    public Object f380d;

    public e(int i7, long j) {
        AbstractC1705a.m(((C1604a) this.f379c) == null);
        this.f377a = j;
        this.f378b = j + i7;
    }

    public e(String str, byte[] bArr, long j, long j10) {
        this.f379c = str;
        this.f380d = bArr;
        this.f377a = j;
        this.f378b = j10;
    }

    public boolean a(long j, boolean z8, boolean z10) {
        t1 t1Var = (t1) this.f380d;
        t1Var.J();
        t1Var.K();
        C0646q0 c0646q0 = (C0646q0) t1Var.f3094a;
        if (c0646q0.a()) {
            C0613f0 c0613f0 = c0646q0.f11911e;
            C0646q0.j(c0613f0);
            c0646q0.f11917y.getClass();
            c0613f0.f11732D.g(System.currentTimeMillis());
        }
        long j10 = j - this.f377a;
        W w10 = c0646q0.f11912f;
        if (!z8 && j10 < 1000) {
            C0646q0.l(w10);
            w10.f11573B.b(Long.valueOf(j10), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z10) {
            j10 = j - this.f378b;
            this.f378b = j;
        }
        C0646q0.l(w10);
        w10.f11573B.b(Long.valueOf(j10), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j10);
        boolean z11 = !c0646q0.f11910d.X();
        C0605c1 c0605c1 = c0646q0.f11918z;
        C0646q0.k(c0605c1);
        M1.A0(c0605c1.P(z11), bundle, true);
        if (!z10) {
            S0 s02 = c0646q0.f11890A;
            C0646q0.k(s02);
            s02.Q("auto", "_e", bundle);
        }
        this.f377a = j;
        s1 s1Var = (s1) this.f379c;
        s1Var.c();
        s1Var.b(((Long) F.f11344q0.a(null)).longValue());
        return true;
    }

    @Override // B4.g
    public s4.s b() {
        AbstractC1705a.m(this.f377a != -1);
        return new C1986n((C1987o) this.f379c, 0, this.f377a);
    }

    @Override // B4.g
    public long n(C1979g c1979g) {
        long j = this.f378b;
        if (j < 0) {
            return -1L;
        }
        long j10 = -(j + 2);
        this.f378b = -1L;
        return j10;
    }

    @Override // B4.g
    public void p(long j) {
        long[] jArr = (long[]) ((C1112g) this.f380d).f16840b;
        this.f378b = jArr[D.e(jArr, j, true)];
    }
}
