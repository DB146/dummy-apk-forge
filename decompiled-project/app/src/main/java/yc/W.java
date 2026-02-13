package yc;

import java.util.Locale;

/* loaded from: classes2.dex */
public enum W extends l1 {
    public W() {
        super("RcdataLessthanSign", 10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r1 >= r8.f27705d) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    @Override // yc.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(U u3, C2480b c2480b) {
        if (c2480b.c0('/')) {
            u3.e();
            u3.a(l1.f27809z);
            return;
        }
        if (c2480b.f27710w && c2480b.e0() && u3.f27693o != null) {
            if (u3.f27694p == null) {
                u3.f27694p = "</" + u3.f27693o;
            }
            String str = u3.f27694p;
            if (str.equals(c2480b.f27713z)) {
                int i7 = c2480b.f27701A;
                if (i7 == -1) {
                    r3 = false;
                }
                if (!r3) {
                    P d10 = u3.d(false);
                    d10.k(u3.f27693o);
                    u3.j = d10;
                    u3.k();
                    u3.o(l1.f27801v);
                    return;
                }
            }
            c2480b.f27713z = str;
            Locale locale = Locale.ENGLISH;
            int g02 = c2480b.g0(str.toLowerCase(locale));
            if (g02 > -1) {
                c2480b.f27701A = c2480b.f27705d + g02;
            } else {
                int g03 = c2480b.g0(str.toUpperCase(locale));
                r3 = g03 > -1;
                c2480b.f27701A = r3 ? c2480b.f27705d + g03 : -1;
            }
            if (!r3) {
            }
        }
        u3.f('<');
        u3.o(l1.f27777c);
    }
}
