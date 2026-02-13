package y7;

/* loaded from: classes.dex */
public final class T extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f27190a;

    /* renamed from: b, reason: collision with root package name */
    public final long f27191b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27192c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27193d;

    public T(long j, long j10, String str, String str2) {
        this.f27190a = j;
        this.f27191b = j10;
        this.f27192c = str;
        this.f27193d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        if (this.f27190a == ((T) x0Var).f27190a) {
            T t5 = (T) x0Var;
            if (this.f27191b == t5.f27191b && this.f27192c.equals(t5.f27192c)) {
                String str = t5.f27193d;
                String str2 = this.f27193d;
                if (str2 == null) {
                    if (str == null) {
                        return true;
                    }
                } else if (str2.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f27190a;
        long j10 = this.f27191b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f27192c.hashCode()) * 1000003;
        String str = this.f27193d;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.f27190a);
        sb2.append(", size=");
        sb2.append(this.f27191b);
        sb2.append(", name=");
        sb2.append(this.f27192c);
        sb2.append(", uuid=");
        return h3.o.p(sb2, this.f27193d, "}");
    }
}
