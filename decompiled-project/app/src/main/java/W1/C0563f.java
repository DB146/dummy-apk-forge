package W1;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: W1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0563f extends n0 {

    /* renamed from: c, reason: collision with root package name */
    public final C0564g f10471c;

    public C0563f(C0564g c0564g) {
        this.f10471c = c0564g;
    }

    @Override // W1.n0
    public final void b(ViewGroup container) {
        kotlin.jvm.internal.l.e(container, "container");
        C0564g c0564g = this.f10471c;
        o0 o0Var = (o0) c0564g.f3094a;
        View view = o0Var.f10533c.f10277U;
        view.clearAnimation();
        container.endViewTransition(view);
        ((o0) c0564g.f3094a).c(this);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + o0Var + " has been cancelled.");
        }
    }

    @Override // W1.n0
    public final void c(ViewGroup container) {
        kotlin.jvm.internal.l.e(container, "container");
        C0564g c0564g = this.f10471c;
        boolean t5 = c0564g.t();
        o0 o0Var = (o0) c0564g.f3094a;
        if (t5) {
            o0Var.c(this);
            return;
        }
        Context context = container.getContext();
        View view = o0Var.f10533c.f10277U;
        kotlin.jvm.internal.l.d(context, "context");
        q3.e K10 = c0564g.K(context);
        if (K10 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Animation animation = (Animation) K10.f23376b;
        if (animation == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (o0Var.f10531a != 1) {
            view.startAnimation(animation);
            o0Var.c(this);
            return;
        }
        container.startViewTransition(view);
        H h10 = new H(animation, container, view);
        h10.setAnimationListener(new AnimationAnimationListenerC0562e(o0Var, container, view, this));
        view.startAnimation(h10);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + o0Var + " has started.");
        }
    }
}
