package V0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f9967a;

    public /* synthetic */ a(long j) {
        this.f9967a = j;
    }

    public static long a(int i7, int i10, long j) {
        int h10 = h(j);
        int g = g(j);
        if (h10 < i7 || g < i10 || i7 < 0 || i10 < 0) {
            h.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return b.g(i7, h10, i10, g);
    }

    public static final boolean b(long j, long j10) {
        return j == j10;
    }

    public static final boolean c(long j) {
        int i7 = (int) (3 & j);
        int i10 = (((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1);
        return (((int) (j >> (i10 + 46))) & ((1 << (18 - i10)) - 1)) != 0;
    }

    public static final boolean d(long j) {
        int i7 = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << (((((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static final boolean e(long j) {
        int i7 = (int) (3 & j);
        int i10 = (((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1);
        int i11 = (1 << (18 - i10)) - 1;
        int i12 = ((int) (j >> (i10 + 15))) & i11;
        int i13 = ((int) (j >> (i10 + 46))) & i11;
        return i12 == (i13 == 0 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : i13 - 1);
    }

    public static final boolean f(long j) {
        int i7 = (int) (3 & j);
        int i10 = (1 << (((((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1)) + 13)) - 1;
        int i11 = ((int) (j >> 2)) & i10;
        int i12 = ((int) (j >> 33)) & i10;
        return i11 == (i12 == 0 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : i12 - 1);
    }

    public static final int g(long j) {
        int i7 = (int) (3 & j);
        int i10 = (((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1);
        int i11 = ((int) (j >> (i10 + 46))) & ((1 << (18 - i10)) - 1);
        return i11 == 0 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : i11 - 1;
    }

    public static final int h(long j) {
        int i7 = (int) (3 & j);
        int i10 = ((int) (j >> 33)) & ((1 << (((((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1)) + 13)) - 1);
        return i10 == 0 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : i10 - 1;
    }

    public static final int i(long j) {
        int i7 = (int) (3 & j);
        int i10 = (((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1);
        return ((int) (j >> (i10 + 15))) & ((1 << (18 - i10)) - 1);
    }

    public static final int j(long j) {
        int i7 = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << (((((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1)) + 13)) - 1);
    }

    public static String k(long j) {
        int h10 = h(j);
        String valueOf = h10 == Integer.MAX_VALUE ? "Infinity" : String.valueOf(h10);
        int g = g(j);
        String valueOf2 = g != Integer.MAX_VALUE ? String.valueOf(g) : "Infinity";
        StringBuilder sb2 = new StringBuilder("Constraints(minWidth = ");
        sb2.append(j(j));
        sb2.append(", maxWidth = ");
        sb2.append(valueOf);
        sb2.append(", minHeight = ");
        sb2.append(i(j));
        sb2.append(", maxHeight = ");
        return A3.c.l(sb2, valueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f9967a == ((a) obj).f9967a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9967a);
    }

    public final String toString() {
        return k(this.f9967a);
    }
}
