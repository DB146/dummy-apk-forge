package A9;

import A0.C0016f0;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.animation.LinearInterpolator;

/* renamed from: A9.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0091h0 extends X1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1207a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1208b;

    public C0091h0(C0016f0 c0016f0) {
        this.f1208b = c0016f0;
    }

    public C0091h0(d2.g gVar, PropertyValuesHolder propertyValuesHolder) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(gVar, propertyValuesHolder);
        this.f1208b = ofPropertyValuesHolder;
        ofPropertyValuesHolder.setInterpolator(new LinearInterpolator());
        ofPropertyValuesHolder.setDuration(1000000L);
    }

    @Override // A9.X1
    public final void b(float f4) {
        switch (this.f1207a) {
            case 0:
                C0016f0 c0016f0 = (C0016f0) this.f1208b;
                if (f4 == 1.0f) {
                    c0016f0.c(2);
                    return;
                } else {
                    c0016f0.c(1);
                    return;
                }
            default:
                ((ObjectAnimator) this.f1208b).setCurrentPlayTime(f4 * 1000000.0f);
                return;
        }
    }
}
