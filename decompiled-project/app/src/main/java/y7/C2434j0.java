package y7;

/* renamed from: y7.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2434j0 extends L0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f27312a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27313b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27314c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f27315d;

    public C2434j0(String str, int i7, String str2, boolean z8) {
        this.f27312a = i7;
        this.f27313b = str;
        this.f27314c = str2;
        this.f27315d = z8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof L0)) {
            return false;
        }
        L0 l02 = (L0) obj;
        if (this.f27312a == ((C2434j0) l02).f27312a) {
            C2434j0 c2434j0 = (C2434j0) l02;
            if (this.f27313b.equals(c2434j0.f27313b) && this.f27314c.equals(c2434j0.f27314c) && this.f27315d == c2434j0.f27315d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f27312a ^ 1000003) * 1000003) ^ this.f27313b.hashCode()) * 1000003) ^ this.f27314c.hashCode()) * 1000003) ^ (this.f27315d ? 1231 : 1237);
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f27312a + ", version=" + this.f27313b + ", buildVersion=" + this.f27314c + ", jailbroken=" + this.f27315d + "}";
    }
}
