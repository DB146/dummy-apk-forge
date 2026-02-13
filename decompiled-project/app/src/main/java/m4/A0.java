package m4;

import P4.AbstractC0468p;

/* loaded from: classes.dex */
public final class A0 extends AbstractC0468p {

    /* renamed from: c, reason: collision with root package name */
    public final K0 f19804c;

    public A0(L0 l02) {
        super(l02);
        this.f19804c = new K0();
    }

    @Override // P4.AbstractC0468p, m4.L0
    public final J0 f(int i7, J0 j02, boolean z8) {
        L0 l02 = this.f8122b;
        J0 f4 = l02.f(i7, j02, z8);
        if (l02.m(f4.f19965c, this.f19804c, 0L).a()) {
            f4.i(j02.f19963a, j02.f19964b, j02.f19965c, j02.f19966d, j02.f19967e, Q4.b.f8638f, true);
        } else {
            f4.f19968f = true;
        }
        return f4;
    }
}
