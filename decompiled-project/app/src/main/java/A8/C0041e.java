package A8;

import a8.C0786c;
import a8.InterfaceC0787d;
import a8.InterfaceC0788e;

/* renamed from: A8.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0041e implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0041e f647a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0786c f648b = C0786c.a("performance");

    /* renamed from: c, reason: collision with root package name */
    public static final C0786c f649c = C0786c.a("crashlytics");

    /* renamed from: d, reason: collision with root package name */
    public static final C0786c f650d = C0786c.a("sessionSamplingRate");

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        C0047k c0047k = (C0047k) obj;
        InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
        interfaceC0788e.f(f648b, c0047k.f694a);
        interfaceC0788e.f(f649c, c0047k.f695b);
        interfaceC0788e.c(f650d, c0047k.f696c);
    }
}
