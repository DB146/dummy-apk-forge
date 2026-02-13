package U4;

import N6.H;
import P4.C0463k;
import P4.InterfaceC0475x;
import P4.InterfaceC0476y;
import P4.d0;
import P4.f0;
import P4.m0;
import P4.n0;
import Y5.B;
import Z9.x;
import android.net.Uri;
import android.util.SparseArray;
import i2.C1312U;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import m4.C1586o0;
import m4.E0;
import m4.K;
import m4.L;
import m5.C1620q;
import m5.J;
import m5.T;
import n5.AbstractC1705a;
import n5.D;
import r4.C1941m;

/* loaded from: classes.dex */
public final class l implements InterfaceC0476y, V4.q {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f9574A;

    /* renamed from: B, reason: collision with root package name */
    public final int f9575B;

    /* renamed from: C, reason: collision with root package name */
    public final n4.l f9576C;

    /* renamed from: D, reason: collision with root package name */
    public final C0463k f9577D = new C0463k(this, 8);

    /* renamed from: E, reason: collision with root package name */
    public InterfaceC0475x f9578E;

    /* renamed from: F, reason: collision with root package name */
    public int f9579F;

    /* renamed from: G, reason: collision with root package name */
    public n0 f9580G;

    /* renamed from: H, reason: collision with root package name */
    public r[] f9581H;

    /* renamed from: I, reason: collision with root package name */
    public r[] f9582I;

    /* renamed from: J, reason: collision with root package name */
    public int f9583J;

    /* renamed from: K, reason: collision with root package name */
    public C0463k f9584K;

    /* renamed from: a, reason: collision with root package name */
    public final c f9585a;

    /* renamed from: b, reason: collision with root package name */
    public final V4.c f9586b;

    /* renamed from: c, reason: collision with root package name */
    public final R7.a f9587c;

    /* renamed from: d, reason: collision with root package name */
    public final T f9588d;

    /* renamed from: e, reason: collision with root package name */
    public final r4.q f9589e;

    /* renamed from: f, reason: collision with root package name */
    public final C1941m f9590f;

    /* renamed from: u, reason: collision with root package name */
    public final B f9591u;

    /* renamed from: v, reason: collision with root package name */
    public final A4.s f9592v;

    /* renamed from: w, reason: collision with root package name */
    public final C1620q f9593w;

    /* renamed from: x, reason: collision with root package name */
    public final IdentityHashMap f9594x;

    /* renamed from: y, reason: collision with root package name */
    public final R7.a f9595y;

    /* renamed from: z, reason: collision with root package name */
    public final h8.e f9596z;

    public l(c cVar, V4.c cVar2, R7.a aVar, T t5, r4.q qVar, C1941m c1941m, B b2, A4.s sVar, C1620q c1620q, h8.e eVar, boolean z8, int i7, n4.l lVar) {
        this.f9585a = cVar;
        this.f9586b = cVar2;
        this.f9587c = aVar;
        this.f9588d = t5;
        this.f9589e = qVar;
        this.f9590f = c1941m;
        this.f9591u = b2;
        this.f9592v = sVar;
        this.f9593w = c1620q;
        this.f9596z = eVar;
        this.f9574A = z8;
        this.f9575B = i7;
        this.f9576C = lVar;
        eVar.getClass();
        this.f9584K = new C0463k(new f0[0], 0);
        this.f9594x = new IdentityHashMap();
        this.f9595y = new R7.a(7);
        this.f9581H = new r[0];
        this.f9582I = new r[0];
    }

    public static L f(L l10, L l11, boolean z8) {
        String s3;
        F4.c cVar;
        int i7;
        String str;
        int i10;
        int i11;
        String str2;
        if (l11 != null) {
            s3 = l11.f20093w;
            cVar = l11.f20094x;
            i10 = l11.f20075M;
            i7 = l11.f20088d;
            i11 = l11.f20089e;
            str = l11.f20087c;
            str2 = l11.f20086b;
        } else {
            s3 = D.s(1, l10.f20093w);
            cVar = l10.f20094x;
            if (z8) {
                i10 = l10.f20075M;
                i7 = l10.f20088d;
                i11 = l10.f20089e;
                str = l10.f20087c;
                str2 = l10.f20086b;
            } else {
                i7 = 0;
                str = null;
                i10 = -1;
                i11 = 0;
                str2 = null;
            }
        }
        String d10 = n5.o.d(s3);
        int i12 = z8 ? l10.f20090f : -1;
        int i13 = z8 ? l10.f20091u : -1;
        K k = new K();
        k.f19976a = l10.f20085a;
        k.f19977b = str2;
        k.j = l10.f20095y;
        k.k = d10;
        k.f19982h = s3;
        k.f19983i = cVar;
        k.f19981f = i12;
        k.g = i13;
        k.f19996x = i10;
        k.f19979d = i7;
        k.f19980e = i11;
        k.f19978c = str;
        return new L(k);
    }

    @Override // V4.q
    public final void a() {
        for (r rVar : this.f9581H) {
            ArrayList arrayList = rVar.f9625B;
            if (!arrayList.isEmpty()) {
                k kVar = (k) N6.r.l(arrayList);
                int b2 = rVar.f9655d.b(kVar);
                if (b2 == 1) {
                    kVar.f9571Y = true;
                } else if (b2 == 2 && !rVar.f9662h0) {
                    J j = rVar.f9670x;
                    if (j.d()) {
                        j.b();
                    }
                }
            }
        }
        this.f9578E.i(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x008e, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0053 A[SYNTHETIC] */
    @Override // V4.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Uri uri, A7.a aVar, boolean z8) {
        long j;
        int i7;
        int u3;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = true;
        for (r rVar : this.f9581H) {
            i iVar = rVar.f9655d;
            Uri[] uriArr = iVar.f9534e;
            if (D.k(uriArr, uri)) {
                if (!z8) {
                    C1312U i10 = x.i(iVar.f9543q);
                    rVar.f9669w.getClass();
                    D4.e c10 = B.c(i10, aVar);
                    if (c10 != null && c10.f3224a == 2) {
                        j = c10.f3225b;
                        i7 = 0;
                        while (true) {
                            if (i7 < uriArr.length) {
                                i7 = -1;
                                break;
                            }
                            if (uriArr[i7].equals(uri)) {
                                break;
                            }
                            i7++;
                        }
                        if (i7 == -1 || (u3 = iVar.f9543q.u(i7)) == -1) {
                            z11 = true;
                            z10 = true;
                        } else {
                            iVar.f9545s |= uri.equals(iVar.f9541o);
                            if (j == -9223372036854775807L) {
                                if (iVar.f9543q.o(u3, j)) {
                                    V4.b bVar = (V4.b) iVar.g.f10050d.get(uri);
                                    if (bVar != null) {
                                        z10 = true;
                                        z12 = !V4.b.a(bVar, j);
                                    } else {
                                        z10 = true;
                                        z12 = false;
                                    }
                                } else {
                                    z10 = true;
                                }
                                z11 = false;
                            } else {
                                z10 = true;
                            }
                            z11 = z10;
                        }
                        z13 = (z11 || j == -9223372036854775807L) ? false : z10;
                    }
                }
                j = -9223372036854775807L;
                i7 = 0;
                while (true) {
                    if (i7 < uriArr.length) {
                    }
                    i7++;
                }
                if (i7 == -1) {
                    iVar.f9545s |= uri.equals(iVar.f9541o);
                    if (j == -9223372036854775807L) {
                    }
                    z11 = z10;
                    if (z11) {
                    }
                }
                z11 = true;
                z10 = true;
                if (z11) {
                }
            } else {
                z13 = true;
            }
            z14 &= z13;
        }
        this.f9578E.i(this);
        return z14;
    }

    @Override // P4.InterfaceC0476y
    public final long c(long j, E0 e02) {
        r[] rVarArr = this.f9582I;
        int length = rVarArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                break;
            }
            r rVar = rVarArr[i7];
            if (rVar.f9637O == 2) {
                i iVar = rVar.f9655d;
                int n6 = iVar.f9543q.n();
                Uri[] uriArr = iVar.f9534e;
                int length2 = uriArr.length;
                V4.c cVar = iVar.g;
                V4.i a9 = (n6 >= length2 || n6 == -1) ? null : cVar.a(true, uriArr[iVar.f9543q.j()]);
                if (a9 != null) {
                    H h10 = a9.f10093r;
                    if (!h10.isEmpty() && a9.f10117c) {
                        long j10 = a9.f10085h - cVar.f10046B;
                        long j11 = j - j10;
                        int c10 = D.c(h10, Long.valueOf(j11), true);
                        long j12 = ((V4.f) h10.get(c10)).f10070e;
                        return e02.a(j11, j12, c10 != h10.size() - 1 ? ((V4.f) h10.get(c10 + 1)).f10070e : j12) + j10;
                    }
                }
            } else {
                i7++;
            }
        }
        return j;
    }

    @Override // P4.f0
    public final boolean d() {
        return this.f9584K.d();
    }

    public final r e(String str, int i7, Uri[] uriArr, L[] lArr, L l10, List list, Map map, long j) {
        i iVar = new i(this.f9585a, this.f9586b, uriArr, lArr, this.f9587c, this.f9588d, this.f9595y, list, this.f9576C);
        A4.s sVar = this.f9592v;
        return new r(str, i7, this.f9577D, iVar, map, this.f9593w, j, l10, this.f9589e, this.f9590f, this.f9591u, sVar, this.f9575B);
    }

    @Override // P4.f0
    public final long j() {
        return this.f9584K.j();
    }

    @Override // P4.InterfaceC0476y
    public final long k() {
        return -9223372036854775807L;
    }

    @Override // P4.InterfaceC0476y
    public final n0 l() {
        n0 n0Var = this.f9580G;
        n0Var.getClass();
        return n0Var;
    }

    @Override // P4.f0
    public final long n() {
        return this.f9584K.n();
    }

    @Override // P4.InterfaceC0476y
    public final void o() {
        for (r rVar : this.f9581H) {
            rVar.E();
            if (rVar.f9662h0 && !rVar.f9640R) {
                throw C1586o0.a("Loading finished before preparation is complete.", null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
    
        if (r2[r14] != 1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01cb  */
    @Override // P4.InterfaceC0476y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(InterfaceC0475x interfaceC0475x, long j) {
        List list;
        boolean z8;
        Map map;
        ArrayList arrayList;
        List list2;
        HashSet hashSet;
        int i7;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int r10;
        r e2;
        boolean z12;
        int i13;
        int i14;
        int i15;
        this.f9578E = interfaceC0475x;
        V4.c cVar = this.f9586b;
        cVar.getClass();
        cVar.f10051e.add(this);
        V4.l lVar = cVar.f10056x;
        lVar.getClass();
        Map emptyMap = Collections.emptyMap();
        List list3 = lVar.f10109e;
        boolean isEmpty = list3.isEmpty();
        this.f9579F = 0;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        boolean z13 = this.f9574A;
        List list4 = lVar.g;
        if (isEmpty) {
            list = list4;
            z8 = z13;
            map = emptyMap;
            arrayList = arrayList3;
        } else {
            int size = list3.size();
            int[] iArr = new int[size];
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i16 < list3.size()) {
                L l10 = ((V4.k) list3.get(i16)).f10102b;
                if (l10.f20069F <= 0) {
                    String str = l10.f20093w;
                    if (D.s(2, str) == null) {
                        i15 = 1;
                        if (D.s(1, str) != null) {
                            iArr[i16] = 1;
                            i18++;
                        } else {
                            iArr[i16] = -1;
                        }
                        i16 += i15;
                    }
                }
                i15 = 1;
                iArr[i16] = 2;
                i17++;
                i16 += i15;
            }
            if (i17 > 0) {
                i11 = i17;
                z10 = true;
            } else if (i18 < size) {
                i11 = size - i18;
                z10 = false;
                z11 = true;
                Uri[] uriArr = new Uri[i11];
                L[] lArr = new L[i11];
                int[] iArr2 = new int[i11];
                i12 = 0;
                int i19 = 0;
                while (i12 < list3.size()) {
                    if (z10) {
                        z12 = z13;
                        if (iArr[i12] != 2) {
                            i14 = 1;
                            i13 = i14;
                            i12 += i13;
                            z13 = z12;
                        }
                    } else {
                        z12 = z13;
                    }
                    if (z11) {
                        i14 = 1;
                    }
                    V4.k kVar = (V4.k) list3.get(i12);
                    uriArr[i19] = kVar.f10101a;
                    lArr[i19] = kVar.f10102b;
                    i13 = 1;
                    iArr2[i19] = i12;
                    i19++;
                    i12 += i13;
                    z13 = z12;
                }
                boolean z14 = z13;
                String str2 = lArr[0].f20093w;
                r10 = D.r(2, str2);
                int r11 = D.r(1, str2);
                boolean z15 = (r11 != 1 || (r11 == 0 && list4.isEmpty())) && r10 <= 1 && r11 + r10 > 0;
                list = list4;
                map = emptyMap;
                arrayList = arrayList3;
                z8 = z14;
                e2 = e("main", (!z10 || r11 <= 0) ? 0 : 1, uriArr, lArr, lVar.j, lVar.k, emptyMap, j);
                arrayList2.add(e2);
                arrayList.add(iArr2);
                if (z8 && z15) {
                    ArrayList arrayList4 = new ArrayList();
                    L l11 = lVar.j;
                    if (r10 <= 0) {
                        L[] lArr2 = new L[i11];
                        for (int i20 = 0; i20 < i11; i20++) {
                            L l12 = lArr[i20];
                            String s3 = D.s(2, l12.f20093w);
                            String d10 = n5.o.d(s3);
                            K k = new K();
                            k.f19976a = l12.f20085a;
                            k.f19977b = l12.f20086b;
                            k.j = l12.f20095y;
                            k.k = d10;
                            k.f19982h = s3;
                            k.f19983i = l12.f20094x;
                            k.f19981f = l12.f20090f;
                            k.g = l12.f20091u;
                            k.f19988p = l12.f20068E;
                            k.f19989q = l12.f20069F;
                            k.f19990r = l12.f20070G;
                            k.f19979d = l12.f20088d;
                            k.f19980e = l12.f20089e;
                            lArr2[i20] = new L(k);
                        }
                        arrayList4.add(new m0("main", lArr2));
                        if (r11 > 0 && (l11 != null || list.isEmpty())) {
                            arrayList4.add(new m0("main:audio", f(lArr[0], l11, false)));
                        }
                        List list5 = lVar.k;
                        if (list5 != null) {
                            for (int i21 = 0; i21 < list5.size(); i21++) {
                                arrayList4.add(new m0(h3.o.l(i21, "main:cc:"), (L) list5.get(i21)));
                            }
                        }
                    } else {
                        L[] lArr3 = new L[i11];
                        for (int i22 = 0; i22 < i11; i22++) {
                            lArr3[i22] = f(lArr[i22], l11, true);
                        }
                        arrayList4.add(new m0("main", lArr3));
                    }
                    K k7 = new K();
                    k7.f19976a = "ID3";
                    k7.k = "application/id3";
                    m0 m0Var = new m0("main:id3", new L(k7));
                    arrayList4.add(m0Var);
                    e2.F((m0[]) arrayList4.toArray(new m0[0]), arrayList4.indexOf(m0Var));
                }
            } else {
                i11 = size;
                z10 = false;
            }
            z11 = false;
            Uri[] uriArr2 = new Uri[i11];
            L[] lArr4 = new L[i11];
            int[] iArr22 = new int[i11];
            i12 = 0;
            int i192 = 0;
            while (i12 < list3.size()) {
            }
            boolean z142 = z13;
            String str22 = lArr4[0].f20093w;
            r10 = D.r(2, str22);
            int r112 = D.r(1, str22);
            if (r112 != 1) {
            }
            list = list4;
            map = emptyMap;
            arrayList = arrayList3;
            z8 = z142;
            e2 = e("main", (!z10 || r112 <= 0) ? 0 : 1, uriArr2, lArr4, lVar.j, lVar.k, emptyMap, j);
            arrayList2.add(e2);
            arrayList.add(iArr22);
            if (z8) {
                ArrayList arrayList42 = new ArrayList();
                L l112 = lVar.j;
                if (r10 <= 0) {
                }
                K k72 = new K();
                k72.f19976a = "ID3";
                k72.k = "application/id3";
                m0 m0Var2 = new m0("main:id3", new L(k72));
                arrayList42.add(m0Var2);
                e2.F((m0[]) arrayList42.toArray(new m0[0]), arrayList42.indexOf(m0Var2));
            }
        }
        ArrayList arrayList5 = new ArrayList(list.size());
        ArrayList arrayList6 = new ArrayList(list.size());
        ArrayList arrayList7 = new ArrayList(list.size());
        HashSet hashSet2 = new HashSet();
        int i23 = 0;
        while (i23 < list.size()) {
            List list6 = list;
            String str3 = ((V4.j) list6.get(i23)).f10100c;
            if (hashSet2.add(str3)) {
                arrayList5.clear();
                arrayList6.clear();
                arrayList7.clear();
                int i24 = 0;
                boolean z16 = true;
                while (i24 < list6.size()) {
                    String str4 = ((V4.j) list6.get(i24)).f10100c;
                    int i25 = D.f21141a;
                    if (str3.equals(str4)) {
                        V4.j jVar = (V4.j) list6.get(i24);
                        arrayList7.add(Integer.valueOf(i24));
                        arrayList5.add(jVar.f10098a);
                        L l13 = jVar.f10099b;
                        arrayList6.add(l13);
                        i10 = 1;
                        z16 &= D.r(1, l13.f20093w) == 1;
                    } else {
                        i10 = 1;
                    }
                    i24 += i10;
                }
                String concat = "audio:".concat(str3);
                int i26 = D.f21141a;
                list2 = list6;
                hashSet = hashSet2;
                i7 = i23;
                r e10 = e(concat, 1, (Uri[]) arrayList5.toArray(new Uri[0]), (L[]) arrayList6.toArray(new L[0]), null, Collections.emptyList(), map, j);
                arrayList.add(h3.H.G(arrayList7));
                arrayList2.add(e10);
                if (z8 && z16) {
                    e10.F(new m0[]{new m0(concat, (L[]) arrayList6.toArray(new L[0]))}, new int[0]);
                }
            } else {
                list2 = list6;
                hashSet = hashSet2;
                i7 = i23;
            }
            i23 = i7 + 1;
            list = list2;
            hashSet2 = hashSet;
        }
        this.f9583J = arrayList2.size();
        int i27 = 0;
        while (true) {
            List list7 = lVar.f10111h;
            if (i27 >= list7.size()) {
                break;
            }
            V4.j jVar2 = (V4.j) list7.get(i27);
            StringBuilder r12 = h3.o.r(i27, "subtitle:", ":");
            r12.append(jVar2.f10100c);
            String sb2 = r12.toString();
            Uri[] uriArr3 = {jVar2.f10098a};
            L l14 = jVar2.f10099b;
            r e11 = e(sb2, 3, uriArr3, new L[]{l14}, null, Collections.emptyList(), map, j);
            arrayList.add(new int[]{i27});
            arrayList2.add(e11);
            e11.F(new m0[]{new m0(sb2, l14)}, new int[0]);
            i27++;
        }
        this.f9581H = (r[]) arrayList2.toArray(new r[0]);
        this.f9579F = this.f9581H.length;
        for (int i28 = 0; i28 < this.f9583J; i28++) {
            this.f9581H[i28].f9655d.f9538l = true;
        }
        for (r rVar : this.f9581H) {
            if (!rVar.f9640R) {
                rVar.x(rVar.f9656d0);
            }
        }
        this.f9582I = this.f9581H;
    }

    @Override // P4.InterfaceC0476y
    public final long r(long j) {
        r[] rVarArr = this.f9582I;
        if (rVarArr.length > 0) {
            boolean H10 = rVarArr[0].H(j, false);
            int i7 = 1;
            while (true) {
                r[] rVarArr2 = this.f9582I;
                if (i7 >= rVarArr2.length) {
                    break;
                }
                rVarArr2[i7].H(j, H10);
                i7++;
            }
            if (H10) {
                ((SparseArray) this.f9595y.f8927b).clear();
            }
        }
        return j;
    }

    @Override // P4.InterfaceC0476y
    public final void s(long j) {
        for (r rVar : this.f9582I) {
            if (rVar.f9639Q && !rVar.C()) {
                int length = rVar.f9633J.length;
                for (int i7 = 0; i7 < length; i7++) {
                    rVar.f9633J[i7].g(j, rVar.f9652b0[i7]);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0263  */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v32 */
    @Override // P4.InterfaceC0476y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long v(k5.s[] sVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        int i7;
        n[] nVarArr;
        int i10;
        r rVar;
        int i11;
        d0[] d0VarArr2;
        int i12;
        int i13;
        IdentityHashMap identityHashMap2;
        r[] rVarArr;
        k5.s[] sVarArr2;
        int[] iArr;
        int[] iArr2;
        i iVar;
        boolean z8;
        boolean z10;
        boolean z11;
        r[] rVarArr2;
        IdentityHashMap identityHashMap3;
        k5.s[] sVarArr3;
        IdentityHashMap identityHashMap4;
        r[] rVarArr3;
        l lVar = this;
        d0[] d0VarArr3 = d0VarArr;
        int[] iArr3 = new int[sVarArr.length];
        int[] iArr4 = new int[sVarArr.length];
        int i14 = 0;
        while (true) {
            int length = sVarArr.length;
            identityHashMap = lVar.f9594x;
            if (i14 >= length) {
                break;
            }
            d0 d0Var = d0VarArr3[i14];
            iArr3[i14] = d0Var == null ? -1 : ((Integer) identityHashMap.get(d0Var)).intValue();
            iArr4[i14] = -1;
            k5.s sVar = sVarArr[i14];
            if (sVar != null) {
                m0 k = sVar.k();
                int i15 = 0;
                while (true) {
                    r[] rVarArr4 = lVar.f9581H;
                    if (i15 < rVarArr4.length) {
                        r rVar2 = rVarArr4[i15];
                        rVar2.a();
                        if (rVar2.f9645W.b(k) != -1) {
                            iArr4[i14] = i15;
                            break;
                        }
                        i15++;
                    }
                }
            }
            i14++;
        }
        identityHashMap.clear();
        int length2 = sVarArr.length;
        d0[] d0VarArr4 = new d0[length2];
        int length3 = sVarArr.length;
        int length4 = sVarArr.length;
        k5.s[] sVarArr4 = new k5.s[length4];
        r[] rVarArr5 = new r[lVar.f9581H.length];
        int i16 = length2;
        int i17 = 0;
        int i18 = 0;
        boolean z12 = false;
        ?? r42 = new d0[length3];
        while (i17 < lVar.f9581H.length) {
            d0[] d0VarArr5 = d0VarArr4;
            int i19 = 0;
            while (true) {
                i7 = length3;
                if (i19 >= sVarArr.length) {
                    break;
                }
                r42[i19] = iArr3[i19] == i17 ? d0VarArr3[i19] : null;
                sVarArr4[i19] = iArr4[i19] == i17 ? sVarArr[i19] : null;
                i19++;
                length3 = i7;
            }
            r rVar3 = lVar.f9581H[i17];
            rVar3.a();
            int i20 = rVar3.f9641S;
            int i21 = i17;
            int i22 = 0;
            while (i22 < length4) {
                n nVar = (n) r42[i22];
                if (nVar == null || (sVarArr4[i22] != null && zArr[i22])) {
                    identityHashMap4 = identityHashMap;
                    rVarArr3 = rVarArr5;
                } else {
                    identityHashMap4 = identityHashMap;
                    rVar3.f9641S--;
                    rVarArr3 = rVarArr5;
                    if (nVar.f9612c != -1) {
                        r rVar4 = nVar.f9611b;
                        rVar4.a();
                        rVar4.f9647Y.getClass();
                        int i23 = rVar4.f9647Y[nVar.f9610a];
                        AbstractC1705a.m(rVar4.f9652b0[i23]);
                        rVar4.f9652b0[i23] = false;
                        nVar.f9612c = -1;
                    }
                    r42[i22] = 0;
                }
                i22++;
                identityHashMap = identityHashMap4;
                rVarArr5 = rVarArr3;
            }
            IdentityHashMap identityHashMap5 = identityHashMap;
            r[] rVarArr6 = rVarArr5;
            boolean z13 = z12 || (!rVar3.f9661g0 ? j == rVar3.f9656d0 : i20 != 0);
            i iVar2 = rVar3.f9655d;
            k5.s sVar2 = iVar2.f9543q;
            boolean z14 = z13;
            k5.s sVar3 = sVar2;
            int i24 = 0;
            while (i24 < length4) {
                k5.s sVar4 = sVarArr4[i24];
                if (sVar4 == null) {
                    sVarArr3 = sVarArr4;
                } else {
                    sVarArr3 = sVarArr4;
                    int b2 = rVar3.f9645W.b(sVar4.k());
                    if (b2 == rVar3.f9648Z) {
                        iVar2.f9543q = sVar4;
                        sVar3 = sVar4;
                    }
                    if (r42[i24] == 0) {
                        rVar3.f9641S++;
                        n nVar2 = new n(rVar3, b2);
                        r42[i24] = nVar2;
                        zArr2[i24] = true;
                        if (rVar3.f9647Y != null) {
                            nVar2.c();
                            if (!z14) {
                                q qVar = rVar3.f9633J[rVar3.f9647Y[b2]];
                                z14 = (qVar.B(j, true) || qVar.o() == 0) ? false : true;
                            }
                        }
                    }
                }
                i24++;
                sVarArr4 = sVarArr3;
            }
            k5.s[] sVarArr5 = sVarArr4;
            int i25 = rVar3.f9641S;
            ArrayList arrayList = rVar3.f9625B;
            if (i25 == 0) {
                iVar2.f9540n = null;
                rVar3.f9643U = null;
                rVar3.f9660f0 = true;
                arrayList.clear();
                J j10 = rVar3.f9670x;
                if (j10.d()) {
                    if (rVar3.f9639Q) {
                        for (q qVar2 : rVar3.f9633J) {
                            qVar2.h();
                        }
                    }
                    j10.b();
                } else {
                    rVar3.G();
                }
                nVarArr = r42;
                i10 = length4;
                rVar = rVar3;
                i11 = i16;
                d0VarArr2 = d0VarArr5;
                i12 = i7;
                i13 = i21;
                identityHashMap2 = identityHashMap5;
                rVarArr = rVarArr6;
                sVarArr2 = sVarArr5;
                iArr = iArr3;
                iArr2 = iArr4;
                iVar = iVar2;
            } else {
                if (arrayList.isEmpty() || D.a(sVar3, sVar2)) {
                    nVarArr = r42;
                    i10 = length4;
                    rVar = rVar3;
                    i11 = i16;
                    d0VarArr2 = d0VarArr5;
                    i12 = i7;
                    i13 = i21;
                    identityHashMap2 = identityHashMap5;
                    rVarArr = rVarArr6;
                    sVarArr2 = sVarArr5;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    iVar = iVar2;
                } else {
                    if (rVar3.f9661g0) {
                        nVarArr = r42;
                        i10 = length4;
                        rVar = rVar3;
                        i11 = i16;
                        d0VarArr2 = d0VarArr5;
                        i12 = i7;
                        i13 = i21;
                        identityHashMap2 = identityHashMap5;
                        rVarArr = rVarArr6;
                        sVarArr2 = sVarArr5;
                        iArr = iArr3;
                        iArr2 = iArr4;
                        iVar = iVar2;
                    } else {
                        long j11 = j < 0 ? -j : 0L;
                        k A10 = rVar3.A();
                        sVarArr2 = sVarArr5;
                        nVarArr = r42;
                        i10 = length4;
                        i12 = i7;
                        d0VarArr2 = d0VarArr5;
                        rVar = rVar3;
                        iArr = iArr3;
                        i11 = i16;
                        i13 = i21;
                        iVar = iVar2;
                        identityHashMap2 = identityHashMap5;
                        iArr2 = iArr4;
                        rVarArr = rVarArr6;
                        sVar3.b(j, j11, -9223372036854775807L, rVar3.f9626C, iVar2.a(A10, j));
                        z8 = sVar3.j() == iVar.f9536h.a(A10.f8872d) ? true : true;
                    }
                    z8 = true;
                    rVar.f9660f0 = true;
                    z11 = true;
                    z10 = true;
                    if (z10) {
                        rVar.H(j, z11);
                        int i26 = 0;
                        while (i26 < i12) {
                            if (nVarArr[i26] != null) {
                                zArr2[i26] = z8;
                            }
                            i26++;
                            z8 = true;
                        }
                    }
                    z14 = z10;
                }
                z10 = z14;
                z11 = z12;
                if (z10) {
                }
                z14 = z10;
            }
            ArrayList arrayList2 = rVar.f9630G;
            arrayList2.clear();
            for (int i27 = 0; i27 < i12; i27++) {
                n nVar3 = nVarArr[i27];
                if (nVar3 != null) {
                    arrayList2.add(nVar3);
                }
            }
            rVar.f9661g0 = true;
            boolean z15 = false;
            int i28 = 0;
            while (i28 < sVarArr.length) {
                n nVar4 = nVarArr[i28];
                int i29 = i13;
                if (iArr2[i28] == i29) {
                    nVar4.getClass();
                    d0VarArr2[i28] = nVar4;
                    identityHashMap3 = identityHashMap2;
                    identityHashMap3.put(nVar4, Integer.valueOf(i29));
                    z15 = true;
                } else {
                    identityHashMap3 = identityHashMap2;
                    if (iArr[i28] == i29) {
                        AbstractC1705a.m(nVar4 == null);
                    }
                }
                i28++;
                identityHashMap2 = identityHashMap3;
                i13 = i29;
            }
            int i30 = i13;
            IdentityHashMap identityHashMap6 = identityHashMap2;
            if (z15) {
                int i31 = i18;
                rVarArr2 = rVarArr;
                rVarArr2[i31] = rVar;
                i18 = i31 + 1;
                if (i31 == 0) {
                    iVar.f9538l = true;
                    if (z14) {
                        length3 = i12;
                        lVar = this;
                    } else {
                        length3 = i12;
                        lVar = this;
                        r[] rVarArr7 = lVar.f9582I;
                        if (rVarArr7.length != 0 && rVar == rVarArr7[0]) {
                        }
                    }
                    ((SparseArray) lVar.f9595y.f8927b).clear();
                    z12 = true;
                } else {
                    length3 = i12;
                    lVar = this;
                    iVar.f9538l = i30 < lVar.f9583J;
                }
            } else {
                length3 = i12;
                rVarArr2 = rVarArr;
                lVar = this;
            }
            i17 = i30 + 1;
            rVarArr5 = rVarArr2;
            identityHashMap = identityHashMap6;
            d0VarArr4 = d0VarArr2;
            iArr3 = iArr;
            iArr4 = iArr2;
            sVarArr4 = sVarArr2;
            r42 = nVarArr;
            length4 = i10;
            i16 = i11;
            d0VarArr3 = d0VarArr;
        }
        System.arraycopy(d0VarArr4, 0, d0VarArr3, 0, i16);
        r[] rVarArr8 = (r[]) D.O(i18, rVarArr5);
        lVar.f9582I = rVarArr8;
        lVar.f9596z.getClass();
        lVar.f9584K = new C0463k(rVarArr8, 0);
        return j;
    }

    @Override // P4.f0
    public final boolean x(long j) {
        if (this.f9580G != null) {
            return this.f9584K.x(j);
        }
        for (r rVar : this.f9581H) {
            if (!rVar.f9640R) {
                rVar.x(rVar.f9656d0);
            }
        }
        return false;
    }

    @Override // P4.f0
    public final void y(long j) {
        this.f9584K.y(j);
    }
}
