package C3;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class f implements A3.h {

    /* renamed from: b, reason: collision with root package name */
    public final A3.h f2523b;

    /* renamed from: c, reason: collision with root package name */
    public final A3.h f2524c;

    public f(A3.h hVar, A3.h hVar2) {
        this.f2523b = hVar;
        this.f2524c = hVar2;
    }

    @Override // A3.h
    public final void b(MessageDigest messageDigest) {
        this.f2523b.b(messageDigest);
        this.f2524c.b(messageDigest);
    }

    @Override // A3.h
    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f2523b.equals(fVar.f2523b) && this.f2524c.equals(fVar.f2524c);
    }

    @Override // A3.h
    public final int hashCode() {
        return this.f2524c.hashCode() + (this.f2523b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f2523b + ", signature=" + this.f2524c + '}';
    }
}
