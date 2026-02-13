package H2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: H2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0292f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f4677a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4678b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f4679c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f4681e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0296j f4682f;

    public C0292f(C0296j c0296j, i0 i0Var, int i7, View view, int i10, ViewPropertyAnimator viewPropertyAnimator) {
        this.f4682f = c0296j;
        this.f4677a = i0Var;
        this.f4678b = i7;
        this.f4679c = view;
        this.f4680d = i10;
        this.f4681e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i7 = this.f4678b;
        View view = this.f4679c;
        if (i7 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f4680d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f4681e.setListener(null);
        C0296j c0296j = this.f4682f;
        i0 i0Var = this.f4677a;
        c0296j.c(i0Var);
        c0296j.f4730p.remove(i0Var);
        c0296j.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f4682f.getClass();
    }
}
