package x;

import i1.C1290a;

/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f26150a = 0;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r1 != 5) goto L11;
     */
    static {
        float[] fArr = new float[2];
        float[][] fArr2 = {new float[2], new float[2]};
        int i7 = new int[2][0];
        int i10 = 3;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2 || i7 == 3) {
                    i10 = 2;
                } else {
                    i10 = 4;
                    if (i7 != 4) {
                        i10 = 5;
                    }
                }
            }
            i10 = 1;
        }
        float[] fArr3 = fArr2[0];
        float[] fArr4 = fArr2[1];
        float f4 = fArr[0];
        float f10 = fArr[1];
        int length = (fArr3.length % 2) + (fArr3.length / 2);
        C1290a[] c1290aArr = new C1290a[length];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * 2;
            int i13 = i12 + 1;
            c1290aArr[i11] = new C1290a(i10, f4, f10, fArr3[i12], fArr3[i13], fArr4[i12], fArr4[i13]);
        }
    }
}
