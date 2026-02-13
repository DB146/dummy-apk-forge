package y7;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;

/* renamed from: y7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2417b implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2417b f27229a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f27230b = C0786c.a("pid");

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f27231c = C0786c.a("processName");

    /* renamed from: d, reason: collision with root package name */
    public static final C0786c f27232d = C0786c.a("reasonCode");

    /* renamed from: e, reason: collision with root package name */
    public static final C0786c f27233e = C0786c.a("importance");

    /* renamed from: f, reason: collision with root package name */
    public static final C0786c f27234f = C0786c.a("pss");
    public static final C0786c g = C0786c.a("rss");

    /* renamed from: h, reason: collision with root package name */
    public static final C0786c f27235h = C0786c.a("timestamp");

    /* renamed from: i, reason: collision with root package name */
    public static final C0786c f27236i = C0786c.a("traceFile");
    public static final C0786c j = C0786c.a("buildIdMappingForArch");

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        C2412D c2412d = (C2412D) ((q0) obj);
        interfaceC0788e.b(f27230b, c2412d.f27108a);
        interfaceC0788e.f(f27231c, c2412d.f27109b);
        interfaceC0788e.b(f27232d, c2412d.f27110c);
        interfaceC0788e.b(f27233e, c2412d.f27111d);
        interfaceC0788e.a(f27234f, c2412d.f27112e);
        interfaceC0788e.a(g, c2412d.f27113f);
        interfaceC0788e.a(f27235h, c2412d.g);
        interfaceC0788e.f(f27236i, c2412d.f27114h);
        interfaceC0788e.f(j, c2412d.f27115i);
    }
}
