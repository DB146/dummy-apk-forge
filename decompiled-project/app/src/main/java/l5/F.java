package l5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class F extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f19338b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G f19339c;

    public /* synthetic */ F(G g, B b2, int i7) {
        this.f19337a = i7;
        this.f19339c = g;
        this.f19338b = b2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19337a) {
            case 0:
                G g = this.f19339c;
                g.i(1);
                if (g.f19341B) {
                    this.f19338b.post(g.f19358s);
                    g.f19341B = false;
                    return;
                }
                return;
            case 1:
                G g2 = this.f19339c;
                g2.i(2);
                if (g2.f19341B) {
                    this.f19338b.post(g2.f19358s);
                    g2.f19341B = false;
                    return;
                }
                return;
            default:
                G g10 = this.f19339c;
                g10.i(2);
                if (g10.f19341B) {
                    this.f19338b.post(g10.f19358s);
                    g10.f19341B = false;
                    return;
                }
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f19337a) {
            case 0:
                this.f19339c.i(3);
                return;
            case 1:
                this.f19339c.i(3);
                return;
            default:
                this.f19339c.i(3);
                return;
        }
    }
}
