package Q;

import A0.C0032v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import u.C2042E;
import u.C2069w;
import u.C2070x;
import v.AbstractC2121a;

/* loaded from: classes.dex */
public final class C0 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f8277a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f8278b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f8279c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f8280d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f8281e;

    /* renamed from: f, reason: collision with root package name */
    public C2070x f8282f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f8283h;

    /* renamed from: i, reason: collision with root package name */
    public int f8284i;
    public int j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f8285l;

    /* renamed from: m, reason: collision with root package name */
    public int f8286m;

    /* renamed from: n, reason: collision with root package name */
    public int f8287n;

    /* renamed from: o, reason: collision with root package name */
    public int f8288o;

    /* renamed from: p, reason: collision with root package name */
    public final C0032v f8289p;

    /* renamed from: q, reason: collision with root package name */
    public final C0032v f8290q;

    /* renamed from: r, reason: collision with root package name */
    public final C0032v f8291r;

    /* renamed from: s, reason: collision with root package name */
    public C2070x f8292s;

    /* renamed from: t, reason: collision with root package name */
    public int f8293t;

    /* renamed from: u, reason: collision with root package name */
    public int f8294u;

    /* renamed from: v, reason: collision with root package name */
    public int f8295v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8296w;

    /* renamed from: x, reason: collision with root package name */
    public C2069w f8297x;

    public C0(z0 z0Var) {
        this.f8277a = z0Var;
        int[] iArr = z0Var.f8586a;
        this.f8278b = iArr;
        Object[] objArr = z0Var.f8588c;
        this.f8279c = objArr;
        this.f8280d = z0Var.f8594w;
        this.f8281e = z0Var.f8595x;
        this.f8282f = z0Var.f8596y;
        int i7 = z0Var.f8587b;
        this.g = i7;
        this.f8283h = (iArr.length / 5) - i7;
        int i10 = z0Var.f8589d;
        this.k = i10;
        this.f8285l = objArr.length - i10;
        this.f8286m = i7;
        this.f8289p = new C0032v();
        this.f8290q = new C0032v();
        this.f8291r = new C0032v();
        this.f8294u = i7;
        this.f8295v = -1;
    }

    public static int h(int i7, int i10, int i11, int i12) {
        return i7 > i10 ? -(((i12 - i11) - i7) + 1) : i7;
    }

    public static void x(C0 c02) {
        int i7 = c02.f8295v;
        int q10 = c02.q(i7);
        int[] iArr = c02.f8278b;
        int i10 = (q10 * 5) + 1;
        int i11 = iArr[i10];
        if ((i11 & 134217728) != 0) {
            return;
        }
        int i12 = (i11 & (-134217729)) | 134217728;
        iArr[i10] = i12;
        if ((67108864 & i12) != 0) {
            return;
        }
        c02.S(c02.C(iArr, i7));
    }

    public final void A(int i7, int i10) {
        int i11 = this.f8285l;
        int i12 = this.k;
        int i13 = this.f8286m;
        if (i12 != i7) {
            Object[] objArr = this.f8279c;
            if (i7 < i12) {
                System.arraycopy(objArr, i7, objArr, i7 + i11, i12 - i7);
            } else {
                int i14 = i12 + i11;
                System.arraycopy(objArr, i14, objArr, i12, (i7 + i11) - i14);
            }
        }
        int min = Math.min(i10 + 1, n());
        if (i13 != min) {
            int length = this.f8279c.length - i11;
            if (min < i13) {
                int q10 = q(min);
                int q11 = q(i13);
                int i15 = this.g;
                while (q10 < q11) {
                    int i16 = (q10 * 5) + 4;
                    int i17 = this.f8278b[i16];
                    if (!(i17 >= 0)) {
                        AbstractC0508p.c("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f8278b[i16] = -((length - i17) + 1);
                    q10++;
                    if (q10 == i15) {
                        q10 += this.f8283h;
                    }
                }
            } else {
                int q12 = q(i13);
                int q13 = q(min);
                while (q12 < q13) {
                    int i18 = (q12 * 5) + 4;
                    int i19 = this.f8278b[i18];
                    if (!(i19 < 0)) {
                        AbstractC0508p.c("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f8278b[i18] = i19 + length + 1;
                    q12++;
                    if (q12 == this.g) {
                        q12 += this.f8283h;
                    }
                }
            }
            this.f8286m = min;
        }
        this.k = i7;
    }

    public final Object B(int i7) {
        int q10 = q(i7);
        int[] iArr = this.f8278b;
        if ((iArr[(q10 * 5) + 1] & 1073741824) != 0) {
            return this.f8279c[g(f(iArr, q10))];
        }
        return null;
    }

    public final int C(int[] iArr, int i7) {
        int i10 = iArr[(q(i7) * 5) + 2];
        return i10 > -2 ? i10 : n() + i10 + 2;
    }

    public final Object D(Object obj) {
        if (this.f8287n > 0) {
            v(1, this.f8295v);
        }
        Object[] objArr = this.f8279c;
        int i7 = this.f8284i;
        this.f8284i = i7 + 1;
        Object obj2 = objArr[g(i7)];
        if (this.f8284i > this.j) {
            AbstractC0508p.c("Writing to an invalid slot");
        }
        this.f8279c[g(this.f8284i - 1)] = obj;
        return obj2;
    }

    public final void E() {
        int i7;
        C2069w c2069w = this.f8297x;
        if (c2069w != null) {
            while (c2069w.f24728b != 0) {
                int t5 = C0480b.t(c2069w);
                int q10 = q(t5);
                int i10 = t5 + 1;
                int s3 = s(t5) + t5;
                while (true) {
                    if (i10 >= s3) {
                        i7 = 0;
                        break;
                    } else {
                        if ((this.f8278b[(q(i10) * 5) + 1] & 201326592) != 0) {
                            i7 = 1;
                            break;
                        }
                        i10 += s(i10);
                    }
                }
                int[] iArr = this.f8278b;
                int i11 = (q10 * 5) + 1;
                int i12 = iArr[i11];
                if (((67108864 & i12) == 0 ? 0 : 1) != i7) {
                    iArr[i11] = (i7 << 26) | ((-67108865) & i12);
                    int C2 = C(iArr, t5);
                    if (C2 >= 0) {
                        C0480b.h(c2069w, C2);
                    }
                }
            }
        }
    }

    public final boolean F() {
        if (!(this.f8287n == 0)) {
            AbstractC0508p.c("Cannot remove group while inserting");
        }
        int i7 = this.f8293t;
        int i10 = this.f8284i;
        int f4 = f(this.f8278b, q(i7));
        int I6 = I();
        N(this.f8295v);
        C2069w c2069w = this.f8297x;
        if (c2069w != null) {
            while (true) {
                int i11 = c2069w.f24728b;
                if (i11 == 0) {
                    break;
                }
                if (i11 == 0) {
                    AbstractC2121a.e("IntList is empty.");
                    throw null;
                }
                if (c2069w.f24727a[0] < i7) {
                    break;
                }
                C0480b.t(c2069w);
            }
        }
        boolean G9 = G(i7, this.f8293t - i7);
        H(f4, this.f8284i - f4, i7 - 1);
        this.f8293t = i7;
        this.f8284i = i10;
        this.f8288o -= I6;
        return G9;
    }

    public final boolean G(int i7, int i10) {
        if (i10 > 0) {
            ArrayList arrayList = this.f8280d;
            z(i7);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.f8281e;
                int i11 = i7 + i10;
                int b2 = B0.b(this.f8280d, i11, m() - this.f8283h);
                if (b2 >= this.f8280d.size()) {
                    b2--;
                }
                int i12 = b2 + 1;
                int i13 = 0;
                while (b2 >= 0) {
                    C0478a c0478a = (C0478a) this.f8280d.get(b2);
                    int c10 = c(c0478a);
                    if (c10 < i7) {
                        break;
                    }
                    if (c10 < i11) {
                        c0478a.f8373a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i13 == 0) {
                            i13 = b2 + 1;
                        }
                        i12 = b2;
                    }
                    b2--;
                }
                r0 = i12 < i13;
                if (r0) {
                    this.f8280d.subList(i12, i13).clear();
                }
            }
            this.g = i7;
            this.f8283h += i10;
            int i14 = this.f8286m;
            if (i14 > i7) {
                this.f8286m = Math.max(i7, i14 - i10);
            }
            int i15 = this.f8294u;
            if (i15 >= this.g) {
                this.f8294u = i15 - i10;
            }
            int i16 = this.f8295v;
            if (i16 >= 0 && (this.f8278b[(q(i16) * 5) + 1] & 67108864) != 0) {
                S(i16);
            }
        }
        return r0;
    }

    public final void H(int i7, int i10, int i11) {
        if (i10 > 0) {
            int i12 = this.f8285l;
            int i13 = i7 + i10;
            A(i13, i11);
            this.k = i7;
            this.f8285l = i12 + i10;
            Arrays.fill(this.f8279c, i7, i13, (Object) null);
            int i14 = this.j;
            if (i14 >= i7) {
                this.j = i14 - i10;
            }
        }
    }

    public final int I() {
        int q10 = q(this.f8293t);
        int a9 = B0.a(this.f8278b, q10) + this.f8293t;
        this.f8293t = a9;
        this.f8284i = f(this.f8278b, q(a9));
        int i7 = this.f8278b[(q10 * 5) + 1];
        if ((1073741824 & i7) != 0) {
            return 1;
        }
        return i7 & 67108863;
    }

    public final void J() {
        int i7 = this.f8294u;
        this.f8293t = i7;
        this.f8284i = f(this.f8278b, q(i7));
    }

    public final int K(int[] iArr, int i7) {
        if (i7 >= m()) {
            return this.f8279c.length - this.f8285l;
        }
        int c10 = B0.c(iArr, i7);
        return c10 < 0 ? (this.f8279c.length - this.f8285l) + c10 + 1 : c10;
    }

    public final int L(int i7, int i10) {
        int K10 = K(this.f8278b, q(i7));
        int i11 = K10 + i10;
        if (!(i11 >= K10 && i11 < f(this.f8278b, q(i7 + 1)))) {
            AbstractC0508p.c("Write to an invalid slot index " + i10 + " for group " + i7);
        }
        return i11;
    }

    public final int M(int i7) {
        return f(this.f8278b, q(s(i7) + i7));
    }

    public final K N(int i7) {
        C0478a Q3;
        HashMap hashMap = this.f8281e;
        if (hashMap == null || (Q3 = Q(i7)) == null) {
            return null;
        }
        return (K) hashMap.get(Q3);
    }

    public final void O() {
        if (this.f8287n != 0) {
            AbstractC0508p.c("Key must be supplied when inserting");
        }
        S s3 = C0498k.f8409a;
        P(0, s3, s3, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P(int i7, Object obj, Object obj2, boolean z8) {
        int i10;
        int i11 = this.f8295v;
        Object[] objArr = this.f8287n > 0;
        this.f8291r.c(this.f8288o);
        S s3 = C0498k.f8409a;
        if (objArr == true) {
            int i12 = this.f8293t;
            int f4 = f(this.f8278b, q(i12));
            u(1);
            this.f8284i = f4;
            this.j = f4;
            int q10 = q(i12);
            int i13 = obj != s3 ? 1 : 0;
            int i14 = (z8 || obj2 == s3) ? 0 : 1;
            int h10 = h(f4, this.k, this.f8285l, this.f8279c.length);
            if (h10 >= 0 && this.f8286m < i12) {
                h10 = -(((this.f8279c.length - this.f8285l) - h10) + 1);
            }
            int[] iArr = this.f8278b;
            int i15 = this.f8295v;
            int i16 = q10 * 5;
            iArr[i16] = i7;
            iArr[i16 + 1] = ((z8 ? 1 : 0) << 30) | (i13 << 29) | (i14 << 28);
            iArr[i16 + 2] = i15;
            iArr[i16 + 3] = 0;
            iArr[i16 + 4] = h10;
            int i17 = (z8 ? 1 : 0) + i13 + i14;
            if (i17 > 0) {
                v(i17, i12);
                Object[] objArr2 = this.f8279c;
                int i18 = this.f8284i;
                if (z8) {
                    objArr2[i18] = obj2;
                    i18++;
                }
                if (i13 != 0) {
                    objArr2[i18] = obj;
                    i18++;
                }
                if (i14 != 0) {
                    objArr2[i18] = obj2;
                    i18++;
                }
                this.f8284i = i18;
            }
            this.f8288o = 0;
            i10 = i12 + 1;
            this.f8295v = i12;
            this.f8293t = i10;
            if (i11 >= 0) {
                N(i11);
            }
        } else {
            this.f8289p.c(i11);
            this.f8290q.c((m() - this.f8283h) - this.f8294u);
            int i19 = this.f8293t;
            int q11 = q(i19);
            if (!kotlin.jvm.internal.l.a(obj2, s3)) {
                if (z8) {
                    T(this.f8293t, obj2);
                } else {
                    R(obj2);
                }
            }
            this.f8284i = K(this.f8278b, q11);
            this.j = f(this.f8278b, q(this.f8293t + 1));
            int[] iArr2 = this.f8278b;
            int i20 = q11 * 5;
            this.f8288o = iArr2[i20 + 1] & 67108863;
            this.f8295v = i19;
            this.f8293t = i19 + 1;
            i10 = i19 + iArr2[i20 + 3];
        }
        this.f8294u = i10;
    }

    public final C0478a Q(int i7) {
        ArrayList arrayList;
        int e2;
        if (i7 < 0 || i7 >= n() || (e2 = B0.e((arrayList = this.f8280d), i7, n())) < 0) {
            return null;
        }
        return (C0478a) arrayList.get(e2);
    }

    public final void R(Object obj) {
        int q10 = q(this.f8293t);
        int i7 = (q10 * 5) + 1;
        if ((this.f8278b[i7] & 268435456) == 0) {
            AbstractC0508p.c("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f8279c;
        int[] iArr = this.f8278b;
        objArr[g(Integer.bitCount(iArr[i7] >> 29) + f(iArr, q10))] = obj;
    }

    public final void S(int i7) {
        if (i7 >= 0) {
            C2069w c2069w = this.f8297x;
            if (c2069w == null) {
                c2069w = new C2069w();
                this.f8297x = c2069w;
            }
            C0480b.h(c2069w, i7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if ((r1[(r0 * 5) + 1] & 1073741824) != 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(int i7, Object obj) {
        int q10 = q(i7);
        int[] iArr = this.f8278b;
        boolean z8 = q10 < iArr.length;
        if (!z8) {
            AbstractC0508p.c("Updating the node of a group at " + i7 + " that was not created with as a node group");
        }
        this.f8279c[g(f(this.f8278b, q10))] = obj;
    }

    public final void a(int i7) {
        boolean z8 = false;
        if (!(i7 >= 0)) {
            AbstractC0508p.c("Cannot seek backwards");
        }
        if (!(this.f8287n <= 0)) {
            AbstractC0495i0.b("Cannot call seek() while inserting");
        }
        if (i7 == 0) {
            return;
        }
        int i10 = this.f8293t + i7;
        if (i10 >= this.f8295v && i10 <= this.f8294u) {
            z8 = true;
        }
        if (!z8) {
            AbstractC0508p.c("Cannot seek outside the current group (" + this.f8295v + '-' + this.f8294u + ')');
        }
        this.f8293t = i10;
        int f4 = f(this.f8278b, q(i10));
        this.f8284i = f4;
        this.j = f4;
    }

    public final C0478a b(int i7) {
        ArrayList arrayList = this.f8280d;
        int e2 = B0.e(arrayList, i7, n());
        if (e2 >= 0) {
            return (C0478a) arrayList.get(e2);
        }
        if (i7 > this.g) {
            i7 = -(n() - i7);
        }
        C0478a c0478a = new C0478a(i7);
        arrayList.add(-(e2 + 1), c0478a);
        return c0478a;
    }

    public final int c(C0478a c0478a) {
        int i7 = c0478a.f8373a;
        return i7 < 0 ? i7 + n() : i7;
    }

    public final void d() {
        int i7 = this.f8287n;
        this.f8287n = i7 + 1;
        if (i7 == 0) {
            this.f8290q.c((m() - this.f8283h) - this.f8294u);
        }
    }

    public final void e(boolean z8) {
        this.f8296w = true;
        if (z8 && this.f8289p.f313b == 0) {
            z(n());
            A(this.f8279c.length - this.f8285l, this.g);
            int i7 = this.k;
            Arrays.fill(this.f8279c, i7, this.f8285l + i7, (Object) null);
            E();
        }
        int[] iArr = this.f8278b;
        int i10 = this.g;
        Object[] objArr = this.f8279c;
        int i11 = this.k;
        ArrayList arrayList = this.f8280d;
        HashMap hashMap = this.f8281e;
        C2070x c2070x = this.f8282f;
        z0 z0Var = this.f8277a;
        z0Var.getClass();
        if (!z0Var.f8592u) {
            AbstractC0495i0.a("Unexpected writer close()");
        }
        z0Var.f8592u = false;
        z0Var.f8586a = iArr;
        z0Var.f8587b = i10;
        z0Var.f8588c = objArr;
        z0Var.f8589d = i11;
        z0Var.f8594w = arrayList;
        z0Var.f8595x = hashMap;
        z0Var.f8596y = c2070x;
    }

    public final int f(int[] iArr, int i7) {
        if (i7 >= m()) {
            return this.f8279c.length - this.f8285l;
        }
        int i10 = iArr[(i7 * 5) + 4];
        return i10 < 0 ? (this.f8279c.length - this.f8285l) + i10 + 1 : i10;
    }

    public final int g(int i7) {
        return (this.f8285l * (i7 < this.k ? 0 : 1)) + i7;
    }

    public final void i() {
        C2042E c2042e;
        boolean z8 = this.f8287n > 0;
        int i7 = this.f8293t;
        int i10 = this.f8294u;
        int i11 = this.f8295v;
        int q10 = q(i11);
        int i12 = this.f8288o;
        int i13 = i7 - i11;
        int i14 = q10 * 5;
        int i15 = i14 + 1;
        boolean z10 = (this.f8278b[i15] & 1073741824) != 0;
        C0032v c0032v = this.f8291r;
        if (z8) {
            C2070x c2070x = this.f8292s;
            if (c2070x != null && (c2042e = (C2042E) c2070x.b(i11)) != null) {
                Object[] objArr = c2042e.f24584a;
                int i16 = c2042e.f24585b;
                for (int i17 = 0; i17 < i16; i17++) {
                    D(objArr[i17]);
                }
            }
            int[] iArr = this.f8278b;
            iArr[i14 + 3] = i13;
            B0.d(q10, i12, iArr);
            int b2 = c0032v.b();
            if (z10) {
                i12 = 1;
            }
            this.f8288o = b2 + i12;
            int C2 = C(this.f8278b, i11);
            this.f8295v = C2;
            int n6 = C2 < 0 ? n() : q(C2 + 1);
            int f4 = n6 >= 0 ? f(this.f8278b, n6) : 0;
            this.f8284i = f4;
            this.j = f4;
            return;
        }
        if (i7 != i10) {
            AbstractC0508p.c("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f8278b;
        int i18 = i14 + 3;
        int i19 = iArr2[i18];
        int i20 = iArr2[i15] & 67108863;
        iArr2[i18] = i13;
        B0.d(q10, i12, iArr2);
        int b10 = this.f8289p.b();
        this.f8294u = (m() - this.f8283h) - this.f8290q.b();
        this.f8295v = b10;
        int C10 = C(this.f8278b, i11);
        int b11 = c0032v.b();
        this.f8288o = b11;
        if (C10 == b10) {
            this.f8288o = b11 + (z10 ? 0 : i12 - i20);
            return;
        }
        int i21 = i13 - i19;
        int i22 = z10 ? 0 : i12 - i20;
        if (i21 != 0 || i22 != 0) {
            while (C10 != 0 && C10 != b10 && (i22 != 0 || i21 != 0)) {
                int q11 = q(C10);
                if (i21 != 0) {
                    int[] iArr3 = this.f8278b;
                    int i23 = (q11 * 5) + 3;
                    iArr3[i23] = iArr3[i23] + i21;
                }
                if (i22 != 0) {
                    int[] iArr4 = this.f8278b;
                    B0.d(q11, (iArr4[(q11 * 5) + 1] & 67108863) + i22, iArr4);
                }
                int[] iArr5 = this.f8278b;
                if ((iArr5[(q11 * 5) + 1] & 1073741824) != 0) {
                    i22 = 0;
                }
                C10 = C(iArr5, C10);
            }
        }
        this.f8288o += i22;
    }

    public final void j() {
        if (this.f8287n <= 0) {
            AbstractC0495i0.b("Unbalanced begin/end insert");
        }
        int i7 = this.f8287n - 1;
        this.f8287n = i7;
        if (i7 == 0) {
            if (this.f8291r.f313b != this.f8289p.f313b) {
                AbstractC0508p.c("startGroup/endGroup mismatch while inserting");
            }
            this.f8294u = (m() - this.f8283h) - this.f8290q.b();
        }
    }

    public final void k(int i7) {
        boolean z8 = false;
        if (!(this.f8287n <= 0)) {
            AbstractC0508p.c("Cannot call ensureStarted() while inserting");
        }
        int i10 = this.f8295v;
        if (i10 != i7) {
            if (i7 >= i10 && i7 < this.f8294u) {
                z8 = true;
            }
            if (!z8) {
                AbstractC0508p.c("Started group at " + i7 + " must be a subgroup of the group at " + i10);
            }
            int i11 = this.f8293t;
            int i12 = this.f8284i;
            int i13 = this.j;
            this.f8293t = i7;
            O();
            this.f8293t = i11;
            this.f8284i = i12;
            this.j = i13;
        }
    }

    public final void l(int i7, int i10, int i11) {
        if (i7 >= this.g) {
            i7 = -((n() - i7) + 2);
        }
        while (i11 < i10) {
            this.f8278b[(q(i11) * 5) + 2] = i7;
            int i12 = this.f8278b[(q(i11) * 5) + 3] + i11;
            l(i11, i12, i11 + 1);
            i11 = i12;
        }
    }

    public final int m() {
        return this.f8278b.length / 5;
    }

    public final int n() {
        return m() - this.f8283h;
    }

    public final int o() {
        return this.f8279c.length - this.f8285l;
    }

    public final Object p(int i7) {
        int q10 = q(i7);
        int[] iArr = this.f8278b;
        int i10 = (q10 * 5) + 1;
        if ((iArr[i10] & 268435456) == 0) {
            return C0498k.f8409a;
        }
        return this.f8279c[Integer.bitCount(iArr[i10] >> 29) + f(iArr, q10)];
    }

    public final int q(int i7) {
        return (this.f8283h * (i7 < this.g ? 0 : 1)) + i7;
    }

    public final Object r(int i7) {
        int q10 = q(i7);
        int[] iArr = this.f8278b;
        int i10 = q10 * 5;
        int i11 = iArr[i10 + 1];
        if ((536870912 & i11) == 0) {
            return null;
        }
        return this.f8279c[Integer.bitCount(i11 >> 30) + iArr[i10 + 4]];
    }

    public final int s(int i7) {
        return B0.a(this.f8278b, q(i7));
    }

    public final boolean t(int i7, int i10) {
        int m10;
        int s3;
        if (i10 == this.f8295v) {
            m10 = this.f8294u;
        } else {
            C0032v c0032v = this.f8289p;
            if (i10 > c0032v.a(0)) {
                s3 = s(i10);
            } else {
                int[] iArr = c0032v.f312a;
                int min = Math.min(iArr.length, c0032v.f313b);
                int i11 = 0;
                while (true) {
                    if (i11 >= min) {
                        i11 = -1;
                        break;
                    }
                    if (iArr[i11] == i10) {
                        break;
                    }
                    i11++;
                }
                if (i11 < 0) {
                    s3 = s(i10);
                } else {
                    m10 = (m() - this.f8283h) - this.f8290q.f312a[i11];
                }
            }
            m10 = s3 + i10;
        }
        return i7 > i10 && i7 < m10;
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f8293t + " end=" + this.f8294u + " size = " + n() + " gap=" + this.g + '-' + (this.g + this.f8283h) + ')';
    }

    public final void u(int i7) {
        if (i7 > 0) {
            int i10 = this.f8293t;
            z(i10);
            int i11 = this.g;
            int i12 = this.f8283h;
            int[] iArr = this.f8278b;
            int length = iArr.length / 5;
            int i13 = length - i12;
            if (i12 < i7) {
                int max = Math.max(Math.max(length * 2, i13 + i7), 32);
                int[] iArr2 = new int[max * 5];
                int i14 = max - i13;
                Eb.n.M(0, 0, i11 * 5, iArr, iArr2);
                Eb.n.M((i11 + i14) * 5, (i12 + i11) * 5, length * 5, iArr, iArr2);
                this.f8278b = iArr2;
                i12 = i14;
            }
            int i15 = this.f8294u;
            if (i15 >= i11) {
                this.f8294u = i15 + i7;
            }
            int i16 = i11 + i7;
            this.g = i16;
            this.f8283h = i12 - i7;
            int h10 = h(i13 > 0 ? f(this.f8278b, q(i10 + i7)) : 0, this.f8286m >= i11 ? this.k : 0, this.f8285l, this.f8279c.length);
            for (int i17 = i11; i17 < i16; i17++) {
                this.f8278b[(i17 * 5) + 4] = h10;
            }
            int i18 = this.f8286m;
            if (i18 >= i11) {
                this.f8286m = i18 + i7;
            }
        }
    }

    public final void v(int i7, int i10) {
        if (i7 > 0) {
            A(this.f8284i, i10);
            int i11 = this.k;
            int i12 = this.f8285l;
            if (i12 < i7) {
                Object[] objArr = this.f8279c;
                int length = objArr.length;
                int i13 = length - i12;
                int max = Math.max(Math.max(length * 2, i13 + i7), 32);
                Object[] objArr2 = new Object[max];
                for (int i14 = 0; i14 < max; i14++) {
                    objArr2[i14] = null;
                }
                int i15 = max - i13;
                int i16 = i12 + i11;
                System.arraycopy(objArr, 0, objArr2, 0, i11);
                System.arraycopy(objArr, i16, objArr2, i11 + i15, length - i16);
                this.f8279c = objArr2;
                i12 = i15;
            }
            int i17 = this.j;
            if (i17 >= i11) {
                this.j = i17 + i7;
            }
            this.k = i11 + i7;
            this.f8285l = i12 - i7;
        }
    }

    public final boolean w(int i7) {
        return (this.f8278b[(q(i7) * 5) + 1] & 1073741824) != 0;
    }

    public final void y(z0 z0Var, int i7) {
        if (this.f8287n <= 0) {
            AbstractC0508p.c("Check failed");
        }
        if (i7 == 0 && this.f8293t == 0 && this.f8277a.f8587b == 0) {
            int[] iArr = z0Var.f8586a;
            int i10 = iArr[(i7 * 5) + 3];
            int i11 = z0Var.f8587b;
            if (i10 == i11) {
                int[] iArr2 = this.f8278b;
                Object[] objArr = this.f8279c;
                ArrayList arrayList = this.f8280d;
                HashMap hashMap = this.f8281e;
                C2070x c2070x = this.f8282f;
                Object[] objArr2 = z0Var.f8588c;
                int i12 = z0Var.f8589d;
                HashMap hashMap2 = z0Var.f8595x;
                C2070x c2070x2 = z0Var.f8596y;
                this.f8278b = iArr;
                this.f8279c = objArr2;
                this.f8280d = z0Var.f8594w;
                this.g = i11;
                this.f8283h = (iArr.length / 5) - i11;
                this.k = i12;
                this.f8285l = objArr2.length - i12;
                this.f8286m = i11;
                this.f8281e = hashMap2;
                this.f8282f = c2070x2;
                z0Var.f8586a = iArr2;
                z0Var.f8587b = 0;
                z0Var.f8588c = objArr;
                z0Var.f8589d = 0;
                z0Var.f8594w = arrayList;
                z0Var.f8595x = hashMap;
                z0Var.f8596y = c2070x;
                return;
            }
        }
        C0 y10 = z0Var.y();
        try {
            C0480b.n(y10, i7, this, true, true, false);
            y10.e(true);
        } catch (Throwable th) {
            y10.e(false);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        r2 = r8.f8278b;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        Eb.n.M(r4 + r3, r3, r5, r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        Eb.n.M(r5, r5 + r4, r3 + r4, r2, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(int i7) {
        C0478a c0478a;
        int i10;
        C0478a c0478a2;
        int i11;
        int i12;
        int i13 = this.f8283h;
        int i14 = this.g;
        if (i14 != i7) {
            if (!this.f8280d.isEmpty()) {
                int m10 = m() - this.f8283h;
                if (i14 < i7) {
                    for (int b2 = B0.b(this.f8280d, i14, m10); b2 < this.f8280d.size() && (i11 = (c0478a2 = (C0478a) this.f8280d.get(b2)).f8373a) < 0 && (i12 = i11 + m10) < i7; b2++) {
                        c0478a2.f8373a = i12;
                    }
                } else {
                    for (int b10 = B0.b(this.f8280d, i7, m10); b10 < this.f8280d.size() && (i10 = (c0478a = (C0478a) this.f8280d.get(b10)).f8373a) >= 0; b10++) {
                        c0478a.f8373a = -(m10 - i10);
                    }
                }
            }
            if (i7 < i14) {
                i14 = i7 + i13;
            }
            int m11 = m();
            if (i14 >= m11) {
                AbstractC0508p.c("Check failed");
            }
            while (i14 < m11) {
                int i15 = (i14 * 5) + 2;
                int i16 = this.f8278b[i15];
                int n6 = i16 > -2 ? i16 : (n() + i16) - (-2);
                if (n6 >= i7) {
                    n6 = -((n() - n6) - (-2));
                }
                if (n6 != i16) {
                    this.f8278b[i15] = n6;
                }
                i14++;
                if (i14 == i7) {
                    i14 += i13;
                }
            }
        }
        this.g = i7;
    }
}
