package cc;

/* loaded from: classes2.dex */
public final class K0 extends A {

    /* renamed from: c, reason: collision with root package name */
    public static final K0 f14488c = new A();

    @Override // cc.A
    public final void T(Hb.i iVar, Runnable runnable) {
        O0 o02 = (O0) iVar.get(O0.f14496c);
        if (o02 == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        o02.f14497b = true;
    }

    @Override // cc.A
    public final A W(int i7) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // cc.A
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
