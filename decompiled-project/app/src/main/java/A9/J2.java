package A9;

import A0.C0016f0;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.kt.apps.core.base.leanback.SearchOrbView;

/* loaded from: classes2.dex */
public final class J2 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f853a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f854b;

    public /* synthetic */ J2(Object obj, int i7) {
        this.f853a = i7;
        this.f854b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f853a) {
            case 0:
                ((SearchOrbView) this.f854b).setOrbViewColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 1:
                ((SearchOrbView) this.f854b).setSearchOrbZ(valueAnimator.getAnimatedFraction());
                return;
            default:
                ((Drawable) ((C0016f0) this.f854b).g).setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
        }
    }
}
