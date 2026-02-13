package m4;

import ha.C1265a;
import java.util.Arrays;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class F0 extends C0 {

    /* renamed from: e, reason: collision with root package name */
    public static final String f19896e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f19897f;

    /* renamed from: u, reason: collision with root package name */
    public static final C1265a f19898u;

    /* renamed from: c, reason: collision with root package name */
    public final int f19899c;

    /* renamed from: d, reason: collision with root package name */
    public final float f19900d;

    static {
        int i7 = n5.D.f21141a;
        f19896e = Integer.toString(1, 36);
        f19897f = Integer.toString(2, 36);
        f19898u = new C1265a(29);
    }

    public F0(int i7) {
        AbstractC1705a.g("maxStars must be a positive integer", i7 > 0);
        this.f19899c = i7;
        this.f19900d = -1.0f;
    }

    public F0(int i7, float f4) {
        boolean z8 = false;
        AbstractC1705a.g("maxStars must be a positive integer", i7 > 0);
        if (f4 >= 0.0f && f4 <= i7) {
            z8 = true;
        }
        AbstractC1705a.g("starRating is out of range [0, maxStars]", z8);
        this.f19899c = i7;
        this.f19900d = f4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f02 = (F0) obj;
        return this.f19899c == f02.f19899c && this.f19900d == f02.f19900d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f19899c), Float.valueOf(this.f19900d)});
    }
}
