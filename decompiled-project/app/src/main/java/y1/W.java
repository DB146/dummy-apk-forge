package y1;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import androidx.datastore.preferences.protobuf.AbstractC0807j;
import com.kt.apps.media.xemtv.beta.R;
import ea.C1108c;
import java.util.List;

/* loaded from: classes.dex */
public final class W extends Z {

    /* renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f26665e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final Z1.a f26666f = new Z1.a(0);
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);

    /* renamed from: h, reason: collision with root package name */
    public static final AccelerateInterpolator f26667h = new AccelerateInterpolator(1.5f);

    public static void e(View view, a0 a0Var) {
        AbstractC0807j j = j(view);
        if (j != null) {
            j.d(a0Var);
            if (j.f13417a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                e(viewGroup.getChildAt(i7), a0Var);
            }
        }
    }

    public static void f(View view, a0 a0Var, p0 p0Var, boolean z8) {
        AbstractC0807j j = j(view);
        if (j != null) {
            j.f13418b = p0Var;
            if (!z8) {
                j.e();
                z8 = j.f13417a == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                f(viewGroup.getChildAt(i7), a0Var, p0Var, z8);
            }
        }
    }

    public static void g(View view, p0 p0Var, List list) {
        AbstractC0807j j = j(view);
        if (j != null) {
            p0Var = j.f(p0Var, list);
            if (j.f13417a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                g(viewGroup.getChildAt(i7), p0Var, list);
            }
        }
    }

    public static void h(View view, a0 a0Var, C1108c c1108c) {
        AbstractC0807j j = j(view);
        if (j != null) {
            j.g(c1108c);
            if (j.f13417a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                h(viewGroup.getChildAt(i7), a0Var, c1108c);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static AbstractC0807j j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof V) {
            return ((V) tag).f26663a;
        }
        return null;
    }
}
