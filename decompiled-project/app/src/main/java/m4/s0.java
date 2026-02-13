package m4;

import java.util.Locale;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class s0 implements InterfaceC1569g {

    /* renamed from: d, reason: collision with root package name */
    public static final s0 f20500d = new s0(1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f20501a;

    /* renamed from: b, reason: collision with root package name */
    public final float f20502b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20503c;

    static {
        int i7 = n5.D.f21141a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public s0(float f4, float f10) {
        AbstractC1705a.h(f4 > 0.0f);
        AbstractC1705a.h(f10 > 0.0f);
        this.f20501a = f4;
        this.f20502b = f10;
        this.f20503c = Math.round(f4 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s0.class != obj.getClass()) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f20501a == s0Var.f20501a && this.f20502b == s0Var.f20502b;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f20502b) + ((Float.floatToRawIntBits(this.f20501a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f20501a), Float.valueOf(this.f20502b)};
        int i7 = n5.D.f21141a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
