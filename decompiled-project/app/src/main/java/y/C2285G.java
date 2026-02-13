package y;

import j0.AbstractC1362A;

/* renamed from: y.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2285G implements j0.D, InterfaceC2287I {

    /* renamed from: b, reason: collision with root package name */
    public static final C2285G f26407b = new C2285G(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C2285G f26408c = new C2285G(1);

    /* renamed from: d, reason: collision with root package name */
    public static final C2285G f26409d = new C2285G(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26410a;

    public /* synthetic */ C2285G(int i7) {
        this.f26410a = i7;
    }

    @Override // y.InterfaceC2287I
    public void a(A0.N n6) {
        n6.a();
    }

    @Override // j0.D
    public AbstractC1362A d(long j, V0.l lVar, V0.c cVar) {
        switch (this.f26410a) {
            case 0:
                float B10 = cVar.B(AbstractC2311t.f26526a);
                return new j0.w(new i0.c(0.0f, -B10, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + B10));
            default:
                float B11 = cVar.B(AbstractC2311t.f26526a);
                return new j0.w(new i0.c(-B11, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + B11, Float.intBitsToFloat((int) (j & 4294967295L))));
        }
    }
}
