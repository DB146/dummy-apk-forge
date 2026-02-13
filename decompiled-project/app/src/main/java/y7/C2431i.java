package y7;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;

/* renamed from: y7.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2431i implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2431i f27289a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f27290b = C0786c.a("arch");

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f27291c = C0786c.a("model");

    /* renamed from: d, reason: collision with root package name */
    public static final C0786c f27292d = C0786c.a("cores");

    /* renamed from: e, reason: collision with root package name */
    public static final C0786c f27293e = C0786c.a("ram");

    /* renamed from: f, reason: collision with root package name */
    public static final C0786c f27294f = C0786c.a("diskSpace");
    public static final C0786c g = C0786c.a("simulator");

    /* renamed from: h, reason: collision with root package name */
    public static final C0786c f27295h = C0786c.a("state");

    /* renamed from: i, reason: collision with root package name */
    public static final C0786c f27296i = C0786c.a("manufacturer");
    public static final C0786c j = C0786c.a("modelClass");

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        N n6 = (N) ((w0) obj);
        interfaceC0788e.b(f27290b, n6.f27158a);
        interfaceC0788e.f(f27291c, n6.f27159b);
        interfaceC0788e.b(f27292d, n6.f27160c);
        interfaceC0788e.a(f27293e, n6.f27161d);
        interfaceC0788e.a(f27294f, n6.f27162e);
        interfaceC0788e.g(g, n6.f27163f);
        interfaceC0788e.b(f27295h, n6.g);
        interfaceC0788e.f(f27296i, n6.f27164h);
        interfaceC0788e.f(j, n6.f27165i);
    }
}
