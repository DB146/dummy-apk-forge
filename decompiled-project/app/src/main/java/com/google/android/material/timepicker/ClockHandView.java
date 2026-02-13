package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import c6.AbstractC0911a;
import com.kt.apps.media.xemtv.beta.R;
import d6.AbstractC1053a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import s6.o;
import y1.K;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ClockHandView extends View {

    /* renamed from: A, reason: collision with root package name */
    public int f15536A;

    /* renamed from: a, reason: collision with root package name */
    public final ValueAnimator f15537a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15538b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f15539c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15540d;

    /* renamed from: e, reason: collision with root package name */
    public final float f15541e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f15542f;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f15543u;

    /* renamed from: v, reason: collision with root package name */
    public final int f15544v;

    /* renamed from: w, reason: collision with root package name */
    public float f15545w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f15546x;

    /* renamed from: y, reason: collision with root package name */
    public double f15547y;

    /* renamed from: z, reason: collision with root package name */
    public int f15548z;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f15537a = new ValueAnimator();
        this.f15539c = new ArrayList();
        Paint paint = new Paint();
        this.f15542f = paint;
        this.f15543u = new RectF();
        this.f15536A = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0911a.g, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Tb.a.D(context, R.attr.motionDurationLong2, 200);
        Tb.a.E(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC1053a.f16532b);
        this.f15548z = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f15540d = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f15544v = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f15541e = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = K.f26642a;
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
    }

    public final int a(int i7) {
        return i7 == 2 ? Math.round(this.f15548z * 0.66f) : this.f15548z;
    }

    public final void b(float f4) {
        ValueAnimator valueAnimator = this.f15537a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = f4 % 360.0f;
        this.f15545w = f10;
        this.f15547y = Math.toRadians(f10 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float a9 = a(this.f15536A);
        float cos = (((float) Math.cos(this.f15547y)) * a9) + width;
        float sin = (a9 * ((float) Math.sin(this.f15547y))) + height;
        float f11 = this.f15540d;
        this.f15543u.set(cos - f11, sin - f11, cos + f11, sin + f11);
        Iterator it = this.f15539c.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((d) it.next());
            if (Math.abs(clockFaceView.f15534U - f10) > 0.001f) {
                clockFaceView.f15534U = f10;
                clockFaceView.n();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f4 = width;
        float a9 = a(this.f15536A);
        float cos = (((float) Math.cos(this.f15547y)) * a9) + f4;
        float f10 = height;
        float sin = (a9 * ((float) Math.sin(this.f15547y))) + f10;
        Paint paint = this.f15542f;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f15540d, paint);
        double sin2 = Math.sin(this.f15547y);
        paint.setStrokeWidth(this.f15544v);
        canvas.drawLine(f4, f10, width + ((int) (Math.cos(this.f15547y) * r12)), height + ((int) (r12 * sin2)), paint);
        canvas.drawCircle(f4, f10, this.f15541e, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        super.onLayout(z8, i7, i10, i11, i12);
        if (this.f15537a.isRunning()) {
            return;
        }
        b(this.f15545w);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z8;
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        float x2 = motionEvent.getX();
        float y10 = motionEvent.getY();
        boolean z11 = false;
        if (actionMasked == 0) {
            this.f15546x = false;
            z8 = true;
            z10 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z10 = this.f15546x;
            if (this.f15538b) {
                this.f15536A = ((float) Math.hypot((double) (x2 - ((float) (getWidth() / 2))), (double) (y10 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + o.d(getContext(), 12) ? 2 : 1;
            }
            z8 = false;
        } else {
            z10 = false;
            z8 = false;
        }
        boolean z12 = this.f15546x;
        int degrees = (int) Math.toDegrees(Math.atan2(y10 - (getHeight() / 2), x2 - (getWidth() / 2)));
        int i7 = degrees + 90;
        if (i7 < 0) {
            i7 = degrees + 450;
        }
        float f4 = i7;
        boolean z13 = this.f15545w != f4;
        if (!z8 || !z13) {
            if (z13 || z10) {
                b(f4);
            }
            this.f15546x = z12 | z11;
            return true;
        }
        z11 = true;
        this.f15546x = z12 | z11;
        return true;
    }
}
