package y7;

/* renamed from: y7.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2416a0 extends D0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f27225a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27226b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27227c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f27228d;

    public C2416a0(int i7, int i10, String str, boolean z8) {
        this.f27225a = str;
        this.f27226b = i7;
        this.f27227c = i10;
        this.f27228d = z8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D0)) {
            return false;
        }
        D0 d02 = (D0) obj;
        if (this.f27225a.equals(((C2416a0) d02).f27225a)) {
            C2416a0 c2416a0 = (C2416a0) d02;
            if (this.f27226b == c2416a0.f27226b && this.f27227c == c2416a0.f27227c && this.f27228d == c2416a0.f27228d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f27225a.hashCode() ^ 1000003) * 1000003) ^ this.f27226b) * 1000003) ^ this.f27227c) * 1000003) ^ (this.f27228d ? 1231 : 1237);
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f27225a + ", pid=" + this.f27226b + ", importance=" + this.f27227c + ", defaultProcess=" + this.f27228d + "}";
    }
}
