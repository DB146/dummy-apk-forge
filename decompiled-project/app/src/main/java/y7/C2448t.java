package y7;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;

/* renamed from: y7.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2448t implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2448t f27386a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f27387b = C0786c.a("timestamp");

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f27388c = C0786c.a("type");

    /* renamed from: d, reason: collision with root package name */
    public static final C0786c f27389d = C0786c.a("app");

    /* renamed from: e, reason: collision with root package name */
    public static final C0786c f27390e = C0786c.a("device");

    /* renamed from: f, reason: collision with root package name */
    public static final C0786c f27391f = C0786c.a("log");
    public static final C0786c g = C0786c.a("rollouts");

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        P p10 = (P) ((K0) obj);
        interfaceC0788e.a(f27387b, p10.f27173a);
        interfaceC0788e.f(f27388c, p10.f27174b);
        interfaceC0788e.f(f27389d, p10.f27175c);
        interfaceC0788e.f(f27390e, p10.f27176d);
        interfaceC0788e.f(f27391f, p10.f27177e);
        interfaceC0788e.f(g, p10.f27178f);
    }
}
