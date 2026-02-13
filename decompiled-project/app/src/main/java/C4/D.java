package C4;

import F.C0257a;
import Y5.C0662z;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m4.C1586o0;
import n5.AbstractC1705a;
import n5.C1704A;
import s4.C1979g;
import s4.C1986n;
import s4.InterfaceC1982j;
import s4.InterfaceC1983k;
import s4.InterfaceC1984l;

/* loaded from: classes.dex */
public final class D implements InterfaceC1982j {

    /* renamed from: a, reason: collision with root package name */
    public final int f2663a;

    /* renamed from: b, reason: collision with root package name */
    public final List f2664b;

    /* renamed from: c, reason: collision with root package name */
    public final n5.v f2665c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f2666d;

    /* renamed from: e, reason: collision with root package name */
    public final C0244f f2667e;

    /* renamed from: f, reason: collision with root package name */
    public final SparseArray f2668f;
    public final SparseBooleanArray g;

    /* renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f2669h;

    /* renamed from: i, reason: collision with root package name */
    public final y f2670i;
    public x j;
    public InterfaceC1984l k;

    /* renamed from: l, reason: collision with root package name */
    public int f2671l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2672m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2673n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2674o;

    /* renamed from: p, reason: collision with root package name */
    public G f2675p;

    /* renamed from: q, reason: collision with root package name */
    public int f2676q;

    /* renamed from: r, reason: collision with root package name */
    public int f2677r;

    public D(int i7, C1704A c1704a, C0244f c0244f) {
        this.f2667e = c0244f;
        this.f2663a = i7;
        if (i7 == 1 || i7 == 2) {
            this.f2664b = Collections.singletonList(c1704a);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f2664b = arrayList;
            arrayList.add(c1704a);
        }
        this.f2665c = new n5.v(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.g = sparseBooleanArray;
        this.f2669h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f2668f = sparseArray;
        this.f2666d = new SparseIntArray();
        this.f2670i = new y(1);
        this.k = InterfaceC1984l.f24064t;
        this.f2677r = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArray.put(sparseArray2.keyAt(i10), (G) sparseArray2.valueAt(i10));
        }
        sparseArray.put(0, new C(new q3.l(this)));
        this.f2675p = null;
    }

    @Override // s4.InterfaceC1982j
    public final void a(long j, long j10) {
        x xVar;
        long j11;
        AbstractC1705a.m(this.f2663a != 2);
        List list = this.f2664b;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            C1704A c1704a = (C1704A) list.get(i7);
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
        }
        if (j10 != 0 && (xVar = this.j) != null) {
            xVar.d(j10);
        }
        this.f2665c.D(0);
        this.f2666d.clear();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f2668f;
            if (i10 >= sparseArray.size()) {
                this.f2676q = 0;
                return;
            } else {
                ((G) sparseArray.valueAt(i10)).a();
                i10++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // s4.InterfaceC1982j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(InterfaceC1983k interfaceC1983k) {
        byte[] bArr = this.f2665c.f21229a;
        C1979g c1979g = (C1979g) interfaceC1983k;
        c1979g.x(bArr, 0, 940, false);
        int i7 = 0;
        while (i7 < 188) {
            for (int i10 = 0; i10 < 5; i10++) {
                if (bArr[(i10 * 188) + i7] != 71) {
                    break;
                }
            }
            c1979g.r(i7);
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r7v14, types: [A4.s, java.lang.Object, s4.e] */
    @Override // s4.InterfaceC1982j
    public final int e(InterfaceC1983k interfaceC1983k, C0257a c0257a) {
        ?? r32;
        int i7;
        ?? r22;
        long j;
        int i10;
        boolean z8;
        long j10;
        long j11;
        long j12 = ((C1979g) interfaceC1983k).f24054c;
        boolean z10 = this.f2672m;
        int i11 = this.f2663a;
        if (z10) {
            y yVar = this.f2670i;
            if (j12 != -1 && i11 != 2 && !yVar.f2895d) {
                int i12 = this.f2677r;
                if (i12 <= 0) {
                    yVar.a((C1979g) interfaceC1983k);
                    return 0;
                }
                boolean z11 = yVar.f2897f;
                n5.v vVar = yVar.f2894c;
                if (!z11) {
                    C1979g c1979g = (C1979g) interfaceC1983k;
                    long j13 = c1979g.f24054c;
                    int min = (int) Math.min(112800, j13);
                    long j14 = j13 - min;
                    if (c1979g.f24055d == j14) {
                        vVar.D(min);
                        c1979g.f24057f = 0;
                        c1979g.x(vVar.f21229a, 0, min, false);
                        int i13 = vVar.f21230b;
                        int i14 = vVar.f21231c;
                        int i15 = i14 - 188;
                        while (true) {
                            if (i15 < i13) {
                                j11 = -9223372036854775807L;
                                break;
                            }
                            byte[] bArr = vVar.f21229a;
                            int i16 = -4;
                            int i17 = 0;
                            while (true) {
                                if (i16 > 4) {
                                    break;
                                }
                                int i18 = (i16 * 188) + i15;
                                if (i18 < i13 || i18 >= i14 || bArr[i18] != 71) {
                                    i17 = 0;
                                } else {
                                    i17++;
                                    if (i17 == 5) {
                                        long D10 = O5.b.D(vVar, i15, i12);
                                        if (D10 != -9223372036854775807L) {
                                            j11 = D10;
                                            break;
                                        }
                                    }
                                }
                                i16++;
                            }
                            i15--;
                        }
                        yVar.f2898h = j11;
                        yVar.f2897f = true;
                        return 0;
                    }
                    c0257a.f3957a = j14;
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
                            AbstractC1705a.S("TsDurationReader", "Invalid duration: " + yVar.f2899i + ". Using TIME_UNSET instead.");
                            yVar.f2899i = -9223372036854775807L;
                        }
                        yVar.a((C1979g) interfaceC1983k);
                        return 0;
                    }
                    C1979g c1979g2 = (C1979g) interfaceC1983k;
                    int min2 = (int) Math.min(112800, c1979g2.f24054c);
                    long j16 = 0;
                    if (c1979g2.f24055d == j16) {
                        vVar.D(min2);
                        c1979g2.f24057f = 0;
                        c1979g2.x(vVar.f21229a, 0, min2, false);
                        int i19 = vVar.f21230b;
                        int i20 = vVar.f21231c;
                        while (true) {
                            if (i19 >= i20) {
                                j10 = -9223372036854775807L;
                                break;
                            }
                            if (vVar.f21229a[i19] == 71) {
                                long D11 = O5.b.D(vVar, i19, i12);
                                if (D11 != -9223372036854775807L) {
                                    j10 = D11;
                                    break;
                                }
                            }
                            i19++;
                        }
                        yVar.g = j10;
                        yVar.f2896e = true;
                        return 0;
                    }
                    c0257a.f3957a = j16;
                }
                return 1;
            }
            if (this.f2673n) {
                i7 = i11;
                j = j12;
            } else {
                this.f2673n = true;
                long j17 = yVar.f2899i;
                if (j17 != -9223372036854775807L) {
                    int i21 = this.f2677r;
                    C0662z c0662z = new C0662z(17);
                    C1704A c1704a2 = yVar.f2893b;
                    ?? obj = new Object();
                    obj.f470a = i21;
                    obj.f471b = c1704a2;
                    obj.f472c = new n5.v();
                    i7 = i11;
                    j = j12;
                    x xVar = new x(c0662z, obj, j17, j17 + 1, 0L, j12, 188L, 940);
                    this.j = xVar;
                    this.k.i(xVar.f2888a);
                } else {
                    i7 = i11;
                    j = j12;
                    this.k.i(new C1986n(j17));
                }
            }
            if (this.f2674o) {
                z8 = false;
                this.f2674o = false;
                a(0L, 0L);
                if (((C1979g) interfaceC1983k).f24055d != 0) {
                    c0257a.f3957a = 0L;
                    return 1;
                }
            } else {
                z8 = false;
            }
            r32 = 1;
            r32 = 1;
            x xVar2 = this.j;
            r22 = z8;
            if (xVar2 != null) {
                r22 = z8;
                if (xVar2.f2890c != null) {
                    return xVar2.b((C1979g) interfaceC1983k, c0257a);
                }
            }
        } else {
            r32 = 1;
            i7 = i11;
            r22 = 0;
            j = j12;
        }
        n5.v vVar2 = this.f2665c;
        byte[] bArr2 = vVar2.f21229a;
        if (9400 - vVar2.f21230b < 188) {
            int a9 = vVar2.a();
            if (a9 > 0) {
                System.arraycopy(bArr2, vVar2.f21230b, bArr2, r22, a9);
            }
            vVar2.E(a9, bArr2);
        }
        while (vVar2.a() < 188) {
            int i22 = vVar2.f21231c;
            int D12 = ((C1979g) interfaceC1983k).D(bArr2, i22, 9400 - i22);
            if (D12 == -1) {
                return -1;
            }
            vVar2.F(i22 + D12);
        }
        int i23 = vVar2.f21230b;
        int i24 = vVar2.f21231c;
        byte[] bArr3 = vVar2.f21229a;
        int i25 = i23;
        while (i25 < i24 && bArr3[i25] != 71) {
            i25++;
        }
        vVar2.G(i25);
        int i26 = i25 + 188;
        if (i26 > i24) {
            int i27 = (i25 - i23) + this.f2676q;
            this.f2676q = i27;
            i10 = i7;
            if (i10 == 2 && i27 > 376) {
                throw C1586o0.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            i10 = i7;
            this.f2676q = r22;
        }
        int i28 = vVar2.f21231c;
        if (i26 > i28) {
            return r22;
        }
        int h10 = vVar2.h();
        if ((8388608 & h10) != 0) {
            vVar2.G(i26);
            return r22;
        }
        int i29 = (4194304 & h10) != 0 ? r32 : r22;
        int i30 = (2096896 & h10) >> 8;
        boolean z12 = (h10 & 32) != 0 ? r32 : r22;
        G g = (h10 & 16) != 0 ? (G) this.f2668f.get(i30) : null;
        if (g == null) {
            vVar2.G(i26);
            return r22;
        }
        if (i10 != 2) {
            int i31 = h10 & 15;
            SparseIntArray sparseIntArray = this.f2666d;
            int i32 = sparseIntArray.get(i30, i31 - 1);
            sparseIntArray.put(i30, i31);
            if (i32 == i31) {
                vVar2.G(i26);
                return r22;
            }
            if (i31 != ((i32 + r32) & 15)) {
                g.a();
            }
        }
        if (z12) {
            int v10 = vVar2.v();
            i29 |= (vVar2.v() & 64) != 0 ? 2 : r22;
            vVar2.H(v10 - r32);
        }
        boolean z13 = this.f2672m;
        if (i10 == 2 || z13 || !this.f2669h.get(i30, r22)) {
            vVar2.F(i26);
            g.b(i29, vVar2);
            vVar2.F(i28);
        }
        if (i10 != 2 && !z13 && this.f2672m && j != -1) {
            this.f2674o = r32;
        }
        vVar2.G(i26);
        return r22;
    }

    @Override // s4.InterfaceC1982j
    public final void f(InterfaceC1984l interfaceC1984l) {
        this.k = interfaceC1984l;
    }

    @Override // s4.InterfaceC1982j
    public final void release() {
    }
}
