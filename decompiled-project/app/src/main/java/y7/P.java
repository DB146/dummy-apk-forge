package y7;

/* loaded from: classes.dex */
public final class P extends K0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f27173a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27174b;

    /* renamed from: c, reason: collision with root package name */
    public final Q f27175c;

    /* renamed from: d, reason: collision with root package name */
    public final C2420c0 f27176d;

    /* renamed from: e, reason: collision with root package name */
    public final C2422d0 f27177e;

    /* renamed from: f, reason: collision with root package name */
    public final C2430h0 f27178f;

    public P(long j, String str, Q q10, C2420c0 c2420c0, C2422d0 c2422d0, C2430h0 c2430h0) {
        this.f27173a = j;
        this.f27174b = str;
        this.f27175c = q10;
        this.f27176d = c2420c0;
        this.f27177e = c2422d0;
        this.f27178f = c2430h0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y7.O, java.lang.Object] */
    public final O a() {
        ?? obj = new Object();
        obj.f27166a = this.f27173a;
        obj.f27167b = this.f27174b;
        obj.f27168c = this.f27175c;
        obj.f27169d = this.f27176d;
        obj.f27170e = this.f27177e;
        obj.f27171f = this.f27178f;
        obj.g = (byte) 1;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof K0)) {
            return false;
        }
        P p10 = (P) ((K0) obj);
        if (this.f27173a == p10.f27173a) {
            if (this.f27174b.equals(p10.f27174b) && this.f27175c.equals(p10.f27175c) && this.f27176d.equals(p10.f27176d)) {
                C2422d0 c2422d0 = p10.f27177e;
                C2422d0 c2422d02 = this.f27177e;
                if (c2422d02 != null ? c2422d02.equals(c2422d0) : c2422d0 == null) {
                    C2430h0 c2430h0 = p10.f27178f;
                    C2430h0 c2430h02 = this.f27178f;
                    if (c2430h02 == null) {
                        if (c2430h0 == null) {
                            return true;
                        }
                    } else if (c2430h02.equals(c2430h0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f27173a;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f27174b.hashCode()) * 1000003) ^ this.f27175c.hashCode()) * 1000003) ^ this.f27176d.hashCode()) * 1000003;
        C2422d0 c2422d0 = this.f27177e;
        int hashCode2 = (hashCode ^ (c2422d0 == null ? 0 : c2422d0.hashCode())) * 1000003;
        C2430h0 c2430h0 = this.f27178f;
        return hashCode2 ^ (c2430h0 != null ? c2430h0.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.f27173a + ", type=" + this.f27174b + ", app=" + this.f27175c + ", device=" + this.f27176d + ", log=" + this.f27177e + ", rollouts=" + this.f27178f + "}";
    }
}
