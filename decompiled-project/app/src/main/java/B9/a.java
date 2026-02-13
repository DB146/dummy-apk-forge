package B9;

import android.animation.TimeInterpolator;

/* loaded from: classes2.dex */
public final class a implements TimeInterpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2233a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2234b;

    public a(int i7) {
        this.f2233a = i7;
        switch (i7) {
            case 1:
                this.f2234b = 1.0f / ((0 * 1.0f) + (((float) (-Math.pow(100, -1.0f))) + 1.0f));
                return;
            case 2:
                this.f2234b = 1.0f / ((0 * 1.0f) + (((float) (-Math.pow(100, -1.0f))) + 1.0f));
                return;
            case 3:
                this.f2234b = 1.0f / ((0 * 1.0f) + (((float) (-Math.pow(100, -1.0f))) + 1.0f));
                return;
            default:
                this.f2234b = 1.0f / ((0 * 1.0f) + (((float) (-Math.pow(100, -1.0f))) + 1.0f));
                return;
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f4) {
        switch (this.f2233a) {
            case 0:
                return 1.0f - (((0 * (1.0f - f4)) + (((float) (-Math.pow(100, -r6))) + 1.0f)) * this.f2234b);
            case 1:
                return ((0 * f4) + ((float) (-Math.pow(100, -f4))) + 1.0f) * this.f2234b;
            case 2:
                return 1.0f - (((0 * (1.0f - f4)) + (((float) (-Math.pow(100, -r6))) + 1.0f)) * this.f2234b);
            default:
                return ((0 * f4) + ((float) (-Math.pow(100, -f4))) + 1.0f) * this.f2234b;
        }
    }
}
