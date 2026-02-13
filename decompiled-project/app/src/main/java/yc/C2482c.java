package yc;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: yc.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2482c extends m1 {

    /* renamed from: l, reason: collision with root package name */
    public C f27727l;

    /* renamed from: m, reason: collision with root package name */
    public C f27728m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f27729n;

    /* renamed from: o, reason: collision with root package name */
    public xc.l f27730o;

    /* renamed from: p, reason: collision with root package name */
    public xc.o f27731p;

    /* renamed from: q, reason: collision with root package name */
    public xc.l f27732q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f27733r;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f27734s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f27735t;

    /* renamed from: u, reason: collision with root package name */
    public N f27736u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f27737v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f27738w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f27739x;

    /* renamed from: y, reason: collision with root package name */
    public final String[] f27740y = {null};

    /* renamed from: z, reason: collision with root package name */
    public static final String[] f27726z = {"applet", "caption", "html", "marquee", "object", "table", "td", "template", "th"};

    /* renamed from: A, reason: collision with root package name */
    public static final String[] f27714A = {"annotation-xml", "mi", "mn", "mo", "ms", "mtext"};

    /* renamed from: B, reason: collision with root package name */
    public static final String[] f27715B = {"desc", "foreignObject", "title"};

    /* renamed from: C, reason: collision with root package name */
    public static final String[] f27716C = {"ol", "ul"};

    /* renamed from: D, reason: collision with root package name */
    public static final String[] f27717D = {"button"};

    /* renamed from: E, reason: collision with root package name */
    public static final String[] f27718E = {"html", "table"};

    /* renamed from: F, reason: collision with root package name */
    public static final String[] f27719F = {"optgroup", "option"};

    /* renamed from: G, reason: collision with root package name */
    public static final String[] f27720G = {"dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc"};

    /* renamed from: H, reason: collision with root package name */
    public static final String[] f27721H = {"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};

    /* renamed from: I, reason: collision with root package name */
    public static final String[] f27722I = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "keygen", "li", "link", "listing", "main", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "search", "section", "select", "source", "style", "summary", "table", "tbody", "td", "template", "textarea", "tfoot", "th", "thead", "title", "tr", "track", "ul", "wbr", "xmp"};

    /* renamed from: J, reason: collision with root package name */
    public static final String[] f27723J = {"annotation-xml", "mi", "mn", "mo", "ms", "mtext"};

    /* renamed from: K, reason: collision with root package name */
    public static final String[] f27724K = {"mi", "mn", "mo", "ms", "mtext"};
    public static final String[] L = {"desc", "foreignObject", "title"};

    /* renamed from: M, reason: collision with root package name */
    public static final String[] f27725M = {"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};

    public static boolean N(xc.l lVar) {
        F f4 = lVar.f26349d;
        String str = f4.f27656a;
        String str2 = f4.f27658c;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2078206768:
                if (str.equals("http://www.w3.org/1999/xhtml")) {
                    c10 = 0;
                    break;
                }
                break;
            case -296110905:
                if (str.equals("http://www.w3.org/2000/svg")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1725132794:
                if (str.equals("http://www.w3.org/1998/Math/MathML")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return wc.l.d(str2, f27722I);
            case 1:
                return wc.l.d(str2, L);
            case 2:
                return wc.l.d(str2, f27723J);
            default:
                return false;
        }
    }

    public static boolean P(ArrayList arrayList, xc.l lVar) {
        int size = arrayList.size();
        int i7 = size - 1;
        int i10 = i7 >= 256 ? size - 257 : 0;
        while (i7 >= i10) {
            if (((xc.l) arrayList.get(i7)) == lVar) {
                return true;
            }
            i7--;
        }
        return false;
    }

    public final xc.l A(String str) {
        int size = this.f27815e.size();
        int i7 = size - 1;
        int i10 = i7 >= 256 ? size - 257 : 0;
        while (i7 >= i10) {
            xc.l lVar = (xc.l) this.f27815e.get(i7);
            F f4 = lVar.f26349d;
            if (f4.f27658c.equals(str) && f4.f27656a.equals("http://www.w3.org/1999/xhtml")) {
                return lVar;
            }
            i7--;
        }
        return null;
    }

    public final boolean B(String str) {
        String[] strArr = f27717D;
        String[] strArr2 = f27726z;
        String[] strArr3 = this.f27740y;
        strArr3[0] = str;
        return E(strArr3, strArr2, strArr);
    }

    public final boolean C(String str) {
        String[] strArr = f27726z;
        String[] strArr2 = this.f27740y;
        strArr2[0] = str;
        return E(strArr2, strArr, null);
    }

    public final boolean D(String str) {
        for (int size = this.f27815e.size() - 1; size >= 0; size--) {
            String str2 = ((xc.l) this.f27815e.get(size)).f26349d.f27658c;
            if (str2.equals(str)) {
                return true;
            }
            if (!wc.l.d(str2, f27719F)) {
                return false;
            }
        }
        throw new IllegalArgumentException("Should not be reachable");
    }

    public final boolean E(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.f27815e.size();
        int i7 = size - 1;
        int i10 = i7 > 100 ? size - 101 : 0;
        while (i7 >= i10) {
            F f4 = ((xc.l) this.f27815e.get(i7)).f26349d;
            String str = f4.f27658c;
            String str2 = f4.f27656a;
            if (str2.equals("http://www.w3.org/1999/xhtml")) {
                if (wc.l.d(str, strArr)) {
                    return true;
                }
                if (wc.l.d(str, strArr2)) {
                    return false;
                }
                if (strArr3 != null && wc.l.d(str, strArr3)) {
                    return false;
                }
            } else if (strArr2 != f27726z) {
                continue;
            } else {
                if (str2.equals("http://www.w3.org/1998/Math/MathML") && wc.l.d(str, f27714A)) {
                    return false;
                }
                if (str2.equals("http://www.w3.org/2000/svg") && wc.l.d(str, f27715B)) {
                    return false;
                }
            }
            i7--;
        }
        return false;
    }

    public final boolean F(String str) {
        String[] strArr = f27718E;
        String[] strArr2 = this.f27740y;
        strArr2[0] = str;
        return E(strArr2, strArr, null);
    }

    public final void G(J j) {
        H(j, b());
    }

    public final void H(J j, xc.l lVar) {
        String L10 = j.f27664d.L();
        lVar.Z(j instanceof I ? new xc.p(L10) : lVar.f26349d.b(256) ? new xc.p(L10) : new xc.p(L10));
    }

    public final void I(K k) {
        b().Z(new xc.p(k.f27665d.L()));
    }

    public final xc.l J(O o10) {
        xc.l v10 = v(o10, "http://www.w3.org/1999/xhtml", false);
        w(v10);
        if (o10.f27672f) {
            F f4 = v10.f26349d;
            f4.f27659d |= 32;
            if (f4.d() && (f4.c() || f4.e())) {
                this.f27813c.o(l1.f27773a);
                U u3 = this.f27813c;
                N n6 = this.f27736u;
                n6.g();
                n6.k(f4.f27657b);
                u3.h(n6);
            } else {
                U u10 = this.f27813c;
                Object[] objArr = {f4.f27658c};
                xc.k kVar = u10.f27683b;
                if (kVar.b()) {
                    kVar.add(new T4.u(u10.f27682a, "Tag [%s] cannot be self-closing; not a void tag", objArr));
                }
            }
        }
        return v10;
    }

    public final xc.l K(O o10) {
        xc.l v10 = v(o10, "http://www.w3.org/1999/xhtml", false);
        w(v10);
        j();
        return v10;
    }

    public final void L(O o10, String str) {
        xc.l v10 = v(o10, str, true);
        w(v10);
        if (o10.f27672f) {
            v10.f26349d.f27659d |= 32;
            j();
        }
    }

    public final void M(O o10, boolean z8, boolean z10) {
        xc.o oVar = (xc.o) v(o10, "http://www.w3.org/1999/xhtml", false);
        if (!z10) {
            this.f27731p = oVar;
        } else if (!O("template")) {
            this.f27731p = oVar;
        }
        w(oVar);
        if (z8) {
            return;
        }
        j();
    }

    public final boolean O(String str) {
        return A(str) != null;
    }

    public final boolean Q(String[] strArr) {
        int size = this.f27815e.size();
        int i7 = size - 1;
        int i10 = i7 > 100 ? size - 101 : 0;
        while (i7 >= i10) {
            if (!wc.l.d(((xc.l) this.f27815e.get(i7)).f26349d.f27658c, strArr)) {
                return true;
            }
            i7--;
        }
        return false;
    }

    public final void R(String str) {
        for (int size = this.f27815e.size() - 1; size >= 0; size--) {
            F f4 = j().f26349d;
            if (f4.f27658c.equals(str) && f4.f27656a.equals("http://www.w3.org/1999/xhtml")) {
                return;
            }
        }
    }

    public final void S() {
        if (this.f27734s.size() > 0) {
        }
    }

    public final void T(C c10) {
        this.f27734s.add(c10);
    }

    public final void U() {
        if (this.f27815e.size() > 256) {
            return;
        }
        boolean z8 = true;
        xc.l lVar = this.f27733r.size() > 0 ? (xc.l) h3.o.k(1, this.f27733r) : null;
        if (lVar == null || P(this.f27815e, lVar)) {
            return;
        }
        int size = this.f27733r.size();
        int i7 = size - 12;
        if (i7 < 0) {
            i7 = 0;
        }
        int i10 = size - 1;
        int i11 = i10;
        while (i11 != i7) {
            i11--;
            lVar = (xc.l) this.f27733r.get(i11);
            if (lVar == null || P(this.f27815e, lVar)) {
                z8 = false;
                break;
            }
        }
        while (true) {
            if (!z8) {
                i11++;
                lVar = (xc.l) this.f27733r.get(i11);
            }
            vc.i.D(lVar);
            xc.l lVar2 = new xc.l(this.f27818i.d(lVar.N(), lVar.f26349d.f27658c, "http://www.w3.org/1999/xhtml", this.f27817h.f27649a), null, lVar.y().clone());
            w(lVar2);
            this.f27733r.set(i11, lVar2);
            if (i11 == i10) {
                return;
            } else {
                z8 = false;
            }
        }
    }

    public final void V(xc.l lVar) {
        for (int size = this.f27733r.size() - 1; size >= 0; size--) {
            if (((xc.l) this.f27733r.get(size)) == lVar) {
                this.f27733r.remove(size);
                return;
            }
        }
    }

    public final void W(xc.l lVar) {
        for (int size = this.f27815e.size() - 1; size >= 0; size--) {
            if (((xc.l) this.f27815e.get(size)) == lVar) {
                this.f27815e.remove(size);
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0110. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0150 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X() {
        char c10;
        int size = this.f27815e.size();
        int i7 = size - 1;
        int i10 = i7 >= 256 ? size - 257 : 0;
        C c11 = this.f27727l;
        if (this.f27815e.size() == 0) {
            this.f27727l = C.f27641u;
        }
        boolean z8 = false;
        while (true) {
            if (i7 >= i10) {
                xc.l lVar = (xc.l) this.f27815e.get(i7);
                if (i7 == i10) {
                    if (this.f27739x) {
                        lVar = this.f27732q;
                    }
                    z8 = true;
                }
                String str = lVar != null ? lVar.f26349d.f27658c : "";
                if ("http://www.w3.org/1999/xhtml".equals(lVar.f26349d.f27656a)) {
                    str.getClass();
                    switch (str.hashCode()) {
                        case -1644953643:
                            if (str.equals("frameset")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case -1321546630:
                            if (str.equals("template")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case -906021636:
                            if (str.equals("select")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case -636197633:
                            if (str.equals("colgroup")) {
                                c10 = 3;
                                break;
                            }
                            break;
                        case 3696:
                            if (str.equals("td")) {
                                c10 = 4;
                                break;
                            }
                            break;
                        case 3700:
                            if (str.equals("th")) {
                                c10 = 5;
                                break;
                            }
                            break;
                        case 3710:
                            if (str.equals("tr")) {
                                c10 = 6;
                                break;
                            }
                            break;
                        case 3029410:
                            if (str.equals("body")) {
                                c10 = 7;
                                break;
                            }
                            break;
                        case 3198432:
                            if (str.equals("head")) {
                                c10 = '\b';
                                break;
                            }
                            break;
                        case 3213227:
                            if (str.equals("html")) {
                                c10 = '\t';
                                break;
                            }
                            break;
                        case 110115790:
                            if (str.equals("table")) {
                                c10 = '\n';
                                break;
                            }
                            break;
                        case 110157846:
                            if (str.equals("tbody")) {
                                c10 = 11;
                                break;
                            }
                            break;
                        case 110277346:
                            if (str.equals("tfoot")) {
                                c10 = '\f';
                                break;
                            }
                            break;
                        case 110326868:
                            if (str.equals("thead")) {
                                c10 = '\r';
                                break;
                            }
                            break;
                        case 552573414:
                            if (str.equals("caption")) {
                                c10 = 14;
                                break;
                            }
                            break;
                    }
                    c10 = 65535;
                    switch (c10) {
                        case 0:
                            this.f27727l = C.f27629H;
                            break;
                        case 1:
                            C c12 = this.f27734s.size() > 0 ? (C) h3.o.k(1, this.f27734s) : null;
                            if (c12 == null) {
                                throw new IllegalArgumentException("Bug: no template insertion mode on stack!");
                            }
                            this.f27727l = c12;
                            break;
                        case 2:
                            this.f27727l = C.f27625D;
                            break;
                        case 3:
                            this.f27727l = C.f27646z;
                            break;
                        case 4:
                        case 5:
                            if (!z8) {
                                this.f27727l = C.f27624C;
                                break;
                            }
                            if (!z8) {
                                break;
                            } else {
                                this.f27727l = C.f27641u;
                                break;
                            }
                        case 6:
                            this.f27727l = C.f27623B;
                            break;
                        case 7:
                            this.f27727l = C.f27641u;
                            break;
                        case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                            if (!z8) {
                                this.f27727l = C.f27638d;
                                break;
                            }
                            if (!z8) {
                            }
                            break;
                        case '\t':
                            this.f27727l = this.f27730o == null ? C.f27637c : C.f27640f;
                            break;
                        case '\n':
                            this.f27727l = C.f27643w;
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 11 */:
                        case '\f':
                        case '\r':
                            this.f27727l = C.f27622A;
                            break;
                        case 14:
                            this.f27727l = C.f27645y;
                            break;
                        default:
                            if (!z8) {
                            }
                            break;
                    }
                }
                i7--;
            }
        }
        return this.f27727l != c11;
    }

    @Override // yc.m1
    public final List a() {
        List list;
        xc.l lVar = this.f27732q;
        if (lVar == null) {
            return this.f27814d.D();
        }
        xc.l lVar2 = lVar.f26368a;
        if (lVar2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList = (ArrayList) lVar2.G();
            ArrayList arrayList2 = new ArrayList(arrayList.size() - 1);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                xc.q qVar = (xc.q) it.next();
                if (qVar != lVar) {
                    arrayList2.add(qVar);
                }
            }
            list = arrayList2;
        }
        if (!list.isEmpty()) {
            xc.l lVar3 = this.f27732q;
            lVar3.getClass();
            int size = lVar3.f26350e.size();
            vc.i.x("Insert position out of bounds.", size >= 0);
            lVar3.i(size, (xc.q[]) new ArrayList(list).toArray(new xc.q[0]));
        }
        return this.f27732q.D();
    }

    @Override // yc.m1
    public final D e() {
        return D.f27647c;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [yc.N, yc.P] */
    @Override // yc.m1
    public final void g(Reader reader, String str, E e2) {
        super.g(reader, str, e2);
        this.f27727l = C.f27635a;
        this.f27728m = null;
        this.f27729n = false;
        this.f27730o = null;
        this.f27731p = null;
        this.f27732q = null;
        this.f27733r = new ArrayList();
        this.f27734s = new ArrayList();
        this.f27735t = new ArrayList();
        this.f27736u = new P(3, this);
        this.f27737v = true;
        this.f27738w = false;
        this.f27739x = false;
    }

    @Override // yc.m1
    public final void h() {
        this.f27727l = C.f27635a;
        this.f27739x = true;
    }

    @Override // yc.m1
    public final m1 i() {
        return new C2482c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if ("malignmark".equals(r4.f27671e) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        if (r9.a() != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a2, code lost:
    
        if (r0.equals("application/xhtml+xml") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c1, code lost:
    
        if (r9.a() == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b5, code lost:
    
        if (wc.l.c(r3.f27657b, yc.C2482c.L) != false) goto L44;
     */
    @Override // yc.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(S s3) {
        boolean z8 = true;
        if (!this.f27815e.isEmpty()) {
            xc.l b2 = b();
            String str = b2.f26349d.f27656a;
            if (!"http://www.w3.org/1999/xhtml".equals(str)) {
                F f4 = b2.f26349d;
                if ("http://www.w3.org/1998/Math/MathML".equals(f4.f27656a)) {
                    if (wc.l.d(f4.f27658c, f27724K)) {
                        if (s3.f()) {
                            O o10 = (O) s3;
                            if (!"mglyph".equals(o10.f27671e)) {
                            }
                        }
                    }
                }
                if (!"http://www.w3.org/1998/Math/MathML".equals(str) || !b2.K("annotation-xml") || !s3.f() || !"svg".equals(((O) s3).f27671e)) {
                    String str2 = f4.f27656a;
                    if ("http://www.w3.org/1998/Math/MathML".equals(str2) && b2.K("annotation-xml")) {
                        String d10 = wc.c.d(b2.o("encoding"));
                        if (!d10.equals("text/html")) {
                        }
                        if (!s3.f()) {
                        }
                    }
                    if ("http://www.w3.org/2000/svg".equals(str2)) {
                    }
                    z8 = s3.d();
                }
            }
        }
        return (z8 ? this.f27727l : C.L).f(s3, this);
    }

    public final xc.l p(xc.l lVar) {
        for (int size = this.f27815e.size() - 1; size >= 0; size--) {
            if (((xc.l) this.f27815e.get(size)) == lVar) {
                return (xc.l) this.f27815e.get(size - 1);
            }
        }
        return null;
    }

    public final void q(xc.l lVar) {
        int size = this.f27733r.size();
        int i7 = size - 13;
        int i10 = 0;
        if (i7 < 0) {
            i7 = 0;
        }
        for (int i11 = size - 1; i11 >= i7; i11--) {
            xc.l lVar2 = (xc.l) this.f27733r.get(i11);
            if (lVar2 == null) {
                return;
            }
            if (lVar.f26349d.f27658c.equals(lVar2.f26349d.f27658c) && lVar.y().equals(lVar2.y())) {
                i10++;
            }
            if (i10 == 3) {
                this.f27733r.remove(i11);
                return;
            }
        }
    }

    public final void r() {
        while (!this.f27733r.isEmpty()) {
            int size = this.f27733r.size();
            if ((size > 0 ? (xc.l) this.f27733r.remove(size - 1) : null) == null) {
                return;
            }
        }
    }

    public final void s(String... strArr) {
        for (int size = this.f27815e.size() - 1; size >= 0; size--) {
            xc.l lVar = (xc.l) this.f27815e.get(size);
            if ("http://www.w3.org/1999/xhtml".equals(lVar.f26349d.f27656a) && (wc.l.c(lVar.f26349d.f27658c, strArr) || lVar.K("html"))) {
                return;
            }
            j();
        }
    }

    public final void t() {
        s("table", "template");
    }

    public final String toString() {
        return "TreeBuilder{currentToken=" + this.g + ", state=" + this.f27727l + ", currentElement=" + b() + '}';
    }

    public final void u() {
        s("tr", "template");
    }

    public final xc.l v(O o10, String str, boolean z8) {
        xc.b bVar = o10.g;
        if (!z8) {
            this.f27817h.a(bVar);
        }
        if (bVar != null && bVar.f26332a != 0 && bVar.y(this.f27817h) > 0) {
            Object[] objArr = {o10.f27671e};
            xc.k kVar = this.f27811a.f27652b;
            if (kVar.b()) {
                kVar.add(new T4.u(this.f27812b, "Dropped duplicate attribute(s) in tag [%s]", objArr));
            }
        }
        F d10 = this.f27818i.d(o10.f27670d.L(), o10.f27671e, str, (z8 ? D.f27648d : this.f27817h).f27649a);
        return d10.f27658c.equals("form") ? new xc.o(d10, bVar) : new xc.l(d10, null, bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(xc.l lVar) {
        xc.l lVar2;
        boolean z8;
        if (this.f27731p != null && lVar.f26349d.f27656a.equals("http://www.w3.org/1999/xhtml") && wc.l.d(lVar.f26349d.f27658c, f27725M)) {
            this.f27731p.f26365x.add(lVar);
        }
        if (this.f27811a.f27652b.b() && lVar.I("xmlns")) {
            String o10 = lVar.o("xmlns");
            F f4 = lVar.f26349d;
            if (!o10.equals(f4.f27656a)) {
                Object[] objArr = {lVar.o("xmlns"), f4.f27657b};
                xc.k kVar = this.f27811a.f27652b;
                if (kVar.b()) {
                    kVar.add(new T4.u(this.f27812b, "Invalid xmlns attribute [%s] on tag [%s]", objArr));
                }
            }
        }
        if (this.f27738w && wc.l.d(b().f26349d.f27658c, B.f27621z)) {
            xc.l A10 = A("table");
            if (A10 != null) {
                lVar2 = A10.f26368a;
                if (lVar2 != null) {
                    z8 = true;
                    if (z8) {
                        lVar2.Z(lVar);
                    } else {
                        vc.i.D(A10);
                        vc.i.D(A10.f26368a);
                        xc.l lVar3 = lVar.f26368a;
                        if (lVar3 == A10.f26368a && lVar3 != null) {
                            lVar3.W(lVar);
                        }
                        A10.f26368a.i(A10.f26369b, lVar);
                    }
                } else {
                    lVar2 = p(A10);
                }
            } else {
                lVar2 = (xc.l) this.f27815e.get(0);
            }
            z8 = false;
            if (z8) {
            }
        } else {
            b().Z(lVar);
        }
        this.f27815e.add(lVar);
    }

    public final void x(C c10) {
        if (this.f27811a.f27652b.b()) {
            this.f27811a.f27652b.add(new T4.u(this.f27812b, "Unexpected %s token [%s] when in state [%s]", new Object[]{this.g.getClass().getSimpleName(), this.g, c10}));
        }
    }

    public final void y(String str) {
        while (wc.l.d(b().f26349d.f27658c, f27720G)) {
            if (str != null && c(str)) {
                return;
            } else {
                j();
            }
        }
    }

    public final void z(boolean z8) {
        String[] strArr = z8 ? f27721H : f27720G;
        while ("http://www.w3.org/1999/xhtml".equals(b().f26349d.f27656a) && wc.l.d(b().f26349d.f27658c, strArr)) {
            j();
        }
    }
}
