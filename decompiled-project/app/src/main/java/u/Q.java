package u;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    public static final long[] f24633a = {-9187201950435737345L, -1};

    static {
        new C2046I(0);
    }

    public static final int a(int i7) {
        if (i7 == 7) {
            return 6;
        }
        return i7 - (i7 / 8);
    }

    public static final C2046I b() {
        return new C2046I();
    }

    public static final int c(int i7) {
        if (i7 == 0) {
            return 6;
        }
        return (i7 * 2) + 1;
    }

    public static final int d(int i7) {
        if (i7 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i7);
        }
        return 0;
    }

    public static final int e(int i7) {
        if (i7 == 7) {
            return 8;
        }
        return ((i7 - 1) / 7) + i7;
    }
}
