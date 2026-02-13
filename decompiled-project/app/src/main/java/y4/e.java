package y4;

import s4.C1979g;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f26957d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f26958a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public int f26959b;

    /* renamed from: c, reason: collision with root package name */
    public int f26960c;

    public static long a(int i7, boolean z8, byte[] bArr) {
        long j = bArr[0] & 255;
        if (z8) {
            j &= ~f26957d[i7 - 1];
        }
        for (int i10 = 1; i10 < i7; i10++) {
            j = (j << 8) | (bArr[i10] & 255);
        }
        return j;
    }

    public static int b(int i7) {
        for (int i10 = 0; i10 < 8; i10++) {
            if ((f26957d[i10] & i7) != 0) {
                return i10 + 1;
            }
        }
        return -1;
    }

    public final long c(C1979g c1979g, boolean z8, boolean z10, int i7) {
        int i10 = this.f26959b;
        byte[] bArr = this.f26958a;
        if (i10 == 0) {
            if (!c1979g.h(bArr, 0, 1, z8)) {
                return -1L;
            }
            int b2 = b(bArr[0] & 255);
            this.f26960c = b2;
            if (b2 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f26959b = 1;
        }
        int i11 = this.f26960c;
        if (i11 > i7) {
            this.f26959b = 0;
            return -2L;
        }
        if (i11 != 1) {
            c1979g.h(bArr, 1, i11 - 1, false);
        }
        this.f26959b = 0;
        return a(this.f26960c, z10, bArr);
    }
}
