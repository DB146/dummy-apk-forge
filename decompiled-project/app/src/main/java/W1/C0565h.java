package W1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: W1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0565h extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f10482a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f10483b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f10484c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o0 f10485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0566i f10486e;

    public C0565h(ViewGroup viewGroup, View view, boolean z8, o0 o0Var, C0566i c0566i) {
        this.f10482a = viewGroup;
        this.f10483b = view;
        this.f10484c = z8;
        this.f10485d = o0Var;
        this.f10486e = c0566i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        kotlin.jvm.internal.l.e(anim, "anim");
        ViewGroup viewGroup = this.f10482a;
        View viewToAnimate = this.f10483b;
        viewGroup.endViewTransition(viewToAnimate);
        boolean z8 = this.f10484c;
        o0 o0Var = this.f10485d;
        if (z8) {
            int i7 = o0Var.f10531a;
            kotlin.jvm.internal.l.d(viewToAnimate, "viewToAnimate");
            A3.c.a(i7, viewToAnimate, viewGroup);
        }
        C0566i c0566i = this.f10486e;
        ((o0) c0566i.f10489c.f3094a).c(c0566i);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + o0Var + " has ended.");
        }
    }
}
