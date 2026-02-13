package A8;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final String f539a;

    /* renamed from: b, reason: collision with root package name */
    public final int f540b;

    /* renamed from: c, reason: collision with root package name */
    public final int f541c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f542d;

    public D(int i7, int i10, String str, boolean z8) {
        this.f539a = str;
        this.f540b = i7;
        this.f541c = i10;
        this.f542d = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        return kotlin.jvm.internal.l.a(this.f539a, d10.f539a) && this.f540b == d10.f540b && this.f541c == d10.f541c && this.f542d == d10.f542d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int c10 = A3.c.c(this.f541c, A3.c.c(this.f540b, this.f539a.hashCode() * 31, 31), 31);
        boolean z8 = this.f542d;
        int i7 = z8;
        if (z8 != 0) {
            i7 = 1;
        }
        return c10 + i7;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f539a + ", pid=" + this.f540b + ", importance=" + this.f541c + ", isDefaultProcess=" + this.f542d + ')';
    }
}
