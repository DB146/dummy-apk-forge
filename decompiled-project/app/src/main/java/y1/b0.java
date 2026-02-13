package y1;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import q1.C1876b;

/* loaded from: classes.dex */
public final class b0 extends f0 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f26682e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f26683f = false;
    public static Constructor g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f26684h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f26685c;

    /* renamed from: d, reason: collision with root package name */
    public C1876b f26686d;

    public b0() {
        this.f26685c = i();
    }

    public b0(p0 p0Var) {
        super(p0Var);
        this.f26685c = p0Var.g();
    }

    private static WindowInsets i() {
        if (!f26683f) {
            try {
                f26682e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f26683f = true;
        }
        Field field = f26682e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e10);
            }
        }
        if (!f26684h) {
            try {
                g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
            }
            f26684h = true;
        }
        Constructor constructor = g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e12);
            }
        }
        return null;
    }

    @Override // y1.f0
    public p0 b() {
        a();
        p0 h10 = p0.h(null, this.f26685c);
        C1876b[] c1876bArr = this.f26696b;
        m0 m0Var = h10.f26731a;
        m0Var.r(c1876bArr);
        m0Var.u(this.f26686d);
        return h10;
    }

    @Override // y1.f0
    public void e(C1876b c1876b) {
        this.f26686d = c1876b;
    }

    @Override // y1.f0
    public void g(C1876b c1876b) {
        WindowInsets windowInsets = this.f26685c;
        if (windowInsets != null) {
            this.f26685c = windowInsets.replaceSystemWindowInsets(c1876b.f23341a, c1876b.f23342b, c1876b.f23343c, c1876b.f23344d);
        }
    }
}
