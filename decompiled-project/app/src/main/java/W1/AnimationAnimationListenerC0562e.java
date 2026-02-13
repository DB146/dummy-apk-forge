package W1;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: W1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0562e implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o0 f10465a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f10466b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f10467c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0563f f10468d;

    public AnimationAnimationListenerC0562e(o0 o0Var, ViewGroup viewGroup, View view, C0563f c0563f) {
        this.f10465a = o0Var;
        this.f10466b = viewGroup;
        this.f10467c = view;
        this.f10468d = c0563f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        kotlin.jvm.internal.l.e(animation, "animation");
        View view = this.f10467c;
        C0563f c0563f = this.f10468d;
        ViewGroup viewGroup = this.f10466b;
        viewGroup.post(new P4.G(viewGroup, view, c0563f, 1));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f10465a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        kotlin.jvm.internal.l.e(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        kotlin.jvm.internal.l.e(animation, "animation");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f10465a + " has reached onAnimationStart.");
        }
    }
}
