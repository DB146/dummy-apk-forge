package P4;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final int f7909a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7910b;

    public S(int i7, boolean z8) {
        this.f7909a = i7;
        this.f7910b = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || S.class != obj.getClass()) {
            return false;
        }
        S s3 = (S) obj;
        return this.f7909a == s3.f7909a && this.f7910b == s3.f7910b;
    }

    public final int hashCode() {
        return (this.f7909a * 31) + (this.f7910b ? 1 : 0);
    }
}
