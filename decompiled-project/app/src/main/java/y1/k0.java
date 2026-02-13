package y1;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import q1.C1876b;

/* loaded from: classes.dex */
public class k0 extends j0 {

    /* renamed from: r, reason: collision with root package name */
    public static final p0 f26723r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f26723r = p0.h(null, windowInsets);
    }

    public k0(p0 p0Var, WindowInsets windowInsets) {
        super(p0Var, windowInsets);
    }

    public k0(p0 p0Var, k0 k0Var) {
        super(p0Var, k0Var);
    }

    @Override // y1.g0, y1.m0
    public final void d(View view) {
    }

    @Override // y1.g0, y1.m0
    public C1876b g(int i7) {
        Insets insets;
        insets = this.f26701c.getInsets(n0.a(i7));
        return C1876b.c(insets);
    }

    @Override // y1.g0, y1.m0
    public C1876b h(int i7) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.f26701c.getInsetsIgnoringVisibility(n0.a(i7));
        return C1876b.c(insetsIgnoringVisibility);
    }

    @Override // y1.g0, y1.m0
    public boolean q(int i7) {
        boolean isVisible;
        isVisible = this.f26701c.isVisible(n0.a(i7));
        return isVisible;
    }
}
