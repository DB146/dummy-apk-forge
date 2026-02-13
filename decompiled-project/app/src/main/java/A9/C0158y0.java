package A9;

import android.animation.TimeAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.kt.apps.media.xemtv.beta.R;
import d2.C1042b;

/* renamed from: A9.y0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0158y0 implements TimeAnimator.TimeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f1474a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1475b;

    /* renamed from: c, reason: collision with root package name */
    public final b3 f1476c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1477d;

    /* renamed from: e, reason: collision with root package name */
    public float f1478e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f1479f;
    public float g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeAnimator f1480h;

    /* renamed from: i, reason: collision with root package name */
    public final AccelerateDecelerateInterpolator f1481i;
    public final C1042b j;

    public C0158y0(View view, float f4) {
        TimeAnimator timeAnimator = new TimeAnimator();
        this.f1480h = timeAnimator;
        this.f1481i = new AccelerateDecelerateInterpolator();
        this.f1474a = view;
        this.f1475b = 150;
        this.f1477d = f4 - 1.0f;
        if (view instanceof b3) {
            this.f1476c = (b3) view;
        } else {
            this.f1476c = null;
        }
        timeAnimator.setTimeListener(this);
        this.j = null;
    }

    public final void a(boolean z8, boolean z10) {
        TimeAnimator timeAnimator = this.f1480h;
        timeAnimator.end();
        float f4 = z8 ? 1.0f : 0.0f;
        if (z10) {
            b(f4);
            return;
        }
        float f10 = this.f1478e;
        if (f10 != f4) {
            this.f1479f = f10;
            this.g = f4 - f10;
            timeAnimator.start();
        }
    }

    public final void b(float f4) {
        this.f1478e = f4;
        float f10 = (this.f1477d * f4) + 1.0f;
        View view = this.f1474a;
        view.setScaleX(f10);
        view.setScaleY(f10);
        b3 b3Var = this.f1476c;
        if (b3Var != null) {
            b3Var.setShadowFocusLevel(f4);
        } else {
            e3.b(view.getTag(R.id.lb_shadow_impl), 3, f4);
        }
        C1042b c1042b = this.j;
        if (c1042b != null) {
            c1042b.b(f4);
            int color = c1042b.f16488c.getColor();
            if (b3Var != null) {
                b3Var.setOverlayColor(color);
                return;
            }
            Drawable foreground = view.getForeground();
            if (foreground instanceof ColorDrawable) {
                ((ColorDrawable) foreground).setColor(color);
            } else {
                view.setForeground(new ColorDrawable(color));
            }
        }
    }

    @Override // android.animation.TimeAnimator.TimeListener
    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j10) {
        float f4;
        int i7 = this.f1475b;
        if (j >= i7) {
            this.f1480h.end();
            f4 = 1.0f;
        } else {
            f4 = (float) (j / i7);
        }
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = this.f1481i;
        if (accelerateDecelerateInterpolator != null) {
            f4 = accelerateDecelerateInterpolator.getInterpolation(f4);
        }
        b((f4 * this.g) + this.f1479f);
    }
}
