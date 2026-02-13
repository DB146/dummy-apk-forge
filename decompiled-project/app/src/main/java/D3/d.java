package D3;

/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final e f3169a;

    /* renamed from: b, reason: collision with root package name */
    public int f3170b;

    /* renamed from: c, reason: collision with root package name */
    public Class f3171c;

    public d(e eVar) {
        this.f3169a = eVar;
    }

    @Override // D3.h
    public final void a() {
        this.f3169a.u(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f3170b == dVar.f3170b && this.f3171c == dVar.f3171c;
    }

    public final int hashCode() {
        int i7 = this.f3170b * 31;
        Class cls = this.f3171c;
        return i7 + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f3170b + "array=" + this.f3171c + '}';
    }
}
