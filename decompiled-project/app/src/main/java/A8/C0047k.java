package A8;

/* renamed from: A8.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0047k {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC0046j f694a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC0046j f695b;

    /* renamed from: c, reason: collision with root package name */
    public final double f696c;

    public C0047k(EnumC0046j enumC0046j, EnumC0046j enumC0046j2, double d10) {
        this.f694a = enumC0046j;
        this.f695b = enumC0046j2;
        this.f696c = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0047k)) {
            return false;
        }
        C0047k c0047k = (C0047k) obj;
        return this.f694a == c0047k.f694a && this.f695b == c0047k.f695b && Double.compare(this.f696c, c0047k.f696c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f696c) + ((this.f695b.hashCode() + (this.f694a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f694a + ", crashlytics=" + this.f695b + ", sessionSamplingRate=" + this.f696c + ')';
    }
}
