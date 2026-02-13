package y8;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;

/* renamed from: y8.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2455a implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2455a f27412a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f27413b = C0786c.a("rolloutId");

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f27414c = C0786c.a("variantId");

    /* renamed from: d, reason: collision with root package name */
    public static final C0786c f27415d = C0786c.a("parameterKey");

    /* renamed from: e, reason: collision with root package name */
    public static final C0786c f27416e = C0786c.a("parameterValue");

    /* renamed from: f, reason: collision with root package name */
    public static final C0786c f27417f = C0786c.a("templateVersion");

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        c cVar = (c) ((e) obj);
        interfaceC0788e.f(f27413b, cVar.f27424b);
        interfaceC0788e.f(f27414c, cVar.f27425c);
        interfaceC0788e.f(f27415d, cVar.f27426d);
        interfaceC0788e.f(f27416e, cVar.f27427e);
        interfaceC0788e.a(f27417f, cVar.f27428f);
    }
}
