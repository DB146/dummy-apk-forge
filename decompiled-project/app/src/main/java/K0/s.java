package K0;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final r f5936a;

    public s(r rVar) {
        this.f5936a = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (!kotlin.jvm.internal.l.a(this.f5936a, sVar.f5936a)) {
            return false;
        }
        sVar.getClass();
        return kotlin.jvm.internal.l.a(null, null);
    }

    public final int hashCode() {
        r rVar = this.f5936a;
        if (rVar != null) {
            return rVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=null, paragraphSyle=" + this.f5936a + ')';
    }
}
