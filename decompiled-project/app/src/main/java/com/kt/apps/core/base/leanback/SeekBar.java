package com.kt.apps.core.base.leanback;

import A9.C0097i2;
import A9.C0101j2;
import A9.X2;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public final class SeekBar extends View {

    /* renamed from: A, reason: collision with root package name */
    public int f16079A;

    /* renamed from: B, reason: collision with root package name */
    public int f16080B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f16081C;

    /* renamed from: D, reason: collision with root package name */
    public X2 f16082D;

    /* renamed from: a, reason: collision with root package name */
    public final RectF f16083a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f16084b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f16085c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f16086d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f16087e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f16088f;

    /* renamed from: u, reason: collision with root package name */
    public final Paint f16089u;

    /* renamed from: v, reason: collision with root package name */
    public int f16090v;

    /* renamed from: w, reason: collision with root package name */
    public int f16091w;

    /* renamed from: x, reason: collision with root package name */
    public int f16092x;

    /* renamed from: y, reason: collision with root package name */
    public int f16093y;

    /* renamed from: z, reason: collision with root package name */
    public int f16094z;

    public SeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16083a = new RectF();
        this.f16084b = new RectF();
        this.f16085c = new RectF();
        Paint paint = new Paint(1);
        this.f16086d = paint;
        Paint paint2 = new Paint(1);
        this.f16087e = paint2;
        Paint paint3 = new Paint(1);
        this.f16088f = paint3;
        Paint paint4 = new Paint(1);
        this.f16089u = paint4;
        this.f16081C = true;
        setWillNotDraw(false);
        paint3.setColor(-7829368);
        paint.setColor(-3355444);
        paint2.setColor(-1);
        paint4.setColor(-1);
        this.f16079A = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_progressbar_bar_height);
        this.f16080B = context.getResources().getDimensionPixelSize(R.dimen.leanback_active_bar_height_seek_bark);
        this.f16094z = context.getResources().getDimensionPixelSize(R.dimen.leanback_active_bar_radius_seek_bark);
    }

    public final void a() {
        int i7 = isFocused() ? this.f16080B : this.f16079A;
        int width = getWidth();
        int height = getHeight();
        int i10 = (height - i7) / 2;
        RectF rectF = this.f16085c;
        int i11 = this.f16079A;
        float f4 = i10;
        float f10 = height - i10;
        rectF.set(i11 / 2, f4, width - (i11 / 2), f10);
        int i12 = isFocused() ? this.f16094z : this.f16079A / 2;
        float f11 = width - (i12 * 2);
        float f12 = (this.f16090v / this.f16092x) * f11;
        RectF rectF2 = this.f16083a;
        int i13 = this.f16079A;
        rectF2.set(i13 / 2, f4, (i13 / 2) + f12, f10);
        this.f16084b.set(rectF2.right, f4, (this.f16079A / 2) + ((this.f16091w / this.f16092x) * f11), f10);
        if (isFocused()) {
            this.f16093y = (i12 / 2) + ((int) f12);
        } else {
            this.f16093y = i12 + ((int) f12);
        }
        invalidate();
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return android.widget.SeekBar.class.getName();
    }

    public int getMax() {
        return this.f16092x;
    }

    public int getProgress() {
        return this.f16090v;
    }

    public int getSecondProgress() {
        return this.f16091w;
    }

    public int getSecondaryProgressColor() {
        return this.f16086d.getColor();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f4 = isFocused() ? this.f16094z : this.f16079A / 2;
        canvas.drawRoundRect(this.f16085c, f4, f4, this.f16088f);
        RectF rectF = this.f16084b;
        if (rectF.right > rectF.left) {
            canvas.drawRoundRect(rectF, f4, f4, this.f16086d);
        }
        canvas.drawRoundRect(this.f16083a, f4, f4, this.f16087e);
        canvas.drawCircle(this.f16093y, getHeight() / 2, f4, this.f16089u);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z8, int i7, Rect rect) {
        super.onFocusChanged(z8, i7, rect);
        a();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        a();
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        X2 x2 = this.f16082D;
        if (x2 != null) {
            if (i7 == 4096) {
                C0101j2 c0101j2 = ((C0097i2) x2).f1230a;
                if (!c0101j2.f()) {
                    return false;
                }
                c0101j2.h(true);
                return true;
            }
            if (i7 == 8192) {
                C0101j2 c0101j22 = ((C0097i2) x2).f1230a;
                if (!c0101j22.f()) {
                    return false;
                }
                c0101j22.h(false);
                return true;
            }
        }
        return super.performAccessibilityAction(i7, bundle);
    }

    public void setAccessibilitySeekListener(X2 x2) {
        this.f16082D = x2;
    }

    public void setActiveBarHeight(int i7) {
        this.f16080B = i7;
        a();
    }

    public void setActiveRadius(int i7) {
        this.f16094z = i7;
        a();
    }

    public void setBarHeight(int i7) {
        this.f16079A = i7;
        a();
    }

    public void setMax(int i7) {
        this.f16092x = i7;
        a();
    }

    public void setProgress(int i7) {
        int i10 = this.f16092x;
        if (i7 > i10) {
            i7 = i10;
        } else if (i7 < 0) {
            i7 = 0;
        }
        this.f16090v = i7;
        a();
    }

    public void setProgressColor(int i7) {
        this.f16087e.setColor(i7);
    }

    public void setSecondaryProgress(int i7) {
        int i10 = this.f16092x;
        if (i7 > i10) {
            i7 = i10;
        } else if (i7 < 0) {
            i7 = 0;
        }
        this.f16091w = i7;
        a();
    }

    public void setSecondaryProgressColor(int i7) {
        this.f16086d.setColor(i7);
    }

    public void setSeekAble(boolean z8) {
        this.f16081C = z8;
    }
}
