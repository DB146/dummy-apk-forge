package y7;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;

/* renamed from: y7.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2425f implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2425f f27271a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f27272b = C0786c.a("filename");

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f27273c = C0786c.a("contents");

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        H h10 = (H) ((s0) obj);
        interfaceC0788e.f(f27272b, h10.f27123a);
        interfaceC0788e.f(f27273c, h10.f27124b);
    }
}
