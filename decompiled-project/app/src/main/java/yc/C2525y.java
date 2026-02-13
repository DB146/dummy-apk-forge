package yc;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.utils.blurry.BlurFactor;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: yc.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum C2525y extends C {
    public C2525y() {
        super("InBody", 6);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:330:0x0811. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:43:0x01a1. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:156:0x024a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0b6c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x025c  */
    @Override // yc.C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(S s3, C2482c c2482c) {
        char c10;
        boolean z8;
        xc.l lVar;
        xc.l lVar2;
        String str;
        char c11;
        char c12;
        xc.l lVar3;
        xc.l lVar4;
        int i7;
        int i10;
        int b2 = P.c.b(s3.f27675a);
        if (b2 == 0) {
            c2482c.x(this);
            return false;
        }
        C2519v c2519v = C.f27638d;
        String[] strArr = B.f27606i;
        String[] strArr2 = B.f27607l;
        if (b2 == 1) {
            O o10 = (O) s3;
            String m10 = o10.m();
            m10.getClass();
            String[] strArr3 = B.j;
            A a9 = C.f27643w;
            switch (m10.hashCode()) {
                case -1644953643:
                    if (m10.equals("frameset")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1377687758:
                    if (m10.equals("button")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1191214428:
                    if (m10.equals("iframe")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1134665583:
                    if (m10.equals("keygen")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1010136971:
                    if (m10.equals("option")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1003243718:
                    if (m10.equals("textarea")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -906021636:
                    if (m10.equals("select")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -891985998:
                    if (m10.equals("strike")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -891980137:
                    if (m10.equals("strong")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -80773204:
                    if (m10.equals("optgroup")) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 97:
                    if (m10.equals("a")) {
                        c10 = '\n';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 98:
                    if (m10.equals("b")) {
                        c10 = 11;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 105:
                    if (m10.equals("i")) {
                        c10 = '\f';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 115:
                    if (m10.equals("s")) {
                        c10 = '\r';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 117:
                    if (m10.equals("u")) {
                        c10 = 14;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3152:
                    if (m10.equals("br")) {
                        c10 = 15;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3200:
                    if (m10.equals("dd")) {
                        c10 = 16;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3216:
                    if (m10.equals("dt")) {
                        c10 = 17;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3240:
                    if (m10.equals("em")) {
                        c10 = 18;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3273:
                    if (m10.equals("h1")) {
                        c10 = 19;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3274:
                    if (m10.equals("h2")) {
                        c10 = 20;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3275:
                    if (m10.equals("h3")) {
                        c10 = 21;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3276:
                    if (m10.equals("h4")) {
                        c10 = 22;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3277:
                    if (m10.equals("h5")) {
                        c10 = 23;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3278:
                    if (m10.equals("h6")) {
                        c10 = 24;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3338:
                    if (m10.equals("hr")) {
                        c10 = 25;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3453:
                    if (m10.equals("li")) {
                        c10 = 26;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3632:
                    if (m10.equals("rb")) {
                        c10 = 27;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3646:
                    if (m10.equals("rp")) {
                        c10 = 28;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3650:
                    if (m10.equals("rt")) {
                        c10 = 29;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3712:
                    if (m10.equals("tt")) {
                        c10 = 30;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 97536:
                    if (m10.equals("big")) {
                        c10 = 31;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 104387:
                    if (m10.equals("img")) {
                        c10 = ' ';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 111267:
                    if (m10.equals("pre")) {
                        c10 = '!';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 113249:
                    if (m10.equals("rtc")) {
                        c10 = '\"';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 114276:
                    if (m10.equals("svg")) {
                        c10 = '#';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 117511:
                    if (m10.equals("wbr")) {
                        c10 = '$';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 118811:
                    if (m10.equals("xmp")) {
                        c10 = '%';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3002509:
                    if (m10.equals("area")) {
                        c10 = '&';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3029410:
                    if (m10.equals("body")) {
                        c10 = '\'';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3059181:
                    if (m10.equals("code")) {
                        c10 = '(';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3148879:
                    if (m10.equals("font")) {
                        c10 = ')';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3148996:
                    if (m10.equals("form")) {
                        c10 = '*';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3213227:
                    if (m10.equals("html")) {
                        c10 = '+';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3344136:
                    if (m10.equals("math")) {
                        c10 = ',';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3386833:
                    if (m10.equals("nobr")) {
                        c10 = '-';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3536714:
                    if (m10.equals("span")) {
                        c10 = '.';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 96620249:
                    if (m10.equals("embed")) {
                        c10 = '/';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 100313435:
                    if (m10.equals("image")) {
                        c10 = '0';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 100358090:
                    if (m10.equals("input")) {
                        c10 = '1';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109548807:
                    if (m10.equals("small")) {
                        c10 = '2';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 110115790:
                    if (m10.equals("table")) {
                        c10 = '3';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 181975684:
                    if (m10.equals("listing")) {
                        c10 = '4';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1973234167:
                    if (m10.equals("plaintext")) {
                        c10 = '5';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2115613112:
                    if (m10.equals("noembed")) {
                        c10 = '6';
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    c2482c.x(this);
                    ArrayList arrayList = c2482c.f27815e;
                    if (arrayList.size() != 1 && ((arrayList.size() <= 2 || ((xc.l) arrayList.get(1)).K("body")) && c2482c.f27737v)) {
                        xc.l lVar5 = (xc.l) arrayList.get(1);
                        xc.l lVar6 = lVar5.f26368a;
                        if (lVar6 != null && lVar6 != null) {
                            lVar6.W(lVar5);
                        }
                        while (true) {
                            z8 = true;
                            if (arrayList.size() <= 1) {
                                c2482c.J(o10);
                                c2482c.f27727l = C.f27629H;
                                return z8;
                            }
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                    return false;
                case 1:
                    if (c2482c.B("button")) {
                        c2482c.x(this);
                        c2482c.l("button");
                        c2482c.k(o10);
                    } else {
                        c2482c.U();
                        c2482c.J(o10);
                        c2482c.f27737v = false;
                    }
                    z8 = true;
                    return z8;
                case 2:
                    c2482c.f27737v = false;
                    C.b(o10, c2482c, c2482c.o(o10).g());
                    z8 = true;
                    return z8;
                case 3:
                case 15:
                case ' ':
                case '$':
                case '&':
                case '/':
                    c2482c.U();
                    c2482c.K(o10);
                    c2482c.f27737v = false;
                    z8 = true;
                    return z8;
                case 4:
                case '\t':
                    if (c2482c.c("option")) {
                        c2482c.l("option");
                    }
                    c2482c.U();
                    c2482c.J(o10);
                    z8 = true;
                    return z8;
                case 5:
                    c2482c.f27737v = false;
                    C.b(o10, c2482c, c2482c.o(o10).g());
                    z8 = true;
                    return z8;
                case 6:
                    c2482c.U();
                    c2482c.J(o10);
                    c2482c.f27737v = false;
                    if (!o10.f27672f) {
                        C c13 = c2482c.f27727l;
                        if (c13.equals(a9) || c13.equals(C.f27645y) || c13.equals(C.f27622A) || c13.equals(C.f27623B) || c13.equals(C.f27624C)) {
                            c2482c.f27727l = C.f27626E;
                        } else {
                            c2482c.f27727l = C.f27625D;
                        }
                    }
                    z8 = true;
                    return z8;
                case 7:
                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                case '\f':
                case '\r':
                case 14:
                case 18:
                case 30:
                case 31:
                case '(':
                case ')':
                case '2':
                    c2482c.U();
                    xc.l J10 = c2482c.J(o10);
                    c2482c.q(J10);
                    c2482c.f27733r.add(J10);
                    z8 = true;
                    return z8;
                case '\n':
                    for (int size = c2482c.f27733r.size() - 1; size >= 0 && (lVar2 = (xc.l) c2482c.f27733r.get(size)) != null; size--) {
                        if (lVar2.K("a")) {
                            lVar = lVar2;
                            if (lVar != null) {
                                c2482c.x(this);
                                c2482c.l("a");
                                xc.l A10 = c2482c.A("a");
                                if (A10 != null) {
                                    c2482c.V(A10);
                                    c2482c.W(A10);
                                }
                            }
                            c2482c.U();
                            xc.l J11 = c2482c.J(o10);
                            c2482c.q(J11);
                            c2482c.f27733r.add(J11);
                            z8 = true;
                            return z8;
                        }
                    }
                    lVar = null;
                    if (lVar != null) {
                    }
                    c2482c.U();
                    xc.l J112 = c2482c.J(o10);
                    c2482c.q(J112);
                    c2482c.f27733r.add(J112);
                    z8 = true;
                    return z8;
                case 16:
                case 17:
                    c2482c.f27737v = false;
                    ArrayList arrayList2 = c2482c.f27815e;
                    int size2 = arrayList2.size();
                    int i11 = size2 - 1;
                    int i12 = i11 >= 24 ? size2 - 25 : 0;
                    while (true) {
                        if (i11 >= i12) {
                            xc.l lVar7 = (xc.l) arrayList2.get(i11);
                            boolean d10 = wc.l.d(lVar7.f26349d.f27658c, B.k);
                            F f4 = lVar7.f26349d;
                            if (d10) {
                                c2482c.l(f4.f27658c);
                            } else if (!C2482c.N(lVar7) || wc.l.d(f4.f27658c, strArr3)) {
                                i11--;
                            }
                        }
                    }
                    if (c2482c.B("p")) {
                        c2482c.l("p");
                    }
                    c2482c.J(o10);
                    z8 = true;
                    return z8;
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    if (c2482c.B("p")) {
                        c2482c.l("p");
                    }
                    if (wc.l.d(c2482c.b().f26349d.f27658c, strArr)) {
                        c2482c.x(this);
                        c2482c.j();
                    }
                    c2482c.J(o10);
                    z8 = true;
                    return z8;
                case BlurFactor.DEFAULT_RADIUS /* 25 */:
                    if (c2482c.B("p")) {
                        c2482c.l("p");
                    }
                    c2482c.K(o10);
                    c2482c.f27737v = false;
                    z8 = true;
                    return z8;
                case 26:
                    c2482c.f27737v = false;
                    ArrayList arrayList3 = c2482c.f27815e;
                    int size3 = arrayList3.size() - 1;
                    while (true) {
                        if (size3 > 0) {
                            xc.l lVar8 = (xc.l) arrayList3.get(size3);
                            if (lVar8.K("li")) {
                                c2482c.l("li");
                            } else if (!C2482c.N(lVar8) || wc.l.d(lVar8.f26349d.f27658c, strArr3)) {
                                size3--;
                            }
                        }
                    }
                    if (c2482c.B("p")) {
                        c2482c.l("p");
                    }
                    c2482c.J(o10);
                    z8 = true;
                    return z8;
                case 27:
                case '\"':
                    if (c2482c.C("ruby")) {
                        c2482c.z(false);
                        if (!c2482c.c("ruby")) {
                            c2482c.x(this);
                        }
                    }
                    c2482c.J(o10);
                    z8 = true;
                    return z8;
                case 28:
                case 29:
                    if (c2482c.C("ruby")) {
                        c2482c.y("rtc");
                        if (!c2482c.c("rtc") && !c2482c.c("ruby")) {
                            c2482c.x(this);
                        }
                    }
                    c2482c.J(o10);
                    z8 = true;
                    return z8;
                case '!':
                case '4':
                    if (c2482c.B("p")) {
                        c2482c.l("p");
                    }
                    c2482c.J(o10);
                    c2482c.f27812b.a0("\n");
                    c2482c.f27737v = false;
                    z8 = true;
                    return z8;
                case '#':
                    c2482c.U();
                    c2482c.L(o10, "http://www.w3.org/2000/svg");
                    z8 = true;
                    return z8;
                case '%':
                    if (c2482c.B("p")) {
                        c2482c.l("p");
                    }
                    c2482c.U();
                    c2482c.f27737v = false;
                    C.b(o10, c2482c, c2482c.o(o10).g());
                    z8 = true;
                    return z8;
                case '\'':
                    c2482c.x(this);
                    ArrayList arrayList4 = c2482c.f27815e;
                    if (arrayList4.size() != 1 && ((arrayList4.size() <= 2 || ((xc.l) arrayList4.get(1)).K("body")) && !c2482c.O("template"))) {
                        c2482c.f27737v = false;
                        xc.l A11 = c2482c.A("body");
                        if (A11 != null) {
                            C.d(o10, A11);
                        }
                        z8 = true;
                        return z8;
                    }
                    return false;
                case '*':
                    if (c2482c.f27731p != null && !c2482c.O("template")) {
                        c2482c.x(this);
                        return false;
                    }
                    if (c2482c.B("p")) {
                        c2482c.y("p");
                        if (!"p".equals(c2482c.b().f26349d.f27658c)) {
                            c2482c.x(c2482c.f27727l);
                        }
                        c2482c.R("p");
                    }
                    c2482c.M(o10, true, true);
                    z8 = true;
                    return z8;
                case '+':
                    c2482c.x(this);
                    if (!c2482c.O("template")) {
                        if (c2482c.f27815e.size() > 0) {
                            C.d(o10, (xc.l) c2482c.f27815e.get(0));
                        }
                        z8 = true;
                        return z8;
                    }
                    return false;
                case ',':
                    c2482c.U();
                    c2482c.L(o10, "http://www.w3.org/1998/Math/MathML");
                    z8 = true;
                    return z8;
                case '-':
                    c2482c.U();
                    if (c2482c.C("nobr")) {
                        c2482c.x(this);
                        c2482c.l("nobr");
                        c2482c.U();
                    }
                    xc.l J12 = c2482c.J(o10);
                    c2482c.q(J12);
                    c2482c.f27733r.add(J12);
                    z8 = true;
                    return z8;
                case '.':
                    c2482c.U();
                    c2482c.J(o10);
                    z8 = true;
                    return z8;
                case '0':
                    if (c2482c.A("svg") == null) {
                        o10.k("img");
                        return c2482c.k(o10);
                    }
                    c2482c.J(o10);
                    z8 = true;
                    return z8;
                case '1':
                    c2482c.U();
                    if (!c2482c.K(o10).o("type").equalsIgnoreCase("hidden")) {
                        c2482c.f27737v = false;
                    }
                    z8 = true;
                    return z8;
                case '3':
                    if (c2482c.f27814d.f26343z != 2 && c2482c.B("p")) {
                        c2482c.l("p");
                    }
                    c2482c.J(o10);
                    c2482c.f27737v = false;
                    c2482c.f27727l = a9;
                    z8 = true;
                    return z8;
                case '5':
                    if (c2482c.B("p")) {
                        c2482c.l("p");
                    }
                    c2482c.J(o10);
                    c2482c.f27813c.o(l1.f27799u);
                    z8 = true;
                    return z8;
                case '6':
                    C.b(o10, c2482c, c2482c.o(o10).g());
                    z8 = true;
                    return z8;
                default:
                    F o11 = c2482c.o(o10);
                    l1 g = o11.g();
                    if (g != null) {
                        C.b(o10, c2482c, g);
                    } else if (!o11.d()) {
                        c2482c.J(o10);
                    } else if (wc.l.d(m10, B.f27605h)) {
                        if (c2482c.B("p")) {
                            c2482c.l("p");
                        }
                        c2482c.J(o10);
                    } else {
                        if (wc.l.d(m10, B.g)) {
                            return c2519v.f(s3, c2482c);
                        }
                        if (wc.l.d(m10, strArr2)) {
                            c2482c.U();
                            c2482c.J(o10);
                            c2482c.f27733r.add(null);
                            c2482c.f27737v = false;
                        } else {
                            if (!wc.l.d(m10, B.f27608m)) {
                                if (wc.l.d(m10, B.f27609n)) {
                                    c2482c.x(this);
                                    return false;
                                }
                                c2482c.U();
                                c2482c.J(o10);
                                z8 = true;
                                return z8;
                            }
                            c2482c.K(o10);
                        }
                    }
                    z8 = true;
                    return z8;
            }
        }
        String[] strArr4 = B.f27611p;
        if (b2 != 2) {
            if (b2 == 3) {
                c2482c.I((K) s3);
                return true;
            }
            if (b2 != 4) {
                if (b2 != 6) {
                    throw new IllegalStateException("Unexpected state: ".concat(y.S.e(s3.f27675a)));
                }
                if (c2482c.f27734s.size() > 0) {
                    return C.f27627F.f(s3, c2482c);
                }
                if (!c2482c.Q(strArr4)) {
                    return true;
                }
                c2482c.x(this);
                return true;
            }
            J j = (J) s3;
            if (j.f27664d.L().equals(C.f27633M)) {
                c2482c.x(this);
                return false;
            }
            if (c2482c.f27737v && C.a(j)) {
                c2482c.U();
                c2482c.G(j);
                return true;
            }
            c2482c.U();
            c2482c.G(j);
            c2482c.f27737v = false;
            return true;
        }
        N n6 = (N) s3;
        String m11 = n6.m();
        m11.getClass();
        String[] strArr5 = C2482c.f27726z;
        C2502m c2502m = C.f27628G;
        switch (m11.hashCode()) {
            case -1321546630:
                str = "template";
                if (m11.equals(str)) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case 112:
                if (m11.equals("p")) {
                    str = "template";
                    c11 = 1;
                    break;
                }
                str = "template";
                c11 = 65535;
                break;
            case 3152:
                if (m11.equals("br")) {
                    str = "template";
                    c11 = 2;
                    break;
                }
                str = "template";
                c11 = 65535;
                break;
            case 3200:
                if (m11.equals("dd")) {
                    str = "template";
                    c11 = 3;
                    break;
                }
                str = "template";
                c11 = 65535;
                break;
            case 3216:
                if (m11.equals("dt")) {
                    str = "template";
                    c11 = 4;
                    break;
                }
                str = "template";
                c11 = 65535;
                break;
            case 3273:
                if (m11.equals("h1")) {
                    str = "template";
                    c11 = 5;
                    break;
                }
                str = "template";
                c11 = 65535;
                break;
            case 3274:
                if (m11.equals("h2")) {
                    str = "template";
                    c11 = 6;
                    break;
                }
                str = "template";
                c11 = 65535;
                break;
            case 3275:
                if (m11.equals("h3")) {
                    str = "template";
                    c11 = 7;
                    break;
                }
                str = "template";
                c11 = 65535;
                break;
            case 3276:
                if (m11.equals("h4")) {
                    str = "template";
                    c11 = '\b';
                    break;
                }
                str = "template";
                c11 = 65535;
                break;
            case 3277:
                if (m11.equals("h5")) {
                    c12 = '\t';
                    c11 = c12;
                    str = "template";
                    break;
                }
                str = "template";
                c11 = 65535;
                break;
            case 3278:
                if (m11.equals("h6")) {
                    c12 = '\n';
                    c11 = c12;
                    str = "template";
                    break;
                }
                str = "template";
                c11 = 65535;
                break;
            case 3453:
                if (m11.equals("li")) {
                    c12 = 11;
                    c11 = c12;
                    str = "template";
                    break;
                }
                str = "template";
                c11 = 65535;
                break;
            case 3029410:
                if (m11.equals("body")) {
                    c12 = '\f';
                    c11 = c12;
                    str = "template";
                    break;
                }
                str = "template";
                c11 = 65535;
                break;
            case 3148996:
                if (m11.equals("form")) {
                    c12 = '\r';
                    c11 = c12;
                    str = "template";
                    break;
                }
                str = "template";
                c11 = 65535;
                break;
            case 3213227:
                if (m11.equals("html")) {
                    c12 = 14;
                    c11 = c12;
                    str = "template";
                    break;
                }
                str = "template";
                c11 = 65535;
                break;
            case 3536714:
                if (m11.equals("span")) {
                    c12 = 15;
                    c11 = c12;
                    str = "template";
                    break;
                }
                str = "template";
                c11 = 65535;
                break;
            case 1869063452:
                if (m11.equals("sarcasm")) {
                    c12 = 16;
                    c11 = c12;
                    str = "template";
                    break;
                }
                str = "template";
                c11 = 65535;
                break;
            default:
                str = "template";
                c11 = 65535;
                break;
        }
        switch (c11) {
            case 0:
                c2519v.f(s3, c2482c);
                return true;
            case 1:
                if (!c2482c.B(m11)) {
                    c2482c.x(this);
                    c2482c.m(m11);
                    return c2482c.k(n6);
                }
                c2482c.y(m11);
                if (!c2482c.c(m11)) {
                    c2482c.x(this);
                }
                c2482c.R(m11);
                return true;
            case 2:
                c2482c.x(this);
                c2482c.m("br");
                return false;
            case 3:
            case 4:
                if (!c2482c.C(m11)) {
                    c2482c.x(this);
                    return false;
                }
                c2482c.y(m11);
                if (!c2482c.c(m11)) {
                    c2482c.x(this);
                }
                c2482c.R(m11);
                return true;
            case 5:
            case 6:
            case 7:
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
            case '\t':
            case '\n':
                if (!c2482c.E(strArr, strArr5, null)) {
                    c2482c.x(this);
                    return false;
                }
                c2482c.y(m11);
                if (!c2482c.c(m11)) {
                    c2482c.x(this);
                }
                for (int size4 = c2482c.f27815e.size() - 1; size4 >= 0; size4--) {
                    xc.l j10 = c2482c.j();
                    if (wc.l.d(j10.f26349d.f27658c, strArr) && "http://www.w3.org/1999/xhtml".equals(j10.f26349d.f27656a)) {
                        return true;
                    }
                }
                return true;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                String[] strArr6 = C2482c.f27716C;
                String[] strArr7 = c2482c.f27740y;
                strArr7[0] = m11;
                if (!c2482c.E(strArr7, strArr5, strArr6)) {
                    c2482c.x(this);
                    return false;
                }
                c2482c.y(m11);
                if (!c2482c.c(m11)) {
                    c2482c.x(this);
                }
                c2482c.R(m11);
                return true;
            case '\f':
                if (!c2482c.C("body")) {
                    c2482c.x(this);
                    return false;
                }
                if (c2482c.Q(strArr4)) {
                    c2482c.x(this);
                }
                c2482c.A("body");
                c2482c.f27727l = c2502m;
                return true;
            case '\r':
                if (c2482c.O(str)) {
                    if (!c2482c.C(m11)) {
                        c2482c.x(this);
                        return false;
                    }
                    c2482c.z(false);
                    if (!c2482c.c(m11)) {
                        c2482c.x(this);
                    }
                    c2482c.R(m11);
                    return true;
                }
                xc.l lVar9 = c2482c.f27731p;
                c2482c.f27731p = null;
                if (lVar9 == null || !c2482c.C(m11)) {
                    c2482c.x(this);
                    return false;
                }
                c2482c.z(false);
                if (!c2482c.c(m11)) {
                    c2482c.x(this);
                }
                c2482c.W(lVar9);
                return true;
            case 14:
                if (!c2482c.O("body")) {
                    c2482c.x(this);
                    return false;
                }
                if (c2482c.Q(strArr4)) {
                    c2482c.x(this);
                }
                c2482c.f27727l = c2502m;
                return c2482c.k(s3);
            case 15:
            case 16:
                return g(s3, c2482c);
            default:
                if (!wc.l.d(m11, B.f27612q)) {
                    if (wc.l.d(m11, B.f27610o)) {
                        if (!c2482c.C(m11)) {
                            c2482c.x(this);
                            return false;
                        }
                        c2482c.z(false);
                        if (!c2482c.c(m11)) {
                            c2482c.x(this);
                        }
                        c2482c.R(m11);
                        return true;
                    }
                    if (!wc.l.d(m11, strArr2)) {
                        return g(s3, c2482c);
                    }
                    if (!c2482c.C("name")) {
                        if (!c2482c.C(m11)) {
                            c2482c.x(this);
                            return false;
                        }
                        c2482c.z(false);
                        if (!c2482c.c(m11)) {
                            c2482c.x(this);
                        }
                        c2482c.R(m11);
                        c2482c.r();
                    }
                    return true;
                }
                String str2 = n6.f27671e;
                if (c2482c.b().f26349d.f27658c.equals(str2)) {
                    if (!C2482c.P(c2482c.f27733r, c2482c.b())) {
                        c2482c.j();
                        return true;
                    }
                }
                int i13 = 0;
                int i14 = 8;
                while (true) {
                    if (i13 < i14) {
                        i13++;
                        for (int size5 = c2482c.f27733r.size() - 1; size5 >= 0; size5--) {
                            lVar3 = (xc.l) c2482c.f27733r.get(size5);
                            if (lVar3 == null) {
                                lVar3 = null;
                                if (lVar3 == null) {
                                    return g(s3, c2482c);
                                }
                                if (C2482c.P(c2482c.f27815e, lVar3)) {
                                    F f10 = lVar3.f26349d;
                                    if (c2482c.C(f10.f27658c)) {
                                        if (c2482c.b() != lVar3) {
                                            c2482c.x(this);
                                        }
                                        ArrayList arrayList5 = c2482c.f27815e;
                                        int lastIndexOf = arrayList5.lastIndexOf(lVar3);
                                        if (lastIndexOf != -1) {
                                            do {
                                                lastIndexOf++;
                                                if (lastIndexOf < arrayList5.size()) {
                                                    lVar4 = (xc.l) arrayList5.get(lastIndexOf);
                                                }
                                            } while (!C2482c.N(lVar4));
                                            if (lVar4 != null) {
                                                while (c2482c.b() != lVar3) {
                                                    c2482c.j();
                                                }
                                                c2482c.j();
                                                c2482c.V(lVar3);
                                            } else {
                                                xc.l p10 = c2482c.p(lVar3);
                                                if (p10 == null) {
                                                    c2482c.x(this);
                                                } else {
                                                    int i15 = 0;
                                                    while (true) {
                                                        if (i15 >= c2482c.f27733r.size()) {
                                                            i7 = 1;
                                                            i15 = -1;
                                                        } else if (lVar3 == c2482c.f27733r.get(i15)) {
                                                            i7 = 1;
                                                        } else {
                                                            i15++;
                                                        }
                                                    }
                                                    xc.l lVar10 = lVar4;
                                                    xc.q qVar = lVar10;
                                                    int i16 = 0;
                                                    while (true) {
                                                        i16 += i7;
                                                        lVar10 = !C2482c.P(c2482c.f27815e, lVar10) ? lVar10.f26368a : c2482c.p(lVar10);
                                                        if (lVar10 == null) {
                                                            c2482c.x(this);
                                                            break;
                                                        } else if (lVar10 == lVar3) {
                                                            break;
                                                        } else if (i16 <= 3 || !C2482c.P(c2482c.f27733r, lVar10)) {
                                                            if (C2482c.P(c2482c.f27733r, lVar10)) {
                                                                String str3 = str2;
                                                                int i17 = i13;
                                                                xc.l lVar11 = new xc.l(c2482c.f27818i.d(lVar10.N(), lVar10.f26349d.f27658c, "http://www.w3.org/1999/xhtml", true), c2482c.f27816f, null);
                                                                ArrayList arrayList6 = c2482c.f27733r;
                                                                int lastIndexOf2 = arrayList6.lastIndexOf(lVar10);
                                                                vc.i.y(lastIndexOf2 != -1);
                                                                arrayList6.set(lastIndexOf2, lVar11);
                                                                ArrayList arrayList7 = c2482c.f27815e;
                                                                int lastIndexOf3 = arrayList7.lastIndexOf(lVar10);
                                                                vc.i.y(lastIndexOf3 != -1);
                                                                arrayList7.set(lastIndexOf3, lVar11);
                                                                if (qVar == lVar4) {
                                                                    int i18 = 0;
                                                                    while (true) {
                                                                        if (i18 >= c2482c.f27733r.size()) {
                                                                            i10 = 1;
                                                                            i18 = -1;
                                                                        } else if (lVar11 == c2482c.f27733r.get(i18)) {
                                                                            i10 = 1;
                                                                        } else {
                                                                            i18++;
                                                                        }
                                                                    }
                                                                    i15 = i18 + i10;
                                                                }
                                                                lVar11.Z(qVar);
                                                                lVar10 = lVar11;
                                                                qVar = lVar10;
                                                                str2 = str3;
                                                                i13 = i17;
                                                                i14 = 8;
                                                            } else {
                                                                c2482c.W(lVar10);
                                                            }
                                                            i7 = 1;
                                                        } else {
                                                            c2482c.V(lVar10);
                                                        }
                                                    }
                                                    p10.Z(qVar);
                                                    xc.l lVar12 = new xc.l(f10, c2482c.f27816f, null);
                                                    lVar12.y().b(lVar3.y());
                                                    Iterator it = lVar4.D().iterator();
                                                    while (it.hasNext()) {
                                                        lVar12.Z((xc.q) it.next());
                                                    }
                                                    lVar4.Z(lVar12);
                                                    c2482c.V(lVar3);
                                                    c2482c.q(lVar12);
                                                    try {
                                                        c2482c.f27733r.add(i15, lVar12);
                                                    } catch (IndexOutOfBoundsException unused) {
                                                        c2482c.f27733r.add(lVar12);
                                                    }
                                                    c2482c.W(lVar3);
                                                    int lastIndexOf4 = c2482c.f27815e.lastIndexOf(lVar4);
                                                    vc.i.y(lastIndexOf4 != -1);
                                                    c2482c.f27815e.add(lastIndexOf4 + 1, lVar12);
                                                }
                                            }
                                        }
                                        lVar4 = null;
                                        if (lVar4 != null) {
                                        }
                                    } else {
                                        c2482c.x(this);
                                    }
                                } else {
                                    c2482c.x(this);
                                    c2482c.V(lVar3);
                                }
                            } else if (lVar3.f26349d.f27658c.equals(str2)) {
                                if (lVar3 == null) {
                                }
                            }
                        }
                        lVar3 = null;
                        if (lVar3 == null) {
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(S s3, C2482c c2482c) {
        s3.getClass();
        String str = ((N) s3).f27671e;
        ArrayList arrayList = c2482c.f27815e;
        if (c2482c.A(str) != null) {
            int size = arrayList.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                xc.l lVar = (xc.l) arrayList.get(size);
                if (lVar.K(str)) {
                    c2482c.y(str);
                    if (!c2482c.c(str)) {
                        c2482c.x(this);
                    }
                    c2482c.R(str);
                } else {
                    if (C2482c.N(lVar)) {
                        c2482c.x(this);
                        return false;
                    }
                    size--;
                }
            }
        } else {
            c2482c.x(this);
            return false;
        }
    }
}
