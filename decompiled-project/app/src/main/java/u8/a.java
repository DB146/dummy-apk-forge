package u8;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f24880a;

    public a(HashSet hashSet) {
        this.f24880a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f24880a.equals(((a) obj).f24880a);
    }

    public final int hashCode() {
        return this.f24880a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f24880a + "}";
    }
}
