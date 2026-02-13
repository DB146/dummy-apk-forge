package K0;

/* renamed from: K0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0373c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5866a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5867b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5868c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5869d;

    public C0373c(Object obj, int i7, int i10) {
        this(obj, i7, i10, "");
    }

    public C0373c(Object obj, int i7, int i10, String str) {
        this.f5866a = obj;
        this.f5867b = i7;
        this.f5868c = i10;
        this.f5869d = str;
        if (i7 <= i10) {
            return;
        }
        P0.a.a("Reversed range is not supported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0373c)) {
            return false;
        }
        C0373c c0373c = (C0373c) obj;
        return kotlin.jvm.internal.l.a(this.f5866a, c0373c.f5866a) && this.f5867b == c0373c.f5867b && this.f5868c == c0373c.f5868c && kotlin.jvm.internal.l.a(this.f5869d, c0373c.f5869d);
    }

    public final int hashCode() {
        Object obj = this.f5866a;
        return this.f5869d.hashCode() + A3.c.c(this.f5868c, A3.c.c(this.f5867b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Range(item=");
        sb2.append(this.f5866a);
        sb2.append(", start=");
        sb2.append(this.f5867b);
        sb2.append(", end=");
        sb2.append(this.f5868c);
        sb2.append(", tag=");
        return A3.c.l(sb2, this.f5869d, ')');
    }
}
