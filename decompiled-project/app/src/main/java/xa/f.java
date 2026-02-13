package xa;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final na.b f26292a;

    /* renamed from: b, reason: collision with root package name */
    public final na.b f26293b;

    /* renamed from: c, reason: collision with root package name */
    public final na.a f26294c;

    public f(na.b bVar, na.b bVar2, na.a aVar) {
        this.f26292a = bVar;
        this.f26293b = bVar2;
        this.f26294c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.l.a(this.f26292a, fVar.f26292a) && kotlin.jvm.internal.l.a(this.f26293b, fVar.f26293b) && kotlin.jvm.internal.l.a(this.f26294c, fVar.f26294c);
    }

    public final int hashCode() {
        return this.f26294c.hashCode() + ((this.f26293b.hashCode() + (this.f26292a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FootballInteractors(getListFootballMatch=" + this.f26292a + ", getLinkStreamForFootballMatch=" + this.f26293b + ", getLinkStreamByFootballTeam=" + this.f26294c + ")";
    }
}
