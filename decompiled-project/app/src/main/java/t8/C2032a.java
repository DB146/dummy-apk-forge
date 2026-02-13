package t8;

import h3.o;

/* renamed from: t8.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2032a {

    /* renamed from: a, reason: collision with root package name */
    public final String f24507a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24508b;

    public C2032a(String str, String str2) {
        this.f24507a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f24508b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2032a)) {
            return false;
        }
        C2032a c2032a = (C2032a) obj;
        return this.f24507a.equals(c2032a.f24507a) && this.f24508b.equals(c2032a.f24508b);
    }

    public final int hashCode() {
        return ((this.f24507a.hashCode() ^ 1000003) * 1000003) ^ this.f24508b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f24507a);
        sb2.append(", version=");
        return o.p(sb2, this.f24508b, "}");
    }
}
