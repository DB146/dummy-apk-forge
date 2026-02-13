package x7;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;

/* renamed from: x7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2269a implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2269a f26235a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f26236b = C0786c.a("rolloutId");

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f26237c = C0786c.a("parameterKey");

    /* renamed from: d, reason: collision with root package name */
    public static final C0786c f26238d = C0786c.a("parameterValue");

    /* renamed from: e, reason: collision with root package name */
    public static final C0786c f26239e = C0786c.a("variantId");

    /* renamed from: f, reason: collision with root package name */
    public static final C0786c f26240f = C0786c.a("templateVersion");

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        b bVar = (b) ((n) obj);
        interfaceC0788e.f(f26236b, bVar.f26241b);
        interfaceC0788e.f(f26237c, bVar.f26242c);
        interfaceC0788e.f(f26238d, bVar.f26243d);
        interfaceC0788e.f(f26239e, bVar.f26244e);
        interfaceC0788e.a(f26240f, bVar.f26245f);
    }
}
