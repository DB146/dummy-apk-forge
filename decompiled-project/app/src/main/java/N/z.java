package N;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final H.b f7124a;

    /* renamed from: b, reason: collision with root package name */
    public final H.b f7125b;

    /* renamed from: c, reason: collision with root package name */
    public final H.b f7126c;

    /* renamed from: d, reason: collision with root package name */
    public final H.b f7127d;

    /* renamed from: e, reason: collision with root package name */
    public final H.b f7128e;

    public z() {
        H.b bVar = y.f7119a;
        H.b bVar2 = y.f7120b;
        H.b bVar3 = y.f7121c;
        H.b bVar4 = y.f7122d;
        H.b bVar5 = y.f7123e;
        this.f7124a = bVar;
        this.f7125b = bVar2;
        this.f7126c = bVar3;
        this.f7127d = bVar4;
        this.f7128e = bVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return kotlin.jvm.internal.l.a(this.f7124a, zVar.f7124a) && kotlin.jvm.internal.l.a(this.f7125b, zVar.f7125b) && kotlin.jvm.internal.l.a(this.f7126c, zVar.f7126c) && kotlin.jvm.internal.l.a(this.f7127d, zVar.f7127d) && kotlin.jvm.internal.l.a(this.f7128e, zVar.f7128e);
    }

    public final int hashCode() {
        return this.f7128e.hashCode() + ((this.f7127d.hashCode() + ((this.f7126c.hashCode() + ((this.f7125b.hashCode() + (this.f7124a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f7124a + ", small=" + this.f7125b + ", medium=" + this.f7126c + ", large=" + this.f7127d + ", extraLarge=" + this.f7128e + ')';
    }
}
