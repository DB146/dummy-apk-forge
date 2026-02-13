package m4;

import android.util.Pair;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public abstract class L0 implements InterfaceC1569g {

    /* renamed from: a, reason: collision with root package name */
    public static final I0 f20097a = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [m4.I0, java.lang.Object] */
    static {
        int i7 = n5.D.f21141a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public int a(boolean z8) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z8) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i7, J0 j02, K0 k02, int i10, boolean z8) {
        int i11 = f(i7, j02, false).f19965c;
        if (m(i11, k02, 0L).f20017D != i7) {
            return i7 + 1;
        }
        int e2 = e(z8, i11, i10);
        if (e2 == -1) {
            return -1;
        }
        return m(e2, k02, 0L).f20016C;
    }

    public int e(boolean z8, int i7, int i10) {
        if (i10 == 0) {
            if (i7 == c(z8)) {
                return -1;
            }
            return i7 + 1;
        }
        if (i10 == 1) {
            return i7;
        }
        if (i10 == 2) {
            return i7 == c(z8) ? a(z8) : i7 + 1;
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        int c10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L0)) {
            return false;
        }
        L0 l02 = (L0) obj;
        if (l02.o() != o() || l02.h() != h()) {
            return false;
        }
        K0 k02 = new K0();
        J0 j02 = new J0();
        K0 k03 = new K0();
        J0 j03 = new J0();
        for (int i7 = 0; i7 < o(); i7++) {
            if (!m(i7, k02, 0L).equals(l02.m(i7, k03, 0L))) {
                return false;
            }
        }
        for (int i10 = 0; i10 < h(); i10++) {
            if (!f(i10, j02, true).equals(l02.f(i10, j03, true))) {
                return false;
            }
        }
        int a9 = a(true);
        if (a9 != l02.a(true) || (c10 = c(true)) != l02.c(true)) {
            return false;
        }
        while (a9 != c10) {
            int e2 = e(true, a9, 0);
            if (e2 != l02.e(true, a9, 0)) {
                return false;
            }
            a9 = e2;
        }
        return true;
    }

    public abstract J0 f(int i7, J0 j02, boolean z8);

    public J0 g(Object obj, J0 j02) {
        return f(b(obj), j02, true);
    }

    public abstract int h();

    public final int hashCode() {
        K0 k02 = new K0();
        J0 j02 = new J0();
        int o10 = o() + 217;
        for (int i7 = 0; i7 < o(); i7++) {
            o10 = (o10 * 31) + m(i7, k02, 0L).hashCode();
        }
        int h10 = h() + (o10 * 31);
        for (int i10 = 0; i10 < h(); i10++) {
            h10 = (h10 * 31) + f(i10, j02, true).hashCode();
        }
        int a9 = a(true);
        while (a9 != -1) {
            h10 = (h10 * 31) + a9;
            a9 = e(true, a9, 0);
        }
        return h10;
    }

    public final Pair i(K0 k02, J0 j02, int i7, long j) {
        Pair j10 = j(k02, j02, i7, j, 0L);
        j10.getClass();
        return j10;
    }

    public final Pair j(K0 k02, J0 j02, int i7, long j, long j10) {
        AbstractC1705a.k(i7, o());
        m(i7, k02, j10);
        if (j == -9223372036854775807L) {
            j = k02.f20014A;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i10 = k02.f20016C;
        f(i10, j02, false);
        while (i10 < k02.f20017D && j02.f19967e != j) {
            int i11 = i10 + 1;
            if (f(i11, j02, false).f19967e > j) {
                break;
            }
            i10 = i11;
        }
        f(i10, j02, true);
        long j11 = j - j02.f19967e;
        long j12 = j02.f19966d;
        if (j12 != -9223372036854775807L) {
            j11 = Math.min(j11, j12 - 1);
        }
        long max = Math.max(0L, j11);
        Object obj = j02.f19964b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int k(boolean z8, int i7, int i10) {
        if (i10 == 0) {
            if (i7 == a(z8)) {
                return -1;
            }
            return i7 - 1;
        }
        if (i10 == 1) {
            return i7;
        }
        if (i10 == 2) {
            return i7 == a(z8) ? c(z8) : i7 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object l(int i7);

    public abstract K0 m(int i7, K0 k02, long j);

    public final void n(int i7, K0 k02) {
        m(i7, k02, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
