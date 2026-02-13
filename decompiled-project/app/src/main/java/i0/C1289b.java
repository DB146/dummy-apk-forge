package i0;

import a.AbstractC0672a;

/* renamed from: i0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1289b {

    /* renamed from: a, reason: collision with root package name */
    public final long f18172a;

    public /* synthetic */ C1289b(long j) {
        this.f18172a = j;
    }

    public static long a(int i7, long j) {
        return (Float.floatToRawIntBits((i7 & 1) != 0 ? Float.intBitsToFloat((int) (j >> 32)) : 0.0f) << 32) | (Float.floatToRawIntBits((i7 & 2) != 0 ? Float.intBitsToFloat((int) (j & 4294967295L)) : 0.0f) & 4294967295L);
    }

    public static final boolean b(long j, long j10) {
        return j == j10;
    }

    public static final float c(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (float) Math.sqrt((intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat));
    }

    public static final long d(long j, long j10) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j10 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long e(long j, long j10) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final long f(long j, float f4) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f4;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f4;
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static String g(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + AbstractC0672a.v(Float.intBitsToFloat((int) (j >> 32))) + ", " + AbstractC0672a.v(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1289b) {
            return this.f18172a == ((C1289b) obj).f18172a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f18172a);
    }

    public final String toString() {
        return g(this.f18172a);
    }
}
