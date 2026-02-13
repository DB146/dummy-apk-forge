package a4;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;

/* renamed from: a4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0751b implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0751b f12614a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f12615b = C0786c.a("sdkVersion");

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f12616c = C0786c.a("model");

    /* renamed from: d, reason: collision with root package name */
    public static final C0786c f12617d = C0786c.a("hardware");

    /* renamed from: e, reason: collision with root package name */
    public static final C0786c f12618e = C0786c.a("device");

    /* renamed from: f, reason: collision with root package name */
    public static final C0786c f12619f = C0786c.a("product");
    public static final C0786c g = C0786c.a("osBuild");

    /* renamed from: h, reason: collision with root package name */
    public static final C0786c f12620h = C0786c.a("manufacturer");

    /* renamed from: i, reason: collision with root package name */
    public static final C0786c f12621i = C0786c.a("fingerprint");
    public static final C0786c j = C0786c.a("locale");
    public static final C0786c k = C0786c.a("country");

    /* renamed from: l, reason: collision with root package name */
    public static final C0786c f12622l = C0786c.a("mccMnc");

    /* renamed from: m, reason: collision with root package name */
    public static final C0786c f12623m = C0786c.a("applicationBuild");

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        C0761l c0761l = (C0761l) ((AbstractC0750a) obj);
        interfaceC0788e.f(f12615b, c0761l.f12657a);
        interfaceC0788e.f(f12616c, c0761l.f12658b);
        interfaceC0788e.f(f12617d, c0761l.f12659c);
        interfaceC0788e.f(f12618e, c0761l.f12660d);
        interfaceC0788e.f(f12619f, c0761l.f12661e);
        interfaceC0788e.f(g, c0761l.f12662f);
        interfaceC0788e.f(f12620h, c0761l.g);
        interfaceC0788e.f(f12621i, c0761l.f12663h);
        interfaceC0788e.f(j, c0761l.f12664i);
        interfaceC0788e.f(k, c0761l.j);
        interfaceC0788e.f(f12622l, c0761l.k);
        interfaceC0788e.f(f12623m, c0761l.f12665l);
    }
}
