package y1;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class C {
    public static p0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        p0 h10 = p0.h(null, rootWindowInsets);
        m0 m0Var = h10.f26731a;
        m0Var.t(h10);
        m0Var.d(view.getRootView());
        return h10;
    }

    public static void b(View view, int i7, int i10) {
        view.setScrollIndicators(i7, i10);
    }
}
