package B4;

import java.io.EOFException;
import java.io.IOException;
import n5.AbstractC1705a;
import n5.D;
import s4.C1979g;
import s4.s;

/* loaded from: classes.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final f f2046a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2047b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2048c;

    /* renamed from: d, reason: collision with root package name */
    public final i f2049d;

    /* renamed from: e, reason: collision with root package name */
    public int f2050e;

    /* renamed from: f, reason: collision with root package name */
    public long f2051f;

    /* renamed from: u, reason: collision with root package name */
    public long f2052u;

    /* renamed from: v, reason: collision with root package name */
    public long f2053v;

    /* renamed from: w, reason: collision with root package name */
    public long f2054w;

    /* renamed from: x, reason: collision with root package name */
    public long f2055x;

    /* renamed from: y, reason: collision with root package name */
    public long f2056y;

    /* renamed from: z, reason: collision with root package name */
    public long f2057z;

    public b(i iVar, long j, long j10, long j11, long j12, boolean z8) {
        AbstractC1705a.h(j >= 0 && j10 > j);
        this.f2049d = iVar;
        this.f2047b = j;
        this.f2048c = j10;
        if (j11 == j10 - j || z8) {
            this.f2051f = j12;
            this.f2050e = 4;
        } else {
            this.f2050e = 0;
        }
        this.f2046a = new f();
    }

    @Override // B4.g
    public final s b() {
        if (this.f2051f != 0) {
            return new a(this);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // B4.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long n(C1979g c1979g) {
        f fVar;
        ?? r22;
        f fVar2;
        long j;
        long j10;
        int i7 = this.f2050e;
        long j11 = this.f2048c;
        f fVar3 = this.f2046a;
        if (i7 == 0) {
            fVar = fVar3;
            long j12 = c1979g.f24055d;
            this.f2052u = j12;
            this.f2050e = 1;
            long j13 = j11 - 65307;
            if (j13 > j12) {
                return j13;
            }
            r22 = 0;
        } else if (i7 != 1) {
            if (i7 == 2) {
                long j14 = this.f2054w;
                long j15 = this.f2055x;
                if (j14 != j15) {
                    long j16 = c1979g.f24055d;
                    if (fVar3.b(c1979g, j15)) {
                        fVar3.a(c1979g, false);
                        c1979g.f24057f = 0;
                        long j17 = this.f2053v;
                        long j18 = fVar3.f2069b;
                        long j19 = j17 - j18;
                        int i10 = fVar3.f2071d + fVar3.f2072e;
                        if (0 > j19 || j19 >= 72000) {
                            if (j19 < 0) {
                                this.f2055x = j16;
                                this.f2057z = j18;
                            } else {
                                this.f2054w = c1979g.f24055d + i10;
                                this.f2056y = j18;
                            }
                            long j20 = this.f2055x;
                            long j21 = this.f2054w;
                            if (j20 - j21 < 100000) {
                                this.f2055x = j21;
                                j = j21;
                            } else {
                                fVar2 = fVar3;
                                j = D.j((((j20 - j21) * j19) / (this.f2057z - this.f2056y)) + (c1979g.f24055d - (i10 * (j19 <= 0 ? 2L : 1L))), j21, j20 - 1);
                                j10 = -1;
                                if (j != j10) {
                                    return j;
                                }
                                this.f2050e = 3;
                            }
                        }
                    } else {
                        long j22 = this.f2054w;
                        if (j22 == j16) {
                            throw new IOException("No ogg page can be found.");
                        }
                        j = j22;
                    }
                    fVar2 = fVar3;
                    j10 = -1;
                    if (j != j10) {
                    }
                }
                fVar2 = fVar3;
                j10 = -1;
                j = -1;
                if (j != j10) {
                }
            } else {
                if (i7 != 3) {
                    if (i7 == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j10 = -1;
                fVar2 = fVar3;
            }
            f fVar4 = fVar2;
            while (true) {
                fVar4.b(c1979g, j10);
                fVar4.a(c1979g, false);
                if (fVar4.f2069b > this.f2053v) {
                    c1979g.f24057f = 0;
                    this.f2050e = 4;
                    return -(this.f2056y + 2);
                }
                c1979g.r(fVar4.f2071d + fVar4.f2072e);
                this.f2054w = c1979g.f24055d;
                this.f2056y = fVar4.f2069b;
                j10 = -1;
            }
        } else {
            fVar = fVar3;
            r22 = 0;
        }
        fVar.f2068a = r22;
        fVar.f2069b = 0L;
        fVar.f2070c = r22;
        fVar.f2071d = r22;
        fVar.f2072e = r22;
        if (!fVar.b(c1979g, -1L)) {
            throw new EOFException();
        }
        fVar.a(c1979g, r22);
        c1979g.r(fVar.f2071d + fVar.f2072e);
        long j23 = fVar.f2069b;
        while ((fVar.f2068a & 4) != 4 && fVar.b(c1979g, -1L) && c1979g.f24055d < j11 && fVar.a(c1979g, true)) {
            try {
                c1979g.r(fVar.f2071d + fVar.f2072e);
                j23 = fVar.f2069b;
            } catch (EOFException unused) {
            }
        }
        this.f2051f = j23;
        this.f2050e = 4;
        return this.f2052u;
    }

    @Override // B4.g
    public final void p(long j) {
        this.f2053v = D.j(j, 0L, this.f2051f - 1);
        this.f2050e = 2;
        this.f2054w = this.f2047b;
        this.f2055x = this.f2048c;
        this.f2056y = 0L;
        this.f2057z = this.f2051f;
    }
}
