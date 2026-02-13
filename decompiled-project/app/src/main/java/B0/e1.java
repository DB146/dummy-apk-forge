package B0;

/* loaded from: classes.dex */
public interface e1 {
    default float a() {
        return Float.MAX_VALUE;
    }

    float b();

    default long c() {
        float f4 = 48;
        return (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
    }
}
