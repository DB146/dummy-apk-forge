package V3;

import A3.h;
import W3.g;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: b, reason: collision with root package name */
    public final Object f10031b;

    public d(Object obj) {
        g.c(obj, "Argument must not be null");
        this.f10031b = obj;
    }

    @Override // A3.h
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(this.f10031b.toString().getBytes(h.f353a));
    }

    @Override // A3.h
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f10031b.equals(((d) obj).f10031b);
        }
        return false;
    }

    @Override // A3.h
    public final int hashCode() {
        return this.f10031b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f10031b + '}';
    }
}
