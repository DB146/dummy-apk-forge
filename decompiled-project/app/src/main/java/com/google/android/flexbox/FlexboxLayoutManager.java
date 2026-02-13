package com.google.android.flexbox;

import A9.O0;
import H2.B;
import H2.D;
import H2.E;
import H2.K;
import H2.S;
import H2.T;
import H2.Y;
import H2.d0;
import H2.e0;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import d5.C1052c;
import java.util.ArrayList;
import java.util.List;
import q5.C1891b;
import q5.C1892c;
import q5.C1893d;
import q5.C1894e;
import q5.C1895f;

/* loaded from: classes.dex */
public class FlexboxLayoutManager extends a implements d0 {

    /* renamed from: N, reason: collision with root package name */
    public static final Rect f14809N = new Rect();

    /* renamed from: A, reason: collision with root package name */
    public final C1892c f14810A;

    /* renamed from: B, reason: collision with root package name */
    public E f14811B;

    /* renamed from: C, reason: collision with root package name */
    public E f14812C;

    /* renamed from: D, reason: collision with root package name */
    public C1895f f14813D;

    /* renamed from: E, reason: collision with root package name */
    public int f14814E;

    /* renamed from: F, reason: collision with root package name */
    public int f14815F;

    /* renamed from: G, reason: collision with root package name */
    public int f14816G;

    /* renamed from: H, reason: collision with root package name */
    public int f14817H;

    /* renamed from: I, reason: collision with root package name */
    public final SparseArray f14818I;

    /* renamed from: J, reason: collision with root package name */
    public final Context f14819J;

    /* renamed from: K, reason: collision with root package name */
    public View f14820K;
    public int L;

    /* renamed from: M, reason: collision with root package name */
    public final C1052c f14821M;

    /* renamed from: p, reason: collision with root package name */
    public int f14822p;

    /* renamed from: q, reason: collision with root package name */
    public final int f14823q;

    /* renamed from: r, reason: collision with root package name */
    public final int f14824r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f14826t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f14827u;

    /* renamed from: w, reason: collision with root package name */
    public final O0 f14829w;

    /* renamed from: x, reason: collision with root package name */
    public Y f14830x;

    /* renamed from: y, reason: collision with root package name */
    public e0 f14831y;

    /* renamed from: z, reason: collision with root package name */
    public C1894e f14832z;

    /* renamed from: s, reason: collision with root package name */
    public final int f14825s = -1;

    /* renamed from: v, reason: collision with root package name */
    public List f14828v = new ArrayList();

    /* JADX WARN: Type inference failed for: r0v1, types: [d5.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [A9.O0, java.lang.Object] */
    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i7, int i10) {
        ?? obj = new Object();
        obj.f922a = this;
        this.f14829w = obj;
        this.f14810A = new C1892c(this);
        this.f14814E = -1;
        this.f14815F = Integer.MIN_VALUE;
        this.f14816G = Integer.MIN_VALUE;
        this.f14817H = Integer.MIN_VALUE;
        this.f14818I = new SparseArray();
        this.L = -1;
        this.f14821M = new Object();
        S P10 = a.P(context, attributeSet, i7, i10);
        int i11 = P10.f4611a;
        if (i11 != 0) {
            if (i11 == 1) {
                if (P10.f4613c) {
                    q1(3);
                } else {
                    q1(2);
                }
            }
        } else if (P10.f4613c) {
            q1(1);
        } else {
            q1(0);
        }
        int i12 = this.f14823q;
        if (i12 != 1) {
            if (i12 == 0) {
                y0();
                this.f14828v.clear();
                C1892c c1892c = this.f14810A;
                C1892c.b(c1892c);
                c1892c.f23485d = 0;
            }
            this.f14823q = 1;
            this.f14811B = null;
            this.f14812C = null;
            F0();
        }
        if (this.f14824r != 4) {
            y0();
            this.f14828v.clear();
            C1892c c1892c2 = this.f14810A;
            C1892c.b(c1892c2);
            c1892c2.f23485d = 0;
            this.f14824r = 4;
            F0();
        }
        this.f14819J = context;
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

    @Override // androidx.recyclerview.widget.a
    public final int H0(int i7, Y y10, e0 e0Var) {
        if (!o1() || this.f14823q == 0) {
            int m12 = m1(i7, y10, e0Var);
            this.f14818I.clear();
            return m12;
        }
        int n12 = n1(i7);
        this.f14810A.f23485d += n12;
        this.f14812C.r(-n12);
        return n12;
    }

    @Override // androidx.recyclerview.widget.a
    public final void I0(int i7) {
        this.f14814E = i7;
        this.f14815F = Integer.MIN_VALUE;
        C1895f c1895f = this.f14813D;
        if (c1895f != null) {
            c1895f.f23506a = -1;
        }
        F0();
    }

    @Override // androidx.recyclerview.widget.a
    public final int J0(int i7, Y y10, e0 e0Var) {
        if (o1() || (this.f14823q == 0 && !o1())) {
            int m12 = m1(i7, y10, e0Var);
            this.f14818I.clear();
            return m12;
        }
        int n12 = n1(i7);
        this.f14810A.f23485d += n12;
        this.f14812C.r(-n12);
        return n12;
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean T() {
        return true;
    }

    @Override // androidx.recyclerview.widget.a
    public final void T0(RecyclerView recyclerView, int i7) {
        B b2 = new B(recyclerView.getContext());
        b2.f4572a = i7;
        U0(b2);
    }

    public final int W0(e0 e0Var) {
        if (y() == 0) {
            return 0;
        }
        int b2 = e0Var.b();
        Z0();
        View b12 = b1(b2);
        View d12 = d1(b2);
        if (e0Var.b() == 0 || b12 == null || d12 == null) {
            return 0;
        }
        return Math.min(this.f14811B.n(), this.f14811B.d(d12) - this.f14811B.g(b12));
    }

    public final int X0(e0 e0Var) {
        if (y() == 0) {
            return 0;
        }
        int b2 = e0Var.b();
        View b12 = b1(b2);
        View d12 = d1(b2);
        if (e0Var.b() != 0 && b12 != null && d12 != null) {
            int O10 = a.O(b12);
            int O11 = a.O(d12);
            int abs = Math.abs(this.f14811B.d(d12) - this.f14811B.g(b12));
            int i7 = ((int[]) this.f14829w.f924c)[O10];
            if (i7 != 0 && i7 != -1) {
                return Math.round((i7 * (abs / ((r4[O11] - i7) + 1))) + (this.f14811B.m() - this.f14811B.g(b12)));
            }
        }
        return 0;
    }

    public final int Y0(e0 e0Var) {
        if (y() == 0) {
            return 0;
        }
        int b2 = e0Var.b();
        View b12 = b1(b2);
        View d12 = d1(b2);
        if (e0Var.b() == 0 || b12 == null || d12 == null) {
            return 0;
        }
        View f12 = f1(0, y());
        int O10 = f12 == null ? -1 : a.O(f12);
        return (int) ((Math.abs(this.f14811B.d(d12) - this.f14811B.g(b12)) / (((f1(y() - 1, -1) != null ? a.O(r4) : -1) - O10) + 1)) * e0Var.b());
    }

    @Override // androidx.recyclerview.widget.a
    public final void Z(K k, K k7) {
        y0();
    }

    public final void Z0() {
        if (this.f14811B != null) {
            return;
        }
        if (o1()) {
            if (this.f14823q == 0) {
                this.f14811B = new D(this, 0);
                this.f14812C = new D(this, 1);
                return;
            } else {
                this.f14811B = new D(this, 1);
                this.f14812C = new D(this, 0);
                return;
            }
        }
        if (this.f14823q == 0) {
            this.f14811B = new D(this, 1);
            this.f14812C = new D(this, 0);
        } else {
            this.f14811B = new D(this, 0);
            this.f14812C = new D(this, 1);
        }
    }

    @Override // H2.d0
    public final PointF a(int i7) {
        View x2;
        if (y() == 0 || (x2 = x(0)) == null) {
            return null;
        }
        int i10 = i7 < a.O(x2) ? -1 : 1;
        return o1() ? new PointF(0.0f, i10) : new PointF(i10, 0.0f);
    }

    public final int a1(Y y10, e0 e0Var, C1894e c1894e) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        O0 o02;
        View view;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        O0 o03;
        Rect rect;
        int i25;
        C1893d c1893d;
        int i26 = c1894e.f23503f;
        if (i26 != Integer.MIN_VALUE) {
            int i27 = c1894e.f23498a;
            if (i27 < 0) {
                c1894e.f23503f = i26 + i27;
            }
            p1(y10, c1894e);
        }
        int i28 = c1894e.f23498a;
        boolean o12 = o1();
        int i29 = i28;
        int i30 = 0;
        while (true) {
            if (i29 <= 0 && !this.f14832z.f23499b) {
                break;
            }
            List list = this.f14828v;
            int i31 = c1894e.f23501d;
            if (i31 < 0 || i31 >= e0Var.b() || (i7 = c1894e.f23500c) < 0 || i7 >= list.size()) {
                break;
            }
            C1891b c1891b = (C1891b) this.f14828v.get(c1894e.f23500c);
            c1894e.f23501d = c1891b.k;
            boolean o13 = o1();
            C1892c c1892c = this.f14810A;
            O0 o04 = this.f14829w;
            Rect rect2 = f14809N;
            if (o13) {
                int L = L();
                int M3 = M();
                int i32 = this.f13717n;
                int i33 = c1894e.f23502e;
                if (c1894e.f23504h == -1) {
                    i33 -= c1891b.f23473c;
                }
                int i34 = i33;
                int i35 = c1894e.f23501d;
                float f4 = c1892c.f23485d;
                float f10 = L - f4;
                float f11 = (i32 - M3) - f4;
                float max = Math.max(0.0f, 0.0f);
                int i36 = c1891b.f23474d;
                i10 = i28;
                int i37 = i35;
                int i38 = 0;
                while (i37 < i35 + i36) {
                    View k12 = k1(i37);
                    if (k12 == null) {
                        i23 = i37;
                        i24 = i36;
                        rect = rect2;
                        o03 = o04;
                        i22 = i35;
                    } else {
                        int i39 = i36;
                        i22 = i35;
                        if (c1894e.f23504h == 1) {
                            e(rect2, k12);
                            b(k12);
                        } else {
                            e(rect2, k12);
                            c(k12, i38, false);
                            i38++;
                        }
                        Rect rect3 = rect2;
                        O0 o05 = o04;
                        long j = ((long[]) o04.f925d)[i37];
                        int i40 = (int) j;
                        int i41 = (int) (j >> 32);
                        C1893d c1893d2 = (C1893d) k12.getLayoutParams();
                        if (r1(k12, i40, i41, c1893d2)) {
                            k12.measure(i40, i41);
                        }
                        float f12 = f10 + ((ViewGroup.MarginLayoutParams) c1893d2).leftMargin + ((T) k12.getLayoutParams()).f4616b.left;
                        float f13 = f11 - (((ViewGroup.MarginLayoutParams) c1893d2).rightMargin + ((T) k12.getLayoutParams()).f4616b.right);
                        int i42 = i34 + ((T) k12.getLayoutParams()).f4616b.top;
                        if (this.f14826t) {
                            i23 = i37;
                            i24 = i39;
                            rect = rect3;
                            o03 = o05;
                            i25 = i38;
                            c1893d = c1893d2;
                            this.f14829w.v(k12, c1891b, Math.round(f13) - k12.getMeasuredWidth(), i42, Math.round(f13), k12.getMeasuredHeight() + i42);
                        } else {
                            i23 = i37;
                            i24 = i39;
                            o03 = o05;
                            rect = rect3;
                            i25 = i38;
                            c1893d = c1893d2;
                            this.f14829w.v(k12, c1891b, Math.round(f12), i42, k12.getMeasuredWidth() + Math.round(f12), k12.getMeasuredHeight() + i42);
                        }
                        f10 = k12.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1893d).rightMargin + ((T) k12.getLayoutParams()).f4616b.right + max + f12;
                        f11 = f13 - (((k12.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1893d).leftMargin) + ((T) k12.getLayoutParams()).f4616b.left) + max);
                        i38 = i25;
                    }
                    i37 = i23 + 1;
                    i35 = i22;
                    i36 = i24;
                    rect2 = rect;
                    o04 = o03;
                }
                c1894e.f23500c += this.f14832z.f23504h;
                i15 = c1891b.f23473c;
                i13 = i29;
                i14 = i30;
            } else {
                i10 = i28;
                O0 o06 = o04;
                int N10 = N();
                int K10 = K();
                int i43 = this.f13718o;
                int i44 = c1894e.f23502e;
                if (c1894e.f23504h == -1) {
                    int i45 = c1891b.f23473c;
                    i12 = i44 + i45;
                    i11 = i44 - i45;
                } else {
                    i11 = i44;
                    i12 = i11;
                }
                int i46 = c1894e.f23501d;
                float f14 = i43 - K10;
                float f15 = c1892c.f23485d;
                float f16 = N10 - f15;
                float f17 = f14 - f15;
                float max2 = Math.max(0.0f, 0.0f);
                int i47 = c1891b.f23474d;
                int i48 = i46;
                int i49 = 0;
                while (i48 < i46 + i47) {
                    View k13 = k1(i48);
                    if (k13 == null) {
                        i16 = i29;
                        i17 = i30;
                        i19 = i48;
                        i21 = i47;
                        i20 = i46;
                        o02 = o06;
                    } else {
                        int i50 = i47;
                        O0 o07 = o06;
                        i16 = i29;
                        i17 = i30;
                        long j10 = ((long[]) o07.f925d)[i48];
                        int i51 = (int) j10;
                        int i52 = (int) (j10 >> 32);
                        if (r1(k13, i51, i52, (C1893d) k13.getLayoutParams())) {
                            k13.measure(i51, i52);
                        }
                        float f18 = f16 + ((ViewGroup.MarginLayoutParams) r8).topMargin + ((T) k13.getLayoutParams()).f4616b.top;
                        float f19 = f17 - (((ViewGroup.MarginLayoutParams) r8).rightMargin + ((T) k13.getLayoutParams()).f4616b.bottom);
                        if (c1894e.f23504h == 1) {
                            e(rect2, k13);
                            b(k13);
                            i18 = i49;
                        } else {
                            e(rect2, k13);
                            c(k13, i49, false);
                            i18 = i49 + 1;
                        }
                        int i53 = i11 + ((T) k13.getLayoutParams()).f4616b.left;
                        int i54 = i12 - ((T) k13.getLayoutParams()).f4616b.right;
                        boolean z8 = this.f14826t;
                        if (!z8) {
                            o02 = o07;
                            view = k13;
                            i19 = i48;
                            i20 = i46;
                            i21 = i50;
                            if (this.f14827u) {
                                this.f14829w.w(view, c1891b, z8, i53, Math.round(f19) - view.getMeasuredHeight(), view.getMeasuredWidth() + i53, Math.round(f19));
                            } else {
                                this.f14829w.w(view, c1891b, z8, i53, Math.round(f18), view.getMeasuredWidth() + i53, view.getMeasuredHeight() + Math.round(f18));
                            }
                        } else if (this.f14827u) {
                            o02 = o07;
                            view = k13;
                            i19 = i48;
                            i21 = i50;
                            i20 = i46;
                            this.f14829w.w(k13, c1891b, z8, i54 - k13.getMeasuredWidth(), Math.round(f19) - k13.getMeasuredHeight(), i54, Math.round(f19));
                        } else {
                            o02 = o07;
                            view = k13;
                            i19 = i48;
                            i20 = i46;
                            i21 = i50;
                            this.f14829w.w(view, c1891b, z8, i54 - view.getMeasuredWidth(), Math.round(f18), i54, view.getMeasuredHeight() + Math.round(f18));
                        }
                        f17 = f19 - (((view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r8).bottomMargin) + ((T) view.getLayoutParams()).f4616b.top) + max2);
                        f16 = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r8).topMargin + ((T) view.getLayoutParams()).f4616b.bottom + max2 + f18;
                        i49 = i18;
                    }
                    i48 = i19 + 1;
                    i46 = i20;
                    i29 = i16;
                    i30 = i17;
                    o06 = o02;
                    i47 = i21;
                }
                i13 = i29;
                i14 = i30;
                c1894e.f23500c += this.f14832z.f23504h;
                i15 = c1891b.f23473c;
            }
            i30 = i14 + i15;
            if (o12 || !this.f14826t) {
                c1894e.f23502e += c1891b.f23473c * c1894e.f23504h;
            } else {
                c1894e.f23502e -= c1891b.f23473c * c1894e.f23504h;
            }
            i29 = i13 - c1891b.f23473c;
            i28 = i10;
        }
        int i55 = i28;
        int i56 = i30;
        int i57 = c1894e.f23498a - i56;
        c1894e.f23498a = i57;
        int i58 = c1894e.f23503f;
        if (i58 != Integer.MIN_VALUE) {
            int i59 = i58 + i56;
            c1894e.f23503f = i59;
            if (i57 < 0) {
                c1894e.f23503f = i59 + i57;
            }
            p1(y10, c1894e);
        }
        return i55 - c1894e.f23498a;
    }

    @Override // androidx.recyclerview.widget.a
    public final void b0(RecyclerView recyclerView) {
        this.f14820K = (View) recyclerView.getParent();
    }

    public final View b1(int i7) {
        View g12 = g1(0, y(), i7);
        if (g12 == null) {
            return null;
        }
        int i10 = ((int[]) this.f14829w.f924c)[a.O(g12)];
        if (i10 == -1) {
            return null;
        }
        return c1(g12, (C1891b) this.f14828v.get(i10));
    }

    @Override // androidx.recyclerview.widget.a
    public final void c0(RecyclerView recyclerView) {
    }

    public final View c1(View view, C1891b c1891b) {
        boolean o12 = o1();
        int i7 = c1891b.f23474d;
        for (int i10 = 1; i10 < i7; i10++) {
            View x2 = x(i10);
            if (x2 != null && x2.getVisibility() != 8) {
                if (!this.f14826t || o12) {
                    if (this.f14811B.g(view) <= this.f14811B.g(x2)) {
                    }
                    view = x2;
                } else {
                    if (this.f14811B.d(view) >= this.f14811B.d(x2)) {
                    }
                    view = x2;
                }
            }
        }
        return view;
    }

    public final View d1(int i7) {
        View g12 = g1(y() - 1, -1, i7);
        if (g12 == null) {
            return null;
        }
        return e1(g12, (C1891b) this.f14828v.get(((int[]) this.f14829w.f924c)[a.O(g12)]));
    }

    public final View e1(View view, C1891b c1891b) {
        boolean o12 = o1();
        int y10 = (y() - c1891b.f23474d) - 1;
        for (int y11 = y() - 2; y11 > y10; y11--) {
            View x2 = x(y11);
            if (x2 != null && x2.getVisibility() != 8) {
                if (!this.f14826t || o12) {
                    if (this.f14811B.d(view) >= this.f14811B.d(x2)) {
                    }
                    view = x2;
                } else {
                    if (this.f14811B.g(view) <= this.f14811B.g(x2)) {
                    }
                    view = x2;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean f() {
        if (this.f14823q == 0) {
            return o1();
        }
        if (o1()) {
            int i7 = this.f13717n;
            View view = this.f14820K;
            if (i7 <= (view != null ? view.getWidth() : 0)) {
                return false;
            }
        }
        return true;
    }

    public final View f1(int i7, int i10) {
        int i11 = i10 > i7 ? 1 : -1;
        while (i7 != i10) {
            View x2 = x(i7);
            int L = L();
            int N10 = N();
            int M3 = this.f13717n - M();
            int K10 = this.f13718o - K();
            int D10 = D(x2) - ((ViewGroup.MarginLayoutParams) ((T) x2.getLayoutParams())).leftMargin;
            int H10 = H(x2) - ((ViewGroup.MarginLayoutParams) ((T) x2.getLayoutParams())).topMargin;
            int G9 = G(x2) + ((ViewGroup.MarginLayoutParams) ((T) x2.getLayoutParams())).rightMargin;
            int B10 = B(x2) + ((ViewGroup.MarginLayoutParams) ((T) x2.getLayoutParams())).bottomMargin;
            boolean z8 = D10 >= M3 || G9 >= L;
            boolean z10 = H10 >= K10 || B10 >= N10;
            if (z8 && z10) {
                return x2;
            }
            i7 += i11;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean g() {
        if (this.f14823q == 0) {
            return !o1();
        }
        if (o1()) {
            return true;
        }
        int i7 = this.f13718o;
        View view = this.f14820K;
        return i7 > (view != null ? view.getHeight() : 0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, q5.e] */
    public final View g1(int i7, int i10, int i11) {
        int O10;
        Z0();
        if (this.f14832z == null) {
            ?? obj = new Object();
            obj.f23504h = 1;
            this.f14832z = obj;
        }
        int m10 = this.f14811B.m();
        int i12 = this.f14811B.i();
        int i13 = i10 <= i7 ? -1 : 1;
        View view = null;
        View view2 = null;
        while (i7 != i10) {
            View x2 = x(i7);
            if (x2 != null && (O10 = a.O(x2)) >= 0 && O10 < i11) {
                if (((T) x2.getLayoutParams()).f4615a.k()) {
                    if (view2 == null) {
                        view2 = x2;
                    }
                } else {
                    if (this.f14811B.g(x2) >= m10 && this.f14811B.d(x2) <= i12) {
                        return x2;
                    }
                    if (view == null) {
                        view = x2;
                    }
                }
            }
            i7 += i13;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean h(T t5) {
        return t5 instanceof C1893d;
    }

    public final int h1(int i7, Y y10, e0 e0Var, boolean z8) {
        int i10;
        int i11;
        if (o1() || !this.f14826t) {
            int i12 = this.f14811B.i() - i7;
            if (i12 <= 0) {
                return 0;
            }
            i10 = -m1(-i12, y10, e0Var);
        } else {
            int m10 = i7 - this.f14811B.m();
            if (m10 <= 0) {
                return 0;
            }
            i10 = m1(m10, y10, e0Var);
        }
        int i13 = i7 + i10;
        if (!z8 || (i11 = this.f14811B.i() - i13) <= 0) {
            return i10;
        }
        this.f14811B.r(i11);
        return i11 + i10;
    }

    public final int i1(int i7, Y y10, e0 e0Var, boolean z8) {
        int i10;
        int m10;
        if (o1() || !this.f14826t) {
            int m11 = i7 - this.f14811B.m();
            if (m11 <= 0) {
                return 0;
            }
            i10 = -m1(m11, y10, e0Var);
        } else {
            int i11 = this.f14811B.i() - i7;
            if (i11 <= 0) {
                return 0;
            }
            i10 = m1(-i11, y10, e0Var);
        }
        int i12 = i7 + i10;
        if (!z8 || (m10 = i12 - this.f14811B.m()) <= 0) {
            return i10;
        }
        this.f14811B.r(-m10);
        return i10 - m10;
    }

    @Override // androidx.recyclerview.widget.a
    public final void j0(int i7, int i10) {
        s1(i7);
    }

    public final int j1(View view) {
        return o1() ? ((T) view.getLayoutParams()).f4616b.top + ((T) view.getLayoutParams()).f4616b.bottom : ((T) view.getLayoutParams()).f4616b.left + ((T) view.getLayoutParams()).f4616b.right;
    }

    public final View k1(int i7) {
        View view = (View) this.f14818I.get(i7);
        return view != null ? view : this.f14830x.d(i7);
    }

    @Override // androidx.recyclerview.widget.a
    public final int l(e0 e0Var) {
        return W0(e0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final void l0(int i7, int i10) {
        s1(Math.min(i7, i10));
    }

    public final int l1() {
        if (this.f14828v.size() == 0) {
            return 0;
        }
        int size = this.f14828v.size();
        int i7 = Integer.MIN_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            i7 = Math.max(i7, ((C1891b) this.f14828v.get(i10)).f23471a);
        }
        return i7;
    }

    @Override // androidx.recyclerview.widget.a
    public final int m(e0 e0Var) {
        return X0(e0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final void m0(int i7, int i10) {
        s1(i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m1(int i7, Y y10, e0 e0Var) {
        int a12;
        int i10;
        O0 o02;
        if (y() == 0 || i7 == 0) {
            return 0;
        }
        Z0();
        this.f14832z.f23505i = true;
        boolean z8 = !o1() && this.f14826t;
        int i11 = (!z8 ? i7 > 0 : i7 < 0) ? -1 : 1;
        int abs = Math.abs(i7);
        this.f14832z.f23504h = i11;
        boolean o12 = o1();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f13717n, this.f13715l);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.f13718o, this.f13716m);
        boolean z10 = !o12 && this.f14826t;
        O0 o03 = this.f14829w;
        if (i11 == 1) {
            View x2 = x(y() - 1);
            if (x2 != null) {
                this.f14832z.f23502e = this.f14811B.d(x2);
                int O10 = a.O(x2);
                View e12 = e1(x2, (C1891b) this.f14828v.get(((int[]) o03.f924c)[O10]));
                C1894e c1894e = this.f14832z;
                c1894e.getClass();
                int i12 = O10 + 1;
                c1894e.f23501d = i12;
                int[] iArr = (int[]) o03.f924c;
                if (iArr.length <= i12) {
                    c1894e.f23500c = -1;
                } else {
                    c1894e.f23500c = iArr[i12];
                }
                if (z10) {
                    c1894e.f23502e = this.f14811B.g(e12);
                    this.f14832z.f23503f = this.f14811B.m() + (-this.f14811B.g(e12));
                    C1894e c1894e2 = this.f14832z;
                    c1894e2.f23503f = Math.max(c1894e2.f23503f, 0);
                } else {
                    c1894e.f23502e = this.f14811B.d(e12);
                    this.f14832z.f23503f = this.f14811B.d(e12) - this.f14811B.i();
                }
                int i13 = this.f14832z.f23500c;
                if ((i13 == -1 || i13 > this.f14828v.size() - 1) && this.f14832z.f23501d <= this.f14831y.b()) {
                    C1894e c1894e3 = this.f14832z;
                    int i14 = abs - c1894e3.f23503f;
                    C1052c c1052c = this.f14821M;
                    c1052c.f16530a = null;
                    if (i14 > 0) {
                        if (o12) {
                            o02 = o03;
                            this.f14829w.e(c1052c, makeMeasureSpec, makeMeasureSpec2, i14, c1894e3.f23501d, -1, this.f14828v);
                        } else {
                            o02 = o03;
                            this.f14829w.e(c1052c, makeMeasureSpec2, makeMeasureSpec, i14, c1894e3.f23501d, -1, this.f14828v);
                        }
                        o02.k(makeMeasureSpec, makeMeasureSpec2, this.f14832z.f23501d);
                        o02.E(this.f14832z.f23501d);
                    }
                }
                C1894e c1894e4 = this.f14832z;
                c1894e4.f23498a = abs - c1894e4.f23503f;
            }
            C1894e c1894e5 = this.f14832z;
            a12 = a1(y10, e0Var, c1894e5) + c1894e5.f23503f;
            if (a12 >= 0) {
                return 0;
            }
            if (z8) {
                if (abs > a12) {
                    i10 = (-i11) * a12;
                }
                i10 = i7;
            } else {
                if (abs > a12) {
                    i10 = i11 * a12;
                }
                i10 = i7;
            }
            this.f14811B.r(-i10);
            this.f14832z.g = i10;
            return i10;
        }
        View x10 = x(0);
        if (x10 != null) {
            this.f14832z.f23502e = this.f14811B.g(x10);
            int O11 = a.O(x10);
            View c12 = c1(x10, (C1891b) this.f14828v.get(((int[]) o03.f924c)[O11]));
            C1894e c1894e6 = this.f14832z;
            c1894e6.getClass();
            int i15 = ((int[]) o03.f924c)[O11];
            if (i15 == -1) {
                i15 = 0;
            }
            if (i15 > 0) {
                this.f14832z.f23501d = O11 - ((C1891b) this.f14828v.get(i15 - 1)).f23474d;
            } else {
                c1894e6.f23501d = -1;
            }
            C1894e c1894e7 = this.f14832z;
            c1894e7.f23500c = i15 > 0 ? i15 - 1 : 0;
            if (z10) {
                c1894e7.f23502e = this.f14811B.d(c12);
                this.f14832z.f23503f = this.f14811B.d(c12) - this.f14811B.i();
                C1894e c1894e8 = this.f14832z;
                c1894e8.f23503f = Math.max(c1894e8.f23503f, 0);
            } else {
                c1894e7.f23502e = this.f14811B.g(c12);
                this.f14832z.f23503f = this.f14811B.m() + (-this.f14811B.g(c12));
            }
            C1894e c1894e42 = this.f14832z;
            c1894e42.f23498a = abs - c1894e42.f23503f;
        }
        C1894e c1894e52 = this.f14832z;
        a12 = a1(y10, e0Var, c1894e52) + c1894e52.f23503f;
        if (a12 >= 0) {
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final int n(e0 e0Var) {
        return Y0(e0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final void n0(int i7, int i10) {
        s1(i7);
    }

    public final int n1(int i7) {
        int i10;
        if (y() == 0 || i7 == 0) {
            return 0;
        }
        Z0();
        boolean o12 = o1();
        View view = this.f14820K;
        int width = o12 ? view.getWidth() : view.getHeight();
        int i11 = o12 ? this.f13717n : this.f13718o;
        int J10 = J();
        C1892c c1892c = this.f14810A;
        if (J10 == 1) {
            int abs = Math.abs(i7);
            if (i7 < 0) {
                return -Math.min((i11 + c1892c.f23485d) - width, abs);
            }
            i10 = c1892c.f23485d;
            if (i10 + i7 <= 0) {
                return i7;
            }
        } else {
            if (i7 > 0) {
                return Math.min((i11 - c1892c.f23485d) - width, i7);
            }
            i10 = c1892c.f23485d;
            if (i10 + i7 >= 0) {
                return i7;
            }
        }
        return -i10;
    }

    @Override // androidx.recyclerview.widget.a
    public final int o(e0 e0Var) {
        return W0(e0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final void o0(RecyclerView recyclerView, int i7, int i10) {
        s1(i7);
        s1(i7);
    }

    public final boolean o1() {
        int i7 = this.f14822p;
        return i7 == 0 || i7 == 1;
    }

    @Override // androidx.recyclerview.widget.a
    public final int p(e0 e0Var) {
        return X0(e0Var);
    }

    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object, q5.e] */
    @Override // androidx.recyclerview.widget.a
    public final void p0(Y y10, e0 e0Var) {
        int i7;
        View x2;
        boolean z8;
        int i10;
        int i11;
        int i12;
        C1052c c1052c;
        int i13;
        this.f14830x = y10;
        this.f14831y = e0Var;
        int b2 = e0Var.b();
        if (b2 == 0 && e0Var.g) {
            return;
        }
        int J10 = J();
        int i14 = this.f14822p;
        if (i14 == 0) {
            this.f14826t = J10 == 1;
            this.f14827u = this.f14823q == 2;
        } else if (i14 == 1) {
            this.f14826t = J10 != 1;
            this.f14827u = this.f14823q == 2;
        } else if (i14 == 2) {
            boolean z10 = J10 == 1;
            this.f14826t = z10;
            if (this.f14823q == 2) {
                this.f14826t = !z10;
            }
            this.f14827u = false;
        } else if (i14 != 3) {
            this.f14826t = false;
            this.f14827u = false;
        } else {
            boolean z11 = J10 == 1;
            this.f14826t = z11;
            if (this.f14823q == 2) {
                this.f14826t = !z11;
            }
            this.f14827u = true;
        }
        Z0();
        if (this.f14832z == null) {
            ?? obj = new Object();
            obj.f23504h = 1;
            this.f14832z = obj;
        }
        O0 o02 = this.f14829w;
        o02.m(b2);
        o02.n(b2);
        o02.l(b2);
        this.f14832z.f23505i = false;
        C1895f c1895f = this.f14813D;
        if (c1895f != null && (i13 = c1895f.f23506a) >= 0 && i13 < b2) {
            this.f14814E = i13;
        }
        C1892c c1892c = this.f14810A;
        if (!c1892c.f23487f || this.f14814E != -1 || c1895f != null) {
            C1892c.b(c1892c);
            C1895f c1895f2 = this.f14813D;
            if (!e0Var.g && (i7 = this.f14814E) != -1) {
                if (i7 < 0 || i7 >= e0Var.b()) {
                    this.f14814E = -1;
                    this.f14815F = Integer.MIN_VALUE;
                } else {
                    int i15 = this.f14814E;
                    c1892c.f23482a = i15;
                    c1892c.f23483b = ((int[]) o02.f924c)[i15];
                    C1895f c1895f3 = this.f14813D;
                    if (c1895f3 != null) {
                        int b10 = e0Var.b();
                        int i16 = c1895f3.f23506a;
                        if (i16 >= 0 && i16 < b10) {
                            c1892c.f23484c = this.f14811B.m() + c1895f2.f23507b;
                            c1892c.g = true;
                            c1892c.f23483b = -1;
                            c1892c.f23487f = true;
                        }
                    }
                    if (this.f14815F == Integer.MIN_VALUE) {
                        View t5 = t(this.f14814E);
                        if (t5 == null) {
                            if (y() > 0 && (x2 = x(0)) != null) {
                                c1892c.f23486e = this.f14814E < a.O(x2);
                            }
                            C1892c.a(c1892c);
                        } else if (this.f14811B.e(t5) > this.f14811B.n()) {
                            C1892c.a(c1892c);
                        } else if (this.f14811B.g(t5) - this.f14811B.m() < 0) {
                            c1892c.f23484c = this.f14811B.m();
                            c1892c.f23486e = false;
                        } else if (this.f14811B.i() - this.f14811B.d(t5) < 0) {
                            c1892c.f23484c = this.f14811B.i();
                            c1892c.f23486e = true;
                        } else {
                            c1892c.f23484c = c1892c.f23486e ? this.f14811B.o() + this.f14811B.d(t5) : this.f14811B.g(t5);
                        }
                    } else if (o1() || !this.f14826t) {
                        c1892c.f23484c = this.f14811B.m() + this.f14815F;
                    } else {
                        c1892c.f23484c = this.f14815F - this.f14811B.j();
                    }
                    c1892c.f23487f = true;
                }
            }
            if (y() != 0) {
                View d12 = c1892c.f23486e ? d1(e0Var.b()) : b1(e0Var.b());
                if (d12 != null) {
                    FlexboxLayoutManager flexboxLayoutManager = c1892c.f23488h;
                    E e2 = flexboxLayoutManager.f14823q == 0 ? flexboxLayoutManager.f14812C : flexboxLayoutManager.f14811B;
                    if (flexboxLayoutManager.o1() || !flexboxLayoutManager.f14826t) {
                        if (c1892c.f23486e) {
                            c1892c.f23484c = e2.o() + e2.d(d12);
                        } else {
                            c1892c.f23484c = e2.g(d12);
                        }
                    } else if (c1892c.f23486e) {
                        c1892c.f23484c = e2.o() + e2.g(d12);
                    } else {
                        c1892c.f23484c = e2.d(d12);
                    }
                    int O10 = a.O(d12);
                    c1892c.f23482a = O10;
                    c1892c.g = false;
                    int[] iArr = (int[]) flexboxLayoutManager.f14829w.f924c;
                    if (O10 == -1) {
                        O10 = 0;
                    }
                    int i17 = iArr[O10];
                    if (i17 == -1) {
                        i17 = 0;
                    }
                    c1892c.f23483b = i17;
                    int size = flexboxLayoutManager.f14828v.size();
                    int i18 = c1892c.f23483b;
                    if (size > i18) {
                        c1892c.f23482a = ((C1891b) flexboxLayoutManager.f14828v.get(i18)).k;
                    }
                    boolean z12 = e0Var.g;
                    c1892c.f23487f = true;
                }
            }
            C1892c.a(c1892c);
            c1892c.f23482a = 0;
            c1892c.f23483b = 0;
            c1892c.f23487f = true;
        }
        r(y10);
        if (c1892c.f23486e) {
            u1(c1892c, false, true);
        } else {
            t1(c1892c, false, true);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f13717n, this.f13715l);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.f13718o, this.f13716m);
        int i19 = this.f13717n;
        int i20 = this.f13718o;
        boolean o12 = o1();
        Context context = this.f14819J;
        if (o12) {
            int i21 = this.f14816G;
            z8 = (i21 == Integer.MIN_VALUE || i21 == i19) ? false : true;
            C1894e c1894e = this.f14832z;
            i10 = c1894e.f23499b ? context.getResources().getDisplayMetrics().heightPixels : c1894e.f23498a;
        } else {
            int i22 = this.f14817H;
            z8 = (i22 == Integer.MIN_VALUE || i22 == i20) ? false : true;
            C1894e c1894e2 = this.f14832z;
            i10 = c1894e2.f23499b ? context.getResources().getDisplayMetrics().widthPixels : c1894e2.f23498a;
        }
        int i23 = i10;
        this.f14816G = i19;
        this.f14817H = i20;
        int i24 = this.L;
        C1052c c1052c2 = this.f14821M;
        if (i24 != -1 || (this.f14814E == -1 && !z8)) {
            int min = i24 != -1 ? Math.min(i24, c1892c.f23482a) : c1892c.f23482a;
            c1052c2.f16530a = null;
            if (o1()) {
                if (this.f14828v.size() > 0) {
                    o02.h(min, this.f14828v);
                    this.f14829w.e(this.f14821M, makeMeasureSpec, makeMeasureSpec2, i23, min, c1892c.f23482a, this.f14828v);
                } else {
                    o02.l(b2);
                    this.f14829w.e(this.f14821M, makeMeasureSpec, makeMeasureSpec2, i23, 0, -1, this.f14828v);
                }
            } else if (this.f14828v.size() > 0) {
                o02.h(min, this.f14828v);
                this.f14829w.e(this.f14821M, makeMeasureSpec2, makeMeasureSpec, i23, min, c1892c.f23482a, this.f14828v);
            } else {
                o02.l(b2);
                this.f14829w.e(this.f14821M, makeMeasureSpec2, makeMeasureSpec, i23, 0, -1, this.f14828v);
            }
            this.f14828v = c1052c2.f16530a;
            o02.k(makeMeasureSpec, makeMeasureSpec2, min);
            o02.E(min);
        } else if (!c1892c.f23486e) {
            this.f14828v.clear();
            c1052c2.f16530a = null;
            if (o1()) {
                c1052c = c1052c2;
                this.f14829w.e(this.f14821M, makeMeasureSpec, makeMeasureSpec2, i23, 0, c1892c.f23482a, this.f14828v);
            } else {
                c1052c = c1052c2;
                this.f14829w.e(this.f14821M, makeMeasureSpec2, makeMeasureSpec, i23, 0, c1892c.f23482a, this.f14828v);
            }
            this.f14828v = c1052c.f16530a;
            o02.k(makeMeasureSpec, makeMeasureSpec2, 0);
            o02.E(0);
            int i25 = ((int[]) o02.f924c)[c1892c.f23482a];
            c1892c.f23483b = i25;
            this.f14832z.f23500c = i25;
        }
        a1(y10, e0Var, this.f14832z);
        if (c1892c.f23486e) {
            i12 = this.f14832z.f23502e;
            t1(c1892c, true, false);
            a1(y10, e0Var, this.f14832z);
            i11 = this.f14832z.f23502e;
        } else {
            i11 = this.f14832z.f23502e;
            u1(c1892c, true, false);
            a1(y10, e0Var, this.f14832z);
            i12 = this.f14832z.f23502e;
        }
        if (y() > 0) {
            if (c1892c.f23486e) {
                i1(h1(i11, y10, e0Var, true) + i12, y10, e0Var, false);
            } else {
                h1(i1(i12, y10, e0Var, true) + i11, y10, e0Var, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0106 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p1(Y y10, C1894e c1894e) {
        int y11;
        int i7;
        int y12;
        int i10;
        View x2;
        int i11;
        if (c1894e.f23505i) {
            int i12 = c1894e.f23504h;
            int i13 = -1;
            O0 o02 = this.f14829w;
            if (i12 == -1) {
                if (c1894e.f23503f < 0 || (y12 = y()) == 0 || (x2 = x(y12 - 1)) == null || (i11 = ((int[]) o02.f924c)[a.O(x2)]) == -1) {
                    return;
                }
                C1891b c1891b = (C1891b) this.f14828v.get(i11);
                int i14 = i10;
                while (true) {
                    if (i14 < 0) {
                        break;
                    }
                    View x10 = x(i14);
                    if (x10 != null) {
                        int i15 = c1894e.f23503f;
                        if (o1() || !this.f14826t) {
                            if (this.f14811B.g(x10) < this.f14811B.h() - i15) {
                                break;
                            }
                            if (c1891b.k != a.O(x10)) {
                                continue;
                            } else if (i11 <= 0) {
                                y12 = i14;
                                break;
                            } else {
                                i11 += c1894e.f23504h;
                                c1891b = (C1891b) this.f14828v.get(i11);
                                y12 = i14;
                            }
                        } else {
                            if (this.f14811B.d(x10) > i15) {
                                break;
                            }
                            if (c1891b.k != a.O(x10)) {
                            }
                        }
                    }
                    i14--;
                }
                while (i10 >= y12) {
                    C0(i10, y10);
                    i10--;
                }
                return;
            }
            if (c1894e.f23503f >= 0 && (y11 = y()) != 0) {
                int i16 = 0;
                View x11 = x(0);
                if (x11 == null || (i7 = ((int[]) o02.f924c)[a.O(x11)]) == -1) {
                    return;
                }
                C1891b c1891b2 = (C1891b) this.f14828v.get(i7);
                while (true) {
                    if (i16 >= y11) {
                        break;
                    }
                    View x12 = x(i16);
                    if (x12 != null) {
                        int i17 = c1894e.f23503f;
                        if (o1() || !this.f14826t) {
                            if (this.f14811B.d(x12) > i17) {
                                break;
                            }
                            if (c1891b2.f23479l != a.O(x12)) {
                                continue;
                            } else if (i7 >= this.f14828v.size() - 1) {
                                i13 = i16;
                                break;
                            } else {
                                i7 += c1894e.f23504h;
                                c1891b2 = (C1891b) this.f14828v.get(i7);
                                i13 = i16;
                            }
                        } else {
                            if (this.f14811B.h() - this.f14811B.g(x12) > i17) {
                                break;
                            }
                            if (c1891b2.f23479l != a.O(x12)) {
                            }
                        }
                    }
                    i16++;
                }
                while (i13 >= 0) {
                    C0(i13, y10);
                    i13--;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final int q(e0 e0Var) {
        return Y0(e0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final void q0(e0 e0Var) {
        this.f14813D = null;
        this.f14814E = -1;
        this.f14815F = Integer.MIN_VALUE;
        this.L = -1;
        C1892c.b(this.f14810A);
        this.f14818I.clear();
    }

    public final void q1(int i7) {
        if (this.f14822p != i7) {
            y0();
            this.f14822p = i7;
            this.f14811B = null;
            this.f14812C = null;
            this.f14828v.clear();
            C1892c c1892c = this.f14810A;
            C1892c.b(c1892c);
            c1892c.f23485d = 0;
            F0();
        }
    }

    public final boolean r1(View view, int i7, int i10, C1893d c1893d) {
        return (!view.isLayoutRequested() && this.f13713h && U(view.getWidth(), i7, ((ViewGroup.MarginLayoutParams) c1893d).width) && U(view.getHeight(), i10, ((ViewGroup.MarginLayoutParams) c1893d).height)) ? false : true;
    }

    public final void s1(int i7) {
        View f12 = f1(y() - 1, -1);
        if (i7 >= (f12 != null ? a.O(f12) : -1)) {
            return;
        }
        int y10 = y();
        O0 o02 = this.f14829w;
        o02.m(y10);
        o02.n(y10);
        o02.l(y10);
        if (i7 >= ((int[]) o02.f924c).length) {
            return;
        }
        this.L = i7;
        View x2 = x(0);
        if (x2 == null) {
            return;
        }
        this.f14814E = a.O(x2);
        if (o1() || !this.f14826t) {
            this.f14815F = this.f14811B.g(x2) - this.f14811B.m();
        } else {
            this.f14815F = this.f14811B.j() + this.f14811B.d(x2);
        }
    }

    public final void t1(C1892c c1892c, boolean z8, boolean z10) {
        int i7;
        if (z10) {
            int i10 = o1() ? this.f13716m : this.f13715l;
            this.f14832z.f23499b = i10 == 0 || i10 == Integer.MIN_VALUE;
        } else {
            this.f14832z.f23499b = false;
        }
        if (o1() || !this.f14826t) {
            this.f14832z.f23498a = this.f14811B.i() - c1892c.f23484c;
        } else {
            this.f14832z.f23498a = c1892c.f23484c - M();
        }
        C1894e c1894e = this.f14832z;
        c1894e.f23501d = c1892c.f23482a;
        c1894e.f23504h = 1;
        c1894e.f23502e = c1892c.f23484c;
        c1894e.f23503f = Integer.MIN_VALUE;
        c1894e.f23500c = c1892c.f23483b;
        if (!z8 || this.f14828v.size() <= 1 || (i7 = c1892c.f23483b) < 0 || i7 >= this.f14828v.size() - 1) {
            return;
        }
        C1891b c1891b = (C1891b) this.f14828v.get(c1892c.f23483b);
        C1894e c1894e2 = this.f14832z;
        c1894e2.f23500c++;
        c1894e2.f23501d += c1891b.f23474d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [H2.T, q5.d] */
    @Override // androidx.recyclerview.widget.a
    public final T u() {
        ?? t5 = new T(-2, -2);
        t5.f23490e = 0.0f;
        t5.f23491f = 1.0f;
        t5.f23492u = -1;
        t5.f23493v = -1.0f;
        t5.f23496y = 16777215;
        t5.f23497z = 16777215;
        return t5;
    }

    @Override // androidx.recyclerview.widget.a
    public final void u0(Parcelable parcelable) {
        if (parcelable instanceof C1895f) {
            this.f14813D = (C1895f) parcelable;
            F0();
        }
    }

    public final void u1(C1892c c1892c, boolean z8, boolean z10) {
        if (z10) {
            int i7 = o1() ? this.f13716m : this.f13715l;
            this.f14832z.f23499b = i7 == 0 || i7 == Integer.MIN_VALUE;
        } else {
            this.f14832z.f23499b = false;
        }
        if (o1() || !this.f14826t) {
            this.f14832z.f23498a = c1892c.f23484c - this.f14811B.m();
        } else {
            this.f14832z.f23498a = (this.f14820K.getWidth() - c1892c.f23484c) - this.f14811B.m();
        }
        C1894e c1894e = this.f14832z;
        c1894e.f23501d = c1892c.f23482a;
        c1894e.f23504h = -1;
        c1894e.f23502e = c1892c.f23484c;
        c1894e.f23503f = Integer.MIN_VALUE;
        int i10 = c1892c.f23483b;
        c1894e.f23500c = i10;
        if (!z8 || i10 <= 0) {
            return;
        }
        int size = this.f14828v.size();
        int i11 = c1892c.f23483b;
        if (size > i11) {
            C1891b c1891b = (C1891b) this.f14828v.get(i11);
            C1894e c1894e2 = this.f14832z;
            c1894e2.f23500c--;
            c1894e2.f23501d -= c1891b.f23474d;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [H2.T, q5.d] */
    @Override // androidx.recyclerview.widget.a
    public final T v(Context context, AttributeSet attributeSet) {
        ?? t5 = new T(context, attributeSet);
        t5.f23490e = 0.0f;
        t5.f23491f = 1.0f;
        t5.f23492u = -1;
        t5.f23493v = -1.0f;
        t5.f23496y = 16777215;
        t5.f23497z = 16777215;
        return t5;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, q5.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.os.Parcelable, q5.f, java.lang.Object] */
    @Override // androidx.recyclerview.widget.a
    public final Parcelable v0() {
        C1895f c1895f = this.f14813D;
        if (c1895f != null) {
            ?? obj = new Object();
            obj.f23506a = c1895f.f23506a;
            obj.f23507b = c1895f.f23507b;
            return obj;
        }
        ?? obj2 = new Object();
        if (y() > 0) {
            View x2 = x(0);
            obj2.f23506a = a.O(x2);
            obj2.f23507b = this.f14811B.g(x2) - this.f14811B.m();
        } else {
            obj2.f23506a = -1;
        }
        return obj2;
    }

    public final void v1(View view, int i7) {
        this.f14818I.put(i7, view);
    }
}
