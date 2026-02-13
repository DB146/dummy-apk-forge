package U0;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: c, reason: collision with root package name */
    public static final r f9442c = new r(android.support.v4.media.session.b.v(0), android.support.v4.media.session.b.v(0));

    /* renamed from: a, reason: collision with root package name */
    public final long f9443a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9444b;

    public r(long j, long j10) {
        this.f9443a = j;
        this.f9444b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return V0.n.a(this.f9443a, rVar.f9443a) && V0.n.a(this.f9444b, rVar.f9444b);
    }

    public final int hashCode() {
        V0.o[] oVarArr = V0.n.f9986b;
        return Long.hashCode(this.f9444b) + (Long.hashCode(this.f9443a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) V0.n.d(this.f9443a)) + ", restLine=" + ((Object) V0.n.d(this.f9444b)) + ')';
    }
}
