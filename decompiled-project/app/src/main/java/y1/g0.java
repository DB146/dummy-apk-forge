package y1;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import q1.C1876b;

/* loaded from: classes.dex */
public class g0 extends m0 {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f26698i = false;
    public static Method j;
    public static Class k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f26699l;

    /* renamed from: m, reason: collision with root package name */
    public static Field f26700m;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f26701c;

    /* renamed from: d, reason: collision with root package name */
    public C1876b[] f26702d;

    /* renamed from: e, reason: collision with root package name */
    public C1876b f26703e;

    /* renamed from: f, reason: collision with root package name */
    public p0 f26704f;
    public C1876b g;

    /* renamed from: h, reason: collision with root package name */
    public int f26705h;

    public g0(p0 p0Var, WindowInsets windowInsets) {
        super(p0Var);
        this.f26703e = null;
        this.f26701c = windowInsets;
    }

    public g0(p0 p0Var, g0 g0Var) {
        this(p0Var, new WindowInsets(g0Var.f26701c));
    }

    private static void B() {
        try {
            j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            k = cls;
            f26699l = cls.getDeclaredField("mVisibleInsets");
            f26700m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f26699l.setAccessible(true);
            f26700m.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        f26698i = true;
    }

    public static boolean C(int i7, int i10) {
        return (i7 & 6) == (i10 & 6);
    }

    private C1876b w(int i7, boolean z8) {
        C1876b c1876b = C1876b.f23340e;
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i7 & i10) != 0) {
                c1876b = C1876b.a(c1876b, x(i10, z8));
            }
        }
        return c1876b;
    }

    private C1876b y() {
        p0 p0Var = this.f26704f;
        return p0Var != null ? p0Var.f26731a.j() : C1876b.f23340e;
    }

    private C1876b z(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f26698i) {
            B();
        }
        Method method = j;
        if (method != null && k != null && f26699l != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f26699l.get(f26700m.get(invoke));
                if (rect != null) {
                    return C1876b.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
        }
        return null;
    }

    public boolean A(int i7) {
        if (i7 != 1 && i7 != 2) {
            if (i7 == 4) {
                return false;
            }
            if (i7 != 8 && i7 != 128) {
                return true;
            }
        }
        return !x(i7, false).equals(C1876b.f23340e);
    }

    @Override // y1.m0
    public void d(View view) {
        C1876b z8 = z(view);
        if (z8 == null) {
            z8 = C1876b.f23340e;
        }
        s(z8);
    }

    @Override // y1.m0
    public void e(p0 p0Var) {
        p0Var.f26731a.t(this.f26704f);
        C1876b c1876b = this.g;
        m0 m0Var = p0Var.f26731a;
        m0Var.s(c1876b);
        m0Var.v(this.f26705h);
    }

    @Override // y1.m0
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Objects.equals(this.g, g0Var.g) && C(this.f26705h, g0Var.f26705h);
    }

    @Override // y1.m0
    public C1876b g(int i7) {
        return w(i7, false);
    }

    @Override // y1.m0
    public C1876b h(int i7) {
        return w(i7, true);
    }

    @Override // y1.m0
    public final C1876b l() {
        if (this.f26703e == null) {
            WindowInsets windowInsets = this.f26701c;
            this.f26703e = C1876b.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f26703e;
    }

    @Override // y1.m0
    public p0 n(int i7, int i10, int i11, int i12) {
        p0 h10 = p0.h(null, this.f26701c);
        int i13 = Build.VERSION.SDK_INT;
        f0 e0Var = i13 >= 34 ? new e0(h10) : i13 >= 30 ? new d0(h10) : i13 >= 29 ? new c0(h10) : new b0(h10);
        e0Var.g(p0.e(l(), i7, i10, i11, i12));
        e0Var.e(p0.e(j(), i7, i10, i11, i12));
        return e0Var.b();
    }

    @Override // y1.m0
    public boolean p() {
        return this.f26701c.isRound();
    }

    @Override // y1.m0
    public boolean q(int i7) {
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i7 & i10) != 0 && !A(i10)) {
                return false;
            }
        }
        return true;
    }

    @Override // y1.m0
    public void r(C1876b[] c1876bArr) {
        this.f26702d = c1876bArr;
    }

    @Override // y1.m0
    public void s(C1876b c1876b) {
        this.g = c1876b;
    }

    @Override // y1.m0
    public void t(p0 p0Var) {
        this.f26704f = p0Var;
    }

    @Override // y1.m0
    public void v(int i7) {
        this.f26705h = i7;
    }

    public C1876b x(int i7, boolean z8) {
        C1876b j10;
        int i10;
        C1876b c1876b = C1876b.f23340e;
        if (i7 == 1) {
            return z8 ? C1876b.b(0, Math.max(y().f23342b, l().f23342b), 0, 0) : (this.f26705h & 4) != 0 ? c1876b : C1876b.b(0, l().f23342b, 0, 0);
        }
        if (i7 == 2) {
            if (z8) {
                C1876b y10 = y();
                C1876b j11 = j();
                return C1876b.b(Math.max(y10.f23341a, j11.f23341a), 0, Math.max(y10.f23343c, j11.f23343c), Math.max(y10.f23344d, j11.f23344d));
            }
            if ((this.f26705h & 2) != 0) {
                return c1876b;
            }
            C1876b l10 = l();
            p0 p0Var = this.f26704f;
            j10 = p0Var != null ? p0Var.f26731a.j() : null;
            int i11 = l10.f23344d;
            if (j10 != null) {
                i11 = Math.min(i11, j10.f23344d);
            }
            return C1876b.b(l10.f23341a, 0, l10.f23343c, i11);
        }
        if (i7 == 8) {
            C1876b[] c1876bArr = this.f26702d;
            j10 = c1876bArr != null ? c1876bArr[c2.i.t(8)] : null;
            if (j10 != null) {
                return j10;
            }
            C1876b l11 = l();
            C1876b y11 = y();
            int i12 = l11.f23344d;
            if (i12 > y11.f23344d) {
                return C1876b.b(0, 0, 0, i12);
            }
            C1876b c1876b2 = this.g;
            return (c1876b2 == null || c1876b2.equals(c1876b) || (i10 = this.g.f23344d) <= y11.f23344d) ? c1876b : C1876b.b(0, 0, 0, i10);
        }
        if (i7 == 16) {
            return k();
        }
        if (i7 == 32) {
            return i();
        }
        if (i7 == 64) {
            return m();
        }
        if (i7 != 128) {
            return c1876b;
        }
        p0 p0Var2 = this.f26704f;
        C2361i f4 = p0Var2 != null ? p0Var2.f26731a.f() : f();
        if (f4 == null) {
            return c1876b;
        }
        int i13 = Build.VERSION.SDK_INT;
        return C1876b.b(i13 >= 28 ? C1.i.j(f4.f26714a) : 0, i13 >= 28 ? C1.i.l(f4.f26714a) : 0, i13 >= 28 ? C1.i.k(f4.f26714a) : 0, i13 >= 28 ? C1.i.i(f4.f26714a) : 0);
    }
}
