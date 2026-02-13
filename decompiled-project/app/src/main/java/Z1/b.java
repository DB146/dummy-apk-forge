package Z1;

import android.view.animation.Interpolator;
import h3.o;

/* loaded from: classes.dex */
public abstract class b implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f12135a;

    /* renamed from: b, reason: collision with root package name */
    public final float f12136b;

    public b(float[] fArr) {
        this.f12135a = fArr;
        this.f12136b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f4) {
        if (f4 >= 1.0f) {
            return 1.0f;
        }
        if (f4 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f12135a;
        int min = Math.min((int) ((fArr.length - 1) * f4), fArr.length - 2);
        float f10 = this.f12136b;
        float f11 = (f4 - (min * f10)) / f10;
        float f12 = fArr[min];
        return o.d(fArr[min + 1], f12, f11, f12);
    }
}
