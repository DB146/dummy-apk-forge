package y9;

import A9.t3;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageButton;
import com.kt.apps.core.base.leanback.VerticalGridView;
import com.kt.apps.core.utils.AnimationUtilsKt;

/* loaded from: classes2.dex */
public final class u extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27539a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC2456A f27540b;

    public /* synthetic */ u(AbstractC2456A abstractC2456A, int i7) {
        this.f27539a = i7;
        this.f27540b = abstractC2456A;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        switch (this.f27539a) {
            case 0:
                kotlin.jvm.internal.l.e(animation, "animation");
                super.onAnimationCancel(animation);
                onAnimationEnd(animation);
                return;
            case 1:
                kotlin.jvm.internal.l.e(animation, "animation");
                super.onAnimationCancel(animation);
                onAnimationEnd(animation);
                return;
            default:
                kotlin.jvm.internal.l.e(animation, "animation");
                super.onAnimationCancel(animation);
                onAnimationEnd(animation);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        VerticalGridView verticalGridView;
        ViewPropertyAnimator animate;
        View view;
        VerticalGridView verticalGridView2;
        AbstractC2456A abstractC2456A = this.f27540b;
        int i7 = this.f27539a;
        kotlin.jvm.internal.l.e(animation, "animation");
        switch (i7) {
            case 0:
                super.onAnimationEnd(animation);
                t state = abstractC2456A.f27459d2;
                kotlin.jvm.internal.l.e(state, "state");
                int ordinal = state.ordinal();
                if (ordinal == 0) {
                    t3 t3Var = abstractC2456A.f27465i1;
                    if (t3Var == null || (verticalGridView = t3Var.f1376c) == null) {
                        return;
                    }
                    verticalGridView.clearFocus();
                    return;
                }
                if (ordinal == 1) {
                    ImageButton imageButton = abstractC2456A.f27472q1;
                    if (imageButton != null && (animate = imageButton.animate()) != null) {
                        animate.cancel();
                    }
                    ImageButton imageButton2 = abstractC2456A.f27472q1;
                    if (imageButton2 != null) {
                        imageButton2.setAlpha(0.0f);
                        return;
                    }
                    return;
                }
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new Db.d(1);
                    }
                    t3 t3Var2 = abstractC2456A.f27465i1;
                    if (t3Var2 != null && (verticalGridView2 = t3Var2.f1376c) != null) {
                        verticalGridView2.clearFocus();
                    }
                    ImageButton imageButton3 = abstractC2456A.f27472q1;
                    if (imageButton3 != null) {
                        imageButton3.requestFocus();
                    }
                    View view2 = abstractC2456A.f27474s1;
                    if (view2 == null || view2.getVisibility() != 0 || (view = abstractC2456A.f27474s1) == null) {
                        return;
                    }
                    AnimationUtilsKt.fadeOut$default(view, false, null, 3, null);
                    return;
                }
                return;
            case 1:
                super.onAnimationEnd(animation);
                Db.o oVar = AbstractC2456A.g2;
                abstractC2456A.I0().setupEndValues();
                abstractC2456A.L0().onAnimationUpdate(abstractC2456A.I0());
                AbstractC2456A.O0(abstractC2456A);
                abstractC2456A.I0().removeListener(this);
                return;
            default:
                super.onAnimationEnd(animation);
                AbstractC2456A.O0(abstractC2456A);
                abstractC2456A.L0().onAnimationUpdate(ValueAnimator.ofFloat(1.0f));
                abstractC2456A.I0().removeListener(this);
                return;
        }
    }
}
