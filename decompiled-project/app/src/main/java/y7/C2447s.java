package y7;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;

/* renamed from: y7.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2447s implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2447s f27380a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f27381b = C0786c.a("batteryLevel");

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f27382c = C0786c.a("batteryVelocity");

    /* renamed from: d, reason: collision with root package name */
    public static final C0786c f27383d = C0786c.a("proximityOn");

    /* renamed from: e, reason: collision with root package name */
    public static final C0786c f27384e = C0786c.a("orientation");

    /* renamed from: f, reason: collision with root package name */
    public static final C0786c f27385f = C0786c.a("ramUsed");
    public static final C0786c g = C0786c.a("diskUsed");

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        C2420c0 c2420c0 = (C2420c0) ((F0) obj);
        interfaceC0788e.f(f27381b, c2420c0.f27246a);
        interfaceC0788e.b(f27382c, c2420c0.f27247b);
        interfaceC0788e.g(f27383d, c2420c0.f27248c);
        interfaceC0788e.b(f27384e, c2420c0.f27249d);
        interfaceC0788e.a(f27385f, c2420c0.f27250e);
        interfaceC0788e.a(g, c2420c0.f27251f);
    }
}
