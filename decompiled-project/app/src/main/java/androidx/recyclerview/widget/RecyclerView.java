package androidx.recyclerview.widget;

import A3.c;
import B0.b1;
import B4.j;
import D0.d;
import D5.i;
import H2.B;
import H2.C0287a;
import H2.C0288b;
import H2.C0296j;
import H2.C0304s;
import H2.C0305t;
import H2.F;
import H2.G;
import H2.H;
import H2.I;
import H2.J;
import H2.K;
import H2.M;
import H2.N;
import H2.O;
import H2.P;
import H2.Q;
import H2.RunnableC0307v;
import H2.T;
import H2.U;
import H2.V;
import H2.W;
import H2.X;
import H2.Y;
import H2.Z;
import H2.a0;
import H2.b0;
import H2.d0;
import H2.e0;
import H2.f0;
import H2.g0;
import H2.h0;
import H2.i0;
import H2.k0;
import H2.t0;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.support.v4.media.session.b;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.google.android.gms.common.api.f;
import g3.C1191j;
import h3.o;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import q3.l;
import u.r;
import u1.AbstractC2096f;
import y1.AbstractC2352B;
import y1.C2363k;
import y1.E;
import y1.L;
import y7.u0;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: O0, reason: collision with root package name */
    public static boolean f13602O0 = false;

    /* renamed from: P0, reason: collision with root package name */
    public static boolean f13603P0 = false;

    /* renamed from: Q0, reason: collision with root package name */
    public static final int[] f13604Q0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: R0, reason: collision with root package name */
    public static final float f13605R0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: S0, reason: collision with root package name */
    public static final boolean f13606S0 = true;

    /* renamed from: T0, reason: collision with root package name */
    public static final boolean f13607T0 = true;

    /* renamed from: U0, reason: collision with root package name */
    public static final boolean f13608U0 = true;

    /* renamed from: V0, reason: collision with root package name */
    public static final Class[] f13609V0;

    /* renamed from: W0, reason: collision with root package name */
    public static final I f13610W0;

    /* renamed from: X0, reason: collision with root package name */
    public static final f0 f13611X0;

    /* renamed from: A, reason: collision with root package name */
    public K f13612A;

    /* renamed from: A0, reason: collision with root package name */
    public final J f13613A0;

    /* renamed from: B, reason: collision with root package name */
    public a f13614B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f13615B0;

    /* renamed from: C, reason: collision with root package name */
    public Z f13616C;
    public k0 C0;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f13617D;

    /* renamed from: D0, reason: collision with root package name */
    public final int[] f13618D0;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f13619E;

    /* renamed from: E0, reason: collision with root package name */
    public C2363k f13620E0;

    /* renamed from: F, reason: collision with root package name */
    public final ArrayList f13621F;

    /* renamed from: F0, reason: collision with root package name */
    public final int[] f13622F0;

    /* renamed from: G, reason: collision with root package name */
    public C0304s f13623G;

    /* renamed from: G0, reason: collision with root package name */
    public final int[] f13624G0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f13625H;

    /* renamed from: H0, reason: collision with root package name */
    public final int[] f13626H0;

    /* renamed from: I, reason: collision with root package name */
    public boolean f13627I;

    /* renamed from: I0, reason: collision with root package name */
    public final ArrayList f13628I0;

    /* renamed from: J, reason: collision with root package name */
    public boolean f13629J;

    /* renamed from: J0, reason: collision with root package name */
    public final H f13630J0;

    /* renamed from: K, reason: collision with root package name */
    public int f13631K;

    /* renamed from: K0, reason: collision with root package name */
    public boolean f13632K0;
    public boolean L;

    /* renamed from: L0, reason: collision with root package name */
    public int f13633L0;

    /* renamed from: M, reason: collision with root package name */
    public boolean f13634M;

    /* renamed from: M0, reason: collision with root package name */
    public int f13635M0;

    /* renamed from: N, reason: collision with root package name */
    public boolean f13636N;

    /* renamed from: N0, reason: collision with root package name */
    public final J f13637N0;

    /* renamed from: O, reason: collision with root package name */
    public int f13638O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f13639P;

    /* renamed from: Q, reason: collision with root package name */
    public final AccessibilityManager f13640Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f13641R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f13642S;

    /* renamed from: T, reason: collision with root package name */
    public int f13643T;

    /* renamed from: U, reason: collision with root package name */
    public int f13644U;

    /* renamed from: V, reason: collision with root package name */
    public N f13645V;

    /* renamed from: W, reason: collision with root package name */
    public EdgeEffect f13646W;

    /* renamed from: a, reason: collision with root package name */
    public final float f13647a;

    /* renamed from: a0, reason: collision with root package name */
    public EdgeEffect f13648a0;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f13649b;

    /* renamed from: b0, reason: collision with root package name */
    public EdgeEffect f13650b0;

    /* renamed from: c, reason: collision with root package name */
    public final Y f13651c;

    /* renamed from: c0, reason: collision with root package name */
    public EdgeEffect f13652c0;

    /* renamed from: d, reason: collision with root package name */
    public b0 f13653d;

    /* renamed from: d0, reason: collision with root package name */
    public P f13654d0;

    /* renamed from: e, reason: collision with root package name */
    public final C0288b f13655e;

    /* renamed from: e0, reason: collision with root package name */
    public int f13656e0;

    /* renamed from: f, reason: collision with root package name */
    public final j f13657f;

    /* renamed from: f0, reason: collision with root package name */
    public int f13658f0;

    /* renamed from: g0, reason: collision with root package name */
    public VelocityTracker f13659g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f13660h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f13661i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f13662j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f13663k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f13664l0;

    /* renamed from: m0, reason: collision with root package name */
    public U f13665m0;

    /* renamed from: n0, reason: collision with root package name */
    public final int f13666n0;

    /* renamed from: o0, reason: collision with root package name */
    public final int f13667o0;

    /* renamed from: p0, reason: collision with root package name */
    public final float f13668p0;

    /* renamed from: q0, reason: collision with root package name */
    public final float f13669q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f13670r0;

    /* renamed from: s0, reason: collision with root package name */
    public final h0 f13671s0;

    /* renamed from: t0, reason: collision with root package name */
    public RunnableC0307v f13672t0;

    /* renamed from: u, reason: collision with root package name */
    public final l f13673u;

    /* renamed from: u0, reason: collision with root package name */
    public final C0305t f13674u0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f13675v;

    /* renamed from: v0, reason: collision with root package name */
    public final e0 f13676v0;

    /* renamed from: w, reason: collision with root package name */
    public final H f13677w;

    /* renamed from: w0, reason: collision with root package name */
    public V f13678w0;

    /* renamed from: x, reason: collision with root package name */
    public final Rect f13679x;

    /* renamed from: x0, reason: collision with root package name */
    public ArrayList f13680x0;

    /* renamed from: y, reason: collision with root package name */
    public final Rect f13681y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f13682y0;

    /* renamed from: z, reason: collision with root package name */
    public final RectF f13683z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f13684z0;

    /* JADX WARN: Type inference failed for: r0v10, types: [H2.f0, java.lang.Object] */
    static {
        Class cls = Integer.TYPE;
        f13609V0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f13610W0 = new I(0);
        f13611X0 = new Object();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.kt.apps.media.xemtv.beta.R.attr.recyclerViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v11, types: [H2.j, java.lang.Object, H2.P] */
    /* JADX WARN: Type inference failed for: r1v17, types: [H2.e0, java.lang.Object] */
    public RecyclerView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        float a9;
        int i10;
        char c10;
        Constructor constructor;
        Object[] objArr;
        int i11 = 14;
        int i12 = 1;
        this.f13649b = new a0(this);
        this.f13651c = new Y(this);
        this.f13673u = new l(8);
        this.f13677w = new H(this, 0);
        this.f13679x = new Rect();
        this.f13681y = new Rect();
        this.f13683z = new RectF();
        this.f13617D = new ArrayList();
        this.f13619E = new ArrayList();
        this.f13621F = new ArrayList();
        this.f13631K = 0;
        this.f13641R = false;
        this.f13642S = false;
        this.f13643T = 0;
        this.f13644U = 0;
        this.f13645V = f13611X0;
        ?? obj = new Object();
        obj.f4605a = null;
        obj.f4606b = new ArrayList();
        obj.f4607c = 120L;
        obj.f4608d = 120L;
        obj.f4609e = 250L;
        obj.f4610f = 250L;
        obj.g = true;
        obj.f4724h = new ArrayList();
        obj.f4725i = new ArrayList();
        obj.j = new ArrayList();
        obj.k = new ArrayList();
        obj.f4726l = new ArrayList();
        obj.f4727m = new ArrayList();
        obj.f4728n = new ArrayList();
        obj.f4729o = new ArrayList();
        obj.f4730p = new ArrayList();
        obj.f4731q = new ArrayList();
        obj.f4732r = new ArrayList();
        this.f13654d0 = obj;
        this.f13656e0 = 0;
        this.f13658f0 = -1;
        this.f13668p0 = Float.MIN_VALUE;
        this.f13669q0 = Float.MIN_VALUE;
        this.f13670r0 = true;
        this.f13671s0 = new h0(this);
        this.f13674u0 = f13608U0 ? new C0305t() : null;
        ?? obj2 = new Object();
        obj2.f4664a = -1;
        obj2.f4665b = 0;
        obj2.f4666c = 0;
        obj2.f4667d = 1;
        obj2.f4668e = 0;
        obj2.f4669f = false;
        obj2.g = false;
        obj2.f4670h = false;
        obj2.f4671i = false;
        obj2.j = false;
        obj2.k = false;
        this.f13676v0 = obj2;
        this.f13682y0 = false;
        this.f13684z0 = false;
        J j = new J(this);
        this.f13613A0 = j;
        this.f13615B0 = false;
        this.f13618D0 = new int[2];
        this.f13622F0 = new int[2];
        this.f13624G0 = new int[2];
        this.f13626H0 = new int[2];
        this.f13628I0 = new ArrayList();
        this.f13630J0 = new H(this, i12);
        this.f13633L0 = 0;
        this.f13635M0 = 0;
        this.f13637N0 = new J(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f13664l0 = viewConfiguration.getScaledTouchSlop();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26) {
            Method method = L.f26648a;
            a9 = d.c(viewConfiguration);
        } else {
            a9 = L.a(viewConfiguration, context);
        }
        this.f13668p0 = a9;
        this.f13669q0 = i13 >= 26 ? d.d(viewConfiguration) : L.a(viewConfiguration, context);
        this.f13666n0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f13667o0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f13647a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f13654d0.f4605a = j;
        this.f13655e = new C0288b(new C1191j(this, i11));
        this.f13657f = new j(new i(this, i11));
        WeakHashMap weakHashMap = y1.K.f26642a;
        if ((i13 >= 26 ? E.a(this) : 0) == 0 && i13 >= 26) {
            E.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f13640Q = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new k0(this));
        int[] iArr = G2.a.f4281a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i7, 0);
        y1.K.m(this, context, iArr, attributeSet, obtainStyledAttributes, i7, 0);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f13675v = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(c.g(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            i10 = 4;
            c10 = 3;
            new C0304s(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.kt.apps.media.xemtv.beta.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.kt.apps.media.xemtv.beta.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.kt.apps.media.xemtv.beta.R.dimen.fastscroll_margin));
        } else {
            i10 = 4;
            c10 = 3;
        }
        obtainStyledAttributes.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    Class<? extends U> asSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(a.class);
                    try {
                        constructor = asSubclass.getConstructor(f13609V0);
                        objArr = new Object[i10];
                        objArr[0] = context;
                        objArr[1] = attributeSet;
                        objArr[2] = Integer.valueOf(i7);
                        objArr[c10] = 0;
                    } catch (NoSuchMethodException e2) {
                        try {
                            constructor = asSubclass.getConstructor(null);
                            objArr = null;
                        } catch (NoSuchMethodException e10) {
                            e10.initCause(e2);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e10);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((a) constructor.newInstance(objArr));
                } catch (ClassCastException e11) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e11);
                } catch (ClassNotFoundException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e12);
                } catch (IllegalAccessException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e13);
                } catch (InstantiationException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e14);
                } catch (InvocationTargetException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e15);
                }
            }
        }
        int[] iArr2 = f13604Q0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i7, 0);
        y1.K.m(this, context, iArr2, attributeSet, obtainStyledAttributes2, i7, 0);
        boolean z8 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z8);
        setTag(com.kt.apps.media.xemtv.beta.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public static RecyclerView G(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            RecyclerView G9 = G(viewGroup.getChildAt(i7));
            if (G9 != null) {
                return G9;
            }
        }
        return null;
    }

    public static i0 M(View view) {
        if (view == null) {
            return null;
        }
        return ((T) view.getLayoutParams()).f4615a;
    }

    private C2363k getScrollingChildHelper() {
        if (this.f13620E0 == null) {
            this.f13620E0 = new C2363k(this);
        }
        return this.f13620E0;
    }

    public static void l(i0 i0Var) {
        WeakReference weakReference = i0Var.f4708b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == i0Var.f4707a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            i0Var.f4708b = null;
        }
    }

    public static int o(int i7, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i10) {
        if (i7 > 0 && edgeEffect != null && vc.i.s(edgeEffect) != 0.0f) {
            int round = Math.round(vc.i.G(edgeEffect, ((-i7) * 4.0f) / i10, 0.5f) * ((-i10) / 4.0f));
            if (round != i7) {
                edgeEffect.finish();
            }
            return i7 - round;
        }
        if (i7 >= 0 || edgeEffect2 == null || vc.i.s(edgeEffect2) == 0.0f) {
            return i7;
        }
        float f4 = i10;
        int round2 = Math.round(vc.i.G(edgeEffect2, (i7 * 4.0f) / f4, 0.5f) * (f4 / 4.0f));
        if (round2 != i7) {
            edgeEffect2.finish();
        }
        return i7 - round2;
    }

    public static void setDebugAssertionsEnabled(boolean z8) {
        f13602O0 = z8;
    }

    public static void setVerboseLoggingEnabled(boolean z8) {
        f13603P0 = z8;
    }

    public final void A() {
        if (this.f13648a0 != null) {
            return;
        }
        ((f0) this.f13645V).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f13648a0 = edgeEffect;
        if (this.f13675v) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String B() {
        return " " + super.toString() + ", adapter:" + this.f13612A + ", layout:" + this.f13614B + ", context:" + getContext();
    }

    public final void C(e0 e0Var) {
        if (getScrollState() != 2) {
            e0Var.f4675o = 0;
            e0Var.f4676p = 0;
        } else {
            OverScroller overScroller = this.f13671s0.f4696c;
            e0Var.f4675o = overScroller.getFinalX() - overScroller.getCurrX();
            e0Var.f4676p = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View D(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f13621F;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            C0304s c0304s = (C0304s) arrayList.get(i7);
            int i10 = c0304s.f4820v;
            if (i10 == 1) {
                boolean d10 = c0304s.d(motionEvent.getX(), motionEvent.getY());
                boolean c10 = c0304s.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (d10 || c10)) {
                    if (c10) {
                        c0304s.f4821w = 1;
                        c0304s.f4814p = (int) motionEvent.getX();
                    } else if (d10) {
                        c0304s.f4821w = 2;
                        c0304s.f4811m = (int) motionEvent.getY();
                    }
                    c0304s.f(2);
                    if (action == 3) {
                        this.f13623G = c0304s;
                        return true;
                    }
                }
            } else {
                if (i10 != 2) {
                    continue;
                }
                if (action == 3) {
                }
            }
        }
        return false;
    }

    public final void F(int[] iArr) {
        int m10 = this.f13657f.m();
        if (m10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i7 = f.API_PRIORITY_OTHER;
        int i10 = Integer.MIN_VALUE;
        for (int i11 = 0; i11 < m10; i11++) {
            i0 M3 = M(this.f13657f.l(i11));
            if (!M3.r()) {
                int d10 = M3.d();
                if (d10 < i7) {
                    i7 = d10;
                }
                if (d10 > i10) {
                    i10 = d10;
                }
            }
        }
        iArr[0] = i7;
        iArr[1] = i10;
    }

    public final i0 H(int i7) {
        i0 i0Var = null;
        if (this.f13641R) {
            return null;
        }
        int p10 = this.f13657f.p();
        for (int i10 = 0; i10 < p10; i10++) {
            i0 M3 = M(this.f13657f.o(i10));
            if (M3 != null && !M3.k() && J(M3) == i7) {
                if (!((ArrayList) this.f13657f.f2092e).contains(M3.f4707a)) {
                    return M3;
                }
                i0Var = M3;
            }
        }
        return i0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i0 I(int i7, boolean z8) {
        int p10 = this.f13657f.p();
        i0 i0Var = null;
        for (int i10 = 0; i10 < p10; i10++) {
            i0 M3 = M(this.f13657f.o(i10));
            if (M3 != null && !M3.k()) {
                if (z8) {
                    if (M3.f4709c != i7) {
                        continue;
                    }
                    if (((ArrayList) this.f13657f.f2092e).contains(M3.f4707a)) {
                        return M3;
                    }
                    i0Var = M3;
                } else {
                    if (M3.d() != i7) {
                        continue;
                    }
                    if (((ArrayList) this.f13657f.f2092e).contains(M3.f4707a)) {
                    }
                }
            }
        }
        return i0Var;
    }

    public final int J(i0 i0Var) {
        if (i0Var.f(524) || !i0Var.h()) {
            return -1;
        }
        C0288b c0288b = this.f13655e;
        int i7 = i0Var.f4709c;
        ArrayList arrayList = (ArrayList) c0288b.f4640c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0287a c0287a = (C0287a) arrayList.get(i10);
            int i11 = c0287a.f4633a;
            if (i11 != 1) {
                if (i11 == 2) {
                    int i12 = c0287a.f4634b;
                    if (i12 <= i7) {
                        int i13 = c0287a.f4636d;
                        if (i12 + i13 > i7) {
                            return -1;
                        }
                        i7 -= i13;
                    } else {
                        continue;
                    }
                } else if (i11 == 8) {
                    int i14 = c0287a.f4634b;
                    if (i14 == i7) {
                        i7 = c0287a.f4636d;
                    } else {
                        if (i14 < i7) {
                            i7--;
                        }
                        if (c0287a.f4636d <= i7) {
                            i7++;
                        }
                    }
                }
            } else if (c0287a.f4634b <= i7) {
                i7 += c0287a.f4636d;
            }
        }
        return i7;
    }

    public final long K(i0 i0Var) {
        return this.f13612A.f4600b ? i0Var.f4711e : i0Var.f4709c;
    }

    public final i0 L(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return M(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect N(View view) {
        T t5 = (T) view.getLayoutParams();
        boolean z8 = t5.f4617c;
        Rect rect = t5.f4616b;
        if (!z8) {
            return rect;
        }
        if (this.f13676v0.g && (t5.f4615a.n() || t5.f4615a.i())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f13619E;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            Rect rect2 = this.f13679x;
            rect2.set(0, 0, 0, 0);
            ((Q) arrayList.get(i7)).getClass();
            ((T) view.getLayoutParams()).f4615a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        t5.f4617c = false;
        return rect;
    }

    public final boolean O() {
        return !this.f13629J || this.f13641R || this.f13655e.j();
    }

    public boolean P() {
        return isChildrenDrawingOrderEnabled();
    }

    public final boolean Q() {
        return this.f13643T > 0;
    }

    public final void R(int i7) {
        if (this.f13614B == null) {
            return;
        }
        setScrollState(2);
        this.f13614B.I0(i7);
        awakenScrollBars();
    }

    public final void S() {
        int p10 = this.f13657f.p();
        for (int i7 = 0; i7 < p10; i7++) {
            ((T) this.f13657f.o(i7).getLayoutParams()).f4617c = true;
        }
        ArrayList arrayList = this.f13651c.f4628c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t5 = (T) ((i0) arrayList.get(i10)).f4707a.getLayoutParams();
            if (t5 != null) {
                t5.f4617c = true;
            }
        }
    }

    public final void T(boolean z8, int i7, int i10) {
        int i11 = i7 + i10;
        int p10 = this.f13657f.p();
        for (int i12 = 0; i12 < p10; i12++) {
            i0 M3 = M(this.f13657f.o(i12));
            if (M3 != null && !M3.r()) {
                int i13 = M3.f4709c;
                e0 e0Var = this.f13676v0;
                if (i13 >= i11) {
                    if (f13603P0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i12 + " holder " + M3 + " now at position " + (M3.f4709c - i10));
                    }
                    M3.o(-i10, z8);
                    e0Var.f4669f = true;
                } else if (i13 >= i7) {
                    if (f13603P0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i12 + " holder " + M3 + " now REMOVED");
                    }
                    M3.a(8);
                    M3.o(-i10, z8);
                    M3.f4709c = i7 - 1;
                    e0Var.f4669f = true;
                }
            }
        }
        Y y10 = this.f13651c;
        ArrayList arrayList = y10.f4628c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            i0 i0Var = (i0) arrayList.get(size);
            if (i0Var != null) {
                int i14 = i0Var.f4709c;
                if (i14 >= i11) {
                    if (f13603P0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + i0Var + " now at position " + (i0Var.f4709c - i10));
                    }
                    i0Var.o(-i10, z8);
                } else if (i14 >= i7) {
                    i0Var.a(8);
                    y10.h(size);
                }
            }
        }
        requestLayout();
    }

    public final void U() {
        this.f13643T++;
    }

    public final void V(boolean z8) {
        int i7;
        AccessibilityManager accessibilityManager;
        int i10 = this.f13643T - 1;
        this.f13643T = i10;
        if (i10 < 1) {
            if (f13602O0 && i10 < 0) {
                throw new IllegalStateException(c.g(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.f13643T = 0;
            if (z8) {
                int i11 = this.f13638O;
                this.f13638O = 0;
                if (i11 != 0 && (accessibilityManager = this.f13640Q) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i11);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f13628I0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    i0 i0Var = (i0) arrayList.get(size);
                    if (i0Var.f4707a.getParent() == this && !i0Var.r() && (i7 = i0Var.f4720q) != -1) {
                        WeakHashMap weakHashMap = y1.K.f26642a;
                        i0Var.f4707a.setImportantForAccessibility(i7);
                        i0Var.f4720q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void W(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f13658f0) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.f13658f0 = motionEvent.getPointerId(i7);
            int x2 = (int) (motionEvent.getX(i7) + 0.5f);
            this.f13662j0 = x2;
            this.f13660h0 = x2;
            int y10 = (int) (motionEvent.getY(i7) + 0.5f);
            this.f13663k0 = y10;
            this.f13661i0 = y10;
        }
    }

    public final void X() {
        if (this.f13615B0 || !this.f13625H) {
            return;
        }
        WeakHashMap weakHashMap = y1.K.f26642a;
        postOnAnimation(this.f13630J0);
        this.f13615B0 = true;
    }

    public final void Y() {
        boolean z8;
        boolean z10 = false;
        if (this.f13641R) {
            C0288b c0288b = this.f13655e;
            c0288b.r((ArrayList) c0288b.f4640c);
            c0288b.r((ArrayList) c0288b.f4641d);
            c0288b.f4638a = 0;
            if (this.f13642S) {
                this.f13614B.k0();
            }
        }
        if (this.f13654d0 == null || !this.f13614B.V0()) {
            this.f13655e.d();
        } else {
            this.f13655e.q();
        }
        boolean z11 = this.f13682y0 || this.f13684z0;
        boolean z12 = this.f13629J && this.f13654d0 != null && ((z8 = this.f13641R) || z11 || this.f13614B.f13712f) && (!z8 || this.f13612A.f4600b);
        e0 e0Var = this.f13676v0;
        e0Var.j = z12;
        if (z12 && z11 && !this.f13641R && this.f13654d0 != null && this.f13614B.V0()) {
            z10 = true;
        }
        e0Var.k = z10;
    }

    public final void Z(boolean z8) {
        this.f13642S = z8 | this.f13642S;
        this.f13641R = true;
        int p10 = this.f13657f.p();
        for (int i7 = 0; i7 < p10; i7++) {
            i0 M3 = M(this.f13657f.o(i7));
            if (M3 != null && !M3.r()) {
                M3.a(6);
            }
        }
        S();
        Y y10 = this.f13651c;
        ArrayList arrayList = y10.f4628c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            i0 i0Var = (i0) arrayList.get(i10);
            if (i0Var != null) {
                i0Var.a(6);
                i0Var.a(1024);
            }
        }
        K k = y10.f4632h.f13612A;
        if (k == null || !k.f4600b) {
            y10.g();
        }
    }

    public final void a0(i0 i0Var, O o10) {
        i0Var.j &= -8193;
        boolean z8 = this.f13676v0.f4670h;
        l lVar = this.f13673u;
        if (z8 && i0Var.n() && !i0Var.k() && !i0Var.r()) {
            ((r) lVar.f23392c).e(i0Var, K(i0Var));
        }
        u.T t5 = (u.T) lVar.f23391b;
        t0 t0Var = (t0) t5.get(i0Var);
        if (t0Var == null) {
            t0Var = t0.a();
            t5.put(i0Var, t0Var);
        }
        t0Var.f4832b = o10;
        t0Var.f4831a |= 4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i7, int i10) {
        a aVar = this.f13614B;
        if (aVar == null || !aVar.a0(this, arrayList, i7, i10)) {
            super.addFocusables(arrayList, i7, i10);
        }
    }

    public final int b0(int i7, float f4) {
        float height = f4 / getHeight();
        float width = i7 / getWidth();
        EdgeEffect edgeEffect = this.f13646W;
        float f10 = 0.0f;
        if (edgeEffect == null || vc.i.s(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f13650b0;
            if (edgeEffect2 != null && vc.i.s(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f13650b0.onRelease();
                } else {
                    float G9 = vc.i.G(this.f13650b0, width, height);
                    if (vc.i.s(this.f13650b0) == 0.0f) {
                        this.f13650b0.onRelease();
                    }
                    f10 = G9;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f13646W.onRelease();
            } else {
                float f11 = -vc.i.G(this.f13646W, -width, 1.0f - height);
                if (vc.i.s(this.f13646W) == 0.0f) {
                    this.f13646W.onRelease();
                }
                f10 = f11;
            }
            invalidate();
        }
        return Math.round(f10 * getWidth());
    }

    public final int c0(int i7, float f4) {
        float width = f4 / getWidth();
        float height = i7 / getHeight();
        EdgeEffect edgeEffect = this.f13648a0;
        float f10 = 0.0f;
        if (edgeEffect == null || vc.i.s(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f13652c0;
            if (edgeEffect2 != null && vc.i.s(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f13652c0.onRelease();
                } else {
                    float G9 = vc.i.G(this.f13652c0, height, 1.0f - width);
                    if (vc.i.s(this.f13652c0) == 0.0f) {
                        this.f13652c0.onRelease();
                    }
                    f10 = G9;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f13648a0.onRelease();
            } else {
                float f11 = -vc.i.G(this.f13648a0, -height, width);
                if (vc.i.s(this.f13648a0) == 0.0f) {
                    this.f13648a0.onRelease();
                }
                f10 = f11;
            }
            invalidate();
        }
        return Math.round(f10 * getHeight());
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof T) && this.f13614B.h((T) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        a aVar = this.f13614B;
        if (aVar != null && aVar.f()) {
            return this.f13614B.l(this.f13676v0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        a aVar = this.f13614B;
        if (aVar != null && aVar.f()) {
            return this.f13614B.m(this.f13676v0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        a aVar = this.f13614B;
        if (aVar != null && aVar.f()) {
            return this.f13614B.n(this.f13676v0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        a aVar = this.f13614B;
        if (aVar != null && aVar.g()) {
            return this.f13614B.o(this.f13676v0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        a aVar = this.f13614B;
        if (aVar != null && aVar.g()) {
            return this.f13614B.p(this.f13676v0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        a aVar = this.f13614B;
        if (aVar != null && aVar.g()) {
            return this.f13614B.q(this.f13676v0);
        }
        return 0;
    }

    public final void d0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f13679x;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof T) {
            T t5 = (T) layoutParams;
            if (!t5.f4617c) {
                int i7 = rect.left;
                Rect rect2 = t5.f4616b;
                rect.left = i7 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f13614B.E0(this, view, this.f13679x, !this.f13629J, view2 == null);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f4, float f10, boolean z8) {
        return getScrollingChildHelper().a(f4, f10, z8);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f4, float f10) {
        return getScrollingChildHelper().b(f4, f10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i7, int i10, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i7, i10, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i7, int i10, int i11, int i12, int[] iArr) {
        return getScrollingChildHelper().d(i7, i10, i11, i12, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z8;
        super.draw(canvas);
        ArrayList arrayList = this.f13619E;
        int size = arrayList.size();
        boolean z10 = false;
        for (int i7 = 0; i7 < size; i7++) {
            ((Q) arrayList.get(i7)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f13646W;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z8 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f13675v ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f13646W;
            z8 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f13648a0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f13675v) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f13648a0;
            z8 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f13650b0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f13675v ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f13650b0;
            z8 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f13652c0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f13675v) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f13652c0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z10 = true;
            }
            z8 |= z10;
            canvas.restoreToCount(save4);
        }
        if ((z8 || this.f13654d0 == null || arrayList.size() <= 0 || !this.f13654d0.f()) ? z8 : true) {
            WeakHashMap weakHashMap = y1.K.f26642a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e0() {
        VelocityTracker velocityTracker = this.f13659g0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z8 = false;
        p0(0);
        EdgeEffect edgeEffect = this.f13646W;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z8 = this.f13646W.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f13648a0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z8 |= this.f13648a0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f13650b0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z8 |= this.f13650b0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f13652c0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z8 |= this.f13652c0.isFinished();
        }
        if (z8) {
            WeakHashMap weakHashMap = y1.K.f26642a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f0(int i7, int i10, MotionEvent motionEvent, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z8;
        p();
        K k = this.f13612A;
        int[] iArr = this.f13626H0;
        if (k != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            g0(i7, i10, iArr);
            int i16 = iArr[0];
            int i17 = iArr[1];
            i12 = i16;
            i13 = i17;
            i14 = i7 - i16;
            i15 = i10 - i17;
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 0;
        }
        if (!this.f13619E.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        v(i12, i13, i14, i15, this.f13622F0, i11, iArr);
        int i18 = iArr[0];
        int i19 = i14 - i18;
        int i20 = iArr[1];
        int i21 = i15 - i20;
        boolean z10 = (i18 == 0 && i20 == 0) ? false : true;
        int i22 = this.f13662j0;
        int[] iArr2 = this.f13622F0;
        int i23 = iArr2[0];
        this.f13662j0 = i22 - i23;
        int i24 = this.f13663k0;
        int i25 = iArr2[1];
        this.f13663k0 = i24 - i25;
        int[] iArr3 = this.f13624G0;
        iArr3[0] = iArr3[0] + i23;
        iArr3[1] = iArr3[1] + i25;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x2 = motionEvent.getX();
                float f4 = i19;
                float y10 = motionEvent.getY();
                float f10 = i21;
                if (f4 < 0.0f) {
                    y();
                    vc.i.G(this.f13646W, (-f4) / getWidth(), 1.0f - (y10 / getHeight()));
                } else if (f4 > 0.0f) {
                    z();
                    vc.i.G(this.f13650b0, f4 / getWidth(), y10 / getHeight());
                } else {
                    z8 = false;
                    if (f10 >= 0.0f) {
                        A();
                        vc.i.G(this.f13648a0, (-f10) / getHeight(), x2 / getWidth());
                    } else {
                        if (f10 > 0.0f) {
                            x();
                            vc.i.G(this.f13652c0, f10 / getHeight(), 1.0f - (x2 / getWidth()));
                        }
                        if (!z8 || f4 != 0.0f || f10 != 0.0f) {
                            WeakHashMap weakHashMap = y1.K.f26642a;
                            postInvalidateOnAnimation();
                        }
                    }
                    z8 = true;
                    if (!z8) {
                    }
                    WeakHashMap weakHashMap2 = y1.K.f26642a;
                    postInvalidateOnAnimation();
                }
                z8 = true;
                if (f10 >= 0.0f) {
                }
                z8 = true;
                if (!z8) {
                }
                WeakHashMap weakHashMap22 = y1.K.f26642a;
                postInvalidateOnAnimation();
            }
            n(i7, i10);
        }
        if (i12 != 0 || i13 != 0) {
            w(i12, i13);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z10 && i12 == 0 && i13 == 0) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x017b, code lost:
    
        if (r5 > 0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x017e, code lost:
    
        if (r7 < 0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0181, code lost:
    
        if (r5 < 0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0189, code lost:
    
        if ((r5 * r6) <= 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0191, code lost:
    
        if ((r5 * r6) >= 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0164, code lost:
    
        if (r7 > 0) goto L140;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i7) {
        View view2;
        int i10;
        char c10;
        boolean z8;
        View i02 = this.f13614B.i0(view, i7);
        if (i02 != null) {
            return i02;
        }
        boolean z10 = true;
        boolean z11 = (this.f13612A == null || this.f13614B == null || Q() || this.f13634M) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        e0 e0Var = this.f13676v0;
        Y y10 = this.f13651c;
        if (z11 && (i7 == 2 || i7 == 1)) {
            if (this.f13614B.g()) {
                if (focusFinder.findNextFocus(this, view, i7 == 2 ? 130 : 33) == null) {
                    z8 = true;
                    if (!z8 && this.f13614B.f()) {
                        z8 = focusFinder.findNextFocus(this, view, !((this.f13614B.J() != 1) ^ (i7 != 2)) ? 66 : 17) != null;
                    }
                    if (z8) {
                        p();
                        if (D(view) == null) {
                            return null;
                        }
                        n0();
                        this.f13614B.d0(view, i7, y10, e0Var);
                        o0(false);
                    }
                    view2 = focusFinder.findNextFocus(this, view, i7);
                }
            }
            z8 = false;
            if (!z8) {
                if (focusFinder.findNextFocus(this, view, !((this.f13614B.J() != 1) ^ (i7 != 2)) ? 66 : 17) != null) {
                }
            }
            if (z8) {
            }
            view2 = focusFinder.findNextFocus(this, view, i7);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i7);
            if (findNextFocus == null && z11) {
                p();
                if (D(view) == null) {
                    return null;
                }
                n0();
                view2 = this.f13614B.d0(view, i7, y10, e0Var);
                o0(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 != null && !view2.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i7);
            }
            d0(view2, null);
            return view;
        }
        if (view2 != null && view2 != this && view2 != view) {
            if (D(view2) == null) {
                z10 = false;
            } else if (view != null && D(view) != null) {
                int width = view.getWidth();
                int height = view.getHeight();
                Rect rect = this.f13679x;
                rect.set(0, 0, width, height);
                int width2 = view2.getWidth();
                int height2 = view2.getHeight();
                Rect rect2 = this.f13681y;
                rect2.set(0, 0, width2, height2);
                offsetDescendantRectToMyCoords(view, rect);
                offsetDescendantRectToMyCoords(view2, rect2);
                int i11 = this.f13614B.J() == 1 ? -1 : 1;
                int i12 = rect.left;
                int i13 = rect2.left;
                if ((i12 < i13 || rect.right <= i13) && rect.right < rect2.right) {
                    i10 = 1;
                } else {
                    int i14 = rect.right;
                    int i15 = rect2.right;
                    i10 = ((i14 > i15 || i12 >= i15) && i12 > i13) ? -1 : 0;
                }
                int i16 = rect.top;
                int i17 = rect2.top;
                if ((i16 < i17 || rect.bottom <= i17) && rect.bottom < rect2.bottom) {
                    c10 = 1;
                } else {
                    int i18 = rect.bottom;
                    int i19 = rect2.bottom;
                    c10 = ((i18 > i19 || i16 >= i19) && i16 > i17) ? (char) 65535 : (char) 0;
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 17) {
                            if (i7 != 33) {
                                if (i7 != 66) {
                                    if (i7 != 130) {
                                        StringBuilder sb2 = new StringBuilder("Invalid direction: ");
                                        sb2.append(i7);
                                        throw new IllegalArgumentException(c.g(this, sb2));
                                    }
                                }
                            }
                        }
                    } else if (c10 <= 0) {
                        if (c10 == 0) {
                        }
                    }
                } else if (c10 >= 0) {
                    if (c10 == 0) {
                    }
                }
            }
            return !z10 ? view2 : super.focusSearch(view, i7);
        }
        z10 = false;
        if (!z10) {
        }
    }

    public final void g0(int i7, int i10, int[] iArr) {
        i0 i0Var;
        j jVar = this.f13657f;
        n0();
        U();
        int i11 = AbstractC2096f.f24827a;
        Trace.beginSection("RV Scroll");
        e0 e0Var = this.f13676v0;
        C(e0Var);
        Y y10 = this.f13651c;
        int H02 = i7 != 0 ? this.f13614B.H0(i7, y10, e0Var) : 0;
        int J02 = i10 != 0 ? this.f13614B.J0(i10, y10, e0Var) : 0;
        Trace.endSection();
        int m10 = jVar.m();
        for (int i12 = 0; i12 < m10; i12++) {
            View l10 = jVar.l(i12);
            i0 L = L(l10);
            if (L != null && (i0Var = L.f4714i) != null) {
                int left = l10.getLeft();
                int top = l10.getTop();
                View view = i0Var.f4707a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        V(true);
        o0(false);
        if (iArr != null) {
            iArr[0] = H02;
            iArr[1] = J02;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        a aVar = this.f13614B;
        if (aVar != null) {
            return aVar.u();
        }
        throw new IllegalStateException(c.g(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        a aVar = this.f13614B;
        if (aVar != null) {
            return aVar.v(getContext(), attributeSet);
        }
        throw new IllegalStateException(c.g(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        a aVar = this.f13614B;
        if (aVar != null) {
            return aVar.w(layoutParams);
        }
        throw new IllegalStateException(c.g(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public K getAdapter() {
        return this.f13612A;
    }

    @Override // android.view.View
    public int getBaseline() {
        a aVar = this.f13614B;
        if (aVar == null) {
            return super.getBaseline();
        }
        aVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i7, int i10) {
        return super.getChildDrawingOrder(i7, i10);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f13675v;
    }

    public k0 getCompatAccessibilityDelegate() {
        return this.C0;
    }

    public N getEdgeEffectFactory() {
        return this.f13645V;
    }

    public P getItemAnimator() {
        return this.f13654d0;
    }

    public int getItemDecorationCount() {
        return this.f13619E.size();
    }

    public a getLayoutManager() {
        return this.f13614B;
    }

    public int getMaxFlingVelocity() {
        return this.f13667o0;
    }

    public int getMinFlingVelocity() {
        return this.f13666n0;
    }

    public long getNanoTime() {
        if (f13608U0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public U getOnFlingListener() {
        return this.f13665m0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f13670r0;
    }

    public X getRecycledViewPool() {
        return this.f13651c.c();
    }

    public int getScrollState() {
        return this.f13656e0;
    }

    public final void h(i0 i0Var) {
        View view = i0Var.f4707a;
        boolean z8 = view.getParent() == this;
        this.f13651c.m(L(view));
        if (i0Var.m()) {
            this.f13657f.e(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z8) {
            this.f13657f.d(view, -1, true);
            return;
        }
        j jVar = this.f13657f;
        int indexOfChild = ((RecyclerView) ((i) jVar.f2090c).f3256b).indexOfChild(view);
        if (indexOfChild >= 0) {
            ((A4.f) jVar.f2091d).O(indexOfChild);
            jVar.q(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public void h0(int i7) {
        if (this.f13634M) {
            return;
        }
        q0();
        a aVar = this.f13614B;
        if (aVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            aVar.I0(i7);
            awakenScrollBars();
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(Q q10) {
        a aVar = this.f13614B;
        if (aVar != null) {
            aVar.d("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f13619E;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(q10);
        S();
        requestLayout();
    }

    public final boolean i0(EdgeEffect edgeEffect, int i7, int i10) {
        if (i7 > 0) {
            return true;
        }
        float s3 = vc.i.s(edgeEffect) * i10;
        float abs = Math.abs(-i7) * 0.35f;
        float f4 = this.f13647a * 0.015f;
        double log = Math.log(abs / f4);
        double d10 = f13605R0;
        return ((float) (Math.exp((d10 / (d10 - 1.0d)) * log) * ((double) f4))) < s3;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f13625H;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f13634M;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f26721d;
    }

    public final void j(V v10) {
        if (this.f13680x0 == null) {
            this.f13680x0 = new ArrayList();
        }
        this.f13680x0.add(v10);
    }

    public void j0(int i7, int i10) {
        l0(i7, i10, null);
    }

    public final void k(String str) {
        if (Q()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(c.g(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.f13644U > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(c.g(this, new StringBuilder(""))));
        }
    }

    public final void k0(int i7, int i10, AccelerateDecelerateInterpolator accelerateDecelerateInterpolator, boolean z8) {
        a aVar = this.f13614B;
        if (aVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f13634M) {
            return;
        }
        if (!aVar.f()) {
            i7 = 0;
        }
        if (!this.f13614B.g()) {
            i10 = 0;
        }
        if (i7 == 0 && i10 == 0) {
            return;
        }
        if (z8) {
            int i11 = i7 != 0 ? 1 : 0;
            if (i10 != 0) {
                i11 |= 2;
            }
            getScrollingChildHelper().g(i11, 1);
        }
        this.f13671s0.c(i7, i10, Integer.MIN_VALUE, accelerateDecelerateInterpolator);
    }

    public void l0(int i7, int i10, Interpolator interpolator) {
        k0(i7, i10, null, false);
    }

    public final void m() {
        int p10 = this.f13657f.p();
        for (int i7 = 0; i7 < p10; i7++) {
            i0 M3 = M(this.f13657f.o(i7));
            if (!M3.r()) {
                M3.f4710d = -1;
                M3.g = -1;
            }
        }
        Y y10 = this.f13651c;
        ArrayList arrayList = y10.f4628c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            i0 i0Var = (i0) arrayList.get(i10);
            i0Var.f4710d = -1;
            i0Var.g = -1;
        }
        ArrayList arrayList2 = y10.f4626a;
        int size2 = arrayList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            i0 i0Var2 = (i0) arrayList2.get(i11);
            i0Var2.f4710d = -1;
            i0Var2.g = -1;
        }
        ArrayList arrayList3 = y10.f4627b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                i0 i0Var3 = (i0) y10.f4627b.get(i12);
                i0Var3.f4710d = -1;
                i0Var3.g = -1;
            }
        }
    }

    public void m0(int i7) {
        if (this.f13634M) {
            return;
        }
        a aVar = this.f13614B;
        if (aVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            aVar.T0(this, i7);
        }
    }

    public final void n(int i7, int i10) {
        boolean z8;
        EdgeEffect edgeEffect = this.f13646W;
        if (edgeEffect == null || edgeEffect.isFinished() || i7 <= 0) {
            z8 = false;
        } else {
            this.f13646W.onRelease();
            z8 = this.f13646W.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f13650b0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i7 < 0) {
            this.f13650b0.onRelease();
            z8 |= this.f13650b0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f13648a0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i10 > 0) {
            this.f13648a0.onRelease();
            z8 |= this.f13648a0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f13652c0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i10 < 0) {
            this.f13652c0.onRelease();
            z8 |= this.f13652c0.isFinished();
        }
        if (z8) {
            WeakHashMap weakHashMap = y1.K.f26642a;
            postInvalidateOnAnimation();
        }
    }

    public final void n0() {
        int i7 = this.f13631K + 1;
        this.f13631K = i7;
        if (i7 != 1 || this.f13634M) {
            return;
        }
        this.L = false;
    }

    public final void o0(boolean z8) {
        if (this.f13631K < 1) {
            if (f13602O0) {
                throw new IllegalStateException(c.g(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.f13631K = 1;
        }
        if (!z8 && !this.f13634M) {
            this.L = false;
        }
        if (this.f13631K == 1) {
            if (z8 && this.L && !this.f13634M && this.f13614B != null && this.f13612A != null) {
                r();
            }
            if (!this.f13634M) {
                this.L = false;
            }
        }
        this.f13631K--;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    /* JADX WARN: Type inference failed for: r1v6, types: [H2.v, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float f4;
        super.onAttachedToWindow();
        this.f13643T = 0;
        this.f13625H = true;
        this.f13629J = this.f13629J && !isLayoutRequested();
        this.f13651c.e();
        a aVar = this.f13614B;
        if (aVar != null) {
            aVar.g = true;
            aVar.b0(this);
        }
        this.f13615B0 = false;
        if (f13608U0) {
            ThreadLocal threadLocal = RunnableC0307v.f4839e;
            RunnableC0307v runnableC0307v = (RunnableC0307v) threadLocal.get();
            this.f13672t0 = runnableC0307v;
            if (runnableC0307v == null) {
                ?? obj = new Object();
                obj.f4841a = new ArrayList();
                obj.f4844d = new ArrayList();
                this.f13672t0 = obj;
                WeakHashMap weakHashMap = y1.K.f26642a;
                Display display = getDisplay();
                if (!isInEditMode() && display != null) {
                    f4 = display.getRefreshRate();
                }
                f4 = 60.0f;
                RunnableC0307v runnableC0307v2 = this.f13672t0;
                runnableC0307v2.f4843c = 1.0E9f / f4;
                threadLocal.set(runnableC0307v2);
            }
            RunnableC0307v runnableC0307v3 = this.f13672t0;
            runnableC0307v3.getClass();
            boolean z8 = f13602O0;
            ArrayList arrayList = runnableC0307v3.f4841a;
            if (z8 && arrayList.contains(this)) {
                throw new IllegalStateException("RecyclerView already present in worker list!");
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Y y10;
        RunnableC0307v runnableC0307v;
        super.onDetachedFromWindow();
        P p10 = this.f13654d0;
        if (p10 != null) {
            p10.e();
        }
        q0();
        int i7 = 0;
        this.f13625H = false;
        a aVar = this.f13614B;
        if (aVar != null) {
            aVar.g = false;
            aVar.c0(this);
        }
        this.f13628I0.clear();
        removeCallbacks(this.f13630J0);
        this.f13673u.getClass();
        do {
        } while (t0.f4830d.a() != null);
        int i10 = 0;
        while (true) {
            y10 = this.f13651c;
            ArrayList arrayList = y10.f4628c;
            if (i10 >= arrayList.size()) {
                break;
            }
            b.e(((i0) arrayList.get(i10)).f4707a);
            i10++;
        }
        y10.f(y10.f4632h.f13612A, false);
        while (i7 < getChildCount()) {
            int i11 = i7 + 1;
            View childAt = getChildAt(i7);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ArrayList arrayList2 = b.r(childAt).f4280a;
            for (int s3 = u0.s(arrayList2); -1 < s3; s3--) {
                ((b1) arrayList2.get(s3)).f1860a.c();
            }
            i7 = i11;
        }
        if (!f13608U0 || (runnableC0307v = this.f13672t0) == null) {
            return;
        }
        boolean remove = runnableC0307v.f4841a.remove(this);
        if (f13602O0 && !remove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.f13672t0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f13619E;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((Q) arrayList.get(i7)).a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f4;
        float f10;
        a aVar;
        if (this.f13614B != null && !this.f13634M && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f4 = this.f13614B.g() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f13614B.f()) {
                    f10 = motionEvent.getAxisValue(10);
                    if (f4 == 0.0f || f10 != 0.0f) {
                        int i7 = (int) (f10 * this.f13668p0);
                        int i10 = (int) (f4 * this.f13669q0);
                        aVar = this.f13614B;
                        if (aVar == null) {
                            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        } else if (!this.f13634M) {
                            int[] iArr = this.f13626H0;
                            iArr[0] = 0;
                            iArr[1] = 0;
                            boolean f11 = aVar.f();
                            boolean g = this.f13614B.g();
                            int i11 = g ? (f11 ? 1 : 0) | 2 : f11 ? 1 : 0;
                            float y10 = motionEvent.getY();
                            float x2 = motionEvent.getX();
                            int b02 = i7 - b0(i7, y10);
                            int c02 = i10 - c0(i10, x2);
                            getScrollingChildHelper().g(i11, 1);
                            if (u(f11 ? b02 : 0, g ? c02 : 0, 1, this.f13626H0, this.f13622F0)) {
                                b02 -= iArr[0];
                                c02 -= iArr[1];
                            }
                            f0(f11 ? b02 : 0, g ? c02 : 0, motionEvent, 1);
                            RunnableC0307v runnableC0307v = this.f13672t0;
                            if (runnableC0307v != null && (b02 != 0 || c02 != 0)) {
                                runnableC0307v.a(this, b02, c02);
                            }
                            p0(1);
                        }
                    }
                }
                f10 = 0.0f;
                if (f4 == 0.0f) {
                }
                int i72 = (int) (f10 * this.f13668p0);
                int i102 = (int) (f4 * this.f13669q0);
                aVar = this.f13614B;
                if (aVar == null) {
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f13614B.g()) {
                        f4 = -axisValue;
                        f10 = 0.0f;
                        if (f4 == 0.0f) {
                        }
                        int i722 = (int) (f10 * this.f13668p0);
                        int i1022 = (int) (f4 * this.f13669q0);
                        aVar = this.f13614B;
                        if (aVar == null) {
                        }
                    } else if (this.f13614B.f()) {
                        f10 = axisValue;
                        f4 = 0.0f;
                        if (f4 == 0.0f) {
                        }
                        int i7222 = (int) (f10 * this.f13668p0);
                        int i10222 = (int) (f4 * this.f13669q0);
                        aVar = this.f13614B;
                        if (aVar == null) {
                        }
                    }
                }
                f4 = 0.0f;
                f10 = 0.0f;
                if (f4 == 0.0f) {
                }
                int i72222 = (int) (f10 * this.f13668p0);
                int i102222 = (int) (f4 * this.f13669q0);
                aVar = this.f13614B;
                if (aVar == null) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z8;
        boolean z10;
        if (this.f13634M) {
            return false;
        }
        this.f13623G = null;
        if (E(motionEvent)) {
            e0();
            setScrollState(0);
            return true;
        }
        a aVar = this.f13614B;
        if (aVar == null) {
            return false;
        }
        boolean f4 = aVar.f();
        boolean g = this.f13614B.g();
        if (this.f13659g0 == null) {
            this.f13659g0 = VelocityTracker.obtain();
        }
        this.f13659g0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f13636N) {
                this.f13636N = false;
            }
            this.f13658f0 = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.f13662j0 = x2;
            this.f13660h0 = x2;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.f13663k0 = y10;
            this.f13661i0 = y10;
            EdgeEffect edgeEffect = this.f13646W;
            if (edgeEffect == null || vc.i.s(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                z8 = false;
            } else {
                vc.i.G(this.f13646W, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                z8 = true;
            }
            EdgeEffect edgeEffect2 = this.f13650b0;
            boolean z11 = z8;
            if (edgeEffect2 != null) {
                z11 = z8;
                if (vc.i.s(edgeEffect2) != 0.0f) {
                    z11 = z8;
                    if (!canScrollHorizontally(1)) {
                        vc.i.G(this.f13650b0, 0.0f, motionEvent.getY() / getHeight());
                        z11 = true;
                    }
                }
            }
            EdgeEffect edgeEffect3 = this.f13648a0;
            boolean z12 = z11;
            if (edgeEffect3 != null) {
                z12 = z11;
                if (vc.i.s(edgeEffect3) != 0.0f) {
                    z12 = z11;
                    if (!canScrollVertically(-1)) {
                        vc.i.G(this.f13648a0, 0.0f, motionEvent.getX() / getWidth());
                        z12 = true;
                    }
                }
            }
            EdgeEffect edgeEffect4 = this.f13652c0;
            boolean z13 = z12;
            if (edgeEffect4 != null) {
                z13 = z12;
                if (vc.i.s(edgeEffect4) != 0.0f) {
                    z13 = z12;
                    if (!canScrollVertically(1)) {
                        vc.i.G(this.f13652c0, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z13 = true;
                    }
                }
            }
            if (z13 || this.f13656e0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                p0(1);
            }
            int[] iArr = this.f13624G0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i7 = f4;
            if (g) {
                i7 = (f4 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i7, 0);
        } else if (actionMasked == 1) {
            this.f13659g0.clear();
            p0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f13658f0);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f13658f0 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x10 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f13656e0 != 1) {
                int i10 = x10 - this.f13660h0;
                int i11 = y11 - this.f13661i0;
                if (f4 == 0 || Math.abs(i10) <= this.f13664l0) {
                    z10 = false;
                } else {
                    this.f13662j0 = x10;
                    z10 = true;
                }
                if (g && Math.abs(i11) > this.f13664l0) {
                    this.f13663k0 = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            e0();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f13658f0 = motionEvent.getPointerId(actionIndex);
            int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f13662j0 = x11;
            this.f13660h0 = x11;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f13663k0 = y12;
            this.f13661i0 = y12;
        } else if (actionMasked == 6) {
            W(motionEvent);
        }
        return this.f13656e0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        int i13 = AbstractC2096f.f24827a;
        Trace.beginSection("RV OnLayout");
        r();
        Trace.endSection();
        this.f13629J = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        a aVar = this.f13614B;
        if (aVar == null) {
            q(i7, i10);
            return;
        }
        boolean T10 = aVar.T();
        Y y10 = this.f13651c;
        boolean z8 = false;
        e0 e0Var = this.f13676v0;
        if (T10) {
            int mode = View.MeasureSpec.getMode(i7);
            int mode2 = View.MeasureSpec.getMode(i10);
            this.f13614B.r0(y10, e0Var, i7, i10);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z8 = true;
            }
            this.f13632K0 = z8;
            if (z8 || this.f13612A == null) {
                return;
            }
            if (e0Var.f4667d == 1) {
                s();
            }
            this.f13614B.L0(i7, i10);
            e0Var.f4671i = true;
            t();
            this.f13614B.O0(i7, i10);
            if (this.f13614B.R0()) {
                this.f13614B.L0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                e0Var.f4671i = true;
                t();
                this.f13614B.O0(i7, i10);
            }
            this.f13633L0 = getMeasuredWidth();
            this.f13635M0 = getMeasuredHeight();
            return;
        }
        if (this.f13627I) {
            this.f13614B.r0(y10, e0Var, i7, i10);
            return;
        }
        if (this.f13639P) {
            n0();
            U();
            Y();
            V(true);
            if (e0Var.k) {
                e0Var.g = true;
            } else {
                this.f13655e.d();
                e0Var.g = false;
            }
            this.f13639P = false;
            o0(false);
        } else if (e0Var.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        K k = this.f13612A;
        if (k != null) {
            e0Var.f4668e = k.a();
        } else {
            e0Var.f4668e = 0;
        }
        n0();
        this.f13614B.r0(y10, e0Var, i7, i10);
        o0(false);
        e0Var.g = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i7, Rect rect) {
        if (Q()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i7, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b0 b0Var = (b0) parcelable;
        this.f13653d = b0Var;
        super.onRestoreInstanceState(b0Var.f4568a);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, H1.b, H2.b0] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new H1.b(super.onSaveInstanceState());
        b0 b0Var = this.f13653d;
        if (b0Var != null) {
            bVar.f4644c = b0Var.f4644c;
        } else {
            a aVar = this.f13614B;
            if (aVar != null) {
                bVar.f4644c = aVar.v0();
            } else {
                bVar.f4644c = null;
            }
        }
        return bVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (i7 == i11 && i10 == i12) {
            return;
        }
        this.f13652c0 = null;
        this.f13648a0 = null;
        this.f13650b0 = null;
        this.f13646W = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:224:0x04d4, code lost:
    
        if (r2 < r4) goto L240;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x039d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0213  */
    /* JADX WARN: Type inference failed for: r5v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v28 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z8;
        RecyclerView recyclerView;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        int i7;
        int i10;
        h0 h0Var;
        float f4;
        float f10;
        h0 h0Var2;
        MotionEvent motionEvent4;
        int minFlingVelocity;
        boolean z10;
        int O10;
        PointF a9;
        h0 h0Var3;
        int i11;
        RecyclerView recyclerView2;
        boolean z11;
        if (this.f13634M || this.f13636N) {
            return false;
        }
        C0304s c0304s = this.f13623G;
        if (c0304s == null) {
            z8 = motionEvent.getAction() == 0 ? false : E(motionEvent);
        } else {
            if (c0304s.f4820v != 0) {
                if (motionEvent.getAction() == 0) {
                    boolean d10 = c0304s.d(motionEvent.getX(), motionEvent.getY());
                    boolean c10 = c0304s.c(motionEvent.getX(), motionEvent.getY());
                    if (d10 || c10) {
                        if (c10) {
                            c0304s.f4821w = 1;
                            c0304s.f4814p = (int) motionEvent.getX();
                        } else if (d10) {
                            c0304s.f4821w = 2;
                            c0304s.f4811m = (int) motionEvent.getY();
                        }
                        c0304s.f(2);
                    }
                } else if (motionEvent.getAction() == 1 && c0304s.f4820v == 2) {
                    c0304s.f4811m = 0.0f;
                    c0304s.f4814p = 0.0f;
                    c0304s.f(1);
                    c0304s.f4821w = 0;
                } else if (motionEvent.getAction() == 2 && c0304s.f4820v == 2) {
                    c0304s.g();
                    int i12 = c0304s.f4821w;
                    int i13 = c0304s.f4803b;
                    if (i12 == 1) {
                        float x2 = motionEvent.getX();
                        int[] iArr = c0304s.f4823y;
                        iArr[0] = i13;
                        int i14 = c0304s.f4815q - i13;
                        iArr[1] = i14;
                        float max = Math.max(i13, Math.min(i14, x2));
                        if (Math.abs(c0304s.f4813o - max) >= 2.0f) {
                            int e2 = C0304s.e(c0304s.f4814p, max, iArr, c0304s.f4817s.computeHorizontalScrollRange(), c0304s.f4817s.computeHorizontalScrollOffset(), c0304s.f4815q);
                            if (e2 != 0) {
                                c0304s.f4817s.scrollBy(e2, 0);
                            }
                            c0304s.f4814p = max;
                        }
                    }
                    if (c0304s.f4821w == 2) {
                        float y10 = motionEvent.getY();
                        int[] iArr2 = c0304s.f4822x;
                        iArr2[0] = i13;
                        int i15 = c0304s.f4816r - i13;
                        iArr2[1] = i15;
                        float max2 = Math.max(i13, Math.min(i15, y10));
                        if (Math.abs(c0304s.f4810l - max2) >= 2.0f) {
                            int e10 = C0304s.e(c0304s.f4811m, max2, iArr2, c0304s.f4817s.computeVerticalScrollRange(), c0304s.f4817s.computeVerticalScrollOffset(), c0304s.f4816r);
                            if (e10 != 0) {
                                c0304s.f4817s.scrollBy(0, e10);
                            }
                            c0304s.f4811m = max2;
                        }
                    }
                }
            }
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f13623G = null;
            }
            z8 = true;
        }
        if (z8) {
            e0();
            setScrollState(0);
            return true;
        }
        a aVar = this.f13614B;
        if (aVar == null) {
            return false;
        }
        boolean f11 = aVar.f();
        boolean g = this.f13614B.g();
        if (this.f13659g0 == null) {
            this.f13659g0 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int[] iArr3 = this.f13624G0;
        if (actionMasked == 0) {
            iArr3[1] = 0;
            iArr3[0] = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(iArr3[0], iArr3[1]);
        if (actionMasked == 0) {
            recyclerView = this;
            motionEvent2 = obtain;
            recyclerView.f13658f0 = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            recyclerView.f13662j0 = x10;
            recyclerView.f13660h0 = x10;
            int y11 = (int) (motionEvent.getY() + 0.5f);
            recyclerView.f13663k0 = y11;
            recyclerView.f13661i0 = y11;
            int i16 = f11;
            if (g) {
                i16 = (f11 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i16, 0);
        } else {
            if (actionMasked == 1) {
                this.f13659g0.addMovement(obtain);
                VelocityTracker velocityTracker = this.f13659g0;
                int i17 = this.f13667o0;
                velocityTracker.computeCurrentVelocity(1000, i17);
                float f12 = f11 != 0 ? -this.f13659g0.getXVelocity(this.f13658f0) : 0.0f;
                float f13 = g ? -this.f13659g0.getYVelocity(this.f13658f0) : 0.0f;
                if (f12 == 0.0f && f13 == 0.0f) {
                    recyclerView2 = this;
                    i11 = 0;
                    motionEvent4 = obtain;
                } else {
                    int i18 = (int) f12;
                    int i19 = (int) f13;
                    a aVar2 = this.f13614B;
                    if (aVar2 == null) {
                        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else if (!this.f13634M) {
                        int f14 = aVar2.f();
                        boolean g2 = this.f13614B.g();
                        int i20 = this.f13666n0;
                        if (f14 == 0 || Math.abs(i18) < i20) {
                            i18 = 0;
                        }
                        if (!g2 || Math.abs(i19) < i20) {
                            i19 = 0;
                        }
                        if (i18 != 0 || i19 != 0) {
                            if (i18 != 0) {
                                EdgeEffect edgeEffect = this.f13646W;
                                if (edgeEffect == null || vc.i.s(edgeEffect) == 0.0f) {
                                    EdgeEffect edgeEffect2 = this.f13650b0;
                                    if (edgeEffect2 != null && vc.i.s(edgeEffect2) != 0.0f) {
                                        if (i0(this.f13650b0, i18, getWidth())) {
                                            this.f13650b0.onAbsorb(i18);
                                            i18 = 0;
                                        }
                                        i7 = i18;
                                        i18 = 0;
                                    }
                                } else {
                                    int i21 = -i18;
                                    if (i0(this.f13646W, i21, getWidth())) {
                                        this.f13646W.onAbsorb(i21);
                                        i18 = 0;
                                    }
                                    i7 = i18;
                                    i18 = 0;
                                }
                                if (i19 != 0) {
                                    EdgeEffect edgeEffect3 = this.f13648a0;
                                    if (edgeEffect3 == null || vc.i.s(edgeEffect3) == 0.0f) {
                                        EdgeEffect edgeEffect4 = this.f13652c0;
                                        if (edgeEffect4 != null && vc.i.s(edgeEffect4) != 0.0f) {
                                            if (i0(this.f13652c0, i19, getHeight())) {
                                                this.f13652c0.onAbsorb(i19);
                                                i19 = 0;
                                            }
                                            i10 = 0;
                                        }
                                    } else {
                                        int i22 = -i19;
                                        if (i0(this.f13648a0, i22, getHeight())) {
                                            this.f13648a0.onAbsorb(i22);
                                            i19 = 0;
                                        }
                                        i10 = 0;
                                    }
                                    h0Var = this.f13671s0;
                                    if (i7 == 0 || i19 != 0) {
                                        int i23 = -i17;
                                        i7 = Math.max(i23, Math.min(i7, i17));
                                        i19 = Math.max(i23, Math.min(i19, i17));
                                        h0Var.a(i7, i19);
                                    }
                                    if (i18 == 0 || i10 != 0) {
                                        f4 = i18;
                                        f10 = i10;
                                        if (!dispatchNestedPreFling(f4, f10)) {
                                            boolean z12 = f14 != 0 || g2;
                                            dispatchNestedFling(f4, f10, z12);
                                            U u3 = this.f13665m0;
                                            if (u3 != null) {
                                                G g10 = (G) u3;
                                                a layoutManager = g10.f4591a.getLayoutManager();
                                                if (layoutManager != 0 && g10.f4591a.getAdapter() != null && ((Math.abs(i10) > (minFlingVelocity = g10.f4591a.getMinFlingVelocity()) || Math.abs(i18) > minFlingVelocity) && ((z10 = layoutManager instanceof d0)))) {
                                                    F f15 = !z10 ? null : new F(g10, g10.f4591a.getContext(), 0);
                                                    if (f15 != null) {
                                                        int I6 = layoutManager.I();
                                                        if (I6 != 0) {
                                                            H2.E e11 = layoutManager.g() ? g10.e(layoutManager) : layoutManager.f() ? g10.d(layoutManager) : null;
                                                            if (e11 != null) {
                                                                int y12 = layoutManager.y();
                                                                motionEvent4 = obtain;
                                                                int i24 = Integer.MIN_VALUE;
                                                                int i25 = Integer.MAX_VALUE;
                                                                int i26 = 0;
                                                                View view = null;
                                                                View view2 = null;
                                                                while (i26 < y12) {
                                                                    int i27 = y12;
                                                                    View x11 = layoutManager.x(i26);
                                                                    if (x11 == null) {
                                                                        h0Var3 = h0Var;
                                                                    } else {
                                                                        h0Var3 = h0Var;
                                                                        int b2 = G.b(x11, e11);
                                                                        if (b2 <= 0 && b2 > i24) {
                                                                            view2 = x11;
                                                                            i24 = b2;
                                                                        }
                                                                        if (b2 >= 0 && b2 < i25) {
                                                                            view = x11;
                                                                            i25 = b2;
                                                                        }
                                                                    }
                                                                    i26++;
                                                                    y12 = i27;
                                                                    h0Var = h0Var3;
                                                                }
                                                                h0Var2 = h0Var;
                                                                boolean z13 = !layoutManager.f() ? i10 <= 0 : i18 <= 0;
                                                                if (z13 && view != null) {
                                                                    O10 = a.O(view);
                                                                } else if (z13 || view2 == null) {
                                                                    if (z13) {
                                                                        view = view2;
                                                                    }
                                                                    if (view != null) {
                                                                        O10 = ((z10 && (a9 = ((d0) layoutManager).a(layoutManager.I() - 1)) != null && ((a9.x > 0.0f ? 1 : (a9.x == 0.0f ? 0 : -1)) < 0 || (a9.y > 0.0f ? 1 : (a9.y == 0.0f ? 0 : -1)) < 0)) == z13 ? -1 : 1) + a.O(view);
                                                                        if (O10 >= 0) {
                                                                        }
                                                                    }
                                                                    O10 = -1;
                                                                } else {
                                                                    O10 = a.O(view2);
                                                                }
                                                                if (O10 != -1) {
                                                                    f15.f4572a = O10;
                                                                    layoutManager.U0(f15);
                                                                }
                                                                if (z12) {
                                                                    if (g2) {
                                                                        f14 = (f14 == true ? 1 : 0) | 2;
                                                                    }
                                                                    getScrollingChildHelper().g(f14, 1);
                                                                    int i28 = -i17;
                                                                    h0Var2.a(Math.max(i28, Math.min(i18, i17)), Math.max(i28, Math.min(i10, i17)));
                                                                }
                                                                i11 = 0;
                                                                recyclerView2 = this;
                                                            }
                                                        }
                                                        h0Var2 = h0Var;
                                                        motionEvent4 = obtain;
                                                        O10 = -1;
                                                        if (O10 != -1) {
                                                        }
                                                        if (z12) {
                                                        }
                                                        i11 = 0;
                                                        recyclerView2 = this;
                                                    }
                                                }
                                            }
                                            h0Var2 = h0Var;
                                            motionEvent4 = obtain;
                                            if (z12) {
                                            }
                                            i11 = 0;
                                            recyclerView2 = this;
                                        }
                                    } else if (i7 != 0 || i19 != 0) {
                                        motionEvent4 = obtain;
                                    }
                                    e0();
                                    motionEvent3 = motionEvent4;
                                    motionEvent3.recycle();
                                    return true;
                                }
                                i10 = i19;
                                i19 = 0;
                                h0Var = this.f13671s0;
                                if (i7 == 0) {
                                }
                                int i232 = -i17;
                                i7 = Math.max(i232, Math.min(i7, i17));
                                i19 = Math.max(i232, Math.min(i19, i17));
                                h0Var.a(i7, i19);
                                if (i18 == 0) {
                                }
                                f4 = i18;
                                f10 = i10;
                                if (!dispatchNestedPreFling(f4, f10)) {
                                }
                            }
                            i7 = 0;
                            if (i19 != 0) {
                            }
                            i10 = i19;
                            i19 = 0;
                            h0Var = this.f13671s0;
                            if (i7 == 0) {
                            }
                            int i2322 = -i17;
                            i7 = Math.max(i2322, Math.min(i7, i17));
                            i19 = Math.max(i2322, Math.min(i19, i17));
                            h0Var.a(i7, i19);
                            if (i18 == 0) {
                            }
                            f4 = i18;
                            f10 = i10;
                            if (!dispatchNestedPreFling(f4, f10)) {
                            }
                        }
                    }
                    motionEvent4 = obtain;
                    i11 = 0;
                    recyclerView2 = this;
                }
                recyclerView2.setScrollState(i11);
                e0();
                motionEvent3 = motionEvent4;
                motionEvent3.recycle();
                return true;
            }
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f13658f0);
                if (findPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f13658f0 + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x12 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y13 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                int i29 = this.f13662j0 - x12;
                int i30 = this.f13663k0 - y13;
                if (this.f13656e0 != 1) {
                    if (f11 != 0) {
                        i29 = i29 > 0 ? Math.max(0, i29 - this.f13664l0) : Math.min(0, i29 + this.f13664l0);
                        if (i29 != 0) {
                            z11 = true;
                            if (g) {
                                i30 = i30 > 0 ? Math.max(0, i30 - this.f13664l0) : Math.min(0, i30 + this.f13664l0);
                                if (i30 != 0) {
                                    z11 = true;
                                }
                            }
                            if (z11) {
                                setScrollState(1);
                            }
                        }
                    }
                    z11 = false;
                    if (g) {
                    }
                    if (z11) {
                    }
                }
                if (this.f13656e0 == 1) {
                    int[] iArr4 = this.f13626H0;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    int b02 = i29 - b0(i29, motionEvent.getY());
                    int c02 = i30 - c0(i30, motionEvent.getX());
                    boolean u10 = u(f11 != 0 ? b02 : 0, g ? c02 : 0, 0, this.f13626H0, this.f13622F0);
                    int[] iArr5 = this.f13622F0;
                    if (u10) {
                        b02 -= iArr4[0];
                        c02 -= iArr4[1];
                        iArr3[0] = iArr3[0] + iArr5[0];
                        iArr3[1] = iArr3[1] + iArr5[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int i31 = b02;
                    int i32 = c02;
                    this.f13662j0 = x12 - iArr5[0];
                    this.f13663k0 = y13 - iArr5[1];
                    if (f0(f11 != 0 ? i31 : 0, g ? i32 : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    RunnableC0307v runnableC0307v = this.f13672t0;
                    if (runnableC0307v != null && (i31 != 0 || i32 != 0)) {
                        runnableC0307v.a(this, i31, i32);
                    }
                }
            } else if (actionMasked == 3) {
                e0();
                setScrollState(0);
            } else if (actionMasked == 5) {
                this.f13658f0 = motionEvent.getPointerId(actionIndex);
                int x13 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f13662j0 = x13;
                this.f13660h0 = x13;
                int y14 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f13663k0 = y14;
                this.f13661i0 = y14;
            } else if (actionMasked == 6) {
                W(motionEvent);
            }
            recyclerView = this;
            motionEvent2 = obtain;
        }
        motionEvent3 = motionEvent2;
        recyclerView.f13659g0.addMovement(motionEvent3);
        motionEvent3.recycle();
        return true;
    }

    public final void p() {
        j jVar = this.f13657f;
        C0288b c0288b = this.f13655e;
        if (!this.f13629J || this.f13641R) {
            int i7 = AbstractC2096f.f24827a;
            Trace.beginSection("RV FullInvalidate");
            r();
            Trace.endSection();
            return;
        }
        if (c0288b.j()) {
            int i10 = c0288b.f4638a;
            if ((i10 & 4) == 0 || (i10 & 11) != 0) {
                if (c0288b.j()) {
                    int i11 = AbstractC2096f.f24827a;
                    Trace.beginSection("RV FullInvalidate");
                    r();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i12 = AbstractC2096f.f24827a;
            Trace.beginSection("RV PartialInvalidate");
            n0();
            U();
            c0288b.q();
            if (!this.L) {
                int m10 = jVar.m();
                int i13 = 0;
                while (true) {
                    if (i13 < m10) {
                        i0 M3 = M(jVar.l(i13));
                        if (M3 != null && !M3.r() && M3.n()) {
                            r();
                            break;
                        }
                        i13++;
                    } else {
                        c0288b.c();
                        break;
                    }
                }
            }
            o0(true);
            V(true);
            Trace.endSection();
        }
    }

    public final void p0(int i7) {
        getScrollingChildHelper().h(i7);
    }

    public final void q(int i7, int i10) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = y1.K.f26642a;
        setMeasuredDimension(a.i(i7, paddingRight, getMinimumWidth()), a.i(i10, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void q0() {
        B b2;
        setScrollState(0);
        h0 h0Var = this.f13671s0;
        h0Var.f4700u.removeCallbacks(h0Var);
        h0Var.f4696c.abortAnimation();
        a aVar = this.f13614B;
        if (aVar == null || (b2 = aVar.f13711e) == null) {
            return;
        }
        b2.l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x0331, code lost:
    
        if (((java.util.ArrayList) r19.f13657f.f2092e).contains(getFocusedChild()) == false) goto L223;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03db  */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [int] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r() {
        i0 i0Var;
        View findViewById;
        boolean z8;
        O o10;
        ?? r32;
        RecyclerView recyclerView;
        boolean g;
        if (this.f13612A == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f13614B == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        e0 e0Var = this.f13676v0;
        boolean z10 = false;
        e0Var.f4671i = false;
        int i7 = 1;
        boolean z11 = this.f13632K0 && !(this.f13633L0 == getWidth() && this.f13635M0 == getHeight());
        this.f13633L0 = 0;
        this.f13635M0 = 0;
        this.f13632K0 = false;
        if (e0Var.f4667d == 1) {
            s();
            this.f13614B.K0(this);
            t();
        } else {
            C0288b c0288b = this.f13655e;
            if ((((ArrayList) c0288b.f4641d).isEmpty() || ((ArrayList) c0288b.f4640c).isEmpty()) && !z11 && this.f13614B.f13717n == getWidth() && this.f13614B.f13718o == getHeight()) {
                this.f13614B.K0(this);
            } else {
                this.f13614B.K0(this);
                t();
            }
        }
        e0Var.a(4);
        n0();
        U();
        e0Var.f4667d = 1;
        boolean z12 = e0Var.j;
        Y y10 = this.f13651c;
        l lVar = this.f13673u;
        if (z12) {
            int m10 = this.f13657f.m() - 1;
            while (m10 >= 0) {
                i0 M3 = M(this.f13657f.l(m10));
                if (!M3.r()) {
                    long K10 = K(M3);
                    this.f13654d0.getClass();
                    O o11 = new O(0);
                    o11.b(M3);
                    i0 i0Var2 = (i0) ((r) lVar.f23392c).b(K10);
                    if (i0Var2 == null || i0Var2.r()) {
                        lVar.e(M3, o11);
                    } else {
                        u.T t5 = (u.T) lVar.f23391b;
                        t0 t0Var = (t0) t5.get(i0Var2);
                        int i10 = (t0Var == null || (t0Var.f4831a & i7) == 0) ? 0 : i7;
                        t0 t0Var2 = (t0) t5.get(M3);
                        int i11 = (t0Var2 == null || (t0Var2.f4831a & i7) == 0) ? 0 : i7;
                        if (i10 == 0 || i0Var2 != M3) {
                            O F10 = lVar.F(i0Var2, 4);
                            lVar.e(M3, o11);
                            O F11 = lVar.F(M3, 8);
                            if (F10 == null) {
                                int m11 = this.f13657f.m();
                                for (int i12 = 0; i12 < m11; i12++) {
                                    i0 M10 = M(this.f13657f.l(i12));
                                    if (M10 != M3 && K(M10) == K10) {
                                        K k = this.f13612A;
                                        if (k == null || !k.f4600b) {
                                            StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb2.append(M10);
                                            sb2.append(" \n View Holder 2:");
                                            sb2.append(M3);
                                            throw new IllegalStateException(c.g(this, sb2));
                                        }
                                        StringBuilder sb3 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb3.append(M10);
                                        sb3.append(" \n View Holder 2:");
                                        sb3.append(M3);
                                        throw new IllegalStateException(c.g(this, sb3));
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + i0Var2 + " cannot be found but it is necessary for " + M3 + B());
                            } else {
                                i0Var2.q(false);
                                if (i10 != 0) {
                                    h(i0Var2);
                                }
                                if (i0Var2 != M3) {
                                    if (i11 != 0) {
                                        h(M3);
                                    }
                                    i0Var2.f4713h = M3;
                                    h(i0Var2);
                                    y10.m(i0Var2);
                                    M3.q(false);
                                    M3.f4714i = i0Var2;
                                }
                                if (this.f13654d0.a(i0Var2, M3, F10, F11)) {
                                    X();
                                }
                            }
                        } else {
                            lVar.e(M3, o11);
                        }
                    }
                }
                m10--;
                i7 = 1;
            }
            u.T t10 = (u.T) lVar.f23391b;
            int i13 = t10.f24637c - 1;
            while (i13 >= 0) {
                i0 i0Var3 = (i0) t10.f(i13);
                t0 t0Var3 = (t0) t10.h(i13);
                int i14 = t0Var3.f4831a;
                int i15 = i14 & 3;
                J j = this.f13637N0;
                if (i15 == 3) {
                    RecyclerView recyclerView2 = j.f4598a;
                    recyclerView2.f13614B.B0(i0Var3.f4707a, recyclerView2.f13651c);
                    r32 = z10;
                } else if ((i14 & 1) != 0) {
                    O o12 = t0Var3.f4832b;
                    if (o12 == null) {
                        RecyclerView recyclerView3 = j.f4598a;
                        recyclerView3.f13614B.B0(i0Var3.f4707a, recyclerView3.f13651c);
                        r32 = z10;
                    } else {
                        j.b(i0Var3, o12, t0Var3.f4833c);
                        r32 = z10;
                    }
                } else if ((i14 & 14) == 14) {
                    j.a(i0Var3, t0Var3.f4832b, t0Var3.f4833c);
                    r32 = z10;
                } else if ((i14 & 12) == 12) {
                    O o13 = t0Var3.f4832b;
                    O o14 = t0Var3.f4833c;
                    j.getClass();
                    i0Var3.q(z10);
                    RecyclerView recyclerView4 = j.f4598a;
                    if (!recyclerView4.f13641R) {
                        C0296j c0296j = (C0296j) recyclerView4.f13654d0;
                        c0296j.getClass();
                        int i16 = o13.f4603b;
                        int i17 = o14.f4603b;
                        if (i16 == i17 && o13.f4604c == o14.f4604c) {
                            c0296j.c(i0Var3);
                            recyclerView = recyclerView4;
                            g = false;
                        } else {
                            recyclerView = recyclerView4;
                            g = c0296j.g(i0Var3, i16, o13.f4604c, i17, o14.f4604c);
                        }
                        if (g) {
                            recyclerView.X();
                        }
                    } else if (recyclerView4.f13654d0.a(i0Var3, i0Var3, o13, o14)) {
                        recyclerView4.X();
                    }
                    r32 = 0;
                } else {
                    if ((i14 & 4) != 0) {
                        o10 = null;
                        j.b(i0Var3, t0Var3.f4832b, null);
                    } else {
                        o10 = null;
                        if ((i14 & 8) != 0) {
                            j.a(i0Var3, t0Var3.f4832b, t0Var3.f4833c);
                        }
                    }
                    r32 = 0;
                    t0Var3.f4831a = r32;
                    t0Var3.f4832b = o10;
                    t0Var3.f4833c = o10;
                    t0.f4830d.c(t0Var3);
                    i13--;
                    z10 = false;
                }
                o10 = null;
                t0Var3.f4831a = r32;
                t0Var3.f4832b = o10;
                t0Var3.f4833c = o10;
                t0.f4830d.c(t0Var3);
                i13--;
                z10 = false;
            }
        }
        View view = null;
        this.f13614B.A0(y10);
        e0Var.f4665b = e0Var.f4668e;
        this.f13641R = false;
        this.f13642S = false;
        e0Var.j = false;
        e0Var.k = false;
        this.f13614B.f13712f = false;
        ArrayList arrayList = y10.f4627b;
        if (arrayList != null) {
            arrayList.clear();
        }
        a aVar = this.f13614B;
        if (aVar.k) {
            aVar.j = 0;
            aVar.k = false;
            y10.n();
        }
        this.f13614B.q0(e0Var);
        V(true);
        o0(false);
        ((u.T) lVar.f23391b).clear();
        ((r) lVar.f23392c).a();
        int[] iArr = this.f13618D0;
        int i18 = iArr[0];
        int i19 = iArr[1];
        F(iArr);
        if ((iArr[0] == i18 && iArr[1] == i19) ? false : true) {
            w(0, 0);
        }
        if (this.f13670r0 && this.f13612A != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j10 = e0Var.f4673m;
            if (j10 != -1 && (z8 = this.f13612A.f4600b) && z8) {
                int p10 = this.f13657f.p();
                int i20 = 0;
                i0Var = null;
                while (true) {
                    if (i20 >= p10) {
                        break;
                    }
                    i0 M11 = M(this.f13657f.o(i20));
                    if (M11 != null && !M11.k() && M11.f4711e == j10) {
                        if (!((ArrayList) this.f13657f.f2092e).contains(M11.f4707a)) {
                            i0Var = M11;
                            break;
                        }
                        i0Var = M11;
                    }
                    i20++;
                }
            } else {
                i0Var = null;
            }
            if (i0Var != null) {
                ArrayList arrayList2 = (ArrayList) this.f13657f.f2092e;
                View view2 = i0Var.f4707a;
                if (!arrayList2.contains(view2) && view2.hasFocusable()) {
                    view = view2;
                    if (view != null) {
                        int i21 = e0Var.f4674n;
                        if (i21 != -1 && (findViewById = view.findViewById(i21)) != null && findViewById.isFocusable()) {
                            view = findViewById;
                        }
                        view.requestFocus();
                    }
                }
            }
            if (this.f13657f.m() > 0) {
                int i22 = e0Var.f4672l;
                int i23 = i22 != -1 ? i22 : 0;
                int b2 = e0Var.b();
                for (int i24 = i23; i24 < b2; i24++) {
                    i0 H10 = H(i24);
                    if (H10 == null) {
                        break;
                    }
                    View view3 = H10.f4707a;
                    if (view3.hasFocusable()) {
                        view = view3;
                        break;
                    }
                }
                int min = Math.min(b2, i23) - 1;
                while (true) {
                    if (min < 0) {
                        break;
                    }
                    i0 H11 = H(min);
                    if (H11 == null) {
                        break;
                    }
                    View view4 = H11.f4707a;
                    if (view4.hasFocusable()) {
                        view = view4;
                        break;
                    }
                    min--;
                }
            }
            if (view != null) {
            }
        }
        e0Var.f4673m = -1L;
        e0Var.f4672l = -1;
        e0Var.f4674n = -1;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z8) {
        i0 M3 = M(view);
        if (M3 != null) {
            if (M3.m()) {
                M3.j &= -257;
            } else if (!M3.r()) {
                StringBuilder sb2 = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb2.append(M3);
                throw new IllegalArgumentException(c.g(this, sb2));
            }
        } else if (f13602O0) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            throw new IllegalArgumentException(c.g(this, sb3));
        }
        view.clearAnimation();
        i0 M10 = M(view);
        K k = this.f13612A;
        if (k != null && M10 != null) {
            k.j(M10);
        }
        super.removeDetachedView(view, z8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f13614B.s0(this, view, view2) && view2 != null) {
            d0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z8) {
        return this.f13614B.D0(this, view, rect, z8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z8) {
        ArrayList arrayList = this.f13621F;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((C0304s) arrayList.get(i7)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z8);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f13631K != 0 || this.f13634M) {
            this.L = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s() {
        t0 t0Var;
        View D10;
        e0 e0Var = this.f13676v0;
        e0Var.a(1);
        C(e0Var);
        e0Var.f4671i = false;
        n0();
        l lVar = this.f13673u;
        ((u.T) lVar.f23391b).clear();
        r rVar = (r) lVar.f23392c;
        rVar.a();
        U();
        Y();
        i0 i0Var = null;
        View focusedChild = (this.f13670r0 && hasFocus() && this.f13612A != null) ? getFocusedChild() : null;
        if (focusedChild != null && (D10 = D(focusedChild)) != null) {
            i0Var = L(D10);
        }
        if (i0Var == null) {
            e0Var.f4673m = -1L;
            e0Var.f4672l = -1;
            e0Var.f4674n = -1;
        } else {
            e0Var.f4673m = this.f13612A.f4600b ? i0Var.f4711e : -1L;
            e0Var.f4672l = this.f13641R ? -1 : i0Var.k() ? i0Var.f4710d : i0Var.c();
            View view = i0Var.f4707a;
            int id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id = view.getId();
                }
            }
            e0Var.f4674n = id;
        }
        e0Var.f4670h = e0Var.j && this.f13684z0;
        this.f13684z0 = false;
        this.f13682y0 = false;
        e0Var.g = e0Var.k;
        e0Var.f4668e = this.f13612A.a();
        F(this.f13618D0);
        boolean z8 = e0Var.j;
        u.T t5 = (u.T) lVar.f23391b;
        if (z8) {
            int m10 = this.f13657f.m();
            for (int i7 = 0; i7 < m10; i7++) {
                i0 M3 = M(this.f13657f.l(i7));
                if (!M3.r() && (!M3.i() || this.f13612A.f4600b)) {
                    P p10 = this.f13654d0;
                    P.b(M3);
                    M3.e();
                    p10.getClass();
                    O o10 = new O(0);
                    o10.b(M3);
                    t0 t0Var2 = (t0) t5.get(M3);
                    if (t0Var2 == null) {
                        t0Var2 = t0.a();
                        t5.put(M3, t0Var2);
                    }
                    t0Var2.f4832b = o10;
                    t0Var2.f4831a |= 4;
                    if (e0Var.f4670h && M3.n() && !M3.k() && !M3.r() && !M3.i()) {
                        rVar.e(M3, K(M3));
                    }
                }
            }
        }
        if (e0Var.k) {
            int p11 = this.f13657f.p();
            for (int i10 = 0; i10 < p11; i10++) {
                i0 M10 = M(this.f13657f.o(i10));
                if (f13602O0 && M10.f4709c == -1 && !M10.k()) {
                    throw new IllegalStateException(c.g(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
                if (!M10.r() && M10.f4710d == -1) {
                    M10.f4710d = M10.f4709c;
                }
            }
            boolean z10 = e0Var.f4669f;
            e0Var.f4669f = false;
            this.f13614B.p0(this.f13651c, e0Var);
            e0Var.f4669f = z10;
            for (int i11 = 0; i11 < this.f13657f.m(); i11++) {
                i0 M11 = M(this.f13657f.l(i11));
                if (!M11.r() && ((t0Var = (t0) t5.get(M11)) == null || (t0Var.f4831a & 4) == 0)) {
                    P.b(M11);
                    boolean f4 = M11.f(8192);
                    P p12 = this.f13654d0;
                    M11.e();
                    p12.getClass();
                    O o11 = new O(0);
                    o11.b(M11);
                    if (f4) {
                        a0(M11, o11);
                    } else {
                        t0 t0Var3 = (t0) t5.get(M11);
                        if (t0Var3 == null) {
                            t0Var3 = t0.a();
                            t5.put(M11, t0Var3);
                        }
                        t0Var3.f4831a |= 2;
                        t0Var3.f4832b = o11;
                    }
                }
            }
            m();
        } else {
            m();
        }
        V(true);
        o0(false);
        e0Var.f4667d = 2;
    }

    @Override // android.view.View
    public final void scrollBy(int i7, int i10) {
        a aVar = this.f13614B;
        if (aVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f13634M) {
            return;
        }
        boolean f4 = aVar.f();
        boolean g = this.f13614B.g();
        if (f4 || g) {
            if (!f4) {
                i7 = 0;
            }
            if (!g) {
                i10 = 0;
            }
            f0(i7, i10, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i7, int i10) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!Q()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f13638O |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(k0 k0Var) {
        this.C0 = k0Var;
        y1.K.n(this, k0Var);
    }

    public void setAdapter(K k) {
        setLayoutFrozen(false);
        K k7 = this.f13612A;
        a0 a0Var = this.f13649b;
        if (k7 != null) {
            k7.f4599a.unregisterObserver(a0Var);
            this.f13612A.getClass();
        }
        P p10 = this.f13654d0;
        if (p10 != null) {
            p10.e();
        }
        a aVar = this.f13614B;
        Y y10 = this.f13651c;
        if (aVar != null) {
            aVar.z0(y10);
            this.f13614B.A0(y10);
        }
        y10.f4626a.clear();
        y10.g();
        C0288b c0288b = this.f13655e;
        c0288b.r((ArrayList) c0288b.f4640c);
        c0288b.r((ArrayList) c0288b.f4641d);
        c0288b.f4638a = 0;
        K k10 = this.f13612A;
        this.f13612A = k;
        if (k != null) {
            k.f4599a.registerObserver(a0Var);
        }
        a aVar2 = this.f13614B;
        if (aVar2 != null) {
            aVar2.Z(k10, this.f13612A);
        }
        K k11 = this.f13612A;
        y10.f4626a.clear();
        y10.g();
        y10.f(k10, true);
        X c10 = y10.c();
        if (k10 != null) {
            c10.f4624b--;
        }
        if (c10.f4624b == 0) {
            int i7 = 0;
            while (true) {
                SparseArray sparseArray = c10.f4623a;
                if (i7 >= sparseArray.size()) {
                    break;
                }
                W w10 = (W) sparseArray.valueAt(i7);
                Iterator it = w10.f4619a.iterator();
                while (it.hasNext()) {
                    b.e(((i0) it.next()).f4707a);
                }
                w10.f4619a.clear();
                i7++;
            }
        }
        if (k11 != null) {
            c10.f4624b++;
        }
        y10.e();
        this.f13676v0.f4669f = true;
        Z(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(M m10) {
        if (m10 == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z8) {
        if (z8 != this.f13675v) {
            this.f13652c0 = null;
            this.f13648a0 = null;
            this.f13650b0 = null;
            this.f13646W = null;
        }
        this.f13675v = z8;
        super.setClipToPadding(z8);
        if (this.f13629J) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(N n6) {
        n6.getClass();
        this.f13645V = n6;
        this.f13652c0 = null;
        this.f13648a0 = null;
        this.f13650b0 = null;
        this.f13646W = null;
    }

    public void setHasFixedSize(boolean z8) {
        this.f13627I = z8;
    }

    public void setItemAnimator(P p10) {
        P p11 = this.f13654d0;
        if (p11 != null) {
            p11.e();
            this.f13654d0.f4605a = null;
        }
        this.f13654d0 = p10;
        if (p10 != null) {
            p10.f4605a = this.f13613A0;
        }
    }

    public void setItemViewCacheSize(int i7) {
        Y y10 = this.f13651c;
        y10.f4630e = i7;
        y10.n();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z8) {
        suppressLayout(z8);
    }

    public void setLayoutManager(a aVar) {
        RecyclerView recyclerView;
        if (aVar == this.f13614B) {
            return;
        }
        q0();
        a aVar2 = this.f13614B;
        Y y10 = this.f13651c;
        if (aVar2 != null) {
            P p10 = this.f13654d0;
            if (p10 != null) {
                p10.e();
            }
            this.f13614B.z0(y10);
            this.f13614B.A0(y10);
            y10.f4626a.clear();
            y10.g();
            if (this.f13625H) {
                a aVar3 = this.f13614B;
                aVar3.g = false;
                aVar3.c0(this);
            }
            this.f13614B.P0(null);
            this.f13614B = null;
        } else {
            y10.f4626a.clear();
            y10.g();
        }
        j jVar = this.f13657f;
        ((A4.f) jVar.f2091d).N();
        ArrayList arrayList = (ArrayList) jVar.f2092e;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = (RecyclerView) ((i) jVar.f2090c).f3256b;
            if (size < 0) {
                break;
            }
            i0 M3 = M((View) arrayList.get(size));
            if (M3 != null) {
                int i7 = M3.f4719p;
                if (recyclerView.Q()) {
                    M3.f4720q = i7;
                    recyclerView.f13628I0.add(M3);
                } else {
                    WeakHashMap weakHashMap = y1.K.f26642a;
                    M3.f4707a.setImportantForAccessibility(i7);
                }
                M3.f4719p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            i0 M10 = M(childAt);
            K k = recyclerView.f13612A;
            if (k != null && M10 != null) {
                k.j(M10);
            }
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f13614B = aVar;
        if (aVar != null) {
            if (aVar.f13708b != null) {
                StringBuilder sb2 = new StringBuilder("LayoutManager ");
                sb2.append(aVar);
                sb2.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(c.g(aVar.f13708b, sb2));
            }
            aVar.P0(this);
            if (this.f13625H) {
                a aVar4 = this.f13614B;
                aVar4.g = true;
                aVar4.b0(this);
            }
        }
        y10.n();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z8) {
        C2363k scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f26721d) {
            WeakHashMap weakHashMap = y1.K.f26642a;
            AbstractC2352B.o(scrollingChildHelper.f26720c);
        }
        scrollingChildHelper.f26721d = z8;
    }

    public void setOnFlingListener(U u3) {
        this.f13665m0 = u3;
    }

    @Deprecated
    public void setOnScrollListener(V v10) {
        this.f13678w0 = v10;
    }

    public void setPreserveFocusAfterLayout(boolean z8) {
        this.f13670r0 = z8;
    }

    public void setRecycledViewPool(X x2) {
        Y y10 = this.f13651c;
        RecyclerView recyclerView = y10.f4632h;
        y10.f(recyclerView.f13612A, false);
        if (y10.g != null) {
            r2.f4624b--;
        }
        y10.g = x2;
        if (x2 != null && recyclerView.getAdapter() != null) {
            y10.g.f4624b++;
        }
        y10.e();
    }

    @Deprecated
    public void setRecyclerListener(Z z8) {
        this.f13616C = z8;
    }

    public void setScrollState(int i7) {
        B b2;
        if (i7 == this.f13656e0) {
            return;
        }
        if (f13603P0) {
            StringBuilder r10 = o.r(i7, "setting scroll state to ", " from ");
            r10.append(this.f13656e0);
            Log.d("RecyclerView", r10.toString(), new Exception());
        }
        this.f13656e0 = i7;
        if (i7 != 2) {
            h0 h0Var = this.f13671s0;
            h0Var.f4700u.removeCallbacks(h0Var);
            h0Var.f4696c.abortAnimation();
            a aVar = this.f13614B;
            if (aVar != null && (b2 = aVar.f13711e) != null) {
                b2.l();
            }
        }
        a aVar2 = this.f13614B;
        if (aVar2 != null) {
            aVar2.w0(i7);
        }
        V v10 = this.f13678w0;
        if (v10 != null) {
            v10.a(this, i7);
        }
        ArrayList arrayList = this.f13680x0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((V) this.f13680x0.get(size)).a(this, i7);
            }
        }
    }

    public void setScrollingTouchSlop(int i7) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i7 != 0) {
            if (i7 == 1) {
                this.f13664l0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i7 + "; using default value");
        }
        this.f13664l0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(g0 g0Var) {
        this.f13651c.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i7) {
        return getScrollingChildHelper().g(i7, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z8) {
        if (z8 != this.f13634M) {
            k("Do not suppressLayout in layout or scroll");
            if (z8) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f13634M = true;
                this.f13636N = true;
                q0();
                return;
            }
            this.f13634M = false;
            if (this.L && this.f13614B != null && this.f13612A != null) {
                requestLayout();
            }
            this.L = false;
        }
    }

    public final void t() {
        n0();
        U();
        e0 e0Var = this.f13676v0;
        e0Var.a(6);
        this.f13655e.d();
        e0Var.f4668e = this.f13612A.a();
        e0Var.f4666c = 0;
        if (this.f13653d != null) {
            K k = this.f13612A;
            int b2 = P.c.b(k.f4601c);
            if (b2 == 1 ? k.a() > 0 : b2 != 2) {
                Parcelable parcelable = this.f13653d.f4644c;
                if (parcelable != null) {
                    this.f13614B.u0(parcelable);
                }
                this.f13653d = null;
            }
        }
        e0Var.g = false;
        this.f13614B.p0(this.f13651c, e0Var);
        e0Var.f4669f = false;
        e0Var.j = e0Var.j && this.f13654d0 != null;
        e0Var.f4667d = 4;
        V(true);
        o0(false);
    }

    public final boolean u(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i7, i10, i11, iArr, iArr2);
    }

    public final void v(int i7, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        getScrollingChildHelper().d(i7, i10, i11, i12, iArr, i13, iArr2);
    }

    public final void w(int i7, int i10) {
        this.f13644U++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i7, scrollY - i10);
        V v10 = this.f13678w0;
        if (v10 != null) {
            v10.b(this, i7, i10);
        }
        ArrayList arrayList = this.f13680x0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((V) this.f13680x0.get(size)).b(this, i7, i10);
            }
        }
        this.f13644U--;
    }

    public final void x() {
        if (this.f13652c0 != null) {
            return;
        }
        ((f0) this.f13645V).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f13652c0 = edgeEffect;
        if (this.f13675v) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void y() {
        if (this.f13646W != null) {
            return;
        }
        ((f0) this.f13645V).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f13646W = edgeEffect;
        if (this.f13675v) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void z() {
        if (this.f13650b0 != null) {
            return;
        }
        ((f0) this.f13645V).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f13650b0 = edgeEffect;
        if (this.f13675v) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }
}
