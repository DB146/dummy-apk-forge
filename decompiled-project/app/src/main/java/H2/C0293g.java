package H2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: H2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0293g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4683a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0294h f4684b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f4685c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f4686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0296j f4687e;

    public /* synthetic */ C0293g(C0296j c0296j, C0294h c0294h, ViewPropertyAnimator viewPropertyAnimator, View view, int i7) {
        this.f4683a = i7;
        this.f4687e = c0296j;
        this.f4684b = c0294h;
        this.f4685c = viewPropertyAnimator;
        this.f4686d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4683a) {
            case 0:
                this.f4685c.setListener(null);
                View view = this.f4686d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0294h c0294h = this.f4684b;
                i0 i0Var = c0294h.f4688a;
                C0296j c0296j = this.f4687e;
                c0296j.c(i0Var);
                c0296j.f4732r.remove(c0294h.f4688a);
                c0296j.i();
                return;
            default:
                this.f4685c.setListener(null);
                View view2 = this.f4686d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0294h c0294h2 = this.f4684b;
                i0 i0Var2 = c0294h2.f4689b;
                C0296j c0296j2 = this.f4687e;
                c0296j2.c(i0Var2);
                c0296j2.f4732r.remove(c0294h2.f4689b);
                c0296j2.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f4683a) {
            case 0:
                i0 i0Var = this.f4684b.f4688a;
                this.f4687e.getClass();
                return;
            default:
                i0 i0Var2 = this.f4684b.f4689b;
                this.f4687e.getClass();
                return;
        }
    }
}
