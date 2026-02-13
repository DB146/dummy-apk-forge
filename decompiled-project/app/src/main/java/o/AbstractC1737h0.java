package o;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import r1.AbstractC1915b;
import r1.InterfaceC1914a;

/* renamed from: o.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1737h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f21500a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f21501b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f21502c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 29 || i7 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f21500a);
        } else {
            drawable.setState(f21501b);
        }
        drawable.setState(state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Rect b(Drawable drawable) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 29) {
            Insets a9 = AbstractC1735g0.a(drawable);
            i7 = a9.left;
            i10 = a9.top;
            i11 = a9.right;
            i12 = a9.bottom;
            return new Rect(i7, i10, i11, i12);
        }
        boolean z8 = drawable instanceof InterfaceC1914a;
        Object obj = drawable;
        if (z8) {
            ((AbstractC1915b) ((InterfaceC1914a) drawable)).getClass();
            obj = null;
        }
        if (i13 >= 29) {
            boolean z10 = AbstractC1733f0.f21491a;
        } else if (AbstractC1733f0.f21491a) {
            try {
                Object invoke = AbstractC1733f0.f21492b.invoke(obj, null);
                if (invoke != null) {
                    return new Rect(AbstractC1733f0.f21493c.getInt(invoke), AbstractC1733f0.f21494d.getInt(invoke), AbstractC1733f0.f21495e.getInt(invoke), AbstractC1733f0.f21496f.getInt(invoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f21502c;
    }

    public static PorterDuff.Mode c(int i7, PorterDuff.Mode mode) {
        if (i7 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i7 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i7 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i7) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
