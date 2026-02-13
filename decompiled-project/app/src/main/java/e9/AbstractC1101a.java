package e9;

import com.google.android.gms.common.api.f;
import d9.h;

/* renamed from: e9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1101a extends h {

    /* renamed from: b, reason: collision with root package name */
    public final int[] f16809b;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f16812e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f16813f;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f16808a = new int[4];

    /* renamed from: c, reason: collision with root package name */
    public final float[] f16810c = new float[4];

    /* renamed from: d, reason: collision with root package name */
    public final float[] f16811d = new float[4];

    public AbstractC1101a() {
        int[] iArr = new int[8];
        this.f16809b = iArr;
        this.f16812e = new int[iArr.length / 2];
        this.f16813f = new int[iArr.length / 2];
    }

    public static void g(int[] iArr, float[] fArr) {
        int i7 = 0;
        float f4 = fArr[0];
        for (int i10 = 1; i10 < iArr.length; i10++) {
            float f10 = fArr[i10];
            if (f10 < f4) {
                i7 = i10;
                f4 = f10;
            }
        }
        iArr[i7] = iArr[i7] - 1;
    }

    public static void h(int[] iArr, float[] fArr) {
        int i7 = 0;
        float f4 = fArr[0];
        for (int i10 = 1; i10 < iArr.length; i10++) {
            float f10 = fArr[i10];
            if (f10 > f4) {
                i7 = i10;
                f4 = f10;
            }
        }
        iArr[i7] = iArr[i7] + 1;
    }

    public static boolean i(int[] iArr) {
        float f4 = (iArr[0] + iArr[1]) / ((iArr[2] + r1) + iArr[3]);
        if (f4 < 0.7916667f || f4 > 0.89285713f) {
            return false;
        }
        int i7 = f.API_PRIORITY_OTHER;
        int i10 = Integer.MIN_VALUE;
        for (int i11 : iArr) {
            if (i11 > i10) {
                i10 = i11;
            }
            if (i11 < i7) {
                i7 = i11;
            }
        }
        return i10 < i7 * 10;
    }
}
