package i4;

/* renamed from: i4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1345a {

    /* renamed from: f, reason: collision with root package name */
    public static final C1345a f18400f = new C1345a(10485760, 200, 10000, 604800000, 81920);

    /* renamed from: a, reason: collision with root package name */
    public final long f18401a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18402b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18403c;

    /* renamed from: d, reason: collision with root package name */
    public final long f18404d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18405e;

    public C1345a(long j, int i7, int i10, long j10, int i11) {
        this.f18401a = j;
        this.f18402b = i7;
        this.f18403c = i10;
        this.f18404d = j10;
        this.f18405e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1345a)) {
            return false;
        }
        C1345a c1345a = (C1345a) obj;
        return this.f18401a == c1345a.f18401a && this.f18402b == c1345a.f18402b && this.f18403c == c1345a.f18403c && this.f18404d == c1345a.f18404d && this.f18405e == c1345a.f18405e;
    }

    public final int hashCode() {
        long j = this.f18401a;
        int i7 = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f18402b) * 1000003) ^ this.f18403c) * 1000003;
        long j10 = this.f18404d;
        return ((i7 ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f18405e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f18401a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f18402b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f18403c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.f18404d);
        sb2.append(", maxBlobByteSizePerRow=");
        return A3.c.k(sb2, this.f18405e, "}");
    }
}
