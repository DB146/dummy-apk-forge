package U0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final float f9420b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f9421c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f9422d;

    /* renamed from: a, reason: collision with root package name */
    public final float f9423a;

    static {
        a(0.0f);
        a(0.5f);
        f9420b = 0.5f;
        a(-1.0f);
        f9421c = -1.0f;
        a(1.0f);
        f9422d = 1.0f;
    }

    public static void a(float f4) {
        if ((0.0f > f4 || f4 > 1.0f) && f4 != -1.0f) {
            P0.a.b("topRatio should be in [0..1] range or -1");
        }
    }

    public static String b(float f4) {
        if (f4 == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f4 == f9420b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f4 == f9421c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f4 == f9422d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f4 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f9423a, ((f) obj).f9423a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9423a);
    }

    public final String toString() {
        return b(this.f9423a);
    }
}
