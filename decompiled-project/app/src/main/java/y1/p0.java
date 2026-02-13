package y1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;
import q1.C1876b;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: b, reason: collision with root package name */
    public static final p0 f26730b;

    /* renamed from: a, reason: collision with root package name */
    public final m0 f26731a;

    static {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            f26730b = l0.f26724s;
        } else if (i7 >= 30) {
            f26730b = k0.f26723r;
        } else {
            f26730b = m0.f26725b;
        }
    }

    public p0(WindowInsets windowInsets) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            this.f26731a = new l0(this, windowInsets);
            return;
        }
        if (i7 >= 30) {
            this.f26731a = new k0(this, windowInsets);
            return;
        }
        if (i7 >= 29) {
            this.f26731a = new j0(this, windowInsets);
        } else if (i7 >= 28) {
            this.f26731a = new i0(this, windowInsets);
        } else {
            this.f26731a = new h0(this, windowInsets);
        }
    }

    public p0(p0 p0Var) {
        if (p0Var == null) {
            this.f26731a = new m0(this);
            return;
        }
        m0 m0Var = p0Var.f26731a;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34 && (m0Var instanceof l0)) {
            this.f26731a = new l0(this, (l0) m0Var);
        } else if (i7 >= 30 && (m0Var instanceof k0)) {
            this.f26731a = new k0(this, (k0) m0Var);
        } else if (i7 >= 29 && (m0Var instanceof j0)) {
            this.f26731a = new j0(this, (j0) m0Var);
        } else if (i7 >= 28 && (m0Var instanceof i0)) {
            this.f26731a = new i0(this, (i0) m0Var);
        } else if (m0Var instanceof h0) {
            this.f26731a = new h0(this, (h0) m0Var);
        } else if (m0Var instanceof g0) {
            this.f26731a = new g0(this, (g0) m0Var);
        } else {
            this.f26731a = new m0(this);
        }
        m0Var.e(this);
    }

    public static C1876b e(C1876b c1876b, int i7, int i10, int i11, int i12) {
        int max = Math.max(0, c1876b.f23341a - i7);
        int max2 = Math.max(0, c1876b.f23342b - i10);
        int max3 = Math.max(0, c1876b.f23343c - i11);
        int max4 = Math.max(0, c1876b.f23344d - i12);
        return (max == i7 && max2 == i10 && max3 == i11 && max4 == i12) ? c1876b : C1876b.b(max, max2, max3, max4);
    }

    public static p0 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        p0 p0Var = new p0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = K.f26642a;
            p0 a9 = C.a(view);
            m0 m0Var = p0Var.f26731a;
            m0Var.t(a9);
            m0Var.d(view.getRootView());
            m0Var.v(view.getWindowSystemUiVisibility());
        }
        return p0Var;
    }

    public final int a() {
        return this.f26731a.l().f23344d;
    }

    public final int b() {
        return this.f26731a.l().f23341a;
    }

    public final int c() {
        return this.f26731a.l().f23343c;
    }

    public final int d() {
        return this.f26731a.l().f23342b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        return Objects.equals(this.f26731a, ((p0) obj).f26731a);
    }

    public final p0 f(int i7, int i10, int i11, int i12) {
        int i13 = Build.VERSION.SDK_INT;
        f0 e0Var = i13 >= 34 ? new e0(this) : i13 >= 30 ? new d0(this) : i13 >= 29 ? new c0(this) : new b0(this);
        e0Var.g(C1876b.b(i7, i10, i11, i12));
        return e0Var.b();
    }

    public final WindowInsets g() {
        m0 m0Var = this.f26731a;
        if (m0Var instanceof g0) {
            return ((g0) m0Var).f26701c;
        }
        return null;
    }

    public final int hashCode() {
        m0 m0Var = this.f26731a;
        if (m0Var == null) {
            return 0;
        }
        return m0Var.hashCode();
    }
}
