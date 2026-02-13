package xc;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f26377c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final w f26378a;

    /* renamed from: b, reason: collision with root package name */
    public final w f26379b;

    public u(w wVar, w wVar2) {
        this.f26378a = wVar;
        this.f26379b = wVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f26378a.equals(uVar.f26378a)) {
            return this.f26379b.equals(uVar.f26379b);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f26378a, this.f26379b);
    }

    public final String toString() {
        StringBuilder b2 = wc.l.b();
        b2.append(this.f26378a);
        b2.append('=');
        b2.append(this.f26379b);
        return wc.l.l(b2);
    }
}
