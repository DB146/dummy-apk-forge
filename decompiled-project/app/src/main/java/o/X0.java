package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.kt.apps.media.xemtv.beta.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class X0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: y, reason: collision with root package name */
    public static X0 f21451y;

    /* renamed from: z, reason: collision with root package name */
    public static X0 f21452z;

    /* renamed from: a, reason: collision with root package name */
    public final View f21453a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f21454b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21455c;

    /* renamed from: d, reason: collision with root package name */
    public final W0 f21456d;

    /* renamed from: e, reason: collision with root package name */
    public final W0 f21457e;

    /* renamed from: f, reason: collision with root package name */
    public int f21458f;

    /* renamed from: u, reason: collision with root package name */
    public int f21459u;

    /* renamed from: v, reason: collision with root package name */
    public Y0 f21460v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f21461w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f21462x;

    /* JADX WARN: Type inference failed for: r0v0, types: [o.W0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [o.W0] */
    public X0(View view, CharSequence charSequence) {
        final int i7 = 0;
        this.f21456d = new Runnable(this) { // from class: o.W0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ X0 f21450b;

            {
                this.f21450b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        this.f21450b.c(false);
                        return;
                    default:
                        this.f21450b.a();
                        return;
                }
            }
        };
        final int i10 = 1;
        this.f21457e = new Runnable(this) { // from class: o.W0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ X0 f21450b;

            {
                this.f21450b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f21450b.c(false);
                        return;
                    default:
                        this.f21450b.a();
                        return;
                }
            }
        };
        this.f21453a = view;
        this.f21454b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = y1.L.f26648a;
        this.f21455c = Build.VERSION.SDK_INT >= 28 ? C1.i.m(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f21462x = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(X0 x02) {
        X0 x03 = f21451y;
        if (x03 != null) {
            x03.f21453a.removeCallbacks(x03.f21456d);
        }
        f21451y = x02;
        if (x02 != null) {
            x02.f21453a.postDelayed(x02.f21456d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        X0 x02 = f21452z;
        View view = this.f21453a;
        if (x02 == this) {
            f21452z = null;
            Y0 y02 = this.f21460v;
            if (y02 != null) {
                View view2 = (View) y02.f21464b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) y02.f21463a).getSystemService("window")).removeView(view2);
                }
                this.f21460v = null;
                this.f21462x = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f21451y == this) {
            b(null);
        }
        view.removeCallbacks(this.f21457e);
    }

    public final void c(boolean z8) {
        int height;
        int i7;
        String str;
        int i10;
        String str2;
        long longPressTimeout;
        long j;
        long j10;
        View view = this.f21453a;
        if (view.isAttachedToWindow()) {
            b(null);
            X0 x02 = f21452z;
            if (x02 != null) {
                x02.a();
            }
            f21452z = this;
            this.f21461w = z8;
            Y0 y02 = new Y0(view.getContext());
            this.f21460v = y02;
            int i11 = this.f21458f;
            int i12 = this.f21459u;
            boolean z10 = this.f21461w;
            View view2 = (View) y02.f21464b;
            ViewParent parent = view2.getParent();
            Context context = (Context) y02.f21463a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            ((TextView) y02.f21465c).setText(this.f21454b);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) y02.f21466d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i11 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i12 + dimensionPixelOffset2;
                i7 = i12 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i7 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z10 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                str2 = "window";
            } else {
                Rect rect = (Rect) y02.f21467e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    str = "window";
                    i10 = 0;
                } else {
                    Resources resources = context.getResources();
                    str = "window";
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i10 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = (int[]) y02.g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = (int[]) y02.f21468f;
                view.getLocationOnScreen(iArr2);
                int i13 = iArr2[i10] - iArr[i10];
                iArr2[i10] = i13;
                iArr2[1] = iArr2[1] - iArr[1];
                layoutParams.x = (i13 + i11) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, i10);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i14 = iArr2[1];
                int i15 = ((i7 + i14) - dimensionPixelOffset3) - measuredHeight;
                int i16 = i14 + height + dimensionPixelOffset3;
                if (z10) {
                    if (i15 >= 0) {
                        layoutParams.y = i15;
                    } else {
                        layoutParams.y = i16;
                    }
                } else if (measuredHeight + i16 <= rect.height()) {
                    layoutParams.y = i16;
                } else {
                    layoutParams.y = i15;
                }
                str2 = str;
            }
            ((WindowManager) context.getSystemService(str2)).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f21461w) {
                j10 = 2500;
            } else {
                WeakHashMap weakHashMap = y1.K.f26642a;
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j10 = j - longPressTimeout;
            }
            W0 w02 = this.f21457e;
            view.removeCallbacks(w02);
            view.postDelayed(w02, j10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f21459u) <= r2) goto L29;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f21460v != null && this.f21461w) {
            return false;
        }
        View view2 = this.f21453a;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.f21462x = true;
                a();
            }
        } else if (view2.isEnabled() && this.f21460v == null) {
            int x2 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (!this.f21462x) {
                int abs = Math.abs(x2 - this.f21458f);
                int i7 = this.f21455c;
                if (abs <= i7) {
                }
            }
            this.f21458f = x2;
            this.f21459u = y10;
            this.f21462x = false;
            b(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f21458f = view.getWidth() / 2;
        this.f21459u = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}
