package P4;

import m4.C1558a0;
import m4.L0;

/* loaded from: classes.dex */
public abstract class p0 extends AbstractC0462j {

    /* renamed from: y, reason: collision with root package name */
    public final AbstractC0453a f8123y;

    public p0(AbstractC0453a abstractC0453a) {
        this.f8123y = abstractC0453a;
    }

    public B A(B b2) {
        return b2;
    }

    public abstract void B(L0 l02);

    public void C() {
        z(null, this.f8123y);
    }

    @Override // P4.AbstractC0453a
    public final L0 h() {
        return this.f8123y.h();
    }

    @Override // P4.AbstractC0453a
    public final C1558a0 i() {
        return this.f8123y.i();
    }

    @Override // P4.AbstractC0453a
    public final boolean j() {
        return this.f8123y.j();
    }

    @Override // P4.AbstractC0453a
    public final void n(m5.T t5) {
        this.f8068x = t5;
        this.f8067w = n5.D.m(null);
        C();
    }

    @Override // P4.AbstractC0462j
    public final B v(Object obj, B b2) {
        return A(b2);
    }

    @Override // P4.AbstractC0462j
    public final long w(Object obj, long j) {
        return j;
    }

    @Override // P4.AbstractC0462j
    public final int x(int i7, Object obj) {
        return i7;
    }

    @Override // P4.AbstractC0462j
    public final void y(Object obj, AbstractC0453a abstractC0453a, L0 l02) {
        B(l02);
    }
}
