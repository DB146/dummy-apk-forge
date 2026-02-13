package O7;

import L7.C0385e;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public L7.k f7497a;

    /* renamed from: b, reason: collision with root package name */
    public C0385e f7498b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f7497a.equals(hVar.f7497a)) {
            return this.f7498b.equals(hVar.f7498b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7498b.hashCode() + (this.f7497a.hashCode() * 31);
    }
}
