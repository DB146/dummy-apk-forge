package Db;

/* loaded from: classes2.dex */
public final class f implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final f f3350b = new f();

    /* renamed from: a, reason: collision with root package name */
    public final int f3351a = 131584;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f other = (f) obj;
        kotlin.jvm.internal.l.e(other, "other");
        return this.f3351a - other.f3351a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        f fVar = obj instanceof f ? (f) obj : null;
        return fVar != null && this.f3351a == fVar.f3351a;
    }

    public final int hashCode() {
        return this.f3351a;
    }

    public final String toString() {
        return "2.2.0";
    }
}
