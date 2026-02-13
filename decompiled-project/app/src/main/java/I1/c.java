package I1;

import B0.C;
import H2.I;
import Z9.x;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Arrays;
import java.util.WeakHashMap;
import y1.K;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: v, reason: collision with root package name */
    public static final I f4981v = new I(1);

    /* renamed from: a, reason: collision with root package name */
    public int f4982a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4983b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f4985d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f4986e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f4987f;
    public float[] g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f4988h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f4989i;
    public int[] j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f4990l;

    /* renamed from: m, reason: collision with root package name */
    public final float f4991m;

    /* renamed from: n, reason: collision with root package name */
    public final float f4992n;

    /* renamed from: o, reason: collision with root package name */
    public final int f4993o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f4994p;

    /* renamed from: q, reason: collision with root package name */
    public final x f4995q;

    /* renamed from: r, reason: collision with root package name */
    public View f4996r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4997s;

    /* renamed from: t, reason: collision with root package name */
    public final CoordinatorLayout f4998t;

    /* renamed from: c, reason: collision with root package name */
    public int f4984c = -1;

    /* renamed from: u, reason: collision with root package name */
    public final C f4999u = new C(this, 7);

    public c(Context context, CoordinatorLayout coordinatorLayout, x xVar) {
        if (coordinatorLayout == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (xVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f4998t = coordinatorLayout;
        this.f4995q = xVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4993o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f4983b = viewConfiguration.getScaledTouchSlop();
        this.f4991m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f4992n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4994p = new OverScroller(context, f4981v);
    }

    public final void a() {
        this.f4984c = -1;
        float[] fArr = this.f4985d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f4986e, 0.0f);
            Arrays.fill(this.f4987f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.f4988h, 0);
            Arrays.fill(this.f4989i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
        VelocityTracker velocityTracker = this.f4990l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4990l = null;
        }
    }

    public final void b(View view, int i7) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f4998t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f4996r = view;
        this.f4984c = i7;
        this.f4995q.I(view, i7);
        n(1);
    }

    public final boolean c(View view, float f4, float f10) {
        if (view == null) {
            return false;
        }
        x xVar = this.f4995q;
        boolean z8 = xVar.x(view) > 0;
        boolean z10 = xVar.y() > 0;
        if (!z8 || !z10) {
            return z8 ? Math.abs(f4) > ((float) this.f4983b) : z10 && Math.abs(f10) > ((float) this.f4983b);
        }
        float f11 = (f10 * f10) + (f4 * f4);
        int i7 = this.f4983b;
        return f11 > ((float) (i7 * i7));
    }

    public final void d(int i7) {
        float[] fArr = this.f4985d;
        if (fArr != null) {
            int i10 = this.k;
            int i11 = 1 << i7;
            if ((i10 & i11) != 0) {
                fArr[i7] = 0.0f;
                this.f4986e[i7] = 0.0f;
                this.f4987f[i7] = 0.0f;
                this.g[i7] = 0.0f;
                this.f4988h[i7] = 0;
                this.f4989i[i7] = 0;
                this.j[i7] = 0;
                this.k = (~i11) & i10;
            }
        }
    }

    public final int e(int i7, int i10, int i11) {
        if (i7 == 0) {
            return 0;
        }
        float width = this.f4998t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i7) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i10);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i7) / i11) + 1.0f) * 256.0f), 600);
    }

    public final boolean f() {
        if (this.f4982a == 2) {
            OverScroller overScroller = this.f4994p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f4996r.getLeft();
            int top = currY - this.f4996r.getTop();
            if (left != 0) {
                View view = this.f4996r;
                WeakHashMap weakHashMap = K.f26642a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f4996r;
                WeakHashMap weakHashMap2 = K.f26642a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f4995q.K(this.f4996r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f4998t.post(this.f4999u);
            }
        }
        return this.f4982a == 2;
    }

    public final View g(int i7, int i10) {
        CoordinatorLayout coordinatorLayout = this.f4998t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f4995q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i7 >= childAt.getLeft() && i7 < childAt.getRight() && i10 >= childAt.getTop() && i10 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i7, int i10, int i11, int i12) {
        float f4;
        float f10;
        float f11;
        float f12;
        int left = this.f4996r.getLeft();
        int top = this.f4996r.getTop();
        int i13 = i7 - left;
        int i14 = i10 - top;
        OverScroller overScroller = this.f4994p;
        int i15 = 0;
        if (i13 == 0 && i14 == 0) {
            overScroller.abortAnimation();
            n(0);
            return false;
        }
        View view = this.f4996r;
        int i16 = (int) this.f4992n;
        int i17 = (int) this.f4991m;
        int abs = Math.abs(i11);
        if (abs < i16) {
            i11 = 0;
        } else if (abs > i17) {
            i11 = i11 > 0 ? i17 : -i17;
        }
        int abs2 = Math.abs(i12);
        if (abs2 >= i16) {
            if (abs2 > i17) {
                if (i12 > 0) {
                    i12 = i17;
                } else {
                    i15 = -i17;
                }
            }
            int abs3 = Math.abs(i13);
            int abs4 = Math.abs(i14);
            int abs5 = Math.abs(i11);
            int abs6 = Math.abs(i12);
            int i18 = abs5 + abs6;
            int i19 = abs3 + abs4;
            if (i11 == 0) {
                f4 = abs5;
                f10 = i18;
            } else {
                f4 = abs3;
                f10 = i19;
            }
            float f13 = f4 / f10;
            if (i12 == 0) {
                f11 = abs6;
                f12 = i18;
            } else {
                f11 = abs4;
                f12 = i19;
            }
            float f14 = f11 / f12;
            x xVar = this.f4995q;
            overScroller.startScroll(left, top, i13, i14, (int) ((e(i14, i12, xVar.y()) * f14) + (e(i13, i11, xVar.x(view)) * f13)));
            n(2);
            return true;
        }
        i12 = i15;
        int abs32 = Math.abs(i13);
        int abs42 = Math.abs(i14);
        int abs52 = Math.abs(i11);
        int abs62 = Math.abs(i12);
        int i182 = abs52 + abs62;
        int i192 = abs32 + abs42;
        if (i11 == 0) {
        }
        float f132 = f4 / f10;
        if (i12 == 0) {
        }
        float f142 = f11 / f12;
        x xVar2 = this.f4995q;
        overScroller.startScroll(left, top, i13, i14, (int) ((e(i14, i12, xVar2.y()) * f142) + (e(i13, i11, xVar2.x(view)) * f132)));
        n(2);
        return true;
    }

    public final boolean i(int i7) {
        if ((this.k & (1 << i7)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i7 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void j(MotionEvent motionEvent) {
        int i7;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f4990l == null) {
            this.f4990l = VelocityTracker.obtain();
        }
        this.f4990l.addMovement(motionEvent);
        int i10 = 0;
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View g = g((int) x2, (int) y10);
            l(pointerId, x2, y10);
            q(g, pointerId);
            int i11 = this.f4988h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f4982a == 1) {
                k();
            }
            a();
            return;
        }
        x xVar = this.f4995q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f4982a == 1) {
                    this.f4997s = true;
                    xVar.L(this.f4996r, 0.0f, 0.0f);
                    this.f4997s = false;
                    if (this.f4982a == 1) {
                        n(0);
                    }
                }
                a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x10 = motionEvent.getX(actionIndex);
                float y11 = motionEvent.getY(actionIndex);
                l(pointerId2, x10, y11);
                if (this.f4982a == 0) {
                    q(g((int) x10, (int) y11), pointerId2);
                    int i12 = this.f4988h[pointerId2];
                    return;
                }
                int i13 = (int) x10;
                int i14 = (int) y11;
                View view = this.f4996r;
                if (view != null) {
                    i10 = (i13 < view.getLeft() || i13 >= view.getRight() || i14 < view.getTop() || i14 >= view.getBottom()) ? 0 : 1;
                }
                if (i10 != 0) {
                    q(this.f4996r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f4982a == 1 && pointerId3 == this.f4984c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i10 >= pointerCount) {
                        i7 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i10);
                    if (pointerId4 != this.f4984c) {
                        View g2 = g((int) motionEvent.getX(i10), (int) motionEvent.getY(i10));
                        View view2 = this.f4996r;
                        if (g2 == view2 && q(view2, pointerId4)) {
                            i7 = this.f4984c;
                            break;
                        }
                    }
                    i10++;
                }
                if (i7 == -1) {
                    k();
                }
            }
            d(pointerId3);
            return;
        }
        if (this.f4982a == 1) {
            if (i(this.f4984c)) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f4984c);
                float x11 = motionEvent.getX(findPointerIndex);
                float y12 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.f4987f;
                int i15 = this.f4984c;
                int i16 = (int) (x11 - fArr[i15]);
                int i17 = (int) (y12 - this.g[i15]);
                int left = this.f4996r.getLeft() + i16;
                int top = this.f4996r.getTop() + i17;
                int left2 = this.f4996r.getLeft();
                int top2 = this.f4996r.getTop();
                if (i16 != 0) {
                    left = xVar.g(this.f4996r, left);
                    WeakHashMap weakHashMap = K.f26642a;
                    this.f4996r.offsetLeftAndRight(left - left2);
                }
                if (i17 != 0) {
                    top = xVar.h(this.f4996r, top);
                    WeakHashMap weakHashMap2 = K.f26642a;
                    this.f4996r.offsetTopAndBottom(top - top2);
                }
                if (i16 != 0 || i17 != 0) {
                    xVar.K(this.f4996r, left, top);
                }
                m(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i10 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i10);
            if (i(pointerId5)) {
                float x12 = motionEvent.getX(i10);
                float y13 = motionEvent.getY(i10);
                float f4 = x12 - this.f4985d[pointerId5];
                float f10 = y13 - this.f4986e[pointerId5];
                Math.abs(f4);
                Math.abs(f10);
                int i18 = this.f4988h[pointerId5];
                Math.abs(f10);
                Math.abs(f4);
                int i19 = this.f4988h[pointerId5];
                Math.abs(f4);
                Math.abs(f10);
                int i20 = this.f4988h[pointerId5];
                Math.abs(f10);
                Math.abs(f4);
                int i21 = this.f4988h[pointerId5];
                if (this.f4982a != 1) {
                    View g10 = g((int) x12, (int) y13);
                    if (c(g10, f4, f10) && q(g10, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i10++;
        }
        m(motionEvent);
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f4990l;
        float f4 = this.f4991m;
        velocityTracker.computeCurrentVelocity(1000, f4);
        float xVelocity = this.f4990l.getXVelocity(this.f4984c);
        float f10 = this.f4992n;
        float abs = Math.abs(xVelocity);
        float f11 = 0.0f;
        if (abs < f10) {
            xVelocity = 0.0f;
        } else if (abs > f4) {
            xVelocity = xVelocity > 0.0f ? f4 : -f4;
        }
        float yVelocity = this.f4990l.getYVelocity(this.f4984c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f10) {
            if (abs2 > f4) {
                if (yVelocity <= 0.0f) {
                    f4 = -f4;
                }
                f11 = f4;
            } else {
                f11 = yVelocity;
            }
        }
        this.f4997s = true;
        this.f4995q.L(this.f4996r, xVelocity, f11);
        this.f4997s = false;
        if (this.f4982a == 1) {
            n(0);
        }
    }

    public final void l(int i7, float f4, float f10) {
        float[] fArr = this.f4985d;
        if (fArr == null || fArr.length <= i7) {
            int i10 = i7 + 1;
            float[] fArr2 = new float[i10];
            float[] fArr3 = new float[i10];
            float[] fArr4 = new float[i10];
            float[] fArr5 = new float[i10];
            int[] iArr = new int[i10];
            int[] iArr2 = new int[i10];
            int[] iArr3 = new int[i10];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f4986e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f4987f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f4988h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f4989i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f4985d = fArr2;
            this.f4986e = fArr3;
            this.f4987f = fArr4;
            this.g = fArr5;
            this.f4988h = iArr;
            this.f4989i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.f4985d;
        this.f4987f[i7] = f4;
        fArr9[i7] = f4;
        float[] fArr10 = this.f4986e;
        this.g[i7] = f10;
        fArr10[i7] = f10;
        int[] iArr7 = this.f4988h;
        int i11 = (int) f4;
        int i12 = (int) f10;
        CoordinatorLayout coordinatorLayout = this.f4998t;
        int left = coordinatorLayout.getLeft();
        int i13 = this.f4993o;
        int i14 = i11 < left + i13 ? 1 : 0;
        if (i12 < coordinatorLayout.getTop() + i13) {
            i14 |= 4;
        }
        if (i11 > coordinatorLayout.getRight() - i13) {
            i14 |= 2;
        }
        if (i12 > coordinatorLayout.getBottom() - i13) {
            i14 |= 8;
        }
        iArr7[i7] = i14;
        this.k = (1 << i7) | this.k;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i7 = 0; i7 < pointerCount; i7++) {
            int pointerId = motionEvent.getPointerId(i7);
            if (i(pointerId)) {
                float x2 = motionEvent.getX(i7);
                float y10 = motionEvent.getY(i7);
                this.f4987f[pointerId] = x2;
                this.g[pointerId] = y10;
            }
        }
    }

    public final void n(int i7) {
        this.f4998t.removeCallbacks(this.f4999u);
        if (this.f4982a != i7) {
            this.f4982a = i7;
            this.f4995q.J(i7);
            if (this.f4982a == 0) {
                this.f4996r = null;
            }
        }
    }

    public final boolean o(int i7, int i10) {
        if (this.f4997s) {
            return h(i7, i10, (int) this.f4990l.getXVelocity(this.f4984c), (int) this.f4990l.getYVelocity(this.f4984c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cd, code lost:
    
        if (r12 != r11) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(MotionEvent motionEvent) {
        View g;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f4990l == null) {
            this.f4990l = VelocityTracker.obtain();
        }
        this.f4990l.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x2 = motionEvent.getX(actionIndex);
                            float y10 = motionEvent.getY(actionIndex);
                            l(pointerId, x2, y10);
                            int i7 = this.f4982a;
                            if (i7 == 0) {
                                int i10 = this.f4988h[pointerId];
                            } else if (i7 == 2 && (g = g((int) x2, (int) y10)) == this.f4996r) {
                                q(g, pointerId);
                            }
                        } else if (actionMasked == 6) {
                            d(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.f4985d != null && this.f4986e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i11 = 0; i11 < pointerCount; i11++) {
                        int pointerId2 = motionEvent.getPointerId(i11);
                        if (i(pointerId2)) {
                            float x10 = motionEvent.getX(i11);
                            float y11 = motionEvent.getY(i11);
                            float f4 = x10 - this.f4985d[pointerId2];
                            float f10 = y11 - this.f4986e[pointerId2];
                            View g2 = g((int) x10, (int) y11);
                            boolean z8 = g2 != null && c(g2, f4, f10);
                            if (z8) {
                                int left = g2.getLeft();
                                x xVar = this.f4995q;
                                int g10 = xVar.g(g2, ((int) f4) + left);
                                int top = g2.getTop();
                                int h10 = xVar.h(g2, ((int) f10) + top);
                                int x11 = xVar.x(g2);
                                int y12 = xVar.y();
                                if (x11 != 0) {
                                    if (x11 > 0) {
                                    }
                                }
                                if (y12 == 0) {
                                    break;
                                }
                                if (y12 > 0 && h10 == top) {
                                    break;
                                }
                            }
                            Math.abs(f4);
                            Math.abs(f10);
                            int i12 = this.f4988h[pointerId2];
                            Math.abs(f10);
                            Math.abs(f4);
                            int i13 = this.f4988h[pointerId2];
                            Math.abs(f4);
                            Math.abs(f10);
                            int i14 = this.f4988h[pointerId2];
                            Math.abs(f10);
                            Math.abs(f4);
                            int i15 = this.f4988h[pointerId2];
                            if (this.f4982a == 1) {
                                break;
                            }
                            if (z8 && q(g2, pointerId2)) {
                                break;
                            }
                        }
                    }
                    m(motionEvent);
                }
            }
            a();
        } else {
            float x12 = motionEvent.getX();
            float y13 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            l(pointerId3, x12, y13);
            View g11 = g((int) x12, (int) y13);
            if (g11 == this.f4996r && this.f4982a == 2) {
                q(g11, pointerId3);
            }
            int i16 = this.f4988h[pointerId3];
        }
        return this.f4982a == 1;
    }

    public final boolean q(View view, int i7) {
        if (view == this.f4996r && this.f4984c == i7) {
            return true;
        }
        if (view == null || !this.f4995q.W(view, i7)) {
            return false;
        }
        this.f4984c = i7;
        b(view, i7);
        return true;
    }
}
