package l5;

import A9.P2;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import n5.AbstractC1705a;

/* renamed from: l5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1490d extends View implements N {

    /* renamed from: A, reason: collision with root package name */
    public final int f19422A;

    /* renamed from: B, reason: collision with root package name */
    public final int f19423B;

    /* renamed from: C, reason: collision with root package name */
    public final int f19424C;

    /* renamed from: D, reason: collision with root package name */
    public final int f19425D;

    /* renamed from: E, reason: collision with root package name */
    public final int f19426E;

    /* renamed from: F, reason: collision with root package name */
    public final int f19427F;

    /* renamed from: G, reason: collision with root package name */
    public final int f19428G;

    /* renamed from: H, reason: collision with root package name */
    public final int f19429H;

    /* renamed from: I, reason: collision with root package name */
    public final StringBuilder f19430I;

    /* renamed from: J, reason: collision with root package name */
    public final Formatter f19431J;

    /* renamed from: K, reason: collision with root package name */
    public final k1.a f19432K;
    public final CopyOnWriteArraySet L;

    /* renamed from: M, reason: collision with root package name */
    public final Point f19433M;

    /* renamed from: N, reason: collision with root package name */
    public final float f19434N;

    /* renamed from: O, reason: collision with root package name */
    public int f19435O;

    /* renamed from: P, reason: collision with root package name */
    public long f19436P;

    /* renamed from: Q, reason: collision with root package name */
    public int f19437Q;

    /* renamed from: R, reason: collision with root package name */
    public Rect f19438R;

    /* renamed from: S, reason: collision with root package name */
    public final ValueAnimator f19439S;

    /* renamed from: T, reason: collision with root package name */
    public float f19440T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f19441U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f19442V;

    /* renamed from: W, reason: collision with root package name */
    public long f19443W;

    /* renamed from: a, reason: collision with root package name */
    public final Rect f19444a;

    /* renamed from: a0, reason: collision with root package name */
    public long f19445a0;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f19446b;

    /* renamed from: b0, reason: collision with root package name */
    public long f19447b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f19448c;

    /* renamed from: c0, reason: collision with root package name */
    public long f19449c0;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f19450d;

    /* renamed from: d0, reason: collision with root package name */
    public int f19451d0;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f19452e;

    /* renamed from: e0, reason: collision with root package name */
    public long[] f19453e0;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f19454f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean[] f19455f0;

    /* renamed from: u, reason: collision with root package name */
    public final Paint f19456u;

    /* renamed from: v, reason: collision with root package name */
    public final Paint f19457v;

    /* renamed from: w, reason: collision with root package name */
    public final Paint f19458w;

    /* renamed from: x, reason: collision with root package name */
    public final Paint f19459x;

    /* renamed from: y, reason: collision with root package name */
    public final Drawable f19460y;

    /* renamed from: z, reason: collision with root package name */
    public final int f19461z;

    public C1490d(Context context, AttributeSet attributeSet, int i7) {
        super(context, null, 0);
        this.f19444a = new Rect();
        this.f19446b = new Rect();
        this.f19448c = new Rect();
        this.f19450d = new Rect();
        Paint paint = new Paint();
        this.f19452e = paint;
        Paint paint2 = new Paint();
        this.f19454f = paint2;
        Paint paint3 = new Paint();
        this.f19456u = paint3;
        Paint paint4 = new Paint();
        this.f19457v = paint4;
        Paint paint5 = new Paint();
        this.f19458w = paint5;
        Paint paint6 = new Paint();
        this.f19459x = paint6;
        paint6.setAntiAlias(true);
        this.L = new CopyOnWriteArraySet();
        this.f19433M = new Point();
        float f4 = context.getResources().getDisplayMetrics().density;
        this.f19434N = f4;
        this.f19429H = a(-50, f4);
        int a9 = a(4, f4);
        int a10 = a(26, f4);
        int a11 = a(4, f4);
        int a12 = a(12, f4);
        int a13 = a(0, f4);
        int a14 = a(16, f4);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC1498l.f19520b, 0, i7);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(10);
                this.f19460y = drawable;
                if (drawable != null) {
                    int i10 = n5.D.f21141a;
                    if (i10 >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i10 < 23 || !drawable.setLayoutDirection(layoutDirection)) {
                        }
                    }
                    a10 = Math.max(drawable.getMinimumHeight(), a10);
                }
                this.f19461z = obtainStyledAttributes.getDimensionPixelSize(3, a9);
                this.f19422A = obtainStyledAttributes.getDimensionPixelSize(12, a10);
                this.f19423B = obtainStyledAttributes.getInt(2, 0);
                this.f19424C = obtainStyledAttributes.getDimensionPixelSize(1, a11);
                this.f19425D = obtainStyledAttributes.getDimensionPixelSize(11, a12);
                this.f19426E = obtainStyledAttributes.getDimensionPixelSize(8, a13);
                this.f19427F = obtainStyledAttributes.getDimensionPixelSize(9, a14);
                int i11 = obtainStyledAttributes.getInt(6, -1);
                int i12 = obtainStyledAttributes.getInt(7, -1);
                int i13 = obtainStyledAttributes.getInt(4, -855638017);
                int i14 = obtainStyledAttributes.getInt(13, 872415231);
                int i15 = obtainStyledAttributes.getInt(0, -1291845888);
                int i16 = obtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i11);
                paint6.setColor(i12);
                paint2.setColor(i13);
                paint3.setColor(i14);
                paint4.setColor(i15);
                paint5.setColor(i16);
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.f19461z = a9;
            this.f19422A = a10;
            this.f19423B = 0;
            this.f19424C = a11;
            this.f19425D = a12;
            this.f19426E = a13;
            this.f19427F = a14;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f19460y = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f19430I = sb2;
        this.f19431J = new Formatter(sb2, Locale.getDefault());
        this.f19432K = new k1.a(this, 2);
        Drawable drawable2 = this.f19460y;
        if (drawable2 != null) {
            this.f19428G = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f19428G = (Math.max(this.f19426E, Math.max(this.f19425D, this.f19427F)) + 1) / 2;
        }
        this.f19440T = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f19439S = valueAnimator;
        valueAnimator.addUpdateListener(new P2(this, 2));
        this.f19445a0 = -9223372036854775807L;
        this.f19436P = -9223372036854775807L;
        this.f19435O = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static int a(int i7, float f4) {
        return (int) ((i7 * f4) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.f19436P;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j10 = this.f19445a0;
        if (j10 == -9223372036854775807L) {
            return 0L;
        }
        return j10 / this.f19435O;
    }

    private String getProgressText() {
        return n5.D.B(this.f19430I, this.f19431J, this.f19447b0);
    }

    private long getScrubberPosition() {
        if (this.f19446b.width() <= 0 || this.f19445a0 == -9223372036854775807L) {
            return 0L;
        }
        return (this.f19450d.width() * this.f19445a0) / r0.width();
    }

    public final boolean b(long j) {
        long j10 = this.f19445a0;
        if (j10 <= 0) {
            return false;
        }
        long j11 = this.f19442V ? this.f19443W : this.f19447b0;
        long j12 = n5.D.j(j11 + j, 0L, j10);
        if (j12 == j11) {
            return false;
        }
        if (this.f19442V) {
            f(j12);
        } else {
            c(j12);
        }
        e();
        return true;
    }

    public final void c(long j) {
        this.f19443W = j;
        this.f19442V = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.L.iterator();
        while (it.hasNext()) {
            ((M) it.next()).d(j);
        }
    }

    public final void d(boolean z8) {
        removeCallbacks(this.f19432K);
        this.f19442V = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.L.iterator();
        while (it.hasNext()) {
            ((M) it.next()).e(this.f19443W, z8);
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f19460y;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e() {
        Rect rect = this.f19448c;
        Rect rect2 = this.f19446b;
        rect.set(rect2);
        Rect rect3 = this.f19450d;
        rect3.set(rect2);
        long j = this.f19442V ? this.f19443W : this.f19447b0;
        if (this.f19445a0 > 0) {
            rect.right = Math.min(rect2.left + ((int) ((rect2.width() * this.f19449c0) / this.f19445a0)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((rect2.width() * j) / this.f19445a0)), rect2.right);
        } else {
            int i7 = rect2.left;
            rect.right = i7;
            rect3.right = i7;
        }
        invalidate(this.f19444a);
    }

    public final void f(long j) {
        if (this.f19443W == j) {
            return;
        }
        this.f19443W = j;
        Iterator it = this.L.iterator();
        while (it.hasNext()) {
            ((M) it.next()).f(j);
        }
    }

    public long getPreferredUpdateDelay() {
        int width = (int) (this.f19446b.width() / this.f19434N);
        if (width != 0) {
            long j = this.f19445a0;
            if (j != 0 && j != -9223372036854775807L) {
                return j / width;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f19460y;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Rect rect = this.f19446b;
        int height = rect.height();
        int centerY = rect.centerY() - (height / 2);
        int i7 = centerY + height;
        long j = this.f19445a0;
        Paint paint = this.f19456u;
        Rect rect2 = this.f19450d;
        if (j <= 0) {
            canvas.drawRect(rect.left, centerY, rect.right, i7, paint);
        } else {
            Rect rect3 = this.f19448c;
            int i10 = rect3.left;
            int i11 = rect3.right;
            int max = Math.max(Math.max(rect.left, i11), rect2.right);
            int i12 = rect.right;
            if (max < i12) {
                canvas.drawRect(max, centerY, i12, i7, paint);
            }
            int max2 = Math.max(i10, rect2.right);
            if (i11 > max2) {
                canvas.drawRect(max2, centerY, i11, i7, this.f19454f);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, centerY, rect2.right, i7, this.f19452e);
            }
            if (this.f19451d0 != 0) {
                long[] jArr = this.f19453e0;
                jArr.getClass();
                boolean[] zArr = this.f19455f0;
                zArr.getClass();
                int i13 = this.f19424C;
                int i14 = i13 / 2;
                int i15 = 0;
                int i16 = 0;
                while (i16 < this.f19451d0) {
                    canvas.drawRect(Math.min(rect.width() - i13, Math.max(i15, ((int) ((rect.width() * n5.D.j(jArr[i16], 0L, this.f19445a0)) / this.f19445a0)) - i14)) + rect.left, centerY, r1 + i13, i7, zArr[i16] ? this.f19458w : this.f19457v);
                    i16++;
                    i15 = i15;
                    i13 = i13;
                }
            }
        }
        if (this.f19445a0 > 0) {
            int i17 = n5.D.i(rect2.right, rect2.left, rect.right);
            int centerY2 = rect2.centerY();
            Drawable drawable = this.f19460y;
            if (drawable == null) {
                canvas.drawCircle(i17, centerY2, (int) ((((this.f19442V || isFocused()) ? this.f19427F : isEnabled() ? this.f19425D : this.f19426E) * this.f19440T) / 2.0f), this.f19459x);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f19440T)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.f19440T)) / 2;
                drawable.setBounds(i17 - intrinsicWidth, centerY2 - intrinsicHeight, i17 + intrinsicWidth, centerY2 + intrinsicHeight);
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z8, int i7, Rect rect) {
        super.onFocusChanged(z8, i7, rect);
        if (!this.f19442V || z8) {
            return;
        }
        d(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f19445a0 <= 0) {
            return;
        }
        if (n5.D.f21141a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i7 != 66) {
                switch (i7) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (b(positionIncrement)) {
                            k1.a aVar = this.f19432K;
                            removeCallbacks(aVar);
                            postDelayed(aVar, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (b(positionIncrement)) {
                        }
                        break;
                }
            }
            if (this.f19442V) {
                d(false);
                return true;
            }
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override // android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        Rect rect;
        int i15 = i11 - i7;
        int i16 = i12 - i10;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i15 - getPaddingRight();
        int i17 = this.f19441U ? 0 : this.f19428G;
        int i18 = this.f19423B;
        int i19 = this.f19461z;
        int i20 = this.f19422A;
        if (i18 == 1) {
            i13 = (i16 - getPaddingBottom()) - i20;
            i14 = ((i16 - getPaddingBottom()) - i19) - Math.max(i17 - (i19 / 2), 0);
        } else {
            i13 = (i16 - i20) / 2;
            i14 = (i16 - i19) / 2;
        }
        Rect rect2 = this.f19444a;
        rect2.set(paddingLeft, i13, paddingRight, i20 + i13);
        this.f19446b.set(rect2.left + i17, i14, rect2.right - i17, i19 + i14);
        if (n5.D.f21141a >= 29 && ((rect = this.f19438R) == null || rect.width() != i15 || this.f19438R.height() != i16)) {
            Rect rect3 = new Rect(0, 0, i15, i16);
            this.f19438R = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        e();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int i11 = this.f19422A;
        if (mode == 0) {
            size = i11;
        } else if (mode != 1073741824) {
            size = Math.min(i11, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i7), size);
        Drawable drawable = this.f19460y;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        Drawable drawable = this.f19460y;
        if (drawable == null || n5.D.f21141a < 23 || !drawable.setLayoutDirection(i7)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r3 != 3) goto L34;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f19445a0 > 0) {
            Point point = this.f19433M;
            point.set((int) motionEvent.getX(), (int) motionEvent.getY());
            int i7 = point.x;
            int i10 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.f19450d;
            Rect rect2 = this.f19446b;
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        if (this.f19442V) {
                            if (i10 < this.f19429H) {
                                int i11 = this.f19437Q;
                                rect.right = n5.D.i(((i7 - i11) / 3) + i11, rect2.left, rect2.right);
                            } else {
                                this.f19437Q = i7;
                                rect.right = n5.D.i(i7, rect2.left, rect2.right);
                            }
                            f(getScrubberPosition());
                            e();
                            invalidate();
                            return true;
                        }
                    }
                }
                if (this.f19442V) {
                    d(motionEvent.getAction() == 3);
                    return true;
                }
            } else {
                int i12 = i7;
                if (this.f19444a.contains(i12, i10)) {
                    rect.right = n5.D.i(i12, rect2.left, rect2.right);
                    c(getScrubberPosition());
                    e();
                    invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (super.performAccessibilityAction(i7, bundle)) {
            return true;
        }
        if (this.f19445a0 <= 0) {
            return false;
        }
        if (i7 == 8192) {
            if (b(-getPositionIncrement())) {
                d(false);
            }
        } else {
            if (i7 != 4096) {
                return false;
            }
            if (b(getPositionIncrement())) {
                d(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i7) {
        this.f19457v.setColor(i7);
        invalidate(this.f19444a);
    }

    public void setBufferedColor(int i7) {
        this.f19454f.setColor(i7);
        invalidate(this.f19444a);
    }

    public void setBufferedPosition(long j) {
        if (this.f19449c0 == j) {
            return;
        }
        this.f19449c0 = j;
        e();
    }

    public void setDuration(long j) {
        if (this.f19445a0 == j) {
            return;
        }
        this.f19445a0 = j;
        if (this.f19442V && j == -9223372036854775807L) {
            d(true);
        }
        e();
    }

    @Override // android.view.View
    public void setEnabled(boolean z8) {
        super.setEnabled(z8);
        if (!this.f19442V || z8) {
            return;
        }
        d(true);
    }

    public void setKeyCountIncrement(int i7) {
        AbstractC1705a.h(i7 > 0);
        this.f19435O = i7;
        this.f19436P = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        AbstractC1705a.h(j > 0);
        this.f19435O = -1;
        this.f19436P = j;
    }

    public void setPlayedAdMarkerColor(int i7) {
        this.f19458w.setColor(i7);
        invalidate(this.f19444a);
    }

    public void setPlayedColor(int i7) {
        this.f19452e.setColor(i7);
        invalidate(this.f19444a);
    }

    public void setPosition(long j) {
        if (this.f19447b0 == j) {
            return;
        }
        this.f19447b0 = j;
        setContentDescription(getProgressText());
        e();
    }

    public void setScrubberColor(int i7) {
        this.f19459x.setColor(i7);
        invalidate(this.f19444a);
    }

    public void setUnplayedColor(int i7) {
        this.f19456u.setColor(i7);
        invalidate(this.f19444a);
    }
}
