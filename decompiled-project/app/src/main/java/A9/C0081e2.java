package A9;

import android.animation.ValueAnimator;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: A9.e2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0081e2 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1124a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0085f2 f1125b;

    public /* synthetic */ C0081e2(C0085f2 c0085f2, int i7) {
        this.f1124a = i7;
        this.f1125b = c0085f2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        H2.i0 H10;
        View view;
        switch (this.f1124a) {
            case 0:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                C0085f2 c0085f2 = this.f1125b;
                c0085f2.f1168N0 = intValue;
                View view2 = c0085f2.f1156A0;
                if (view2 != null) {
                    view2.getBackground().setAlpha(intValue);
                    return;
                }
                return;
            case 1:
                C0085f2 c0085f22 = this.f1125b;
                if (c0085f22.q0() == null || (H10 = c0085f22.q0().H(0)) == null || (view = H10.f4707a) == null) {
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Log.v("PlaybackSupportFragment", "fraction " + floatValue);
                view.setAlpha(floatValue);
                view.setTranslationY((1.0f - floatValue) * ((float) c0085f22.f1163I0));
                return;
            default:
                C0085f2 c0085f23 = this.f1125b;
                if (c0085f23.q0() == null) {
                    return;
                }
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = c0085f23.q0().getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = c0085f23.q0().getChildAt(i7);
                    c0085f23.q0().getClass();
                    H2.i0 M3 = RecyclerView.M(childAt);
                    if ((M3 != null ? M3.c() : -1) > 0) {
                        childAt.setAlpha(floatValue2);
                        childAt.setTranslationY((1.0f - floatValue2) * c0085f23.f1163I0);
                    }
                }
                return;
        }
    }
}
