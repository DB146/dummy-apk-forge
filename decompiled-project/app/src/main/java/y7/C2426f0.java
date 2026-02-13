package y7;

/* renamed from: y7.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2426f0 extends I0 {

    /* renamed from: a, reason: collision with root package name */
    public final C2428g0 f27274a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27275b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27276c;

    /* renamed from: d, reason: collision with root package name */
    public final long f27277d;

    public C2426f0(C2428g0 c2428g0, String str, String str2, long j) {
        this.f27274a = c2428g0;
        this.f27275b = str;
        this.f27276c = str2;
        this.f27277d = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof I0)) {
            return false;
        }
        C2426f0 c2426f0 = (C2426f0) ((I0) obj);
        if (this.f27274a.equals(c2426f0.f27274a)) {
            if (this.f27275b.equals(c2426f0.f27275b) && this.f27276c.equals(c2426f0.f27276c) && this.f27277d == c2426f0.f27277d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.f27274a.hashCode() ^ 1000003) * 1000003) ^ this.f27275b.hashCode()) * 1000003) ^ this.f27276c.hashCode()) * 1000003;
        long j = this.f27277d;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f27274a);
        sb2.append(", parameterKey=");
        sb2.append(this.f27275b);
        sb2.append(", parameterValue=");
        sb2.append(this.f27276c);
        sb2.append(", templateVersion=");
        return X.c.f(this.f27277d, "}", sb2);
    }
}
