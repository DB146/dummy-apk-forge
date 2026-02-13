package y1;

import android.graphics.Insets;
import android.view.WindowInsets;
import q1.C1876b;

/* loaded from: classes.dex */
public class j0 extends i0 {

    /* renamed from: o, reason: collision with root package name */
    public C1876b f26715o;

    /* renamed from: p, reason: collision with root package name */
    public C1876b f26716p;

    /* renamed from: q, reason: collision with root package name */
    public C1876b f26717q;

    public j0(p0 p0Var, WindowInsets windowInsets) {
        super(p0Var, windowInsets);
        this.f26715o = null;
        this.f26716p = null;
        this.f26717q = null;
    }

    public j0(p0 p0Var, j0 j0Var) {
        super(p0Var, j0Var);
        this.f26715o = null;
        this.f26716p = null;
        this.f26717q = null;
    }

    @Override // y1.m0
    public C1876b i() {
        Insets mandatorySystemGestureInsets;
        if (this.f26716p == null) {
            mandatorySystemGestureInsets = this.f26701c.getMandatorySystemGestureInsets();
            this.f26716p = C1876b.c(mandatorySystemGestureInsets);
        }
        return this.f26716p;
    }

    @Override // y1.m0
    public C1876b k() {
        Insets systemGestureInsets;
        if (this.f26715o == null) {
            systemGestureInsets = this.f26701c.getSystemGestureInsets();
            this.f26715o = C1876b.c(systemGestureInsets);
        }
        return this.f26715o;
    }

    @Override // y1.m0
    public C1876b m() {
        Insets tappableElementInsets;
        if (this.f26717q == null) {
            tappableElementInsets = this.f26701c.getTappableElementInsets();
            this.f26717q = C1876b.c(tappableElementInsets);
        }
        return this.f26717q;
    }

    @Override // y1.g0, y1.m0
    public p0 n(int i7, int i10, int i11, int i12) {
        WindowInsets inset;
        inset = this.f26701c.inset(i7, i10, i11, i12);
        return p0.h(null, inset);
    }

    @Override // y1.h0, y1.m0
    public void u(C1876b c1876b) {
    }
}
