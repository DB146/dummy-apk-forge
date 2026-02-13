package C;

import Q.C0498k;
import Q.C0506o;

/* renamed from: C.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0233s {

    /* renamed from: a, reason: collision with root package name */
    public static final u f2433a;

    static {
        C0219d c0219d = AbstractC0224i.f2402a;
        f2433a = new u();
    }

    public static final u a(C0506o c0506o) {
        Object obj = AbstractC0224i.f2403b;
        c0.c cVar = c0.b.f14100z;
        if (obj.equals(obj) && cVar.equals(cVar)) {
            c0506o.S(346089448);
            c0506o.p(false);
            return f2433a;
        }
        c0506o.S(346143295);
        boolean g = c0506o.g(obj) | c0506o.g(cVar);
        Object H10 = c0506o.H();
        if (g || H10 == C0498k.f8409a) {
            H10 = new u();
            c0506o.d0(H10);
        }
        u uVar = (u) H10;
        c0506o.p(false);
        return uVar;
    }
}
