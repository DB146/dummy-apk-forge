package y9;

import A9.t3;
import android.animation.ValueAnimator;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.base.leanback.VerticalGridView;
import com.kt.apps.core.utils.AnimationUtilsKt;

/* renamed from: y9.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2468k implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27516a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC2456A f27517b;

    public /* synthetic */ C2468k(AbstractC2456A abstractC2456A, int i7) {
        this.f27516a = i7;
        this.f27517b = abstractC2456A;
    }

    @Override // Rb.a
    public final Object invoke() {
        VerticalGridView verticalGridView;
        t3 t3Var;
        VerticalGridView verticalGridView2;
        VerticalGridView verticalGridView3;
        final int i7 = 2;
        final int i10 = 1;
        final int i11 = 0;
        Db.q qVar = Db.q.f3365a;
        final AbstractC2456A t5 = this.f27517b;
        switch (this.f27516a) {
            case 0:
                Db.o oVar = AbstractC2456A.g2;
                return new ValueAnimator.AnimatorUpdateListener() { // from class: y9.n
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator it) {
                        AbstractC2456A abstractC2456A = t5;
                        switch (i7) {
                            case 0:
                                Db.o oVar2 = AbstractC2456A.g2;
                                kotlin.jvm.internal.l.e(it, "it");
                                if (kotlin.jvm.internal.l.a(it.getAnimatedValue(), Float.valueOf(0.0f))) {
                                    View view = abstractC2456A.f27474s1;
                                    if (view != null) {
                                        AnimationUtilsKt.inVisible(view);
                                    }
                                } else {
                                    View view2 = abstractC2456A.f27474s1;
                                    if (view2 != null) {
                                        AnimationUtilsKt.visible(view2);
                                    }
                                }
                                View view3 = abstractC2456A.f27474s1;
                                if (view3 != null) {
                                    Object animatedValue = it.getAnimatedValue();
                                    kotlin.jvm.internal.l.c(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                                    view3.setAlpha(((Float) animatedValue).floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                Db.o oVar3 = AbstractC2456A.g2;
                                kotlin.jvm.internal.l.e(it, "it");
                                if (kotlin.jvm.internal.l.a(it.getAnimatedValue(), Float.valueOf(0.0f))) {
                                    LinearLayout linearLayout = abstractC2456A.f27475u1;
                                    if (linearLayout != null) {
                                        AnimationUtilsKt.gone(linearLayout);
                                    }
                                } else {
                                    LinearLayout linearLayout2 = abstractC2456A.f27475u1;
                                    if (linearLayout2 != null) {
                                        AnimationUtilsKt.visible(linearLayout2);
                                    }
                                }
                                LinearLayout linearLayout3 = abstractC2456A.f27475u1;
                                if (linearLayout3 != null) {
                                    Object animatedValue2 = it.getAnimatedValue();
                                    kotlin.jvm.internal.l.c(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                                    linearLayout3.setAlpha(((Float) animatedValue2).floatValue());
                                    return;
                                }
                                return;
                            default:
                                Db.o oVar4 = AbstractC2456A.g2;
                                kotlin.jvm.internal.l.e(it, "it");
                                ImageButton imageButton = abstractC2456A.f27472q1;
                                if (imageButton != null) {
                                    Object animatedValue3 = it.getAnimatedValue();
                                    kotlin.jvm.internal.l.c(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                                    imageButton.setAlpha(((Float) animatedValue3).floatValue());
                                }
                                View view4 = abstractC2456A.f27435E1;
                                if (view4 != null) {
                                    Object animatedValue4 = it.getAnimatedValue();
                                    kotlin.jvm.internal.l.c(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                                    view4.setAlpha(((Float) animatedValue4).floatValue());
                                }
                                if (kotlin.jvm.internal.l.a(it.getAnimatedValue(), Float.valueOf(1.0f))) {
                                    View view5 = abstractC2456A.f27435E1;
                                    if (view5 != null) {
                                        AnimationUtilsKt.visible(view5);
                                    }
                                    ImageButton imageButton2 = abstractC2456A.f27472q1;
                                    if (imageButton2 != null) {
                                        AnimationUtilsKt.visible(imageButton2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                };
            case 1:
                Db.o oVar2 = AbstractC2456A.g2;
                return new s(t5);
            case 2:
                Db.o oVar3 = AbstractC2456A.g2;
                return new w(t5);
            case 3:
                Db.o oVar4 = AbstractC2456A.g2;
                return new z(t5);
            case 4:
                Db.o oVar5 = AbstractC2456A.g2;
                return new v(t5, Looper.getMainLooper());
            case 5:
                Db.o oVar6 = AbstractC2456A.g2;
                return new q(t5, i11);
            case 6:
                Db.o oVar7 = AbstractC2456A.g2;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setDuration(300L);
                ofFloat.addListener(new u(t5, 0));
                return ofFloat;
            case 7:
                Db.o oVar8 = AbstractC2456A.g2;
                return new ValueAnimator.AnimatorUpdateListener() { // from class: y9.n
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator it) {
                        AbstractC2456A abstractC2456A = t5;
                        switch (i11) {
                            case 0:
                                Db.o oVar22 = AbstractC2456A.g2;
                                kotlin.jvm.internal.l.e(it, "it");
                                if (kotlin.jvm.internal.l.a(it.getAnimatedValue(), Float.valueOf(0.0f))) {
                                    View view = abstractC2456A.f27474s1;
                                    if (view != null) {
                                        AnimationUtilsKt.inVisible(view);
                                    }
                                } else {
                                    View view2 = abstractC2456A.f27474s1;
                                    if (view2 != null) {
                                        AnimationUtilsKt.visible(view2);
                                    }
                                }
                                View view3 = abstractC2456A.f27474s1;
                                if (view3 != null) {
                                    Object animatedValue = it.getAnimatedValue();
                                    kotlin.jvm.internal.l.c(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                                    view3.setAlpha(((Float) animatedValue).floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                Db.o oVar32 = AbstractC2456A.g2;
                                kotlin.jvm.internal.l.e(it, "it");
                                if (kotlin.jvm.internal.l.a(it.getAnimatedValue(), Float.valueOf(0.0f))) {
                                    LinearLayout linearLayout = abstractC2456A.f27475u1;
                                    if (linearLayout != null) {
                                        AnimationUtilsKt.gone(linearLayout);
                                    }
                                } else {
                                    LinearLayout linearLayout2 = abstractC2456A.f27475u1;
                                    if (linearLayout2 != null) {
                                        AnimationUtilsKt.visible(linearLayout2);
                                    }
                                }
                                LinearLayout linearLayout3 = abstractC2456A.f27475u1;
                                if (linearLayout3 != null) {
                                    Object animatedValue2 = it.getAnimatedValue();
                                    kotlin.jvm.internal.l.c(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                                    linearLayout3.setAlpha(((Float) animatedValue2).floatValue());
                                    return;
                                }
                                return;
                            default:
                                Db.o oVar42 = AbstractC2456A.g2;
                                kotlin.jvm.internal.l.e(it, "it");
                                ImageButton imageButton = abstractC2456A.f27472q1;
                                if (imageButton != null) {
                                    Object animatedValue3 = it.getAnimatedValue();
                                    kotlin.jvm.internal.l.c(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                                    imageButton.setAlpha(((Float) animatedValue3).floatValue());
                                }
                                View view4 = abstractC2456A.f27435E1;
                                if (view4 != null) {
                                    Object animatedValue4 = it.getAnimatedValue();
                                    kotlin.jvm.internal.l.c(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                                    view4.setAlpha(((Float) animatedValue4).floatValue());
                                }
                                if (kotlin.jvm.internal.l.a(it.getAnimatedValue(), Float.valueOf(1.0f))) {
                                    View view5 = abstractC2456A.f27435E1;
                                    if (view5 != null) {
                                        AnimationUtilsKt.visible(view5);
                                    }
                                    ImageButton imageButton2 = abstractC2456A.f27472q1;
                                    if (imageButton2 != null) {
                                        AnimationUtilsKt.visible(imageButton2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                };
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                Db.o oVar9 = AbstractC2456A.g2;
                t5.N0(t.f27537d, true, null);
                View view = t5.f27473r1;
                if (view != null) {
                    view.clearFocus();
                }
                ImageButton imageButton = t5.f27472q1;
                if (imageButton != null) {
                    imageButton.requestFocus();
                }
                ViewGroup viewGroup = t5.f27436F1;
                if (viewGroup != null) {
                    AnimationUtilsKt.gone(viewGroup);
                }
                return qVar;
            case 9:
                AbstractC2456A.O0(t5);
                return qVar;
            case 10:
                FrameLayout frameLayout = t5.p1;
                if (frameLayout != null) {
                    AnimationUtilsKt.visible(frameLayout);
                }
                t3 t3Var2 = t5.f27465i1;
                if (t3Var2 != null && (verticalGridView = t3Var2.f1376c) != null) {
                    verticalGridView.requestFocus();
                }
                return qVar;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                ImageButton imageButton2 = t5.f27472q1;
                if (imageButton2 != null) {
                    imageButton2.setAlpha(0.0f);
                }
                FrameLayout frameLayout2 = t5.p1;
                if (frameLayout2 != null) {
                    frameLayout2.setTranslationY(t5.f27471o1);
                }
                return qVar;
            case 12:
                ImageButton imageButton3 = t5.f27472q1;
                if (imageButton3 != null) {
                    imageButton3.setAlpha(0.0f);
                }
                return qVar;
            case 13:
                TextView textView = t5.K1;
                if (textView != null) {
                    textView.setText((CharSequence) null);
                }
                View view2 = t5.f27440J1;
                if (view2 != null) {
                    AnimationUtilsKt.inVisible(view2);
                }
                return qVar;
            case 14:
                Db.o oVar10 = AbstractC2456A.g2;
                kotlin.jvm.internal.l.e(t5, "t");
                ImageButton imageButton4 = t5.f27472q1;
                if (imageButton4 != null) {
                    imageButton4.setAlpha(0.0f);
                }
                t3 t3Var3 = t5.f27465i1;
                if (t3Var3 != null && (verticalGridView3 = t3Var3.f1376c) != null) {
                    verticalGridView3.setSelectedPosition(0);
                }
                FrameLayout frameLayout3 = t5.p1;
                if (frameLayout3 != null) {
                    frameLayout3.setTranslationY(t5.f27471o1);
                }
                t5.f27470n1 = 0;
                if (!t5.R0() && (t3Var = t5.f27465i1) != null && (verticalGridView2 = t3Var.f1376c) != null) {
                    verticalGridView2.clearFocus();
                }
                t5.f27459d2 = t.f27537d;
                return qVar;
            case 15:
                Db.o oVar11 = AbstractC2456A.g2;
                t5.M0().a();
                t tVar = t5.f27459d2;
                if (tVar == t.f27537d || tVar == t.f27535b || tVar == t.f27534a) {
                    t5.N0(t.f27534a, false, null);
                } else {
                    Message.obtain(t5.K0(), 1000).sendToTarget();
                }
                return qVar;
            default:
                Db.o oVar12 = AbstractC2456A.g2;
                return new ValueAnimator.AnimatorUpdateListener() { // from class: y9.n
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator it) {
                        AbstractC2456A abstractC2456A = t5;
                        switch (i10) {
                            case 0:
                                Db.o oVar22 = AbstractC2456A.g2;
                                kotlin.jvm.internal.l.e(it, "it");
                                if (kotlin.jvm.internal.l.a(it.getAnimatedValue(), Float.valueOf(0.0f))) {
                                    View view3 = abstractC2456A.f27474s1;
                                    if (view3 != null) {
                                        AnimationUtilsKt.inVisible(view3);
                                    }
                                } else {
                                    View view22 = abstractC2456A.f27474s1;
                                    if (view22 != null) {
                                        AnimationUtilsKt.visible(view22);
                                    }
                                }
                                View view32 = abstractC2456A.f27474s1;
                                if (view32 != null) {
                                    Object animatedValue = it.getAnimatedValue();
                                    kotlin.jvm.internal.l.c(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                                    view32.setAlpha(((Float) animatedValue).floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                Db.o oVar32 = AbstractC2456A.g2;
                                kotlin.jvm.internal.l.e(it, "it");
                                if (kotlin.jvm.internal.l.a(it.getAnimatedValue(), Float.valueOf(0.0f))) {
                                    LinearLayout linearLayout = abstractC2456A.f27475u1;
                                    if (linearLayout != null) {
                                        AnimationUtilsKt.gone(linearLayout);
                                    }
                                } else {
                                    LinearLayout linearLayout2 = abstractC2456A.f27475u1;
                                    if (linearLayout2 != null) {
                                        AnimationUtilsKt.visible(linearLayout2);
                                    }
                                }
                                LinearLayout linearLayout3 = abstractC2456A.f27475u1;
                                if (linearLayout3 != null) {
                                    Object animatedValue2 = it.getAnimatedValue();
                                    kotlin.jvm.internal.l.c(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                                    linearLayout3.setAlpha(((Float) animatedValue2).floatValue());
                                    return;
                                }
                                return;
                            default:
                                Db.o oVar42 = AbstractC2456A.g2;
                                kotlin.jvm.internal.l.e(it, "it");
                                ImageButton imageButton5 = abstractC2456A.f27472q1;
                                if (imageButton5 != null) {
                                    Object animatedValue3 = it.getAnimatedValue();
                                    kotlin.jvm.internal.l.c(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                                    imageButton5.setAlpha(((Float) animatedValue3).floatValue());
                                }
                                View view4 = abstractC2456A.f27435E1;
                                if (view4 != null) {
                                    Object animatedValue4 = it.getAnimatedValue();
                                    kotlin.jvm.internal.l.c(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                                    view4.setAlpha(((Float) animatedValue4).floatValue());
                                }
                                if (kotlin.jvm.internal.l.a(it.getAnimatedValue(), Float.valueOf(1.0f))) {
                                    View view5 = abstractC2456A.f27435E1;
                                    if (view5 != null) {
                                        AnimationUtilsKt.visible(view5);
                                    }
                                    ImageButton imageButton22 = abstractC2456A.f27472q1;
                                    if (imageButton22 != null) {
                                        AnimationUtilsKt.visible(imageButton22);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                };
        }
    }
}
