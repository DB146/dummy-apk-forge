package y1;

import android.view.WindowInsets;
import q1.C1876b;

/* loaded from: classes.dex */
public class c0 extends f0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f26688c;

    public c0() {
        this.f26688c = qc.a.e();
    }

    public c0(p0 p0Var) {
        super(p0Var);
        WindowInsets g = p0Var.g();
        this.f26688c = g != null ? qc.a.f(g) : qc.a.e();
    }

    @Override // y1.f0
    public p0 b() {
        WindowInsets build;
        a();
        build = this.f26688c.build();
        p0 h10 = p0.h(null, build);
        h10.f26731a.r(this.f26696b);
        return h10;
    }

    @Override // y1.f0
    public void d(C1876b c1876b) {
        this.f26688c.setMandatorySystemGestureInsets(c1876b.d());
    }

    @Override // y1.f0
    public void e(C1876b c1876b) {
        this.f26688c.setStableInsets(c1876b.d());
    }

    @Override // y1.f0
    public void f(C1876b c1876b) {
        this.f26688c.setSystemGestureInsets(c1876b.d());
    }

    @Override // y1.f0
    public void g(C1876b c1876b) {
        this.f26688c.setSystemWindowInsets(c1876b.d());
    }

    @Override // y1.f0
    public void h(C1876b c1876b) {
        this.f26688c.setTappableElementInsets(c1876b.d());
    }
}
