package y7;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;

/* renamed from: y7.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2427g implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2427g f27278a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f27279b = C0786c.a("identifier");

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f27280c = C0786c.a("version");

    /* renamed from: d, reason: collision with root package name */
    public static final C0786c f27281d = C0786c.a("displayVersion");

    /* renamed from: e, reason: collision with root package name */
    public static final C0786c f27282e = C0786c.a("organization");

    /* renamed from: f, reason: collision with root package name */
    public static final C0786c f27283f = C0786c.a("installationUuid");
    public static final C0786c g = C0786c.a("developmentPlatform");

    /* renamed from: h, reason: collision with root package name */
    public static final C0786c f27284h = C0786c.a("developmentPlatformVersion");

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        K k = (K) ((v0) obj);
        interfaceC0788e.f(f27279b, k.f27144a);
        interfaceC0788e.f(f27280c, k.f27145b);
        interfaceC0788e.f(f27281d, k.f27146c);
        interfaceC0788e.f(f27282e, null);
        interfaceC0788e.f(f27283f, k.f27147d);
        interfaceC0788e.f(g, k.f27148e);
        interfaceC0788e.f(f27284h, k.f27149f);
    }
}
