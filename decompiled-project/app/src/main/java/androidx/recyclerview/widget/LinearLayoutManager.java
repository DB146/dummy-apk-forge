package androidx.recyclerview.widget;

import C4.v;
import H2.A;
import H2.AbstractC0303q;
import H2.B;
import H2.C0305t;
import H2.C0310y;
import H2.C0311z;
import H2.E;
import H2.S;
import H2.T;
import H2.Y;
import H2.d0;
import H2.e0;
import H2.i0;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import h3.o;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends a implements d0 {

    /* renamed from: A, reason: collision with root package name */
    public final v f13587A;

    /* renamed from: B, reason: collision with root package name */
    public final C0310y f13588B;

    /* renamed from: C, reason: collision with root package name */
    public final int f13589C;

    /* renamed from: D, reason: collision with root package name */
    public final int[] f13590D;

    /* renamed from: p, reason: collision with root package name */
    public int f13591p;

    /* renamed from: q, reason: collision with root package name */
    public C0311z f13592q;

    /* renamed from: r, reason: collision with root package name */
    public E f13593r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f13594s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f13595t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f13596u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f13597v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f13598w;

    /* renamed from: x, reason: collision with root package name */
    public int f13599x;

    /* renamed from: y, reason: collision with root package name */
    public int f13600y;

    /* renamed from: z, reason: collision with root package name */
    public A f13601z;

    /* JADX WARN: Type inference failed for: r2v1, types: [H2.y, java.lang.Object] */
    public LinearLayoutManager(int i7) {
        this.f13591p = 1;
        this.f13595t = false;
        this.f13596u = false;
        this.f13597v = false;
        this.f13598w = true;
        this.f13599x = -1;
        this.f13600y = Integer.MIN_VALUE;
        this.f13601z = null;
        this.f13587A = new v();
        this.f13588B = new Object();
        this.f13589C = 2;
        this.f13590D = new int[2];
        v1(i7);
        d(null);
        if (this.f13595t) {
            this.f13595t = false;
            F0();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [H2.y, java.lang.Object] */
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i7, int i10) {
        this.f13591p = 1;
        this.f13595t = false;
        this.f13596u = false;
        this.f13597v = false;
        this.f13598w = true;
        this.f13599x = -1;
        this.f13600y = Integer.MIN_VALUE;
        this.f13601z = null;
        this.f13587A = new v();
        this.f13588B = new Object();
        this.f13589C = 2;
        this.f13590D = new int[2];
        S P10 = a.P(context, attributeSet, i7, i10);
        v1(P10.f4611a);
        boolean z8 = P10.f4613c;
        d(null);
        if (z8 != this.f13595t) {
            this.f13595t = z8;
            F0();
        }
        w1(P10.f4614d);
    }

    @Override // androidx.recyclerview.widget.a
    public int H0(int i7, Y y10, e0 e0Var) {
        if (this.f13591p == 1) {
            return 0;
        }
        return u1(i7, y10, e0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final void I0(int i7) {
        this.f13599x = i7;
        this.f13600y = Integer.MIN_VALUE;
        A a9 = this.f13601z;
        if (a9 != null) {
            a9.f4569a = -1;
        }
        F0();
    }

    @Override // androidx.recyclerview.widget.a
    public int J0(int i7, Y y10, e0 e0Var) {
        if (this.f13591p == 0) {
            return 0;
        }
        return u1(i7, y10, e0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean R0() {
        if (this.f13716m == 1073741824 || this.f13715l == 1073741824) {
            return false;
        }
        int y10 = y();
        for (int i7 = 0; i7 < y10; i7++) {
            ViewGroup.LayoutParams layoutParams = x(i7).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean T() {
        return true;
    }

    @Override // androidx.recyclerview.widget.a
    public void T0(RecyclerView recyclerView, int i7) {
        B b2 = new B(recyclerView.getContext());
        b2.f4572a = i7;
        U0(b2);
    }

    @Override // androidx.recyclerview.widget.a
    public boolean V0() {
        return this.f13601z == null && this.f13594s == this.f13597v;
    }

    public void W0(e0 e0Var, int[] iArr) {
        int i7;
        int n6 = e0Var.f4664a != -1 ? this.f13593r.n() : 0;
        if (this.f13592q.f4864f == -1) {
            i7 = 0;
        } else {
            i7 = n6;
            n6 = 0;
        }
        iArr[0] = n6;
        iArr[1] = i7;
    }

    public void X0(e0 e0Var, C0311z c0311z, C0305t c0305t) {
        int i7 = c0311z.f4862d;
        if (i7 < 0 || i7 >= e0Var.b()) {
            return;
        }
        c0305t.a(i7, Math.max(0, c0311z.g));
    }

    public final int Y0(e0 e0Var) {
        if (y() == 0) {
            return 0;
        }
        c1();
        E e2 = this.f13593r;
        boolean z8 = !this.f13598w;
        return AbstractC0303q.d(e0Var, e2, f1(z8), e1(z8), this, this.f13598w);
    }

    public final int Z0(e0 e0Var) {
        if (y() == 0) {
            return 0;
        }
        c1();
        E e2 = this.f13593r;
        boolean z8 = !this.f13598w;
        return AbstractC0303q.e(e0Var, e2, f1(z8), e1(z8), this, this.f13598w, this.f13596u);
    }

    @Override // H2.d0
    public final PointF a(int i7) {
        if (y() == 0) {
            return null;
        }
        int i10 = (i7 < a.O(x(0))) != this.f13596u ? -1 : 1;
        return this.f13591p == 0 ? new PointF(i10, 0.0f) : new PointF(0.0f, i10);
    }

    public final int a1(e0 e0Var) {
        if (y() == 0) {
            return 0;
        }
        c1();
        E e2 = this.f13593r;
        boolean z8 = !this.f13598w;
        return AbstractC0303q.f(e0Var, e2, f1(z8), e1(z8), this, this.f13598w);
    }

    public final int b1(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 17 ? i7 != 33 ? i7 != 66 ? (i7 == 130 && this.f13591p == 1) ? 1 : Integer.MIN_VALUE : this.f13591p == 0 ? 1 : Integer.MIN_VALUE : this.f13591p == 1 ? -1 : Integer.MIN_VALUE : this.f13591p == 0 ? -1 : Integer.MIN_VALUE : (this.f13591p != 1 && o1()) ? -1 : 1 : (this.f13591p != 1 && o1()) ? 1 : -1;
    }

    @Override // androidx.recyclerview.widget.a
    public final void c0(RecyclerView recyclerView) {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [H2.z, java.lang.Object] */
    public final void c1() {
        if (this.f13592q == null) {
            ?? obj = new Object();
            obj.f4859a = true;
            obj.f4865h = 0;
            obj.f4866i = 0;
            obj.k = null;
            this.f13592q = obj;
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void d(String str) {
        if (this.f13601z == null) {
            super.d(str);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public View d0(View view, int i7, Y y10, e0 e0Var) {
        int b12;
        t1();
        if (y() == 0 || (b12 = b1(i7)) == Integer.MIN_VALUE) {
            return null;
        }
        c1();
        x1(b12, (int) (this.f13593r.n() * 0.33333334f), false, e0Var);
        C0311z c0311z = this.f13592q;
        c0311z.g = Integer.MIN_VALUE;
        c0311z.f4859a = false;
        d1(y10, c0311z, e0Var, true);
        View h12 = b12 == -1 ? this.f13596u ? h1(y() - 1, -1) : h1(0, y()) : this.f13596u ? h1(0, y()) : h1(y() - 1, -1);
        View n12 = b12 == -1 ? n1() : m1();
        if (!n12.hasFocusable()) {
            return h12;
        }
        if (h12 == null) {
            return null;
        }
        return n12;
    }

    public final int d1(Y y10, C0311z c0311z, e0 e0Var, boolean z8) {
        int i7;
        int i10 = c0311z.f4861c;
        int i11 = c0311z.g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                c0311z.g = i11 + i10;
            }
            r1(y10, c0311z);
        }
        int i12 = c0311z.f4861c + c0311z.f4865h;
        while (true) {
            if ((!c0311z.f4867l && i12 <= 0) || (i7 = c0311z.f4862d) < 0 || i7 >= e0Var.b()) {
                break;
            }
            C0310y c0310y = this.f13588B;
            c0310y.f4855a = 0;
            c0310y.f4856b = false;
            c0310y.f4857c = false;
            c0310y.f4858d = false;
            p1(y10, e0Var, c0311z, c0310y);
            if (!c0310y.f4856b) {
                int i13 = c0311z.f4860b;
                int i14 = c0310y.f4855a;
                c0311z.f4860b = (c0311z.f4864f * i14) + i13;
                if (!c0310y.f4857c || c0311z.k != null || !e0Var.g) {
                    c0311z.f4861c -= i14;
                    i12 -= i14;
                }
                int i15 = c0311z.g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    c0311z.g = i16;
                    int i17 = c0311z.f4861c;
                    if (i17 < 0) {
                        c0311z.g = i16 + i17;
                    }
                    r1(y10, c0311z);
                }
                if (z8 && c0310y.f4858d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - c0311z.f4861c;
    }

    @Override // androidx.recyclerview.widget.a
    public final void e0(AccessibilityEvent accessibilityEvent) {
        super.e0(accessibilityEvent);
        if (y() > 0) {
            View i12 = i1(false, 0, y());
            accessibilityEvent.setFromIndex(i12 == null ? -1 : a.O(i12));
            accessibilityEvent.setToIndex(g1());
        }
    }

    public final View e1(boolean z8) {
        return this.f13596u ? i1(z8, 0, y()) : i1(z8, y() - 1, -1);
    }

    @Override // androidx.recyclerview.widget.a
    public boolean f() {
        return this.f13591p == 0;
    }

    public final View f1(boolean z8) {
        return this.f13596u ? i1(z8, y() - 1, -1) : i1(z8, 0, y());
    }

    @Override // androidx.recyclerview.widget.a
    public boolean g() {
        return this.f13591p == 1;
    }

    public final int g1() {
        View i12 = i1(false, y() - 1, -1);
        if (i12 == null) {
            return -1;
        }
        return a.O(i12);
    }

    public final View h1(int i7, int i10) {
        int i11;
        int i12;
        c1();
        if (i10 <= i7 && i10 >= i7) {
            return x(i7);
        }
        if (this.f13593r.g(x(i7)) < this.f13593r.m()) {
            i11 = 16644;
            i12 = 16388;
        } else {
            i11 = 4161;
            i12 = 4097;
        }
        return this.f13591p == 0 ? this.f13709c.k(i7, i10, i11, i12) : this.f13710d.k(i7, i10, i11, i12);
    }

    public final View i1(boolean z8, int i7, int i10) {
        c1();
        int i11 = z8 ? 24579 : 320;
        return this.f13591p == 0 ? this.f13709c.k(i7, i10, i11, 320) : this.f13710d.k(i7, i10, i11, 320);
    }

    @Override // androidx.recyclerview.widget.a
    public final void j(int i7, int i10, e0 e0Var, C0305t c0305t) {
        if (this.f13591p != 0) {
            i7 = i10;
        }
        if (y() == 0 || i7 == 0) {
            return;
        }
        c1();
        x1(i7 > 0 ? 1 : -1, Math.abs(i7), true, e0Var);
        X0(e0Var, this.f13592q, c0305t);
    }

    public View j1(Y y10, e0 e0Var, boolean z8, boolean z10) {
        int i7;
        int i10;
        int i11;
        c1();
        int y11 = y();
        if (z10) {
            i10 = y() - 1;
            i7 = -1;
            i11 = -1;
        } else {
            i7 = y11;
            i10 = 0;
            i11 = 1;
        }
        int b2 = e0Var.b();
        int m10 = this.f13593r.m();
        int i12 = this.f13593r.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i10 != i7) {
            View x2 = x(i10);
            int O10 = a.O(x2);
            int g = this.f13593r.g(x2);
            int d10 = this.f13593r.d(x2);
            if (O10 >= 0 && O10 < b2) {
                if (!((T) x2.getLayoutParams()).f4615a.k()) {
                    boolean z11 = d10 <= m10 && g < m10;
                    boolean z12 = g >= i12 && d10 > i12;
                    if (!z11 && !z12) {
                        return x2;
                    }
                    if (z8) {
                        if (!z12) {
                            if (view != null) {
                            }
                            view = x2;
                        }
                        view2 = x2;
                    } else {
                        if (!z11) {
                            if (view != null) {
                            }
                            view = x2;
                        }
                        view2 = x2;
                    }
                } else if (view3 == null) {
                    view3 = x2;
                }
            }
            i10 += i11;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.a
    public final void k(int i7, C0305t c0305t) {
        boolean z8;
        int i10;
        A a9 = this.f13601z;
        if (a9 == null || (i10 = a9.f4569a) < 0) {
            t1();
            z8 = this.f13596u;
            i10 = this.f13599x;
            if (i10 == -1) {
                i10 = z8 ? i7 - 1 : 0;
            }
        } else {
            z8 = a9.f4571c;
        }
        int i11 = z8 ? -1 : 1;
        for (int i12 = 0; i12 < this.f13589C && i10 >= 0 && i10 < i7; i12++) {
            c0305t.a(i10, 0);
            i10 += i11;
        }
    }

    public final int k1(int i7, Y y10, e0 e0Var, boolean z8) {
        int i10;
        int i11 = this.f13593r.i() - i7;
        if (i11 <= 0) {
            return 0;
        }
        int i12 = -u1(-i11, y10, e0Var);
        int i13 = i7 + i12;
        if (!z8 || (i10 = this.f13593r.i() - i13) <= 0) {
            return i12;
        }
        this.f13593r.r(i10);
        return i10 + i12;
    }

    @Override // androidx.recyclerview.widget.a
    public final int l(e0 e0Var) {
        return Y0(e0Var);
    }

    public final int l1(int i7, Y y10, e0 e0Var, boolean z8) {
        int m10;
        int m11 = i7 - this.f13593r.m();
        if (m11 <= 0) {
            return 0;
        }
        int i10 = -u1(m11, y10, e0Var);
        int i11 = i7 + i10;
        if (!z8 || (m10 = i11 - this.f13593r.m()) <= 0) {
            return i10;
        }
        this.f13593r.r(-m10);
        return i10 - m10;
    }

    @Override // androidx.recyclerview.widget.a
    public int m(e0 e0Var) {
        return Z0(e0Var);
    }

    public final View m1() {
        return x(this.f13596u ? 0 : y() - 1);
    }

    @Override // androidx.recyclerview.widget.a
    public int n(e0 e0Var) {
        return a1(e0Var);
    }

    public final View n1() {
        return x(this.f13596u ? y() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.a
    public final int o(e0 e0Var) {
        return Y0(e0Var);
    }

    public final boolean o1() {
        return J() == 1;
    }

    @Override // androidx.recyclerview.widget.a
    public int p(e0 e0Var) {
        return Z0(e0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public void p0(Y y10, e0 e0Var) {
        View focusedChild;
        View focusedChild2;
        View j12;
        int i7;
        int i10;
        int i11;
        List list;
        int i12;
        int i13;
        int k12;
        int i14;
        View t5;
        int g;
        int i15;
        int i16;
        int i17 = -1;
        if (!(this.f13601z == null && this.f13599x == -1) && e0Var.b() == 0) {
            z0(y10);
            return;
        }
        A a9 = this.f13601z;
        if (a9 != null && (i16 = a9.f4569a) >= 0) {
            this.f13599x = i16;
        }
        c1();
        this.f13592q.f4859a = false;
        t1();
        RecyclerView recyclerView = this.f13708b;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || ((ArrayList) this.f13707a.f2092e).contains(focusedChild)) {
            focusedChild = null;
        }
        v vVar = this.f13587A;
        if (!vVar.f2877e || this.f13599x != -1 || this.f13601z != null) {
            vVar.f();
            vVar.f2876d = this.f13596u ^ this.f13597v;
            if (!e0Var.g && (i7 = this.f13599x) != -1) {
                if (i7 < 0 || i7 >= e0Var.b()) {
                    this.f13599x = -1;
                    this.f13600y = Integer.MIN_VALUE;
                } else {
                    int i18 = this.f13599x;
                    vVar.f2874b = i18;
                    A a10 = this.f13601z;
                    if (a10 != null && a10.f4569a >= 0) {
                        boolean z8 = a10.f4571c;
                        vVar.f2876d = z8;
                        if (z8) {
                            vVar.f2875c = this.f13593r.i() - this.f13601z.f4570b;
                        } else {
                            vVar.f2875c = this.f13593r.m() + this.f13601z.f4570b;
                        }
                    } else if (this.f13600y == Integer.MIN_VALUE) {
                        View t10 = t(i18);
                        if (t10 == null) {
                            if (y() > 0) {
                                vVar.f2876d = (this.f13599x < a.O(x(0))) == this.f13596u;
                            }
                            vVar.b();
                        } else if (this.f13593r.e(t10) > this.f13593r.n()) {
                            vVar.b();
                        } else if (this.f13593r.g(t10) - this.f13593r.m() < 0) {
                            vVar.f2875c = this.f13593r.m();
                            vVar.f2876d = false;
                        } else if (this.f13593r.i() - this.f13593r.d(t10) < 0) {
                            vVar.f2875c = this.f13593r.i();
                            vVar.f2876d = true;
                        } else {
                            vVar.f2875c = vVar.f2876d ? this.f13593r.o() + this.f13593r.d(t10) : this.f13593r.g(t10);
                        }
                    } else {
                        boolean z10 = this.f13596u;
                        vVar.f2876d = z10;
                        if (z10) {
                            vVar.f2875c = this.f13593r.i() - this.f13600y;
                        } else {
                            vVar.f2875c = this.f13593r.m() + this.f13600y;
                        }
                    }
                    vVar.f2877e = true;
                }
            }
            if (y() != 0) {
                RecyclerView recyclerView2 = this.f13708b;
                if (recyclerView2 == null || (focusedChild2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.f13707a.f2092e).contains(focusedChild2)) {
                    focusedChild2 = null;
                }
                if (focusedChild2 != null) {
                    T t11 = (T) focusedChild2.getLayoutParams();
                    if (!t11.f4615a.k() && t11.f4615a.d() >= 0 && t11.f4615a.d() < e0Var.b()) {
                        vVar.d(focusedChild2, a.O(focusedChild2));
                        vVar.f2877e = true;
                    }
                }
                boolean z11 = this.f13594s;
                boolean z12 = this.f13597v;
                if (z11 == z12 && (j12 = j1(y10, e0Var, vVar.f2876d, z12)) != null) {
                    vVar.c(j12, a.O(j12));
                    if (!e0Var.g && V0()) {
                        int g2 = this.f13593r.g(j12);
                        int d10 = this.f13593r.d(j12);
                        int m10 = this.f13593r.m();
                        int i19 = this.f13593r.i();
                        boolean z13 = d10 <= m10 && g2 < m10;
                        boolean z14 = g2 >= i19 && d10 > i19;
                        if (z13 || z14) {
                            if (vVar.f2876d) {
                                m10 = i19;
                            }
                            vVar.f2875c = m10;
                        }
                    }
                    vVar.f2877e = true;
                }
            }
            vVar.b();
            vVar.f2874b = this.f13597v ? e0Var.b() - 1 : 0;
            vVar.f2877e = true;
        } else if (focusedChild != null && (this.f13593r.g(focusedChild) >= this.f13593r.i() || this.f13593r.d(focusedChild) <= this.f13593r.m())) {
            vVar.d(focusedChild, a.O(focusedChild));
        }
        C0311z c0311z = this.f13592q;
        c0311z.f4864f = c0311z.j >= 0 ? 1 : -1;
        int[] iArr = this.f13590D;
        iArr[0] = 0;
        iArr[1] = 0;
        W0(e0Var, iArr);
        int m11 = this.f13593r.m() + Math.max(0, iArr[0]);
        int j = this.f13593r.j() + Math.max(0, iArr[1]);
        if (e0Var.g && (i14 = this.f13599x) != -1 && this.f13600y != Integer.MIN_VALUE && (t5 = t(i14)) != null) {
            if (this.f13596u) {
                i15 = this.f13593r.i() - this.f13593r.d(t5);
                g = this.f13600y;
            } else {
                g = this.f13593r.g(t5) - this.f13593r.m();
                i15 = this.f13600y;
            }
            int i20 = i15 - g;
            if (i20 > 0) {
                m11 += i20;
            } else {
                j -= i20;
            }
        }
        if (!vVar.f2876d ? !this.f13596u : this.f13596u) {
            i17 = 1;
        }
        q1(y10, e0Var, vVar, i17);
        r(y10);
        this.f13592q.f4867l = this.f13593r.k() == 0 && this.f13593r.h() == 0;
        this.f13592q.getClass();
        this.f13592q.f4866i = 0;
        if (vVar.f2876d) {
            z1(vVar.f2874b, vVar.f2875c);
            C0311z c0311z2 = this.f13592q;
            c0311z2.f4865h = m11;
            d1(y10, c0311z2, e0Var, false);
            C0311z c0311z3 = this.f13592q;
            i11 = c0311z3.f4860b;
            int i21 = c0311z3.f4862d;
            int i22 = c0311z3.f4861c;
            if (i22 > 0) {
                j += i22;
            }
            y1(vVar.f2874b, vVar.f2875c);
            C0311z c0311z4 = this.f13592q;
            c0311z4.f4865h = j;
            c0311z4.f4862d += c0311z4.f4863e;
            d1(y10, c0311z4, e0Var, false);
            C0311z c0311z5 = this.f13592q;
            i10 = c0311z5.f4860b;
            int i23 = c0311z5.f4861c;
            if (i23 > 0) {
                z1(i21, i11);
                C0311z c0311z6 = this.f13592q;
                c0311z6.f4865h = i23;
                d1(y10, c0311z6, e0Var, false);
                i11 = this.f13592q.f4860b;
            }
        } else {
            y1(vVar.f2874b, vVar.f2875c);
            C0311z c0311z7 = this.f13592q;
            c0311z7.f4865h = j;
            d1(y10, c0311z7, e0Var, false);
            C0311z c0311z8 = this.f13592q;
            i10 = c0311z8.f4860b;
            int i24 = c0311z8.f4862d;
            int i25 = c0311z8.f4861c;
            if (i25 > 0) {
                m11 += i25;
            }
            z1(vVar.f2874b, vVar.f2875c);
            C0311z c0311z9 = this.f13592q;
            c0311z9.f4865h = m11;
            c0311z9.f4862d += c0311z9.f4863e;
            d1(y10, c0311z9, e0Var, false);
            C0311z c0311z10 = this.f13592q;
            int i26 = c0311z10.f4860b;
            int i27 = c0311z10.f4861c;
            if (i27 > 0) {
                y1(i24, i10);
                C0311z c0311z11 = this.f13592q;
                c0311z11.f4865h = i27;
                d1(y10, c0311z11, e0Var, false);
                i10 = this.f13592q.f4860b;
            }
            i11 = i26;
        }
        if (y() > 0) {
            if (this.f13596u ^ this.f13597v) {
                int k13 = k1(i10, y10, e0Var, true);
                i12 = i11 + k13;
                i13 = i10 + k13;
                k12 = l1(i12, y10, e0Var, false);
            } else {
                int l12 = l1(i11, y10, e0Var, true);
                i12 = i11 + l12;
                i13 = i10 + l12;
                k12 = k1(i13, y10, e0Var, false);
            }
            i11 = i12 + k12;
            i10 = i13 + k12;
        }
        if (e0Var.k && y() != 0 && !e0Var.g && V0()) {
            List list2 = y10.f4629d;
            int size = list2.size();
            int O10 = a.O(x(0));
            int i28 = 0;
            int i29 = 0;
            for (int i30 = 0; i30 < size; i30++) {
                i0 i0Var = (i0) list2.get(i30);
                if (!i0Var.k()) {
                    boolean z15 = i0Var.d() < O10;
                    boolean z16 = this.f13596u;
                    View view = i0Var.f4707a;
                    if (z15 != z16) {
                        i28 += this.f13593r.e(view);
                    } else {
                        i29 += this.f13593r.e(view);
                    }
                }
            }
            this.f13592q.k = list2;
            if (i28 > 0) {
                z1(a.O(n1()), i11);
                C0311z c0311z12 = this.f13592q;
                c0311z12.f4865h = i28;
                c0311z12.f4861c = 0;
                c0311z12.a(null);
                d1(y10, this.f13592q, e0Var, false);
            }
            if (i29 > 0) {
                y1(a.O(m1()), i10);
                C0311z c0311z13 = this.f13592q;
                c0311z13.f4865h = i29;
                c0311z13.f4861c = 0;
                list = null;
                c0311z13.a(null);
                d1(y10, this.f13592q, e0Var, false);
            } else {
                list = null;
            }
            this.f13592q.k = list;
        }
        if (e0Var.g) {
            vVar.f();
        } else {
            E e2 = this.f13593r;
            e2.f4586a = e2.n();
        }
        this.f13594s = this.f13597v;
    }

    public void p1(Y y10, e0 e0Var, C0311z c0311z, C0310y c0310y) {
        int i7;
        int i10;
        int i11;
        int i12;
        View b2 = c0311z.b(y10);
        if (b2 == null) {
            c0310y.f4856b = true;
            return;
        }
        T t5 = (T) b2.getLayoutParams();
        if (c0311z.k == null) {
            if (this.f13596u == (c0311z.f4864f == -1)) {
                b(b2);
            } else {
                c(b2, 0, false);
            }
        } else {
            if (this.f13596u == (c0311z.f4864f == -1)) {
                c(b2, -1, true);
            } else {
                c(b2, 0, true);
            }
        }
        T t10 = (T) b2.getLayoutParams();
        Rect N10 = this.f13708b.N(b2);
        int i13 = N10.left + N10.right;
        int i14 = N10.top + N10.bottom;
        int z8 = a.z(f(), this.f13717n, this.f13715l, M() + L() + ((ViewGroup.MarginLayoutParams) t10).leftMargin + ((ViewGroup.MarginLayoutParams) t10).rightMargin + i13, ((ViewGroup.MarginLayoutParams) t10).width);
        int z10 = a.z(g(), this.f13718o, this.f13716m, K() + N() + ((ViewGroup.MarginLayoutParams) t10).topMargin + ((ViewGroup.MarginLayoutParams) t10).bottomMargin + i14, ((ViewGroup.MarginLayoutParams) t10).height);
        if (Q0(b2, z8, z10, t10)) {
            b2.measure(z8, z10);
        }
        c0310y.f4855a = this.f13593r.e(b2);
        if (this.f13591p == 1) {
            if (o1()) {
                i12 = this.f13717n - M();
                i7 = i12 - this.f13593r.f(b2);
            } else {
                i7 = L();
                i12 = this.f13593r.f(b2) + i7;
            }
            if (c0311z.f4864f == -1) {
                i10 = c0311z.f4860b;
                i11 = i10 - c0310y.f4855a;
            } else {
                i11 = c0311z.f4860b;
                i10 = c0310y.f4855a + i11;
            }
        } else {
            int N11 = N();
            int f4 = this.f13593r.f(b2) + N11;
            if (c0311z.f4864f == -1) {
                int i15 = c0311z.f4860b;
                int i16 = i15 - c0310y.f4855a;
                i12 = i15;
                i10 = f4;
                i7 = i16;
                i11 = N11;
            } else {
                int i17 = c0311z.f4860b;
                int i18 = c0310y.f4855a + i17;
                i7 = i17;
                i10 = f4;
                i11 = N11;
                i12 = i18;
            }
        }
        a.W(b2, i7, i11, i12, i10);
        if (t5.f4615a.k() || t5.f4615a.n()) {
            c0310y.f4857c = true;
        }
        c0310y.f4858d = b2.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.a
    public int q(e0 e0Var) {
        return a1(e0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public void q0(e0 e0Var) {
        this.f13601z = null;
        this.f13599x = -1;
        this.f13600y = Integer.MIN_VALUE;
        this.f13587A.f();
    }

    public void q1(Y y10, e0 e0Var, v vVar, int i7) {
    }

    public final void r1(Y y10, C0311z c0311z) {
        if (!c0311z.f4859a || c0311z.f4867l) {
            return;
        }
        int i7 = c0311z.g;
        int i10 = c0311z.f4866i;
        if (c0311z.f4864f == -1) {
            int y11 = y();
            if (i7 < 0) {
                return;
            }
            int h10 = (this.f13593r.h() - i7) + i10;
            if (this.f13596u) {
                for (int i11 = 0; i11 < y11; i11++) {
                    View x2 = x(i11);
                    if (this.f13593r.g(x2) < h10 || this.f13593r.q(x2) < h10) {
                        s1(y10, 0, i11);
                        return;
                    }
                }
                return;
            }
            int i12 = y11 - 1;
            for (int i13 = i12; i13 >= 0; i13--) {
                View x10 = x(i13);
                if (this.f13593r.g(x10) < h10 || this.f13593r.q(x10) < h10) {
                    s1(y10, i12, i13);
                    return;
                }
            }
            return;
        }
        if (i7 < 0) {
            return;
        }
        int i14 = i7 - i10;
        int y12 = y();
        if (!this.f13596u) {
            for (int i15 = 0; i15 < y12; i15++) {
                View x11 = x(i15);
                if (this.f13593r.d(x11) > i14 || this.f13593r.p(x11) > i14) {
                    s1(y10, 0, i15);
                    return;
                }
            }
            return;
        }
        int i16 = y12 - 1;
        for (int i17 = i16; i17 >= 0; i17--) {
            View x12 = x(i17);
            if (this.f13593r.d(x12) > i14 || this.f13593r.p(x12) > i14) {
                s1(y10, i16, i17);
                return;
            }
        }
    }

    public final void s1(Y y10, int i7, int i10) {
        if (i7 == i10) {
            return;
        }
        if (i10 <= i7) {
            while (i7 > i10) {
                C0(i7, y10);
                i7--;
            }
        } else {
            for (int i11 = i10 - 1; i11 >= i7; i11--) {
                C0(i11, y10);
            }
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final View t(int i7) {
        int y10 = y();
        if (y10 == 0) {
            return null;
        }
        int O10 = i7 - a.O(x(0));
        if (O10 >= 0 && O10 < y10) {
            View x2 = x(O10);
            if (a.O(x2) == i7) {
                return x2;
            }
        }
        return super.t(i7);
    }

    public final void t1() {
        if (this.f13591p == 1 || !o1()) {
            this.f13596u = this.f13595t;
        } else {
            this.f13596u = !this.f13595t;
        }
    }

    @Override // androidx.recyclerview.widget.a
    public T u() {
        return new T(-2, -2);
    }

    @Override // androidx.recyclerview.widget.a
    public final void u0(Parcelable parcelable) {
        if (parcelable instanceof A) {
            A a9 = (A) parcelable;
            this.f13601z = a9;
            if (this.f13599x != -1) {
                a9.f4569a = -1;
            }
            F0();
        }
    }

    public final int u1(int i7, Y y10, e0 e0Var) {
        if (y() == 0 || i7 == 0) {
            return 0;
        }
        c1();
        this.f13592q.f4859a = true;
        int i10 = i7 > 0 ? 1 : -1;
        int abs = Math.abs(i7);
        x1(i10, abs, true, e0Var);
        C0311z c0311z = this.f13592q;
        int d12 = d1(y10, c0311z, e0Var, false) + c0311z.g;
        if (d12 < 0) {
            return 0;
        }
        if (abs > d12) {
            i7 = i10 * d12;
        }
        this.f13593r.r(-i7);
        this.f13592q.j = i7;
        return i7;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object, H2.A] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.os.Parcelable, java.lang.Object, H2.A] */
    @Override // androidx.recyclerview.widget.a
    public final Parcelable v0() {
        A a9 = this.f13601z;
        if (a9 != null) {
            ?? obj = new Object();
            obj.f4569a = a9.f4569a;
            obj.f4570b = a9.f4570b;
            obj.f4571c = a9.f4571c;
            return obj;
        }
        ?? obj2 = new Object();
        if (y() > 0) {
            c1();
            boolean z8 = this.f13594s ^ this.f13596u;
            obj2.f4571c = z8;
            if (z8) {
                View m12 = m1();
                obj2.f4570b = this.f13593r.i() - this.f13593r.d(m12);
                obj2.f4569a = a.O(m12);
            } else {
                View n12 = n1();
                obj2.f4569a = a.O(n12);
                obj2.f4570b = this.f13593r.g(n12) - this.f13593r.m();
            }
        } else {
            obj2.f4569a = -1;
        }
        return obj2;
    }

    public final void v1(int i7) {
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException(o.l(i7, "invalid orientation:"));
        }
        d(null);
        if (i7 != this.f13591p || this.f13593r == null) {
            E b2 = E.b(this, i7);
            this.f13593r = b2;
            this.f13587A.f2878f = b2;
            this.f13591p = i7;
            F0();
        }
    }

    public void w1(boolean z8) {
        d(null);
        if (this.f13597v == z8) {
            return;
        }
        this.f13597v = z8;
        F0();
    }

    public final void x1(int i7, int i10, boolean z8, e0 e0Var) {
        int m10;
        this.f13592q.f4867l = this.f13593r.k() == 0 && this.f13593r.h() == 0;
        this.f13592q.f4864f = i7;
        int[] iArr = this.f13590D;
        iArr[0] = 0;
        iArr[1] = 0;
        W0(e0Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z10 = i7 == 1;
        C0311z c0311z = this.f13592q;
        int i11 = z10 ? max2 : max;
        c0311z.f4865h = i11;
        if (!z10) {
            max = max2;
        }
        c0311z.f4866i = max;
        if (z10) {
            c0311z.f4865h = this.f13593r.j() + i11;
            View m12 = m1();
            C0311z c0311z2 = this.f13592q;
            c0311z2.f4863e = this.f13596u ? -1 : 1;
            int O10 = a.O(m12);
            C0311z c0311z3 = this.f13592q;
            c0311z2.f4862d = O10 + c0311z3.f4863e;
            c0311z3.f4860b = this.f13593r.d(m12);
            m10 = this.f13593r.d(m12) - this.f13593r.i();
        } else {
            View n12 = n1();
            C0311z c0311z4 = this.f13592q;
            c0311z4.f4865h = this.f13593r.m() + c0311z4.f4865h;
            C0311z c0311z5 = this.f13592q;
            c0311z5.f4863e = this.f13596u ? 1 : -1;
            int O11 = a.O(n12);
            C0311z c0311z6 = this.f13592q;
            c0311z5.f4862d = O11 + c0311z6.f4863e;
            c0311z6.f4860b = this.f13593r.g(n12);
            m10 = (-this.f13593r.g(n12)) + this.f13593r.m();
        }
        C0311z c0311z7 = this.f13592q;
        c0311z7.f4861c = i10;
        if (z8) {
            c0311z7.f4861c = i10 - m10;
        }
        c0311z7.g = m10;
    }

    public final void y1(int i7, int i10) {
        this.f13592q.f4861c = this.f13593r.i() - i10;
        C0311z c0311z = this.f13592q;
        c0311z.f4863e = this.f13596u ? -1 : 1;
        c0311z.f4862d = i7;
        c0311z.f4864f = 1;
        c0311z.f4860b = i10;
        c0311z.g = Integer.MIN_VALUE;
    }

    public final void z1(int i7, int i10) {
        this.f13592q.f4861c = i10 - this.f13593r.m();
        C0311z c0311z = this.f13592q;
        c0311z.f4862d = i7;
        c0311z.f4863e = this.f13596u ? 1 : -1;
        c0311z.f4864f = -1;
        c0311z.f4860b = i10;
        c0311z.g = Integer.MIN_VALUE;
    }
}
