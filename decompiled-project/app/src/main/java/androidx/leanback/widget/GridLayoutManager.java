package androidx.leanback.widget;

import H2.B;
import H2.C0305t;
import H2.D;
import H2.K;
import H2.T;
import H2.Y;
import H2.e0;
import Y5.A;
import Y5.C0656w;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.GridView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import e3.RunnableC1077b;
import i2.AbstractC1327o;
import i2.C1312U;
import i2.C1328p;
import i2.C1329q;
import i2.C1336x;
import java.util.ArrayList;
import q3.n;
import y1.C2355c;
import z1.d;
import z1.e;

/* loaded from: classes.dex */
public final class GridLayoutManager extends a {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f13530C;

    /* renamed from: A, reason: collision with root package name */
    public final n f13531A;

    /* renamed from: B, reason: collision with root package name */
    public final C0656w f13532B;

    /* renamed from: p, reason: collision with root package name */
    public int f13533p;

    /* renamed from: q, reason: collision with root package name */
    public e0 f13534q;

    /* renamed from: r, reason: collision with root package name */
    public final SparseIntArray f13535r;

    /* renamed from: s, reason: collision with root package name */
    public int f13536s;

    /* renamed from: t, reason: collision with root package name */
    public int f13537t;

    /* renamed from: u, reason: collision with root package name */
    public int f13538u;

    /* renamed from: v, reason: collision with root package name */
    public int f13539v;

    /* renamed from: w, reason: collision with root package name */
    public int f13540w;

    /* renamed from: x, reason: collision with root package name */
    public int f13541x;

    /* renamed from: y, reason: collision with root package name */
    public int f13542y;

    /* renamed from: z, reason: collision with root package name */
    public final int f13543z;

    static {
        new Rect();
        f13530C = new int[2];
    }

    public GridLayoutManager() {
        new D(this, 0);
        this.f13535r = new SparseIntArray();
        this.f13536s = 221696;
        this.f13537t = -1;
        this.f13538u = 0;
        this.f13539v = 0;
        this.f13543z = 1;
        this.f13531A = new n(8);
        new A();
        this.f13532B = new C0656w(11);
        new RunnableC1077b(this, 3);
        if (this.f13714i) {
            this.f13714i = false;
            this.j = 0;
            RecyclerView recyclerView = this.f13708b;
            if (recyclerView != null) {
                recyclerView.f13651c.n();
            }
        }
    }

    public static int W0(View view) {
        C1328p c1328p;
        if (view == null || (c1328p = (C1328p) view.getLayoutParams()) == null || c1328p.f4615a.k()) {
            return -1;
        }
        return c1328p.f4615a.c();
    }

    @Override // androidx.recyclerview.widget.a
    public final int A(Y y10, e0 e0Var) {
        return -1;
    }

    @Override // androidx.recyclerview.widget.a
    public final int B(View view) {
        int B10 = super.B(view);
        ((C1328p) view.getLayoutParams()).getClass();
        return B10 + 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final void C(Rect rect, View view) {
        super.C(rect, view);
        C1328p c1328p = (C1328p) view.getLayoutParams();
        int i7 = rect.left;
        c1328p.getClass();
        rect.left = i7 + 0;
        rect.top += 0;
        rect.right += 0;
        rect.bottom += 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final int D(View view) {
        int D10 = super.D(view);
        ((C1328p) view.getLayoutParams()).getClass();
        return D10 + 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean D0(RecyclerView recyclerView, View view, Rect rect, boolean z8) {
        return false;
    }

    @Override // androidx.recyclerview.widget.a
    public final int G(View view) {
        int G9 = super.G(view);
        ((C1328p) view.getLayoutParams()).getClass();
        return G9 + 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final int H(View view) {
        int H10 = super.H(view);
        ((C1328p) view.getLayoutParams()).getClass();
        return H10 + 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final int H0(int i7, Y y10, e0 e0Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final void I0(int i7) {
        if ((this.f13537t == i7 || i7 == -1) && this.f13538u == 0) {
            return;
        }
        t(i7);
        boolean V7 = V();
        if (!V7) {
            throw null;
        }
        int i10 = this.f13536s;
        if ((i10 & 512) != 0 && (i10 & 64) == 0) {
            if (!V7) {
                throw null;
            }
            throw null;
        }
        this.f13537t = i7;
        this.f13538u = 0;
        this.f13539v = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.a
    public final int J0(int i7, Y y10, e0 e0Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final int Q(Y y10, e0 e0Var) {
        return -1;
    }

    @Override // androidx.recyclerview.widget.a
    public final void T0(RecyclerView recyclerView, int i7) {
        if ((this.f13537t == i7 || i7 == -1) && this.f13538u == 0) {
            return;
        }
        t(i7);
        if (!V()) {
            throw null;
        }
        int i10 = this.f13536s;
        if ((i10 & 512) != 0 && (i10 & 64) == 0) {
            throw null;
        }
        this.f13537t = i7;
        this.f13538u = 0;
        this.f13539v = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.a
    public final void U0(B b2) {
        super.U0(b2);
        if (b2.f4576e && (b2 instanceof AbstractC1327o)) {
        }
    }

    public final int X0(int i7) {
        int i10 = this.f13541x;
        if (i10 != 0) {
            return i10;
        }
        return 0;
    }

    public final int Y0(View view, View view2) {
        if (view != null && view2 != null) {
            ((C1328p) view.getLayoutParams()).getClass();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final void Z(K k, K k7) {
        if (k != null) {
            this.f13536s &= -1025;
            this.f13537t = -1;
            this.f13539v = 0;
            this.f13532B.getClass();
        }
        boolean z8 = k7 instanceof C1336x;
    }

    public final void Z0() {
        int i7 = this.f13533p - 1;
        this.f13533p = i7;
        if (i7 == 0) {
            this.f13534q = null;
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean a0(RecyclerView recyclerView, ArrayList arrayList, int i7, int i10) {
        if ((this.f13536s & 32768) != 0) {
            return true;
        }
        if (recyclerView.hasFocus()) {
            recyclerView.findFocus();
            int W02 = W0(x(-1));
            View t5 = W02 == -1 ? null : t(W02);
            if (t5 != null) {
                t5.addFocusables(arrayList, i7, i10);
            }
            return true;
        }
        int size = arrayList.size();
        View t10 = t(this.f13537t);
        if (t10 != null) {
            t10.addFocusables(arrayList, i7, i10);
        }
        if (arrayList.size() == size && recyclerView.isFocusable()) {
            arrayList.add(recyclerView);
        }
        return true;
    }

    public final int a1(int i7, boolean z8) {
        return i7;
    }

    public final void b1(Y y10, e0 e0Var) {
        int i7 = this.f13533p;
        if (i7 == 0) {
            this.f13534q = e0Var;
        }
        this.f13533p = i7 + 1;
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean f() {
        return true;
    }

    @Override // androidx.recyclerview.widget.a
    public final void f0(Y y10, e0 e0Var, e eVar) {
        b1(y10, e0Var);
        int b2 = e0Var.b();
        int i7 = this.f13536s;
        boolean z8 = (262144 & i7) != 0;
        if ((i7 & 2048) == 0) {
            eVar.b(z8 ? d.f28167p : d.f28165n);
            eVar.m(true);
        } else if (b2 > 1) {
            throw null;
        }
        if ((this.f13536s & 4096) == 0) {
            eVar.b(z8 ? d.f28165n : d.f28167p);
            eVar.m(true);
        } else if (b2 > 1) {
            throw null;
        }
        eVar.j(C2355c.g(Q(y10, e0Var), -1, 0));
        eVar.i(GridView.class.getName());
        Z0();
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean g() {
        return this.f13542y > 1;
    }

    @Override // androidx.recyclerview.widget.a
    public final void g0(Y y10, e0 e0Var, View view, e eVar) {
        view.getLayoutParams();
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean h(T t5) {
        return t5 instanceof C1328p;
    }

    @Override // androidx.recyclerview.widget.a
    public final View i0(View view, int i7) {
        View findNextFocus;
        if ((this.f13536s & 32768) != 0) {
            return view;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (i7 == 2 || i7 == 1) {
            if (g()) {
                focusFinder.findNextFocus(null, view, i7 == 2 ? 130 : 33);
            }
            findNextFocus = focusFinder.findNextFocus(null, view, (i7 == 2) ^ (J() == 1) ? 66 : 17);
        } else {
            findNextFocus = focusFinder.findNextFocus(null, view, i7);
        }
        findNextFocus.getClass();
        return findNextFocus;
    }

    @Override // androidx.recyclerview.widget.a
    public final void j(int i7, int i10, e0 e0Var, C0305t c0305t) {
        try {
            b1(null, e0Var);
            if (y() != 0 && i7 != 0) {
                throw null;
            }
        } finally {
            Z0();
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void j0(int i7, int i10) {
        this.f13532B.getClass();
    }

    @Override // androidx.recyclerview.widget.a
    public final void k(int i7, C0305t c0305t) {
        throw null;
    }

    @Override // androidx.recyclerview.widget.a
    public final void k0() {
        this.f13539v = 0;
        this.f13532B.getClass();
    }

    @Override // androidx.recyclerview.widget.a
    public final void l0(int i7, int i10) {
        int i11;
        int i12 = this.f13537t;
        if (i12 != -1 && (i11 = this.f13539v) != Integer.MIN_VALUE) {
            int i13 = i12 + i11;
            if (i7 <= i13 && i13 < i7 + 1) {
                this.f13539v = (i10 - i7) + i11;
            } else if (i7 < i13 && i10 > i13 - 1) {
                this.f13539v = i11 - 1;
            } else if (i7 > i13 && i10 < i13) {
                this.f13539v = i11 + 1;
            }
        }
        this.f13532B.getClass();
    }

    @Override // androidx.recyclerview.widget.a
    public final void m0(int i7, int i10) {
        this.f13532B.getClass();
    }

    @Override // androidx.recyclerview.widget.a
    public final void n0(int i7, int i10) {
        int i11 = i10 + i7;
        while (i7 < i11) {
            this.f13532B.getClass();
            i7++;
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void p0(Y y10, e0 e0Var) {
        int i7;
        if (this.f13542y != 0 && e0Var.b() >= 0) {
            if ((this.f13536s & 64) != 0 && y() > 0) {
                this.f13536s |= 128;
                return;
            }
            int i10 = this.f13536s;
            if ((i10 & 512) == 0) {
                this.f13536s = i10 & (-1025);
                z0(y10);
                return;
            }
            this.f13536s = (i10 & (-4)) | 1;
            b1(y10, e0Var);
            if (e0Var.g) {
                if (y() > 0) {
                    throw null;
                }
                y();
                this.f13536s &= -4;
                Z0();
                return;
            }
            if (e0Var.k) {
                this.f13535r.clear();
                if (y() > 0) {
                    x(0);
                    throw null;
                }
            }
            int i11 = this.f13537t;
            if (i11 != -1 && (i7 = this.f13539v) != Integer.MIN_VALUE) {
                this.f13537t = i11 + i7;
                this.f13538u = 0;
            }
            this.f13539v = 0;
            t(this.f13537t);
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void q0(e0 e0Var) {
    }

    @Override // androidx.recyclerview.widget.a
    public final void r0(Y y10, e0 e0Var, int i7, int i10) {
        int i11;
        b1(y10, e0Var);
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int K10 = K() + N();
        int i12 = this.f13543z;
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                int i13 = size2 - K10;
                this.f13541x = i13;
                if (i12 == 0) {
                    i12 = 1;
                }
                this.f13542y = i12;
                size2 = (i13 * i12) + K10;
                M0(size, size2);
                Z0();
            }
            if (mode != 1073741824) {
                throw new IllegalStateException("wrong spec");
            }
        }
        if (i12 == 0) {
            this.f13542y = 1;
            this.f13541x = size2 - K10;
        } else if (i12 == 0) {
            this.f13541x = 0;
            this.f13542y = size2 / 0;
        } else {
            this.f13542y = i12;
            this.f13541x = (size2 - K10) / i12;
        }
        if (mode == Integer.MIN_VALUE && (i11 = (this.f13541x * this.f13542y) + K10) < size2) {
            size2 = i11;
        }
        M0(size, size2);
        Z0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00af, code lost:
    
        if (r4 <= r7) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c3, code lost:
    
        r4 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c1, code lost:
    
        if (r4 >= r7) goto L53;
     */
    @Override // androidx.recyclerview.widget.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s0(RecyclerView recyclerView, View view, View view2) {
        int i7;
        if ((this.f13536s & 32768) != 0 || W0(view) == -1) {
            return true;
        }
        int i10 = this.f13536s;
        if ((i10 & 35) == 0 && (i10 & 64) == 0) {
            int W02 = W0(view);
            Y0(view, view2);
            if (W02 != this.f13537t || this.f13538u != 0) {
                this.f13537t = W02;
                this.f13538u = 0;
                this.f13539v = 0;
                throw null;
            }
            if (view != null) {
                if (!view.hasFocus()) {
                    throw null;
                }
                if ((this.f13536s & 131072) != 0) {
                    int[] iArr = f13530C;
                    n nVar = this.f13531A;
                    C1312U c1312u = (C1312U) nVar.f23398d;
                    ((C1328p) view.getLayoutParams()).getClass();
                    int a9 = c1312u.a(view.getLeft() + 0 + 0);
                    if (view2 != null) {
                        Y0(view, view2);
                    }
                    ((C1328p) view.getLayoutParams()).getClass();
                    int a10 = ((C1312U) nVar.f23399e).a(view.getTop() + 0 + 0);
                    if (a9 == 0 && a10 == 0) {
                        iArr[0] = 0;
                        iArr[1] = 0;
                    } else {
                        iArr[0] = a9;
                        iArr[1] = a10;
                        if ((this.f13536s & 3) != 1) {
                            throw null;
                        }
                        int i11 = this.f13536s;
                        if ((i11 & 64) == 0 && (i11 & 3) != 1) {
                            n nVar2 = this.f13531A;
                            if (a9 > 0) {
                                C1312U c1312u2 = (C1312U) nVar2.f23398d;
                                if (c1312u2.f18233b != Integer.MAX_VALUE) {
                                    i7 = c1312u2.f18235d;
                                }
                            } else if (a9 < 0) {
                                C1312U c1312u3 = (C1312U) nVar2.f23398d;
                                if (c1312u3.f18234c != Integer.MIN_VALUE) {
                                    i7 = c1312u3.f18236e;
                                }
                            }
                        }
                        if (a9 != 0) {
                            int i12 = -a9;
                            int y10 = y();
                            for (int i13 = 0; i13 < y10; i13++) {
                                x(i13).offsetLeftAndRight(i12);
                            }
                            if ((this.f13536s & 3) != 1) {
                                y();
                                if ((this.f13536s & 262144) == 0 ? a9 >= 0 : a9 <= 0) {
                                    throw null;
                                }
                                throw null;
                            }
                            if (this.f13534q.b() != 0) {
                                if ((this.f13536s & 262144) == 0) {
                                    throw null;
                                }
                                throw null;
                            }
                        }
                        if (a10 != 0) {
                            int i14 = -a10;
                            int y11 = y();
                            for (int i15 = 0; i15 < y11; i15++) {
                                x(i15).offsetTopAndBottom(i14);
                            }
                            this.f13540w += a10;
                            C1312U c1312u4 = (C1312U) this.f13531A.f23399e;
                            c1312u4.getClass();
                            int i16 = 0 - this.f13540w;
                            int i17 = (this.f13536s & 524288) == 0 ? this.f13542y - 1 : 0;
                            int i18 = 0;
                            if ((this.f13536s & 524288) != 0) {
                                for (int i19 = this.f13542y - 1; i19 > i17; i19--) {
                                    i18 += X0(i19);
                                }
                            } else {
                                int i20 = 0;
                                while (i18 < i17) {
                                    i20 += X0(i18);
                                    i18++;
                                }
                                i18 = i20;
                            }
                            int X02 = X0(i17) + i18 + i16;
                            c1312u4.f18234c = i16;
                            c1312u4.f18233b = X02;
                            boolean z8 = i16 == Integer.MIN_VALUE;
                            boolean z10 = X02 == Integer.MAX_VALUE;
                            if (!z8) {
                                c1312u4.f18236e = i16;
                            }
                            if (!z10) {
                                c1312u4.f18235d = X02;
                            }
                            if (!z10 && !z8) {
                                c1312u4.f18235d = Math.max(c1312u4.f18236e, c1312u4.f18235d);
                            }
                            throw null;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.a
    public final T u() {
        return new T(-2, -2);
    }

    @Override // androidx.recyclerview.widget.a
    public final void u0(Parcelable parcelable) {
        if (parcelable instanceof C1329q) {
            this.f13537t = ((C1329q) parcelable).f18290a;
            this.f13539v = 0;
            this.f13532B.getClass();
            this.f13536s |= 256;
            F0();
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final T v(Context context, AttributeSet attributeSet) {
        return new T(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, java.lang.Object, i2.q] */
    @Override // androidx.recyclerview.widget.a
    public final Parcelable v0() {
        ?? obj = new Object();
        obj.f18291b = Bundle.EMPTY;
        obj.f18290a = this.f13537t;
        this.f13532B.getClass();
        int y10 = y();
        for (int i7 = 0; i7 < y10; i7++) {
            W0(x(i7));
        }
        obj.f18291b = null;
        return obj;
    }

    @Override // androidx.recyclerview.widget.a
    public final T w(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1328p ? new T((T) layoutParams) : layoutParams instanceof T ? new T((T) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new T((ViewGroup.MarginLayoutParams) layoutParams) : new T(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0026, code lost:
    
        r6 = 8192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0030, code lost:
    
        if (r7 != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r7 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r6 = 4096;
     */
    @Override // androidx.recyclerview.widget.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean x0(int i7, Y y10, e0 e0Var) {
        if ((this.f13536s & 131072) == 0) {
            return true;
        }
        b1(y10, e0Var);
        boolean z8 = (this.f13536s & 262144) != 0;
        if (i7 != d.f28165n.a()) {
            if (i7 == d.f28167p.a()) {
            }
        }
        int i10 = this.f13537t;
        boolean z10 = i10 == 0 && i7 == 8192;
        boolean z11 = i10 == e0Var.b() - 1 && i7 == 4096;
        if (z10 || z11) {
            AccessibilityEvent.obtain(4096);
            throw null;
        }
        if (i7 != 4096) {
            if (i7 == 8192) {
                if (I() != 0) {
                    throw null;
                }
                a1(-1, false);
            }
        } else {
            if (I() != 0) {
                throw null;
            }
            a1(1, false);
        }
        Z0();
        return true;
    }

    @Override // androidx.recyclerview.widget.a
    public final void z0(Y y10) {
        for (int y11 = y() - 1; y11 >= 0; y11--) {
            C0(y11, y10);
        }
    }
}
