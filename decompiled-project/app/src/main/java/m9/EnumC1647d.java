package m9;

/* renamed from: m9.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC1647d {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);


    /* renamed from: a, reason: collision with root package name */
    public final int[] f20804a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20805b;

    EnumC1647d(int[] iArr, int i7) {
        this.f20804a = iArr;
        this.f20805b = i7;
    }

    public final int a(C1649f c1649f) {
        int i7 = c1649f.f20808a;
        return this.f20804a[i7 <= 9 ? (char) 0 : i7 <= 26 ? (char) 1 : (char) 2];
    }
}
