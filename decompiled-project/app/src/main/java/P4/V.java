package P4;

import m4.C1558a0;
import m5.InterfaceC1615l;
import s4.C1980h;

/* loaded from: classes.dex */
public final class V implements A {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1615l f7951a;

    /* renamed from: b, reason: collision with root package name */
    public final A1.d f7952b;

    /* renamed from: c, reason: collision with root package name */
    public final l2.X f7953c;

    /* renamed from: d, reason: collision with root package name */
    public final Y5.B f7954d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7955e;

    public V(InterfaceC1615l interfaceC1615l, C1980h c1980h) {
        A1.d dVar = new A1.d(c1980h, 28);
        l2.X x2 = new l2.X();
        Y5.B b2 = new Y5.B(14);
        this.f7951a = interfaceC1615l;
        this.f7952b = dVar;
        this.f7953c = x2;
        this.f7954d = b2;
        this.f7955e = 1048576;
    }

    @Override // P4.A
    public final AbstractC0453a a(C1558a0 c1558a0) {
        c1558a0.f20224b.getClass();
        return new W(c1558a0, this.f7951a, this.f7952b, this.f7953c.e(c1558a0), this.f7954d, this.f7955e);
    }
}
