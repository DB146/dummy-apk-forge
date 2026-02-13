package yc;

import ea.C1111f;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class U {

    /* renamed from: u, reason: collision with root package name */
    public static final char[] f27680u;

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f27681v = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};

    /* renamed from: a, reason: collision with root package name */
    public final C2480b f27682a;

    /* renamed from: b, reason: collision with root package name */
    public final xc.k f27683b;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final O f27688h;

    /* renamed from: i, reason: collision with root package name */
    public final N f27689i;
    public P j;

    /* renamed from: n, reason: collision with root package name */
    public final Q f27692n;

    /* renamed from: o, reason: collision with root package name */
    public String f27693o;

    /* renamed from: p, reason: collision with root package name */
    public String f27694p;

    /* renamed from: q, reason: collision with root package name */
    public int f27695q;

    /* renamed from: c, reason: collision with root package name */
    public l1 f27684c = l1.f27773a;

    /* renamed from: d, reason: collision with root package name */
    public S f27685d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f27686e = false;

    /* renamed from: f, reason: collision with root package name */
    public final C1111f f27687f = new C1111f(19);
    public final J k = new J();

    /* renamed from: l, reason: collision with root package name */
    public final L f27690l = new L();

    /* renamed from: m, reason: collision with root package name */
    public final K f27691m = new K();

    /* renamed from: r, reason: collision with root package name */
    public int f27696r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f27697s = new int[1];

    /* renamed from: t, reason: collision with root package name */
    public final int[] f27698t = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f27680u = cArr;
        Arrays.sort(cArr);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [yc.N, yc.P] */
    /* JADX WARN: Type inference failed for: r1v7, types: [yc.P, yc.Q] */
    /* JADX WARN: Type inference failed for: r2v5, types: [yc.O, yc.P] */
    public U(m1 m1Var) {
        this.g = m1Var instanceof n1 ? 2 : 1;
        ?? p10 = new P(2, m1Var);
        this.f27688h = p10;
        this.j = p10;
        this.f27689i = new P(3, m1Var);
        ?? p11 = new P(6, m1Var);
        p11.k = true;
        this.f27692n = p11;
        this.f27682a = m1Var.f27812b;
        this.f27683b = m1Var.f27811a.f27652b;
    }

    public final void a(l1 l1Var) {
        o(l1Var);
        this.f27682a.l();
    }

    public final void b(String str, Object... objArr) {
        xc.k kVar = this.f27683b;
        if (kVar.b()) {
            kVar.add(new T4.u(this.f27682a, String.format("Invalid character reference: ".concat(str), objArr)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x01d8, code lost:
    
        if (r3.d0('=', '-', '_') == false) goto L116;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] c(Character ch, boolean z8) {
        char c10;
        int i7;
        C2480b c2480b = this.f27682a;
        if (c2480b.Y()) {
            return null;
        }
        if (ch != null && ch.charValue() == c2480b.X()) {
            return null;
        }
        char[] cArr = f27680u;
        c2480b.n();
        if (!c2480b.Y() && Arrays.binarySearch(cArr, c2480b.f27704c[c2480b.f27705d]) >= 0) {
            return null;
        }
        if (c2480b.f27706e - c2480b.f27705d < 1024) {
            c2480b.f27707f = 0;
        }
        c2480b.n();
        c2480b.f27709v = c2480b.f27705d;
        boolean a02 = c2480b.a0("#");
        String str = "";
        int[] iArr = this.f27697s;
        if (a02) {
            boolean b02 = c2480b.b0("X");
            if (b02) {
                c2480b.n();
                int i10 = c2480b.f27705d;
                int i11 = c2480b.f27706e;
                char[] cArr2 = c2480b.f27704c;
                int i12 = i10;
                while (i12 < i11 && wc.l.h(cArr2[i12])) {
                    i12++;
                }
                c2480b.f27705d = i12;
                if (i12 > i10) {
                    str = C2480b.F(c2480b.f27704c, c2480b.f27702a, i10, i12 - i10);
                }
            } else {
                c2480b.n();
                int i13 = c2480b.f27705d;
                int i14 = c2480b.f27706e;
                char[] cArr3 = c2480b.f27704c;
                int i15 = i13;
                while (i15 < i14) {
                    char c11 = cArr3[i15];
                    if (c11 < '0' || c11 > '9') {
                        break;
                    }
                    i15++;
                }
                c2480b.f27705d = i15;
                if (i15 > i13) {
                    str = C2480b.F(c2480b.f27704c, c2480b.f27702a, i13, i15 - i13);
                }
            }
            if (str.isEmpty()) {
                b("numeric reference with no numerals", new Object[0]);
                c2480b.j0();
                return null;
            }
            c2480b.f27709v = -1;
            if (!c2480b.a0(";")) {
                b("missing semicolon on [&#%s]", str);
            }
            try {
                i7 = Integer.valueOf(str, b02 ? 16 : 10).intValue();
            } catch (NumberFormatException unused) {
                i7 = -1;
            }
            if (i7 == -1 || i7 > 1114111) {
                b("character [%s] outside of valid range", Integer.valueOf(i7));
                iArr[0] = 65533;
            } else {
                if (i7 >= 128 && i7 < 160) {
                    b("character [%s] is not a valid unicode code point", Integer.valueOf(i7));
                    i7 = f27681v[i7 - 128];
                }
                iArr[0] = i7;
            }
            return iArr;
        }
        c2480b.n();
        int i16 = c2480b.f27705d;
        while (true) {
            int i17 = c2480b.f27705d;
            if (i17 >= c2480b.f27706e || !wc.l.e(c2480b.f27704c[i17])) {
                break;
            }
            c2480b.f27705d++;
        }
        while (true) {
            int i18 = c2480b.f27705d;
            if (i18 < c2480b.f27706e && wc.l.g(c2480b.f27704c[i18])) {
                c2480b.f27705d++;
            }
        }
        String F10 = C2480b.F(c2480b.f27704c, c2480b.f27702a, i16, c2480b.f27705d - i16);
        boolean c02 = c2480b.c0(';');
        char[] cArr4 = xc.n.f26360a;
        xc.m mVar = xc.m.f26353f;
        int binarySearch = Arrays.binarySearch(mVar.f26356a, F10);
        if ((binarySearch >= 0 ? mVar.f26357b[binarySearch] : -1) == -1) {
            xc.m mVar2 = xc.m.f26354u;
            int binarySearch2 = Arrays.binarySearch(mVar2.f26356a, F10);
            if ((binarySearch2 >= 0 ? mVar2.f26357b[binarySearch2] : -1) == -1 || !c02) {
                c2480b.j0();
                if (c02) {
                    b("invalid named reference [%s]", F10);
                }
                if (z8) {
                    return null;
                }
                Iterator it = xc.n.f26362c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str2 = (String) it.next();
                    if (F10.startsWith(str2)) {
                        str = str2;
                        break;
                    }
                }
                if (str.isEmpty()) {
                    return null;
                }
                c2480b.a0(str);
                F10 = str;
            }
        }
        if (z8) {
            if (!c2480b.e0()) {
                if (!(c2480b.Y() ? false : wc.l.g(c2480b.f27704c[c2480b.f27705d]))) {
                }
            }
            c2480b.j0();
            return null;
        }
        c2480b.f27709v = -1;
        if (!c2480b.a0(";")) {
            b("missing semicolon on [&%s]", F10);
        }
        String str3 = (String) xc.n.f26361b.get(F10);
        int[] iArr2 = this.f27698t;
        if (str3 != null) {
            iArr2[0] = str3.codePointAt(0);
            iArr2[1] = str3.codePointAt(1);
            c10 = 2;
        } else {
            xc.m mVar3 = xc.m.f26354u;
            int binarySearch3 = Arrays.binarySearch(mVar3.f26356a, F10);
            int i19 = binarySearch3 >= 0 ? mVar3.f26357b[binarySearch3] : -1;
            if (i19 != -1) {
                iArr2[0] = i19;
                c10 = 1;
            } else {
                c10 = 0;
            }
        }
        if (c10 == 1) {
            iArr[0] = iArr2[0];
            return iArr;
        }
        if (c10 == 2) {
            return iArr2;
        }
        throw new IllegalArgumentException("Unexpected characters returned for ".concat(F10));
    }

    public final P d(boolean z8) {
        P p10;
        if (z8) {
            p10 = this.f27688h;
            p10.g();
        } else {
            p10 = this.f27689i;
            p10.g();
        }
        this.j = p10;
        return p10;
    }

    public final void e() {
        this.f27687f.z();
    }

    public final void f(char c10) {
        J j = this.k;
        j.f27664d.h(c10);
        j.f27676b = this.f27696r;
        j.f27677c = this.f27682a.h0();
    }

    public final void g(String str) {
        J j = this.k;
        j.f27664d.i(str);
        j.f27676b = this.f27696r;
        j.f27677c = this.f27682a.h0();
    }

    public final void h(S s3) {
        if (this.f27686e) {
            throw new IllegalArgumentException("Must be false");
        }
        this.f27685d = s3;
        this.f27686e = true;
        s3.f27676b = this.f27695q;
        C2480b c2480b = this.f27682a;
        s3.f27677c = c2480b.h0();
        this.f27696r = c2480b.h0();
        int i7 = s3.f27675a;
        if (i7 == 2) {
            this.f27693o = ((O) s3).f27670d.L();
            this.f27694p = null;
        } else if (i7 == 3) {
            N n6 = (N) s3;
            if (n6.g != null) {
                Object[] objArr = {n6.m()};
                xc.k kVar = this.f27683b;
                if (kVar.b()) {
                    kVar.add(new T4.u(c2480b, "Attributes incorrectly present on end tag [/%s]", objArr));
                }
            }
        }
    }

    public final void i() {
        h(this.f27691m);
    }

    public final void j() {
        h(this.f27690l);
    }

    public final void k() {
        P p10 = this.j;
        if (p10.f27673h.t()) {
            p10.l();
        }
        h(this.j);
    }

    public final void l(l1 l1Var) {
        xc.k kVar = this.f27683b;
        if (kVar.b()) {
            kVar.add(new T4.u(this.f27682a, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{l1Var}));
        }
    }

    public final void m(l1 l1Var) {
        xc.k kVar = this.f27683b;
        if (kVar.b()) {
            C2480b c2480b = this.f27682a;
            kVar.add(new T4.u(c2480b, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(c2480b.X()), l1Var}));
        }
    }

    public final boolean n() {
        return this.f27693o != null && this.j.f27670d.L().equalsIgnoreCase(this.f27693o);
    }

    public final void o(l1 l1Var) {
        if (l1Var == l1.f27801v) {
            this.f27695q = this.f27682a.h0();
        }
        this.f27684c = l1Var;
    }
}
