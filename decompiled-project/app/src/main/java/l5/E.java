package l5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class E extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19335a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f19336b;

    public /* synthetic */ E(G g, int i7) {
        this.f19335a = i7;
        this.f19336b = g;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f19335a) {
            case 0:
                G g = this.f19336b;
                View view = g.f19344b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup = g.f19345c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                ViewGroup viewGroup2 = g.f19347e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                    return;
                }
                return;
            case 1:
            default:
                super.onAnimationEnd(animator);
                return;
            case 2:
                this.f19336b.i(0);
                return;
            case 3:
                this.f19336b.i(0);
                return;
            case 4:
                ViewGroup viewGroup3 = this.f19336b.f19348f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                    return;
                }
                return;
            case 5:
                ViewGroup viewGroup4 = this.f19336b.f19349h;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        G g = this.f19336b;
        switch (this.f19335a) {
            case 0:
                View view = g.j;
                if (!(view instanceof C1490d) || g.f19340A) {
                    return;
                }
                C1490d c1490d = (C1490d) view;
                ValueAnimator valueAnimator = c1490d.f19439S;
                if (valueAnimator.isStarted()) {
                    valueAnimator.cancel();
                }
                valueAnimator.setFloatValues(c1490d.f19440T, 0.0f);
                valueAnimator.setDuration(250L);
                valueAnimator.start();
                return;
            case 1:
                View view2 = g.f19344b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ViewGroup viewGroup = g.f19345c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = g.f19347e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(g.f19340A ? 0 : 4);
                }
                View view3 = g.j;
                if (!(view3 instanceof C1490d) || g.f19340A) {
                    return;
                }
                C1490d c1490d2 = (C1490d) view3;
                ValueAnimator valueAnimator2 = c1490d2.f19439S;
                if (valueAnimator2.isStarted()) {
                    valueAnimator2.cancel();
                }
                c1490d2.f19441U = false;
                valueAnimator2.setFloatValues(c1490d2.f19440T, 1.0f);
                valueAnimator2.setDuration(250L);
                valueAnimator2.start();
                return;
            case 2:
                g.i(4);
                return;
            case 3:
                g.i(4);
                return;
            case 4:
                ViewGroup viewGroup3 = g.f19349h;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                    g.f19349h.setTranslationX(r9.getWidth());
                    ViewGroup viewGroup4 = g.f19349h;
                    viewGroup4.scrollTo(viewGroup4.getWidth(), 0);
                    return;
                }
                return;
            default:
                ViewGroup viewGroup5 = g.f19348f;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
