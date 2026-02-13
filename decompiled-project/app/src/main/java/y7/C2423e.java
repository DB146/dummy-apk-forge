package y7;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;

/* renamed from: y7.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2423e implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2423e f27263a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f27264b = C0786c.a("files");

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f27265c = C0786c.a("orgId");

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        G g = (G) ((t0) obj);
        interfaceC0788e.f(f27264b, g.f27121a);
        interfaceC0788e.f(f27265c, g.f27122b);
    }
}
