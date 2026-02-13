package a3;

import a.AbstractC0672a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: a3.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0721M extends AnimatorListenerAdapter implements s {

    /* renamed from: a, reason: collision with root package name */
    public final View f12506a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12507b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f12508c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12510e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12511f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12509d = true;

    public C0721M(View view, int i7) {
        this.f12506a = view;
        this.f12507b = i7;
        this.f12508c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // a3.s
    public final void b() {
        g(false);
        if (this.f12511f) {
            return;
        }
        AbstractC0714F.b(this.f12506a, this.f12507b);
    }

    @Override // a3.s
    public final void c() {
        g(true);
        if (this.f12511f) {
            return;
        }
        AbstractC0714F.b(this.f12506a, 0);
    }

    @Override // a3.s
    public final void d(u uVar) {
        uVar.B(this);
    }

    @Override // a3.s
    public final void e(u uVar) {
    }

    @Override // a3.s
    public final void f(u uVar) {
    }

    public final void g(boolean z8) {
        ViewGroup viewGroup;
        if (!this.f12509d || this.f12510e == z8 || (viewGroup = this.f12508c) == null) {
            return;
        }
        this.f12510e = z8;
        AbstractC0672a.r(viewGroup, z8);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f12511f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f12511f) {
            AbstractC0714F.b(this.f12506a, this.f12507b);
            ViewGroup viewGroup = this.f12508c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z8) {
        if (z8) {
            return;
        }
        if (!this.f12511f) {
            AbstractC0714F.b(this.f12506a, this.f12507b);
            ViewGroup viewGroup = this.f12508c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z8) {
        if (z8) {
            AbstractC0714F.b(this.f12506a, 0);
            ViewGroup viewGroup = this.f12508c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }
}
