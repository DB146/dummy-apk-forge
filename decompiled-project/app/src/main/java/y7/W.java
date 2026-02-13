package y7;

import java.util.List;

/* loaded from: classes.dex */
public final class W extends B0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f27202a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27203b;

    /* renamed from: c, reason: collision with root package name */
    public final List f27204c;

    public W(String str, int i7, List list) {
        this.f27202a = str;
        this.f27203b = i7;
        this.f27204c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b02 = (B0) obj;
        if (this.f27202a.equals(((W) b02).f27202a)) {
            W w10 = (W) b02;
            if (this.f27203b == w10.f27203b && this.f27204c.equals(w10.f27204c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f27202a.hashCode() ^ 1000003) * 1000003) ^ this.f27203b) * 1000003) ^ this.f27204c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f27202a + ", importance=" + this.f27203b + ", frames=" + this.f27204c + "}";
    }
}
