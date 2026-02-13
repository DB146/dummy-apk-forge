package c2;

import android.animation.TimeAnimator;
import android.view.animation.DecelerateInterpolator;
import com.kt.apps.media.xemtv.beta.R;
import i2.AbstractC1309Q;
import i2.C1324l;
import i2.C1335w;

/* loaded from: classes.dex */
public final class v implements TimeAnimator.TimeListener {

    /* renamed from: h, reason: collision with root package name */
    public static final DecelerateInterpolator f14239h = new DecelerateInterpolator(2.0f);

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1309Q f14240a;

    /* renamed from: b, reason: collision with root package name */
    public final C9.h f14241b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeAnimator f14242c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14243d;

    /* renamed from: e, reason: collision with root package name */
    public final DecelerateInterpolator f14244e;

    /* renamed from: f, reason: collision with root package name */
    public float f14245f;
    public float g;

    public v(C1335w c1335w) {
        TimeAnimator timeAnimator = new TimeAnimator();
        this.f14242c = timeAnimator;
        this.f14240a = (AbstractC1309Q) c1335w.f18306u;
        this.f14241b = c1335w.f18307v;
        timeAnimator.setTimeListener(this);
        this.f14243d = c1335w.f4707a.getResources().getInteger(R.integer.lb_browse_rows_anim_duration);
        this.f14244e = f14239h;
    }

    @Override // android.animation.TimeAnimator.TimeListener
    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j10) {
        float f4;
        TimeAnimator timeAnimator2 = this.f14242c;
        if (timeAnimator2.isRunning()) {
            int i7 = this.f14243d;
            if (j >= i7) {
                timeAnimator2.end();
                f4 = 1.0f;
            } else {
                f4 = (float) (j / i7);
            }
            DecelerateInterpolator decelerateInterpolator = this.f14244e;
            if (decelerateInterpolator != null) {
                f4 = decelerateInterpolator.getInterpolation(f4);
            }
            float f10 = (f4 * this.g) + this.f14245f;
            AbstractC1309Q abstractC1309Q = this.f14240a;
            abstractC1309Q.getClass();
            C1324l j11 = AbstractC1309Q.j(this.f14241b);
            j11.f18278u = f10;
            abstractC1309Q.p(j11);
        }
    }
}
