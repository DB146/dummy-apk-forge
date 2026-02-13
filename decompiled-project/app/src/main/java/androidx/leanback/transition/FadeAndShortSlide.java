package androidx.leanback.transition;

import a2.AbstractC0708a;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes.dex */
public class FadeAndShortSlide extends Visibility {

    /* renamed from: e, reason: collision with root package name */
    public static final DecelerateInterpolator f13489e = new DecelerateInterpolator();

    /* renamed from: f, reason: collision with root package name */
    public static final b f13490f = new b(0);

    /* renamed from: u, reason: collision with root package name */
    public static final b f13491u = new b(1);

    /* renamed from: v, reason: collision with root package name */
    public static final b f13492v = new b(2);

    /* renamed from: w, reason: collision with root package name */
    public static final b f13493w = new b(3);

    /* renamed from: x, reason: collision with root package name */
    public static final b f13494x = new b(4);

    /* renamed from: a, reason: collision with root package name */
    public tc.b f13495a;

    /* renamed from: b, reason: collision with root package name */
    public Visibility f13496b;

    /* renamed from: c, reason: collision with root package name */
    public float f13497c;

    /* renamed from: d, reason: collision with root package name */
    public final c f13498d;

    public FadeAndShortSlide(int i7) {
        this.f13496b = new Fade();
        this.f13497c = -1.0f;
        this.f13498d = new c(this);
        c(i7);
    }

    public FadeAndShortSlide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13496b = new Fade();
        this.f13497c = -1.0f;
        this.f13498d = new c(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0708a.f12491l);
        c(obtainStyledAttributes.getInt(3, 8388611));
        obtainStyledAttributes.recycle();
    }

    public final float a(ViewGroup viewGroup) {
        float f4 = this.f13497c;
        return f4 >= 0.0f ? f4 : viewGroup.getWidth() / 4;
    }

    @Override // android.transition.Transition
    public final Transition addListener(Transition.TransitionListener transitionListener) {
        this.f13496b.addListener(transitionListener);
        return super.addListener(transitionListener);
    }

    public final float b(ViewGroup viewGroup) {
        float f4 = this.f13497c;
        return f4 >= 0.0f ? f4 : viewGroup.getHeight() / 4;
    }

    public final void c(int i7) {
        if (i7 == 48) {
            this.f13495a = f13494x;
            return;
        }
        if (i7 == 80) {
            this.f13495a = f13493w;
            return;
        }
        if (i7 == 112) {
            this.f13495a = this.f13498d;
            return;
        }
        if (i7 == 8388611) {
            this.f13495a = f13490f;
        } else if (i7 == 8388613) {
            this.f13495a = f13491u;
        } else {
            if (i7 != 8388615) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.f13495a = f13492v;
        }
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        this.f13496b.captureEndValues(transitionValues);
        super.captureEndValues(transitionValues);
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:fadeAndShortSlideTransition:screenPosition", iArr);
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        this.f13496b.captureStartValues(transitionValues);
        super.captureStartValues(transitionValues);
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:fadeAndShortSlideTransition:screenPosition", iArr);
    }

    @Override // android.transition.Transition
    public final Transition clone() {
        FadeAndShortSlide fadeAndShortSlide = (FadeAndShortSlide) super.clone();
        fadeAndShortSlide.f13496b = (Visibility) this.f13496b.clone();
        return fadeAndShortSlide;
    }

    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null || viewGroup == view) {
            return null;
        }
        int[] iArr = (int[]) transitionValues2.values.get("android:fadeAndShortSlideTransition:screenPosition");
        int i7 = iArr[0];
        int i10 = iArr[1];
        float translationX = view.getTranslationX();
        ObjectAnimator s3 = Q5.e.s(view, transitionValues2, i7, i10, this.f13495a.x(this, viewGroup, view, iArr), this.f13495a.y(this, viewGroup, view, iArr), translationX, view.getTranslationY(), f13489e, this);
        Animator onAppear = this.f13496b.onAppear(viewGroup, view, transitionValues, transitionValues2);
        if (s3 == null) {
            return onAppear;
        }
        if (onAppear == null) {
            return s3;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(s3).with(onAppear);
        return animatorSet;
    }

    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || viewGroup == view) {
            return null;
        }
        int[] iArr = (int[]) transitionValues.values.get("android:fadeAndShortSlideTransition:screenPosition");
        ObjectAnimator s3 = Q5.e.s(view, transitionValues, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f13495a.x(this, viewGroup, view, iArr), this.f13495a.y(this, viewGroup, view, iArr), f13489e, this);
        Animator onDisappear = this.f13496b.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        if (s3 == null) {
            return onDisappear;
        }
        if (onDisappear == null) {
            return s3;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(s3).with(onDisappear);
        return animatorSet;
    }

    @Override // android.transition.Transition
    public final Transition removeListener(Transition.TransitionListener transitionListener) {
        this.f13496b.removeListener(transitionListener);
        return super.removeListener(transitionListener);
    }

    @Override // android.transition.Transition
    public final void setEpicenterCallback(Transition.EpicenterCallback epicenterCallback) {
        this.f13496b.setEpicenterCallback(epicenterCallback);
        super.setEpicenterCallback(epicenterCallback);
    }
}
