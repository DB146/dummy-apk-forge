package j0;

/* loaded from: classes.dex */
public final class B implements V0.c {

    /* renamed from: A, reason: collision with root package name */
    public V0.c f18496A;

    /* renamed from: B, reason: collision with root package name */
    public V0.l f18497B;

    /* renamed from: C, reason: collision with root package name */
    public AbstractC1362A f18498C;

    /* renamed from: a, reason: collision with root package name */
    public int f18499a;

    /* renamed from: b, reason: collision with root package name */
    public float f18500b;

    /* renamed from: c, reason: collision with root package name */
    public float f18501c;

    /* renamed from: d, reason: collision with root package name */
    public float f18502d;

    /* renamed from: e, reason: collision with root package name */
    public float f18503e;

    /* renamed from: f, reason: collision with root package name */
    public long f18504f;

    /* renamed from: u, reason: collision with root package name */
    public long f18505u;

    /* renamed from: v, reason: collision with root package name */
    public float f18506v;

    /* renamed from: w, reason: collision with root package name */
    public long f18507w;

    /* renamed from: x, reason: collision with root package name */
    public D f18508x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f18509y;

    /* renamed from: z, reason: collision with root package name */
    public long f18510z;

    public final void a(float f4) {
        if (this.f18502d == f4) {
            return;
        }
        this.f18499a |= 4;
        this.f18502d = f4;
    }

    public final void b(float f4) {
        if (this.f18500b == f4) {
            return;
        }
        this.f18499a |= 1;
        this.f18500b = f4;
    }

    public final void c(float f4) {
        if (this.f18501c == f4) {
            return;
        }
        this.f18499a |= 2;
        this.f18501c = f4;
    }

    public final void d(long j) {
        if (G.a(this.f18507w, j)) {
            return;
        }
        this.f18499a |= 4096;
        this.f18507w = j;
    }

    @Override // V0.c
    public final float f() {
        return this.f18496A.f();
    }

    @Override // V0.c
    public final float k() {
        return this.f18496A.k();
    }
}
