package d6;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import u.T;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final T f16535a = new T(0);

    /* renamed from: b, reason: collision with root package name */
    public final T f16536b = new T(0);

    public static b a(Context context, int i7) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i7);
            if (loadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return b(arrayList);
        } catch (Exception e2) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i7), e2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [d6.c, java.lang.Object] */
    public static b b(ArrayList arrayList) {
        b bVar = new b();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            Animator animator = (Animator) arrayList.get(i7);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            bVar.f16536b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC1053a.f16532b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC1053a.f16533c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC1053a.f16534d;
            }
            ?? obj = new Object();
            obj.f16540d = 0;
            obj.f16541e = 1;
            obj.f16537a = startDelay;
            obj.f16538b = duration;
            obj.f16539c = interpolator;
            obj.f16540d = objectAnimator.getRepeatCount();
            obj.f16541e = objectAnimator.getRepeatMode();
            bVar.f16535a.put(propertyName, obj);
        }
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f16535a.equals(((b) obj).f16535a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16535a.hashCode();
    }

    public final String toString() {
        return "\n" + b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f16535a + "}\n";
    }
}
