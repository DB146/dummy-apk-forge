package y0;

import u.X;

/* renamed from: y0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2319D implements S, InterfaceC2342j {

    /* renamed from: b, reason: collision with root package name */
    public static final C2319D f26549b = new C2319D(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26550a;

    public /* synthetic */ C2319D(int i7) {
        this.f26550a = i7;
    }

    @Override // y0.InterfaceC2342j
    public long a(long j, long j10) {
        switch (this.f26550a) {
            case 1:
                float max = Math.max(Float.intBitsToFloat((int) (j10 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
                long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
                int i7 = AbstractC2327L.f26566b;
                return floatToRawIntBits;
            case 2:
                float c10 = AbstractC2328M.c(j, j10);
                long floatToRawIntBits2 = (Float.floatToRawIntBits(c10) << 32) | (Float.floatToRawIntBits(c10) & 4294967295L);
                int i10 = AbstractC2327L.f26566b;
                return floatToRawIntBits2;
            default:
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j10 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j10 & 4294967295L))) {
                    long floatToRawIntBits3 = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
                    int i11 = AbstractC2327L.f26566b;
                    return floatToRawIntBits3;
                }
                float c11 = AbstractC2328M.c(j, j10);
                long floatToRawIntBits4 = (Float.floatToRawIntBits(c11) << 32) | (Float.floatToRawIntBits(c11) & 4294967295L);
                int i12 = AbstractC2327L.f26566b;
                return floatToRawIntBits4;
        }
    }

    @Override // y0.S
    public void f(X x2) {
        x2.clear();
    }

    @Override // y0.S
    public boolean g(Object obj, Object obj2) {
        return false;
    }

    public String toString() {
        switch (this.f26550a) {
            case 4:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
