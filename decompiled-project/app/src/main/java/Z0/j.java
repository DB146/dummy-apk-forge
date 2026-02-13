package Z0;

import h3.o;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12121a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12122b;

    /* renamed from: c, reason: collision with root package name */
    public final l f12123c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12124d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12125e;

    public j() {
        l lVar = l.f12130a;
        this.f12121a = true;
        this.f12122b = true;
        this.f12123c = lVar;
        this.f12124d = true;
        this.f12125e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f12121a == jVar.f12121a && this.f12122b == jVar.f12122b && this.f12123c == jVar.f12123c && this.f12124d == jVar.f12124d && this.f12125e == jVar.f12125e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12125e) + o.g(this.f12124d, (this.f12123c.hashCode() + o.g(this.f12122b, Boolean.hashCode(this.f12121a) * 31, 31)) * 31, 31);
    }
}
