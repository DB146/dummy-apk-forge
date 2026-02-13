package q3;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f23386a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23387b;

    public j(String workSpecId, int i7) {
        kotlin.jvm.internal.l.e(workSpecId, "workSpecId");
        this.f23386a = workSpecId;
        this.f23387b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.l.a(this.f23386a, jVar.f23386a) && this.f23387b == jVar.f23387b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23387b) + (this.f23386a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb2.append(this.f23386a);
        sb2.append(", generation=");
        return X.c.k(sb2, this.f23387b, ')');
    }
}
