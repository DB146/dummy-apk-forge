package com.google.android.material.imageview;

import D6.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import c6.AbstractC0911a;
import com.kt.apps.media.xemtv.beta.R;
import l1.AbstractC1449a;
import m4.C1584n0;
import r6.C1944a;
import y6.AbstractC2405k;
import y6.C2401g;
import y6.C2404j;
import y6.t;

/* loaded from: classes.dex */
public class ShapeableImageView extends AppCompatImageView implements t {

    /* renamed from: A, reason: collision with root package name */
    public float f15383A;

    /* renamed from: B, reason: collision with root package name */
    public final Path f15384B;

    /* renamed from: C, reason: collision with root package name */
    public final int f15385C;

    /* renamed from: D, reason: collision with root package name */
    public final int f15386D;

    /* renamed from: E, reason: collision with root package name */
    public final int f15387E;

    /* renamed from: F, reason: collision with root package name */
    public final int f15388F;

    /* renamed from: G, reason: collision with root package name */
    public final int f15389G;

    /* renamed from: H, reason: collision with root package name */
    public final int f15390H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f15391I;

    /* renamed from: d, reason: collision with root package name */
    public final C1584n0 f15392d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f15393e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f15394f;

    /* renamed from: u, reason: collision with root package name */
    public final Paint f15395u;

    /* renamed from: v, reason: collision with root package name */
    public final Paint f15396v;

    /* renamed from: w, reason: collision with root package name */
    public final Path f15397w;

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f15398x;

    /* renamed from: y, reason: collision with root package name */
    public C2401g f15399y;

    /* renamed from: z, reason: collision with root package name */
    public C2404j f15400z;

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView), attributeSet, 0);
        this.f15392d = AbstractC2405k.f27057a;
        this.f15397w = new Path();
        this.f15391I = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f15396v = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f15393e = new RectF();
        this.f15394f = new RectF();
        this.f15384B = new Path();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC0911a.f14424z, 0, R.style.Widget_MaterialComponents_ShapeableImageView);
        setLayerType(2, null);
        this.f15398x = Tb.a.n(context2, obtainStyledAttributes, 9);
        this.f15383A = obtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f15385C = dimensionPixelSize;
        this.f15386D = dimensionPixelSize;
        this.f15387E = dimensionPixelSize;
        this.f15388F = dimensionPixelSize;
        this.f15385C = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.f15386D = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.f15387E = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.f15388F = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.f15389G = obtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.f15390H = obtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        obtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f15395u = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f15400z = C2404j.b(context2, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView).c();
        setOutlineProvider(new C1944a(this));
    }

    public final boolean a() {
        return getLayoutDirection() == 1;
    }

    public final void d(int i7, int i10) {
        RectF rectF = this.f15393e;
        rectF.set(getPaddingLeft(), getPaddingTop(), i7 - getPaddingRight(), i10 - getPaddingBottom());
        C2404j c2404j = this.f15400z;
        Path path = this.f15397w;
        this.f15392d.b(c2404j, 1.0f, rectF, null, path);
        Path path2 = this.f15384B;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.f15394f;
        rectF2.set(0.0f, 0.0f, i7, i10);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f15388F;
    }

    public final int getContentPaddingEnd() {
        int i7 = this.f15390H;
        return i7 != Integer.MIN_VALUE ? i7 : a() ? this.f15385C : this.f15387E;
    }

    public int getContentPaddingLeft() {
        int i7;
        int i10;
        if (this.f15389G != Integer.MIN_VALUE || this.f15390H != Integer.MIN_VALUE) {
            if (a() && (i10 = this.f15390H) != Integer.MIN_VALUE) {
                return i10;
            }
            if (!a() && (i7 = this.f15389G) != Integer.MIN_VALUE) {
                return i7;
            }
        }
        return this.f15385C;
    }

    public int getContentPaddingRight() {
        int i7;
        int i10;
        if (this.f15389G != Integer.MIN_VALUE || this.f15390H != Integer.MIN_VALUE) {
            if (a() && (i10 = this.f15389G) != Integer.MIN_VALUE) {
                return i10;
            }
            if (!a() && (i7 = this.f15390H) != Integer.MIN_VALUE) {
                return i7;
            }
        }
        return this.f15387E;
    }

    public final int getContentPaddingStart() {
        int i7 = this.f15389G;
        return i7 != Integer.MIN_VALUE ? i7 : a() ? this.f15387E : this.f15385C;
    }

    public int getContentPaddingTop() {
        return this.f15386D;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public C2404j getShapeAppearanceModel() {
        return this.f15400z;
    }

    public ColorStateList getStrokeColor() {
        return this.f15398x;
    }

    public float getStrokeWidth() {
        return this.f15383A;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f15384B, this.f15396v);
        if (this.f15398x == null) {
            return;
        }
        Paint paint = this.f15395u;
        paint.setStrokeWidth(this.f15383A);
        int colorForState = this.f15398x.getColorForState(getDrawableState(), this.f15398x.getDefaultColor());
        if (this.f15383A <= 0.0f || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.f15397w, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (!this.f15391I && isLayoutDirectionResolved()) {
            this.f15391I = true;
            if (!isPaddingRelative() && this.f15389G == Integer.MIN_VALUE && this.f15390H == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        d(i7, i10);
    }

    @Override // android.view.View
    public final void setPadding(int i7, int i10, int i11, int i12) {
        super.setPadding(getContentPaddingLeft() + i7, getContentPaddingTop() + i10, getContentPaddingRight() + i11, getContentPaddingBottom() + i12);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i7, int i10, int i11, int i12) {
        super.setPaddingRelative(getContentPaddingStart() + i7, getContentPaddingTop() + i10, getContentPaddingEnd() + i11, getContentPaddingBottom() + i12);
    }

    @Override // y6.t
    public void setShapeAppearanceModel(C2404j c2404j) {
        this.f15400z = c2404j;
        C2401g c2401g = this.f15399y;
        if (c2401g != null) {
            c2401g.setShapeAppearanceModel(c2404j);
        }
        d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f15398x = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i7) {
        setStrokeColor(AbstractC1449a.getColorStateList(getContext(), i7));
    }

    public void setStrokeWidth(float f4) {
        if (this.f15383A != f4) {
            this.f15383A = f4;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i7) {
        setStrokeWidth(getResources().getDimensionPixelSize(i7));
    }
}
