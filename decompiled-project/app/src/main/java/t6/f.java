package t6;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.kt.apps.media.xemtv.beta.R;
import d6.AbstractC1053a;

/* loaded from: classes.dex */
public final class f extends AbstractC2029a {
    public final float g;

    /* renamed from: h, reason: collision with root package name */
    public final float f24501h;

    public f(View view) {
        super(view);
        Resources resources = view.getResources();
        this.g = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.f24501h = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public final AnimatorSet a() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.f24493b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i7), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new Z1.a(1));
        return animatorSet;
    }

    public final void b(float f4) {
        float interpolation = this.f24492a.getInterpolation(f4);
        View view = this.f24493b;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f10 = this.g / width;
        float f11 = this.f24501h / height;
        float a9 = 1.0f - AbstractC1053a.a(0.0f, f10, interpolation);
        float a10 = 1.0f - AbstractC1053a.a(0.0f, f11, interpolation);
        view.setScaleX(a9);
        view.setPivotY(height);
        view.setScaleY(a10);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                View childAt = viewGroup.getChildAt(i7);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(a10 != 0.0f ? a9 / a10 : 1.0f);
            }
        }
    }
}
