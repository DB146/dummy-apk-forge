package androidx.coordinatorlayout.widget;

import H1.b;
import H2.C0297k;
import H2.O;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.kt.apps.media.xemtv.beta.R;
import h1.AbstractC1232a;
import i1.AbstractC1291b;
import i1.C1290a;
import i1.InterfaceC1292c;
import i1.d;
import i1.e;
import i1.f;
import i1.g;
import i1.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import l1.AbstractC1449a;
import q3.i;
import u.T;
import x1.C2258b;
import y1.AbstractC2352B;
import y1.AbstractC2377z;
import y1.InterfaceC2364l;
import y1.InterfaceC2365m;
import y1.K;
import y1.p0;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC2364l, InterfaceC2365m {

    /* renamed from: H, reason: collision with root package name */
    public static final String f13235H;

    /* renamed from: I, reason: collision with root package name */
    public static final Class[] f13236I;

    /* renamed from: J, reason: collision with root package name */
    public static final ThreadLocal f13237J;

    /* renamed from: K, reason: collision with root package name */
    public static final C0297k f13238K;
    public static final C2258b L;

    /* renamed from: A, reason: collision with root package name */
    public boolean f13239A;

    /* renamed from: B, reason: collision with root package name */
    public p0 f13240B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f13241C;

    /* renamed from: D, reason: collision with root package name */
    public Drawable f13242D;

    /* renamed from: E, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f13243E;

    /* renamed from: F, reason: collision with root package name */
    public C1290a f13244F;

    /* renamed from: G, reason: collision with root package name */
    public final O f13245G;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13246a;

    /* renamed from: b, reason: collision with root package name */
    public final i f13247b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f13248c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f13249d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f13250e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f13251f;

    /* renamed from: u, reason: collision with root package name */
    public boolean f13252u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f13253v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f13254w;

    /* renamed from: x, reason: collision with root package name */
    public View f13255x;

    /* renamed from: y, reason: collision with root package name */
    public View f13256y;

    /* renamed from: z, reason: collision with root package name */
    public f f13257z;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f13235H = r02 != null ? r02.getName() : null;
        f13238K = new C0297k(14);
        f13236I = new Class[]{Context.class, AttributeSet.class};
        f13237J = new ThreadLocal();
        L = new C2258b(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f13246a = new ArrayList();
        this.f13247b = new i(8);
        this.f13248c = new ArrayList();
        this.f13249d = new ArrayList();
        this.f13250e = new int[2];
        this.f13251f = new int[2];
        this.f13245G = new O(9);
        int[] iArr = AbstractC1232a.f17637a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f13254w = intArray;
            float f4 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i7 = 0; i7 < length; i7++) {
                this.f13254w[i7] = (int) (r2[i7] * f4);
            }
        }
        this.f13242D = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new d(this));
        WeakHashMap weakHashMap = K.f26642a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect d() {
        Rect rect = (Rect) L.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i7, Rect rect, Rect rect2, e eVar, int i10, int i11) {
        int i12 = eVar.f18191c;
        if (i12 == 0) {
            i12 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i12, i7);
        int i13 = eVar.f18192d;
        if ((i13 & 7) == 0) {
            i13 |= 8388611;
        }
        if ((i13 & 112) == 0) {
            i13 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i13, i7);
        int i14 = absoluteGravity & 7;
        int i15 = absoluteGravity & 112;
        int i16 = absoluteGravity2 & 7;
        int i17 = absoluteGravity2 & 112;
        int width = i16 != 1 ? i16 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i17 != 16 ? i17 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i14 == 1) {
            width -= i10 / 2;
        } else if (i14 != 5) {
            width -= i10;
        }
        if (i15 == 16) {
            height -= i11 / 2;
        } else if (i15 != 80) {
            height -= i11;
        }
        rect2.set(width, height, i10 + width, i11 + height);
    }

    public static e n(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.f18190b) {
            InterfaceC1292c interfaceC1292c = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                interfaceC1292c = (InterfaceC1292c) cls.getAnnotation(InterfaceC1292c.class);
                if (interfaceC1292c != null) {
                    break;
                }
            }
            if (interfaceC1292c != null) {
                try {
                    AbstractC1291b abstractC1291b = (AbstractC1291b) interfaceC1292c.value().getDeclaredConstructor(null).newInstance(null);
                    AbstractC1291b abstractC1291b2 = eVar.f18189a;
                    if (abstractC1291b2 != abstractC1291b) {
                        if (abstractC1291b2 != null) {
                            abstractC1291b2.i();
                        }
                        eVar.f18189a = abstractC1291b;
                        eVar.f18190b = true;
                        if (abstractC1291b != null) {
                            abstractC1291b.g(eVar);
                        }
                    }
                } catch (Exception e2) {
                    Log.e("CoordinatorLayout", "Default behavior class " + interfaceC1292c.value().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                }
            }
            eVar.f18190b = true;
        }
        return eVar;
    }

    public static void u(View view, int i7) {
        e eVar = (e) view.getLayoutParams();
        int i10 = eVar.f18196i;
        if (i10 != i7) {
            WeakHashMap weakHashMap = K.f26642a;
            view.offsetLeftAndRight(i7 - i10);
            eVar.f18196i = i7;
        }
    }

    public static void v(View view, int i7) {
        e eVar = (e) view.getLayoutParams();
        int i10 = eVar.j;
        if (i10 != i7) {
            WeakHashMap weakHashMap = K.f26642a;
            view.offsetTopAndBottom(i7 - i10);
            eVar.j = i7;
        }
    }

    @Override // y1.InterfaceC2364l
    public final void a(View view, View view2, int i7, int i10) {
        O o10 = this.f13245G;
        if (i10 == 1) {
            o10.f4604c = i7;
        } else {
            o10.f4603b = i7;
        }
        this.f13256y = view2;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ((e) getChildAt(i11).getLayoutParams()).getClass();
        }
    }

    @Override // y1.InterfaceC2364l
    public final void b(View view, int i7) {
        O o10 = this.f13245G;
        if (i7 == 1) {
            o10.f4604c = 0;
        } else {
            o10.f4603b = 0;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.a(i7)) {
                AbstractC1291b abstractC1291b = eVar.f18189a;
                if (abstractC1291b != null) {
                    abstractC1291b.t(childAt, view, i7);
                }
                if (i7 == 0) {
                    eVar.f18198m = false;
                } else if (i7 == 1) {
                    eVar.f18199n = false;
                }
            }
        }
        this.f13256y = null;
    }

    @Override // y1.InterfaceC2364l
    public final void c(View view, int i7, int i10, int[] iArr, int i11) {
        AbstractC1291b abstractC1291b;
        int childCount = getChildCount();
        boolean z8 = false;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i11) && (abstractC1291b = eVar.f18189a) != null) {
                    int[] iArr2 = this.f13250e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC1291b.n(this, childAt, view, i7, i10, iArr2, i11);
                    i12 = i7 > 0 ? Math.max(i12, iArr2[0]) : Math.min(i12, iArr2[0]);
                    i13 = i10 > 0 ? Math.max(i13, iArr2[1]) : Math.min(i13, iArr2[1]);
                    z8 = true;
                }
            }
        }
        iArr[0] = i12;
        iArr[1] = i13;
        if (z8) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        AbstractC1291b abstractC1291b = ((e) view.getLayoutParams()).f18189a;
        if (abstractC1291b != null) {
            abstractC1291b.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f13242D;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final void e(e eVar, Rect rect, int i7, int i10) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i7) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i10) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        rect.set(max, max2, i7 + max, i10 + max2);
    }

    public final void f(View view, Rect rect, boolean z8) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z8) {
            k(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // y1.InterfaceC2365m
    public final void g(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        AbstractC1291b abstractC1291b;
        int childCount = getChildCount();
        boolean z8 = false;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i13) && (abstractC1291b = eVar.f18189a) != null) {
                    int[] iArr2 = this.f13250e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC1291b.o(this, childAt, i10, i11, i12, iArr2);
                    i14 = i11 > 0 ? Math.max(i14, iArr2[0]) : Math.min(i14, iArr2[0]);
                    i15 = i12 > 0 ? Math.max(i15, iArr2[1]) : Math.min(i15, iArr2[1]);
                    z8 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i14;
        iArr[1] = iArr[1] + i15;
        if (z8) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.f13246a);
    }

    public final p0 getLastWindowInsets() {
        return this.f13240B;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        O o10 = this.f13245G;
        return o10.f4604c | o10.f4603b;
    }

    public Drawable getStatusBarBackground() {
        return this.f13242D;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // y1.InterfaceC2364l
    public final void h(View view, int i7, int i10, int i11, int i12, int i13) {
        g(view, i7, i10, i11, i12, 0, this.f13251f);
    }

    @Override // y1.InterfaceC2364l
    public final boolean i(View view, View view2, int i7, int i10) {
        int childCount = getChildCount();
        boolean z8 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                AbstractC1291b abstractC1291b = eVar.f18189a;
                if (abstractC1291b != null) {
                    boolean s3 = abstractC1291b.s(childAt, i7, i10);
                    z8 |= s3;
                    if (i10 == 0) {
                        eVar.f18198m = s3;
                    } else if (i10 == 1) {
                        eVar.f18199n = s3;
                    }
                } else if (i10 == 0) {
                    eVar.f18198m = false;
                } else if (i10 == 1) {
                    eVar.f18199n = false;
                }
            }
        }
        return z8;
    }

    public final ArrayList j(View view) {
        T t5 = (T) this.f13247b.f23383b;
        int i7 = t5.f24637c;
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < i7; i10++) {
            ArrayList arrayList2 = (ArrayList) t5.k(i10);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(t5.f(i10));
            }
        }
        ArrayList arrayList3 = this.f13249d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(Rect rect, View view) {
        ThreadLocal threadLocal = h.f18204a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = h.f18204a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        h.a(this, view, matrix);
        ThreadLocal threadLocal3 = h.f18205b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i7) {
        int[] iArr = this.f13254w;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i7);
            return 0;
        }
        if (i7 >= 0 && i7 < iArr.length) {
            return iArr[i7];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i7 + " out of range for " + this);
        return 0;
    }

    public final boolean o(View view, int i7, int i10) {
        C2258b c2258b = L;
        Rect d10 = d();
        k(d10, view);
        try {
            return d10.contains(i7, i10);
        } finally {
            d10.setEmpty();
            c2258b.c(d10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = 0;
        t(false);
        if (this.f13239A) {
            if (this.f13257z == null) {
                this.f13257z = new f(this, i7);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f13257z);
        }
        if (this.f13240B == null) {
            WeakHashMap weakHashMap = K.f26642a;
            if (getFitsSystemWindows()) {
                AbstractC2377z.c(this);
            }
        }
        this.f13253v = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f13239A && this.f13257z != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f13257z);
        }
        View view = this.f13256y;
        if (view != null) {
            b(view, 0);
        }
        this.f13253v = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f13241C || this.f13242D == null) {
            return;
        }
        p0 p0Var = this.f13240B;
        int d10 = p0Var != null ? p0Var.d() : 0;
        if (d10 > 0) {
            this.f13242D.setBounds(0, 0, getWidth(), d10);
            this.f13242D.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r10 = r(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            t(true);
        }
        return r10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        AbstractC1291b abstractC1291b;
        WeakHashMap weakHashMap = K.f26642a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f13246a;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            View view = (View) arrayList.get(i13);
            if (view.getVisibility() != 8 && ((abstractC1291b = ((e) view.getLayoutParams()).f18189a) == null || !abstractC1291b.k(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0186, code lost:
    
        if (r0.l(r31, r20, r25, r8, r26) == false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0189  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i10) {
        boolean z8;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        AbstractC1291b abstractC1291b;
        int i17;
        ArrayList arrayList;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z10;
        int i23;
        int i24;
        boolean z11;
        int max;
        int i25 = 0;
        s();
        int childCount = getChildCount();
        int i26 = 0;
        loop0: while (true) {
            if (i26 >= childCount) {
                z8 = false;
                break;
            }
            View childAt = getChildAt(i26);
            T t5 = (T) this.f13247b.f23383b;
            int i27 = t5.f24637c;
            for (int i28 = 0; i28 < i27; i28++) {
                ArrayList arrayList2 = (ArrayList) t5.k(i28);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z8 = true;
                    break loop0;
                }
            }
            i26++;
        }
        if (z8 != this.f13239A) {
            if (z8) {
                if (this.f13253v) {
                    if (this.f13257z == null) {
                        this.f13257z = new f(this, i25);
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.f13257z);
                }
                this.f13239A = true;
            } else {
                if (this.f13253v && this.f13257z != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.f13257z);
                }
                this.f13239A = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = K.f26642a;
        int layoutDirection = getLayoutDirection();
        boolean z12 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        int i29 = paddingLeft + paddingRight;
        int i30 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z13 = this.f13240B != null && getFitsSystemWindows();
        ArrayList arrayList3 = this.f13246a;
        int size3 = arrayList3.size();
        int i31 = suggestedMinimumWidth;
        int i32 = suggestedMinimumHeight;
        int i33 = 0;
        int i34 = 0;
        while (i34 < size3) {
            View view = (View) arrayList3.get(i34);
            if (view.getVisibility() == 8) {
                i19 = i34;
                i17 = size3;
                arrayList = arrayList3;
                i21 = paddingLeft;
                i23 = paddingRight;
                i18 = layoutDirection;
                z11 = true;
                z10 = false;
            } else {
                e eVar = (e) view.getLayoutParams();
                int i35 = eVar.f18193e;
                if (i35 < 0 || mode == 0) {
                    i11 = i33;
                    i12 = i34;
                } else {
                    int m10 = m(i35);
                    i11 = i33;
                    int i36 = eVar.f18191c;
                    if (i36 == 0) {
                        i36 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i36, layoutDirection) & 7;
                    i12 = i34;
                    if ((absoluteGravity == 3 && !z12) || (absoluteGravity == 5 && z12)) {
                        max = Math.max(0, (size - paddingRight) - m10);
                    } else if ((absoluteGravity == 5 && !z12) || (absoluteGravity == 3 && z12)) {
                        max = Math.max(0, m10 - paddingLeft);
                    }
                    i13 = max;
                    if (z13 || view.getFitsSystemWindows()) {
                        i14 = i32;
                        i15 = i7;
                        i16 = i10;
                    } else {
                        int c10 = this.f13240B.c() + this.f13240B.b();
                        i14 = i32;
                        int a9 = this.f13240B.a() + this.f13240B.d();
                        i15 = View.MeasureSpec.makeMeasureSpec(size - c10, mode);
                        i16 = View.MeasureSpec.makeMeasureSpec(size2 - a9, mode2);
                    }
                    abstractC1291b = eVar.f18189a;
                    if (abstractC1291b == null) {
                        int i37 = i11;
                        i19 = i12;
                        z10 = false;
                        i21 = paddingLeft;
                        i22 = i37;
                        int i38 = i14;
                        i23 = paddingRight;
                        i24 = i38;
                        i18 = layoutDirection;
                        i20 = i31;
                        i17 = size3;
                        arrayList = arrayList3;
                    } else {
                        i17 = size3;
                        arrayList = arrayList3;
                        i18 = layoutDirection;
                        i19 = i12;
                        i20 = i31;
                        i21 = paddingLeft;
                        i22 = i11;
                        z10 = false;
                        int i39 = i14;
                        i23 = paddingRight;
                        i24 = i39;
                    }
                    measureChildWithMargins(view, i15, i13, i16, 0);
                    int max2 = Math.max(i20, view.getMeasuredWidth() + i29 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                    int max3 = Math.max(i24, view.getMeasuredHeight() + i30 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                    i31 = max2;
                    i33 = View.combineMeasuredStates(i22, view.getMeasuredState());
                    i32 = max3;
                    z11 = true;
                }
                i13 = 0;
                if (z13) {
                }
                i14 = i32;
                i15 = i7;
                i16 = i10;
                abstractC1291b = eVar.f18189a;
                if (abstractC1291b == null) {
                }
                measureChildWithMargins(view, i15, i13, i16, 0);
                int max22 = Math.max(i20, view.getMeasuredWidth() + i29 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                int max32 = Math.max(i24, view.getMeasuredHeight() + i30 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                i31 = max22;
                i33 = View.combineMeasuredStates(i22, view.getMeasuredState());
                i32 = max32;
                z11 = true;
            }
            i34 = i19 + 1;
            paddingLeft = i21;
            paddingRight = i23;
            layoutDirection = i18;
            size3 = i17;
            arrayList3 = arrayList;
        }
        int i40 = i33;
        setMeasuredDimension(View.resolveSizeAndState(i31, i7, (-16777216) & i40), View.resolveSizeAndState(i32, i10, i40 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f4, float f10, boolean z8) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0)) {
                    AbstractC1291b abstractC1291b = eVar.f18189a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f4, float f10) {
        AbstractC1291b abstractC1291b;
        int childCount = getChildCount();
        boolean z8 = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0) && (abstractC1291b = eVar.f18189a) != null) {
                    z8 |= abstractC1291b.m(view);
                }
            }
        }
        return z8;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr) {
        c(view, i7, i10, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        h(view, i7, i10, i11, i12, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        a(view, view2, i7, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.f4568a);
        SparseArray sparseArray = gVar.f18203c;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            int id = childAt.getId();
            AbstractC1291b abstractC1291b = n(childAt).f18189a;
            if (id != -1 && abstractC1291b != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC1291b.q(childAt, parcelable2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i1.g, android.os.Parcelable, H1.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable r10;
        ?? bVar = new b(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            int id = childAt.getId();
            AbstractC1291b abstractC1291b = ((e) childAt.getLayoutParams()).f18189a;
            if (id != -1 && abstractC1291b != null && (r10 = abstractC1291b.r(childAt)) != null) {
                sparseArray.append(id, r10);
            }
        }
        bVar.f18203c = sparseArray;
        return bVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        return i(view, view2, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z8;
        boolean u3;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f13255x == null) {
            z8 = r(motionEvent, 1);
        } else {
            z8 = false;
        }
        AbstractC1291b abstractC1291b = ((e) this.f13255x.getLayoutParams()).f18189a;
        if (abstractC1291b != null) {
            u3 = abstractC1291b.u(this.f13255x, motionEvent);
            motionEvent2 = null;
            if (this.f13255x != null) {
                u3 |= super.onTouchEvent(motionEvent);
            } else if (z8) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                t(false);
            }
            return u3;
        }
        u3 = false;
        motionEvent2 = null;
        if (this.f13255x != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked != 1) {
        }
        t(false);
        return u3;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x004b A[EDGE_INSN: B:114:0x004b->B:9:0x004b BREAK  A[LOOP:2: B:106:0x02db->B:112:0x02f2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(int i7) {
        int i10;
        Rect rect;
        int i11;
        Rect rect2;
        int i12;
        Rect rect3;
        int i13;
        int i14;
        ArrayList arrayList;
        boolean z8;
        int i15;
        int i16;
        int width;
        int i17;
        int i18;
        int i19;
        int height;
        int i20;
        int i21;
        int i22;
        e eVar;
        int i23;
        C2258b c2258b;
        int i24;
        Rect rect4;
        Rect rect5;
        Rect rect6;
        ArrayList arrayList2;
        int i25;
        AbstractC1291b abstractC1291b;
        int i26 = i7;
        WeakHashMap weakHashMap = K.f26642a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList3 = this.f13246a;
        int size = arrayList3.size();
        Rect d10 = d();
        Rect d11 = d();
        Rect d12 = d();
        int i27 = 0;
        while (true) {
            C2258b c2258b2 = L;
            if (i27 >= size) {
                Rect rect7 = d12;
                Rect rect8 = d11;
                Rect rect9 = d10;
                rect9.setEmpty();
                c2258b2.c(rect9);
                rect8.setEmpty();
                c2258b2.c(rect8);
                rect7.setEmpty();
                c2258b2.c(rect7);
                return;
            }
            View view = (View) arrayList3.get(i27);
            e eVar2 = (e) view.getLayoutParams();
            if (i26 == 0 && view.getVisibility() == 8) {
                i12 = i26;
                i11 = layoutDirection;
                i10 = i27;
                rect3 = d12;
                rect = d11;
                rect2 = d10;
                arrayList = arrayList3;
                i14 = size;
            } else {
                int i28 = 0;
                while (i28 < i27) {
                    if (eVar2.f18197l == ((View) arrayList3.get(i28))) {
                        e eVar3 = (e) view.getLayoutParams();
                        if (eVar3.k != null) {
                            Rect d13 = d();
                            Rect d14 = d();
                            arrayList2 = arrayList3;
                            Rect d15 = d();
                            k(d13, eVar3.k);
                            f(view, d14, false);
                            i25 = size;
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            eVar = eVar2;
                            c2258b = c2258b2;
                            i24 = i27;
                            i23 = layoutDirection;
                            rect4 = d12;
                            rect5 = d11;
                            rect6 = d10;
                            l(layoutDirection, d13, d15, eVar3, measuredWidth, measuredHeight);
                            boolean z10 = (d15.left == d14.left && d15.top == d14.top) ? false : true;
                            e(eVar3, d15, measuredWidth, measuredHeight);
                            int i29 = d15.left - d14.left;
                            int i30 = d15.top - d14.top;
                            if (i29 != 0) {
                                WeakHashMap weakHashMap2 = K.f26642a;
                                view.offsetLeftAndRight(i29);
                            }
                            if (i30 != 0) {
                                WeakHashMap weakHashMap3 = K.f26642a;
                                view.offsetTopAndBottom(i30);
                            }
                            if (z10 && (abstractC1291b = eVar3.f18189a) != null) {
                                abstractC1291b.h(this, view, eVar3.k);
                            }
                            d13.setEmpty();
                            c2258b.c(d13);
                            d14.setEmpty();
                            c2258b.c(d14);
                            d15.setEmpty();
                            c2258b.c(d15);
                            i28++;
                            c2258b2 = c2258b;
                            size = i25;
                            arrayList3 = arrayList2;
                            layoutDirection = i23;
                            eVar2 = eVar;
                            i27 = i24;
                            d12 = rect4;
                            d11 = rect5;
                            d10 = rect6;
                        }
                    }
                    eVar = eVar2;
                    i23 = layoutDirection;
                    c2258b = c2258b2;
                    i24 = i27;
                    rect4 = d12;
                    rect5 = d11;
                    rect6 = d10;
                    arrayList2 = arrayList3;
                    i25 = size;
                    i28++;
                    c2258b2 = c2258b;
                    size = i25;
                    arrayList3 = arrayList2;
                    layoutDirection = i23;
                    eVar2 = eVar;
                    i27 = i24;
                    d12 = rect4;
                    d11 = rect5;
                    d10 = rect6;
                }
                e eVar4 = eVar2;
                int i31 = layoutDirection;
                b1.d dVar = c2258b2;
                i10 = i27;
                Rect rect10 = d12;
                rect = d11;
                Rect rect11 = d10;
                ArrayList arrayList4 = arrayList3;
                int i32 = size;
                f(view, rect, true);
                if (eVar4.g == 0 || rect.isEmpty()) {
                    i11 = i31;
                    rect2 = rect11;
                } else {
                    i11 = i31;
                    int absoluteGravity = Gravity.getAbsoluteGravity(eVar4.g, i11);
                    int i33 = absoluteGravity & 112;
                    if (i33 == 48) {
                        rect2 = rect11;
                        rect2.top = Math.max(rect2.top, rect.bottom);
                    } else if (i33 != 80) {
                        rect2 = rect11;
                    } else {
                        rect2 = rect11;
                        rect2.bottom = Math.max(rect2.bottom, getHeight() - rect.top);
                    }
                    int i34 = absoluteGravity & 7;
                    if (i34 == 3) {
                        rect2.left = Math.max(rect2.left, rect.right);
                    } else if (i34 == 5) {
                        rect2.right = Math.max(rect2.right, getWidth() - rect.left);
                    }
                }
                if (eVar4.f18195h != 0 && view.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = K.f26642a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        e eVar5 = (e) view.getLayoutParams();
                        AbstractC1291b abstractC1291b2 = eVar5.f18189a;
                        Rect d16 = d();
                        Rect d17 = d();
                        d17.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (abstractC1291b2 == null || !abstractC1291b2.e(view)) {
                            d16.set(d17);
                        } else if (!d17.contains(d16)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + d16.toShortString() + " | Bounds:" + d17.toShortString());
                        }
                        d17.setEmpty();
                        dVar.c(d17);
                        if (!d16.isEmpty()) {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(eVar5.f18195h, i11);
                            if ((absoluteGravity2 & 48) != 48 || (i21 = (d16.top - ((ViewGroup.MarginLayoutParams) eVar5).topMargin) - eVar5.j) >= (i22 = rect2.top)) {
                                z8 = false;
                            } else {
                                v(view, i22 - i21);
                                z8 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - d16.bottom) - ((ViewGroup.MarginLayoutParams) eVar5).bottomMargin) + eVar5.j) < (i20 = rect2.bottom)) {
                                v(view, height - i20);
                                z8 = true;
                            }
                            if (z8) {
                                i15 = 0;
                            } else {
                                i15 = 0;
                                v(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i18 = (d16.left - ((ViewGroup.MarginLayoutParams) eVar5).leftMargin) - eVar5.f18196i) >= (i19 = rect2.left)) {
                                i16 = i15;
                            } else {
                                u(view, i19 - i18);
                                i16 = 1;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - d16.right) - ((ViewGroup.MarginLayoutParams) eVar5).rightMargin) + eVar5.f18196i) < (i17 = rect2.right)) {
                                u(view, width - i17);
                                i16 = 1;
                            }
                            if (i16 == 0) {
                                u(view, i15);
                            }
                            d16.setEmpty();
                            dVar.c(d16);
                            i12 = i7;
                            if (i12 == 2) {
                                rect3 = rect10;
                                rect3.set(((e) view.getLayoutParams()).f18200o);
                                if (rect3.equals(rect)) {
                                    i14 = i32;
                                    arrayList = arrayList4;
                                } else {
                                    ((e) view.getLayoutParams()).f18200o.set(rect);
                                }
                            } else {
                                rect3 = rect10;
                            }
                            i13 = i10 + 1;
                            i14 = i32;
                            while (true) {
                                arrayList = arrayList4;
                                if (i13 < i14) {
                                    break;
                                }
                                View view2 = (View) arrayList.get(i13);
                                AbstractC1291b abstractC1291b3 = ((e) view2.getLayoutParams()).f18189a;
                                if (abstractC1291b3 != null) {
                                    abstractC1291b3.f(view2);
                                }
                                i13++;
                                arrayList4 = arrayList;
                            }
                        } else {
                            d16.setEmpty();
                            dVar.c(d16);
                        }
                    }
                }
                i12 = i7;
                if (i12 == 2) {
                }
                i13 = i10 + 1;
                i14 = i32;
                while (true) {
                    arrayList = arrayList4;
                    if (i13 < i14) {
                    }
                    i13++;
                    arrayList4 = arrayList;
                }
            }
            size = i14;
            i27 = i10 + 1;
            d11 = rect;
            i26 = i12;
            d12 = rect3;
            arrayList3 = arrayList;
            d10 = rect2;
            layoutDirection = i11;
        }
    }

    public final void q(View view, int i7) {
        Rect d10;
        Rect d11;
        e eVar = (e) view.getLayoutParams();
        View view2 = eVar.k;
        if (view2 == null && eVar.f18194f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        C2258b c2258b = L;
        if (view2 != null) {
            d10 = d();
            d11 = d();
            try {
                k(d10, view2);
                e eVar2 = (e) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i7, d10, d11, eVar2, measuredWidth, measuredHeight);
                e(eVar2, d11, measuredWidth, measuredHeight);
                view.layout(d11.left, d11.top, d11.right, d11.bottom);
                return;
            } finally {
                d10.setEmpty();
                c2258b.c(d10);
                d11.setEmpty();
                c2258b.c(d11);
            }
        }
        int i10 = eVar.f18193e;
        if (i10 < 0) {
            e eVar3 = (e) view.getLayoutParams();
            d10 = d();
            d10.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin);
            if (this.f13240B != null) {
                WeakHashMap weakHashMap = K.f26642a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    d10.left = this.f13240B.b() + d10.left;
                    d10.top = this.f13240B.d() + d10.top;
                    d10.right -= this.f13240B.c();
                    d10.bottom -= this.f13240B.a();
                }
            }
            d11 = d();
            int i11 = eVar3.f18191c;
            if ((i11 & 7) == 0) {
                i11 |= 8388611;
            }
            if ((i11 & 112) == 0) {
                i11 |= 48;
            }
            Gravity.apply(i11, view.getMeasuredWidth(), view.getMeasuredHeight(), d10, d11, i7);
            view.layout(d11.left, d11.top, d11.right, d11.bottom);
            return;
        }
        e eVar4 = (e) view.getLayoutParams();
        int i12 = eVar4.f18191c;
        if (i12 == 0) {
            i12 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i12, i7);
        int i13 = absoluteGravity & 7;
        int i14 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i7 == 1) {
            i10 = width - i10;
        }
        int m10 = m(i10) - measuredWidth2;
        if (i13 == 1) {
            m10 += measuredWidth2 / 2;
        } else if (i13 == 5) {
            m10 += measuredWidth2;
        }
        int i15 = i14 != 16 ? i14 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar4).leftMargin, Math.min(m10, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) eVar4).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar4).topMargin, Math.min(i15, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    public final boolean r(MotionEvent motionEvent, int i7) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f13248c;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        C0297k c0297k = f13238K;
        if (c0297k != null) {
            Collections.sort(arrayList, c0297k);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z8 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) arrayList.get(i11);
            AbstractC1291b abstractC1291b = ((e) view.getLayoutParams()).f18189a;
            if (z8 && actionMasked != 0) {
                if (abstractC1291b != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i7 == 0) {
                        abstractC1291b.j(this, view, motionEvent2);
                    } else if (i7 == 1) {
                        abstractC1291b.u(view, motionEvent2);
                    }
                }
            } else if (!z8 && abstractC1291b != null) {
                if (i7 == 0) {
                    z8 = abstractC1291b.j(this, view, motionEvent);
                } else if (i7 == 1) {
                    z8 = abstractC1291b.u(view, motionEvent);
                }
                if (z8) {
                    this.f13255x = view;
                }
            }
        }
        arrayList.clear();
        return z8;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z8) {
        AbstractC1291b abstractC1291b = ((e) view.getLayoutParams()).f18189a;
        if (abstractC1291b != null) {
            abstractC1291b.p(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z8) {
        super.requestDisallowInterceptTouchEvent(z8);
        if (!z8 || this.f13252u) {
            return;
        }
        t(false);
        this.f13252u = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0144, code lost:
    
        throw new java.lang.IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        b1.d dVar;
        ArrayList arrayList = this.f13246a;
        arrayList.clear();
        i iVar = this.f13247b;
        T t5 = (T) iVar.f23383b;
        int i7 = t5.f24637c;
        int i10 = 0;
        while (true) {
            dVar = (b1.d) iVar.f23382a;
            if (i10 >= i7) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) t5.k(i10);
            if (arrayList2 != null) {
                arrayList2.clear();
                dVar.c(arrayList2);
            }
            i10++;
        }
        t5.clear();
        int childCount = getChildCount();
        int i11 = 0;
        loop1: while (true) {
            T t10 = (T) iVar.f23383b;
            if (i11 >= childCount) {
                ArrayList arrayList3 = (ArrayList) iVar.f23384c;
                arrayList3.clear();
                HashSet hashSet = (HashSet) iVar.f23385d;
                hashSet.clear();
                int i12 = t10.f24637c;
                for (int i13 = 0; i13 < i12; i13++) {
                    iVar.q(t10.f(i13), arrayList3, hashSet);
                }
                arrayList.addAll(arrayList3);
                Collections.reverse(arrayList);
                return;
            }
            View childAt = getChildAt(i11);
            e n6 = n(childAt);
            int i14 = n6.f18194f;
            if (i14 == -1) {
                n6.f18197l = null;
                n6.k = null;
            } else {
                View view = n6.k;
                if (view != null && view.getId() == i14) {
                    View view2 = n6.k;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent == null || parent == childAt) {
                            n6.f18197l = null;
                            n6.k = null;
                        } else {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                        }
                    }
                    n6.f18197l = view2;
                }
                View findViewById = findViewById(i14);
                n6.k = findViewById;
                if (findViewById == null) {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i14) + " to anchor view " + childAt);
                    }
                    n6.f18197l = null;
                    n6.k = null;
                } else if (findViewById != this) {
                    for (ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                        if (parent2 != childAt) {
                            if (parent2 instanceof View) {
                                findViewById = parent2;
                            }
                        } else {
                            if (!isInEditMode()) {
                                throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                            }
                            n6.f18197l = null;
                            n6.k = null;
                        }
                    }
                    n6.f18197l = findViewById;
                } else {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                    }
                    n6.f18197l = null;
                    n6.k = null;
                }
            }
            if (!t10.containsKey(childAt)) {
                t10.put(childAt, null);
            }
            for (int i15 = 0; i15 < childCount; i15++) {
                if (i15 != i11) {
                    View childAt2 = getChildAt(i15);
                    if (childAt2 != n6.f18197l) {
                        WeakHashMap weakHashMap = K.f26642a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((e) childAt2.getLayoutParams()).g, layoutDirection);
                        if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(n6.f18195h, layoutDirection) & absoluteGravity) != absoluteGravity) {
                            AbstractC1291b abstractC1291b = n6.f18189a;
                            if (abstractC1291b != null) {
                                abstractC1291b.f(childAt);
                            }
                        }
                    }
                    if (!t10.containsKey(childAt2) && !t10.containsKey(childAt2)) {
                        t10.put(childAt2, null);
                    }
                    if (!t10.containsKey(childAt2) || !t10.containsKey(childAt)) {
                        break loop1;
                    }
                    ArrayList arrayList4 = (ArrayList) t10.get(childAt2);
                    if (arrayList4 == null) {
                        arrayList4 = (ArrayList) dVar.a();
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        t10.put(childAt2, arrayList4);
                    }
                    arrayList4.add(childAt);
                }
            }
            i11++;
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z8) {
        super.setFitsSystemWindows(z8);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f13243E = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f13242D;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f13242D = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f13242D.setState(getDrawableState());
                }
                Drawable drawable3 = this.f13242D;
                WeakHashMap weakHashMap = K.f26642a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f13242D.setVisible(getVisibility() == 0, false);
                this.f13242D.setCallback(this);
            }
            WeakHashMap weakHashMap2 = K.f26642a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i7) {
        setStatusBarBackground(new ColorDrawable(i7));
    }

    public void setStatusBarBackgroundResource(int i7) {
        setStatusBarBackground(i7 != 0 ? AbstractC1449a.getDrawable(getContext(), i7) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z8 = i7 == 0;
        Drawable drawable = this.f13242D;
        if (drawable == null || drawable.isVisible() == z8) {
            return;
        }
        this.f13242D.setVisible(z8, false);
    }

    public final void t(boolean z8) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            AbstractC1291b abstractC1291b = ((e) childAt.getLayoutParams()).f18189a;
            if (abstractC1291b != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z8) {
                    abstractC1291b.j(this, childAt, obtain);
                } else {
                    abstractC1291b.u(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            ((e) getChildAt(i10).getLayoutParams()).getClass();
        }
        this.f13255x = null;
        this.f13252u = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f13242D;
    }

    public final void w() {
        WeakHashMap weakHashMap = K.f26642a;
        if (!getFitsSystemWindows()) {
            AbstractC2352B.l(this, null);
            return;
        }
        if (this.f13244F == null) {
            this.f13244F = new C1290a(this, 0);
        }
        AbstractC2352B.l(this, this.f13244F);
        setSystemUiVisibility(1280);
    }
}
