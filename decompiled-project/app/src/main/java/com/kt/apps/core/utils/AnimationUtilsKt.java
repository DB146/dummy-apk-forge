package com.kt.apps.core.utils;

import H2.K;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public final class AnimationUtilsKt {
    public static final void fadeIn(final View view, boolean z8, final Rb.a onAnimationEnd) {
        kotlin.jvm.internal.l.e(view, "<this>");
        kotlin.jvm.internal.l.e(onAnimationEnd, "onAnimationEnd");
        if (view.getVisibility() != 0 || view.getAlpha() <= 0.0f) {
            view.animate().alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: com.kt.apps.core.utils.AnimationUtilsKt$fadeIn$2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animation) {
                    kotlin.jvm.internal.l.e(animation, "animation");
                    super.onAnimationCancel(animation);
                    AnimationUtilsKt.visible(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    kotlin.jvm.internal.l.e(animation, "animation");
                    super.onAnimationEnd(animation);
                    AnimationUtilsKt.visible(view);
                    onAnimationEnd.invoke();
                }
            });
        } else if (z8) {
            onAnimationEnd.invoke();
        }
    }

    public static /* synthetic */ void fadeIn$default(View view, boolean z8, Rb.a aVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z8 = false;
        }
        if ((i7 & 2) != 0) {
            aVar = new S9.a(27);
        }
        fadeIn(view, z8, aVar);
    }

    public static final void fadeOut(final View view, boolean z8, final Rb.a onAnimationEnd) {
        kotlin.jvm.internal.l.e(view, "<this>");
        kotlin.jvm.internal.l.e(onAnimationEnd, "onAnimationEnd");
        if (view.getVisibility() == 0) {
            view.animate().alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.kt.apps.core.utils.AnimationUtilsKt$fadeOut$2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animation) {
                    kotlin.jvm.internal.l.e(animation, "animation");
                    super.onAnimationCancel(animation);
                    Rb.a.this.invoke();
                    AnimationUtilsKt.gone(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    kotlin.jvm.internal.l.e(animation, "animation");
                    super.onAnimationEnd(animation);
                    Rb.a.this.invoke();
                    AnimationUtilsKt.gone(view);
                }
            });
        } else if (z8) {
            onAnimationEnd.invoke();
        }
    }

    public static /* synthetic */ void fadeOut$default(View view, boolean z8, Rb.a aVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z8 = false;
        }
        if ((i7 & 2) != 0) {
            aVar = new S9.a(28);
        }
        fadeOut(view, z8, aVar);
    }

    public static final void gone(View view) {
        kotlin.jvm.internal.l.e(view, "<this>");
        view.setVisibility(8);
    }

    public static final void inVisible(View view) {
        kotlin.jvm.internal.l.e(view, "<this>");
        view.setVisibility(4);
    }

    public static final void runLayoutAnimation(RecyclerView recyclerView) {
        kotlin.jvm.internal.l.e(recyclerView, "<this>");
        recyclerView.setLayoutAnimation(android.view.animation.AnimationUtils.loadLayoutAnimation(recyclerView.getContext(), R.anim.recycler_view_layout_anim_fall_down));
        K adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.d();
        }
        recyclerView.scheduleLayoutAnimation();
    }

    public static final void setColorSchemaDefault(X2.a aVar, Context context) {
        kotlin.jvm.internal.l.e(aVar, "<this>");
        throw null;
    }

    public static final void setColorSchemaDefault(X2.b bVar, Context context) {
        kotlin.jvm.internal.l.e(bVar, "<this>");
        throw null;
    }

    public static final void setVisible(View view, boolean z8) {
        kotlin.jvm.internal.l.e(view, "<this>");
        view.setVisibility(z8 ? 0 : 8);
    }

    public static final void startHideOrShowAnimation(final View view, boolean z8, Rb.a onAnimationEnd) {
        kotlin.jvm.internal.l.e(view, "<this>");
        kotlin.jvm.internal.l.e(onAnimationEnd, "onAnimationEnd");
        if (z8 && view.getVisibility() == 0) {
            return;
        }
        if (z8 || view.getVisibility() != 4) {
            int width = view.getWidth() / 2;
            int height = view.getHeight() / 2;
            float hypot = (float) Math.hypot(width, height);
            float f4 = 0.0f;
            if (z8) {
                f4 = hypot;
                hypot = 0.0f;
            }
            final Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, width, height, hypot, f4);
            kotlin.jvm.internal.l.d(createCircularReveal, "createCircularReveal(...)");
            createCircularReveal.addListener(new AnimatorListenerAdapter() { // from class: com.kt.apps.core.utils.AnimationUtilsKt$startHideOrShowAnimation$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    kotlin.jvm.internal.l.e(animation, "animation");
                    super.onAnimationEnd(animation);
                    AnimationUtilsKt.gone(view);
                    createCircularReveal.removeAllListeners();
                }
            });
            createCircularReveal.start();
        }
    }

    public static final void translateY(View view, float f4, Rb.a onAnimationCancel, final Rb.a onAnimationEnd) {
        kotlin.jvm.internal.l.e(view, "<this>");
        kotlin.jvm.internal.l.e(onAnimationCancel, "onAnimationCancel");
        kotlin.jvm.internal.l.e(onAnimationEnd, "onAnimationEnd");
        view.animate().translationY(f4).setListener(new AnimatorListenerAdapter() { // from class: com.kt.apps.core.utils.AnimationUtilsKt$translateY$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                kotlin.jvm.internal.l.e(animation, "animation");
                super.onAnimationCancel(animation);
                Rb.a.this.invoke();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                kotlin.jvm.internal.l.e(animation, "animation");
                super.onAnimationEnd(animation);
                Rb.a.this.invoke();
            }
        });
    }

    public static /* synthetic */ void translateY$default(View view, float f4, Rb.a aVar, Rb.a aVar2, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            aVar = new S9.a(29);
        }
        translateY(view, f4, aVar, aVar2);
    }

    public static final void visible(View view) {
        kotlin.jvm.internal.l.e(view, "<this>");
        view.setVisibility(0);
    }
}
