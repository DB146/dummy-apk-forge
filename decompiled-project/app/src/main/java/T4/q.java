package T4;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final long f9303a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9304b;

    public q(long j, long j10) {
        this.f9303a = j;
        this.f9304b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.f9303a == qVar.f9303a && this.f9304b == qVar.f9304b;
    }

    public final int hashCode() {
        return (((int) this.f9303a) * 31) + ((int) this.f9304b);
    }
}
