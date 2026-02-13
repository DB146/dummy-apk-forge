package b4;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;
import d8.C1056a;
import e4.C1089e;

/* renamed from: b4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0833d implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0833d f13841a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f13842b = new C0786c("logSource", X.c.p(X.c.o(d8.e.class, new C1056a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f13843c = new C0786c("logEventDropped", X.c.p(X.c.o(d8.e.class, new C1056a(2))));

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        C1089e c1089e = (C1089e) obj;
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        interfaceC0788e.f(f13842b, c1089e.f16794a);
        interfaceC0788e.f(f13843c, c1089e.f16795b);
    }
}
