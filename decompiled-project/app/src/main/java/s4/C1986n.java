package s4;

import ea.C1112g;
import n5.AbstractC1705a;
import n5.D;
import u4.C2102b;
import u4.C2105e;

/* renamed from: s4.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1986n implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24065a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24066b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f24067c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1986n(long j) {
        this(j, 0L);
        this.f24065a = 1;
    }

    public C1986n(long j, long j10) {
        this.f24065a = 1;
        this.f24066b = j;
        t tVar = j10 == 0 ? t.f24086c : new t(0L, j10);
        this.f24067c = new r(tVar, tVar);
    }

    public /* synthetic */ C1986n(Object obj, int i7, long j) {
        this.f24065a = i7;
        this.f24067c = obj;
        this.f24066b = j;
    }

    @Override // s4.s
    public final boolean g() {
        switch (this.f24065a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // s4.s
    public final r h(long j) {
        switch (this.f24065a) {
            case 0:
                C1987o c1987o = (C1987o) this.f24067c;
                AbstractC1705a.n(c1987o.k);
                C1112g c1112g = c1987o.k;
                long[] jArr = (long[]) c1112g.f16840b;
                int e2 = D.e(jArr, D.j((c1987o.f24072e * j) / 1000000, 0L, c1987o.j - 1), false);
                long j10 = e2 == -1 ? 0L : jArr[e2];
                long[] jArr2 = (long[]) c1112g.f16841c;
                long j11 = e2 != -1 ? jArr2[e2] : 0L;
                int i7 = c1987o.f24072e;
                long j12 = (j10 * 1000000) / i7;
                long j13 = this.f24066b;
                t tVar = new t(j12, j11 + j13);
                if (j12 == j || e2 == jArr.length - 1) {
                    return new r(tVar, tVar);
                }
                int i10 = e2 + 1;
                return new r(tVar, new t((jArr[i10] * 1000000) / i7, j13 + jArr2[i10]));
            case 1:
                return (r) this.f24067c;
            default:
                C2102b c2102b = (C2102b) this.f24067c;
                r b2 = c2102b.g[0].b(j);
                int i11 = 1;
                while (true) {
                    C2105e[] c2105eArr = c2102b.g;
                    if (i11 >= c2105eArr.length) {
                        return b2;
                    }
                    r b10 = c2105eArr[i11].b(j);
                    if (b10.f24084a.f24088b < b2.f24084a.f24088b) {
                        b2 = b10;
                    }
                    i11++;
                }
        }
    }

    @Override // s4.s
    public final long i() {
        switch (this.f24065a) {
            case 0:
                return ((C1987o) this.f24067c).b();
            case 1:
                return this.f24066b;
            default:
                return this.f24066b;
        }
    }
}
