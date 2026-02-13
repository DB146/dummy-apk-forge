package y7;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;

/* renamed from: y7.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2445p implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2445p f27365a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f27366b = C0786c.a("name");

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f27367c = C0786c.a("importance");

    /* renamed from: d, reason: collision with root package name */
    public static final C0786c f27368d = C0786c.a("frames");

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        W w10 = (W) ((B0) obj);
        interfaceC0788e.f(f27366b, w10.f27202a);
        interfaceC0788e.b(f27367c, w10.f27203b);
        interfaceC0788e.f(f27368d, w10.f27204c);
    }
}
