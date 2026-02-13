package y1;

import android.view.WindowInsets;
import q1.C1876b;

/* loaded from: classes.dex */
public class h0 extends g0 {

    /* renamed from: n, reason: collision with root package name */
    public C1876b f26713n;

    public h0(p0 p0Var, WindowInsets windowInsets) {
        super(p0Var, windowInsets);
        this.f26713n = null;
    }

    public h0(p0 p0Var, h0 h0Var) {
        super(p0Var, h0Var);
        this.f26713n = null;
        this.f26713n = h0Var.f26713n;
    }

    @Override // y1.m0
    public p0 b() {
        return p0.h(null, this.f26701c.consumeStableInsets());
    }

    @Override // y1.m0
    public p0 c() {
        return p0.h(null, this.f26701c.consumeSystemWindowInsets());
    }

    @Override // y1.m0
    public final C1876b j() {
        if (this.f26713n == null) {
            WindowInsets windowInsets = this.f26701c;
            this.f26713n = C1876b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f26713n;
    }

    @Override // y1.m0
    public boolean o() {
        return this.f26701c.isConsumed();
    }

    @Override // y1.m0
    public void u(C1876b c1876b) {
        this.f26713n = c1876b;
    }
}
