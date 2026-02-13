package A9;

import A0.C0016f0;
import android.animation.Animator;
import android.util.Log;
import com.kt.apps.core.base.leanback.VerticalGridView;

/* renamed from: A9.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0095i0 implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1225a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1226b;

    public /* synthetic */ C0095i0(Object obj, int i7) {
        this.f1225a = i7;
        this.f1226b = obj;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i7 = this.f1225a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0131r1 c0131r1;
        switch (this.f1225a) {
            case 0:
                ((C0016f0) this.f1226b).f221f = null;
                return;
            default:
                StringBuilder sb2 = new StringBuilder("onAnimationEnd ");
                C0085f2 c0085f2 = (C0085f2) this.f1226b;
                sb2.append(c0085f2.f1168N0);
                Log.v("PlaybackSupportFragment", sb2.toString());
                if (c0085f2.f1168N0 > 0) {
                    if (c0085f2.q0() != null) {
                        c0085f2.q0().setAnimateChildLayout(true);
                        return;
                    }
                    return;
                }
                VerticalGridView q02 = c0085f2.q0();
                if (q02 == null || q02.getSelectedPosition() != 0 || (c0131r1 = (C0131r1) q02.H(0)) == null) {
                    return;
                }
                AbstractC0113m2 abstractC0113m2 = c0131r1.f1354u;
                if (abstractC0113m2 instanceof C9.d) {
                    C0152w2 c0152w2 = (C0152w2) c0131r1.f1355v;
                    ((C9.d) abstractC0113m2).getClass();
                    C0101j2 c0101j2 = (C0101j2) c0152w2;
                    if (c0101j2.f1271a.hasFocus()) {
                        c0101j2.f1256v.requestFocus();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i7 = this.f1225a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f1225a) {
            case 0:
                return;
            default:
                C0085f2 c0085f2 = (C0085f2) this.f1226b;
                if (c0085f2.q0() != null) {
                    c0085f2.q0().setAnimateChildLayout(false);
                    return;
                }
                return;
        }
    }
}
