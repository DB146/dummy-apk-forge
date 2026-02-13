package y7;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;

/* renamed from: y7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2419c implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2419c f27243a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f27244b = C0786c.a("key");

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f27245c = C0786c.a("value");

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        C2414F c2414f = (C2414F) ((r0) obj);
        interfaceC0788e.f(f27244b, c2414f.f27119a);
        interfaceC0788e.f(f27245c, c2414f.f27120b);
    }
}
