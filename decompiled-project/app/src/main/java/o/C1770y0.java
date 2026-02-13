package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import h.AbstractC1213a;
import java.lang.reflect.Method;
import n.InterfaceC1664B;

/* renamed from: o.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1770y0 implements InterfaceC1664B {

    /* renamed from: O, reason: collision with root package name */
    public static final Method f21623O;

    /* renamed from: P, reason: collision with root package name */
    public static final Method f21624P;

    /* renamed from: B, reason: collision with root package name */
    public B6.g f21626B;

    /* renamed from: C, reason: collision with root package name */
    public View f21627C;

    /* renamed from: D, reason: collision with root package name */
    public AdapterView.OnItemClickListener f21628D;

    /* renamed from: E, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f21629E;

    /* renamed from: J, reason: collision with root package name */
    public final Handler f21634J;
    public Rect L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f21636M;

    /* renamed from: N, reason: collision with root package name */
    public final C1765w f21637N;

    /* renamed from: a, reason: collision with root package name */
    public final Context f21638a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f21639b;

    /* renamed from: c, reason: collision with root package name */
    public C1747m0 f21640c;

    /* renamed from: f, reason: collision with root package name */
    public int f21643f;

    /* renamed from: u, reason: collision with root package name */
    public int f21644u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f21646w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f21647x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f21648y;

    /* renamed from: d, reason: collision with root package name */
    public final int f21641d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f21642e = -2;

    /* renamed from: v, reason: collision with root package name */
    public final int f21645v = 1002;

    /* renamed from: z, reason: collision with root package name */
    public int f21649z = 0;

    /* renamed from: A, reason: collision with root package name */
    public final int f21625A = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: F, reason: collision with root package name */
    public final RunnableC1764v0 f21630F = new RunnableC1764v0(this, 1);

    /* renamed from: G, reason: collision with root package name */
    public final ViewOnTouchListenerC1768x0 f21631G = new ViewOnTouchListenerC1768x0(this);

    /* renamed from: H, reason: collision with root package name */
    public final C1766w0 f21632H = new C1766w0(this);

    /* renamed from: I, reason: collision with root package name */
    public final RunnableC1764v0 f21633I = new RunnableC1764v0(this, 0);

    /* renamed from: K, reason: collision with root package name */
    public final Rect f21635K = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f21623O = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f21624P = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [android.widget.PopupWindow, o.w] */
    public C1770y0(Context context, AttributeSet attributeSet, int i7) {
        int resourceId;
        this.f21638a = context;
        this.f21634J = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1213a.f17577o, i7, 0);
        this.f21643f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f21644u = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f21646w = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, attributeSet, i7, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC1213a.f17581s, i7, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            popupWindow.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        popupWindow.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : Q5.e.x(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f21637N = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    public final int a() {
        return this.f21643f;
    }

    @Override // n.InterfaceC1664B
    public final boolean b() {
        return this.f21637N.isShowing();
    }

    @Override // n.InterfaceC1664B
    public final void c() {
        int i7;
        int paddingBottom;
        C1747m0 c1747m0;
        C1747m0 c1747m02 = this.f21640c;
        C1765w c1765w = this.f21637N;
        Context context = this.f21638a;
        if (c1747m02 == null) {
            C1747m0 q10 = q(context, !this.f21636M);
            this.f21640c = q10;
            q10.setAdapter(this.f21639b);
            this.f21640c.setOnItemClickListener(this.f21628D);
            this.f21640c.setFocusable(true);
            this.f21640c.setFocusableInTouchMode(true);
            this.f21640c.setOnItemSelectedListener(new C1758s0(this));
            this.f21640c.setOnScrollListener(this.f21632H);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f21629E;
            if (onItemSelectedListener != null) {
                this.f21640c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c1765w.setContentView(this.f21640c);
        }
        Drawable background = c1765w.getBackground();
        Rect rect = this.f21635K;
        if (background != null) {
            background.getPadding(rect);
            int i10 = rect.top;
            i7 = rect.bottom + i10;
            if (!this.f21646w) {
                this.f21644u = -i10;
            }
        } else {
            rect.setEmpty();
            i7 = 0;
        }
        int a9 = AbstractC1760t0.a(c1765w, this.f21627C, this.f21644u, c1765w.getInputMethodMode() == 2);
        int i11 = this.f21641d;
        if (i11 == -1) {
            paddingBottom = a9 + i7;
        } else {
            int i12 = this.f21642e;
            int a10 = this.f21640c.a(i12 != -2 ? i12 != -1 ? View.MeasureSpec.makeMeasureSpec(i12, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a9);
            paddingBottom = a10 + (a10 > 0 ? this.f21640c.getPaddingBottom() + this.f21640c.getPaddingTop() + i7 : 0);
        }
        boolean z8 = this.f21637N.getInputMethodMode() == 2;
        c1765w.setWindowLayoutType(this.f21645v);
        if (c1765w.isShowing()) {
            if (this.f21627C.isAttachedToWindow()) {
                int i13 = this.f21642e;
                if (i13 == -1) {
                    i13 = -1;
                } else if (i13 == -2) {
                    i13 = this.f21627C.getWidth();
                }
                if (i11 == -1) {
                    i11 = z8 ? paddingBottom : -1;
                    if (z8) {
                        c1765w.setWidth(this.f21642e == -1 ? -1 : 0);
                        c1765w.setHeight(0);
                    } else {
                        c1765w.setWidth(this.f21642e == -1 ? -1 : 0);
                        c1765w.setHeight(-1);
                    }
                } else if (i11 == -2) {
                    i11 = paddingBottom;
                }
                c1765w.setOutsideTouchable(true);
                View view = this.f21627C;
                int i14 = this.f21643f;
                int i15 = this.f21644u;
                if (i13 < 0) {
                    i13 = -1;
                }
                c1765w.update(view, i14, i15, i13, i11 < 0 ? -1 : i11);
                return;
            }
            return;
        }
        int i16 = this.f21642e;
        if (i16 == -1) {
            i16 = -1;
        } else if (i16 == -2) {
            i16 = this.f21627C.getWidth();
        }
        if (i11 == -1) {
            i11 = -1;
        } else if (i11 == -2) {
            i11 = paddingBottom;
        }
        c1765w.setWidth(i16);
        c1765w.setHeight(i11);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f21623O;
            if (method != null) {
                try {
                    method.invoke(c1765w, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC1762u0.b(c1765w, true);
        }
        c1765w.setOutsideTouchable(true);
        c1765w.setTouchInterceptor(this.f21631G);
        if (this.f21648y) {
            c1765w.setOverlapAnchor(this.f21647x);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f21624P;
            if (method2 != null) {
                try {
                    method2.invoke(c1765w, this.L);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            AbstractC1762u0.a(c1765w, this.L);
        }
        c1765w.showAsDropDown(this.f21627C, this.f21643f, this.f21644u, this.f21649z);
        this.f21640c.setSelection(-1);
        if ((!this.f21636M || this.f21640c.isInTouchMode()) && (c1747m0 = this.f21640c) != null) {
            c1747m0.setListSelectionHidden(true);
            c1747m0.requestLayout();
        }
        if (this.f21636M) {
            return;
        }
        this.f21634J.post(this.f21633I);
    }

    public final Drawable d() {
        return this.f21637N.getBackground();
    }

    @Override // n.InterfaceC1664B
    public final void dismiss() {
        C1765w c1765w = this.f21637N;
        c1765w.dismiss();
        c1765w.setContentView(null);
        this.f21640c = null;
        this.f21634J.removeCallbacks(this.f21630F);
    }

    @Override // n.InterfaceC1664B
    public final C1747m0 e() {
        return this.f21640c;
    }

    public final void h(Drawable drawable) {
        this.f21637N.setBackgroundDrawable(drawable);
    }

    public final void i(int i7) {
        this.f21644u = i7;
        this.f21646w = true;
    }

    public final void k(int i7) {
        this.f21643f = i7;
    }

    public final int m() {
        if (this.f21646w) {
            return this.f21644u;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        B6.g gVar = this.f21626B;
        if (gVar == null) {
            this.f21626B = new B6.g(this, 3);
        } else {
            ListAdapter listAdapter2 = this.f21639b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(gVar);
            }
        }
        this.f21639b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f21626B);
        }
        C1747m0 c1747m0 = this.f21640c;
        if (c1747m0 != null) {
            c1747m0.setAdapter(this.f21639b);
        }
    }

    public C1747m0 q(Context context, boolean z8) {
        return new C1747m0(context, z8);
    }

    public final void r(int i7) {
        Drawable background = this.f21637N.getBackground();
        if (background == null) {
            this.f21642e = i7;
            return;
        }
        Rect rect = this.f21635K;
        background.getPadding(rect);
        this.f21642e = rect.left + rect.right + i7;
    }
}
