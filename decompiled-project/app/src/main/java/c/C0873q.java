package c;

import android.os.Build;
import android.view.View;
import android.view.Window;
import y1.q0;
import y1.t0;

/* renamed from: c.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0873q extends C0872p {
    @Override // c.C0871o, a.AbstractC0672a
    public void q(C0856D statusBarStyle, C0856D navigationBarStyle, Window window, View view, boolean z8, boolean z10) {
        kotlin.jvm.internal.l.e(statusBarStyle, "statusBarStyle");
        kotlin.jvm.internal.l.e(navigationBarStyle, "navigationBarStyle");
        kotlin.jvm.internal.l.e(window, "window");
        kotlin.jvm.internal.l.e(view, "view");
        c2.q.z(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        Y5.B b2 = new Y5.B(view);
        int i7 = Build.VERSION.SDK_INT;
        q3.f t0Var = i7 >= 35 ? new t0(window, b2) : i7 >= 30 ? new t0(window, b2) : i7 >= 26 ? new q0(window, b2) : new q0(window, b2);
        t0Var.B(!z8);
        t0Var.A(!z10);
    }
}
