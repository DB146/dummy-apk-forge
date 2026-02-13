package y8;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f27429a;

    public d(HashSet hashSet) {
        this.f27429a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        return this.f27429a.equals(((d) obj).f27429a);
    }

    public final int hashCode() {
        return this.f27429a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f27429a + "}";
    }
}
