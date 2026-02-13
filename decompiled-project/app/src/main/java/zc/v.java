package zc;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.utils.blurry.BlurFactor;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import yc.C2480b;
import yc.T;

/* loaded from: classes2.dex */
public final class v implements AutoCloseable {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f28398d = {'>', '+', '~'};

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f28399e = {"=", "!=", "^=", "$=", "*=", "~="};

    /* renamed from: f, reason: collision with root package name */
    public static final char[] f28400f = {',', ')'};

    /* renamed from: u, reason: collision with root package name */
    public static final Pattern f28401u = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);

    /* renamed from: v, reason: collision with root package name */
    public static final Pattern f28402v = Pattern.compile("([+-])?(\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final T f28403a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28404b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f28405c;

    public v(String str) {
        vc.i.A(str);
        String trim = str.trim();
        this.f28404b = trim;
        this.f28403a = new T(trim);
    }

    public static p X(String str) {
        try {
            v vVar = new v(str);
            try {
                p Z7 = vVar.Z();
                T t5 = vVar.f28403a;
                t5.K();
                C2480b c2480b = t5.f27679a;
                if (c2480b.Y()) {
                    vVar.close();
                    return Z7;
                }
                throw new ec.n("Could not parse query '%s': unexpected token at '%s'", vVar.f28404b, c2480b.W());
            } finally {
            }
        } catch (IllegalArgumentException e2) {
            throw new IllegalStateException(e2.getMessage());
        }
    }

    public static p l(p pVar, p pVar2) {
        if (pVar == null) {
            return pVar2;
        }
        if (!(pVar instanceof C2610b)) {
            return new C2610b(Arrays.asList(pVar, pVar2));
        }
        C2610b c2610b = (C2610b) pVar;
        c2610b.f28370a.add(pVar2);
        c2610b.g();
        return pVar;
    }

    public final String F() {
        return this.f28403a.n('(', ')');
    }

    public final p K(boolean z8) {
        String str = z8 ? ":containsOwn" : ":contains";
        String U8 = T.U(F());
        vc.i.B(U8, str.concat("(text) query must not be empty"));
        return this.f28405c ? new r(U8) : z8 ? new h(U8, 4) : new h(U8, 5);
    }

    public final p P(boolean z8) {
        String str = z8 ? ":containsWholeOwnText" : ":containsWholeText";
        String U8 = T.U(F());
        vc.i.B(U8, str.concat("(text) query must not be empty"));
        return z8 ? new h(U8, 6, false) : new h(U8, 7, false);
    }

    public final n T(boolean z8, boolean z10) {
        String d10 = wc.c.d(F());
        int i7 = 2;
        if (!"odd".equals(d10)) {
            if (!"even".equals(d10)) {
                Matcher matcher = f28401u.matcher(d10);
                if (matcher.matches()) {
                    if (matcher.group(3) != null) {
                        i7 = Integer.parseInt(matcher.group(1).replaceFirst("^\\+", ""));
                    } else {
                        i7 = "-".equals(matcher.group(2)) ? -1 : 1;
                    }
                    if (matcher.group(4) != null) {
                        r2 = Integer.parseInt(matcher.group(4).replaceFirst("^\\+", ""));
                    }
                } else {
                    Matcher matcher2 = f28402v.matcher(d10);
                    if (!matcher2.matches()) {
                        throw new ec.n("Could not parse nth-index '%s': unexpected format", d10);
                    }
                    r2 = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
                    i7 = 0;
                }
            }
            r2 = 0;
        }
        return z10 ? z8 ? new n(i7, r2, 2) : new n(i7, r2, 3) : z8 ? new n(i7, r2, 1) : new n(i7, r2, 0);
    }

    public final p U(T t5) {
        C2480b c2480b;
        String[] strArr = f28399e;
        StringBuilder b2 = wc.l.b();
        loop0: while (true) {
            c2480b = t5.f27679a;
            if (c2480b.Y()) {
                break;
            }
            for (int i7 = 0; i7 < 6; i7++) {
                if (c2480b.f0(strArr[i7])) {
                    break loop0;
                }
            }
            b2.append(c2480b.K());
        }
        String l10 = wc.l.l(b2);
        vc.i.A(l10);
        t5.K();
        if (c2480b.Y()) {
            return l10.startsWith("^") ? new h(l10.substring(1), 1) : l10.equals("*") ? new h("", 1) : new h(l10, 0, false);
        }
        if (t5.T('=')) {
            return new i(l10, 0, c2480b.W(), true);
        }
        if (c2480b.b0("!=")) {
            return new i(l10, 3, c2480b.W(), true);
        }
        if (c2480b.b0("^=")) {
            return new i(l10, 4, c2480b.W(), false);
        }
        if (c2480b.b0("$=")) {
            return new i(l10, 2, c2480b.W(), false);
        }
        if (c2480b.b0("*=")) {
            return new i(l10, 1, c2480b.W(), true);
        }
        if (c2480b.b0("~=")) {
            return new j(l10, Pattern.compile(c2480b.W()));
        }
        throw new ec.n("Could not parse attribute query '%s': unexpected token at '%s'", this.f28404b, c2480b.W());
    }

    public final p V(boolean z8) {
        String str = z8 ? ":matchesOwn" : ":matches";
        String F10 = F();
        vc.i.B(F10, str.concat("(regex) query must not be empty"));
        Pattern compile = Pattern.compile(F10);
        return this.f28405c ? new r(compile) : z8 ? new o(compile, 1) : new o(compile, 0);
    }

    public final p W(boolean z8) {
        String str = z8 ? ":matchesWholeOwnText" : ":matchesWholeText";
        String F10 = F();
        vc.i.B(F10, str.concat("(regex) query must not be empty"));
        return z8 ? new o(Pattern.compile(F10), 2) : new o(Pattern.compile(F10), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [zc.p] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [zc.p] */
    /* JADX WARN: Type inference failed for: r3v4, types: [zc.p] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [zc.C, zc.z] */
    /* JADX WARN: Type inference failed for: r3v8, types: [zc.p] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final p Y() {
        T t5 = this.f28403a;
        t5.K();
        char[] cArr = f28398d;
        C2480b c2480b = t5.f27679a;
        ?? gVar = c2480b.d0(cArr) ? new g(8) : a0();
        while (true) {
            char c10 = t5.K() ? ' ' : (char) 0;
            if (!c2480b.d0(cArr)) {
                if (c2480b.d0(f28400f)) {
                    break;
                }
            } else {
                c10 = c2480b.K();
            }
            if (c10 == 0) {
                break;
            }
            p a02 = a0();
            if (c10 == ' ') {
                gVar = l(new x(gVar, 0), a02);
            } else if (c10 == '+') {
                gVar = l(new C(gVar), a02);
            } else if (c10 == '>') {
                gVar = gVar instanceof z ? (z) gVar : new z(gVar);
                gVar.f28411d.add(a02);
                gVar.f28412e = a02.a() + gVar.f28412e;
                gVar.f28368b |= a02.f();
            } else {
                if (c10 != '~') {
                    throw new ec.n("Unknown combinator '%s'", Character.valueOf(c10));
                }
                gVar = l(new C(gVar), a02);
            }
        }
        return gVar;
    }

    public final p Z() {
        p Y2 = Y();
        while (this.f28403a.T(',')) {
            p Y10 = Y();
            if (Y2 instanceof C2611c) {
                C2611c c2611c = (C2611c) Y2;
                c2611c.f28370a.add(Y10);
                c2611c.g();
            } else {
                Y2 = new C2611c(Y2, Y10);
            }
        }
        return Y2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p a0() {
        h hVar;
        p pVar;
        int i7 = 9;
        int i10 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        T t5 = this.f28403a;
        t5.K();
        C2480b c2480b = t5.f27679a;
        if (Character.isLetterOrDigit(c2480b.X()) || c2480b.f0("*|")) {
            char[] cArr = T.f27678b;
            StringBuilder b2 = wc.l.b();
            while (!c2480b.Y()) {
                char X10 = c2480b.X();
                if (X10 != '\\') {
                    if (!Character.isLetterOrDigit(c2480b.X()) && !c2480b.d0(cArr)) {
                        break;
                    }
                    b2.append(X10);
                    t5.l();
                } else {
                    t5.l();
                    if (c2480b.Y()) {
                        break;
                    }
                    b2.append(c2480b.K());
                }
            }
            String d10 = wc.c.d(wc.l.l(b2));
            vc.i.A(d10);
            if (d10.startsWith("*|")) {
                String substring = d10.substring(2);
                pVar = new C2611c(new h(substring, i7, objArr4 == true ? 1 : 0), new h(X.c.t(":", substring), 10, objArr3 == true ? 1 : 0));
            } else {
                if (d10.endsWith("|*")) {
                    hVar = new h(d10.substring(0, d10.length() - 2) + ":", 11, objArr2 == true ? 1 : 0);
                } else {
                    if (d10.contains("|")) {
                        d10 = d10.replace("|", ":");
                    }
                    hVar = new h(d10, i7, objArr == true ? 1 : 0);
                }
                pVar = hVar;
            }
        } else {
            pVar = t5.T('*') ? new g(i10) : null;
        }
        while (true) {
            p b02 = b0();
            if (b02 == null) {
                break;
            }
            pVar = l(pVar, b02);
        }
        if (pVar != null) {
            return pVar;
        }
        throw new ec.n("Could not parse query '%s': unexpected token at '%s'", this.f28404b, c2480b.W());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r0v23, types: [zc.p, java.lang.Object] */
    public final p b0() {
        char c10;
        char c11;
        p hVar;
        char c12;
        p sVar;
        int i7 = 7;
        int i10 = 6;
        int i11 = 8;
        int i12 = 5;
        int i13 = 4;
        int i14 = 3;
        int i15 = 1;
        boolean z8 = false;
        int i16 = 2;
        T t5 = this.f28403a;
        if (t5.T('#')) {
            String F10 = t5.F();
            vc.i.A(F10);
            return new h(F10, i11, z8);
        }
        if (t5.T('.')) {
            String F11 = t5.F();
            vc.i.A(F11);
            return new h(F11.trim(), i16, z8);
        }
        C2480b c2480b = t5.f27679a;
        if (c2480b.c0('[')) {
            T t10 = new T(t5.n('[', ']'));
            try {
                p U8 = U(t10);
                t10.close();
                return U8;
            } finally {
            }
        } else {
            boolean b02 = c2480b.b0("::");
            String str = this.f28404b;
            if (!b02) {
                if (!t5.T(':')) {
                    return null;
                }
                String F12 = t5.F();
                F12.getClass();
                switch (F12.hashCode()) {
                    case -2141736343:
                        if (F12.equals("containsData")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -2136991809:
                        if (F12.equals("first-child")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1939921007:
                        if (F12.equals("matchesWholeText")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1754914063:
                        if (F12.equals("nth-child")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1629748624:
                        if (F12.equals("nth-last-child")) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -947996741:
                        if (F12.equals("only-child")) {
                            c10 = 5;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -897532411:
                        if (F12.equals("nth-of-type")) {
                            c10 = 6;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -872629820:
                        if (F12.equals("nth-last-of-type")) {
                            c10 = 7;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -567445985:
                        if (F12.equals("contains")) {
                            c10 = '\b';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -55413797:
                        if (F12.equals("containsWholeOwnText")) {
                            c11 = '\t';
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3244:
                        if (F12.equals("eq")) {
                            c11 = '\n';
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3309:
                        if (F12.equals("gt")) {
                            c11 = 11;
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3370:
                        if (F12.equals("is")) {
                            c11 = '\f';
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3464:
                        if (F12.equals("lt")) {
                            c11 = '\r';
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 103066:
                        if (F12.equals("has")) {
                            c11 = 14;
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 109267:
                        if (F12.equals("not")) {
                            c11 = 15;
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3506402:
                        if (F12.equals("root")) {
                            c11 = 16;
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 93819220:
                        if (F12.equals("blank")) {
                            c11 = 17;
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 96634189:
                        if (F12.equals("empty")) {
                            c11 = 18;
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 208017639:
                        if (F12.equals("containsOwn")) {
                            c11 = 19;
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 614017170:
                        if (F12.equals("matchText")) {
                            c11 = 20;
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 835834661:
                        if (F12.equals("last-child")) {
                            c11 = 21;
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 840862003:
                        if (F12.equals("matches")) {
                            c11 = 22;
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1255901423:
                        if (F12.equals("matchesWholeOwnText")) {
                            c11 = 23;
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1292941139:
                        if (F12.equals("first-of-type")) {
                            c11 = 24;
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1455900751:
                        if (F12.equals("only-of-type")) {
                            c11 = 25;
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1870740819:
                        if (F12.equals("matchesOwn")) {
                            c11 = 26;
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2014184485:
                        if (F12.equals("containsWholeText")) {
                            c11 = 27;
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2025926969:
                        if (F12.equals("last-of-type")) {
                            c11 = 28;
                            c10 = c11;
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
                        String U10 = T.U(F());
                        vc.i.B(U10, ":containsData(text) query must not be empty");
                        hVar = new h(U10, 3);
                        break;
                    case 1:
                        return new g(i16);
                    case 2:
                        return W(false);
                    case 3:
                        return T(false, false);
                    case 4:
                        return T(true, false);
                    case 5:
                        return new g(i13);
                    case 6:
                        return T(false, true);
                    case 7:
                        return T(true, true);
                    case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                        return K(false);
                    case '\t':
                        return P(true);
                    case '\n':
                        return new k(n(), 0);
                    case ModuleDescriptor.MODULE_VERSION /* 11 */:
                        return new k(n(), 1);
                    case '\f':
                        vc.i.x(":is() must have a selector", t5.T('('));
                        p Z7 = Z();
                        vc.i.x(":is() must have a selector", t5.T(')'));
                        hVar = new x(Z7, i15);
                        break;
                    case '\r':
                        return new k(n(), 2);
                    case 14:
                        vc.i.x(":has() must have a selector", t5.T('('));
                        p Z10 = Z();
                        vc.i.x(":has() must have a selector", t5.T(')'));
                        hVar = new y(Z10);
                        break;
                    case 15:
                        String F13 = F();
                        vc.i.B(F13, ":not(selector) subselect must not be empty");
                        hVar = new x(X(F13), i16);
                        break;
                    case 16:
                        return new g(i10);
                    case 17:
                        return new Object();
                    case 18:
                        return new g(i15);
                    case 19:
                        return K(true);
                    case 20:
                        hVar = new g(i7);
                        if (!g.f28378b) {
                            g.f28378b = true;
                            System.err.println("WARNING: :matchText selector is deprecated and will be removed in a future version. Use Element#selectNodes(String, Class) with selector ::textnode and class TextNode instead.");
                            break;
                        }
                        break;
                    case 21:
                        return new g(i14);
                    case 22:
                        return V(false);
                    case 23:
                        return W(true);
                    case 24:
                        return new n(0, 1, 3);
                    case BlurFactor.DEFAULT_RADIUS /* 25 */:
                        return new g(i12);
                    case 26:
                        return V(true);
                    case 27:
                        return P(false);
                    case 28:
                        return new n(0, 1, 2);
                    default:
                        throw new ec.n("Could not parse query '%s': unexpected token at '%s'", str, c2480b.W());
                }
                return hVar;
            }
            String F14 = t5.F();
            this.f28405c = true;
            F14.getClass();
            switch (F14.hashCode()) {
                case 3076010:
                    if (F14.equals("data")) {
                        c12 = 0;
                        break;
                    }
                    c12 = 65535;
                    break;
                case 3386882:
                    if (F14.equals("node")) {
                        c12 = 1;
                        break;
                    }
                    c12 = 65535;
                    break;
                case 3556653:
                    if (F14.equals("text")) {
                        c12 = 2;
                        break;
                    }
                    c12 = 65535;
                    break;
                case 94504589:
                    if (F14.equals("cdata")) {
                        c12 = 3;
                        break;
                    }
                    c12 = 65535;
                    break;
                case 950398559:
                    if (F14.equals("comment")) {
                        c12 = 4;
                        break;
                    }
                    c12 = 65535;
                    break;
                case 1563127392:
                    if (F14.equals("leafnode")) {
                        c12 = 5;
                        break;
                    }
                    c12 = 65535;
                    break;
                default:
                    c12 = 65535;
                    break;
            }
            switch (c12) {
                case 0:
                    sVar = new s(xc.e.class, F14);
                    break;
                case 1:
                    sVar = new s(xc.q.class, F14);
                    break;
                case 2:
                    sVar = new s(xc.x.class, F14);
                    break;
                case 3:
                    sVar = new s(xc.c.class, F14);
                    break;
                case 4:
                    sVar = new s(xc.d.class, F14);
                    break;
                case 5:
                    sVar = new s(xc.p.class, F14);
                    break;
                default:
                    throw new ec.n("Could not parse query '%s': unknown node type '::%s'", str, F14);
            }
            while (true) {
                p b03 = b0();
                if (b03 == null) {
                    this.f28405c = false;
                    return sVar;
                }
                sVar = l(sVar, b03);
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f28403a.close();
    }

    public final int n() {
        String trim = F().trim();
        boolean z8 = false;
        if (trim != null && trim.length() != 0) {
            int length = trim.length();
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    z8 = true;
                    break;
                }
                if (!wc.l.g(trim.charAt(i7))) {
                    break;
                }
                i7++;
            }
        }
        vc.i.x("Index must be numeric", z8);
        return Integer.parseInt(trim);
    }

    public final String toString() {
        return this.f28404b;
    }
}
