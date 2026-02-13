package y;

import Q.C0498k;
import Q.C0506o;
import Q.C0523z;

/* loaded from: classes.dex */
public abstract class W {

    /* renamed from: a, reason: collision with root package name */
    public static final C0523z f26437a = new C0523z(V.f26436a);

    public static final C2305m a(C0506o c0506o) {
        c0506o.S(282942128);
        C2306n c2306n = (C2306n) c0506o.k(f26437a);
        if (c2306n == null) {
            c0506o.p(false);
            return null;
        }
        boolean g = c0506o.g(c2306n);
        Object H10 = c0506o.H();
        if (g || H10 == C0498k.f8409a) {
            H10 = new C2305m(c2306n.f26494a, c2306n.f26495b, c2306n.f26496c, c2306n.f26497d);
            c0506o.d0(H10);
        }
        C2305m c2305m = (C2305m) H10;
        c0506o.p(false);
        return c2305m;
    }
}
