package A9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.TextView;
import com.kt.apps.core.base.leanback.NavDrawerView;
import com.kt.apps.media.xemtv.beta.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class G1 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavDrawerView f833b;

    public /* synthetic */ G1(NavDrawerView navDrawerView, int i7) {
        this.f832a = i7;
        this.f833b = navDrawerView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animation) {
        switch (this.f832a) {
            case 0:
                kotlin.jvm.internal.l.e(animation, "animation");
                super.onAnimationCancel(animation);
                onAnimationEnd(animation);
                return;
            default:
                super.onAnimationCancel(animation);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        switch (this.f832a) {
            case 0:
                kotlin.jvm.internal.l.e(animation, "animation");
                super.onAnimationEnd(animation);
                NavDrawerView navDrawerView = this.f833b;
                int childCount = navDrawerView.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = navDrawerView.getChildAt(i7);
                    childAt.setSelected(false);
                    childAt.setPressed(kotlin.jvm.internal.l.a(childAt.getTag(), Integer.valueOf(navDrawerView.f15959a)));
                    TextView textView = (TextView) childAt.findViewById(R.id.row_header);
                    if (textView != null) {
                        textView.setVisibility(4);
                    }
                }
                navDrawerView.f15968x = false;
                atomicBoolean = navDrawerView.get_isAnimating();
                atomicBoolean.set(false);
                return;
            default:
                kotlin.jvm.internal.l.e(animation, "animation");
                super.onAnimationEnd(animation);
                NavDrawerView navDrawerView2 = this.f833b;
                int childCount2 = navDrawerView2.getChildCount();
                View view = null;
                for (int i10 = 0; i10 < childCount2; i10++) {
                    View childAt2 = navDrawerView2.getChildAt(i10);
                    childAt2.setPressed(false);
                    childAt2.setSelected(kotlin.jvm.internal.l.a(childAt2.getTag(), Integer.valueOf(navDrawerView2.f15959a)));
                    if (childAt2.isSelected()) {
                        view = childAt2;
                    }
                }
                navDrawerView2.f15968x = true;
                atomicBoolean2 = navDrawerView2.get_isAnimating();
                atomicBoolean2.set(false);
                if (navDrawerView2.getFocusedChild() != null || view == null) {
                    return;
                }
                view.requestFocus();
                return;
        }
    }
}
