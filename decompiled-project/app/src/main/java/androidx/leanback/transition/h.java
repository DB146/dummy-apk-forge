package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.Transition;
import android.view.View;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f13522a;

    /* renamed from: b, reason: collision with root package name */
    public final View f13523b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13524c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13525d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f13526e;

    /* renamed from: f, reason: collision with root package name */
    public float f13527f;
    public float g;

    /* renamed from: h, reason: collision with root package name */
    public final float f13528h;

    /* renamed from: i, reason: collision with root package name */
    public final float f13529i;

    public h(View view, View view2, int i7, int i10, float f4, float f10) {
        this.f13523b = view;
        this.f13522a = view2;
        this.f13524c = i7 - Math.round(view.getTranslationX());
        this.f13525d = i10 - Math.round(view.getTranslationY());
        this.f13528h = f4;
        this.f13529i = f10;
        int[] iArr = (int[]) view2.getTag(R.id.transitionPosition);
        this.f13526e = iArr;
        if (iArr != null) {
            view2.setTag(R.id.transitionPosition, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.f13526e == null) {
            this.f13526e = new int[2];
        }
        int[] iArr = this.f13526e;
        float f4 = this.f13524c;
        View view = this.f13523b;
        iArr[0] = Math.round(view.getTranslationX() + f4);
        this.f13526e[1] = Math.round(view.getTranslationY() + this.f13525d);
        this.f13522a.setTag(R.id.transitionPosition, this.f13526e);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        View view = this.f13523b;
        this.f13527f = view.getTranslationX();
        this.g = view.getTranslationY();
        view.setTranslationX(this.f13528h);
        view.setTranslationY(this.f13529i);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        float f4 = this.f13527f;
        View view = this.f13523b;
        view.setTranslationX(f4);
        view.setTranslationY(this.g);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        float f4 = this.f13528h;
        View view = this.f13523b;
        view.setTranslationX(f4);
        view.setTranslationY(this.f13529i);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }
}
