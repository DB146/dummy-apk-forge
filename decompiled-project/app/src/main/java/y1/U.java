package y1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
import q1.C1876b;

/* loaded from: classes.dex */
public final class U implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f26658a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f26659b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f26660c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f26661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f26662e;

    public U(a0 a0Var, p0 p0Var, p0 p0Var2, int i7, View view) {
        this.f26658a = a0Var;
        this.f26659b = p0Var;
        this.f26660c = p0Var2;
        this.f26661d = i7;
        this.f26662e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f4;
        a0 a0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        a0 a0Var2 = this.f26658a;
        a0Var2.f26678a.d(animatedFraction);
        float b2 = a0Var2.f26678a.b();
        PathInterpolator pathInterpolator = W.f26665e;
        int i7 = Build.VERSION.SDK_INT;
        p0 p0Var = this.f26659b;
        f0 e0Var = i7 >= 34 ? new e0(p0Var) : i7 >= 30 ? new d0(p0Var) : i7 >= 29 ? new c0(p0Var) : new b0(p0Var);
        int i10 = 1;
        while (i10 <= 512) {
            int i11 = this.f26661d & i10;
            m0 m0Var = p0Var.f26731a;
            if (i11 == 0) {
                e0Var.c(i10, m0Var.g(i10));
                f4 = b2;
                a0Var = a0Var2;
            } else {
                C1876b g = m0Var.g(i10);
                C1876b g2 = this.f26660c.f26731a.g(i10);
                int i12 = (int) (((g.f23341a - g2.f23341a) * r10) + 0.5d);
                int i13 = (int) (((g.f23342b - g2.f23342b) * r10) + 0.5d);
                f4 = b2;
                int i14 = (int) (((g.f23343c - g2.f23343c) * r10) + 0.5d);
                float f10 = (g.f23344d - g2.f23344d) * (1.0f - b2);
                a0Var = a0Var2;
                e0Var.c(i10, p0.e(g, i12, i13, i14, (int) (f10 + 0.5d)));
            }
            i10 <<= 1;
            b2 = f4;
            a0Var2 = a0Var;
        }
        W.g(this.f26662e, e0Var.b(), Collections.singletonList(a0Var2));
    }
}
