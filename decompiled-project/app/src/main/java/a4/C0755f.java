package a4;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;

/* renamed from: a4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0755f implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0755f f12632a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f12633b = C0786c.a("clearBlob");

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f12634c = C0786c.a("encryptedBlob");

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        C0765p c0765p = (C0765p) ((AbstractC0741B) obj);
        interfaceC0788e.f(f12633b, c0765p.f12669a);
        interfaceC0788e.f(f12634c, c0765p.f12670b);
    }
}
