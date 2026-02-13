package m9;

import H2.O;
import java.io.Serializable;

/* renamed from: m9.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1649f {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f20806e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* renamed from: f, reason: collision with root package name */
    public static final C1649f[] f20807f = a();

    /* renamed from: a, reason: collision with root package name */
    public final int f20808a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f20809b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.a[] f20810c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20811d;

    public C1649f(int i7, int[] iArr, A7.a... aVarArr) {
        this.f20808a = i7;
        this.f20809b = iArr;
        this.f20810c = aVarArr;
        A7.a aVar = aVarArr[0];
        int i10 = aVar.f531a;
        int i11 = 0;
        for (O o10 : (O[]) aVar.f532b) {
            i11 += (o10.f4604c + i10) * o10.f4603b;
        }
        this.f20811d = i11;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r10v16, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r10v2, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r10v21, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r10v24, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r10v7, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v12, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v17, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v2, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v22, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v25, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v27, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v30, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v33, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v8, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v10, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v16, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v30, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v38, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v2, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v13, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v17, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v22, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v27, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v33, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v37, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v15, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v20, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v27, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v31, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v38, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v44, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v78, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v16, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v22, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v26, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v35, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v42, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v1, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v10, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v101, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v105, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v109, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v113, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v119, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v123, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v127, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v131, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v135, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v16, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v25, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v30, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v40, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v48, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v53, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v58, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v63, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v71, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v76, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v81, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v86, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v90, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v94, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v98, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v1, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v104, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v107, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v113, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v118, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v123, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v129, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v135, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v140, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v146, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v152, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v158, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v164, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v170, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v28, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v35, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v4, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v42, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v44, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v46, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v52, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v58, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v62, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v71, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v73, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v80, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v87, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v98, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v1, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v103, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v111, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v117, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v125, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v130, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v138, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v146, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v15, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v154, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v161, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v169, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v177, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v185, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v193, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v21, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v30, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v33, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v41, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v47, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v52, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v57, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v6, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v61, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v63, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v71, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v78, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v84, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v89, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v97, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v1, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v10, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v103, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v111, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v117, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v125, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v132, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v140, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v147, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v154, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v161, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v169, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v177, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v185, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v19, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v29, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v39, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v4, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v44, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v51, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v56, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v62, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v65, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v72, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v80, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v85, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v87, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v95, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r8v21, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r8v4, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r8v7, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v12, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v2, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v4, types: [H2.O[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v8, types: [H2.O[], java.io.Serializable] */
    public static C1649f[] a() {
        int i7 = 1;
        int i10 = 6;
        int i11 = 16;
        int i12 = 10;
        int i13 = 13;
        int i14 = 17;
        C1649f c1649f = new C1649f(1, new int[0], new A7.a(7, (Serializable) new O[]{new O(i7, 19, i10)}), new A7.a(i12, (Serializable) new O[]{new O(i7, i11, i10)}), new A7.a(i13, (Serializable) new O[]{new O(i7, i13, i10)}), new A7.a(i14, (Serializable) new O[]{new O(i7, 9, i10)}));
        int i15 = 28;
        int i16 = 22;
        int i17 = 2;
        C1649f c1649f2 = new C1649f(2, new int[]{6, 18}, new A7.a(i12, (Serializable) new O[]{new O(i7, 34, i10)}), new A7.a(i11, (Serializable) new O[]{new O(i7, i15, i10)}), new A7.a(i16, (Serializable) new O[]{new O(i7, i16, i10)}), new A7.a(i15, (Serializable) new O[]{new O(i7, i11, i10)}));
        int i18 = 26;
        C1649f c1649f3 = new C1649f(3, new int[]{6, 22}, new A7.a(15, (Serializable) new O[]{new O(i7, 55, i10)}), new A7.a(i18, (Serializable) new O[]{new O(i7, 44, i10)}), new A7.a(18, (Serializable) new O[]{new O(i17, i14, i10)}), new A7.a(i16, (Serializable) new O[]{new O(i17, 13, i10)}));
        C1649f c1649f4 = new C1649f(4, new int[]{6, 26}, new A7.a(20, (Serializable) new O[]{new O(i7, 80, i10)}), new A7.a(18, (Serializable) new O[]{new O(i17, 32, i10)}), new A7.a(i18, (Serializable) new O[]{new O(i17, 24, i10)}), new A7.a(16, (Serializable) new O[]{new O(4, 9, i10)}));
        int i19 = 2;
        C1649f c1649f5 = new C1649f(5, new int[]{6, 30}, new A7.a(i18, (Serializable) new O[]{new O(i7, 108, i10)}), new A7.a(24, (Serializable) new O[]{new O(i19, 43, i10)}), new A7.a(18, (Serializable) new O[]{new O(i19, 15, i10), new O(i19, 16, i10)}), new A7.a(22, (Serializable) new O[]{new O(i19, 11, i10), new O(i19, 12, i10)}));
        int i20 = 4;
        C1649f c1649f6 = new C1649f(6, new int[]{6, 34}, new A7.a(18, (Serializable) new O[]{new O(2, 68, i10)}), new A7.a(16, (Serializable) new O[]{new O(i20, 27, i10)}), new A7.a(24, (Serializable) new O[]{new O(i20, 19, i10)}), new A7.a(28, (Serializable) new O[]{new O(i20, 15, i10)}));
        int i21 = 4;
        C1649f c1649f7 = new C1649f(7, new int[]{6, 22, 38}, new A7.a(20, (Serializable) new O[]{new O(2, 78, i10)}), new A7.a(18, (Serializable) new O[]{new O(4, 31, i10)}), new A7.a(18, (Serializable) new O[]{new O(2, 14, i10), new O(i21, 15, i10)}), new A7.a(26, (Serializable) new O[]{new O(i21, 13, i10), new O(1, 14, i10)}));
        int i22 = 2;
        C1649f c1649f8 = new C1649f(8, new int[]{6, 24, 42}, new A7.a(24, (Serializable) new O[]{new O(i22, 97, i10)}), new A7.a(22, (Serializable) new O[]{new O(i22, 38, i10), new O(i22, 39, i10)}), new A7.a(22, (Serializable) new O[]{new O(4, 18, i10), new O(i22, 19, i10)}), new A7.a(26, (Serializable) new O[]{new O(4, 14, i10), new O(2, 15, i10)}));
        int i23 = 2;
        int i24 = 4;
        C1649f c1649f9 = new C1649f(9, new int[]{6, 26, 46}, new A7.a(30, (Serializable) new O[]{new O(i23, 116, i10)}), new A7.a(22, (Serializable) new O[]{new O(3, 36, i10), new O(i23, 37, i10)}), new A7.a(20, (Serializable) new O[]{new O(i24, 16, i10), new O(i24, 17, i10)}), new A7.a(24, (Serializable) new O[]{new O(i24, 12, i10), new O(i24, 13, i10)}));
        int i25 = 2;
        int i26 = 2;
        C1649f c1649f10 = new C1649f(10, new int[]{6, 28, 50}, new A7.a(18, (Serializable) new O[]{new O(i25, 68, i10), new O(i25, 69, i10)}), new A7.a(26, (Serializable) new O[]{new O(4, 43, i10), new O(1, 44, i10)}), new A7.a(24, (Serializable) new O[]{new O(i10, 19, i10), new O(i26, 20, i10)}), new A7.a(28, (Serializable) new O[]{new O(i10, 15, i10), new O(i26, 16, i10)}));
        int i27 = 4;
        C1649f c1649f11 = new C1649f(11, new int[]{6, 30, 54}, new A7.a(20, (Serializable) new O[]{new O(i27, 81, i10)}), new A7.a(30, (Serializable) new O[]{new O(1, 50, i10), new O(i27, 51, i10)}), new A7.a(28, (Serializable) new O[]{new O(i27, 22, i10), new O(i27, 23, i10)}), new A7.a(24, (Serializable) new O[]{new O(3, 12, i10), new O(8, 13, i10)}));
        int i28 = 2;
        C1649f c1649f12 = new C1649f(12, new int[]{6, 32, 58}, new A7.a(24, (Serializable) new O[]{new O(i28, 92, i10), new O(i28, 93, i10)}), new A7.a(22, (Serializable) new O[]{new O(i10, 36, i10), new O(i28, 37, i10)}), new A7.a(26, (Serializable) new O[]{new O(4, 20, i10), new O(i10, 21, i10)}), new A7.a(28, (Serializable) new O[]{new O(7, 14, i10), new O(4, 15, i10)}));
        int i29 = 8;
        int i30 = 12;
        C1649f c1649f13 = new C1649f(13, new int[]{6, 34, 62}, new A7.a(26, (Serializable) new O[]{new O(4, 107, i10)}), new A7.a(22, (Serializable) new O[]{new O(i29, 37, i10), new O(1, 38, i10)}), new A7.a(24, (Serializable) new O[]{new O(i29, 20, i10), new O(4, 21, i10)}), new A7.a(22, (Serializable) new O[]{new O(i30, 11, i10), new O(4, i30, i10)}));
        int i31 = 5;
        C1649f c1649f14 = new C1649f(14, new int[]{6, 26, 46, 66}, new A7.a(30, (Serializable) new O[]{new O(3, 115, i10), new O(1, 116, i10)}), new A7.a(24, (Serializable) new O[]{new O(4, 40, i10), new O(i31, 41, i10)}), new A7.a(20, (Serializable) new O[]{new O(11, 16, i10), new O(i31, 17, i10)}), new A7.a(24, (Serializable) new O[]{new O(11, 12, i10), new O(5, 13, i10)}));
        int i32 = 5;
        A7.a aVar = new A7.a(22, (Serializable) new O[]{new O(i32, 87, i10), new O(1, 88, i10)});
        int i33 = 24;
        A7.a aVar2 = new A7.a(i33, (Serializable) new O[]{new O(i32, 41, i10), new O(i32, 42, i10)});
        A7.a aVar3 = new A7.a(30, (Serializable) new O[]{new O(i32, i33, i10), new O(7, 25, i10)});
        ?? r32 = {new O(11, 12, i10), new O(7, 13, i10)};
        int i34 = 24;
        C1649f c1649f15 = new C1649f(15, new int[]{6, 26, 48, 70}, aVar, aVar2, aVar3, new A7.a(i34, (Serializable) r32));
        C1649f c1649f16 = new C1649f(16, new int[]{6, 26, 50, 74}, new A7.a(i34, (Serializable) new O[]{new O(5, 98, i10), new O(1, 99, i10)}), new A7.a(28, (Serializable) new O[]{new O(7, 45, i10), new O(3, 46, i10)}), new A7.a(24, (Serializable) new O[]{new O(15, 19, i10), new O(2, 20, i10)}), new A7.a(30, (Serializable) new O[]{new O(3, 15, i10), new O(13, 16, i10)}));
        int i35 = 1;
        int i36 = 28;
        int i37 = 15;
        C1649f c1649f17 = new C1649f(17, new int[]{6, 30, 54, 78}, new A7.a(i36, (Serializable) new O[]{new O(i35, 107, i10), new O(5, 108, i10)}), new A7.a(i36, (Serializable) new O[]{new O(10, 46, i10), new O(i35, 47, i10)}), new A7.a(i36, (Serializable) new O[]{new O(i35, 22, i10), new O(i37, 23, i10)}), new A7.a(28, (Serializable) new O[]{new O(2, 14, i10), new O(17, i37, i10)}));
        C1649f c1649f18 = new C1649f(18, new int[]{6, 30, 56, 82}, new A7.a(30, (Serializable) new O[]{new O(5, 120, i10), new O(1, 121, i10)}), new A7.a(26, (Serializable) new O[]{new O(9, 43, i10), new O(4, 44, i10)}), new A7.a(28, (Serializable) new O[]{new O(17, 22, i10), new O(1, 23, i10)}), new A7.a(28, (Serializable) new O[]{new O(2, 14, i10), new O(19, 15, i10)}));
        int i38 = 3;
        A7.a aVar4 = new A7.a(28, (Serializable) new O[]{new O(i38, 113, i10), new O(4, 114, i10)});
        ?? r52 = {new O(i38, 44, i10), new O(11, 45, i10)};
        int i39 = 26;
        C1649f c1649f19 = new C1649f(19, new int[]{6, 30, 58, 86}, aVar4, new A7.a(i39, (Serializable) r52), new A7.a(i39, (Serializable) new O[]{new O(17, 21, i10), new O(4, 22, i10)}), new A7.a(26, (Serializable) new O[]{new O(9, 13, i10), new O(16, 14, i10)}));
        int i40 = 3;
        int i41 = 15;
        int i42 = 28;
        C1649f c1649f20 = new C1649f(20, new int[]{6, 34, 62, 90}, new A7.a(28, (Serializable) new O[]{new O(i40, 107, i10), new O(5, 108, i10)}), new A7.a(26, (Serializable) new O[]{new O(i40, 41, i10), new O(13, 42, i10)}), new A7.a(30, (Serializable) new O[]{new O(i41, 24, i10), new O(5, 25, i10)}), new A7.a(i42, (Serializable) new O[]{new O(i41, i41, i10), new O(10, 16, i10)}));
        int i43 = 4;
        int i44 = 17;
        C1649f c1649f21 = new C1649f(21, new int[]{6, 28, 50, 72, 94}, new A7.a(i42, (Serializable) new O[]{new O(i43, 116, i10), new O(i43, 117, i10)}), new A7.a(26, (Serializable) new O[]{new O(i44, 42, i10)}), new A7.a(28, (Serializable) new O[]{new O(i44, 22, i10), new O(i10, 23, i10)}), new A7.a(30, (Serializable) new O[]{new O(19, 16, i10), new O(i10, i44, i10)}));
        int i45 = 7;
        int i46 = 28;
        int i47 = 24;
        C1649f c1649f22 = new C1649f(22, new int[]{6, 26, 50, 74, 98}, new A7.a(i46, (Serializable) new O[]{new O(2, 111, i10), new O(i45, 112, i10)}), new A7.a(i46, (Serializable) new O[]{new O(17, 46, i10)}), new A7.a(30, (Serializable) new O[]{new O(i45, i47, i10), new O(16, 25, i10)}), new A7.a(i47, (Serializable) new O[]{new O(34, 13, i10)}));
        int i48 = 4;
        A7.a aVar5 = new A7.a(30, (Serializable) new O[]{new O(i48, 121, i10), new O(5, 122, i10)});
        O o10 = new O(i48, 47, i10);
        int i49 = 14;
        int i50 = 16;
        C1649f c1649f23 = new C1649f(23, new int[]{6, 30, 54, 78, 102}, aVar5, new A7.a(28, (Serializable) new O[]{o10, new O(i49, 48, i10)}), new A7.a(30, (Serializable) new O[]{new O(11, 24, i10), new O(i49, 25, i10)}), new A7.a(30, (Serializable) new O[]{new O(i50, 15, i10), new O(i49, i50, i10)}));
        A7.a aVar6 = new A7.a(30, (Serializable) new O[]{new O(i10, 117, i10), new O(4, 118, i10)});
        A7.a aVar7 = new A7.a(28, (Serializable) new O[]{new O(i10, 45, i10), new O(14, 46, i10)});
        O o11 = new O(11, 24, i10);
        int i51 = 16;
        int i52 = 30;
        C1649f c1649f24 = new C1649f(24, new int[]{6, 28, 54, 80, 106}, aVar6, aVar7, new A7.a(i52, (Serializable) new O[]{o11, new O(i51, 25, i10)}), new A7.a(30, (Serializable) new O[]{new O(i52, i51, i10), new O(2, 17, i10)}));
        int i53 = 8;
        int i54 = 22;
        C1649f c1649f25 = new C1649f(25, new int[]{6, 32, 58, 84, 110}, new A7.a(26, (Serializable) new O[]{new O(i53, 106, i10), new O(4, 107, i10)}), new A7.a(28, (Serializable) new O[]{new O(i53, 47, i10), new O(13, 48, i10)}), new A7.a(30, (Serializable) new O[]{new O(7, 24, i10), new O(i54, 25, i10)}), new A7.a(30, (Serializable) new O[]{new O(i54, 15, i10), new O(13, 16, i10)}));
        int i55 = 28;
        C1649f c1649f26 = new C1649f(26, new int[]{6, 30, 58, 86, 114}, new A7.a(i55, (Serializable) new O[]{new O(10, 114, i10), new O(2, 115, i10)}), new A7.a(i55, (Serializable) new O[]{new O(19, 46, i10), new O(4, 47, i10)}), new A7.a(i55, (Serializable) new O[]{new O(i55, 22, i10), new O(i10, 23, i10)}), new A7.a(30, (Serializable) new O[]{new O(33, 16, i10), new O(4, 17, i10)}));
        C1649f c1649f27 = new C1649f(27, new int[]{6, 34, 62, 90, 118}, new A7.a(30, (Serializable) new O[]{new O(8, 122, i10), new O(4, 123, i10)}), new A7.a(28, (Serializable) new O[]{new O(22, 45, i10), new O(3, 46, i10)}), new A7.a(30, (Serializable) new O[]{new O(8, 23, i10), new O(26, 24, i10)}), new A7.a(30, (Serializable) new O[]{new O(12, 15, i10), new O(28, 16, i10)}));
        int i56 = 3;
        C1649f c1649f28 = new C1649f(28, new int[]{6, 26, 50, 74, 98, 122}, new A7.a(30, (Serializable) new O[]{new O(i56, 117, i10), new O(10, 118, i10)}), new A7.a(28, (Serializable) new O[]{new O(i56, 45, i10), new O(23, 46, i10)}), new A7.a(30, (Serializable) new O[]{new O(4, 24, i10), new O(31, 25, i10)}), new A7.a(30, (Serializable) new O[]{new O(11, 15, i10), new O(31, 16, i10)}));
        int i57 = 7;
        C1649f c1649f29 = new C1649f(29, new int[]{6, 30, 54, 78, 102, 126}, new A7.a(30, (Serializable) new O[]{new O(i57, 116, i10), new O(i57, 117, i10)}), new A7.a(28, (Serializable) new O[]{new O(21, 45, i10), new O(i57, 46, i10)}), new A7.a(30, (Serializable) new O[]{new O(1, 23, i10), new O(37, 24, i10)}), new A7.a(30, (Serializable) new O[]{new O(19, 15, i10), new O(26, 16, i10)}));
        int i58 = 10;
        int i59 = 15;
        int i60 = 25;
        int i61 = 30;
        C1649f c1649f30 = new C1649f(30, new int[]{6, 26, 52, 78, 104, 130}, new A7.a(30, (Serializable) new O[]{new O(5, 115, i10), new O(i58, 116, i10)}), new A7.a(28, (Serializable) new O[]{new O(19, 47, i10), new O(i58, 48, i10)}), new A7.a(30, (Serializable) new O[]{new O(i59, 24, i10), new O(i60, i60, i10)}), new A7.a(i61, (Serializable) new O[]{new O(23, i59, i10), new O(i60, 16, i10)}));
        C1649f c1649f31 = new C1649f(31, new int[]{6, 30, 56, 82, 108, 134}, new A7.a(i61, (Serializable) new O[]{new O(13, 115, i10), new O(3, 116, i10)}), new A7.a(28, (Serializable) new O[]{new O(2, 46, i10), new O(29, 47, i10)}), new A7.a(30, (Serializable) new O[]{new O(42, 24, i10), new O(1, 25, i10)}), new A7.a(30, (Serializable) new O[]{new O(23, 15, i10), new O(28, 16, i10)}));
        int i62 = 10;
        C1649f c1649f32 = new C1649f(32, new int[]{6, 34, 60, 86, 112, 138}, new A7.a(30, (Serializable) new O[]{new O(17, 115, i10)}), new A7.a(28, (Serializable) new O[]{new O(i62, 46, i10), new O(23, 47, i10)}), new A7.a(30, (Serializable) new O[]{new O(i62, 24, i10), new O(35, 25, i10)}), new A7.a(30, (Serializable) new O[]{new O(19, 15, i10), new O(35, 16, i10)}));
        C1649f c1649f33 = new C1649f(33, new int[]{6, 30, 58, 86, 114, 142}, new A7.a(30, (Serializable) new O[]{new O(17, 115, i10), new O(1, 116, i10)}), new A7.a(28, (Serializable) new O[]{new O(14, 46, i10), new O(21, 47, i10)}), new A7.a(30, (Serializable) new O[]{new O(29, 24, i10), new O(19, 25, i10)}), new A7.a(30, (Serializable) new O[]{new O(11, 15, i10), new O(46, 16, i10)}));
        C1649f c1649f34 = new C1649f(34, new int[]{6, 34, 62, 90, 118, 146}, new A7.a(30, (Serializable) new O[]{new O(13, 115, i10), new O(i10, 116, i10)}), new A7.a(28, (Serializable) new O[]{new O(14, 46, i10), new O(23, 47, i10)}), new A7.a(30, (Serializable) new O[]{new O(44, 24, i10), new O(7, 25, i10)}), new A7.a(30, (Serializable) new O[]{new O(59, 16, i10), new O(1, 17, i10)}));
        int i63 = 12;
        C1649f c1649f35 = new C1649f(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new A7.a(30, (Serializable) new O[]{new O(i63, 121, i10), new O(7, 122, i10)}), new A7.a(28, (Serializable) new O[]{new O(i63, 47, i10), new O(26, 48, i10)}), new A7.a(30, (Serializable) new O[]{new O(39, 24, i10), new O(14, 25, i10)}), new A7.a(30, (Serializable) new O[]{new O(22, 15, i10), new O(41, 16, i10)}));
        int i64 = 24;
        int i65 = 34;
        return new C1649f[]{c1649f, c1649f2, c1649f3, c1649f4, c1649f5, c1649f6, c1649f7, c1649f8, c1649f9, c1649f10, c1649f11, c1649f12, c1649f13, c1649f14, c1649f15, c1649f16, c1649f17, c1649f18, c1649f19, c1649f20, c1649f21, c1649f22, c1649f23, c1649f24, c1649f25, c1649f26, c1649f27, c1649f28, c1649f29, c1649f30, c1649f31, c1649f32, c1649f33, c1649f34, c1649f35, new C1649f(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new A7.a(30, (Serializable) new O[]{new O(i10, 121, i10), new O(14, 122, i10)}), new A7.a(28, (Serializable) new O[]{new O(i10, 47, i10), new O(34, 48, i10)}), new A7.a(30, (Serializable) new O[]{new O(46, 24, i10), new O(10, 25, i10)}), new A7.a(30, (Serializable) new O[]{new O(2, 15, i10), new O(64, 16, i10)})), new C1649f(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new A7.a(30, (Serializable) new O[]{new O(17, 122, i10), new O(4, 123, i10)}), new A7.a(28, (Serializable) new O[]{new O(29, 46, i10), new O(14, 47, i10)}), new A7.a(30, (Serializable) new O[]{new O(49, i64, i10), new O(10, 25, i10)}), new A7.a(30, (Serializable) new O[]{new O(i64, 15, i10), new O(46, 16, i10)})), new C1649f(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new A7.a(30, (Serializable) new O[]{new O(4, 122, i10), new O(18, 123, i10)}), new A7.a(28, (Serializable) new O[]{new O(13, 46, i10), new O(32, 47, i10)}), new A7.a(30, (Serializable) new O[]{new O(48, 24, i10), new O(14, 25, i10)}), new A7.a(30, (Serializable) new O[]{new O(42, 15, i10), new O(32, 16, i10)})), new C1649f(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new A7.a(30, (Serializable) new O[]{new O(20, 117, i10), new O(4, 118, i10)}), new A7.a(28, (Serializable) new O[]{new O(40, 47, i10), new O(7, 48, i10)}), new A7.a(30, (Serializable) new O[]{new O(43, 24, i10), new O(22, 25, i10)}), new A7.a(30, (Serializable) new O[]{new O(10, 15, i10), new O(67, 16, i10)})), new C1649f(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new A7.a(30, (Serializable) new O[]{new O(19, 118, i10), new O(i10, 119, i10)}), new A7.a(28, (Serializable) new O[]{new O(18, 47, i10), new O(31, 48, i10)}), new A7.a(30, (Serializable) new O[]{new O(i65, 24, i10), new O(i65, 25, i10)}), new A7.a(30, (Serializable) new O[]{new O(20, 15, i10), new O(61, 16, i10)}))};
    }

    public static C1649f b(int i7) {
        int i10 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        int i11 = 0;
        for (int i12 = 0; i12 < 34; i12++) {
            int i13 = f20806e[i12];
            if (i13 == i7) {
                return c(i12 + 7);
            }
            int bitCount = Integer.bitCount(i13 ^ i7);
            if (bitCount < i10) {
                i11 = i12 + 7;
                i10 = bitCount;
            }
        }
        if (i10 <= 3) {
            return c(i11);
        }
        return null;
    }

    public static C1649f c(int i7) {
        if (i7 < 1 || i7 > 40) {
            throw new IllegalArgumentException();
        }
        return f20807f[i7 - 1];
    }

    public final String toString() {
        return String.valueOf(this.f20808a);
    }
}
