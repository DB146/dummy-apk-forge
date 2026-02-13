package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Property;
import android.view.View;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f13516a = false;

    /* renamed from: b, reason: collision with root package name */
    public float f13517b;

    /* renamed from: c, reason: collision with root package name */
    public final View f13518c;

    /* renamed from: d, reason: collision with root package name */
    public final float f13519d;

    /* renamed from: e, reason: collision with root package name */
    public final float f13520e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13521f;
    public final Property g;

    public g(View view, Property property, float f4, float f10, int i7) {
        this.g = property;
        this.f13518c = view;
        this.f13520e = f4;
        this.f13519d = f10;
        this.f13521f = i7;
        view.setVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        View view = this.f13518c;
        view.setTag(R.id.lb_slide_transition_value, new float[]{view.getTranslationX(), view.getTranslationY()});
        this.g.set(view, Float.valueOf(this.f13520e));
        this.f13516a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z8 = this.f13516a;
        View view = this.f13518c;
        if (!z8) {
            this.g.set(view, Float.valueOf(this.f13520e));
        }
        view.setVisibility(this.f13521f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        Property property = this.g;
        View view = this.f13518c;
        this.f13517b = ((Float) property.get(view)).floatValue();
        property.set(view, Float.valueOf(this.f13519d));
        view.setVisibility(this.f13521f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        Float valueOf = Float.valueOf(this.f13517b);
        Property property = this.g;
        View view = this.f13518c;
        property.set(view, valueOf);
        view.setVisibility(0);
    }
}
