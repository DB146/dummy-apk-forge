package y7;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;

/* renamed from: y7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2415a implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2415a f27221a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f27222b = C0786c.a("arch");

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f27223c = C0786c.a("libraryName");

    /* renamed from: d, reason: collision with root package name */
    public static final C0786c f27224d = C0786c.a("buildId");

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        C2413E c2413e = (C2413E) ((p0) obj);
        interfaceC0788e.f(f27222b, c2413e.f27116a);
        interfaceC0788e.f(f27223c, c2413e.f27117b);
        interfaceC0788e.f(f27224d, c2413e.f27118c);
    }
}
