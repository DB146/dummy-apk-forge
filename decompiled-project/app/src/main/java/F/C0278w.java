package F;

import java.util.Map;
import u.AbstractC2060m;
import u.C2070x;
import y0.InterfaceC2317B;
import y0.InterfaceC2318C;
import y0.InterfaceC2332Q;

/* renamed from: F.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0278w implements InterfaceC2318C {

    /* renamed from: a, reason: collision with root package name */
    public final r f4018a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2332Q f4019b;

    /* renamed from: c, reason: collision with root package name */
    public final E.j f4020c;

    /* renamed from: d, reason: collision with root package name */
    public final C2070x f4021d;

    public C0278w(r rVar, InterfaceC2332Q interfaceC2332Q) {
        this.f4018a = rVar;
        this.f4019b = interfaceC2332Q;
        this.f4020c = (E.j) rVar.f3997b.invoke();
        C2070x c2070x = AbstractC2060m.f24696a;
        this.f4021d = new C2070x();
    }

    @Override // V0.c
    public final int B(float f4) {
        return this.f4019b.B(f4);
    }

    @Override // V0.c
    public final long G(long j) {
        return this.f4019b.G(j);
    }

    @Override // V0.c
    public final float J(long j) {
        return this.f4019b.J(j);
    }

    @Override // V0.c
    public final long P(float f4) {
        return this.f4019b.P(f4);
    }

    @Override // y0.InterfaceC2318C
    public final InterfaceC2317B Q(int i7, int i10, Map map, Rb.c cVar) {
        return this.f4019b.Q(i7, i10, map, cVar);
    }

    @Override // V0.c
    public final float W(int i7) {
        return this.f4019b.W(i7);
    }

    @Override // V0.c
    public final float a0(float f4) {
        return this.f4019b.a0(f4);
    }

    @Override // V0.c
    public final float f() {
        return this.f4019b.f();
    }

    @Override // y0.InterfaceC2318C
    public final V0.l getLayoutDirection() {
        return this.f4019b.getLayoutDirection();
    }

    @Override // V0.c
    public final float k() {
        return this.f4019b.k();
    }

    @Override // y0.InterfaceC2318C
    public final boolean m() {
        return this.f4019b.m();
    }

    @Override // V0.c
    public final long n(float f4) {
        return this.f4019b.n(f4);
    }

    @Override // V0.c
    public final float p(float f4) {
        return this.f4019b.p(f4);
    }

    @Override // y0.InterfaceC2318C
    public final InterfaceC2317B q(int i7, int i10, Map map, Rb.c cVar) {
        return this.f4019b.q(i7, i10, map, cVar);
    }

    @Override // V0.c
    public final float y(long j) {
        return this.f4019b.y(j);
    }
}
