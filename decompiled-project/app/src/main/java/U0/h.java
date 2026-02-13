package U0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f9424a;

    public static String a(int i7) {
        return i7 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i7 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i7 == 17 ? "LineHeightStyle.Trim.Both" : i7 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f9424a == ((h) obj).f9424a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9424a);
    }

    public final String toString() {
        return a(this.f9424a);
    }
}
