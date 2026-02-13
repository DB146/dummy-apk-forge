package a3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import u.C2052e;
import y1.T;
import y1.W;
import y1.a0;

/* renamed from: a3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0737n extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12549a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12550b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12551c;

    public C0737n(u uVar, C2052e c2052e) {
        this.f12549a = 0;
        this.f12551c = uVar;
        this.f12550b = c2052e;
    }

    public /* synthetic */ C0737n(Object obj, View view, int i7) {
        this.f12549a = i7;
        this.f12550b = obj;
        this.f12551c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f12549a) {
            case 1:
                ((T) this.f12550b).b();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f12549a) {
            case 0:
                ((C2052e) this.f12550b).remove(animator);
                ((u) this.f12551c).f12575B.remove(animator);
                return;
            case 1:
                ((T) this.f12550b).a();
                return;
            default:
                a0 a0Var = (a0) this.f12550b;
                a0Var.f26678a.d(1.0f);
                W.e((View) this.f12551c, a0Var);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f12549a) {
            case 0:
                ((u) this.f12551c).f12575B.add(animator);
                return;
            case 1:
                ((T) this.f12550b).c();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
