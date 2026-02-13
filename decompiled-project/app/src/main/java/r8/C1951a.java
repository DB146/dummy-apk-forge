package r8;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;
import d8.C1056a;
import s8.EnumC1999a;

/* renamed from: r8.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1951a implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final C1951a f23813a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f23814b = new C0786c("projectNumber", X.c.p(X.c.o(d8.e.class, new C1056a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f23815c = new C0786c("messageId", X.c.p(X.c.o(d8.e.class, new C1056a(2))));

    /* renamed from: d, reason: collision with root package name */
    public static final C0786c f23816d = new C0786c("instanceId", X.c.p(X.c.o(d8.e.class, new C1056a(3))));

    /* renamed from: e, reason: collision with root package name */
    public static final C0786c f23817e = new C0786c("messageType", X.c.p(X.c.o(d8.e.class, new C1056a(4))));

    /* renamed from: f, reason: collision with root package name */
    public static final C0786c f23818f = new C0786c("sdkPlatform", X.c.p(X.c.o(d8.e.class, new C1056a(5))));
    public static final C0786c g = new C0786c("packageName", X.c.p(X.c.o(d8.e.class, new C1056a(6))));

    /* renamed from: h, reason: collision with root package name */
    public static final C0786c f23819h = new C0786c("collapseKey", X.c.p(X.c.o(d8.e.class, new C1056a(7))));

    /* renamed from: i, reason: collision with root package name */
    public static final C0786c f23820i = new C0786c("priority", X.c.p(X.c.o(d8.e.class, new C1056a(8))));
    public static final C0786c j = new C0786c("ttl", X.c.p(X.c.o(d8.e.class, new C1056a(9))));
    public static final C0786c k = new C0786c("topic", X.c.p(X.c.o(d8.e.class, new C1056a(10))));

    /* renamed from: l, reason: collision with root package name */
    public static final C0786c f23821l = new C0786c("bulkId", X.c.p(X.c.o(d8.e.class, new C1056a(11))));

    /* renamed from: m, reason: collision with root package name */
    public static final C0786c f23822m = new C0786c("event", X.c.p(X.c.o(d8.e.class, new C1056a(12))));

    /* renamed from: n, reason: collision with root package name */
    public static final C0786c f23823n = new C0786c("analyticsLabel", X.c.p(X.c.o(d8.e.class, new C1056a(13))));

    /* renamed from: o, reason: collision with root package name */
    public static final C0786c f23824o = new C0786c("campaignId", X.c.p(X.c.o(d8.e.class, new C1056a(14))));

    /* renamed from: p, reason: collision with root package name */
    public static final C0786c f23825p = new C0786c("composerLabel", X.c.p(X.c.o(d8.e.class, new C1056a(15))));

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        s8.d dVar = (s8.d) obj;
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        interfaceC0788e.a(f23814b, dVar.f24199a);
        interfaceC0788e.f(f23815c, dVar.f24200b);
        interfaceC0788e.f(f23816d, dVar.f24201c);
        interfaceC0788e.f(f23817e, dVar.f24202d);
        interfaceC0788e.f(f23818f, s8.c.ANDROID);
        interfaceC0788e.f(g, dVar.f24203e);
        interfaceC0788e.f(f23819h, dVar.f24204f);
        interfaceC0788e.b(f23820i, dVar.g);
        interfaceC0788e.b(j, dVar.f24205h);
        interfaceC0788e.f(k, dVar.f24206i);
        interfaceC0788e.a(f23821l, 0L);
        interfaceC0788e.f(f23822m, EnumC1999a.MESSAGE_DELIVERED);
        interfaceC0788e.f(f23823n, dVar.j);
        interfaceC0788e.a(f23824o, 0L);
        interfaceC0788e.f(f23825p, dVar.k);
    }
}
