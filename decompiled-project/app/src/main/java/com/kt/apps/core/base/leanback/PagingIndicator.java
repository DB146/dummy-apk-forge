package com.kt.apps.core.base.leanback;

import A9.Q1;
import A9.R1;
import a2.AbstractC0708a;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.kt.apps.media.xemtv.beta.R;
import y1.K;

/* loaded from: classes2.dex */
public class PagingIndicator extends View {

    /* renamed from: K, reason: collision with root package name */
    public static final DecelerateInterpolator f15973K = new DecelerateInterpolator();
    public static final Q1 L;

    /* renamed from: M, reason: collision with root package name */
    public static final Q1 f15974M;

    /* renamed from: N, reason: collision with root package name */
    public static final Q1 f15975N;

    /* renamed from: A, reason: collision with root package name */
    public int f15976A;

    /* renamed from: B, reason: collision with root package name */
    public int f15977B;

    /* renamed from: C, reason: collision with root package name */
    public int f15978C;

    /* renamed from: D, reason: collision with root package name */
    public int f15979D;

    /* renamed from: E, reason: collision with root package name */
    public final Paint f15980E;

    /* renamed from: F, reason: collision with root package name */
    public final Paint f15981F;

    /* renamed from: G, reason: collision with root package name */
    public Bitmap f15982G;

    /* renamed from: H, reason: collision with root package name */
    public Paint f15983H;

    /* renamed from: I, reason: collision with root package name */
    public final Rect f15984I;

    /* renamed from: J, reason: collision with root package name */
    public final float f15985J;

    /* renamed from: a, reason: collision with root package name */
    public boolean f15986a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15987b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15988c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15989d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15990e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15991f;

    /* renamed from: u, reason: collision with root package name */
    public final int f15992u;

    /* renamed from: v, reason: collision with root package name */
    public final int f15993v;

    /* renamed from: w, reason: collision with root package name */
    public R1[] f15994w;

    /* renamed from: x, reason: collision with root package name */
    public int[] f15995x;

    /* renamed from: y, reason: collision with root package name */
    public int[] f15996y;

    /* renamed from: z, reason: collision with root package name */
    public int[] f15997z;

    static {
        Class<Float> cls = Float.class;
        L = new Q1(0, cls, "alpha");
        f15974M = new Q1(1, cls, "diameter");
        f15975N = new Q1(2, cls, "translation_x");
    }

    public PagingIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AnimatorSet animatorSet = new AnimatorSet();
        Resources resources = getResources();
        int[] iArr = AbstractC0708a.f12485c;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        K.m(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(6, getResources().getDimensionPixelOffset(R.dimen.lb_page_indicator_dot_radius));
        this.f15988c = dimensionPixelOffset;
        int i7 = dimensionPixelOffset * 2;
        this.f15987b = i7;
        int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(2, getResources().getDimensionPixelOffset(R.dimen.lb_page_indicator_arrow_radius));
        this.f15991f = dimensionPixelOffset2;
        int i10 = dimensionPixelOffset2 * 2;
        this.f15990e = i10;
        this.f15989d = obtainStyledAttributes.getDimensionPixelOffset(5, getResources().getDimensionPixelOffset(R.dimen.lb_page_indicator_dot_gap));
        this.f15992u = obtainStyledAttributes.getDimensionPixelOffset(4, getResources().getDimensionPixelOffset(R.dimen.lb_page_indicator_arrow_gap));
        int color = obtainStyledAttributes.getColor(3, getResources().getColor(R.color.lb_page_indicator_dot));
        Paint paint = new Paint(1);
        this.f15980E = paint;
        paint.setColor(color);
        this.f15979D = obtainStyledAttributes.getColor(0, getResources().getColor(R.color.lb_page_indicator_arrow_background));
        if (this.f15983H == null && obtainStyledAttributes.hasValue(1)) {
            setArrowColor(obtainStyledAttributes.getColor(1, 0));
        }
        obtainStyledAttributes.recycle();
        this.f15986a = resources.getConfiguration().getLayoutDirection() == 0;
        int color2 = resources.getColor(R.color.lb_page_indicator_arrow_shadow);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.lb_page_indicator_arrow_shadow_radius);
        this.f15993v = dimensionPixelSize;
        Paint paint2 = new Paint(1);
        this.f15981F = paint2;
        float dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.lb_page_indicator_arrow_shadow_offset);
        paint2.setShadowLayer(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, color2);
        this.f15982G = d();
        this.f15984I = new Rect(0, 0, this.f15982G.getWidth(), this.f15982G.getHeight());
        float f4 = i10;
        this.f15985J = this.f15982G.getWidth() / f4;
        AnimatorSet animatorSet2 = new AnimatorSet();
        Q1 q12 = L;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, q12, 0.0f, 1.0f);
        ofFloat.setDuration(167L);
        DecelerateInterpolator decelerateInterpolator = f15973K;
        ofFloat.setInterpolator(decelerateInterpolator);
        float f10 = i7;
        Q1 q13 = f15974M;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object) null, q13, f10, f4);
        ofFloat2.setDuration(417L);
        ofFloat2.setInterpolator(decelerateInterpolator);
        animatorSet2.playTogether(ofFloat, ofFloat2, c());
        AnimatorSet animatorSet3 = new AnimatorSet();
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((Object) null, q12, 1.0f, 0.0f);
        ofFloat3.setDuration(167L);
        ofFloat3.setInterpolator(decelerateInterpolator);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat((Object) null, q13, f4, f10);
        ofFloat4.setDuration(417L);
        ofFloat4.setInterpolator(decelerateInterpolator);
        animatorSet3.playTogether(ofFloat3, ofFloat4, c());
        animatorSet.playTogether(animatorSet2, animatorSet3);
        setLayerType(1, null);
    }

    private int getDesiredHeight() {
        return getPaddingBottom() + getPaddingTop() + this.f15990e + this.f15993v;
    }

    private int getDesiredWidth() {
        return getPaddingRight() + getPaddingLeft() + getRequiredWidth();
    }

    private int getRequiredWidth() {
        return ((this.f15977B - 3) * this.f15989d) + (this.f15992u * 2) + (this.f15988c * 2);
    }

    private void setSelectedPage(int i7) {
        if (i7 == this.f15978C) {
            return;
        }
        this.f15978C = i7;
        a();
    }

    public final void a() {
        int i7;
        int i10 = 0;
        while (true) {
            i7 = this.f15978C;
            if (i10 >= i7) {
                break;
            }
            this.f15994w[i10].b();
            R1 r12 = this.f15994w[i10];
            if (i10 != 0) {
                r2 = 1.0f;
            }
            r12.f952h = r2;
            r12.f949d = this.f15996y[i10];
            i10++;
        }
        R1 r13 = this.f15994w[i7];
        r13.f948c = 0.0f;
        r13.f949d = 0.0f;
        PagingIndicator pagingIndicator = r13.j;
        r13.f950e = pagingIndicator.f15990e;
        float f4 = pagingIndicator.f15991f;
        r13.f951f = f4;
        r13.g = f4 * pagingIndicator.f15985J;
        r13.f946a = 1.0f;
        r13.a();
        R1[] r1Arr = this.f15994w;
        int i11 = this.f15978C;
        R1 r14 = r1Arr[i11];
        r14.f952h = i11 <= 0 ? 1.0f : -1.0f;
        r14.f949d = this.f15995x[i11];
        while (true) {
            i11++;
            if (i11 >= this.f15977B) {
                return;
            }
            this.f15994w[i11].b();
            R1 r15 = this.f15994w[i11];
            r15.f952h = 1.0f;
            r15.f949d = this.f15997z[i11];
        }
    }

    public final void b() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int requiredWidth = getRequiredWidth();
        int i7 = (paddingLeft + width) / 2;
        int i10 = this.f15977B;
        int[] iArr = new int[i10];
        this.f15995x = iArr;
        int[] iArr2 = new int[i10];
        this.f15996y = iArr2;
        int[] iArr3 = new int[i10];
        this.f15997z = iArr3;
        boolean z8 = this.f15986a;
        int i11 = this.f15988c;
        int i12 = this.f15992u;
        int i13 = this.f15989d;
        int i14 = 1;
        if (z8) {
            int i15 = i7 - (requiredWidth / 2);
            iArr[0] = ((i15 + i11) - i13) + i12;
            iArr2[0] = i15 + i11;
            iArr3[0] = (i12 * 2) + ((i15 + i11) - (i13 * 2));
            while (i14 < this.f15977B) {
                int[] iArr4 = this.f15995x;
                int[] iArr5 = this.f15996y;
                int i16 = i14 - 1;
                iArr4[i14] = iArr5[i16] + i12;
                iArr5[i14] = iArr5[i16] + i13;
                this.f15997z[i14] = iArr4[i16] + i12;
                i14++;
            }
        } else {
            int i17 = (requiredWidth / 2) + i7;
            iArr[0] = ((i17 - i11) + i13) - i12;
            iArr2[0] = i17 - i11;
            iArr3[0] = ((i13 * 2) + (i17 - i11)) - (i12 * 2);
            while (i14 < this.f15977B) {
                int[] iArr6 = this.f15995x;
                int[] iArr7 = this.f15996y;
                int i18 = i14 - 1;
                iArr6[i14] = iArr7[i18] - i12;
                iArr7[i14] = iArr7[i18] - i13;
                this.f15997z[i14] = iArr6[i18] - i12;
                i14++;
            }
        }
        this.f15976A = paddingTop + this.f15991f;
        a();
    }

    public final ObjectAnimator c() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, f15975N, (-this.f15992u) + this.f15989d, 0.0f);
        ofFloat.setDuration(417L);
        ofFloat.setInterpolator(f15973K);
        return ofFloat;
    }

    public final Bitmap d() {
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.lb_ic_nav_arrow);
        if (this.f15986a) {
            return decodeResource;
        }
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(decodeResource, 0, 0, decodeResource.getWidth(), decodeResource.getHeight(), matrix, false);
    }

    public int[] getDotSelectedLeftX() {
        return this.f15996y;
    }

    public int[] getDotSelectedRightX() {
        return this.f15997z;
    }

    public int[] getDotSelectedX() {
        return this.f15995x;
    }

    public int getPageCount() {
        return this.f15977B;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        for (int i7 = 0; i7 < this.f15977B; i7++) {
            R1 r12 = this.f15994w[i7];
            float f4 = r12.f949d + r12.f948c;
            PagingIndicator pagingIndicator = r12.j;
            canvas.drawCircle(f4, pagingIndicator.f15976A, r12.f951f, pagingIndicator.f15980E);
            if (r12.f946a > 0.0f) {
                Paint paint = pagingIndicator.f15981F;
                paint.setColor(r12.f947b);
                canvas.drawCircle(f4, pagingIndicator.f15976A, r12.f951f, paint);
                Bitmap bitmap = pagingIndicator.f15982G;
                float f10 = r12.g;
                float f11 = pagingIndicator.f15976A;
                canvas.drawBitmap(bitmap, pagingIndicator.f15984I, new Rect((int) (f4 - f10), (int) (f11 - f10), (int) (f4 + f10), (int) (f11 + f10)), pagingIndicator.f15983H);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int desiredHeight = getDesiredHeight();
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE) {
            desiredHeight = Math.min(desiredHeight, View.MeasureSpec.getSize(i10));
        } else if (mode == 1073741824) {
            desiredHeight = View.MeasureSpec.getSize(i10);
        }
        int desiredWidth = getDesiredWidth();
        int mode2 = View.MeasureSpec.getMode(i7);
        if (mode2 == Integer.MIN_VALUE) {
            desiredWidth = Math.min(desiredWidth, View.MeasureSpec.getSize(i7));
        } else if (mode2 == 1073741824) {
            desiredWidth = View.MeasureSpec.getSize(i7);
        }
        setMeasuredDimension(desiredWidth, desiredHeight);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        super.onRtlPropertiesChanged(i7);
        boolean z8 = i7 == 0;
        if (this.f15986a != z8) {
            this.f15986a = z8;
            this.f15982G = d();
            R1[] r1Arr = this.f15994w;
            if (r1Arr != null) {
                for (R1 r12 : r1Arr) {
                    r12.f953i = r12.j.f15986a ? 1.0f : -1.0f;
                }
            }
            b();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        setMeasuredDimension(i7, i10);
        b();
    }

    public void setArrowBackgroundColor(int i7) {
        this.f15979D = i7;
    }

    public void setArrowColor(int i7) {
        if (this.f15983H == null) {
            this.f15983H = new Paint();
        }
        this.f15983H.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
    }

    public void setDotBackgroundColor(int i7) {
        this.f15980E.setColor(i7);
    }

    public void setPageCount(int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("The page count should be a positive integer");
        }
        this.f15977B = i7;
        this.f15994w = new R1[i7];
        for (int i10 = 0; i10 < this.f15977B; i10++) {
            this.f15994w[i10] = new R1(this);
        }
        b();
        setSelectedPage(0);
    }
}
