package k0;

import u.AbstractC2060m;
import u.C2070x;

/* renamed from: k0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1407h {

    /* renamed from: a, reason: collision with root package name */
    public static final C2070x f18720a;

    static {
        C1416q c1416q = C1403d.f18696e;
        int i7 = c1416q.f18691c;
        C1406g c1406g = new C1406g(c1416q, c1416q, 1);
        C1411l c1411l = C1403d.f18712x;
        int i10 = c1411l.f18691c << 6;
        int i11 = c1416q.f18691c;
        int i12 = i10 | i11;
        C1406g c1406g2 = new C1406g(c1416q, c1411l, 0);
        int i13 = (i11 << 6) | c1411l.f18691c;
        C1406g c1406g3 = new C1406g(c1411l, c1416q, 0);
        C2070x c2070x = AbstractC2060m.f24696a;
        C2070x c2070x2 = new C2070x();
        c2070x2.g(i7 | (i7 << 6), c1406g);
        c2070x2.g(i12, c1406g2);
        c2070x2.g(i13, c1406g3);
        f18720a = c2070x2;
    }
}
