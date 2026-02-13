package y7;

import java.util.List;

/* renamed from: y7.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2430h0 extends J0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f27288a;

    public C2430h0(List list) {
        this.f27288a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof J0)) {
            return false;
        }
        return this.f27288a.equals(((C2430h0) ((J0) obj)).f27288a);
    }

    public final int hashCode() {
        return this.f27288a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f27288a + "}";
    }
}
