package Eb;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f3894a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3895b;

    public y(int i7, Object obj) {
        this.f3894a = i7;
        this.f3895b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f3894a == yVar.f3894a && kotlin.jvm.internal.l.a(this.f3895b, yVar.f3895b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f3894a) * 31;
        Object obj = this.f3895b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f3894a + ", value=" + this.f3895b + ')';
    }
}
