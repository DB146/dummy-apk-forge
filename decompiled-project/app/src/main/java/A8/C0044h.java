package A8;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;

/* renamed from: A8.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0044h implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0044h f665a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f666b = C0786c.a("sessionId");

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f667c = C0786c.a("firstSessionId");

    /* renamed from: d, reason: collision with root package name */
    public static final C0786c f668d = C0786c.a("sessionIndex");

    /* renamed from: e, reason: collision with root package name */
    public static final C0786c f669e = C0786c.a("eventTimestampUs");

    /* renamed from: f, reason: collision with root package name */
    public static final C0786c f670f = C0786c.a("dataCollectionStatus");
    public static final C0786c g = C0786c.a("firebaseInstallationId");

    /* renamed from: h, reason: collision with root package name */
    public static final C0786c f671h = C0786c.a("firebaseAuthenticationToken");

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        interfaceC0788e.f(f666b, a0Var.f621a);
        interfaceC0788e.f(f667c, a0Var.f622b);
        interfaceC0788e.b(f668d, a0Var.f623c);
        interfaceC0788e.a(f669e, a0Var.f624d);
        interfaceC0788e.f(f670f, a0Var.f625e);
        interfaceC0788e.f(g, a0Var.f626f);
        interfaceC0788e.f(f671h, a0Var.g);
    }
}
