package m4;

import ha.C1265a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o5.C1807b;
import r4.C1935g;
import r4.C1936h;

/* loaded from: classes.dex */
public final class L implements InterfaceC1569g {

    /* renamed from: A, reason: collision with root package name */
    public final int f20064A;

    /* renamed from: B, reason: collision with root package name */
    public final List f20065B;

    /* renamed from: C, reason: collision with root package name */
    public final C1936h f20066C;

    /* renamed from: D, reason: collision with root package name */
    public final long f20067D;

    /* renamed from: E, reason: collision with root package name */
    public final int f20068E;

    /* renamed from: F, reason: collision with root package name */
    public final int f20069F;

    /* renamed from: G, reason: collision with root package name */
    public final float f20070G;

    /* renamed from: H, reason: collision with root package name */
    public final int f20071H;

    /* renamed from: I, reason: collision with root package name */
    public final float f20072I;

    /* renamed from: J, reason: collision with root package name */
    public final byte[] f20073J;

    /* renamed from: K, reason: collision with root package name */
    public final int f20074K;
    public final C1807b L;

    /* renamed from: M, reason: collision with root package name */
    public final int f20075M;

    /* renamed from: N, reason: collision with root package name */
    public final int f20076N;

    /* renamed from: O, reason: collision with root package name */
    public final int f20077O;

    /* renamed from: P, reason: collision with root package name */
    public final int f20078P;

    /* renamed from: Q, reason: collision with root package name */
    public final int f20079Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f20080R;

    /* renamed from: S, reason: collision with root package name */
    public final int f20081S;

    /* renamed from: T, reason: collision with root package name */
    public final int f20082T;

    /* renamed from: U, reason: collision with root package name */
    public final int f20083U;

    /* renamed from: V, reason: collision with root package name */
    public int f20084V;

    /* renamed from: a, reason: collision with root package name */
    public final String f20085a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20086b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20087c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20088d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20089e;

    /* renamed from: f, reason: collision with root package name */
    public final int f20090f;

    /* renamed from: u, reason: collision with root package name */
    public final int f20091u;

    /* renamed from: v, reason: collision with root package name */
    public final int f20092v;

    /* renamed from: w, reason: collision with root package name */
    public final String f20093w;

    /* renamed from: x, reason: collision with root package name */
    public final F4.c f20094x;

    /* renamed from: y, reason: collision with root package name */
    public final String f20095y;

    /* renamed from: z, reason: collision with root package name */
    public final String f20096z;

    /* renamed from: W, reason: collision with root package name */
    public static final L f20034W = new L(new K());

    /* renamed from: X, reason: collision with root package name */
    public static final String f20035X = Integer.toString(0, 36);

    /* renamed from: Y, reason: collision with root package name */
    public static final String f20036Y = Integer.toString(1, 36);

    /* renamed from: Z, reason: collision with root package name */
    public static final String f20037Z = Integer.toString(2, 36);

    /* renamed from: a0, reason: collision with root package name */
    public static final String f20038a0 = Integer.toString(3, 36);

    /* renamed from: b0, reason: collision with root package name */
    public static final String f20039b0 = Integer.toString(4, 36);

    /* renamed from: c0, reason: collision with root package name */
    public static final String f20040c0 = Integer.toString(5, 36);

    /* renamed from: d0, reason: collision with root package name */
    public static final String f20041d0 = Integer.toString(6, 36);

    /* renamed from: e0, reason: collision with root package name */
    public static final String f20042e0 = Integer.toString(7, 36);

    /* renamed from: f0, reason: collision with root package name */
    public static final String f20043f0 = Integer.toString(8, 36);

    /* renamed from: g0, reason: collision with root package name */
    public static final String f20044g0 = Integer.toString(9, 36);

    /* renamed from: h0, reason: collision with root package name */
    public static final String f20045h0 = Integer.toString(10, 36);

    /* renamed from: i0, reason: collision with root package name */
    public static final String f20046i0 = Integer.toString(11, 36);

    /* renamed from: j0, reason: collision with root package name */
    public static final String f20047j0 = Integer.toString(12, 36);

    /* renamed from: k0, reason: collision with root package name */
    public static final String f20048k0 = Integer.toString(13, 36);

    /* renamed from: l0, reason: collision with root package name */
    public static final String f20049l0 = Integer.toString(14, 36);

    /* renamed from: m0, reason: collision with root package name */
    public static final String f20050m0 = Integer.toString(15, 36);

    /* renamed from: n0, reason: collision with root package name */
    public static final String f20051n0 = Integer.toString(16, 36);

    /* renamed from: o0, reason: collision with root package name */
    public static final String f20052o0 = Integer.toString(17, 36);

    /* renamed from: p0, reason: collision with root package name */
    public static final String f20053p0 = Integer.toString(18, 36);

    /* renamed from: q0, reason: collision with root package name */
    public static final String f20054q0 = Integer.toString(19, 36);

    /* renamed from: r0, reason: collision with root package name */
    public static final String f20055r0 = Integer.toString(20, 36);

    /* renamed from: s0, reason: collision with root package name */
    public static final String f20056s0 = Integer.toString(21, 36);

    /* renamed from: t0, reason: collision with root package name */
    public static final String f20057t0 = Integer.toString(22, 36);

    /* renamed from: u0, reason: collision with root package name */
    public static final String f20058u0 = Integer.toString(23, 36);

    /* renamed from: v0, reason: collision with root package name */
    public static final String f20059v0 = Integer.toString(24, 36);

    /* renamed from: w0, reason: collision with root package name */
    public static final String f20060w0 = Integer.toString(25, 36);

    /* renamed from: x0, reason: collision with root package name */
    public static final String f20061x0 = Integer.toString(26, 36);

    /* renamed from: y0, reason: collision with root package name */
    public static final String f20062y0 = Integer.toString(27, 36);

    /* renamed from: z0, reason: collision with root package name */
    public static final String f20063z0 = Integer.toString(28, 36);

    /* renamed from: A0, reason: collision with root package name */
    public static final String f20031A0 = Integer.toString(29, 36);

    /* renamed from: B0, reason: collision with root package name */
    public static final String f20032B0 = Integer.toString(30, 36);
    public static final String C0 = Integer.toString(31, 36);

    /* renamed from: D0, reason: collision with root package name */
    public static final C1265a f20033D0 = new C1265a(15);

    public L(K k) {
        this.f20085a = k.f19976a;
        this.f20086b = k.f19977b;
        this.f20087c = n5.D.N(k.f19978c);
        this.f20088d = k.f19979d;
        this.f20089e = k.f19980e;
        int i7 = k.f19981f;
        this.f20090f = i7;
        int i10 = k.g;
        this.f20091u = i10;
        this.f20092v = i10 != -1 ? i10 : i7;
        this.f20093w = k.f19982h;
        this.f20094x = k.f19983i;
        this.f20095y = k.j;
        this.f20096z = k.k;
        this.f20064A = k.f19984l;
        List list = k.f19985m;
        this.f20065B = list == null ? Collections.emptyList() : list;
        C1936h c1936h = k.f19986n;
        this.f20066C = c1936h;
        this.f20067D = k.f19987o;
        this.f20068E = k.f19988p;
        this.f20069F = k.f19989q;
        this.f20070G = k.f19990r;
        int i11 = k.f19991s;
        this.f20071H = i11 == -1 ? 0 : i11;
        float f4 = k.f19992t;
        this.f20072I = f4 == -1.0f ? 1.0f : f4;
        this.f20073J = k.f19993u;
        this.f20074K = k.f19994v;
        this.L = k.f19995w;
        this.f20075M = k.f19996x;
        this.f20076N = k.f19997y;
        this.f20077O = k.f19998z;
        int i12 = k.f19970A;
        this.f20078P = i12 == -1 ? 0 : i12;
        int i13 = k.f19971B;
        this.f20079Q = i13 != -1 ? i13 : 0;
        this.f20080R = k.f19972C;
        this.f20081S = k.f19973D;
        this.f20082T = k.f19974E;
        int i14 = k.f19975F;
        if (i14 != 0 || c1936h == null) {
            this.f20083U = i14;
        } else {
            this.f20083U = 1;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m4.K, java.lang.Object] */
    public final K a() {
        ?? obj = new Object();
        obj.f19976a = this.f20085a;
        obj.f19977b = this.f20086b;
        obj.f19978c = this.f20087c;
        obj.f19979d = this.f20088d;
        obj.f19980e = this.f20089e;
        obj.f19981f = this.f20090f;
        obj.g = this.f20091u;
        obj.f19982h = this.f20093w;
        obj.f19983i = this.f20094x;
        obj.j = this.f20095y;
        obj.k = this.f20096z;
        obj.f19984l = this.f20064A;
        obj.f19985m = this.f20065B;
        obj.f19986n = this.f20066C;
        obj.f19987o = this.f20067D;
        obj.f19988p = this.f20068E;
        obj.f19989q = this.f20069F;
        obj.f19990r = this.f20070G;
        obj.f19991s = this.f20071H;
        obj.f19992t = this.f20072I;
        obj.f19993u = this.f20073J;
        obj.f19994v = this.f20074K;
        obj.f19995w = this.L;
        obj.f19996x = this.f20075M;
        obj.f19997y = this.f20076N;
        obj.f19998z = this.f20077O;
        obj.f19970A = this.f20078P;
        obj.f19971B = this.f20079Q;
        obj.f19972C = this.f20080R;
        obj.f19973D = this.f20081S;
        obj.f19974E = this.f20082T;
        obj.f19975F = this.f20083U;
        return obj;
    }

    public final int b() {
        int i7;
        int i10 = this.f20068E;
        if (i10 == -1 || (i7 = this.f20069F) == -1) {
            return -1;
        }
        return i10 * i7;
    }

    public final boolean c(L l10) {
        List list = this.f20065B;
        if (list.size() != l10.f20065B.size()) {
            return false;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (!Arrays.equals((byte[]) list.get(i7), (byte[]) l10.f20065B.get(i7))) {
                return false;
            }
        }
        return true;
    }

    public final L d(L l10) {
        String str;
        String str2;
        int i7;
        int i10;
        if (this == l10) {
            return this;
        }
        int h10 = n5.o.h(this.f20096z);
        String str3 = l10.f20085a;
        String str4 = l10.f20086b;
        if (str4 == null) {
            str4 = this.f20086b;
        }
        if ((h10 != 3 && h10 != 1) || (str = l10.f20087c) == null) {
            str = this.f20087c;
        }
        int i11 = this.f20090f;
        if (i11 == -1) {
            i11 = l10.f20090f;
        }
        int i12 = this.f20091u;
        if (i12 == -1) {
            i12 = l10.f20091u;
        }
        String str5 = this.f20093w;
        if (str5 == null) {
            String s3 = n5.D.s(h10, l10.f20093w);
            if (n5.D.X(s3).length == 1) {
                str5 = s3;
            }
        }
        F4.c cVar = l10.f20094x;
        F4.c cVar2 = this.f20094x;
        if (cVar2 != null) {
            cVar = cVar == null ? cVar2 : cVar2.a(cVar.f4071a);
        }
        float f4 = this.f20070G;
        if (f4 == -1.0f && h10 == 2) {
            f4 = l10.f20070G;
        }
        int i13 = this.f20088d | l10.f20088d;
        int i14 = this.f20089e | l10.f20089e;
        ArrayList arrayList = new ArrayList();
        C1936h c1936h = l10.f20066C;
        if (c1936h != null) {
            C1935g[] c1935gArr = c1936h.f23761a;
            int length = c1935gArr.length;
            int i15 = 0;
            while (i15 < length) {
                int i16 = length;
                C1935g c1935g = c1935gArr[i15];
                C1935g[] c1935gArr2 = c1935gArr;
                if (c1935g.f23760e != null) {
                    arrayList.add(c1935g);
                }
                i15++;
                length = i16;
                c1935gArr = c1935gArr2;
            }
            str2 = c1936h.f23763c;
        } else {
            str2 = null;
        }
        C1936h c1936h2 = this.f20066C;
        if (c1936h2 != null) {
            if (str2 == null) {
                str2 = c1936h2.f23763c;
            }
            int size = arrayList.size();
            C1935g[] c1935gArr3 = c1936h2.f23761a;
            int length2 = c1935gArr3.length;
            int i17 = 0;
            while (true) {
                String str6 = str2;
                if (i17 >= length2) {
                    break;
                }
                C1935g c1935g2 = c1935gArr3[i17];
                C1935g[] c1935gArr4 = c1935gArr3;
                if (c1935g2.f23760e != null) {
                    int i18 = 0;
                    while (true) {
                        if (i18 >= size) {
                            i7 = size;
                            i10 = length2;
                            arrayList.add(c1935g2);
                            break;
                        }
                        i7 = size;
                        i10 = length2;
                        if (((C1935g) arrayList.get(i18)).f23757b.equals(c1935g2.f23757b)) {
                            break;
                        }
                        i18++;
                        length2 = i10;
                        size = i7;
                    }
                } else {
                    i7 = size;
                    i10 = length2;
                }
                i17++;
                str2 = str6;
                c1935gArr3 = c1935gArr4;
                length2 = i10;
                size = i7;
            }
        }
        C1936h c1936h3 = arrayList.isEmpty() ? null : new C1936h(str2, arrayList);
        K a9 = a();
        a9.f19976a = str3;
        a9.f19977b = str4;
        a9.f19978c = str;
        a9.f19979d = i13;
        a9.f19980e = i14;
        a9.f19981f = i11;
        a9.g = i12;
        a9.f19982h = str5;
        a9.f19983i = cVar;
        a9.f19986n = c1936h3;
        a9.f19990r = f4;
        return new L(a9);
    }

    public final boolean equals(Object obj) {
        int i7;
        if (this == obj) {
            return true;
        }
        if (obj == null || L.class != obj.getClass()) {
            return false;
        }
        L l10 = (L) obj;
        int i10 = this.f20084V;
        if (i10 == 0 || (i7 = l10.f20084V) == 0 || i10 == i7) {
            return this.f20088d == l10.f20088d && this.f20089e == l10.f20089e && this.f20090f == l10.f20090f && this.f20091u == l10.f20091u && this.f20064A == l10.f20064A && this.f20067D == l10.f20067D && this.f20068E == l10.f20068E && this.f20069F == l10.f20069F && this.f20071H == l10.f20071H && this.f20074K == l10.f20074K && this.f20075M == l10.f20075M && this.f20076N == l10.f20076N && this.f20077O == l10.f20077O && this.f20078P == l10.f20078P && this.f20079Q == l10.f20079Q && this.f20080R == l10.f20080R && this.f20081S == l10.f20081S && this.f20082T == l10.f20082T && this.f20083U == l10.f20083U && Float.compare(this.f20070G, l10.f20070G) == 0 && Float.compare(this.f20072I, l10.f20072I) == 0 && n5.D.a(this.f20085a, l10.f20085a) && n5.D.a(this.f20086b, l10.f20086b) && n5.D.a(this.f20093w, l10.f20093w) && n5.D.a(this.f20095y, l10.f20095y) && n5.D.a(this.f20096z, l10.f20096z) && n5.D.a(this.f20087c, l10.f20087c) && Arrays.equals(this.f20073J, l10.f20073J) && n5.D.a(this.f20094x, l10.f20094x) && n5.D.a(this.L, l10.L) && n5.D.a(this.f20066C, l10.f20066C) && c(l10);
        }
        return false;
    }

    public final int hashCode() {
        if (this.f20084V == 0) {
            String str = this.f20085a;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f20086b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f20087c;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f20088d) * 31) + this.f20089e) * 31) + this.f20090f) * 31) + this.f20091u) * 31;
            String str4 = this.f20093w;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            F4.c cVar = this.f20094x;
            int hashCode5 = (hashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            String str5 = this.f20095y;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f20096z;
            this.f20084V = ((((((((((((((((((((Float.floatToIntBits(this.f20072I) + ((((Float.floatToIntBits(this.f20070G) + ((((((((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f20064A) * 31) + ((int) this.f20067D)) * 31) + this.f20068E) * 31) + this.f20069F) * 31)) * 31) + this.f20071H) * 31)) * 31) + this.f20074K) * 31) + this.f20075M) * 31) + this.f20076N) * 31) + this.f20077O) * 31) + this.f20078P) * 31) + this.f20079Q) * 31) + this.f20080R) * 31) + this.f20081S) * 31) + this.f20082T) * 31) + this.f20083U;
        }
        return this.f20084V;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f20085a);
        sb2.append(", ");
        sb2.append(this.f20086b);
        sb2.append(", ");
        sb2.append(this.f20095y);
        sb2.append(", ");
        sb2.append(this.f20096z);
        sb2.append(", ");
        sb2.append(this.f20093w);
        sb2.append(", ");
        sb2.append(this.f20092v);
        sb2.append(", ");
        sb2.append(this.f20087c);
        sb2.append(", [");
        sb2.append(this.f20068E);
        sb2.append(", ");
        sb2.append(this.f20069F);
        sb2.append(", ");
        sb2.append(this.f20070G);
        sb2.append(", ");
        sb2.append(this.L);
        sb2.append("], [");
        sb2.append(this.f20075M);
        sb2.append(", ");
        return A3.c.k(sb2, this.f20076N, "])");
    }
}
