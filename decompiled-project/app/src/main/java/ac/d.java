package ac;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f12831a;

    /* renamed from: b, reason: collision with root package name */
    public final Xb.g f12832b;

    public d(String str, Xb.g gVar) {
        this.f12831a = str;
        this.f12832b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.l.a(this.f12831a, dVar.f12831a) && kotlin.jvm.internal.l.a(this.f12832b, dVar.f12832b);
    }

    public final int hashCode() {
        return this.f12832b.hashCode() + (this.f12831a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f12831a + ", range=" + this.f12832b + ')';
    }
}
