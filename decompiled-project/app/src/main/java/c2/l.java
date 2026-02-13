package c2;

import A0.C0016f0;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.animation.LinearInterpolator;
import i2.AbstractC1299G;

/* loaded from: classes.dex */
public final class l extends AbstractC1299G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14165a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14166b;

    public l(C0016f0 c0016f0) {
        this.f14166b = c0016f0;
    }

    public l(d2.g gVar, PropertyValuesHolder propertyValuesHolder) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(gVar, propertyValuesHolder);
        this.f14166b = ofPropertyValuesHolder;
        ofPropertyValuesHolder.setInterpolator(new LinearInterpolator());
        ofPropertyValuesHolder.setDuration(1000000L);
    }

    @Override // i2.AbstractC1299G
    public final void b(float f4) {
        switch (this.f14165a) {
            case 0:
                C0016f0 c0016f0 = (C0016f0) this.f14166b;
                if (f4 == 1.0f) {
                    if (2 == c0016f0.f217b) {
                        return;
                    }
                    c0016f0.f217b = 2;
                    c0016f0.b(false, false);
                    return;
                }
                if (1 == c0016f0.f217b) {
                    return;
                }
                c0016f0.f217b = 1;
                c0016f0.b(false, false);
                return;
            default:
                ((ObjectAnimator) this.f14166b).setCurrentPlayTime(f4 * 1000000.0f);
                return;
        }
    }
}
