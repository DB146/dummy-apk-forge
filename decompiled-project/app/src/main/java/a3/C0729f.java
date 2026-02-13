package a3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: a3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0729f extends AnimatorListenerAdapter implements s {

    /* renamed from: a, reason: collision with root package name */
    public final View f12537a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12538b = false;

    public C0729f(View view) {
        this.f12537a = view;
    }

    @Override // a3.s
    public final void a(u uVar) {
    }

    @Override // a3.s
    public final void b() {
        View view = this.f12537a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? AbstractC0714F.f12501a.x(view) : 0.0f));
    }

    @Override // a3.s
    public final void c() {
        this.f12537a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // a3.s
    public final void d(u uVar) {
    }

    @Override // a3.s
    public final void e(u uVar) {
    }

    @Override // a3.s
    public final void f(u uVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AbstractC0714F.f12501a.D(this.f12537a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z8) {
        boolean z10 = this.f12538b;
        View view = this.f12537a;
        if (z10) {
            view.setLayerType(0, null);
        }
        if (z8) {
            return;
        }
        C0719K c0719k = AbstractC0714F.f12501a;
        c0719k.D(view, 1.0f);
        c0719k.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f12537a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f12538b = true;
            view.setLayerType(2, null);
        }
    }
}
