package i6;

import Y5.B;
import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import h3.H;
import java.util.WeakHashMap;
import y1.AbstractC2352B;
import y1.K;
import y1.p0;
import y1.q0;
import y1.t0;
import y6.C2401g;

/* loaded from: classes.dex */
public final class g extends d {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f18444a;

    /* renamed from: b, reason: collision with root package name */
    public final p0 f18445b;

    /* renamed from: c, reason: collision with root package name */
    public Window f18446c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18447d;

    public g(View view, p0 p0Var) {
        ColorStateList c10;
        this.f18445b = p0Var;
        C2401g c2401g = BottomSheetBehavior.A(view).f15218i;
        if (c2401g != null) {
            c10 = c2401g.f27035a.f27013c;
        } else {
            WeakHashMap weakHashMap = K.f26642a;
            c10 = AbstractC2352B.c(view);
        }
        if (c10 != null) {
            this.f18444a = Boolean.valueOf(q3.f.s(c10.getDefaultColor()));
            return;
        }
        ColorStateList u3 = H.u(view.getBackground());
        Integer valueOf = u3 != null ? Integer.valueOf(u3.getDefaultColor()) : null;
        if (valueOf != null) {
            this.f18444a = Boolean.valueOf(q3.f.s(valueOf.intValue()));
        } else {
            this.f18444a = null;
        }
    }

    @Override // i6.d
    public final void a(View view) {
        d(view);
    }

    @Override // i6.d
    public final void b(View view) {
        d(view);
    }

    @Override // i6.d
    public final void c(View view, int i7) {
        d(view);
    }

    public final void d(View view) {
        int top = view.getTop();
        p0 p0Var = this.f18445b;
        if (top < p0Var.d()) {
            Window window = this.f18446c;
            if (window != null) {
                Boolean bool = this.f18444a;
                boolean booleanValue = bool == null ? this.f18447d : bool.booleanValue();
                B b2 = new B(window.getDecorView());
                int i7 = Build.VERSION.SDK_INT;
                (i7 >= 35 ? new t0(window, b2) : i7 >= 30 ? new t0(window, b2) : i7 >= 26 ? new q0(window, b2) : new q0(window, b2)).B(booleanValue);
            }
            view.setPadding(view.getPaddingLeft(), p0Var.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.f18446c;
            if (window2 != null) {
                boolean z8 = this.f18447d;
                B b10 = new B(window2.getDecorView());
                int i10 = Build.VERSION.SDK_INT;
                (i10 >= 35 ? new t0(window2, b10) : i10 >= 30 ? new t0(window2, b10) : i10 >= 26 ? new q0(window2, b10) : new q0(window2, b10)).B(z8);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void e(Window window) {
        if (this.f18446c == window) {
            return;
        }
        this.f18446c = window;
        if (window != null) {
            B b2 = new B(window.getDecorView());
            int i7 = Build.VERSION.SDK_INT;
            this.f18447d = (i7 >= 35 ? new t0(window, b2) : i7 >= 30 ? new t0(window, b2) : i7 >= 26 ? new q0(window, b2) : new q0(window, b2)).r();
        }
    }
}
