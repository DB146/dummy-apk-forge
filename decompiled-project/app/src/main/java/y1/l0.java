package y1;

import android.graphics.Insets;
import android.view.WindowInsets;
import q1.C1876b;

/* loaded from: classes.dex */
public final class l0 extends k0 {

    /* renamed from: s, reason: collision with root package name */
    public static final p0 f26724s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f26724s = p0.h(null, windowInsets);
    }

    public l0(p0 p0Var, WindowInsets windowInsets) {
        super(p0Var, windowInsets);
    }

    public l0(p0 p0Var, l0 l0Var) {
        super(p0Var, l0Var);
    }

    @Override // y1.k0, y1.g0, y1.m0
    public C1876b g(int i7) {
        Insets insets;
        insets = this.f26701c.getInsets(o0.a(i7));
        return C1876b.c(insets);
    }

    @Override // y1.k0, y1.g0, y1.m0
    public C1876b h(int i7) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.f26701c.getInsetsIgnoringVisibility(o0.a(i7));
        return C1876b.c(insetsIgnoringVisibility);
    }

    @Override // y1.k0, y1.g0, y1.m0
    public boolean q(int i7) {
        boolean isVisible;
        isVisible = this.f26701c.isVisible(o0.a(i7));
        return isVisible;
    }
}
