package K0;

/* loaded from: classes.dex */
public final class i extends j {

    /* renamed from: a, reason: collision with root package name */
    public final String f5885a;

    /* renamed from: b, reason: collision with root package name */
    public final D f5886b;

    public i(String str, D d10) {
        this.f5885a = str;
        this.f5886b = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!kotlin.jvm.internal.l.a(this.f5885a, iVar.f5885a)) {
            return false;
        }
        if (!kotlin.jvm.internal.l.a(this.f5886b, iVar.f5886b)) {
            return false;
        }
        iVar.getClass();
        return kotlin.jvm.internal.l.a(null, null);
    }

    public final int hashCode() {
        int hashCode = this.f5885a.hashCode() * 31;
        D d10 = this.f5886b;
        return (hashCode + (d10 != null ? d10.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return A3.c.l(new StringBuilder("LinkAnnotation.Url(url="), this.f5885a, ')');
    }
}
