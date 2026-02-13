package W1;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import y1.ViewTreeObserverOnPreDrawListenerC2368p;

/* loaded from: classes.dex */
public final class H extends AnimationSet implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f10319a;

    /* renamed from: b, reason: collision with root package name */
    public final View f10320b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10321c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10322d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10323e;

    public H(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f10323e = true;
        this.f10319a = viewGroup;
        this.f10320b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f10323e = true;
        if (this.f10321c) {
            return !this.f10322d;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f10321c = true;
            ViewTreeObserverOnPreDrawListenerC2368p.a(this.f10319a, this);
        }
        return true;
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f4) {
        this.f10323e = true;
        if (this.f10321c) {
            return !this.f10322d;
        }
        if (!super.getTransformation(j, transformation, f4)) {
            this.f10321c = true;
            ViewTreeObserverOnPreDrawListenerC2368p.a(this.f10319a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z8 = this.f10321c;
        ViewGroup viewGroup = this.f10319a;
        if (z8 || !this.f10323e) {
            viewGroup.endViewTransition(this.f10320b);
            this.f10322d = true;
        } else {
            this.f10323e = false;
            viewGroup.post(this);
        }
    }
}
