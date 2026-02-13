package C3;

/* loaded from: classes.dex */
public final class t implements A {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2625a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2626b;

    /* renamed from: c, reason: collision with root package name */
    public final A f2627c;

    /* renamed from: d, reason: collision with root package name */
    public final n f2628d;

    /* renamed from: e, reason: collision with root package name */
    public final s f2629e;

    /* renamed from: f, reason: collision with root package name */
    public int f2630f;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2631u;

    public t(A a9, boolean z8, boolean z10, s sVar, n nVar) {
        W3.g.c(a9, "Argument must not be null");
        this.f2627c = a9;
        this.f2625a = z8;
        this.f2626b = z10;
        this.f2629e = sVar;
        W3.g.c(nVar, "Argument must not be null");
        this.f2628d = nVar;
    }

    public final synchronized void a() {
        if (this.f2631u) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f2630f++;
    }

    @Override // C3.A
    public final int b() {
        return this.f2627c.b();
    }

    @Override // C3.A
    public final Class c() {
        return this.f2627c.c();
    }

    @Override // C3.A
    public final synchronized void d() {
        if (this.f2630f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f2631u) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f2631u = true;
        if (this.f2626b) {
            this.f2627c.d();
        }
    }

    public final void e() {
        boolean z8;
        synchronized (this) {
            int i7 = this.f2630f;
            if (i7 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z8 = true;
            int i10 = i7 - 1;
            this.f2630f = i10;
            if (i10 != 0) {
                z8 = false;
            }
        }
        if (z8) {
            this.f2628d.e(this.f2629e, this);
        }
    }

    @Override // C3.A
    public final Object get() {
        return this.f2627c.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f2625a + ", listener=" + this.f2628d + ", key=" + this.f2629e + ", acquired=" + this.f2630f + ", isRecycled=" + this.f2631u + ", resource=" + this.f2627c + '}';
    }
}
