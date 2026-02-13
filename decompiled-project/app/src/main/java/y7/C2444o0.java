package y7;

/* renamed from: y7.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2444o0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f27362a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27363b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f27364c;

    public C2444o0(String str, String str2, boolean z8) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f27362a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f27363b = str2;
        this.f27364c = z8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2444o0)) {
            return false;
        }
        C2444o0 c2444o0 = (C2444o0) obj;
        return this.f27362a.equals(c2444o0.f27362a) && this.f27363b.equals(c2444o0.f27363b) && this.f27364c == c2444o0.f27364c;
    }

    public final int hashCode() {
        return ((((this.f27362a.hashCode() ^ 1000003) * 1000003) ^ this.f27363b.hashCode()) * 1000003) ^ (this.f27364c ? 1231 : 1237);
    }

    public final String toString() {
        return "OsData{osRelease=" + this.f27362a + ", osCodeName=" + this.f27363b + ", isRooted=" + this.f27364c + "}";
    }
}
