package y7;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;

/* renamed from: y7.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2433j implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2433j f27302a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f27303b = C0786c.a("generator");

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f27304c = C0786c.a("identifier");

    /* renamed from: d, reason: collision with root package name */
    public static final C0786c f27305d = C0786c.a("appQualitySessionId");

    /* renamed from: e, reason: collision with root package name */
    public static final C0786c f27306e = C0786c.a("startedAt");

    /* renamed from: f, reason: collision with root package name */
    public static final C0786c f27307f = C0786c.a("endedAt");
    public static final C0786c g = C0786c.a("crashed");

    /* renamed from: h, reason: collision with root package name */
    public static final C0786c f27308h = C0786c.a("app");

    /* renamed from: i, reason: collision with root package name */
    public static final C0786c f27309i = C0786c.a("user");
    public static final C0786c j = C0786c.a("os");
    public static final C0786c k = C0786c.a("device");

    /* renamed from: l, reason: collision with root package name */
    public static final C0786c f27310l = C0786c.a("events");

    /* renamed from: m, reason: collision with root package name */
    public static final C0786c f27311m = C0786c.a("generatorType");

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        J j10 = (J) ((N0) obj);
        interfaceC0788e.f(f27303b, j10.f27135a);
        interfaceC0788e.f(f27304c, j10.f27136b.getBytes(O0.f27172a));
        interfaceC0788e.f(f27305d, j10.f27137c);
        interfaceC0788e.a(f27306e, j10.f27138d);
        interfaceC0788e.f(f27307f, j10.f27139e);
        interfaceC0788e.g(g, j10.f27140f);
        interfaceC0788e.f(f27308h, j10.g);
        interfaceC0788e.f(f27309i, j10.f27141h);
        interfaceC0788e.f(j, j10.f27142i);
        interfaceC0788e.f(k, j10.j);
        interfaceC0788e.f(f27310l, j10.k);
        interfaceC0788e.b(f27311m, j10.f27143l);
    }
}
