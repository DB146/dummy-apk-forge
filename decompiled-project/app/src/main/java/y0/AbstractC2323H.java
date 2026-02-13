package y0;

/* renamed from: y0.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2323H {

    /* renamed from: a, reason: collision with root package name */
    public int f26554a;

    /* renamed from: b, reason: collision with root package name */
    public int f26555b;

    /* renamed from: c, reason: collision with root package name */
    public long f26556c;

    /* renamed from: d, reason: collision with root package name */
    public long f26557d = AbstractC2325J.f26562a;

    /* renamed from: e, reason: collision with root package name */
    public long f26558e = 0;

    public AbstractC2323H() {
        long j = 0;
        this.f26556c = (j & 4294967295L) | (j << 32);
    }

    public int H() {
        return (int) (this.f26556c & 4294967295L);
    }

    public int I() {
        return (int) (this.f26556c >> 32);
    }

    public final void L() {
        this.f26554a = h3.H.k((int) (this.f26556c >> 32), V0.a.j(this.f26557d), V0.a.h(this.f26557d));
        this.f26555b = h3.H.k((int) (this.f26556c & 4294967295L), V0.a.i(this.f26557d), V0.a.g(this.f26557d));
        int i7 = this.f26554a;
        long j = this.f26556c;
        this.f26558e = (((i7 - ((int) (j >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j & 4294967295L))) / 2));
    }

    public abstract void M(long j, float f4, Rb.c cVar);

    public final void N(long j) {
        if (V0.k.a(this.f26556c, j)) {
            return;
        }
        this.f26556c = j;
        L();
    }

    public final void O(long j) {
        if (V0.a.b(this.f26557d, j)) {
            return;
        }
        this.f26557d = j;
        L();
    }

    public abstract Object d();
}
