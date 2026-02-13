package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.kt.apps.media.xemtv.beta.R;
import i2.C1322j;

/* loaded from: classes.dex */
public class ParallaxTransition extends Visibility {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f13499a = new LinearInterpolator();

    public ParallaxTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static ValueAnimator a(View view) {
        C1322j c1322j = (C1322j) view.getTag(R.id.lb_parallax_source);
        if (c1322j == null) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(f13499a);
        ofFloat.addUpdateListener(new B6.c(c1322j, 3));
        return ofFloat;
    }

    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        return a(view);
    }

    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        return a(view);
    }
}
