package H2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: H2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0291e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4659a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f4660b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f4661c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f4662d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0296j f4663e;

    public C0291e(C0296j c0296j, i0 i0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f4663e = c0296j;
        this.f4660b = i0Var;
        this.f4661c = view;
        this.f4662d = viewPropertyAnimator;
    }

    public C0291e(C0296j c0296j, i0 i0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f4663e = c0296j;
        this.f4660b = i0Var;
        this.f4662d = viewPropertyAnimator;
        this.f4661c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f4659a) {
            case 1:
                this.f4661c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4659a) {
            case 0:
                this.f4662d.setListener(null);
                this.f4661c.setAlpha(1.0f);
                C0296j c0296j = this.f4663e;
                i0 i0Var = this.f4660b;
                c0296j.c(i0Var);
                c0296j.f4731q.remove(i0Var);
                c0296j.i();
                return;
            default:
                this.f4662d.setListener(null);
                C0296j c0296j2 = this.f4663e;
                i0 i0Var2 = this.f4660b;
                c0296j2.c(i0Var2);
                c0296j2.f4729o.remove(i0Var2);
                c0296j2.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f4659a) {
            case 0:
                this.f4663e.getClass();
                return;
            default:
                this.f4663e.getClass();
                return;
        }
    }
}
