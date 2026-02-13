package cc;

/* loaded from: classes2.dex */
public final class V extends X {

    /* renamed from: c, reason: collision with root package name */
    public final C0944m f14505c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Z f14506d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(Z z8, long j, C0944m c0944m) {
        super(j);
        this.f14506d = z8;
        this.f14505c = c0944m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14505c.B(this.f14506d);
    }

    @Override // cc.X
    public final String toString() {
        return super.toString() + this.f14505c;
    }
}
