package a4;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;

/* renamed from: a4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0758i implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0758i f12639a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f12640b = C0786c.a("eventTimeMs");

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f12641c = C0786c.a("eventCode");

    /* renamed from: d, reason: collision with root package name */
    public static final C0786c f12642d = C0786c.a("complianceData");

    /* renamed from: e, reason: collision with root package name */
    public static final C0786c f12643e = C0786c.a("eventUptimeMs");

    /* renamed from: f, reason: collision with root package name */
    public static final C0786c f12644f = C0786c.a("sourceExtension");
    public static final C0786c g = C0786c.a("sourceExtensionJsonProto3");

    /* renamed from: h, reason: collision with root package name */
    public static final C0786c f12645h = C0786c.a("timezoneOffsetSeconds");

    /* renamed from: i, reason: collision with root package name */
    public static final C0786c f12646i = C0786c.a("networkConnectionInfo");
    public static final C0786c j = C0786c.a("experimentIds");

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        C0768s c0768s = (C0768s) ((AbstractC0744E) obj);
        interfaceC0788e.a(f12640b, c0768s.f12673a);
        interfaceC0788e.f(f12641c, c0768s.f12674b);
        interfaceC0788e.f(f12642d, c0768s.f12675c);
        interfaceC0788e.a(f12643e, c0768s.f12676d);
        interfaceC0788e.f(f12644f, c0768s.f12677e);
        interfaceC0788e.f(g, c0768s.f12678f);
        interfaceC0788e.a(f12645h, c0768s.g);
        interfaceC0788e.f(f12646i, c0768s.f12679h);
        interfaceC0788e.f(j, c0768s.f12680i);
    }
}
