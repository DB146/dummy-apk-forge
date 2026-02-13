package a4;

/* renamed from: a4.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0771v extends AbstractC0748I {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC0747H f12688a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC0746G f12689b;

    public C0771v(EnumC0747H enumC0747H, EnumC0746G enumC0746G) {
        this.f12688a = enumC0747H;
        this.f12689b = enumC0746G;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0748I)) {
            return false;
        }
        AbstractC0748I abstractC0748I = (AbstractC0748I) obj;
        EnumC0747H enumC0747H = this.f12688a;
        if (enumC0747H != null ? enumC0747H.equals(((C0771v) abstractC0748I).f12688a) : ((C0771v) abstractC0748I).f12688a == null) {
            EnumC0746G enumC0746G = this.f12689b;
            if (enumC0746G == null) {
                if (((C0771v) abstractC0748I).f12689b == null) {
                    return true;
                }
            } else if (enumC0746G.equals(((C0771v) abstractC0748I).f12689b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        EnumC0747H enumC0747H = this.f12688a;
        int hashCode = ((enumC0747H == null ? 0 : enumC0747H.hashCode()) ^ 1000003) * 1000003;
        EnumC0746G enumC0746G = this.f12689b;
        return (enumC0746G != null ? enumC0746G.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f12688a + ", mobileSubtype=" + this.f12689b + "}";
    }
}
