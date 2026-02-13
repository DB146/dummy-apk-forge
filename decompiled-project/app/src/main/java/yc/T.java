package yc;

/* loaded from: classes2.dex */
public final class T implements AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f27678b = {'*', '|', '_', '-'};

    /* renamed from: a, reason: collision with root package name */
    public final C2480b f27679a;

    public T(String str) {
        this.f27679a = new C2480b(str);
    }

    public static boolean P(char c10) {
        return c10 == '-' || wc.l.g(c10) || c10 == '_' || wc.l.e(c10) || c10 >= 128;
    }

    public static String U(String str) {
        if (str.indexOf(92) == -1) {
            return str;
        }
        StringBuilder b2 = wc.l.b();
        char c10 = 0;
        for (char c11 : str.toCharArray()) {
            if (c11 != '\\') {
                b2.append(c11);
            } else if (c10 == '\\') {
                b2.append(c11);
                c10 = 0;
            }
            c10 = c11;
        }
        return wc.l.l(b2);
    }

    public final String F() {
        char X10;
        C2480b c2480b = this.f27679a;
        if (c2480b.Y()) {
            throw new IllegalArgumentException("CSS identifier expected, but end of input found");
        }
        c2480b.n();
        int i7 = c2480b.f27705d;
        int i10 = c2480b.f27706e;
        char[] cArr = c2480b.f27704c;
        int i11 = i7;
        while (i11 < i10 && P(cArr[i11])) {
            i11++;
        }
        c2480b.f27705d = i11;
        String F10 = i11 > i7 ? C2480b.F(c2480b.f27704c, c2480b.f27702a, i7, i11 - i7) : "";
        char X11 = c2480b.X();
        if (X11 != '\\' && X11 != 0) {
            return F10;
        }
        StringBuilder b2 = wc.l.b();
        if (!F10.isEmpty()) {
            b2.append(F10);
        }
        while (!c2480b.Y()) {
            char X12 = c2480b.X();
            if (!P(X12)) {
                if (X12 != 0) {
                    if (X12 != '\\') {
                        break;
                    }
                    l();
                    if (!c2480b.Y() && ((X10 = c2480b.X()) == '\n' || X10 == '\r' || X10 == '\f')) {
                        c2480b.k0();
                        break;
                    }
                    if (c2480b.Y()) {
                        b2.append((char) 65533);
                    } else {
                        char K10 = c2480b.K();
                        if (wc.l.h(K10)) {
                            c2480b.k0();
                            c2480b.n();
                            int i12 = c2480b.f27705d;
                            int i13 = c2480b.f27706e;
                            char[] cArr2 = c2480b.f27704c;
                            int i14 = i12;
                            while (i14 < i13 && i14 - i12 < 6 && wc.l.h(cArr2[i14])) {
                                i14++;
                            }
                            c2480b.f27705d = i14;
                            String F11 = i14 > i12 ? C2480b.F(c2480b.f27704c, c2480b.f27702a, i12, i14 - i12) : "";
                            try {
                                int parseInt = Integer.parseInt(F11, 16);
                                if (parseInt == 0 || !Character.isValidCodePoint(parseInt) || Character.isSurrogate((char) parseInt)) {
                                    b2.append((char) 65533);
                                } else {
                                    b2.appendCodePoint(parseInt);
                                }
                                if (!c2480b.Y()) {
                                    char X13 = c2480b.X();
                                    if (X13 == '\r') {
                                        l();
                                        if (!c2480b.Y() && c2480b.X() == '\n') {
                                            l();
                                        }
                                    } else if (X13 == ' ' || X13 == '\t' || X13 == '\n' || X13 == '\r' || X13 == '\f') {
                                        l();
                                    }
                                }
                            } catch (NumberFormatException e2) {
                                throw new IllegalArgumentException("Invalid escape sequence: ".concat(F11), e2);
                            }
                        } else {
                            b2.append(K10);
                        }
                    }
                } else {
                    l();
                    b2.append((char) 65533);
                }
            } else {
                b2.append(c2480b.K());
            }
        }
        return wc.l.l(b2);
    }

    public final boolean K() {
        boolean z8 = false;
        while (wc.l.i(this.f27679a.X())) {
            l();
            z8 = true;
        }
        return z8;
    }

    public final boolean T(char c10) {
        C2480b c2480b = this.f27679a;
        if (!c2480b.c0(c10)) {
            return false;
        }
        c2480b.K();
        return true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f27679a.close();
    }

    public final void l() {
        C2480b c2480b = this.f27679a;
        if (c2480b.Y()) {
            return;
        }
        c2480b.l();
    }

    public final String n(char c10, char c11) {
        StringBuilder b2 = wc.l.b();
        C2480b c2480b = this.f27679a;
        if (c2480b.f27706e - c2480b.f27705d < 1024) {
            c2480b.f27707f = 0;
        }
        c2480b.n();
        c2480b.f27709v = c2480b.f27705d;
        char c12 = 0;
        boolean z8 = false;
        boolean z10 = false;
        int i7 = 0;
        boolean z11 = false;
        while (!c2480b.Y()) {
            char K10 = c2480b.K();
            if (c12 == '\\') {
                if (K10 == 'Q') {
                    z11 = true;
                } else if (K10 == 'E') {
                    z11 = false;
                }
                b2.append(K10);
            } else {
                if (K10 == '\'' && K10 != c10 && !z8) {
                    z10 = !z10;
                } else if (K10 == '\"' && K10 != c10 && !z10) {
                    z8 = !z8;
                }
                if (z10 || z8 || z11) {
                    b2.append(K10);
                } else if (K10 == c10) {
                    i7++;
                    if (i7 > 1) {
                        b2.append(K10);
                    }
                } else if (K10 == c11) {
                    i7--;
                    if (i7 > 0) {
                        b2.append(K10);
                    }
                } else {
                    b2.append(K10);
                }
            }
            if (i7 <= 0) {
                break;
            }
            c12 = K10;
        }
        String l10 = wc.l.l(b2);
        if (i7 <= 0) {
            return l10;
        }
        c2480b.j0();
        throw new IllegalArgumentException("Did not find balanced marker at '" + l10 + "'");
    }

    public final String toString() {
        return this.f27679a.toString();
    }
}
