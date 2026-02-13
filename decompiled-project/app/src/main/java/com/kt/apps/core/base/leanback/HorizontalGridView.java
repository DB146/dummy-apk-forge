package com.kt.apps.core.base.leanback;

import A9.AbstractC0145v;
import A9.J0;
import A9.N0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import i2.AbstractC1302J;
import y1.K;

/* loaded from: classes2.dex */
public class HorizontalGridView extends AbstractC0145v {

    /* renamed from: h1, reason: collision with root package name */
    public boolean f15932h1;

    /* renamed from: i1, reason: collision with root package name */
    public boolean f15933i1;

    /* renamed from: j1, reason: collision with root package name */
    public final Paint f15934j1;

    /* renamed from: k1, reason: collision with root package name */
    public Bitmap f15935k1;

    /* renamed from: l1, reason: collision with root package name */
    public LinearGradient f15936l1;

    /* renamed from: m1, reason: collision with root package name */
    public int f15937m1;

    /* renamed from: n1, reason: collision with root package name */
    public int f15938n1;

    /* renamed from: o1, reason: collision with root package name */
    public Bitmap f15939o1;
    public LinearGradient p1;

    /* renamed from: q1, reason: collision with root package name */
    public int f15940q1;

    /* renamed from: r1, reason: collision with root package name */
    public int f15941r1;

    /* renamed from: s1, reason: collision with root package name */
    public final Rect f15942s1;

    public HorizontalGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15934j1 = new Paint();
        this.f15942s1 = new Rect();
        this.f1419Y0.C1(0);
        r0(context, attributeSet);
        int[] iArr = AbstractC1302J.f18217b;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        K.m(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        setRowHeight(obtainStyledAttributes);
        setNumRows(obtainStyledAttributes.getInt(0, 1));
        obtainStyledAttributes.recycle();
        s0();
        Paint paint = new Paint();
        this.f15934j1 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    private Bitmap getTempBitmapHigh() {
        Bitmap bitmap = this.f15939o1;
        if (bitmap == null || bitmap.getWidth() != this.f15940q1 || this.f15939o1.getHeight() != getHeight()) {
            this.f15939o1 = Bitmap.createBitmap(this.f15940q1, getHeight(), Bitmap.Config.ARGB_8888);
        }
        return this.f15939o1;
    }

    private Bitmap getTempBitmapLow() {
        Bitmap bitmap = this.f15935k1;
        if (bitmap == null || bitmap.getWidth() != this.f15937m1 || this.f15935k1.getHeight() != getHeight()) {
            this.f15935k1 = Bitmap.createBitmap(this.f15937m1, getHeight(), Bitmap.Config.ARGB_8888);
        }
        return this.f15935k1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        boolean z8;
        boolean z10 = this.f15932h1;
        N0 n02 = this.f1419Y0;
        boolean z11 = true;
        if (z10) {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                n02.getClass();
                J0 j02 = (J0) childAt.getLayoutParams();
                j02.getClass();
                if (childAt.getLeft() + j02.f843e < getPaddingLeft() - this.f15938n1) {
                    z8 = true;
                    break;
                }
            }
        }
        z8 = false;
        if (this.f15933i1) {
            for (int childCount2 = getChildCount() - 1; childCount2 >= 0; childCount2--) {
                View childAt2 = getChildAt(childCount2);
                n02.getClass();
                J0 j03 = (J0) childAt2.getLayoutParams();
                j03.getClass();
                if (childAt2.getRight() - j03.f845u > (getWidth() - getPaddingRight()) + this.f15941r1) {
                    break;
                }
            }
        }
        z11 = false;
        if (!z8) {
            this.f15935k1 = null;
        }
        if (!z11) {
            this.f15939o1 = null;
        }
        if (!z8 && !z11) {
            super.draw(canvas);
            return;
        }
        int paddingLeft = this.f15932h1 ? (getPaddingLeft() - this.f15938n1) - this.f15937m1 : 0;
        int width = this.f15933i1 ? (getWidth() - getPaddingRight()) + this.f15941r1 + this.f15940q1 : getWidth();
        int save = canvas.save();
        canvas.clipRect((this.f15932h1 ? this.f15937m1 : 0) + paddingLeft, 0, width - (this.f15933i1 ? this.f15940q1 : 0), getHeight());
        super.draw(canvas);
        canvas.restoreToCount(save);
        Canvas canvas2 = new Canvas();
        Rect rect = this.f15942s1;
        rect.top = 0;
        rect.bottom = getHeight();
        if (z8 && this.f15937m1 > 0) {
            Bitmap tempBitmapLow = getTempBitmapLow();
            tempBitmapLow.eraseColor(0);
            canvas2.setBitmap(tempBitmapLow);
            int save2 = canvas2.save();
            canvas2.clipRect(0, 0, this.f15937m1, getHeight());
            float f4 = -paddingLeft;
            canvas2.translate(f4, 0.0f);
            super.draw(canvas2);
            canvas2.restoreToCount(save2);
            this.f15934j1.setShader(this.f15936l1);
            canvas2.drawRect(0.0f, 0.0f, this.f15937m1, getHeight(), this.f15934j1);
            rect.left = 0;
            rect.right = this.f15937m1;
            canvas.translate(paddingLeft, 0.0f);
            canvas.drawBitmap(tempBitmapLow, rect, rect, (Paint) null);
            canvas.translate(f4, 0.0f);
        }
        if (!z11 || this.f15940q1 <= 0) {
            return;
        }
        Bitmap tempBitmapHigh = getTempBitmapHigh();
        tempBitmapHigh.eraseColor(0);
        canvas2.setBitmap(tempBitmapHigh);
        int save3 = canvas2.save();
        canvas2.clipRect(0, 0, this.f15940q1, getHeight());
        canvas2.translate(-(width - this.f15940q1), 0.0f);
        super.draw(canvas2);
        canvas2.restoreToCount(save3);
        this.f15934j1.setShader(this.p1);
        canvas2.drawRect(0.0f, 0.0f, this.f15940q1, getHeight(), this.f15934j1);
        rect.left = 0;
        rect.right = this.f15940q1;
        canvas.translate(width - r4, 0.0f);
        canvas.drawBitmap(tempBitmapHigh, rect, rect, (Paint) null);
        canvas.translate(-(width - this.f15940q1), 0.0f);
    }

    public final boolean getFadingLeftEdge() {
        return this.f15932h1;
    }

    public final int getFadingLeftEdgeLength() {
        return this.f15937m1;
    }

    public final int getFadingLeftEdgeOffset() {
        return this.f15938n1;
    }

    public final boolean getFadingRightEdge() {
        return this.f15933i1;
    }

    public final int getFadingRightEdgeLength() {
        return this.f15940q1;
    }

    public final int getFadingRightEdgeOffset() {
        return this.f15941r1;
    }

    public final void s0() {
        if (this.f15932h1 || this.f15933i1) {
            setLayerType(2, null);
            setWillNotDraw(false);
        } else {
            setLayerType(0, null);
            setWillNotDraw(true);
        }
    }

    public final void setFadingLeftEdge(boolean z8) {
        if (this.f15932h1 != z8) {
            this.f15932h1 = z8;
            if (!z8) {
                this.f15935k1 = null;
            }
            invalidate();
            s0();
        }
    }

    public final void setFadingLeftEdgeLength(int i7) {
        if (this.f15937m1 != i7) {
            this.f15937m1 = i7;
            if (i7 != 0) {
                this.f15936l1 = new LinearGradient(0.0f, 0.0f, this.f15937m1, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
            } else {
                this.f15936l1 = null;
            }
            invalidate();
        }
    }

    public final void setFadingLeftEdgeOffset(int i7) {
        if (this.f15938n1 != i7) {
            this.f15938n1 = i7;
            invalidate();
        }
    }

    public final void setFadingRightEdge(boolean z8) {
        if (this.f15933i1 != z8) {
            this.f15933i1 = z8;
            if (!z8) {
                this.f15939o1 = null;
            }
            invalidate();
            s0();
        }
    }

    public final void setFadingRightEdgeLength(int i7) {
        if (this.f15940q1 != i7) {
            this.f15940q1 = i7;
            if (i7 != 0) {
                this.p1 = new LinearGradient(0.0f, 0.0f, this.f15940q1, 0.0f, -16777216, 0, Shader.TileMode.CLAMP);
            } else {
                this.p1 = null;
            }
            invalidate();
        }
    }

    public final void setFadingRightEdgeOffset(int i7) {
        if (this.f15941r1 != i7) {
            this.f15941r1 = i7;
            invalidate();
        }
    }

    public void setNumRows(int i7) {
        N0 n02 = this.f1419Y0;
        if (i7 < 0) {
            n02.getClass();
            throw new IllegalArgumentException();
        }
        n02.f895W = i7;
        requestLayout();
    }

    public void setRowHeight(int i7) {
        this.f1419Y0.D1(i7);
        requestLayout();
    }

    public void setRowHeight(TypedArray typedArray) {
        if (typedArray.peekValue(1) != null) {
            setRowHeight(typedArray.getLayoutDimension(1, 0));
        }
    }
}
