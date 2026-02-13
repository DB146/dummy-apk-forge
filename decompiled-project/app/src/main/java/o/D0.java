package o;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import ia.C1358d;
import java.lang.reflect.Method;
import n.C1680n;
import n.MenuC1678l;

/* loaded from: classes.dex */
public final class D0 extends C1770y0 implements InterfaceC1772z0 {

    /* renamed from: R, reason: collision with root package name */
    public static final Method f21366R;

    /* renamed from: Q, reason: collision with root package name */
    public C1358d f21367Q;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f21366R = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // o.InterfaceC1772z0
    public final void f(MenuC1678l menuC1678l, C1680n c1680n) {
        C1358d c1358d = this.f21367Q;
        if (c1358d != null) {
            c1358d.f(menuC1678l, c1680n);
        }
    }

    @Override // o.InterfaceC1772z0
    public final void n(MenuC1678l menuC1678l, C1680n c1680n) {
        C1358d c1358d = this.f21367Q;
        if (c1358d != null) {
            c1358d.n(menuC1678l, c1680n);
        }
    }

    @Override // o.C1770y0
    public final C1747m0 q(Context context, boolean z8) {
        C0 c02 = new C0(context, z8);
        c02.setHoverListener(this);
        return c02;
    }
}
