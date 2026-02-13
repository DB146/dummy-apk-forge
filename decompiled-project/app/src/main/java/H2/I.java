package H2;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class I implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4597a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f4) {
        switch (this.f4597a) {
            case 0:
                float f10 = f4 - 1.0f;
                return (f10 * f10 * f10 * f10 * f10) + 1.0f;
            case 1:
                float f11 = f4 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            default:
                float f12 = f4 - 1.0f;
                return (f12 * f12 * f12 * f12 * f12) + 1.0f;
        }
    }
}
