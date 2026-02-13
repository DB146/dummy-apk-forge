package N0;

/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final int f7129a;

    public a(int i7) {
        this.f7129a = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f7129a == ((a) obj).f7129a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7129a);
    }

    public final String toString() {
        return X.c.k(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f7129a, ')');
    }
}
