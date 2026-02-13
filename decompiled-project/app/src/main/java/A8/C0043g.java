package A8;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;

/* renamed from: A8.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0043g implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0043g f661a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f662b = C0786c.a("eventType");

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f663c = C0786c.a("sessionData");

    /* renamed from: d, reason: collision with root package name */
    public static final C0786c f664d = C0786c.a("applicationInfo");

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        Q q10 = (Q) obj;
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        q10.getClass();
        interfaceC0788e.f(f662b, EnumC0050n.SESSION_START);
        interfaceC0788e.f(f663c, q10.f578a);
        interfaceC0788e.f(f664d, q10.f579b);
    }
}
