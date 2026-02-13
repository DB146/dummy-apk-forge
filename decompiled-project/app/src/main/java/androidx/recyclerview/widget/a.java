package androidx.recyclerview.widget;

import A3.c;
import A4.f;
import B4.j;
import D5.i;
import H2.B;
import H2.C0305t;
import H2.K;
import H2.P;
import H2.S;
import H2.T;
import H2.Y;
import H2.e0;
import H2.h0;
import H2.i0;
import H2.t0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import g3.C1191j;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q3.e;
import y1.C2355c;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public j f13707a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f13708b;

    /* renamed from: c, reason: collision with root package name */
    public final e f13709c;

    /* renamed from: d, reason: collision with root package name */
    public final e f13710d;

    /* renamed from: e, reason: collision with root package name */
    public B f13711e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13712f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f13713h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f13714i;
    public int j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public int f13715l;

    /* renamed from: m, reason: collision with root package name */
    public int f13716m;

    /* renamed from: n, reason: collision with root package name */
    public int f13717n;

    /* renamed from: o, reason: collision with root package name */
    public int f13718o;

    public a() {
        i iVar = new i(this, 15);
        C1191j c1191j = new C1191j(this, 15);
        this.f13709c = new e(iVar);
        this.f13710d = new e(c1191j);
        this.f13712f = false;
        this.g = false;
        this.f13713h = true;
        this.f13714i = true;
    }

    public static int E(View view) {
        Rect rect = ((T) view.getLayoutParams()).f4616b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static int F(View view) {
        Rect rect = ((T) view.getLayoutParams()).f4616b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int O(View view) {
        return ((T) view.getLayoutParams()).f4615a.d();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, H2.S] */
    public static S P(Context context, AttributeSet attributeSet, int i7, int i10) {
        ?? obj = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, G2.a.f4281a, i7, i10);
        obj.f4611a = obtainStyledAttributes.getInt(0, 1);
        obj.f4612b = obtainStyledAttributes.getInt(10, 1);
        obj.f4613c = obtainStyledAttributes.getBoolean(9, false);
        obj.f4614d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return obj;
    }

    public static boolean U(int i7, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (i11 > 0 && i7 != i11) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i7;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i7;
        }
        return true;
    }

    public static void W(View view, int i7, int i10, int i11, int i12) {
        T t5 = (T) view.getLayoutParams();
        Rect rect = t5.f4616b;
        view.layout(i7 + rect.left + ((ViewGroup.MarginLayoutParams) t5).leftMargin, i10 + rect.top + ((ViewGroup.MarginLayoutParams) t5).topMargin, (i11 - rect.right) - ((ViewGroup.MarginLayoutParams) t5).rightMargin, (i12 - rect.bottom) - ((ViewGroup.MarginLayoutParams) t5).bottomMargin);
    }

    public static int i(int i7, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i10, i11) : size : Math.min(size, Math.max(i10, i11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int z(boolean z8, int i7, int i10, int i11, int i12) {
        int max = Math.max(0, i7 - i11);
        if (z8) {
            if (i12 < 0) {
                if (i12 == -1) {
                    if (i10 != Integer.MIN_VALUE) {
                        if (i10 != 0) {
                        }
                    }
                    i12 = max;
                }
                i10 = 0;
                i12 = 0;
            }
            i10 = 1073741824;
        } else {
            if (i12 < 0) {
                if (i12 != -1) {
                    if (i12 == -2) {
                        if (i10 == Integer.MIN_VALUE || i10 == 1073741824) {
                            i12 = max;
                            i10 = Integer.MIN_VALUE;
                        } else {
                            i12 = max;
                            i10 = 0;
                        }
                    }
                    i10 = 0;
                    i12 = 0;
                }
                i12 = max;
            }
            i10 = 1073741824;
        }
        return View.MeasureSpec.makeMeasureSpec(i12, i10);
    }

    public int A(Y y10, e0 e0Var) {
        return -1;
    }

    public final void A0(Y y10) {
        ArrayList arrayList;
        int size = y10.f4626a.size();
        int i7 = size - 1;
        while (true) {
            arrayList = y10.f4626a;
            if (i7 < 0) {
                break;
            }
            View view = ((i0) arrayList.get(i7)).f4707a;
            i0 M3 = RecyclerView.M(view);
            if (!M3.r()) {
                M3.q(false);
                if (M3.m()) {
                    this.f13708b.removeDetachedView(view, false);
                }
                P p10 = this.f13708b.f13654d0;
                if (p10 != null) {
                    p10.d(M3);
                }
                M3.q(true);
                i0 M10 = RecyclerView.M(view);
                M10.f4717n = null;
                M10.f4718o = false;
                M10.j &= -33;
                y10.j(M10);
            }
            i7--;
        }
        arrayList.clear();
        ArrayList arrayList2 = y10.f4627b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f13708b.invalidate();
        }
    }

    public int B(View view) {
        return view.getBottom() + ((T) view.getLayoutParams()).f4616b.bottom;
    }

    public final void B0(View view, Y y10) {
        j jVar = this.f13707a;
        i iVar = (i) jVar.f2090c;
        int i7 = jVar.f2089b;
        if (i7 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i7 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            jVar.f2089b = 1;
            jVar.f2093f = view;
            int indexOfChild = ((RecyclerView) iVar.f3256b).indexOfChild(view);
            if (indexOfChild >= 0) {
                if (((f) jVar.f2091d).M(indexOfChild)) {
                    jVar.A(view);
                }
                iVar.x(indexOfChild);
            }
            jVar.f2089b = 0;
            jVar.f2093f = null;
            y10.i(view);
        } catch (Throwable th) {
            jVar.f2089b = 0;
            jVar.f2093f = null;
            throw th;
        }
    }

    public void C(Rect rect, View view) {
        boolean z8 = RecyclerView.f13602O0;
        T t5 = (T) view.getLayoutParams();
        Rect rect2 = t5.f4616b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) t5).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) t5).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) t5).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) t5).bottomMargin);
    }

    public final void C0(int i7, Y y10) {
        View x2 = x(i7);
        if (x(i7) != null) {
            this.f13707a.z(i7);
        }
        y10.i(x2);
    }

    public int D(View view) {
        return view.getLeft() - ((T) view.getLayoutParams()).f4616b.left;
    }

    public boolean D0(RecyclerView recyclerView, View view, Rect rect, boolean z8) {
        return E0(recyclerView, view, rect, z8, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean E0(RecyclerView recyclerView, View view, Rect rect, boolean z8, boolean z10) {
        int L = L();
        int N10 = N();
        int M3 = this.f13717n - M();
        int K10 = this.f13718o - K();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i7 = left - L;
        int min = Math.min(0, i7);
        int i10 = top - N10;
        int min2 = Math.min(0, i10);
        int i11 = width - M3;
        int max = Math.max(0, i11);
        int max2 = Math.max(0, height - K10);
        if (J() != 1) {
            if (min == 0) {
                min = Math.min(i7, max);
            }
            max = min;
        } else if (max == 0) {
            max = Math.max(min, i11);
        }
        if (min2 == 0) {
            min2 = Math.min(i10, max2);
        }
        int[] iArr = {max, min2};
        int i12 = iArr[0];
        int i13 = iArr[1];
        if (z10) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int L10 = L();
                int N11 = N();
                int M10 = this.f13717n - M();
                int K11 = this.f13718o - K();
                Rect rect2 = this.f13708b.f13679x;
                C(rect2, focusedChild);
                if (rect2.left - i12 < M10) {
                    if (rect2.right - i12 > L10) {
                        if (rect2.top - i13 < K11) {
                        }
                    }
                }
            }
            return false;
        }
        if (i12 != 0 || i13 != 0) {
            if (z8) {
                recyclerView.scrollBy(i12, i13);
            } else {
                recyclerView.j0(i12, i13);
            }
            return true;
        }
        return false;
    }

    public final void F0() {
        RecyclerView recyclerView = this.f13708b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public int G(View view) {
        return view.getRight() + ((T) view.getLayoutParams()).f4616b.right;
    }

    public final void G0(Y y10, int i7, View view) {
        i0 M3 = RecyclerView.M(view);
        if (M3.r()) {
            if (RecyclerView.f13603P0) {
                Log.d("RecyclerView", "ignoring view " + M3);
                return;
            }
            return;
        }
        if (M3.i() && !M3.k() && !this.f13708b.f13612A.f4600b) {
            if (x(i7) != null) {
                this.f13707a.z(i7);
            }
            y10.j(M3);
        } else {
            x(i7);
            this.f13707a.g(i7);
            y10.k(view);
            this.f13708b.f13673u.I(M3);
        }
    }

    public int H(View view) {
        return view.getTop() - ((T) view.getLayoutParams()).f4616b.top;
    }

    public abstract int H0(int i7, Y y10, e0 e0Var);

    public final int I() {
        RecyclerView recyclerView = this.f13708b;
        K adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public abstract void I0(int i7);

    public final int J() {
        RecyclerView recyclerView = this.f13708b;
        WeakHashMap weakHashMap = y1.K.f26642a;
        return recyclerView.getLayoutDirection();
    }

    public abstract int J0(int i7, Y y10, e0 e0Var);

    public final int K() {
        RecyclerView recyclerView = this.f13708b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final void K0(RecyclerView recyclerView) {
        L0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final int L() {
        RecyclerView recyclerView = this.f13708b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final void L0(int i7, int i10) {
        this.f13717n = View.MeasureSpec.getSize(i7);
        int mode = View.MeasureSpec.getMode(i7);
        this.f13715l = mode;
        if (mode == 0 && !RecyclerView.f13606S0) {
            this.f13717n = 0;
        }
        this.f13718o = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        this.f13716m = mode2;
        if (mode2 != 0 || RecyclerView.f13606S0) {
            return;
        }
        this.f13718o = 0;
    }

    public final int M() {
        RecyclerView recyclerView = this.f13708b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final void M0(int i7, int i10) {
        this.f13708b.setMeasuredDimension(i7, i10);
    }

    public final int N() {
        RecyclerView recyclerView = this.f13708b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public void N0(Rect rect, int i7, int i10) {
        int M3 = M() + L() + rect.width();
        int K10 = K() + N() + rect.height();
        RecyclerView recyclerView = this.f13708b;
        WeakHashMap weakHashMap = y1.K.f26642a;
        M0(i(i7, M3, recyclerView.getMinimumWidth()), i(i10, K10, this.f13708b.getMinimumHeight()));
    }

    public final void O0(int i7, int i10) {
        int y10 = y();
        if (y10 == 0) {
            this.f13708b.q(i7, i10);
            return;
        }
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MAX_VALUE;
        for (int i15 = 0; i15 < y10; i15++) {
            View x2 = x(i15);
            Rect rect = this.f13708b.f13679x;
            C(rect, x2);
            int i16 = rect.left;
            if (i16 < i14) {
                i14 = i16;
            }
            int i17 = rect.right;
            if (i17 > i11) {
                i11 = i17;
            }
            int i18 = rect.top;
            if (i18 < i12) {
                i12 = i18;
            }
            int i19 = rect.bottom;
            if (i19 > i13) {
                i13 = i19;
            }
        }
        this.f13708b.f13679x.set(i14, i12, i11, i13);
        N0(this.f13708b.f13679x, i7, i10);
    }

    public final void P0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f13708b = null;
            this.f13707a = null;
            this.f13717n = 0;
            this.f13718o = 0;
        } else {
            this.f13708b = recyclerView;
            this.f13707a = recyclerView.f13657f;
            this.f13717n = recyclerView.getWidth();
            this.f13718o = recyclerView.getHeight();
        }
        this.f13715l = 1073741824;
        this.f13716m = 1073741824;
    }

    public int Q(Y y10, e0 e0Var) {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean Q0(View view, int i7, int i10, T t5) {
        return (!view.isLayoutRequested() && this.f13713h && U(view.getWidth(), i7, ((ViewGroup.MarginLayoutParams) t5).width) && U(view.getHeight(), i10, ((ViewGroup.MarginLayoutParams) t5).height)) ? false : true;
    }

    public final void R(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((T) view.getLayoutParams()).f4616b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f13708b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f13708b.f13683z;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public boolean R0() {
        return false;
    }

    public final boolean S() {
        RecyclerView recyclerView = this.f13708b;
        return recyclerView != null && recyclerView.hasFocus();
    }

    public final boolean S0(View view, int i7, int i10, T t5) {
        return (this.f13713h && U(view.getMeasuredWidth(), i7, ((ViewGroup.MarginLayoutParams) t5).width) && U(view.getMeasuredHeight(), i10, ((ViewGroup.MarginLayoutParams) t5).height)) ? false : true;
    }

    public boolean T() {
        return false;
    }

    public abstract void T0(RecyclerView recyclerView, int i7);

    public void U0(B b2) {
        B b10 = this.f13711e;
        if (b10 != null && b2 != b10 && b10.f4576e) {
            b10.l();
        }
        this.f13711e = b2;
        RecyclerView recyclerView = this.f13708b;
        h0 h0Var = recyclerView.f13671s0;
        h0Var.f4700u.removeCallbacks(h0Var);
        h0Var.f4696c.abortAnimation();
        if (b2.f4578h) {
            Log.w("RecyclerView", "An instance of " + b2.getClass().getSimpleName() + " was started more than once. Each instance of" + b2.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        b2.f4573b = recyclerView;
        b2.f4574c = this;
        int i7 = b2.f4572a;
        if (i7 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f13676v0.f4664a = i7;
        b2.f4576e = true;
        b2.f4575d = true;
        b2.f4577f = b2.h(i7);
        b2.f4573b.f13671s0.b();
        b2.f4578h = true;
    }

    public final boolean V() {
        B b2 = this.f13711e;
        return b2 != null && b2.f4576e;
    }

    public boolean V0() {
        return this instanceof androidx.leanback.widget.GridLayoutManager;
    }

    public void X(int i7) {
        RecyclerView recyclerView = this.f13708b;
        if (recyclerView != null) {
            int m10 = recyclerView.f13657f.m();
            for (int i10 = 0; i10 < m10; i10++) {
                recyclerView.f13657f.l(i10).offsetLeftAndRight(i7);
            }
        }
    }

    public void Y(int i7) {
        RecyclerView recyclerView = this.f13708b;
        if (recyclerView != null) {
            int m10 = recyclerView.f13657f.m();
            for (int i10 = 0; i10 < m10; i10++) {
                recyclerView.f13657f.l(i10).offsetTopAndBottom(i7);
            }
        }
    }

    public void Z(K k, K k7) {
    }

    public boolean a0(RecyclerView recyclerView, ArrayList arrayList, int i7, int i10) {
        return false;
    }

    public final void b(View view) {
        c(view, -1, false);
    }

    public void b0(RecyclerView recyclerView) {
    }

    public final void c(View view, int i7, boolean z8) {
        i0 M3 = RecyclerView.M(view);
        if (z8 || M3.k()) {
            u.T t5 = (u.T) this.f13708b.f13673u.f23391b;
            t0 t0Var = (t0) t5.get(M3);
            if (t0Var == null) {
                t0Var = t0.a();
                t5.put(M3, t0Var);
            }
            t0Var.f4831a |= 1;
        } else {
            this.f13708b.f13673u.I(M3);
        }
        T t10 = (T) view.getLayoutParams();
        if (M3.s() || M3.l()) {
            if (M3.l()) {
                M3.f4717n.m(M3);
            } else {
                M3.j &= -33;
            }
            this.f13707a.e(view, i7, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f13708b) {
                int r10 = this.f13707a.r(view);
                if (i7 == -1) {
                    i7 = this.f13707a.m();
                }
                if (r10 == -1) {
                    StringBuilder sb2 = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb2.append(this.f13708b.indexOfChild(view));
                    throw new IllegalStateException(c.g(this.f13708b, sb2));
                }
                if (r10 != i7) {
                    a aVar = this.f13708b.f13614B;
                    View x2 = aVar.x(r10);
                    if (x2 == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + r10 + aVar.f13708b.toString());
                    }
                    aVar.x(r10);
                    aVar.f13707a.g(r10);
                    T t11 = (T) x2.getLayoutParams();
                    i0 M10 = RecyclerView.M(x2);
                    if (M10.k()) {
                        u.T t12 = (u.T) aVar.f13708b.f13673u.f23391b;
                        t0 t0Var2 = (t0) t12.get(M10);
                        if (t0Var2 == null) {
                            t0Var2 = t0.a();
                            t12.put(M10, t0Var2);
                        }
                        t0Var2.f4831a = 1 | t0Var2.f4831a;
                    } else {
                        aVar.f13708b.f13673u.I(M10);
                    }
                    aVar.f13707a.e(x2, i7, t11, M10.k());
                }
            } else {
                this.f13707a.d(view, i7, false);
                t10.f4617c = true;
                B b2 = this.f13711e;
                if (b2 != null && b2.f4576e) {
                    b2.f4573b.getClass();
                    i0 M11 = RecyclerView.M(view);
                    if ((M11 != null ? M11.d() : -1) == b2.f4572a) {
                        b2.f4577f = view;
                        if (RecyclerView.f13603P0) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        }
        if (t10.f4618d) {
            if (RecyclerView.f13603P0) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + t10.f4615a);
            }
            M3.f4707a.invalidate();
            t10.f4618d = false;
        }
    }

    public void c0(RecyclerView recyclerView) {
    }

    public void d(String str) {
        RecyclerView recyclerView = this.f13708b;
        if (recyclerView != null) {
            recyclerView.k(str);
        }
    }

    public View d0(View view, int i7, Y y10, e0 e0Var) {
        return null;
    }

    public final void e(Rect rect, View view) {
        RecyclerView recyclerView = this.f13708b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.N(view));
        }
    }

    public void e0(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f13708b;
        Y y10 = recyclerView.f13651c;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z8 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f13708b.canScrollVertically(-1) && !this.f13708b.canScrollHorizontally(-1) && !this.f13708b.canScrollHorizontally(1)) {
            z8 = false;
        }
        accessibilityEvent.setScrollable(z8);
        K k = this.f13708b.f13612A;
        if (k != null) {
            accessibilityEvent.setItemCount(k.a());
        }
    }

    public abstract boolean f();

    public void f0(Y y10, e0 e0Var, z1.e eVar) {
        if (this.f13708b.canScrollVertically(-1) || this.f13708b.canScrollHorizontally(-1)) {
            eVar.a(8192);
            eVar.m(true);
        }
        if (this.f13708b.canScrollVertically(1) || this.f13708b.canScrollHorizontally(1)) {
            eVar.a(4096);
            eVar.m(true);
        }
        eVar.j(C2355c.g(Q(y10, e0Var), A(y10, e0Var), 0));
    }

    public abstract boolean g();

    public void g0(Y y10, e0 e0Var, View view, z1.e eVar) {
    }

    public boolean h(T t5) {
        return t5 != null;
    }

    public final void h0(View view, z1.e eVar) {
        i0 M3 = RecyclerView.M(view);
        if (M3 == null || M3.k() || ((ArrayList) this.f13707a.f2092e).contains(M3.f4707a)) {
            return;
        }
        RecyclerView recyclerView = this.f13708b;
        g0(recyclerView.f13651c, recyclerView.f13676v0, view, eVar);
    }

    public View i0(View view, int i7) {
        return null;
    }

    public void j(int i7, int i10, e0 e0Var, C0305t c0305t) {
    }

    public void j0(int i7, int i10) {
    }

    public void k(int i7, C0305t c0305t) {
    }

    public void k0() {
    }

    public int l(e0 e0Var) {
        return 0;
    }

    public void l0(int i7, int i10) {
    }

    public int m(e0 e0Var) {
        return 0;
    }

    public void m0(int i7, int i10) {
    }

    public int n(e0 e0Var) {
        return 0;
    }

    public void n0(int i7, int i10) {
    }

    public int o(e0 e0Var) {
        return 0;
    }

    public void o0(RecyclerView recyclerView, int i7, int i10) {
        n0(i7, i10);
    }

    public int p(e0 e0Var) {
        return 0;
    }

    public abstract void p0(Y y10, e0 e0Var);

    public int q(e0 e0Var) {
        return 0;
    }

    public abstract void q0(e0 e0Var);

    public final void r(Y y10) {
        for (int y11 = y() - 1; y11 >= 0; y11--) {
            G0(y10, y11, x(y11));
        }
    }

    public void r0(Y y10, e0 e0Var, int i7, int i10) {
        this.f13708b.q(i7, i10);
    }

    public final View s(View view) {
        View D10;
        RecyclerView recyclerView = this.f13708b;
        if (recyclerView == null || (D10 = recyclerView.D(view)) == null || ((ArrayList) this.f13707a.f2092e).contains(D10)) {
            return null;
        }
        return D10;
    }

    public boolean s0(RecyclerView recyclerView, View view, View view2) {
        return t0(recyclerView, view, view2);
    }

    public View t(int i7) {
        int y10 = y();
        for (int i10 = 0; i10 < y10; i10++) {
            View x2 = x(i10);
            i0 M3 = RecyclerView.M(x2);
            if (M3 != null && M3.d() == i7 && !M3.r() && (this.f13708b.f13676v0.g || !M3.k())) {
                return x2;
            }
        }
        return null;
    }

    public boolean t0(RecyclerView recyclerView, View view, View view2) {
        return V() || recyclerView.Q();
    }

    public abstract T u();

    public void u0(Parcelable parcelable) {
    }

    public T v(Context context, AttributeSet attributeSet) {
        return new T(context, attributeSet);
    }

    public Parcelable v0() {
        return null;
    }

    public T w(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof T ? new T((T) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new T((ViewGroup.MarginLayoutParams) layoutParams) : new T(layoutParams);
    }

    public void w0(int i7) {
    }

    public final View x(int i7) {
        j jVar = this.f13707a;
        if (jVar != null) {
            return jVar.l(i7);
        }
        return null;
    }

    public boolean x0(int i7, Y y10, e0 e0Var) {
        int N10;
        int L;
        if (this.f13708b == null) {
            return false;
        }
        int i10 = this.f13718o;
        int i11 = this.f13717n;
        Rect rect = new Rect();
        if (this.f13708b.getMatrix().isIdentity() && this.f13708b.getGlobalVisibleRect(rect)) {
            i10 = rect.height();
            i11 = rect.width();
        }
        if (i7 == 4096) {
            N10 = this.f13708b.canScrollVertically(1) ? (i10 - N()) - K() : 0;
            if (this.f13708b.canScrollHorizontally(1)) {
                L = (i11 - L()) - M();
            }
            L = 0;
        } else if (i7 != 8192) {
            N10 = 0;
            L = 0;
        } else {
            N10 = this.f13708b.canScrollVertically(-1) ? -((i10 - N()) - K()) : 0;
            if (this.f13708b.canScrollHorizontally(-1)) {
                L = -((i11 - L()) - M());
            }
            L = 0;
        }
        if (N10 == 0 && L == 0) {
            return false;
        }
        this.f13708b.k0(L, N10, null, true);
        return true;
    }

    public final int y() {
        j jVar = this.f13707a;
        if (jVar != null) {
            return jVar.m();
        }
        return 0;
    }

    public final void y0() {
        for (int y10 = y() - 1; y10 >= 0; y10--) {
            this.f13707a.z(y10);
        }
    }

    public void z0(Y y10) {
        for (int y11 = y() - 1; y11 >= 0; y11--) {
            if (!RecyclerView.M(x(y11)).r()) {
                C0(y11, y10);
            }
        }
    }
}
