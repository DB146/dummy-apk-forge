package m4;

import H2.C0288b;
import I2.C0330t;
import N6.C0442o;
import P4.C0456d;
import P4.C0470s;
import Y5.C0658x;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import k5.AbstractC1424c;
import k5.C1422a;
import k5.C1423b;
import k5.C1425d;
import k5.C1428g;
import m5.C1620q;
import m5.InterfaceC1609f;
import n5.AbstractC1705a;

/* renamed from: m4.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1564d0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20338a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f20339b;

    /* renamed from: c, reason: collision with root package name */
    public final P4.d0[] f20340c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20341d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20342e;

    /* renamed from: f, reason: collision with root package name */
    public C1566e0 f20343f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f20344h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC1565e[] f20345i;
    public final k5.u j;
    public final C1584n0 k;

    /* renamed from: l, reason: collision with root package name */
    public C1564d0 f20346l;

    /* renamed from: m, reason: collision with root package name */
    public P4.n0 f20347m;

    /* renamed from: n, reason: collision with root package name */
    public k5.y f20348n;

    /* renamed from: o, reason: collision with root package name */
    public long f20349o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [P4.d] */
    public C1564d0(AbstractC1565e[] abstractC1565eArr, long j, k5.u uVar, C1620q c1620q, C1584n0 c1584n0, C1566e0 c1566e0, k5.y yVar) {
        this.f20345i = abstractC1565eArr;
        this.f20349o = j;
        this.j = uVar;
        this.k = c1584n0;
        P4.B b2 = c1566e0.f20364a;
        this.f20339b = b2.f8157a;
        this.f20343f = c1566e0;
        this.f20347m = P4.n0.f8117d;
        this.f20348n = yVar;
        this.f20340c = new P4.d0[abstractC1565eArr.length];
        this.f20344h = new boolean[abstractC1565eArr.length];
        c1584n0.getClass();
        int i7 = B0.f19807y;
        Pair pair = (Pair) b2.f8157a;
        Object obj = pair.first;
        P4.B b10 = b2.b(pair.second);
        C1582m0 c1582m0 = (C1582m0) ((HashMap) c1584n0.f20446e).get(obj);
        c1582m0.getClass();
        ((HashSet) c1584n0.f20448h).add(c1582m0);
        C1580l0 c1580l0 = (C1580l0) ((HashMap) c1584n0.f20447f).get(c1582m0);
        if (c1580l0 != null) {
            c1580l0.f20425a.f(c1580l0.f20426b);
        }
        c1582m0.f20437c.add(b10);
        C0470s b11 = c1582m0.f20435a.b(b10, c1620q, c1566e0.f20365b);
        ((IdentityHashMap) c1584n0.f20445d).put(b11, c1582m0);
        c1584n0.d();
        long j10 = c1566e0.f20367d;
        this.f20338a = j10 != -9223372036854775807L ? new C0456d(b11, true, 0L, j10) : b11;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, P4.y] */
    public final long a(k5.y yVar, long j, boolean z8, boolean[] zArr) {
        AbstractC1565e[] abstractC1565eArr;
        Object[] objArr;
        int i7 = 0;
        while (true) {
            boolean z10 = true;
            if (i7 >= yVar.f19017a) {
                break;
            }
            if (z8 || !yVar.a(this.f20348n, i7)) {
                z10 = false;
            }
            this.f20344h[i7] = z10;
            i7++;
        }
        int i10 = 0;
        while (true) {
            abstractC1565eArr = this.f20345i;
            int length = abstractC1565eArr.length;
            objArr = this.f20340c;
            if (i10 >= length) {
                break;
            }
            if (abstractC1565eArr[i10].f20353b == -2) {
                objArr[i10] = null;
            }
            i10++;
        }
        b();
        this.f20348n = yVar;
        c();
        long v10 = this.f20338a.v(yVar.f19019c, this.f20344h, this.f20340c, zArr, j);
        for (int i11 = 0; i11 < abstractC1565eArr.length; i11++) {
            if (abstractC1565eArr[i11].f20353b == -2 && this.f20348n.b(i11)) {
                objArr[i11] = new Object();
            }
        }
        this.f20342e = false;
        for (int i12 = 0; i12 < objArr.length; i12++) {
            if (objArr[i12] != null) {
                AbstractC1705a.m(yVar.b(i12));
                if (abstractC1565eArr[i12].f20353b != -2) {
                    this.f20342e = true;
                }
            } else {
                AbstractC1705a.m(yVar.f19019c[i12] == null);
            }
        }
        return v10;
    }

    public final void b() {
        if (this.f20346l != null) {
            return;
        }
        int i7 = 0;
        while (true) {
            k5.y yVar = this.f20348n;
            if (i7 >= yVar.f19017a) {
                return;
            }
            boolean b2 = yVar.b(i7);
            k5.s sVar = this.f20348n.f19019c[i7];
            if (b2 && sVar != null) {
                sVar.i();
            }
            i7++;
        }
    }

    public final void c() {
        if (this.f20346l != null) {
            return;
        }
        int i7 = 0;
        while (true) {
            k5.y yVar = this.f20348n;
            if (i7 >= yVar.f19017a) {
                return;
            }
            boolean b2 = yVar.b(i7);
            k5.s sVar = this.f20348n.f19019c[i7];
            if (b2 && sVar != null) {
                sVar.e();
            }
            i7++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, P4.f0] */
    public final long d() {
        if (!this.f20341d) {
            return this.f20343f.f20365b;
        }
        long n6 = this.f20342e ? this.f20338a.n() : Long.MIN_VALUE;
        return n6 == Long.MIN_VALUE ? this.f20343f.f20368e : n6;
    }

    public final long e() {
        return this.f20343f.f20365b + this.f20349o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, P4.y] */
    public final void f() {
        b();
        ?? r02 = this.f20338a;
        try {
            boolean z8 = r02 instanceof C0456d;
            C1584n0 c1584n0 = this.k;
            if (z8) {
                c1584n0.h(((C0456d) r02).f8020a);
            } else {
                c1584n0.h(r02);
            }
        } catch (RuntimeException e2) {
            AbstractC1705a.u("MediaPeriodHolder", "Period release failed.", e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0260, code lost:
    
        if (N6.AbstractC0452z.f7375a.c(r9.f18894b, r6.f18894b).c(r9.f18893a, r6.f18893a).e() > 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x05d8, code lost:
    
        if (r4 != 2) goto L287;
     */
    /* JADX WARN: Type inference failed for: r1v17, types: [N6.B, N6.E] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k5.y g(float f4, L0 l02) {
        k5.i iVar;
        P4.n0[] n0VarArr;
        int[] iArr;
        int i7;
        boolean z8;
        String str;
        P4.n0[] n0VarArr2;
        int i10;
        boolean z10;
        int i11;
        N6.t0 t0Var;
        int i12;
        boolean z11;
        int i13;
        k5.s c1423b;
        int i14;
        int[][][] iArr2;
        C0288b c0288b;
        int i15;
        int i16;
        int i17;
        int i18;
        k5.r rVar;
        P4.n0[] n0VarArr3;
        int[] iArr3;
        int i19;
        P4.n0 n0Var;
        P4.m0 m0Var;
        C0330t c0330t;
        int i20;
        int[] iArr4;
        int i21 = 1;
        k5.u uVar = this.j;
        AbstractC1565e[] abstractC1565eArr = this.f20345i;
        P4.n0 n0Var2 = this.f20347m;
        uVar.getClass();
        int[] iArr5 = new int[abstractC1565eArr.length + 1];
        int length = abstractC1565eArr.length + 1;
        P4.m0[][] m0VarArr = new P4.m0[length];
        int[][][] iArr6 = new int[abstractC1565eArr.length + 1][];
        for (int i22 = 0; i22 < length; i22++) {
            int i23 = n0Var2.f8119a;
            m0VarArr[i22] = new P4.m0[i23];
            iArr6[i22] = new int[i23];
        }
        int length2 = abstractC1565eArr.length;
        int[] iArr7 = new int[length2];
        for (int i24 = 0; i24 < length2; i24++) {
            iArr7[i24] = abstractC1565eArr[i24].B();
        }
        int i25 = 0;
        while (i25 < n0Var2.f8119a) {
            P4.m0 a9 = n0Var2.a(i25);
            int i26 = a9.f8108c == 5 ? i21 : 0;
            int length3 = abstractC1565eArr.length;
            int i27 = i21;
            int i28 = 0;
            int i29 = 0;
            while (i29 < abstractC1565eArr.length) {
                AbstractC1565e abstractC1565e = abstractC1565eArr[i29];
                P4.n0 n0Var3 = n0Var2;
                int i30 = 0;
                for (int i31 = 0; i31 < a9.f8106a; i31++) {
                    i30 = Math.max(i30, abstractC1565e.A(a9.f8109d[i31]) & 7);
                }
                int i32 = iArr5[i29] == 0 ? 1 : 0;
                if (i30 > i28 || (i30 == i28 && i26 != 0 && i27 == 0 && i32 != 0)) {
                    i28 = i30;
                    length3 = i29;
                    i27 = i32;
                }
                i29++;
                n0Var2 = n0Var3;
            }
            P4.n0 n0Var4 = n0Var2;
            if (length3 == abstractC1565eArr.length) {
                iArr4 = new int[a9.f8106a];
                i20 = 1;
            } else {
                AbstractC1565e abstractC1565e2 = abstractC1565eArr[length3];
                int[] iArr8 = new int[a9.f8106a];
                for (int i33 = 0; i33 < a9.f8106a; i33++) {
                    iArr8[i33] = abstractC1565e2.A(a9.f8109d[i33]);
                }
                i20 = 1;
                iArr4 = iArr8;
            }
            int i34 = iArr5[length3];
            m0VarArr[length3][i34] = a9;
            iArr6[length3][i34] = iArr4;
            iArr5[length3] = i34 + i20;
            i25 += i20;
            i21 = i20;
            n0Var2 = n0Var4;
        }
        P4.n0[] n0VarArr4 = new P4.n0[abstractC1565eArr.length];
        String[] strArr = new String[abstractC1565eArr.length];
        int[] iArr9 = new int[abstractC1565eArr.length];
        for (int i35 = 0; i35 < abstractC1565eArr.length; i35++) {
            int i36 = iArr5[i35];
            n0VarArr4[i35] = new P4.n0((P4.m0[]) n5.D.O(i36, m0VarArr[i35]));
            iArr6[i35] = (int[][]) n5.D.O(i36, iArr6[i35]);
            strArr[i35] = abstractC1565eArr[i35].j();
            iArr9[i35] = abstractC1565eArr[i35].f20353b;
        }
        C0288b c0288b2 = new C0288b(iArr9, n0VarArr4, iArr7, iArr6, new P4.n0((P4.m0[]) n5.D.O(iArr5[abstractC1565eArr.length], m0VarArr[abstractC1565eArr.length])));
        k5.q qVar = (k5.q) uVar;
        synchronized (qVar.f18955c) {
            try {
                iVar = qVar.g;
                if (iVar.f18920X && n5.D.f21141a >= 32 && (c0330t = qVar.f18959h) != null) {
                    Looper myLooper = Looper.myLooper();
                    AbstractC1705a.n(myLooper);
                    if (((k5.l) c0330t.f5202d) == null && ((Handler) c0330t.f5201c) == null) {
                        c0330t.f5202d = new k5.l(qVar);
                        Handler handler = new Handler(myLooper);
                        c0330t.f5201c = handler;
                        ((Spatializer) c0330t.f5200b).addOnSpatializerStateChangedListener(new o4.G(handler), (k5.l) c0330t.f5202d);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i37 = c0288b2.f4638a;
        k5.r[] rVarArr = new k5.r[i37];
        int i38 = 2;
        Pair h10 = k5.q.h(2, c0288b2, iArr6, new F8.a(27, iVar, iArr7), new A0.B(14));
        if (h10 != null) {
            rVarArr[((Integer) h10.second).intValue()] = (k5.r) h10.first;
        }
        int i39 = 0;
        while (true) {
            n0VarArr = (P4.n0[]) c0288b2.f4640c;
            iArr = (int[]) c0288b2.f4639b;
            if (i39 >= c0288b2.f4638a) {
                i7 = 1;
                z8 = false;
                break;
            }
            if (2 == iArr[i39] && n0VarArr[i39].f8119a > 0) {
                z8 = true;
                i7 = 1;
                break;
            }
            i39++;
        }
        Pair h11 = k5.q.h(i7, c0288b2, iArr6, new C1425d(qVar, iVar, z8), new A0.B(15));
        if (h11 != null) {
            rVarArr[((Integer) h11.second).intValue()] = (k5.r) h11.first;
        }
        if (h11 == null) {
            str = null;
        } else {
            k5.r rVar2 = (k5.r) h11.first;
            str = rVar2.f18961a.f8109d[rVar2.f18962b[0]].f20087c;
        }
        int i40 = 3;
        Pair h12 = k5.q.h(3, c0288b2, iArr6, new F8.a(str, 28, iVar), new A0.B(16));
        if (h12 != null) {
            rVarArr[((Integer) h12.second).intValue()] = (k5.r) h12.first;
        }
        int i41 = 0;
        while (i41 < i37) {
            int i42 = iArr[i41];
            if (i42 != i38) {
                if (i42 == 1) {
                    n0VarArr3 = n0VarArr;
                    iArr3 = iArr;
                    i19 = 1;
                    i41 += i19;
                    n0VarArr = n0VarArr3;
                    iArr = iArr3;
                    i38 = 2;
                    i40 = 3;
                } else if (i42 != i40) {
                    P4.n0 n0Var5 = n0VarArr[i41];
                    int[][] iArr10 = iArr6[i41];
                    int i43 = 0;
                    P4.m0 m0Var2 = null;
                    C1428g c1428g = null;
                    int i44 = 0;
                    while (i43 < n0Var5.f8119a) {
                        int[] iArr11 = iArr10[i43];
                        P4.n0[] n0VarArr5 = n0VarArr;
                        C1428g c1428g2 = c1428g;
                        int i45 = 0;
                        for (P4.m0 a10 = n0Var5.a(i43); i45 < a10.f8106a; a10 = m0Var) {
                            int[] iArr12 = iArr;
                            if (k5.q.e(iArr11[i45], iVar.f18921Y)) {
                                n0Var = n0Var5;
                                C1428g c1428g3 = new C1428g(a10.f8109d[i45], iArr11[i45]);
                                if (c1428g2 != null) {
                                    m0Var = a10;
                                } else {
                                    m0Var = a10;
                                }
                                i44 = i45;
                                c1428g2 = c1428g3;
                                m0Var2 = m0Var;
                            } else {
                                n0Var = n0Var5;
                                m0Var = a10;
                            }
                            i45++;
                            iArr = iArr12;
                            n0Var5 = n0Var;
                        }
                        i43++;
                        c1428g = c1428g2;
                        n0VarArr = n0VarArr5;
                    }
                    n0VarArr3 = n0VarArr;
                    iArr3 = iArr;
                    rVarArr[i41] = m0Var2 == null ? null : new k5.r(0, m0Var2, new int[]{i44});
                    i19 = 1;
                    i41 += i19;
                    n0VarArr = n0VarArr3;
                    iArr = iArr3;
                    i38 = 2;
                    i40 = 3;
                }
            }
            n0VarArr3 = n0VarArr;
            iArr3 = iArr;
            i19 = 1;
            i41 += i19;
            n0VarArr = n0VarArr3;
            iArr = iArr3;
            i38 = 2;
            i40 = 3;
        }
        int i46 = c0288b2.f4638a;
        HashMap hashMap = new HashMap();
        int i47 = 0;
        while (true) {
            n0VarArr2 = (P4.n0[]) c0288b2.f4640c;
            if (i47 >= i46) {
                break;
            }
            k5.q.b(n0VarArr2[i47], iVar, hashMap);
            i47++;
        }
        k5.q.b((P4.n0) c0288b2.f4643f, iVar, hashMap);
        for (int i48 = 0; i48 < i46; i48++) {
            k5.v vVar = (k5.v) hashMap.get(Integer.valueOf(((int[]) c0288b2.f4639b)[i48]));
            if (vVar != null) {
                N6.H h13 = vVar.f18968b;
                if (!h13.isEmpty()) {
                    P4.n0 n0Var6 = n0VarArr2[i48];
                    P4.m0 m0Var3 = vVar.f18967a;
                    if (n0Var6.b(m0Var3) != -1) {
                        rVar = new k5.r(0, m0Var3, h3.H.G(h13));
                        rVarArr[i48] = rVar;
                    }
                }
                rVar = null;
                rVarArr[i48] = rVar;
            }
        }
        int i49 = c0288b2.f4638a;
        for (int i50 = 0; i50 < i49; i50++) {
            P4.n0 n0Var7 = ((P4.n0[]) c0288b2.f4640c)[i50];
            Map map = (Map) iVar.f18925c0.get(i50);
            if (map != null && map.containsKey(n0Var7)) {
                Map map2 = (Map) iVar.f18925c0.get(i50);
                if (map2 != null) {
                }
                rVarArr[i50] = null;
            }
        }
        for (int i51 = 0; i51 < i37; i51++) {
            int i52 = ((int[]) c0288b2.f4639b)[i51];
            if (iVar.f18926d0.get(i51) || iVar.f19004N.contains(Integer.valueOf(i52))) {
                rVarArr[i51] = null;
            }
        }
        C0658x c0658x = qVar.f18957e;
        InterfaceC1609f interfaceC1609f = qVar.f18964b;
        AbstractC1705a.n(interfaceC1609f);
        c0658x.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i53 = 0; i53 < rVarArr.length; i53 += i18) {
            k5.r rVar3 = rVarArr[i53];
            if (rVar3 != null) {
                i18 = 1;
                if (rVar3.f18962b.length > 1) {
                    N6.E E10 = N6.H.E();
                    E10.d(new C1422a(0L, 0L));
                    arrayList.add(E10);
                }
            } else {
                i18 = 1;
            }
            arrayList.add(null);
        }
        int length4 = rVarArr.length;
        long[][] jArr = new long[length4];
        int i54 = 0;
        while (i54 < rVarArr.length) {
            k5.r rVar4 = rVarArr[i54];
            if (rVar4 == null) {
                jArr[i54] = new long[0];
                i17 = 1;
            } else {
                int[] iArr13 = rVar4.f18962b;
                jArr[i54] = new long[iArr13.length];
                for (int i55 = 0; i55 < iArr13.length; i55++) {
                    long j = rVar4.f18961a.f8109d[iArr13[i55]].f20092v;
                    long[] jArr2 = jArr[i54];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i55] = j;
                }
                i17 = 1;
                Arrays.sort(jArr[i54]);
            }
            i54 += i17;
        }
        int[] iArr14 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i56 = 0; i56 < length4; i56++) {
            long[] jArr4 = jArr[i56];
            jArr3[i56] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        C1423b.v(arrayList, jArr3);
        N6.r0 r0Var = N6.r0.f7332a;
        r0Var.getClass();
        N6.p0 t5 = new N6.n0(r0Var).a().t();
        int i57 = 0;
        while (i57 < length4) {
            long[] jArr5 = jArr[i57];
            if (jArr5.length <= 1) {
                i15 = i37;
                i14 = length4;
                iArr2 = iArr6;
                c0288b = c0288b2;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                i14 = length4;
                int i58 = 0;
                while (true) {
                    long[] jArr6 = jArr[i57];
                    iArr2 = iArr6;
                    double d10 = 0.0d;
                    if (i58 >= jArr6.length) {
                        break;
                    }
                    C0288b c0288b3 = c0288b2;
                    int i59 = i37;
                    long j10 = jArr6[i58];
                    if (j10 != -1) {
                        d10 = Math.log(j10);
                    }
                    dArr[i58] = d10;
                    i58++;
                    c0288b2 = c0288b3;
                    iArr6 = iArr2;
                    i37 = i59;
                }
                c0288b = c0288b2;
                i15 = i37;
                int i60 = 1;
                int i61 = length5 - 1;
                double d11 = dArr[i61] - dArr[0];
                int i62 = 0;
                while (i62 < i61) {
                    double d12 = dArr[i62];
                    int i63 = i62 + i60;
                    Double valueOf = Double.valueOf(d11 == 0.0d ? 1.0d : (((d12 + dArr[i63]) * 0.5d) - dArr[0]) / d11);
                    Integer valueOf2 = Integer.valueOf(i57);
                    Map map3 = t5.f7329d;
                    Collection collection = (Collection) map3.get(valueOf);
                    if (collection == null) {
                        List list = (List) t5.f7331f.get();
                        if (!list.add(valueOf2)) {
                            throw new AssertionError("New Collection violated the Collection spec");
                        }
                        i16 = 1;
                        t5.f7330e++;
                        map3.put(valueOf, list);
                    } else {
                        i16 = 1;
                        if (collection.add(valueOf2)) {
                            t5.f7330e++;
                        }
                    }
                    i60 = i16;
                    i62 = i63;
                }
            }
            i57++;
            c0288b2 = c0288b;
            length4 = i14;
            iArr6 = iArr2;
            i37 = i15;
        }
        int i64 = i37;
        int[][][] iArr15 = iArr6;
        C0288b c0288b4 = c0288b2;
        Collection collection2 = t5.f7327b;
        if (collection2 == null) {
            collection2 = new C0442o(0, t5);
            t5.f7327b = collection2;
        }
        N6.H F10 = N6.H.F(collection2);
        for (int i65 = 0; i65 < F10.size(); i65++) {
            int intValue = ((Integer) F10.get(i65)).intValue();
            int i66 = iArr14[intValue] + 1;
            iArr14[intValue] = i66;
            jArr3[intValue] = jArr[intValue][i66];
            C1423b.v(arrayList, jArr3);
        }
        for (int i67 = 0; i67 < rVarArr.length; i67++) {
            if (arrayList.get(i67) != null) {
                jArr3[i67] = jArr3[i67] * 2;
            }
        }
        C1423b.v(arrayList, jArr3);
        N6.E E11 = N6.H.E();
        for (int i68 = 0; i68 < arrayList.size(); i68++) {
            N6.E e2 = (N6.E) arrayList.get(i68);
            E11.d(e2 == null ? N6.H.I() : e2.h());
        }
        N6.t0 h14 = E11.h();
        k5.s[] sVarArr = new k5.s[rVarArr.length];
        for (int i69 = 0; i69 < rVarArr.length; i69++) {
            k5.r rVar5 = rVarArr[i69];
            if (rVar5 != null) {
                int[] iArr16 = rVar5.f18962b;
                if (iArr16.length != 0) {
                    if (iArr16.length == 1) {
                        c1423b = new AbstractC1424c(rVar5.f18961a, new int[]{iArr16[0]});
                    } else {
                        long j11 = 25000;
                        c1423b = new C1423b(rVar5.f18961a, iArr16, interfaceC1609f, 10000, j11, j11, (N6.H) h14.get(i69));
                    }
                    sVarArr[i69] = c1423b;
                }
            }
        }
        D0[] d0Arr = new D0[i64];
        for (int i70 = 0; i70 < i64; i70++) {
            d0Arr[i70] = (iVar.f18926d0.get(i70) || iVar.f19004N.contains(Integer.valueOf(((int[]) c0288b4.f4639b)[i70])) || (((int[]) c0288b4.f4639b)[i70] != -2 && sVarArr[i70] == null)) ? null : D0.f19881b;
        }
        if (iVar.f18922Z) {
            int i71 = -1;
            int i72 = -1;
            int i73 = 0;
            while (i73 < c0288b4.f4638a) {
                int i74 = ((int[]) c0288b4.f4639b)[i73];
                k5.s sVar = sVarArr[i73];
                if (i74 == 1) {
                }
                if (sVar != null) {
                    int[][] iArr17 = iArr15[i73];
                    int b2 = ((P4.n0[]) c0288b4.f4640c)[i73].b(sVar.k());
                    int i75 = 0;
                    while (true) {
                        if (i75 >= sVar.length()) {
                            i13 = 1;
                            if (i74 == 1) {
                                i12 = -1;
                                if (i72 != -1) {
                                    z11 = false;
                                    break;
                                }
                                i72 = i73;
                            } else {
                                i12 = -1;
                                if (i71 != -1) {
                                    z11 = false;
                                    break;
                                }
                                i71 = i73;
                            }
                        } else {
                            if ((iArr17[b2][sVar.f(i75)] & 32) != 32) {
                                i13 = 1;
                                break;
                            }
                            i75++;
                        }
                    }
                }
                i13 = 1;
                i73 += i13;
            }
            i12 = -1;
            z11 = true;
            if (((i72 == i12 || i71 == i12) ? false : true) & z11) {
                D0 d02 = new D0(true);
                d0Arr[i72] = d02;
                d0Arr[i71] = d02;
            }
        }
        Pair create = Pair.create(d0Arr, sVarArr);
        k5.s[] sVarArr2 = (k5.s[]) create.second;
        List[] listArr = new List[sVarArr2.length];
        for (int i76 = 0; i76 < sVarArr2.length; i76++) {
            k5.s sVar2 = sVarArr2[i76];
            if (sVar2 != null) {
                t0Var = N6.H.K(sVar2);
            } else {
                N6.F f10 = N6.H.f7232b;
                t0Var = N6.t0.f7341e;
            }
            listArr[i76] = t0Var;
        }
        ?? b10 = new N6.B();
        for (int i77 = 0; i77 < c0288b4.f4638a; i77++) {
            P4.n0[] n0VarArr6 = (P4.n0[]) c0288b4.f4640c;
            P4.n0 n0Var8 = n0VarArr6[i77];
            List list2 = listArr[i77];
            int i78 = 0;
            while (i78 < n0Var8.f8119a) {
                P4.m0 a11 = n0Var8.a(i78);
                int i79 = n0VarArr6[i77].a(i78).f8106a;
                int[] iArr18 = new int[i79];
                int i80 = 0;
                int i81 = 0;
                while (i80 < i79) {
                    if ((((int[][][]) c0288b4.f4642e)[i77][i78][i80] & 7) != 4) {
                        i11 = 1;
                    } else {
                        i11 = 1;
                        iArr18[i81] = i80;
                        i81++;
                    }
                    i80 += i11;
                }
                int[] copyOf = Arrays.copyOf(iArr18, i81);
                List[] listArr2 = listArr;
                String str2 = null;
                int i82 = 0;
                boolean z12 = false;
                int i83 = 0;
                int i84 = 16;
                while (i82 < copyOf.length) {
                    P4.n0 n0Var9 = n0Var8;
                    String str3 = n0VarArr6[i77].a(i78).f8109d[copyOf[i82]].f20096z;
                    int i85 = i83 + 1;
                    if (i83 == 0) {
                        str2 = str3;
                    } else {
                        z12 = (!n5.D.a(str2, str3)) | z12;
                    }
                    i84 = Math.min(i84, ((int[][][]) c0288b4.f4642e)[i77][i78][i82] & 24);
                    i82++;
                    n0Var8 = n0Var9;
                    i83 = i85;
                }
                P4.n0 n0Var10 = n0Var8;
                if (z12) {
                    i84 = Math.min(i84, ((int[]) c0288b4.f4641d)[i77]);
                }
                boolean z13 = i84 != 0;
                int i86 = a11.f8106a;
                int[] iArr19 = new int[i86];
                boolean[] zArr = new boolean[i86];
                int i87 = 0;
                while (i87 < a11.f8106a) {
                    iArr19[i87] = ((int[][][]) c0288b4.f4642e)[i77][i78][i87] & 7;
                    int i88 = 0;
                    while (true) {
                        if (i88 >= list2.size()) {
                            i10 = 1;
                            z10 = false;
                            break;
                        }
                        k5.s sVar3 = (k5.s) list2.get(i88);
                        if (sVar3.k().equals(a11) && sVar3.u(i87) != -1) {
                            i10 = 1;
                            z10 = true;
                            break;
                        }
                        i88++;
                    }
                    zArr[i87] = z10;
                    i87 += i10;
                }
                b10.a(new M0(a11, z13, iArr19, zArr));
                i78++;
                listArr = listArr2;
                n0Var8 = n0Var10;
            }
        }
        int i89 = 0;
        while (true) {
            P4.n0 n0Var11 = (P4.n0) c0288b4.f4643f;
            if (i89 >= n0Var11.f8119a) {
                break;
            }
            P4.m0 a12 = n0Var11.a(i89);
            int[] iArr20 = new int[a12.f8106a];
            Arrays.fill(iArr20, 0);
            b10.a(new M0(a12, false, iArr20, new boolean[a12.f8106a]));
            i89++;
        }
        k5.y yVar = new k5.y((D0[]) create.first, (k5.s[]) create.second, new N0(b10.h()), c0288b4);
        for (k5.s sVar4 : yVar.f19019c) {
            if (sVar4 != null) {
                sVar4.p(f4);
            }
        }
        return yVar;
    }

    public final void h() {
        Object obj = this.f20338a;
        if (obj instanceof C0456d) {
            long j = this.f20343f.f20367d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            C0456d c0456d = (C0456d) obj;
            c0456d.f8024e = 0L;
            c0456d.f8025f = j;
        }
    }
}
