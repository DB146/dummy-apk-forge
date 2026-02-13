package a4;

/* renamed from: a4.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0764o extends AbstractC0740A {

    /* renamed from: a, reason: collision with root package name */
    public final C0767r f12668a;

    public C0764o(C0767r c0767r) {
        z zVar = z.f12692a;
        this.f12668a = c0767r;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0740A)) {
            return false;
        }
        AbstractC0740A abstractC0740A = (AbstractC0740A) obj;
        if (this.f12668a.equals(((C0764o) abstractC0740A).f12668a)) {
            Object obj2 = z.f12692a;
            ((C0764o) abstractC0740A).getClass();
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f12668a.hashCode() ^ 1000003) * 1000003) ^ z.f12692a.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f12668a + ", productIdOrigin=" + z.f12692a + "}";
    }
}
