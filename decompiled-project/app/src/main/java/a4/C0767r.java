package a4;

/* renamed from: a4.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0767r extends AbstractC0743D {

    /* renamed from: a, reason: collision with root package name */
    public final C0766q f12672a;

    public C0767r(C0766q c0766q) {
        this.f12672a = c0766q;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0743D) {
            return this.f12672a.equals(((C0767r) ((AbstractC0743D) obj)).f12672a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12672a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f12672a + "}";
    }
}
