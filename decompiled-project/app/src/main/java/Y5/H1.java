package Y5;

/* loaded from: classes.dex */
public final class H1 {

    /* renamed from: a, reason: collision with root package name */
    public final I1 f11374a;

    /* renamed from: b, reason: collision with root package name */
    public int f11375b = 1;

    /* renamed from: c, reason: collision with root package name */
    public long f11376c = a();

    public H1(I1 i12) {
        this.f11374a = i12;
    }

    public final long a() {
        I1 i12 = this.f11374a;
        com.google.android.gms.common.internal.G.g(i12);
        long longValue = ((Long) F.f11353v.a(null)).longValue();
        long longValue2 = ((Long) F.f11355w.a(null)).longValue();
        for (int i7 = 1; i7 < this.f11375b; i7++) {
            longValue += longValue;
            if (longValue >= longValue2) {
                break;
            }
        }
        ((M5.b) i12.e()).getClass();
        return Math.min(longValue, longValue2) + System.currentTimeMillis();
    }
}
