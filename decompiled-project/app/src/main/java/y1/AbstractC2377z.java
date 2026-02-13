package y1;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: y1.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2377z {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        int i7 = M.f26649a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static WindowInsets b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    public static void c(View view) {
        view.requestApplyInsets();
    }
}
