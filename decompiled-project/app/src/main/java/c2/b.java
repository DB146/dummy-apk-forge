package c2;

import B0.C;
import android.animation.Animator;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes.dex */
public final class b implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final C f14130a = new C(this, 24);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f14131b;

    public b(h hVar) {
        this.f14131b = hVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h hVar = this.f14131b;
        g gVar = hVar.f14154l;
        if (gVar != null) {
            gVar.a(R.id.background_imageout, hVar.f14146a);
        }
        hVar.f14147b.post(this.f14130a);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
