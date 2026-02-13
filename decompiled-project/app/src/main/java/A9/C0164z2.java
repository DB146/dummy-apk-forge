package A9;

import android.animation.TimeAnimator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: A9.z2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0164z2 implements TimeAnimator.TimeListener {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0156x2 f1490a;

    /* renamed from: b, reason: collision with root package name */
    public final C0109l2 f1491b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeAnimator f1492c;

    /* renamed from: d, reason: collision with root package name */
    public int f1493d;

    /* renamed from: e, reason: collision with root package name */
    public DecelerateInterpolator f1494e;

    /* renamed from: f, reason: collision with root package name */
    public float f1495f;
    public float g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ A2 f1496h;

    public C0164z2(A2 a22, C0131r1 c0131r1) {
        this.f1496h = a22;
        TimeAnimator timeAnimator = new TimeAnimator();
        this.f1492c = timeAnimator;
        this.f1490a = (AbstractC0156x2) c0131r1.f1354u;
        this.f1491b = c0131r1.f1355v;
        timeAnimator.setTimeListener(this);
    }

    @Override // android.animation.TimeAnimator.TimeListener
    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j10) {
        float f4;
        TimeAnimator timeAnimator2 = this.f1492c;
        if (timeAnimator2.isRunning()) {
            int i7 = this.f1493d;
            if (j >= i7) {
                timeAnimator2.end();
                f4 = 1.0f;
            } else {
                f4 = (float) (j / i7);
            }
            DecelerateInterpolator decelerateInterpolator = this.f1494e;
            if (decelerateInterpolator != null) {
                f4 = decelerateInterpolator.getInterpolation(f4);
            }
            float f10 = (f4 * this.g) + this.f1495f;
            AbstractC0156x2 abstractC0156x2 = this.f1490a;
            abstractC0156x2.getClass();
            C0152w2 l10 = AbstractC0156x2.l(this.f1491b);
            l10.j = f10;
            abstractC0156x2.t(l10);
        }
    }
}
