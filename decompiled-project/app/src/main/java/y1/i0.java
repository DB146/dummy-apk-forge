package y1;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class i0 extends h0 {
    public i0(p0 p0Var, WindowInsets windowInsets) {
        super(p0Var, windowInsets);
    }

    public i0(p0 p0Var, i0 i0Var) {
        super(p0Var, i0Var);
    }

    @Override // y1.m0
    public p0 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f26701c.consumeDisplayCutout();
        return p0.h(null, consumeDisplayCutout);
    }

    @Override // y1.g0, y1.m0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Objects.equals(this.f26701c, i0Var.f26701c) && Objects.equals(this.g, i0Var.g) && g0.C(this.f26705h, i0Var.f26705h);
    }

    @Override // y1.m0
    public C2361i f() {
        DisplayCutout displayCutout;
        displayCutout = this.f26701c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C2361i(displayCutout);
    }

    @Override // y1.m0
    public int hashCode() {
        return this.f26701c.hashCode();
    }
}
