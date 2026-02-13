package y0;

/* renamed from: y0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2343k implements InterfaceC2342j {
    @Override // y0.InterfaceC2342j
    public final long a(long j, long j10) {
        long floatToRawIntBits = (Float.floatToRawIntBits(1.0f) << 32) | (4294967295L & Float.floatToRawIntBits(1.0f));
        int i7 = AbstractC2327L.f26566b;
        return floatToRawIntBits;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2343k)) {
            return false;
        }
        ((C2343k) obj).getClass();
        return Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f);
    }

    public final String toString() {
        return "FixedScale(value=1.0)";
    }
}
