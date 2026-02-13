package com.pnikosis.materialishprogress;

import Ua.a;
import Ua.b;
import Ua.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Parcelable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes2.dex */
public class ProgressWheel extends View {

    /* renamed from: A, reason: collision with root package name */
    public final Paint f16260A;

    /* renamed from: B, reason: collision with root package name */
    public RectF f16261B;

    /* renamed from: C, reason: collision with root package name */
    public float f16262C;

    /* renamed from: D, reason: collision with root package name */
    public long f16263D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f16264E;

    /* renamed from: F, reason: collision with root package name */
    public float f16265F;

    /* renamed from: G, reason: collision with root package name */
    public float f16266G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f16267H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f16268I;

    /* renamed from: a, reason: collision with root package name */
    public int f16269a;

    /* renamed from: b, reason: collision with root package name */
    public int f16270b;

    /* renamed from: c, reason: collision with root package name */
    public int f16271c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16272d;

    /* renamed from: e, reason: collision with root package name */
    public double f16273e;

    /* renamed from: f, reason: collision with root package name */
    public final double f16274f;

    /* renamed from: u, reason: collision with root package name */
    public float f16275u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f16276v;

    /* renamed from: w, reason: collision with root package name */
    public long f16277w;

    /* renamed from: x, reason: collision with root package name */
    public int f16278x;

    /* renamed from: y, reason: collision with root package name */
    public int f16279y;

    /* renamed from: z, reason: collision with root package name */
    public final Paint f16280z;

    public ProgressWheel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16269a = 28;
        this.f16270b = 4;
        this.f16271c = 4;
        this.f16272d = false;
        this.f16273e = 0.0d;
        this.f16274f = 460.0d;
        this.f16275u = 0.0f;
        this.f16276v = true;
        this.f16277w = 0L;
        this.f16278x = -1442840576;
        this.f16279y = 16777215;
        this.f16280z = new Paint();
        this.f16260A = new Paint();
        this.f16261B = new RectF();
        this.f16262C = 230.0f;
        this.f16263D = 0L;
        this.f16265F = 0.0f;
        this.f16266G = 0.0f;
        this.f16267H = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f9933a);
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.f16270b = (int) TypedValue.applyDimension(1, this.f16270b, displayMetrics);
        this.f16271c = (int) TypedValue.applyDimension(1, this.f16271c, displayMetrics);
        int applyDimension = (int) TypedValue.applyDimension(1, this.f16269a, displayMetrics);
        this.f16269a = applyDimension;
        this.f16269a = (int) obtainStyledAttributes.getDimension(3, applyDimension);
        this.f16272d = obtainStyledAttributes.getBoolean(4, false);
        this.f16270b = (int) obtainStyledAttributes.getDimension(2, this.f16270b);
        this.f16271c = (int) obtainStyledAttributes.getDimension(8, this.f16271c);
        this.f16262C = obtainStyledAttributes.getFloat(9, this.f16262C / 360.0f) * 360.0f;
        this.f16274f = obtainStyledAttributes.getInt(1, (int) this.f16274f);
        this.f16278x = obtainStyledAttributes.getColor(0, this.f16278x);
        this.f16279y = obtainStyledAttributes.getColor(7, this.f16279y);
        this.f16264E = obtainStyledAttributes.getBoolean(5, false);
        if (obtainStyledAttributes.getBoolean(6, false)) {
            this.f16263D = SystemClock.uptimeMillis();
            this.f16267H = true;
            invalidate();
        }
        obtainStyledAttributes.recycle();
        this.f16268I = Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
    }

    public final void a() {
        Paint paint = this.f16280z;
        paint.setColor(this.f16278x);
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(this.f16270b);
        Paint paint2 = this.f16260A;
        paint2.setColor(this.f16279y);
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        paint2.setStrokeWidth(this.f16271c);
    }

    public int getBarColor() {
        return this.f16278x;
    }

    public int getBarWidth() {
        return this.f16270b;
    }

    public int getCircleRadius() {
        return this.f16269a;
    }

    public float getProgress() {
        if (this.f16267H) {
            return -1.0f;
        }
        return this.f16265F / 360.0f;
    }

    public int getRimColor() {
        return this.f16279y;
    }

    public int getRimWidth() {
        return this.f16271c;
    }

    public float getSpinSpeed() {
        return this.f16262C / 360.0f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f4;
        float f10;
        super.onDraw(canvas);
        canvas.drawArc(this.f16261B, 360.0f, 360.0f, false, this.f16260A);
        if (this.f16268I) {
            boolean z8 = this.f16267H;
            Paint paint = this.f16280z;
            float f11 = 0.0f;
            boolean z10 = true;
            if (z8) {
                long uptimeMillis = SystemClock.uptimeMillis() - this.f16263D;
                float f12 = (((float) uptimeMillis) * this.f16262C) / 1000.0f;
                long j = this.f16277w;
                if (j >= 200) {
                    double d10 = this.f16273e + uptimeMillis;
                    this.f16273e = d10;
                    double d11 = this.f16274f;
                    if (d10 > d11) {
                        this.f16273e = d10 - d11;
                        this.f16277w = 0L;
                        this.f16276v = !this.f16276v;
                    }
                    float cos = (((float) Math.cos(((this.f16273e / d11) + 1.0d) * 3.141592653589793d)) / 2.0f) + 0.5f;
                    if (this.f16276v) {
                        this.f16275u = cos * 254.0f;
                    } else {
                        float f13 = (1.0f - cos) * 254.0f;
                        this.f16265F = (this.f16275u - f13) + this.f16265F;
                        this.f16275u = f13;
                    }
                } else {
                    this.f16277w = j + uptimeMillis;
                }
                float f14 = this.f16265F + f12;
                this.f16265F = f14;
                if (f14 > 360.0f) {
                    this.f16265F = f14 - 360.0f;
                }
                this.f16263D = SystemClock.uptimeMillis();
                float f15 = this.f16265F - 90.0f;
                float f16 = this.f16275u + 16.0f;
                if (isInEditMode()) {
                    f4 = 135.0f;
                    f10 = 0.0f;
                } else {
                    f4 = f16;
                    f10 = f15;
                }
                canvas.drawArc(this.f16261B, f10, f4, false, paint);
            } else {
                if (this.f16265F != this.f16266G) {
                    this.f16265F = Math.min(this.f16265F + ((((float) (SystemClock.uptimeMillis() - this.f16263D)) / 1000.0f) * this.f16262C), this.f16266G);
                    this.f16263D = SystemClock.uptimeMillis();
                } else {
                    z10 = false;
                }
                float f17 = this.f16265F;
                if (!this.f16264E) {
                    f11 = ((float) (1.0d - Math.pow(1.0f - (f17 / 360.0f), 4.0f))) * 360.0f;
                    f17 = ((float) (1.0d - Math.pow(1.0f - (this.f16265F / 360.0f), 2.0f))) * 360.0f;
                }
                canvas.drawArc(this.f16261B, f11 - 90.0f, isInEditMode() ? 360.0f : f17, false, paint);
            }
            if (z10) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int paddingRight = getPaddingRight() + getPaddingLeft() + this.f16269a;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + this.f16269a;
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824) {
            paddingRight = size;
        } else if (mode == Integer.MIN_VALUE) {
            paddingRight = Math.min(paddingRight, size);
        }
        if (mode2 == 1073741824 || mode == 1073741824) {
            paddingBottom = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            paddingBottom = Math.min(paddingBottom, size2);
        }
        setMeasuredDimension(paddingRight, paddingBottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        this.f16265F = bVar.f9922a;
        this.f16266G = bVar.f9923b;
        this.f16267H = bVar.f9924c;
        this.f16262C = bVar.f9925d;
        this.f16270b = bVar.f9926e;
        this.f16278x = bVar.f9927f;
        this.f16271c = bVar.f9928u;
        this.f16279y = bVar.f9929v;
        this.f16269a = bVar.f9930w;
        this.f16264E = bVar.f9931x;
        this.f16272d = bVar.f9932y;
        this.f16263D = SystemClock.uptimeMillis();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, Ua.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f9922a = this.f16265F;
        baseSavedState.f9923b = this.f16266G;
        baseSavedState.f9924c = this.f16267H;
        baseSavedState.f9925d = this.f16262C;
        baseSavedState.f9926e = this.f16270b;
        baseSavedState.f9927f = this.f16278x;
        baseSavedState.f9928u = this.f16271c;
        baseSavedState.f9929v = this.f16279y;
        baseSavedState.f9930w = this.f16269a;
        baseSavedState.f9931x = this.f16264E;
        baseSavedState.f9932y = this.f16272d;
        return baseSavedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        if (this.f16272d) {
            int i13 = this.f16270b;
            this.f16261B = new RectF(paddingLeft + i13, paddingTop + i13, (i7 - paddingRight) - i13, (i10 - paddingBottom) - i13);
        } else {
            int i14 = (i7 - paddingLeft) - paddingRight;
            int min = Math.min(Math.min(i14, (i10 - paddingBottom) - paddingTop), (this.f16269a * 2) - (this.f16270b * 2));
            int i15 = ((i14 - min) / 2) + paddingLeft;
            int i16 = ((((i10 - paddingTop) - paddingBottom) - min) / 2) + paddingTop;
            int i17 = this.f16270b;
            this.f16261B = new RectF(i15 + i17, i16 + i17, (i15 + min) - i17, (i16 + min) - i17);
        }
        a();
        invalidate();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i7) {
        super.onVisibilityChanged(view, i7);
        if (i7 == 0) {
            this.f16263D = SystemClock.uptimeMillis();
        }
    }

    public void setBarColor(int i7) {
        this.f16278x = i7;
        a();
        if (this.f16267H) {
            return;
        }
        invalidate();
    }

    public void setBarWidth(int i7) {
        this.f16270b = i7;
        if (this.f16267H) {
            return;
        }
        invalidate();
    }

    public void setCallback(a aVar) {
    }

    public void setCircleRadius(int i7) {
        this.f16269a = i7;
        if (this.f16267H) {
            return;
        }
        invalidate();
    }

    public void setInstantProgress(float f4) {
        if (this.f16267H) {
            this.f16265F = 0.0f;
            this.f16267H = false;
        }
        if (f4 > 1.0f) {
            f4 -= 1.0f;
        } else if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 == this.f16266G) {
            return;
        }
        float min = Math.min(f4 * 360.0f, 360.0f);
        this.f16266G = min;
        this.f16265F = min;
        this.f16263D = SystemClock.uptimeMillis();
        invalidate();
    }

    public void setLinearProgress(boolean z8) {
        this.f16264E = z8;
        if (this.f16267H) {
            return;
        }
        invalidate();
    }

    public void setProgress(float f4) {
        if (this.f16267H) {
            this.f16265F = 0.0f;
            this.f16267H = false;
        }
        if (f4 > 1.0f) {
            f4 -= 1.0f;
        } else if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        float f10 = this.f16266G;
        if (f4 == f10) {
            return;
        }
        if (this.f16265F == f10) {
            this.f16263D = SystemClock.uptimeMillis();
        }
        this.f16266G = Math.min(f4 * 360.0f, 360.0f);
        invalidate();
    }

    public void setRimColor(int i7) {
        this.f16279y = i7;
        a();
        if (this.f16267H) {
            return;
        }
        invalidate();
    }

    public void setRimWidth(int i7) {
        this.f16271c = i7;
        if (this.f16267H) {
            return;
        }
        invalidate();
    }

    public void setSpinSpeed(float f4) {
        this.f16262C = f4 * 360.0f;
    }
}
