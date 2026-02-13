package androidx.leanback.transition;

import android.animation.Animator;
import android.transition.ChangeBounds;
import android.transition.TransitionValues;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a extends ChangeBounds {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f13509a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final SparseIntArray f13510b = new SparseIntArray();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f13511c = new HashMap();

    @Override // android.transition.ChangeBounds, android.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        View view;
        int intValue;
        Animator createAnimator = super.createAnimator(viewGroup, transitionValues, transitionValues2);
        if (createAnimator != null && transitionValues2 != null && (view = transitionValues2.view) != null) {
            Integer num = (Integer) this.f13509a.get(view);
            if (num != null) {
                intValue = num.intValue();
            } else {
                int i7 = this.f13510b.get(view.getId(), -1);
                if (i7 != -1) {
                    intValue = i7;
                } else {
                    Integer num2 = (Integer) this.f13511c.get(view.getClass().getName());
                    intValue = num2 != null ? num2.intValue() : 0;
                }
            }
            createAnimator.setStartDelay(intValue);
        }
        return createAnimator;
    }
}
