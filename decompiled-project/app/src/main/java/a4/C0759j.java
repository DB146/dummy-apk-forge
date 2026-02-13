package a4;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;

/* renamed from: a4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0759j implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0759j f12647a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f12648b = C0786c.a("requestTimeMs");

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f12649c = C0786c.a("requestUptimeMs");

    /* renamed from: d, reason: collision with root package name */
    public static final C0786c f12650d = C0786c.a("clientInfo");

    /* renamed from: e, reason: collision with root package name */
    public static final C0786c f12651e = C0786c.a("logSource");

    /* renamed from: f, reason: collision with root package name */
    public static final C0786c f12652f = C0786c.a("logSourceName");
    public static final C0786c g = C0786c.a("logEvent");

    /* renamed from: h, reason: collision with root package name */
    public static final C0786c f12653h = C0786c.a("qosTier");

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        C0769t c0769t = (C0769t) ((AbstractC0745F) obj);
        interfaceC0788e.a(f12648b, c0769t.f12681a);
        interfaceC0788e.a(f12649c, c0769t.f12682b);
        interfaceC0788e.f(f12650d, c0769t.f12683c);
        interfaceC0788e.f(f12651e, c0769t.f12684d);
        interfaceC0788e.f(f12652f, c0769t.f12685e);
        interfaceC0788e.f(g, c0769t.f12686f);
        interfaceC0788e.f(f12653h, EnumC0749J.f12612a);
    }
}
