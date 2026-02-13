package P4;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final Random f8042a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f8043b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f8044c;

    public g0() {
        this(new Random());
    }

    public g0(Random random) {
        this(new int[0], random);
    }

    public g0(int[] iArr, Random random) {
        this.f8043b = iArr;
        this.f8042a = random;
        this.f8044c = new int[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            this.f8044c[iArr[i7]] = i7;
        }
    }

    public final g0 a(int i7) {
        Random random;
        int[] iArr;
        int[] iArr2 = new int[i7];
        int[] iArr3 = new int[i7];
        int i10 = 0;
        while (true) {
            random = this.f8042a;
            iArr = this.f8043b;
            if (i10 >= i7) {
                break;
            }
            iArr2[i10] = random.nextInt(iArr.length + 1);
            int i11 = i10 + 1;
            int nextInt = random.nextInt(i11);
            iArr3[i10] = iArr3[nextInt];
            iArr3[nextInt] = i10;
            i10 = i11;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i7];
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < iArr.length + i7; i14++) {
            if (i12 >= i7 || i13 != iArr2[i12]) {
                int i15 = i13 + 1;
                int i16 = iArr[i13];
                iArr4[i14] = i16;
                if (i16 >= 0) {
                    iArr4[i14] = i16 + i7;
                }
                i13 = i15;
            } else {
                iArr4[i14] = iArr3[i12];
                i12++;
            }
        }
        return new g0(iArr4, new Random(random.nextLong()));
    }
}
