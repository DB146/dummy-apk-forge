package l2;

/* renamed from: l2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1476u implements InterfaceC1477v, cc.E {

    /* renamed from: a, reason: collision with root package name */
    public final C1481z f19235a;

    /* renamed from: b, reason: collision with root package name */
    public final Hb.i f19236b;

    public C1476u(C1481z c1481z, Hb.i coroutineContext) {
        kotlin.jvm.internal.l.e(coroutineContext, "coroutineContext");
        this.f19235a = c1481z;
        this.f19236b = coroutineContext;
        if (c1481z.f19242d == EnumC1474s.f19227a) {
            cc.F.h(coroutineContext, null);
        }
    }

    @Override // cc.E
    public final Hb.i l() {
        return this.f19236b;
    }

    @Override // l2.InterfaceC1477v
    public final void onStateChanged(InterfaceC1479x interfaceC1479x, r rVar) {
        C1481z c1481z = this.f19235a;
        if (c1481z.f19242d.compareTo(EnumC1474s.f19227a) <= 0) {
            c1481z.f(this);
            cc.F.h(this.f19236b, null);
        }
    }
}
