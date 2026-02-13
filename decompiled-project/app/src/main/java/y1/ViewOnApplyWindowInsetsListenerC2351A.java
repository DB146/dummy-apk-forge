package y1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* renamed from: y1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC2351A implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public p0 f26635a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f26636b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2366n f26637c;

    public ViewOnApplyWindowInsetsListenerC2351A(View view, InterfaceC2366n interfaceC2366n) {
        this.f26636b = view;
        this.f26637c = interfaceC2366n;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        p0 h10 = p0.h(view, windowInsets);
        int i7 = Build.VERSION.SDK_INT;
        InterfaceC2366n interfaceC2366n = this.f26637c;
        if (i7 < 30) {
            AbstractC2352B.a(windowInsets, this.f26636b);
            if (h10.equals(this.f26635a)) {
                return interfaceC2366n.l(view, h10).g();
            }
        }
        this.f26635a = h10;
        p0 l10 = interfaceC2366n.l(view, h10);
        if (i7 >= 30) {
            return l10.g();
        }
        WeakHashMap weakHashMap = K.f26642a;
        AbstractC2377z.c(view);
        return l10.g();
    }
}
