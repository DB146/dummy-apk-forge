package a3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: a3.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0722N extends AnimatorListenerAdapter implements s {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f12512a;

    /* renamed from: b, reason: collision with root package name */
    public final View f12513b;

    /* renamed from: c, reason: collision with root package name */
    public final View f12514c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12515d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0730g f12516e;

    public C0722N(C0730g c0730g, ViewGroup viewGroup, View view, View view2) {
        this.f12516e = c0730g;
        this.f12512a = viewGroup;
        this.f12513b = view;
        this.f12514c = view2;
    }

    @Override // a3.s
    public final void b() {
    }

    @Override // a3.s
    public final void c() {
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
        if (this.f12515d) {
            g();
        }
    }

    public final void g() {
        this.f12514c.setTag(R.id.save_overlay_view, null);
        this.f12512a.getOverlay().remove(this.f12513b);
        this.f12515d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z8) {
        if (z8) {
            return;
        }
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f12512a.getOverlay().remove(this.f12513b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f12513b;
        if (view.getParent() == null) {
            this.f12512a.getOverlay().add(view);
        } else {
            this.f12516e.d();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z8) {
        if (z8) {
            View view = this.f12514c;
            View view2 = this.f12513b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f12512a.getOverlay().add(view2);
            this.f12515d = true;
        }
    }
}
