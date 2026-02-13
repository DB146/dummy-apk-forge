package k5;

import A0.B;
import P4.m0;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import m4.L;
import n5.AbstractC1705a;
import n5.D;

/* renamed from: k5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1424c implements s {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f18865a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18866b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f18867c;

    /* renamed from: d, reason: collision with root package name */
    public final L[] f18868d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f18869e;

    /* renamed from: f, reason: collision with root package name */
    public int f18870f;

    public AbstractC1424c(m0 m0Var, int[] iArr) {
        int i7 = 0;
        AbstractC1705a.m(iArr.length > 0);
        m0Var.getClass();
        this.f18865a = m0Var;
        int length = iArr.length;
        this.f18866b = length;
        this.f18868d = new L[length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f18868d[i10] = m0Var.f8109d[iArr[i10]];
        }
        Arrays.sort(this.f18868d, new B(11));
        this.f18867c = new int[this.f18866b];
        while (true) {
            int i11 = this.f18866b;
            if (i7 >= i11) {
                this.f18869e = new long[i11];
                return;
            } else {
                this.f18867c[i7] = m0Var.a(this.f18868d[i7]);
                i7++;
            }
        }
    }

    @Override // k5.s
    public final boolean c(int i7, long j) {
        return this.f18869e[i7] > j;
    }

    @Override // k5.s
    public final L d(int i7) {
        return this.f18868d[i7];
    }

    @Override // k5.s
    public void e() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC1424c abstractC1424c = (AbstractC1424c) obj;
        return this.f18865a == abstractC1424c.f18865a && Arrays.equals(this.f18867c, abstractC1424c.f18867c);
    }

    @Override // k5.s
    public final int f(int i7) {
        return this.f18867c[i7];
    }

    @Override // k5.s
    public int g(long j, List list) {
        return list.size();
    }

    public final int hashCode() {
        if (this.f18870f == 0) {
            this.f18870f = Arrays.hashCode(this.f18867c) + (System.identityHashCode(this.f18865a) * 31);
        }
        return this.f18870f;
    }

    @Override // k5.s
    public void i() {
    }

    @Override // k5.s
    public final int j() {
        return this.f18867c[n()];
    }

    @Override // k5.s
    public final m0 k() {
        return this.f18865a;
    }

    @Override // k5.s
    public final L l() {
        return this.f18868d[n()];
    }

    @Override // k5.s
    public final int length() {
        return this.f18867c.length;
    }

    @Override // k5.s
    public final boolean o(int i7, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean c10 = c(i7, elapsedRealtime);
        int i10 = 0;
        while (i10 < this.f18866b && !c10) {
            c10 = (i10 == i7 || c(i10, elapsedRealtime)) ? false : true;
            i10++;
        }
        if (!c10) {
            return false;
        }
        long[] jArr = this.f18869e;
        long j10 = jArr[i7];
        int i11 = D.f21141a;
        long j11 = elapsedRealtime + j;
        if (((j ^ j11) & (elapsedRealtime ^ j11)) < 0) {
            j11 = Long.MAX_VALUE;
        }
        jArr[i7] = Math.max(j10, j11);
        return true;
    }

    @Override // k5.s
    public void p(float f4) {
    }

    @Override // k5.s
    public final int s(L l10) {
        for (int i7 = 0; i7 < this.f18866b; i7++) {
            if (this.f18868d[i7] == l10) {
                return i7;
            }
        }
        return -1;
    }

    @Override // k5.s
    public final int u(int i7) {
        for (int i10 = 0; i10 < this.f18866b; i10++) {
            if (this.f18867c[i10] == i7) {
                return i10;
            }
        }
        return -1;
    }
}
