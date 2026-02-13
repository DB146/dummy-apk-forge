package O6;

import java.math.RoundingMode;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f7479a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f7480b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7481c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7482d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f7483e;

    public a(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        int i7 = 0;
        while (true) {
            if (i7 >= cArr.length) {
                this.f7479a = str;
                this.f7480b = cArr;
                try {
                    int x2 = O5.b.x(cArr.length, RoundingMode.UNNECESSARY);
                    this.f7481c = x2;
                    int numberOfTrailingZeros = Integer.numberOfTrailingZeros(x2);
                    this.f7482d = x2 >> numberOfTrailingZeros;
                    this.f7483e = bArr;
                    boolean[] zArr = new boolean[1 << (3 - numberOfTrailingZeros)];
                    for (int i10 = 0; i10 < this.f7482d; i10++) {
                        zArr[O5.b.n(i10 * 8, this.f7481c, RoundingMode.CEILING)] = true;
                    }
                    return;
                } catch (ArithmeticException e2) {
                    throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e2);
                }
            }
            char c10 = cArr[i7];
            if (!(c10 < 128)) {
                throw new IllegalArgumentException(Tb.a.w("Non-ASCII character: %s", Character.valueOf(c10)));
            }
            if (!(bArr[c10] == -1)) {
                throw new IllegalArgumentException(Tb.a.w("Duplicate character: %s", Character.valueOf(c10)));
            }
            bArr[c10] = (byte) i7;
            i7++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return Arrays.equals(this.f7480b, aVar.f7480b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7480b) + 1237;
    }

    public final String toString() {
        return this.f7479a;
    }
}
