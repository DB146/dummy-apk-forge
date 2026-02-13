package A3;

import java.security.MessageDigest;
import u.T;

/* loaded from: classes.dex */
public final class l implements h {

    /* renamed from: b, reason: collision with root package name */
    public final W3.c f360b = new T(0);

    @Override // A3.h
    public final void b(MessageDigest messageDigest) {
        int i7 = 0;
        while (true) {
            W3.c cVar = this.f360b;
            if (i7 >= cVar.f24637c) {
                return;
            }
            k kVar = (k) cVar.f(i7);
            Object k = this.f360b.k(i7);
            j jVar = kVar.f357b;
            if (kVar.f359d == null) {
                kVar.f359d = kVar.f358c.getBytes(h.f353a);
            }
            jVar.a(kVar.f359d, k, messageDigest);
            i7++;
        }
    }

    public final Object c(k kVar) {
        W3.c cVar = this.f360b;
        return cVar.containsKey(kVar) ? cVar.get(kVar) : kVar.f356a;
    }

    @Override // A3.h
    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f360b.equals(((l) obj).f360b);
        }
        return false;
    }

    @Override // A3.h
    public final int hashCode() {
        return this.f360b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f360b + '}';
    }
}
