package y7;

/* renamed from: y7.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2428g0 extends H0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f27285a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27286b;

    public C2428g0(String str, String str2) {
        this.f27285a = str;
        this.f27286b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        H0 h02 = (H0) obj;
        return this.f27285a.equals(((C2428g0) h02).f27285a) && this.f27286b.equals(((C2428g0) h02).f27286b);
    }

    public final int hashCode() {
        return ((this.f27285a.hashCode() ^ 1000003) * 1000003) ^ this.f27286b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f27285a);
        sb2.append(", variantId=");
        return h3.o.p(sb2, this.f27286b, "}");
    }
}
