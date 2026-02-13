package A8;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;

/* renamed from: A8.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0040d implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0040d f641a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f642b = C0786c.a("appId");

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f643c = C0786c.a("deviceModel");

    /* renamed from: d, reason: collision with root package name */
    public static final C0786c f644d = C0786c.a("sessionSdkVersion");

    /* renamed from: e, reason: collision with root package name */
    public static final C0786c f645e = C0786c.a("osVersion");

    /* renamed from: f, reason: collision with root package name */
    public static final C0786c f646f = C0786c.a("logEnvironment");
    public static final C0786c g = C0786c.a("androidAppInfo");

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        C0038b c0038b = (C0038b) obj;
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        interfaceC0788e.f(f642b, c0038b.f627a);
        interfaceC0788e.f(f643c, c0038b.f628b);
        interfaceC0788e.f(f644d, "2.1.2");
        interfaceC0788e.f(f645e, c0038b.f629c);
        interfaceC0788e.f(f646f, C.LOG_ENVIRONMENT_PROD);
        interfaceC0788e.f(g, c0038b.f630d);
    }
}
