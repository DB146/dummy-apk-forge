package A9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import c3.C0888e;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.tv.ads.controls.ErrorMessageFragment;
import com.google.android.tv.ads.controls.WhyThisAdFragment;
import com.kt.apps.media.xemtv.beta.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import l6.C1506a;
import l6.C1508c;

/* renamed from: A9.d1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0076d1 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1107a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1108b;

    public /* synthetic */ C0076d1(Object obj, int i7) {
        this.f1107a = i7;
        this.f1108b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f1107a) {
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1108b;
                actionBarOverlayLayout.f12956K = null;
                actionBarOverlayLayout.f12970x = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        switch (this.f1107a) {
            case 0:
                ((C0080e1) this.f1108b).f1117E = null;
                return;
            case 1:
                C6.i iVar = (C6.i) this.f1108b;
                iVar.q();
                iVar.f2943r.start();
                return;
            case 2:
                ((ErrorMessageFragment) this.f1108b).g0().finish();
                return;
            case 3:
                ((WhyThisAdFragment) this.f1108b).g0().finish();
                return;
            case 4:
                ((a3.u) this.f1108b).n();
                animation.removeListener(this);
                return;
            case 5:
                C0888e c0888e = (C0888e) this.f1108b;
                ArrayList arrayList = new ArrayList(c0888e.f14277e);
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ColorStateList colorStateList = ((C1506a) arrayList.get(i7)).f19560b.f19568C;
                    if (colorStateList != null) {
                        c0888e.setTintList(colorStateList);
                    }
                }
                return;
            case 6:
                ((HideBottomViewOnScrollBehavior) this.f1108b).f15174h = null;
                return;
            case 7:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1108b;
                bottomSheetBehavior.J(5);
                WeakReference weakReference = bottomSheetBehavior.f15200U;
                if (weakReference == null || weakReference.get() == null) {
                    return;
                }
                ((View) bottomSheetBehavior.f15200U.get()).requestLayout();
                return;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1108b;
                actionBarOverlayLayout.f12956K = null;
                actionBarOverlayLayout.f12970x = false;
                return;
            case 9:
                t6.f fVar = (t6.f) this.f1108b;
                fVar.f24493b.setTranslationY(0.0f);
                fVar.b(0.0f);
                return;
            case 10:
                kotlin.jvm.internal.l.e(animation, "animation");
                super.onAnimationEnd(animation);
                ViewGroup viewGroup = (ViewGroup) this.f1108b;
                LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.no_network_view);
                if (linearLayout != null) {
                    viewGroup.removeView(linearLayout);
                    return;
                }
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1108b;
                sideSheetBehavior.w(5);
                WeakReference weakReference2 = sideSheetBehavior.f15430p;
                if (weakReference2 == null || weakReference2.get() == null) {
                    return;
                }
                ((View) sideSheetBehavior.f15430p.get()).requestLayout();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1107a) {
            case 5:
                C0888e c0888e = (C0888e) this.f1108b;
                ArrayList arrayList = new ArrayList(c0888e.f14277e);
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    C1508c c1508c = ((C1506a) arrayList.get(i7)).f19560b;
                    ColorStateList colorStateList = c1508c.f19568C;
                    if (colorStateList != null) {
                        c0888e.setTint(colorStateList.getColorForState(c1508c.f19572G, colorStateList.getDefaultColor()));
                    }
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
