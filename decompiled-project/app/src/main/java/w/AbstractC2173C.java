package w;

import ea.C1111f;
import java.util.LinkedHashMap;
import x.AbstractC2232b;
import x.InterfaceC2249t;
import x.o0;
import x.p0;

/* renamed from: w.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2173C {

    /* renamed from: a, reason: collision with root package name */
    public static final C1111f f25487a;

    /* renamed from: b, reason: collision with root package name */
    public static final x.Q f25488b;

    /* renamed from: c, reason: collision with root package name */
    public static final x.Q f25489c;

    /* renamed from: d, reason: collision with root package name */
    public static final x.Q f25490d;

    static {
        C2176c c2176c = C2176c.f25551e;
        C2176c c2176c2 = C2176c.f25552f;
        C1111f c1111f = p0.f26141a;
        f25487a = new C1111f(18, c2176c, c2176c2);
        f25488b = AbstractC2232b.j(5, null);
        long j = 1;
        long j10 = (j & 4294967295L) | (j << 32);
        f25489c = AbstractC2232b.j(1, new V0.i(j10));
        f25490d = AbstractC2232b.j(1, new V0.k(j10));
    }

    public static H a(o0 o0Var, int i7) {
        InterfaceC2249t interfaceC2249t = o0Var;
        if ((i7 & 1) != 0) {
            interfaceC2249t = AbstractC2232b.j(5, null);
        }
        return new H(new V(new J(interfaceC2249t), (C2194v) null, (N) null, (LinkedHashMap) null, 62));
    }

    public static I b(o0 o0Var, int i7) {
        InterfaceC2249t interfaceC2249t = o0Var;
        if ((i7 & 1) != 0) {
            interfaceC2249t = AbstractC2232b.j(5, null);
        }
        return new I(new V(new J(interfaceC2249t), (C2194v) null, (N) null, (LinkedHashMap) null, 62));
    }
}
