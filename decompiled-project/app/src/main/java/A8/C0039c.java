package A8;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;

/* renamed from: A8.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0039c implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0039c f633a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f634b = C0786c.a("packageName");

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f635c = C0786c.a("versionName");

    /* renamed from: d, reason: collision with root package name */
    public static final C0786c f636d = C0786c.a("appBuildVersion");

    /* renamed from: e, reason: collision with root package name */
    public static final C0786c f637e = C0786c.a("deviceManufacturer");

    /* renamed from: f, reason: collision with root package name */
    public static final C0786c f638f = C0786c.a("currentProcessDetails");
    public static final C0786c g = C0786c.a("appProcessDetails");

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        C0037a c0037a = (C0037a) obj;
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        interfaceC0788e.f(f634b, c0037a.f615a);
        interfaceC0788e.f(f635c, c0037a.f616b);
        interfaceC0788e.f(f636d, c0037a.f617c);
        interfaceC0788e.f(f637e, c0037a.f618d);
        interfaceC0788e.f(f638f, c0037a.f619e);
        interfaceC0788e.f(g, c0037a.f620f);
    }
}
