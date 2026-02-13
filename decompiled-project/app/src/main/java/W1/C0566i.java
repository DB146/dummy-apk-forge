package W1;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import c.C0857a;

/* renamed from: W1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0566i extends n0 {

    /* renamed from: c, reason: collision with root package name */
    public final C0564g f10489c;

    /* renamed from: d, reason: collision with root package name */
    public AnimatorSet f10490d;

    public C0566i(C0564g c0564g) {
        this.f10489c = c0564g;
    }

    @Override // W1.n0
    public final void b(ViewGroup container) {
        kotlin.jvm.internal.l.e(container, "container");
        AnimatorSet animatorSet = this.f10490d;
        o0 o0Var = (o0) this.f10489c.f3094a;
        if (animatorSet == null) {
            o0Var.c(this);
            return;
        }
        if (!o0Var.g) {
            animatorSet.end();
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0568k.f10498a.a(animatorSet);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            StringBuilder sb2 = new StringBuilder("Animator from operation ");
            sb2.append(o0Var);
            sb2.append(" has been canceled");
            sb2.append(o0Var.g ? " with seeking." : ".");
            sb2.append(' ');
            Log.v("FragmentManager", sb2.toString());
        }
    }

    @Override // W1.n0
    public final void c(ViewGroup container) {
        kotlin.jvm.internal.l.e(container, "container");
        o0 o0Var = (o0) this.f10489c.f3094a;
        AnimatorSet animatorSet = this.f10490d;
        if (animatorSet == null) {
            o0Var.c(this);
            return;
        }
        animatorSet.start();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + o0Var + " has started.");
        }
    }

    @Override // W1.n0
    public final void d(C0857a backEvent, ViewGroup container) {
        kotlin.jvm.internal.l.e(backEvent, "backEvent");
        kotlin.jvm.internal.l.e(container, "container");
        C0564g c0564g = this.f10489c;
        AnimatorSet animatorSet = this.f10490d;
        o0 o0Var = (o0) c0564g.f3094a;
        if (animatorSet == null) {
            o0Var.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !o0Var.f10533c.f10259B) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + o0Var);
        }
        long a9 = C0567j.f10491a.a(animatorSet);
        long j = backEvent.f14018c * ((float) a9);
        if (j == 0) {
            j = 1;
        }
        if (j == a9) {
            j = a9 - 1;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Setting currentPlayTime to " + j + " for Animator " + animatorSet + " on operation " + o0Var);
        }
        C0568k.f10498a.b(animatorSet, j);
    }

    @Override // W1.n0
    public final void e(ViewGroup container) {
        kotlin.jvm.internal.l.e(container, "container");
        C0564g c0564g = this.f10489c;
        if (c0564g.t()) {
            return;
        }
        Context context = container.getContext();
        kotlin.jvm.internal.l.d(context, "context");
        q3.e K10 = c0564g.K(context);
        this.f10490d = K10 != null ? (AnimatorSet) K10.f23377c : null;
        o0 o0Var = (o0) c0564g.f3094a;
        C c10 = o0Var.f10533c;
        boolean z8 = o0Var.f10531a == 3;
        View view = c10.f10277U;
        container.startViewTransition(view);
        AnimatorSet animatorSet = this.f10490d;
        if (animatorSet != null) {
            animatorSet.addListener(new C0565h(container, view, z8, o0Var, this));
        }
        AnimatorSet animatorSet2 = this.f10490d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
