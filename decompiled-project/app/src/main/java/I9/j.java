package I9;

import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Ra.c f5333a;

    /* renamed from: b, reason: collision with root package name */
    public final Ra.b f5334b;

    public j(Ra.c cVar, Ra.b bVar) {
        this.f5333a = cVar;
        this.f5334b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return l.a(this.f5333a, jVar.f5333a) && l.a(this.f5334b, jVar.f5334b);
    }

    public final int hashCode() {
        return this.f5334b.hashCode() + (this.f5333a.hashCode() * 31);
    }

    public final String toString() {
        return "HistoryIteractors(getListHistory=" + this.f5333a + ", getHistoryForMediaItem=" + this.f5334b + ")";
    }
}
