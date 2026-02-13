package b4;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;
import d8.C1056a;
import e4.C1091g;

/* renamed from: b4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0836g implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0836g f13848a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f13849b = new C0786c("startMs", X.c.p(X.c.o(d8.e.class, new C1056a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f13850c = new C0786c("endMs", X.c.p(X.c.o(d8.e.class, new C1056a(2))));

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        C1091g c1091g = (C1091g) obj;
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        interfaceC0788e.a(f13849b, c1091g.f16798a);
        interfaceC0788e.a(f13850c, c1091g.f16799b);
    }
}
