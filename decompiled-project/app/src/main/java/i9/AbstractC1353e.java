package i9;

import h9.AbstractC1263a;
import java.lang.reflect.Array;

/* renamed from: i9.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1353e {

    /* renamed from: a, reason: collision with root package name */
    public static final float[][] f18476a = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 2787, 8);

    static {
        int i7;
        for (int i10 = 0; i10 < 2787; i10++) {
            int i11 = AbstractC1263a.f17893b[i10];
            int i12 = i11 & 1;
            int i13 = 0;
            while (i13 < 8) {
                float f4 = 0.0f;
                while (true) {
                    i7 = i11 & 1;
                    if (i7 == i12) {
                        f4 += 1.0f;
                        i11 >>= 1;
                    }
                }
                f18476a[i10][7 - i13] = f4 / 17.0f;
                i13++;
                i12 = i7;
            }
        }
    }
}
