package C4;

import F.C0257a;
import Y5.C0662z;
import android.util.SparseArray;
import n5.AbstractC1705a;
import n5.C1704A;
import s4.C1979g;
import s4.C1986n;
import s4.InterfaceC1982j;
import s4.InterfaceC1983k;
import s4.InterfaceC1984l;

/* loaded from: classes.dex */
public final class A implements InterfaceC1982j {

    /* renamed from: e, reason: collision with root package name */
    public boolean f2653e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2654f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public long f2655h;

    /* renamed from: i, reason: collision with root package name */
    public x f2656i;
    public InterfaceC1984l j;
    public boolean k;

    /* renamed from: a, reason: collision with root package name */
    public final C1704A f2649a = new C1704A(0);

    /* renamed from: c, reason: collision with root package name */
    public final n5.v f2651c = new n5.v(4096);

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f2650b = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public final y f2652d = new y(0);

    @Override // s4.InterfaceC1982j
    public final void a(long j, long j10) {
        long j11;
        C1704A c1704a = this.f2649a;
        synchronized (c1704a) {
            j11 = c1704a.f21137b;
        }
        boolean z8 = j11 == -9223372036854775807L;
        if (!z8) {
            long c10 = c1704a.c();
            z8 = (c10 == -9223372036854775807L || c10 == 0 || c10 == j10) ? false : true;
        }
        if (z8) {
            c1704a.e(j10);
        }
        x xVar = this.f2656i;
        if (xVar != null) {
            xVar.d(j10);
        }
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f2650b;
            if (i7 >= sparseArray.size()) {
                return;
            }
            z zVar = (z) sparseArray.valueAt(i7);
            zVar.f2905f = false;
            zVar.f2900a.a();
            i7++;
        }
    }

    @Override // s4.InterfaceC1982j
    public final boolean c(InterfaceC1983k interfaceC1983k) {
        byte[] bArr = new byte[14];
        C1979g c1979g = (C1979g) interfaceC1983k;
        c1979g.x(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        c1979g.b(bArr[13] & 7, false);
        c1979g.x(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0263  */
    @Override // s4.InterfaceC1982j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(InterfaceC1983k interfaceC1983k, C0257a c0257a) {
        int i7;
        long j;
        i kVar;
        long j10;
        AbstractC1705a.n(this.j);
        long j11 = ((C1979g) interfaceC1983k).f24054c;
        int i10 = (j11 > (-1L) ? 1 : (j11 == (-1L) ? 0 : -1));
        int i11 = 1;
        long j12 = -9223372036854775807L;
        y yVar = this.f2652d;
        if (i10 != 0 && !yVar.f2895d) {
            boolean z8 = yVar.f2897f;
            n5.v vVar = yVar.f2894c;
            if (!z8) {
                C1979g c1979g = (C1979g) interfaceC1983k;
                long j13 = c1979g.f24054c;
                int min = (int) Math.min(20000L, j13);
                long j14 = j13 - min;
                if (c1979g.f24055d != j14) {
                    c0257a.f3957a = j14;
                } else {
                    vVar.D(min);
                    c1979g.f24057f = 0;
                    c1979g.x(vVar.f21229a, 0, min, false);
                    int i12 = vVar.f21230b;
                    int i13 = vVar.f21231c - 4;
                    while (true) {
                        if (i13 < i12) {
                            break;
                        }
                        if (y.b(i13, vVar.f21229a) == 442) {
                            vVar.G(i13 + 4);
                            long c10 = y.c(vVar);
                            if (c10 != -9223372036854775807L) {
                                j12 = c10;
                                break;
                            }
                        }
                        i13--;
                    }
                    yVar.f2898h = j12;
                    yVar.f2897f = true;
                    i11 = 0;
                }
            } else {
                if (yVar.f2898h == -9223372036854775807L) {
                    yVar.a((C1979g) interfaceC1983k);
                    return 0;
                }
                if (yVar.f2896e) {
                    long j15 = yVar.g;
                    if (j15 == -9223372036854775807L) {
                        yVar.a((C1979g) interfaceC1983k);
                        return 0;
                    }
                    C1704A c1704a = yVar.f2893b;
                    long b2 = c1704a.b(yVar.f2898h) - c1704a.b(j15);
                    yVar.f2899i = b2;
                    if (b2 < 0) {
                        AbstractC1705a.S("PsDurationReader", "Invalid duration: " + yVar.f2899i + ". Using TIME_UNSET instead.");
                        yVar.f2899i = -9223372036854775807L;
                    }
                    yVar.a((C1979g) interfaceC1983k);
                    return 0;
                }
                C1979g c1979g2 = (C1979g) interfaceC1983k;
                int min2 = (int) Math.min(20000L, c1979g2.f24054c);
                long j16 = 0;
                if (c1979g2.f24055d != j16) {
                    c0257a.f3957a = j16;
                } else {
                    vVar.D(min2);
                    c1979g2.f24057f = 0;
                    c1979g2.x(vVar.f21229a, 0, min2, false);
                    int i14 = vVar.f21230b;
                    int i15 = vVar.f21231c;
                    while (true) {
                        if (i14 >= i15 - 3) {
                            j10 = -9223372036854775807L;
                            break;
                        }
                        if (y.b(i14, vVar.f21229a) == 442) {
                            vVar.G(i14 + 4);
                            j10 = y.c(vVar);
                            if (j10 != -9223372036854775807L) {
                                break;
                            }
                        }
                        i14++;
                    }
                    yVar.g = j10;
                    yVar.f2896e = true;
                    i11 = 0;
                }
            }
            return i11;
        }
        if (this.k) {
            i7 = i10;
            j = j11;
        } else {
            this.k = true;
            long j17 = yVar.f2899i;
            if (j17 != -9223372036854775807L) {
                i7 = i10;
                j = j11;
                x xVar = new x(new C0662z(17), new q3.c(yVar.f2893b), j17, j17 + 1, 0L, j11, 188L, 1000);
                this.f2656i = xVar;
                this.j.i(xVar.f2888a);
            } else {
                i7 = i10;
                j = j11;
                this.j.i(new C1986n(j17));
            }
        }
        x xVar2 = this.f2656i;
        if (xVar2 != null && xVar2.f2890c != null) {
            return xVar2.b((C1979g) interfaceC1983k, c0257a);
        }
        C1979g c1979g3 = (C1979g) interfaceC1983k;
        c1979g3.f24057f = 0;
        long A10 = i7 != 0 ? j - c1979g3.A() : -1L;
        if (A10 != -1 && A10 < 4) {
            return -1;
        }
        n5.v vVar2 = this.f2651c;
        if (!c1979g3.x(vVar2.f21229a, 0, 4, true)) {
            return -1;
        }
        vVar2.G(0);
        int h10 = vVar2.h();
        if (h10 == 441) {
            return -1;
        }
        if (h10 == 442) {
            c1979g3.x(vVar2.f21229a, 0, 10, false);
            vVar2.G(9);
            c1979g3.r((vVar2.v() & 7) + 14);
            return 0;
        }
        if (h10 == 443) {
            c1979g3.x(vVar2.f21229a, 0, 2, false);
            vVar2.G(0);
            c1979g3.r(vVar2.A() + 6);
            return 0;
        }
        if (((h10 & (-256)) >> 8) != 1) {
            c1979g3.r(1);
            return 0;
        }
        int i16 = h10 & 255;
        SparseArray sparseArray = this.f2650b;
        z zVar = (z) sparseArray.get(i16);
        if (!this.f2653e) {
            if (zVar == null) {
                i iVar = null;
                if (i16 == 189) {
                    kVar = new C0240b(null, 0);
                    this.f2654f = true;
                    this.f2655h = c1979g3.f24055d;
                } else if ((h10 & 224) == 192) {
                    kVar = new u(null);
                    this.f2654f = true;
                    this.f2655h = c1979g3.f24055d;
                } else {
                    if ((h10 & 240) == 224) {
                        kVar = new k(null);
                        this.g = true;
                        this.f2655h = c1979g3.f24055d;
                    }
                    if (iVar != null) {
                        iVar.e(this.j, new F(i16, 256));
                        zVar = new z(iVar, this.f2649a);
                        sparseArray.put(i16, zVar);
                    }
                }
                iVar = kVar;
                if (iVar != null) {
                }
            }
            if (c1979g3.f24055d > ((this.f2654f && this.g) ? this.f2655h + 8192 : 1048576L)) {
                this.f2653e = true;
                this.j.f();
            }
        }
        c1979g3.x(vVar2.f21229a, 0, 2, false);
        vVar2.G(0);
        int A11 = vVar2.A() + 6;
        if (zVar == null) {
            c1979g3.r(A11);
        } else {
            vVar2.D(A11);
            c1979g3.h(vVar2.f21229a, 0, A11, false);
            vVar2.G(6);
            b5.f fVar = zVar.f2902c;
            vVar2.f(0, fVar.f13953b, 3);
            fVar.p(0);
            fVar.s(8);
            zVar.f2903d = fVar.h();
            zVar.f2904e = fVar.h();
            fVar.s(6);
            vVar2.f(0, fVar.f13953b, fVar.i(8));
            fVar.p(0);
            zVar.g = 0L;
            if (zVar.f2903d) {
                fVar.s(4);
                fVar.s(1);
                fVar.s(1);
                long i17 = (fVar.i(3) << 30) | (fVar.i(15) << 15) | fVar.i(15);
                fVar.s(1);
                boolean z10 = zVar.f2905f;
                C1704A c1704a2 = zVar.f2901b;
                if (!z10 && zVar.f2904e) {
                    fVar.s(4);
                    fVar.s(1);
                    fVar.s(1);
                    fVar.s(1);
                    c1704a2.b((fVar.i(3) << 30) | (fVar.i(15) << 15) | fVar.i(15));
                    zVar.f2905f = true;
                }
                zVar.g = c1704a2.b(i17);
            }
            long j18 = zVar.g;
            i iVar2 = zVar.f2900a;
            iVar2.c(4, j18);
            iVar2.b(vVar2);
            iVar2.d();
            vVar2.F(vVar2.f21229a.length);
        }
        return 0;
    }

    @Override // s4.InterfaceC1982j
    public final void f(InterfaceC1984l interfaceC1984l) {
        this.j = interfaceC1984l;
    }

    @Override // s4.InterfaceC1982j
    public final void release() {
    }
}
