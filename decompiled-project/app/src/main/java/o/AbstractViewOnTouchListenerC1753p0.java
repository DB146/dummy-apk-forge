package o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import n.InterfaceC1664B;

/* renamed from: o.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC1753p0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f21564a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21565b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21566c;

    /* renamed from: d, reason: collision with root package name */
    public final View f21567d;

    /* renamed from: e, reason: collision with root package name */
    public RunnableC1751o0 f21568e;

    /* renamed from: f, reason: collision with root package name */
    public RunnableC1751o0 f21569f;

    /* renamed from: u, reason: collision with root package name */
    public boolean f21570u;

    /* renamed from: v, reason: collision with root package name */
    public int f21571v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f21572w = new int[2];

    public AbstractViewOnTouchListenerC1753p0(View view) {
        this.f21567d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f21564a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f21565b = tapTimeout;
        this.f21566c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC1751o0 runnableC1751o0 = this.f21569f;
        View view = this.f21567d;
        if (runnableC1751o0 != null) {
            view.removeCallbacks(runnableC1751o0);
        }
        RunnableC1751o0 runnableC1751o02 = this.f21568e;
        if (runnableC1751o02 != null) {
            view.removeCallbacks(runnableC1751o02);
        }
    }

    public abstract InterfaceC1664B b();

    public abstract boolean c();

    public boolean d() {
        InterfaceC1664B b2 = b();
        if (b2 == null || !b2.b()) {
            return true;
        }
        b2.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z8;
        C1747m0 e2;
        boolean z10 = this.f21570u;
        View view2 = this.f21567d;
        if (z10) {
            InterfaceC1664B b2 = b();
            if (b2 != null && b2.b() && (e2 = b2.e()) != null && e2.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f21572w;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                e2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b10 = e2.b(obtainNoHistory, this.f21571v);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z11 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b10) {
                }
            }
            if (d()) {
                z8 = false;
            }
            z8 = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f21571v);
                            if (findPointerIndex >= 0) {
                                float x2 = motionEvent.getX(findPointerIndex);
                                float y10 = motionEvent.getY(findPointerIndex);
                                float f4 = this.f21564a;
                                float f10 = -f4;
                                if (x2 < f10 || y10 < f10 || x2 >= (view2.getRight() - view2.getLeft()) + f4 || y10 >= (view2.getBottom() - view2.getTop()) + f4) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
                                        z8 = true;
                                        if (z8) {
                                            long uptimeMillis = SystemClock.uptimeMillis();
                                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                                            view2.onTouchEvent(obtain);
                                            obtain.recycle();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    a();
                } else {
                    this.f21571v = motionEvent.getPointerId(0);
                    if (this.f21568e == null) {
                        this.f21568e = new RunnableC1751o0(this, 0);
                    }
                    view2.postDelayed(this.f21568e, this.f21565b);
                    if (this.f21569f == null) {
                        this.f21569f = new RunnableC1751o0(this, 1);
                    }
                    view2.postDelayed(this.f21569f, this.f21566c);
                }
            }
            z8 = false;
            if (z8) {
            }
        }
        this.f21570u = z8;
        return z8 || z10;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f21570u = false;
        this.f21571v = -1;
        RunnableC1751o0 runnableC1751o0 = this.f21568e;
        if (runnableC1751o0 != null) {
            this.f21567d.removeCallbacks(runnableC1751o0);
        }
    }
}
