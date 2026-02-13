package b4;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;
import d8.C1056a;
import e4.C1085a;

/* renamed from: b4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0830a implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0830a f13831a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f13832b = new C0786c("window", X.c.p(X.c.o(d8.e.class, new C1056a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f13833c = new C0786c("logSourceMetrics", X.c.p(X.c.o(d8.e.class, new C1056a(2))));

    /* renamed from: d, reason: collision with root package name */
    public static final C0786c f13834d = new C0786c("globalMetrics", X.c.p(X.c.o(d8.e.class, new C1056a(3))));

    /* renamed from: e, reason: collision with root package name */
    public static final C0786c f13835e = new C0786c("appNamespace", X.c.p(X.c.o(d8.e.class, new C1056a(4))));

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        C1085a c1085a = (C1085a) obj;
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        interfaceC0788e.f(f13832b, c1085a.f16777a);
        interfaceC0788e.f(f13833c, c1085a.f16778b);
        interfaceC0788e.f(f13834d, c1085a.f16779c);
        interfaceC0788e.f(f13835e, c1085a.f16780d);
    }
}
