package q3;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f23373a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f23374b;

    public d(String str, Long l10) {
        this.f23373a = str;
        this.f23374b = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.l.a(this.f23373a, dVar.f23373a) && kotlin.jvm.internal.l.a(this.f23374b, dVar.f23374b);
    }

    public final int hashCode() {
        int hashCode = this.f23373a.hashCode() * 31;
        Long l10 = this.f23374b;
        return hashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f23373a + ", value=" + this.f23374b + ')';
    }
}
