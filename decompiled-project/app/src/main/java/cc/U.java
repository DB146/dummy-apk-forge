package cc;

/* loaded from: classes2.dex */
public final class U implements InterfaceC0931f0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14504a;

    public U(boolean z8) {
        this.f14504a = z8;
    }

    @Override // cc.InterfaceC0931f0
    public final y0 c() {
        return null;
    }

    @Override // cc.InterfaceC0931f0
    public final boolean isActive() {
        return this.f14504a;
    }

    public final String toString() {
        return A3.c.l(new StringBuilder("Empty{"), this.f14504a ? "Active" : "New", '}');
    }
}
