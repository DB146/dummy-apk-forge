package C3;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class s implements A3.h {

    /* renamed from: b, reason: collision with root package name */
    public final Object f2618b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2619c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2620d;

    /* renamed from: e, reason: collision with root package name */
    public final Class f2621e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f2622f;
    public final A3.h g;

    /* renamed from: h, reason: collision with root package name */
    public final W3.c f2623h;

    /* renamed from: i, reason: collision with root package name */
    public final A3.l f2624i;
    public int j;

    public s(Object obj, A3.h hVar, int i7, int i10, W3.c cVar, Class cls, Class cls2, A3.l lVar) {
        W3.g.c(obj, "Argument must not be null");
        this.f2618b = obj;
        this.g = hVar;
        this.f2619c = i7;
        this.f2620d = i10;
        W3.g.c(cVar, "Argument must not be null");
        this.f2623h = cVar;
        W3.g.c(cls, "Resource class must not be null");
        this.f2621e = cls;
        W3.g.c(cls2, "Transcode class must not be null");
        this.f2622f = cls2;
        W3.g.c(lVar, "Argument must not be null");
        this.f2624i = lVar;
    }

    @Override // A3.h
    public final void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // A3.h
    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f2618b.equals(sVar.f2618b) && this.g.equals(sVar.g) && this.f2620d == sVar.f2620d && this.f2619c == sVar.f2619c && this.f2623h.equals(sVar.f2623h) && this.f2621e.equals(sVar.f2621e) && this.f2622f.equals(sVar.f2622f) && this.f2624i.equals(sVar.f2624i);
    }

    @Override // A3.h
    public final int hashCode() {
        if (this.j == 0) {
            int hashCode = this.f2618b.hashCode();
            this.j = hashCode;
            int hashCode2 = ((((this.g.hashCode() + (hashCode * 31)) * 31) + this.f2619c) * 31) + this.f2620d;
            this.j = hashCode2;
            int hashCode3 = this.f2623h.hashCode() + (hashCode2 * 31);
            this.j = hashCode3;
            int hashCode4 = this.f2621e.hashCode() + (hashCode3 * 31);
            this.j = hashCode4;
            int hashCode5 = this.f2622f.hashCode() + (hashCode4 * 31);
            this.j = hashCode5;
            this.j = this.f2624i.f360b.hashCode() + (hashCode5 * 31);
        }
        return this.j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f2618b + ", width=" + this.f2619c + ", height=" + this.f2620d + ", resourceClass=" + this.f2621e + ", transcodeClass=" + this.f2622f + ", signature=" + this.g + ", hashCode=" + this.j + ", transformations=" + this.f2623h + ", options=" + this.f2624i + '}';
    }
}
