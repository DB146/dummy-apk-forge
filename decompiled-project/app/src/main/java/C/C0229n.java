package C;

import java.util.List;
import y0.InterfaceC2316A;
import y0.InterfaceC2317B;

/* renamed from: C.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0229n implements InterfaceC2316A {

    /* renamed from: b, reason: collision with root package name */
    public static final C0229n f2413b = new C0229n(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0229n f2414c = new C0229n(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2415a;

    public /* synthetic */ C0229n(int i7) {
        this.f2415a = i7;
    }

    @Override // y0.InterfaceC2316A
    public final InterfaceC2317B c(A0.T t5, List list, long j) {
        switch (this.f2415a) {
            case 0:
                return t5.Q(V0.a.j(j), V0.a.i(j), Eb.w.f3892a, C0228m.f2409b);
            default:
                return t5.Q(V0.a.f(j) ? V0.a.h(j) : 0, V0.a.e(j) ? V0.a.g(j) : 0, Eb.w.f3892a, C0228m.f2411d);
        }
    }
}
