package C6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2920a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f2921b;

    public /* synthetic */ b(c cVar, int i7) {
        this.f2920a = i7;
        this.f2921b = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f2920a) {
            case 1:
                this.f2921b.f2973b.h(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2920a) {
            case 0:
                this.f2921b.f2973b.h(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
