package androidx.leanback.transition;

import a2.AbstractC0708a;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes.dex */
class SlideKitkat extends Visibility {

    /* renamed from: b, reason: collision with root package name */
    public static final DecelerateInterpolator f13500b = new DecelerateInterpolator();

    /* renamed from: c, reason: collision with root package name */
    public static final AccelerateInterpolator f13501c = new AccelerateInterpolator();

    /* renamed from: d, reason: collision with root package name */
    public static final d f13502d = new d(0);

    /* renamed from: e, reason: collision with root package name */
    public static final e f13503e = new e(0);

    /* renamed from: f, reason: collision with root package name */
    public static final d f13504f = new d(1);

    /* renamed from: u, reason: collision with root package name */
    public static final e f13505u = new e(1);

    /* renamed from: v, reason: collision with root package name */
    public static final d f13506v = new d(2);

    /* renamed from: w, reason: collision with root package name */
    public static final d f13507w = new d(3);

    /* renamed from: a, reason: collision with root package name */
    public final f f13508a;

    public SlideKitkat(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0708a.f12491l);
        int i7 = obtainStyledAttributes.getInt(3, 80);
        if (i7 == 3) {
            this.f13508a = f13502d;
        } else if (i7 == 5) {
            this.f13508a = f13504f;
        } else if (i7 == 48) {
            this.f13508a = f13503e;
        } else if (i7 == 80) {
            this.f13508a = f13505u;
        } else if (i7 == 8388611) {
            this.f13508a = f13506v;
        } else {
            if (i7 != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.f13508a = f13507w;
        }
        long j = obtainStyledAttributes.getInt(1, -1);
        if (j >= 0) {
            setDuration(j);
        }
        long j10 = obtainStyledAttributes.getInt(2, -1);
        if (j10 > 0) {
            setStartDelay(j10);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        obtainStyledAttributes.recycle();
    }

    public static ObjectAnimator a(View view, Property property, float f4, float f10, float f11, BaseInterpolator baseInterpolator, int i7) {
        float[] fArr = (float[]) view.getTag(R.id.lb_slide_transition_value);
        if (fArr != null) {
            f4 = View.TRANSLATION_Y == property ? fArr[1] : fArr[0];
            view.setTag(R.id.lb_slide_transition_value, null);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f4, f10);
        g gVar = new g(view, property, f11, f10, i7);
        ofFloat.addListener(gVar);
        ofFloat.addPauseListener(gVar);
        ofFloat.setInterpolator(baseInterpolator);
        return ofFloat;
    }

    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, TransitionValues transitionValues, int i7, TransitionValues transitionValues2, int i10) {
        View view = transitionValues2 != null ? transitionValues2.view : null;
        if (view == null) {
            return null;
        }
        float b2 = this.f13508a.b(view);
        return a(view, this.f13508a.c(), this.f13508a.a(view), b2, b2, f13500b, 0);
    }

    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, TransitionValues transitionValues, int i7, TransitionValues transitionValues2, int i10) {
        View view = transitionValues != null ? transitionValues.view : null;
        if (view == null) {
            return null;
        }
        float b2 = this.f13508a.b(view);
        return a(view, this.f13508a.c(), b2, this.f13508a.a(view), b2, f13501c, 4);
    }
}
