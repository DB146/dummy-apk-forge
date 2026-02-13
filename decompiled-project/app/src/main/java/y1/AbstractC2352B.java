package y1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: y1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2352B {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static p0 b(View view, p0 p0Var, Rect rect) {
        WindowInsets g = p0Var.g();
        if (g != null) {
            return p0.h(view, view.computeSystemWindowInsets(g, rect));
        }
        rect.setEmpty();
        return p0Var;
    }

    public static ColorStateList c(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode d(View view) {
        return view.getBackgroundTintMode();
    }

    public static float e(View view) {
        return view.getElevation();
    }

    public static String f(View view) {
        return view.getTransitionName();
    }

    public static float g(View view) {
        return view.getZ();
    }

    public static boolean h(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void i(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void j(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void k(View view, float f4) {
        view.setElevation(f4);
    }

    public static void l(View view, InterfaceC2366n interfaceC2366n) {
        ViewOnApplyWindowInsetsListenerC2351A viewOnApplyWindowInsetsListenerC2351A = interfaceC2366n != null ? new ViewOnApplyWindowInsetsListenerC2351A(view, interfaceC2366n) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, viewOnApplyWindowInsetsListenerC2351A);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (viewOnApplyWindowInsetsListenerC2351A != null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC2351A);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static void m(View view, String str) {
        view.setTransitionName(str);
    }

    public static void n(View view, float f4) {
        view.setZ(f4);
    }

    public static void o(View view) {
        view.stopNestedScroll();
    }
}
