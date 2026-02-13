package l2;

import B0.C0215z0;

/* loaded from: classes.dex */
public final class O implements InterfaceC1477v, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final String f19171a;

    /* renamed from: b, reason: collision with root package name */
    public final N f19172b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19173c;

    public O(String str, N n6) {
        this.f19171a = str;
        this.f19172b = n6;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    public final void l(C1481z lifecycle, q3.s registry) {
        kotlin.jvm.internal.l.e(registry, "registry");
        kotlin.jvm.internal.l.e(lifecycle, "lifecycle");
        if (this.f19173c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f19173c = true;
        lifecycle.a(this);
        registry.D(this.f19171a, (C0215z0) this.f19172b.f19170b.f926e);
    }

    @Override // l2.InterfaceC1477v
    public final void onStateChanged(InterfaceC1479x interfaceC1479x, r rVar) {
        if (rVar == r.ON_DESTROY) {
            this.f19173c = false;
            interfaceC1479x.w().f(this);
        }
    }
}
