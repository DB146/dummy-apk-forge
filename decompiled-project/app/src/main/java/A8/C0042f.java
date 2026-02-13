package A8;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;

/* renamed from: A8.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0042f implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0042f f654a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f655b = C0786c.a("processName");

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f656c = C0786c.a("pid");

    /* renamed from: d, reason: collision with root package name */
    public static final C0786c f657d = C0786c.a("importance");

    /* renamed from: e, reason: collision with root package name */
    public static final C0786c f658e = C0786c.a("defaultProcess");

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        D d10 = (D) obj;
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        interfaceC0788e.f(f655b, d10.f539a);
        interfaceC0788e.b(f656c, d10.f540b);
        interfaceC0788e.b(f657d, d10.f541c);
        interfaceC0788e.g(f658e, d10.f542d);
    }
}
