package t6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f24502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24503b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f24504c;

    public g(h hVar, boolean z8, int i7) {
        this.f24504c = hVar;
        this.f24502a = z8;
        this.f24503b = i7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h hVar = this.f24504c;
        hVar.f24493b.setTranslationX(0.0f);
        hVar.a(0.0f, this.f24502a, this.f24503b);
    }
}
