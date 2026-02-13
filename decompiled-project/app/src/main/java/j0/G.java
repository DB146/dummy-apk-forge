package j0;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: b, reason: collision with root package name */
    public static final long f18526b = (Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f18527c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f18528a;

    public static final boolean a(long j, long j10) {
        return j == j10;
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String d(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof G) {
            return this.f18528a == ((G) obj).f18528a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f18528a);
    }

    public final String toString() {
        return d(this.f18528a);
    }
}
