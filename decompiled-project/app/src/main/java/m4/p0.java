package m4;

import ha.C1265a;
import java.util.Arrays;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class p0 extends C0 {

    /* renamed from: d, reason: collision with root package name */
    public static final String f20471d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1265a f20472e;

    /* renamed from: c, reason: collision with root package name */
    public final float f20473c;

    static {
        int i7 = n5.D.f21141a;
        f20471d = Integer.toString(1, 36);
        f20472e = new C1265a(27);
    }

    public p0() {
        this.f20473c = -1.0f;
    }

    public p0(float f4) {
        AbstractC1705a.g("percent must be in the range of [0, 100]", f4 >= 0.0f && f4 <= 100.0f);
        this.f20473c = f4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p0) {
            return this.f20473c == ((p0) obj).f20473c;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f20473c)});
    }
}
