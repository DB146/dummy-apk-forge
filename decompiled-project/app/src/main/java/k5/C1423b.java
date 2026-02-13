package k5;

import N6.E;
import N6.H;
import P4.m0;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import m4.L;
import m5.C1621s;
import m5.InterfaceC1609f;
import n5.AbstractC1705a;
import n5.D;

/* renamed from: k5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1423b extends AbstractC1424c {
    public final InterfaceC1609f g;

    /* renamed from: h, reason: collision with root package name */
    public final long f18853h;

    /* renamed from: i, reason: collision with root package name */
    public final long f18854i;
    public final long j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final int f18855l;

    /* renamed from: m, reason: collision with root package name */
    public final float f18856m;

    /* renamed from: n, reason: collision with root package name */
    public final float f18857n;

    /* renamed from: o, reason: collision with root package name */
    public final H f18858o;

    /* renamed from: p, reason: collision with root package name */
    public final n5.x f18859p;

    /* renamed from: q, reason: collision with root package name */
    public float f18860q;

    /* renamed from: r, reason: collision with root package name */
    public int f18861r;

    /* renamed from: s, reason: collision with root package name */
    public int f18862s;

    /* renamed from: t, reason: collision with root package name */
    public long f18863t;

    /* renamed from: u, reason: collision with root package name */
    public R4.k f18864u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1423b(m0 m0Var, int[] iArr, InterfaceC1609f interfaceC1609f, long j, long j10, long j11, H h10) {
        super(m0Var, iArr);
        n5.x xVar = n5.x.f21235a;
        if (j11 < j) {
            AbstractC1705a.S("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j11 = j;
        }
        this.g = interfaceC1609f;
        this.f18853h = j * 1000;
        this.f18854i = j10 * 1000;
        this.j = j11 * 1000;
        this.k = 1279;
        this.f18855l = 719;
        this.f18856m = 0.7f;
        this.f18857n = 0.75f;
        this.f18858o = H.F(h10);
        this.f18859p = xVar;
        this.f18860q = 1.0f;
        this.f18862s = 0;
        this.f18863t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j10 : jArr) {
            j += j10;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            E e2 = (E) arrayList.get(i7);
            if (e2 != null) {
                e2.a(new C1422a(j, jArr[i7]));
            }
        }
    }

    public static long x(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        R4.k kVar = (R4.k) N6.r.l(list);
        long j = kVar.f8875u;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j10 = kVar.f8876v;
        if (j10 != -9223372036854775807L) {
            return j10 - j;
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0047  */
    @Override // k5.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(long j, long j10, long j11, List list, R4.l[] lVarArr) {
        long x2;
        long a9;
        long c10;
        int i7;
        this.f18859p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = this.f18861r;
        if (i10 >= lVarArr.length || !lVarArr[i10].next()) {
            for (R4.l lVar : lVarArr) {
                if (lVar.next()) {
                    a9 = lVar.a();
                    c10 = lVar.c();
                }
            }
            x2 = x(list);
            i7 = this.f18862s;
            if (i7 != 0) {
                this.f18862s = 1;
                this.f18861r = w(elapsedRealtime);
                return;
            }
            int i11 = this.f18861r;
            int s3 = list.isEmpty() ? -1 : s(((R4.k) N6.r.l(list)).f8872d);
            if (s3 != -1) {
                i7 = ((R4.k) N6.r.l(list)).f8873e;
                i11 = s3;
            }
            int w10 = w(elapsedRealtime);
            if (w10 != i11 && !c(i11, elapsedRealtime)) {
                L[] lArr = this.f18868d;
                L l10 = lArr[i11];
                L l11 = lArr[w10];
                long j12 = this.f18853h;
                if (j11 != -9223372036854775807L) {
                    j12 = Math.min(((float) (x2 != -9223372036854775807L ? j11 - x2 : j11)) * this.f18857n, j12);
                }
                int i12 = l11.f20092v;
                int i13 = l10.f20092v;
                if ((i12 > i13 && j10 < j12) || (i12 < i13 && j10 >= this.f18854i)) {
                    w10 = i11;
                }
            }
            if (w10 != i11) {
                i7 = 3;
            }
            this.f18862s = i7;
            this.f18861r = w10;
            return;
        }
        R4.l lVar2 = lVarArr[this.f18861r];
        a9 = lVar2.a();
        c10 = lVar2.c();
        x2 = a9 - c10;
        i7 = this.f18862s;
        if (i7 != 0) {
        }
    }

    @Override // k5.AbstractC1424c, k5.s
    public final void e() {
        this.f18863t = -9223372036854775807L;
        this.f18864u = null;
    }

    @Override // k5.AbstractC1424c, k5.s
    public final int g(long j, List list) {
        int i7;
        int i10;
        this.f18859p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f18863t;
        if (j10 != -9223372036854775807L && elapsedRealtime - j10 < 1000 && (list.isEmpty() || ((R4.k) N6.r.l(list)).equals(this.f18864u))) {
            return list.size();
        }
        this.f18863t = elapsedRealtime;
        this.f18864u = list.isEmpty() ? null : (R4.k) N6.r.l(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long A10 = D.A(((R4.k) list.get(size - 1)).f8875u - j, this.f18860q);
        long j11 = this.j;
        if (A10 < j11) {
            return size;
        }
        x(list);
        L l10 = this.f18868d[w(elapsedRealtime)];
        for (int i11 = 0; i11 < size; i11++) {
            R4.k kVar = (R4.k) list.get(i11);
            L l11 = kVar.f8872d;
            if (D.A(kVar.f8875u - j, this.f18860q) >= j11 && l11.f20092v < l10.f20092v && (i7 = l11.f20069F) != -1 && i7 <= this.f18855l && (i10 = l11.f20068E) != -1 && i10 <= this.k && i7 < l10.f20069F) {
                return i11;
            }
        }
        return size;
    }

    @Override // k5.AbstractC1424c, k5.s
    public final void i() {
        this.f18864u = null;
    }

    @Override // k5.s
    public final int m() {
        return this.f18862s;
    }

    @Override // k5.s
    public final int n() {
        return this.f18861r;
    }

    @Override // k5.AbstractC1424c, k5.s
    public final void p(float f4) {
        this.f18860q = f4;
    }

    @Override // k5.s
    public final Object q() {
        return null;
    }

    public final int w(long j) {
        long j10;
        C1621s c1621s = (C1621s) this.g;
        synchronized (c1621s) {
            j10 = c1621s.f20657l;
        }
        long j11 = ((float) j10) * this.f18856m;
        this.g.getClass();
        long j12 = ((float) j11) / this.f18860q;
        if (!this.f18858o.isEmpty()) {
            int i7 = 1;
            while (i7 < this.f18858o.size() - 1 && ((C1422a) this.f18858o.get(i7)).f18851a < j12) {
                i7++;
            }
            C1422a c1422a = (C1422a) this.f18858o.get(i7 - 1);
            C1422a c1422a2 = (C1422a) this.f18858o.get(i7);
            long j13 = c1422a.f18851a;
            float f4 = ((float) (j12 - j13)) / ((float) (c1422a2.f18851a - j13));
            j12 = c1422a.f18852b + (f4 * ((float) (c1422a2.f18852b - r1)));
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f18866b; i11++) {
            if (j == Long.MIN_VALUE || !c(i11, j)) {
                if (d(i11).f20092v <= j12) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }
}
