package M;

import A9.S2;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import j0.AbstractC1362A;

/* loaded from: classes.dex */
public final class j extends View {

    /* renamed from: f */
    public static final int[] f6499f = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: u */
    public static final int[] f6500u = new int[0];

    /* renamed from: a */
    public r f6501a;

    /* renamed from: b */
    public Boolean f6502b;

    /* renamed from: c */
    public Long f6503c;

    /* renamed from: d */
    public S2 f6504d;

    /* renamed from: e */
    public kotlin.jvm.internal.m f6505e;

    private final void setRippleState(boolean z8) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f6504d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.f6503c;
        long longValue = currentAnimationTimeMillis - (l10 != null ? l10.longValue() : 0L);
        if (z8 || longValue >= 5) {
            int[] iArr = z8 ? f6499f : f6500u;
            r rVar = this.f6501a;
            if (rVar != null) {
                rVar.setState(iArr);
            }
        } else {
            S2 s22 = new S2(this, 11);
            this.f6504d = s22;
            postDelayed(s22, 50L);
        }
        this.f6503c = Long.valueOf(currentAnimationTimeMillis);
    }

    public static final void setRippleState$lambda$2(j jVar) {
        r rVar = jVar.f6501a;
        if (rVar != null) {
            rVar.setState(f6500u);
        }
        jVar.f6504d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(A.k kVar, boolean z8, long j, int i7, long j10, float f4, Rb.a aVar) {
        if (this.f6501a == null || !Boolean.valueOf(z8).equals(this.f6502b)) {
            r rVar = new r(z8);
            setBackground(rVar);
            this.f6501a = rVar;
            this.f6502b = Boolean.valueOf(z8);
        }
        r rVar2 = this.f6501a;
        kotlin.jvm.internal.l.b(rVar2);
        this.f6505e = (kotlin.jvm.internal.m) aVar;
        e(j, i7, j10, f4);
        if (z8) {
            rVar2.setHotspot(Float.intBitsToFloat((int) (kVar.f6a >> 32)), Float.intBitsToFloat((int) (4294967295L & kVar.f6a)));
        } else {
            rVar2.setHotspot(rVar2.getBounds().centerX(), rVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.f6505e = null;
        S2 s22 = this.f6504d;
        if (s22 != null) {
            removeCallbacks(s22);
            S2 s23 = this.f6504d;
            kotlin.jvm.internal.l.b(s23);
            s23.run();
        } else {
            r rVar = this.f6501a;
            if (rVar != null) {
                rVar.setState(f6500u);
            }
        }
        r rVar2 = this.f6501a;
        if (rVar2 == null) {
            return;
        }
        rVar2.setVisible(false, false);
        unscheduleDrawable(rVar2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(long j, int i7, long j10, float f4) {
        r rVar = this.f6501a;
        if (rVar == null) {
            return;
        }
        Integer num = rVar.f6523c;
        if (num == null || num.intValue() != i7) {
            rVar.f6523c = Integer.valueOf(i7);
            rVar.setRadius(i7);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f4 *= 2;
        }
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        long b2 = j0.n.b(j10, f4);
        j0.n nVar = rVar.f6522b;
        if (!(nVar == null ? false : j0.n.c(nVar.f18554a, b2))) {
            rVar.f6522b = new j0.n(b2);
            rVar.setColor(ColorStateList.valueOf(AbstractC1362A.z(b2)));
        }
        Rect rect = new Rect(0, 0, Tb.a.F(i0.e.c(j)), Tb.a.F(i0.e.b(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        rVar.setBounds(rect);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Rb.a, kotlin.jvm.internal.m] */
    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        ?? r12 = this.f6505e;
        if (r12 != 0) {
            r12.invoke();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }
}
