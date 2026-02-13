package B6;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
public final class h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f2122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2123b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f2124c;

    public h(i iVar, View view, View view2) {
        this.f2124c = iVar;
        this.f2122a = view;
        this.f2123b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f2124c.c(this.f2122a, this.f2123b, valueAnimator.getAnimatedFraction());
    }
}
