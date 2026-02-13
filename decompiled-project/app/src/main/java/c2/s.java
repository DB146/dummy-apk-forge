package c2;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
public final class s implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14206a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f14207b;

    public /* synthetic */ s(t tVar, int i7) {
        this.f14206a = i7;
        this.f14207b = tVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14206a) {
            case 0:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                t tVar = this.f14207b;
                tVar.f14208A0 = intValue;
                View view = tVar.f14225s0;
                if (view != null) {
                    view.getBackground().setAlpha(intValue);
                    return;
                }
                return;
            case 1:
                this.f14207b.getClass();
                return;
            default:
                this.f14207b.getClass();
                return;
        }
    }
}
