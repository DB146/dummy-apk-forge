package y7;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;

/* renamed from: y7.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2437l implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2437l f27324a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f27325b = C0786c.a("baseAddress");

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f27326c = C0786c.a("size");

    /* renamed from: d, reason: collision with root package name */
    public static final C0786c f27327d = C0786c.a("name");

    /* renamed from: e, reason: collision with root package name */
    public static final C0786c f27328e = C0786c.a("uuid");

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        T t5 = (T) ((x0) obj);
        interfaceC0788e.a(f27325b, t5.f27190a);
        interfaceC0788e.a(f27326c, t5.f27191b);
        interfaceC0788e.f(f27327d, t5.f27192c);
        String str = t5.f27193d;
        interfaceC0788e.f(f27328e, str != null ? str.getBytes(O0.f27172a) : null);
    }
}
