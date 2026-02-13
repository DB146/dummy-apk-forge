package A9;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: A9.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class AnimationAnimationListenerC0106l implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0118o f1268b;

    public /* synthetic */ AnimationAnimationListenerC0106l(AbstractC0118o abstractC0118o, int i7) {
        this.f1267a = i7;
        this.f1268b = abstractC0118o;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }

    private final void e(Animation animation) {
    }

    private final void f(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.f1267a) {
            case 0:
                AbstractC0118o abstractC0118o = this.f1268b;
                if (abstractC0118o.f1308A == 0.0f) {
                    for (int i7 = 0; i7 < abstractC0118o.f1318f.size(); i7++) {
                        ((View) abstractC0118o.f1318f.get(i7)).setVisibility(8);
                    }
                    return;
                }
                return;
            case 1:
                AbstractC0118o abstractC0118o2 = this.f1268b;
                if (abstractC0118o2.f1309B == 0.0f) {
                    for (int i10 = 0; i10 < abstractC0118o2.f1317e.size(); i10++) {
                        ((View) abstractC0118o2.f1317e.get(i10)).setVisibility(8);
                    }
                    return;
                }
                return;
            default:
                AbstractC0118o abstractC0118o3 = this.f1268b;
                if (abstractC0118o3.f1310C == 0.0d) {
                    for (int i11 = 0; i11 < abstractC0118o3.f1317e.size(); i11++) {
                        ((View) abstractC0118o3.f1317e.get(i11)).setVisibility(8);
                    }
                    return;
                }
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i7 = this.f1267a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i7 = this.f1267a;
    }
}
