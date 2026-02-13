package H0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f4460a;

    /* renamed from: b, reason: collision with root package name */
    public final Db.c f4461b;

    public a(String str, Db.c cVar) {
        this.f4460a = str;
        this.f4461b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.l.a(this.f4460a, aVar.f4460a) && kotlin.jvm.internal.l.a(this.f4461b, aVar.f4461b);
    }

    public final int hashCode() {
        String str = this.f4460a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Db.c cVar = this.f4461b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f4460a + ", action=" + this.f4461b + ')';
    }
}
