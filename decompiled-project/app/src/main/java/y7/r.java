package y7;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;

/* loaded from: classes.dex */
public final class r implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final r f27375a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f27376b = C0786c.a("processName");

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f27377c = C0786c.a("pid");

    /* renamed from: d, reason: collision with root package name */
    public static final C0786c f27378d = C0786c.a("importance");

    /* renamed from: e, reason: collision with root package name */
    public static final C0786c f27379e = C0786c.a("defaultProcess");

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        C2416a0 c2416a0 = (C2416a0) ((D0) obj);
        interfaceC0788e.f(f27376b, c2416a0.f27225a);
        interfaceC0788e.b(f27377c, c2416a0.f27226b);
        interfaceC0788e.b(f27378d, c2416a0.f27227c);
        interfaceC0788e.g(f27379e, c2416a0.f27228d);
    }
}
