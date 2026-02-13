package y7;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;

/* renamed from: y7.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2439m implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2439m f27332a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f27333b = C0786c.a("threads");

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f27334c = C0786c.a("exception");

    /* renamed from: d, reason: collision with root package name */
    public static final C0786c f27335d = C0786c.a("appExitInfo");

    /* renamed from: e, reason: collision with root package name */
    public static final C0786c f27336e = C0786c.a("signal");

    /* renamed from: f, reason: collision with root package name */
    public static final C0786c f27337f = C0786c.a("binaries");

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        S s3 = (S) ((C0) obj);
        interfaceC0788e.f(f27333b, s3.f27185a);
        interfaceC0788e.f(f27334c, s3.f27186b);
        interfaceC0788e.f(f27335d, s3.f27187c);
        interfaceC0788e.f(f27336e, s3.f27188d);
        interfaceC0788e.f(f27337f, s3.f27189e);
    }
}
