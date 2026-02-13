package b4;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;
import d8.C1056a;
import e4.C1090f;

/* renamed from: b4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0835f implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0835f f13845a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f13846b = new C0786c("currentCacheSizeBytes", X.c.p(X.c.o(d8.e.class, new C1056a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f13847c = new C0786c("maxCacheSizeBytes", X.c.p(X.c.o(d8.e.class, new C1056a(2))));

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        C1090f c1090f = (C1090f) obj;
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        interfaceC0788e.a(f13846b, c1090f.f16796a);
        interfaceC0788e.a(f13847c, c1090f.f16797b);
    }
}
