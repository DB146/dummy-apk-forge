package i0;

import a.AbstractC0672a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f18185a;

    public static final boolean a(long j, long j10) {
        return j == j10;
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean d(long j) {
        long j10 = (~((((-9223372034707292160L) & j) >>> 31) * (-1))) & j;
        return (((j10 & 4294967295L) & (j10 >>> 32)) == 0) | (j == 9205357640488583168L);
    }

    public static String e(long j) {
        if (j == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + AbstractC0672a.v(Float.intBitsToFloat((int) (j >> 32))) + ", " + AbstractC0672a.v(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f18185a == ((e) obj).f18185a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f18185a);
    }

    public final String toString() {
        return e(this.f18185a);
    }
}
