package J6;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f5560a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5561b;

    public l(int i7, long j) {
        this.f5560a = i7;
        this.f5561b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f5560a == lVar.f5560a && this.f5561b == lVar.f5561b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f5561b;
        return ((int) (j ^ (j >>> 32))) ^ ((this.f5560a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.f5560a);
        sb2.append(", eventTimestamp=");
        return X.c.f(this.f5561b, "}", sb2);
    }
}
