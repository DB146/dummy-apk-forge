package q3;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public String f23400a;

    /* renamed from: b, reason: collision with root package name */
    public int f23401b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.l.a(this.f23400a, oVar.f23400a) && this.f23401b == oVar.f23401b;
    }

    public final int hashCode() {
        return P.c.b(this.f23401b) + (this.f23400a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f23400a + ", state=" + h3.o.y(this.f23401b) + ')';
    }
}
