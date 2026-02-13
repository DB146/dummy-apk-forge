package C;

import A0.InterfaceC0035y;
import y0.AbstractC2323H;
import y0.InterfaceC2317B;

/* loaded from: classes.dex */
public final class E extends c0.l implements InterfaceC0035y {

    /* renamed from: C, reason: collision with root package name */
    public float f2343C;

    /* renamed from: D, reason: collision with root package name */
    public float f2344D;

    /* renamed from: E, reason: collision with root package name */
    public float f2345E;

    /* renamed from: F, reason: collision with root package name */
    public float f2346F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f2347G;

    @Override // A0.InterfaceC0035y
    public final InterfaceC2317B e(A0.T t5, y0.z zVar, long j) {
        int B10 = t5.B(this.f2345E) + t5.B(this.f2343C);
        int B11 = t5.B(this.f2346F) + t5.B(this.f2344D);
        AbstractC2323H b2 = zVar.b(V0.b.h(-B10, -B11, j));
        return t5.Q(V0.b.f(b2.f26554a + B10, j), V0.b.e(b2.f26555b + B11, j), Eb.w.f3892a, new D(this, b2, t5, 0));
    }
}
