package C;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final int f2333a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2334b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2335c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2336d;

    public B(int i7, int i10, int i11, int i12) {
        this.f2333a = i7;
        this.f2334b = i10;
        this.f2335c = i11;
        this.f2336d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b2 = (B) obj;
        return this.f2333a == b2.f2333a && this.f2334b == b2.f2334b && this.f2335c == b2.f2335c && this.f2336d == b2.f2336d;
    }

    public final int hashCode() {
        return (((((this.f2333a * 31) + this.f2334b) * 31) + this.f2335c) * 31) + this.f2336d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InsetsValues(left=");
        sb2.append(this.f2333a);
        sb2.append(", top=");
        sb2.append(this.f2334b);
        sb2.append(", right=");
        sb2.append(this.f2335c);
        sb2.append(", bottom=");
        return X.c.k(sb2, this.f2336d, ')');
    }
}
