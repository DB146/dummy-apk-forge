package S4;

import A4.s;
import N6.r;
import P4.C0463k;
import P4.C0467o;
import P4.InterfaceC0475x;
import P4.InterfaceC0476y;
import P4.c0;
import P4.d0;
import P4.e0;
import P4.f0;
import P4.m0;
import P4.n0;
import Y5.B;
import android.util.Pair;
import android.util.SparseArray;
import h3.H;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m4.E0;
import m4.L;
import m5.C1620q;
import m5.InterfaceC1616m;
import m5.K;
import m5.T;
import n5.AbstractC1705a;
import n5.D;
import r4.C1941m;

/* loaded from: classes.dex */
public final class b implements InterfaceC0476y, e0 {
    public static final Pattern L = Pattern.compile("CC([1-4])=(.+)");

    /* renamed from: M, reason: collision with root package name */
    public static final Pattern f9055M = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: A, reason: collision with root package name */
    public final q f9056A;

    /* renamed from: C, reason: collision with root package name */
    public final s f9058C;

    /* renamed from: D, reason: collision with root package name */
    public final C1941m f9059D;

    /* renamed from: E, reason: collision with root package name */
    public InterfaceC0475x f9060E;

    /* renamed from: H, reason: collision with root package name */
    public C0463k f9063H;

    /* renamed from: I, reason: collision with root package name */
    public T4.c f9064I;

    /* renamed from: J, reason: collision with root package name */
    public int f9065J;

    /* renamed from: K, reason: collision with root package name */
    public List f9066K;

    /* renamed from: a, reason: collision with root package name */
    public final int f9067a;

    /* renamed from: b, reason: collision with root package name */
    public final j f9068b;

    /* renamed from: c, reason: collision with root package name */
    public final T f9069c;

    /* renamed from: d, reason: collision with root package name */
    public final r4.q f9070d;

    /* renamed from: e, reason: collision with root package name */
    public final B f9071e;

    /* renamed from: f, reason: collision with root package name */
    public final q3.i f9072f;

    /* renamed from: u, reason: collision with root package name */
    public final long f9073u;

    /* renamed from: v, reason: collision with root package name */
    public final K f9074v;

    /* renamed from: w, reason: collision with root package name */
    public final C1620q f9075w;

    /* renamed from: x, reason: collision with root package name */
    public final n0 f9076x;

    /* renamed from: y, reason: collision with root package name */
    public final a[] f9077y;

    /* renamed from: z, reason: collision with root package name */
    public final h8.e f9078z;

    /* renamed from: F, reason: collision with root package name */
    public R4.g[] f9061F = new R4.g[0];

    /* renamed from: G, reason: collision with root package name */
    public n[] f9062G = new n[0];

    /* renamed from: B, reason: collision with root package name */
    public final IdentityHashMap f9057B = new IdentityHashMap();

    public b(int i7, T4.c cVar, q3.i iVar, int i10, j jVar, T t5, r4.q qVar, C1941m c1941m, B b2, s sVar, long j, K k, C1620q c1620q, h8.e eVar, f fVar, n4.l lVar) {
        int i11;
        int i12;
        List list;
        int i13;
        int i14;
        L[] lArr;
        L[] f4;
        T4.f b10;
        Integer num;
        int i15 = 0;
        this.f9067a = i7;
        this.f9064I = cVar;
        this.f9072f = iVar;
        this.f9065J = i10;
        this.f9068b = jVar;
        this.f9069c = t5;
        this.f9070d = qVar;
        this.f9059D = c1941m;
        this.f9071e = b2;
        this.f9058C = sVar;
        this.f9073u = j;
        this.f9074v = k;
        this.f9075w = c1620q;
        this.f9078z = eVar;
        this.f9056A = new q(cVar, fVar, c1620q);
        R4.g[] gVarArr = this.f9061F;
        eVar.getClass();
        this.f9063H = new C0463k(gVarArr, 0);
        T4.h b11 = cVar.b(i10);
        List list2 = b11.f9279d;
        this.f9066K = list2;
        List list3 = b11.f9278c;
        int size = list3.size();
        HashMap hashMap = new HashMap(r.b(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i16 = 0; i16 < size; i16++) {
            hashMap.put(Long.valueOf(((T4.a) list3.get(i16)).f9237a), Integer.valueOf(i16));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i16));
            arrayList.add(arrayList2);
            sparseArray.put(i16, arrayList2);
        }
        for (int i17 = 0; i17 < size; i17++) {
            T4.a aVar = (T4.a) list3.get(i17);
            T4.f b12 = b("http://dashif.org/guidelines/trickmode", aVar.f9241e);
            List list4 = aVar.f9242f;
            b12 = b12 == null ? b("http://dashif.org/guidelines/trickmode", list4) : b12;
            int intValue = (b12 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(b12.f9270b)))) == null) ? i17 : num.intValue();
            if (intValue == i17 && (b10 = b("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                int i18 = D.f21141a;
                for (String str : b10.f9270b.split(",", -1)) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(str)));
                    if (num2 != null) {
                        intValue = Math.min(intValue, num2.intValue());
                    }
                }
            }
            if (intValue != i17) {
                List list5 = (List) sparseArray.get(i17);
                List list6 = (List) sparseArray.get(intValue);
                list6.addAll(list5);
                sparseArray.put(i17, list6);
                arrayList.remove(list5);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2];
        for (int i19 = 0; i19 < size2; i19++) {
            int[] G9 = H.G((Collection) arrayList.get(i19));
            iArr[i19] = G9;
            Arrays.sort(G9);
        }
        boolean[] zArr = new boolean[size2];
        L[][] lArr2 = new L[size2];
        int i20 = 0;
        int i21 = 0;
        while (i20 < size2) {
            int[] iArr2 = iArr[i20];
            int length = iArr2.length;
            int i22 = i15;
            while (true) {
                if (i22 >= length) {
                    break;
                }
                List list7 = ((T4.a) list3.get(iArr2[i22])).f9239c;
                while (i15 < list7.size()) {
                    if (!((T4.m) list7.get(i15)).f9295d.isEmpty()) {
                        zArr[i20] = true;
                        i21++;
                        break;
                    }
                    i15++;
                }
                i22++;
                i15 = 0;
            }
            int[] iArr3 = iArr[i20];
            int length2 = iArr3.length;
            int i23 = 0;
            while (i23 < length2) {
                int i24 = iArr3[i23];
                T4.a aVar2 = (T4.a) list3.get(i24);
                List list8 = ((T4.a) list3.get(i24)).f9240d;
                int[] iArr4 = iArr3;
                int i25 = 0;
                while (i25 < list8.size()) {
                    T4.f fVar2 = (T4.f) list8.get(i25);
                    int i26 = length2;
                    List list9 = list8;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(fVar2.f9269a)) {
                        m4.K k7 = new m4.K();
                        k7.k = "application/cea-608";
                        k7.f19976a = X.c.f(aVar2.f9237a, ":cea608", new StringBuilder());
                        f4 = f(fVar2, L, new L(k7));
                    } else if ("urn:scte:dash:cc:cea-708:2015".equals(fVar2.f9269a)) {
                        m4.K k10 = new m4.K();
                        k10.k = "application/cea-708";
                        k10.f19976a = X.c.f(aVar2.f9237a, ":cea708", new StringBuilder());
                        f4 = f(fVar2, f9055M, new L(k10));
                    } else {
                        i25++;
                        length2 = i26;
                        list8 = list9;
                    }
                    lArr = f4;
                    i14 = 1;
                }
                i23++;
                iArr3 = iArr4;
            }
            i14 = 1;
            lArr = new L[0];
            lArr2[i20] = lArr;
            if (lArr.length != 0) {
                i21 += i14;
            }
            i20 += i14;
            i15 = 0;
        }
        int size3 = list2.size() + i21 + size2;
        m0[] m0VarArr = new m0[size3];
        a[] aVarArr = new a[size3];
        int i27 = 0;
        int i28 = 0;
        while (i27 < size2) {
            int[] iArr5 = iArr[i27];
            ArrayList arrayList3 = new ArrayList();
            int length3 = iArr5.length;
            int i29 = size2;
            int i30 = 0;
            while (i30 < length3) {
                arrayList3.addAll(((T4.a) list3.get(iArr5[i30])).f9239c);
                i30++;
                iArr = iArr;
            }
            int[][] iArr6 = iArr;
            int size4 = arrayList3.size();
            L[] lArr3 = new L[size4];
            int i31 = 0;
            while (i31 < size4) {
                int i32 = size4;
                L l10 = ((T4.m) arrayList3.get(i31)).f9292a;
                ArrayList arrayList4 = arrayList3;
                int e2 = qVar.e(l10);
                m4.K a9 = l10.a();
                a9.f19975F = e2;
                lArr3[i31] = new L(a9);
                i31++;
                size4 = i32;
                arrayList3 = arrayList4;
            }
            T4.a aVar3 = (T4.a) list3.get(iArr5[0]);
            long j10 = aVar3.f9237a;
            String l11 = j10 != -1 ? Long.toString(j10) : h3.o.l(i27, "unset:");
            int i33 = i28 + 1;
            if (zArr[i27]) {
                i11 = i28 + 2;
                i12 = i33;
            } else {
                i11 = i33;
                i12 = -1;
            }
            if (lArr2[i27].length != 0) {
                i13 = i11;
                i11++;
                list = list3;
            } else {
                list = list3;
                i13 = -1;
            }
            m0VarArr[i28] = new m0(l11, lArr3);
            aVarArr[i28] = new a(aVar3.f9238b, 0, iArr5, i28, i12, i13, -1);
            int i34 = i12;
            int i35 = -1;
            if (i34 != -1) {
                String h10 = X.c.h(l11, ":emsg");
                m4.K k11 = new m4.K();
                k11.f19976a = h10;
                k11.k = "application/x-emsg";
                m0VarArr[i34] = new m0(h10, new L(k11));
                aVarArr[i34] = new a(5, 1, iArr5, i28, -1, -1, -1);
                i35 = -1;
            }
            if (i13 != i35) {
                m0VarArr[i13] = new m0(X.c.h(l11, ":cc"), lArr2[i27]);
                aVarArr[i13] = new a(3, 1, iArr5, i28, -1, -1, -1);
            }
            i27++;
            size2 = i29;
            iArr = iArr6;
            i28 = i11;
            list3 = list;
        }
        int i36 = 0;
        while (i36 < list2.size()) {
            T4.g gVar = (T4.g) list2.get(i36);
            m4.K k12 = new m4.K();
            k12.f19976a = gVar.a();
            k12.k = "application/x-emsg";
            m0VarArr[i28] = new m0(gVar.a() + ":" + i36, new L(k12));
            aVarArr[i28] = new a(5, 2, new int[0], -1, -1, -1, i36);
            i36++;
            i28++;
        }
        Pair create = Pair.create(new n0(m0VarArr), aVarArr);
        this.f9076x = (n0) create.first;
        this.f9077y = (a[]) create.second;
    }

    public static T4.f b(String str, List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            T4.f fVar = (T4.f) list.get(i7);
            if (str.equals(fVar.f9269a)) {
                return fVar;
            }
        }
        return null;
    }

    public static L[] f(T4.f fVar, Pattern pattern, L l10) {
        String str = fVar.f9270b;
        if (str == null) {
            return new L[]{l10};
        }
        int i7 = D.f21141a;
        String[] split = str.split(";", -1);
        L[] lArr = new L[split.length];
        for (int i10 = 0; i10 < split.length; i10++) {
            Matcher matcher = pattern.matcher(split[i10]);
            if (!matcher.matches()) {
                return new L[]{l10};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            m4.K a9 = l10.a();
            a9.f19976a = l10.f20085a + ":" + parseInt;
            a9.f19972C = parseInt;
            a9.f19978c = matcher.group(2);
            lArr[i10] = new L(a9);
        }
        return lArr;
    }

    @Override // P4.InterfaceC0476y
    public final long c(long j, E0 e02) {
        for (R4.g gVar : this.f9061F) {
            if (gVar.f8894a == 2) {
                return gVar.f8898e.c(j, e02);
            }
        }
        return j;
    }

    @Override // P4.f0
    public final boolean d() {
        return this.f9063H.d();
    }

    public final int e(int[] iArr, int i7) {
        int i10 = iArr[i7];
        if (i10 == -1) {
            return -1;
        }
        a[] aVarArr = this.f9077y;
        int i11 = aVarArr[i10].f9053e;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            int i13 = iArr[i12];
            if (i13 == i11 && aVarArr[i13].f9051c == 0) {
                return i12;
            }
        }
        return -1;
    }

    @Override // P4.e0
    public final void i(f0 f0Var) {
        this.f9060E.i(this);
    }

    @Override // P4.f0
    public final long j() {
        return this.f9063H.j();
    }

    @Override // P4.InterfaceC0476y
    public final long k() {
        return -9223372036854775807L;
    }

    @Override // P4.InterfaceC0476y
    public final n0 l() {
        return this.f9076x;
    }

    @Override // P4.f0
    public final long n() {
        return this.f9063H.n();
    }

    @Override // P4.InterfaceC0476y
    public final void o() {
        this.f9074v.a();
    }

    @Override // P4.InterfaceC0476y
    public final void q(InterfaceC0475x interfaceC0475x, long j) {
        this.f9060E = interfaceC0475x;
        interfaceC0475x.a(this);
    }

    @Override // P4.InterfaceC0476y
    public final long r(long j) {
        for (R4.g gVar : this.f9061F) {
            gVar.C(j);
        }
        for (n nVar : this.f9062G) {
            int b2 = D.b(nVar.f9149c, j, true);
            nVar.f9153u = b2;
            nVar.f9154v = (nVar.f9150d && b2 == nVar.f9149c.length) ? j : -9223372036854775807L;
        }
        return j;
    }

    @Override // P4.InterfaceC0476y
    public final void s(long j) {
        for (R4.g gVar : this.f9061F) {
            gVar.s(j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // P4.InterfaceC0476y
    public final long v(k5.s[] sVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j) {
        int i7;
        boolean z8;
        int[] iArr;
        int i10;
        int[] iArr2;
        Object[] objArr;
        int i11;
        m0 m0Var;
        m0 m0Var2;
        int i12;
        p pVar;
        boolean z10;
        k5.s[] sVarArr2 = sVarArr;
        Object[] objArr2 = d0VarArr;
        int[] iArr3 = new int[sVarArr2.length];
        int i13 = 0;
        while (true) {
            i7 = -1;
            if (i13 >= sVarArr2.length) {
                break;
            }
            k5.s sVar = sVarArr2[i13];
            if (sVar != null) {
                iArr3[i13] = this.f9076x.b(sVar.k());
            } else {
                iArr3[i13] = -1;
            }
            i13++;
        }
        for (int i14 = 0; i14 < sVarArr2.length; i14++) {
            if (sVarArr2[i14] == null || !zArr[i14]) {
                Object obj = objArr2[i14];
                if (obj instanceof R4.g) {
                    ((R4.g) obj).B(this);
                } else if (obj instanceof R4.f) {
                    R4.f fVar = (R4.f) obj;
                    R4.g gVar = fVar.f8882e;
                    boolean[] zArr3 = gVar.f8897d;
                    int i15 = fVar.f8880c;
                    AbstractC1705a.m(zArr3[i15]);
                    gVar.f8897d[i15] = false;
                }
                objArr2[i14] = null;
            }
        }
        int i16 = 0;
        while (true) {
            z8 = true;
            if (i16 >= sVarArr2.length) {
                break;
            }
            Object obj2 = objArr2[i16];
            if ((obj2 instanceof C0467o) || (obj2 instanceof R4.f)) {
                int e2 = e(iArr3, i16);
                if (e2 == -1) {
                    z10 = objArr2[i16] instanceof C0467o;
                } else {
                    Object obj3 = objArr2[i16];
                    z10 = (obj3 instanceof R4.f) && ((R4.f) obj3).f8878a == objArr2[e2];
                }
                if (!z10) {
                    Object obj4 = objArr2[i16];
                    if (obj4 instanceof R4.f) {
                        R4.f fVar2 = (R4.f) obj4;
                        R4.g gVar2 = fVar2.f8882e;
                        boolean[] zArr4 = gVar2.f8897d;
                        int i17 = fVar2.f8880c;
                        AbstractC1705a.m(zArr4[i17]);
                        gVar2.f8897d[i17] = false;
                    }
                    objArr2[i16] = null;
                }
            }
            i16++;
        }
        int i18 = 0;
        while (i18 < sVarArr2.length) {
            k5.s sVar2 = sVarArr2[i18];
            if (sVar2 == null) {
                i10 = i18;
                iArr2 = iArr3;
                objArr = objArr2;
            } else {
                Object obj5 = objArr2[i18];
                if (obj5 == null) {
                    zArr2[i18] = z8;
                    a aVar = this.f9077y[iArr3[i18]];
                    int i19 = aVar.f9051c;
                    if (i19 == 0) {
                        int i20 = aVar.f9054f;
                        boolean z11 = i20 != i7 ? z8 ? 1 : 0 : false;
                        if (z11) {
                            m0Var = this.f9076x.a(i20);
                            i11 = z8 ? 1 : 0;
                        } else {
                            i11 = 0;
                            m0Var = null;
                        }
                        int i21 = aVar.g;
                        Object[] objArr3 = i21 != i7 ? z8 ? 1 : 0 : false;
                        if (objArr3 == true) {
                            m0Var2 = this.f9076x.a(i21);
                            i11 += m0Var2.f8106a;
                        } else {
                            m0Var2 = null;
                        }
                        L[] lArr = new L[i11];
                        int[] iArr4 = new int[i11];
                        if (z11) {
                            lArr[0] = m0Var.f8109d[0];
                            iArr4[0] = 5;
                            i12 = z8 ? 1 : 0;
                        } else {
                            i12 = 0;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (objArr3 != false) {
                            for (int i22 = 0; i22 < m0Var2.f8106a; i22++) {
                                L l10 = m0Var2.f8109d[i22];
                                lArr[i12] = l10;
                                iArr4[i12] = 3;
                                arrayList.add(l10);
                                i12 += z8 ? 1 : 0;
                            }
                        }
                        if (this.f9064I.f9250d && z11) {
                            q qVar = this.f9056A;
                            pVar = new p(qVar, qVar.f9162a);
                        } else {
                            pVar = null;
                        }
                        j jVar = this.f9068b;
                        K k = this.f9074v;
                        T4.c cVar = this.f9064I;
                        q3.i iVar = this.f9072f;
                        int i23 = this.f9065J;
                        int i24 = i18;
                        int[] iArr5 = aVar.f9049a;
                        int[] iArr6 = iArr3;
                        int i25 = aVar.f9050b;
                        long j10 = this.f9073u;
                        T t5 = this.f9069c;
                        InterfaceC1616m e10 = jVar.f9128a.e();
                        if (t5 != null) {
                            e10.a(t5);
                        }
                        p pVar2 = pVar;
                        i10 = i24;
                        iArr2 = iArr6;
                        R4.g gVar3 = new R4.g(aVar.f9050b, iArr4, lArr, new m(k, cVar, iVar, i23, iArr5, sVar2, i25, e10, j10, z11, arrayList, pVar), this, this.f9075w, j, this.f9070d, this.f9059D, this.f9071e, this.f9058C);
                        synchronized (this) {
                            this.f9057B.put(gVar3, pVar2);
                        }
                        objArr = d0VarArr;
                        objArr[i10] = gVar3;
                    } else {
                        i10 = i18;
                        iArr2 = iArr3;
                        objArr = objArr2;
                        if (i19 == 2) {
                            objArr[i10] = new n((T4.g) this.f9066K.get(aVar.f9052d), sVar2.k().f8109d[0], this.f9064I.f9250d);
                        }
                    }
                } else {
                    i10 = i18;
                    iArr2 = iArr3;
                    objArr = objArr2;
                    if (obj5 instanceof R4.g) {
                        ((m) ((R4.g) obj5).f8898e).f9144i = sVar2;
                    }
                }
            }
            i18 = i10 + 1;
            objArr2 = objArr;
            iArr3 = iArr2;
            z8 = true;
            i7 = -1;
            sVarArr2 = sVarArr;
        }
        int[] iArr7 = iArr3;
        Object[] objArr4 = objArr2;
        int i26 = 0;
        while (i26 < sVarArr.length) {
            if (objArr4[i26] != null || sVarArr[i26] == null) {
                iArr = iArr7;
            } else {
                iArr = iArr7;
                a aVar2 = this.f9077y[iArr[i26]];
                if (aVar2.f9051c == 1) {
                    int e11 = e(iArr, i26);
                    if (e11 == -1) {
                        objArr4[i26] = new Object();
                    } else {
                        R4.g gVar4 = (R4.g) objArr4[e11];
                        int i27 = aVar2.f9050b;
                        int i28 = 0;
                        while (true) {
                            c0[] c0VarArr = gVar4.f8884B;
                            if (i28 >= c0VarArr.length) {
                                throw new IllegalStateException();
                            }
                            if (gVar4.f8895b[i28] == i27) {
                                boolean[] zArr5 = gVar4.f8897d;
                                AbstractC1705a.m(!zArr5[i28]);
                                zArr5[i28] = true;
                                c0VarArr[i28].B(j, true);
                                objArr4[i26] = new R4.f(gVar4, gVar4, c0VarArr[i28], i28);
                                break;
                            }
                            i28++;
                        }
                    }
                    i26++;
                    iArr7 = iArr;
                }
            }
            i26++;
            iArr7 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj6 : objArr4) {
            if (obj6 instanceof R4.g) {
                arrayList2.add((R4.g) obj6);
            } else if (obj6 instanceof n) {
                arrayList3.add((n) obj6);
            }
        }
        R4.g[] gVarArr = new R4.g[arrayList2.size()];
        this.f9061F = gVarArr;
        arrayList2.toArray(gVarArr);
        n[] nVarArr = new n[arrayList3.size()];
        this.f9062G = nVarArr;
        arrayList3.toArray(nVarArr);
        h8.e eVar = this.f9078z;
        R4.g[] gVarArr2 = this.f9061F;
        eVar.getClass();
        this.f9063H = new C0463k(gVarArr2, 0);
        return j;
    }

    @Override // P4.f0
    public final boolean x(long j) {
        return this.f9063H.x(j);
    }

    @Override // P4.f0
    public final void y(long j) {
        this.f9063H.y(j);
    }
}
