package y7;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;

/* renamed from: y7.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2443o implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2443o f27358a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f27359b = C0786c.a("name");

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f27360c = C0786c.a("code");

    /* renamed from: d, reason: collision with root package name */
    public static final C0786c f27361d = C0786c.a("address");

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        V v10 = (V) ((z0) obj);
        interfaceC0788e.f(f27359b, v10.f27199a);
        interfaceC0788e.f(f27360c, v10.f27200b);
        interfaceC0788e.a(f27361d, v10.f27201c);
    }
}
