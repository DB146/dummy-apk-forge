package H2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class r extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4790a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0304s f4791b;

    public r(C0304s c0304s) {
        this.f4791b = c0304s;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f4790a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f4790a) {
            this.f4790a = false;
            return;
        }
        C0304s c0304s = this.f4791b;
        if (((Float) c0304s.f4824z.getAnimatedValue()).floatValue() == 0.0f) {
            c0304s.f4800A = 0;
            c0304s.f(0);
        } else {
            c0304s.f4800A = 2;
            c0304s.f4817s.invalidate();
        }
    }
}
