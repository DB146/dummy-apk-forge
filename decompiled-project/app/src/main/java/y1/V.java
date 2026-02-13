package y1;

import a3.C0737n;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.datastore.preferences.protobuf.AbstractC0807j;
import ea.C1108c;
import java.util.Objects;
import java.util.WeakHashMap;
import q1.C1876b;

/* loaded from: classes.dex */
public final class V implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0807j f26663a;

    /* renamed from: b, reason: collision with root package name */
    public p0 f26664b;

    public V(View view, AbstractC0807j abstractC0807j) {
        p0 p0Var;
        this.f26663a = abstractC0807j;
        WeakHashMap weakHashMap = K.f26642a;
        p0 a9 = C.a(view);
        if (a9 != null) {
            int i7 = Build.VERSION.SDK_INT;
            p0Var = (i7 >= 34 ? new e0(a9) : i7 >= 30 ? new d0(a9) : i7 >= 29 ? new c0(a9) : new b0(a9)).b();
        } else {
            p0Var = null;
        }
        this.f26664b = p0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        m0 m0Var;
        if (!view.isLaidOut()) {
            this.f26664b = p0.h(view, windowInsets);
            return W.i(view, windowInsets);
        }
        p0 h10 = p0.h(view, windowInsets);
        if (this.f26664b == null) {
            WeakHashMap weakHashMap = K.f26642a;
            this.f26664b = C.a(view);
        }
        if (this.f26664b == null) {
            this.f26664b = h10;
            return W.i(view, windowInsets);
        }
        AbstractC0807j j = W.j(view);
        if (j != null && Objects.equals((p0) j.f13418b, h10)) {
            return W.i(view, windowInsets);
        }
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        p0 p0Var = this.f26664b;
        int i7 = 1;
        while (true) {
            m0Var = h10.f26731a;
            if (i7 > 512) {
                break;
            }
            C1876b g = m0Var.g(i7);
            C1876b g2 = p0Var.f26731a.g(i7);
            int i10 = g.f23341a;
            int i11 = g2.f23341a;
            int i12 = g.f23344d;
            int i13 = g.f23343c;
            int i14 = g.f23342b;
            int i15 = g2.f23344d;
            int i16 = g2.f23343c;
            int i17 = g2.f23342b;
            boolean z8 = i10 > i11 || i14 > i17 || i13 > i16 || i12 > i15;
            if (z8 != (i10 < i11 || i14 < i17 || i13 < i16 || i12 < i15)) {
                if (z8) {
                    iArr[0] = iArr[0] | i7;
                } else {
                    iArr2[0] = iArr2[0] | i7;
                }
            }
            i7 <<= 1;
        }
        int i18 = iArr[0];
        int i19 = iArr2[0];
        int i20 = i18 | i19;
        if (i20 == 0) {
            this.f26664b = h10;
            return W.i(view, windowInsets);
        }
        p0 p0Var2 = this.f26664b;
        a0 a0Var = new a0(i20, (i18 & 8) != 0 ? W.f26665e : (i19 & 8) != 0 ? W.f26666f : (i18 & 519) != 0 ? W.g : (i19 & 519) != 0 ? W.f26667h : null, (i20 & 8) != 0 ? 160L : 250L);
        a0Var.f26678a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(a0Var.f26678a.a());
        C1876b g10 = m0Var.g(i20);
        C1876b g11 = p0Var2.f26731a.g(i20);
        int min = Math.min(g10.f23341a, g11.f23341a);
        int i21 = g10.f23342b;
        int i22 = g11.f23342b;
        int min2 = Math.min(i21, i22);
        int i23 = g10.f23343c;
        int i24 = g11.f23343c;
        int min3 = Math.min(i23, i24);
        int i25 = g10.f23344d;
        int i26 = g11.f23344d;
        C1108c c1108c = new C1108c(19, C1876b.b(min, min2, min3, Math.min(i25, i26)), C1876b.b(Math.max(g10.f23341a, g11.f23341a), Math.max(i21, i22), Math.max(i23, i24), Math.max(i25, i26)));
        W.f(view, a0Var, h10, false);
        duration.addUpdateListener(new U(a0Var, h10, p0Var2, i20, view));
        duration.addListener(new C0737n(a0Var, view, 2));
        ViewTreeObserverOnPreDrawListenerC2368p.a(view, new L7.i(view, a0Var, c1108c, duration, 11, false));
        this.f26664b = h10;
        return W.i(view, windowInsets);
    }
}
