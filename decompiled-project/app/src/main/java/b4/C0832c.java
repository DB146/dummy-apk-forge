package b4;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;
import d8.C1056a;
import e4.C1088d;

/* renamed from: b4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0832c implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0832c f13838a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f13839b = new C0786c("eventsDroppedCount", X.c.p(X.c.o(d8.e.class, new C1056a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f13840c = new C0786c("reason", X.c.p(X.c.o(d8.e.class, new C1056a(3))));

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        C1088d c1088d = (C1088d) obj;
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        interfaceC0788e.a(f13839b, c1088d.f16791a);
        interfaceC0788e.f(f13840c, c1088d.f16792b);
    }
}
