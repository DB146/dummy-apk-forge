package P4;

/* loaded from: classes.dex */
public final class L implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f7873a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7874b;

    public L(d0 d0Var, long j) {
        this.f7873a = d0Var;
        this.f7874b = j;
    }

    @Override // P4.d0
    public final void a() {
        this.f7873a.a();
    }

    @Override // P4.d0
    public final boolean b() {
        return this.f7873a.b();
    }

    @Override // P4.d0
    public final int f(ha.g gVar, q4.g gVar2, int i7) {
        int f4 = this.f7873a.f(gVar, gVar2, i7);
        if (f4 == -4) {
            gVar2.f23460f = Math.max(0L, gVar2.f23460f + this.f7874b);
        }
        return f4;
    }

    @Override // P4.d0
    public final int h(long j) {
        return this.f7873a.h(j - this.f7874b);
    }
}
