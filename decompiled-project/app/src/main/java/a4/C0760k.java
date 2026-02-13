package a4;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;

/* renamed from: a4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0760k implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0760k f12654a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f12655b = C0786c.a("networkType");

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f12656c = C0786c.a("mobileSubtype");

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        C0771v c0771v = (C0771v) ((AbstractC0748I) obj);
        interfaceC0788e.f(f12655b, c0771v.f12688a);
        interfaceC0788e.f(f12656c, c0771v.f12689b);
    }
}
