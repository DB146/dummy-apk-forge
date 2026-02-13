package cc;

/* loaded from: classes2.dex */
public final class W extends X {

    /* renamed from: c, reason: collision with root package name */
    public final I0 f14507c;

    public W(long j, I0 i02) {
        super(j);
        this.f14507c = i02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14507c.run();
    }

    @Override // cc.X
    public final String toString() {
        return super.toString() + this.f14507c;
    }
}
