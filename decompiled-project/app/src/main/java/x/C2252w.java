package x;

/* renamed from: x.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2252w implements InterfaceC2250u {

    /* renamed from: a, reason: collision with root package name */
    public final int f26156a;

    /* renamed from: b, reason: collision with root package name */
    public final r f26157b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26158c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26159d;

    public C2252w(int i7, int i10, r rVar) {
        this.f26156a = i7;
        this.f26157b = rVar;
        this.f26158c = i7 * 1000000;
        this.f26159d = i10 * 1000000;
    }

    @Override // x.InterfaceC2250u
    public final float b(long j, float f4, float f10, float f11) {
        long j10 = j - this.f26159d;
        if (j10 < 0) {
            j10 = 0;
        }
        long j11 = this.f26158c;
        if (j10 > j11) {
            j10 = j11;
        }
        float d10 = this.f26157b.d(this.f26156a == 0 ? 1.0f : ((float) j10) / ((float) j11));
        return (f10 * d10) + ((1 - d10) * f4);
    }

    @Override // x.InterfaceC2250u
    public final float c(long j, float f4, float f10, float f11) {
        long j10 = j - this.f26159d;
        if (j10 < 0) {
            j10 = 0;
        }
        long j11 = this.f26158c;
        long j12 = j10 > j11 ? j11 : j10;
        if (j12 == 0) {
            return f11;
        }
        return (b(j12, f4, f10, f11) - b(j12 - 1000000, f4, f10, f11)) * 1000.0f;
    }

    @Override // x.InterfaceC2250u
    public final long d(float f4, float f10, float f11) {
        return this.f26159d + this.f26158c;
    }
}
