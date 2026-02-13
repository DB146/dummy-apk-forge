package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.kt.apps.media.xemtv.beta.R;
import h.AbstractC1213a;

/* loaded from: classes.dex */
public final class C extends C1767x {

    /* renamed from: e, reason: collision with root package name */
    public final C1721B f21356e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f21357f;
    public ColorStateList g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f21358h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21359i;
    public boolean j;

    public C(C1721B c1721b) {
        super(c1721b);
        this.g = null;
        this.f21358h = null;
        this.f21359i = false;
        this.j = false;
        this.f21356e = c1721b;
    }

    @Override // o.C1767x
    public final void b(AttributeSet attributeSet, int i7) {
        super.b(attributeSet, R.attr.seekBarStyle);
        C1721B c1721b = this.f21356e;
        Context context = c1721b.getContext();
        int[] iArr = AbstractC1213a.g;
        l2.X u3 = l2.X.u(context, attributeSet, iArr, R.attr.seekBarStyle);
        y1.K.m(c1721b, c1721b.getContext(), iArr, attributeSet, (TypedArray) u3.f19195c, R.attr.seekBarStyle, 0);
        Drawable o10 = u3.o(0);
        if (o10 != null) {
            c1721b.setThumb(o10);
        }
        Drawable n6 = u3.n(1);
        Drawable drawable = this.f21357f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f21357f = n6;
        if (n6 != null) {
            n6.setCallback(c1721b);
            n6.setLayoutDirection(c1721b.getLayoutDirection());
            if (n6.isStateful()) {
                n6.setState(c1721b.getDrawableState());
            }
            f();
        }
        c1721b.invalidate();
        TypedArray typedArray = (TypedArray) u3.f19195c;
        if (typedArray.hasValue(3)) {
            this.f21358h = AbstractC1737h0.c(typedArray.getInt(3, -1), this.f21358h);
            this.j = true;
        }
        if (typedArray.hasValue(2)) {
            this.g = u3.m(2);
            this.f21359i = true;
        }
        u3.w();
        f();
    }

    public final void f() {
        Drawable drawable = this.f21357f;
        if (drawable != null) {
            if (this.f21359i || this.j) {
                Drawable mutate = drawable.mutate();
                this.f21357f = mutate;
                if (this.f21359i) {
                    mutate.setTintList(this.g);
                }
                if (this.j) {
                    this.f21357f.setTintMode(this.f21358h);
                }
                if (this.f21357f.isStateful()) {
                    this.f21357f.setState(this.f21356e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f21357f != null) {
            int max = this.f21356e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f21357f.getIntrinsicWidth();
                int intrinsicHeight = this.f21357f.getIntrinsicHeight();
                int i7 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i10 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f21357f.setBounds(-i7, -i10, i7, i10);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i11 = 0; i11 <= max; i11++) {
                    this.f21357f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
