package i;

import A8.g0;
import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import c.C0879w;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class q {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, v vVar) {
        Objects.requireNonNull(vVar);
        C0879w c0879w = new C0879w(vVar, 1);
        g0.q(obj).registerOnBackInvokedCallback(1000000, c0879w);
        return c0879w;
    }

    public static void c(Object obj, Object obj2) {
        g0.q(obj).unregisterOnBackInvokedCallback(g0.m(obj2));
    }
}
