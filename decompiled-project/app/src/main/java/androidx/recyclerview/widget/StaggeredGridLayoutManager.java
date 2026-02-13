package androidx.recyclerview.widget;

import B0.C;
import H2.AbstractC0303q;
import H2.B;
import H2.C0305t;
import H2.C0309x;
import H2.E;
import H2.S;
import H2.T;
import H2.Y;
import H2.d0;
import H2.e0;
import H2.m0;
import H2.n0;
import H2.o0;
import H2.p0;
import H2.q0;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.common.api.f;
import h3.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import q3.c;
import y1.K;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends a implements d0 {

    /* renamed from: B, reason: collision with root package name */
    public final c f13686B;

    /* renamed from: C, reason: collision with root package name */
    public final int f13687C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f13688D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f13689E;

    /* renamed from: F, reason: collision with root package name */
    public p0 f13690F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f13691G;

    /* renamed from: H, reason: collision with root package name */
    public final m0 f13692H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f13693I;

    /* renamed from: J, reason: collision with root package name */
    public int[] f13694J;

    /* renamed from: K, reason: collision with root package name */
    public final C f13695K;

    /* renamed from: p, reason: collision with root package name */
    public final int f13696p;

    /* renamed from: q, reason: collision with root package name */
    public final q0[] f13697q;

    /* renamed from: r, reason: collision with root package name */
    public final E f13698r;

    /* renamed from: s, reason: collision with root package name */
    public final E f13699s;

    /* renamed from: t, reason: collision with root package name */
    public final int f13700t;

    /* renamed from: u, reason: collision with root package name */
    public int f13701u;

    /* renamed from: v, reason: collision with root package name */
    public final C0309x f13702v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f13703w;

    /* renamed from: y, reason: collision with root package name */
    public final BitSet f13705y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f13704x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f13706z = -1;

    /* renamed from: A, reason: collision with root package name */
    public int f13685A = Integer.MIN_VALUE;

    /* JADX WARN: Type inference failed for: r6v3, types: [H2.x, java.lang.Object] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i7, int i10) {
        this.f13696p = -1;
        this.f13703w = false;
        c cVar = new c(8, (char) 0);
        this.f13686B = cVar;
        this.f13687C = 2;
        this.f13691G = new Rect();
        this.f13692H = new m0(this);
        this.f13693I = true;
        this.f13695K = new C(this, 6);
        S P10 = a.P(context, attributeSet, i7, i10);
        int i11 = P10.f4611a;
        if (i11 != 0 && i11 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        d(null);
        if (i11 != this.f13700t) {
            this.f13700t = i11;
            E e2 = this.f13698r;
            this.f13698r = this.f13699s;
            this.f13699s = e2;
            F0();
        }
        int i12 = P10.f4612b;
        d(null);
        if (i12 != this.f13696p) {
            cVar.h();
            F0();
            this.f13696p = i12;
            this.f13705y = new BitSet(this.f13696p);
            this.f13697q = new q0[this.f13696p];
            for (int i13 = 0; i13 < this.f13696p; i13++) {
                this.f13697q[i13] = new q0(this, i13);
            }
            F0();
        }
        boolean z8 = P10.f4613c;
        d(null);
        p0 p0Var = this.f13690F;
        if (p0Var != null && p0Var.f4780v != z8) {
            p0Var.f4780v = z8;
        }
        this.f13703w = z8;
        F0();
        ?? obj = new Object();
        obj.f4847a = true;
        obj.f4852f = 0;
        obj.g = 0;
        this.f13702v = obj;
        this.f13698r = E.b(this, this.f13700t);
        this.f13699s = E.b(this, 1 - this.f13700t);
    }

    public static int z1(int i7, int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return i7;
        }
        int mode = View.MeasureSpec.getMode(i7);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i7) - i10) - i11), mode) : i7;
    }

    @Override // androidx.recyclerview.widget.a
    public final int H0(int i7, Y y10, e0 e0Var) {
        return v1(i7, y10, e0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final void I0(int i7) {
        p0 p0Var = this.f13690F;
        if (p0Var != null && p0Var.f4773a != i7) {
            p0Var.f4776d = null;
            p0Var.f4775c = 0;
            p0Var.f4773a = -1;
            p0Var.f4774b = -1;
        }
        this.f13706z = i7;
        this.f13685A = Integer.MIN_VALUE;
        F0();
    }

    @Override // androidx.recyclerview.widget.a
    public final int J0(int i7, Y y10, e0 e0Var) {
        return v1(i7, y10, e0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final void N0(Rect rect, int i7, int i10) {
        int i11;
        int i12;
        int i13 = this.f13696p;
        int M3 = M() + L();
        int K10 = K() + N();
        if (this.f13700t == 1) {
            int height = rect.height() + K10;
            RecyclerView recyclerView = this.f13708b;
            WeakHashMap weakHashMap = K.f26642a;
            i12 = a.i(i10, height, recyclerView.getMinimumHeight());
            i11 = a.i(i7, (this.f13701u * i13) + M3, this.f13708b.getMinimumWidth());
        } else {
            int width = rect.width() + M3;
            RecyclerView recyclerView2 = this.f13708b;
            WeakHashMap weakHashMap2 = K.f26642a;
            i11 = a.i(i7, width, recyclerView2.getMinimumWidth());
            i12 = a.i(i10, (this.f13701u * i13) + K10, this.f13708b.getMinimumHeight());
        }
        M0(i11, i12);
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean T() {
        return this.f13687C != 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final void T0(RecyclerView recyclerView, int i7) {
        B b2 = new B(recyclerView.getContext());
        b2.f4572a = i7;
        U0(b2);
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean V0() {
        return this.f13690F == null;
    }

    public final int W0(int i7) {
        if (y() == 0) {
            return this.f13704x ? 1 : -1;
        }
        return (i7 < g1()) != this.f13704x ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.a
    public final void X(int i7) {
        super.X(i7);
        for (int i10 = 0; i10 < this.f13696p; i10++) {
            q0 q0Var = this.f13697q[i10];
            int i11 = q0Var.f4785b;
            if (i11 != Integer.MIN_VALUE) {
                q0Var.f4785b = i11 + i7;
            }
            int i12 = q0Var.f4786c;
            if (i12 != Integer.MIN_VALUE) {
                q0Var.f4786c = i12 + i7;
            }
        }
    }

    public final boolean X0() {
        int g12;
        if (y() != 0 && this.f13687C != 0 && this.g) {
            if (this.f13704x) {
                g12 = h1();
                g1();
            } else {
                g12 = g1();
                h1();
            }
            c cVar = this.f13686B;
            if (g12 == 0 && l1() != null) {
                cVar.h();
                this.f13712f = true;
                F0();
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.a
    public final void Y(int i7) {
        super.Y(i7);
        for (int i10 = 0; i10 < this.f13696p; i10++) {
            q0 q0Var = this.f13697q[i10];
            int i11 = q0Var.f4785b;
            if (i11 != Integer.MIN_VALUE) {
                q0Var.f4785b = i11 + i7;
            }
            int i12 = q0Var.f4786c;
            if (i12 != Integer.MIN_VALUE) {
                q0Var.f4786c = i12 + i7;
            }
        }
    }

    public final int Y0(e0 e0Var) {
        if (y() == 0) {
            return 0;
        }
        E e2 = this.f13698r;
        boolean z8 = !this.f13693I;
        return AbstractC0303q.d(e0Var, e2, d1(z8), c1(z8), this, this.f13693I);
    }

    @Override // androidx.recyclerview.widget.a
    public final void Z(H2.K k, H2.K k7) {
        this.f13686B.h();
        for (int i7 = 0; i7 < this.f13696p; i7++) {
            this.f13697q[i7].b();
        }
    }

    public final int Z0(e0 e0Var) {
        if (y() == 0) {
            return 0;
        }
        E e2 = this.f13698r;
        boolean z8 = !this.f13693I;
        return AbstractC0303q.e(e0Var, e2, d1(z8), c1(z8), this, this.f13693I, this.f13704x);
    }

    @Override // H2.d0
    public final PointF a(int i7) {
        int W02 = W0(i7);
        PointF pointF = new PointF();
        if (W02 == 0) {
            return null;
        }
        if (this.f13700t == 0) {
            pointF.x = W02;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = W02;
        }
        return pointF;
    }

    public final int a1(e0 e0Var) {
        if (y() == 0) {
            return 0;
        }
        E e2 = this.f13698r;
        boolean z8 = !this.f13693I;
        return AbstractC0303q.f(e0Var, e2, d1(z8), c1(z8), this, this.f13693I);
    }

    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [int, boolean] */
    public final int b1(Y y10, C0309x c0309x, e0 e0Var) {
        q0 q0Var;
        ?? r52;
        int i7;
        int h10;
        int e2;
        int m10;
        int e10;
        int i10;
        int i11;
        int i12;
        Y y11 = y10;
        int i13 = 0;
        int i14 = 1;
        this.f13705y.set(0, this.f13696p, true);
        C0309x c0309x2 = this.f13702v;
        int i15 = c0309x2.f4854i ? c0309x.f4851e == 1 ? f.API_PRIORITY_OTHER : Integer.MIN_VALUE : c0309x.f4851e == 1 ? c0309x.g + c0309x.f4848b : c0309x.f4852f - c0309x.f4848b;
        int i16 = c0309x.f4851e;
        for (int i17 = 0; i17 < this.f13696p; i17++) {
            if (!this.f13697q[i17].f4784a.isEmpty()) {
                y1(this.f13697q[i17], i16, i15);
            }
        }
        int i18 = this.f13704x ? this.f13698r.i() : this.f13698r.m();
        boolean z8 = false;
        while (true) {
            int i19 = c0309x.f4849c;
            int i20 = -1;
            if (((i19 < 0 || i19 >= e0Var.b()) ? i13 : i14) == 0 || (!c0309x2.f4854i && this.f13705y.isEmpty())) {
                break;
            }
            View d10 = y11.d(c0309x.f4849c);
            c0309x.f4849c += c0309x.f4850d;
            n0 n0Var = (n0) d10.getLayoutParams();
            int d11 = n0Var.f4615a.d();
            c cVar = this.f13686B;
            int[] iArr = (int[]) cVar.f23371b;
            int i21 = (iArr == null || d11 >= iArr.length) ? -1 : iArr[d11];
            if (i21 == -1) {
                if (p1(c0309x.f4851e)) {
                    i11 = this.f13696p - i14;
                    i12 = -1;
                } else {
                    i20 = this.f13696p;
                    i11 = i13;
                    i12 = i14;
                }
                q0 q0Var2 = null;
                if (c0309x.f4851e == i14) {
                    int m11 = this.f13698r.m();
                    int i22 = f.API_PRIORITY_OTHER;
                    while (i11 != i20) {
                        q0 q0Var3 = this.f13697q[i11];
                        int f4 = q0Var3.f(m11);
                        if (f4 < i22) {
                            i22 = f4;
                            q0Var2 = q0Var3;
                        }
                        i11 += i12;
                    }
                } else {
                    int i23 = this.f13698r.i();
                    int i24 = Integer.MIN_VALUE;
                    while (i11 != i20) {
                        q0 q0Var4 = this.f13697q[i11];
                        int h11 = q0Var4.h(i23);
                        if (h11 > i24) {
                            q0Var2 = q0Var4;
                            i24 = h11;
                        }
                        i11 += i12;
                    }
                }
                q0Var = q0Var2;
                cVar.l(d11);
                ((int[]) cVar.f23371b)[d11] = q0Var.f4788e;
            } else {
                q0Var = this.f13697q[i21];
            }
            n0Var.f4759e = q0Var;
            if (c0309x.f4851e == 1) {
                b(d10);
                r52 = 0;
            } else {
                r52 = 0;
                c(d10, 0, false);
            }
            if (this.f13700t == 1) {
                i7 = 1;
                n1(d10, a.z(r52, this.f13701u, this.f13715l, r52, ((ViewGroup.MarginLayoutParams) n0Var).width), a.z(true, this.f13718o, this.f13716m, K() + N(), ((ViewGroup.MarginLayoutParams) n0Var).height));
            } else {
                i7 = 1;
                n1(d10, a.z(true, this.f13717n, this.f13715l, M() + L(), ((ViewGroup.MarginLayoutParams) n0Var).width), a.z(false, this.f13701u, this.f13716m, 0, ((ViewGroup.MarginLayoutParams) n0Var).height));
            }
            if (c0309x.f4851e == i7) {
                e2 = q0Var.f(i18);
                h10 = this.f13698r.e(d10) + e2;
            } else {
                h10 = q0Var.h(i18);
                e2 = h10 - this.f13698r.e(d10);
            }
            if (c0309x.f4851e == 1) {
                q0 q0Var5 = n0Var.f4759e;
                q0Var5.getClass();
                n0 n0Var2 = (n0) d10.getLayoutParams();
                n0Var2.f4759e = q0Var5;
                ArrayList arrayList = q0Var5.f4784a;
                arrayList.add(d10);
                q0Var5.f4786c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    q0Var5.f4785b = Integer.MIN_VALUE;
                }
                if (n0Var2.f4615a.k() || n0Var2.f4615a.n()) {
                    q0Var5.f4787d = q0Var5.f4789f.f13698r.e(d10) + q0Var5.f4787d;
                }
            } else {
                q0 q0Var6 = n0Var.f4759e;
                q0Var6.getClass();
                n0 n0Var3 = (n0) d10.getLayoutParams();
                n0Var3.f4759e = q0Var6;
                ArrayList arrayList2 = q0Var6.f4784a;
                arrayList2.add(0, d10);
                q0Var6.f4785b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    q0Var6.f4786c = Integer.MIN_VALUE;
                }
                if (n0Var3.f4615a.k() || n0Var3.f4615a.n()) {
                    q0Var6.f4787d = q0Var6.f4789f.f13698r.e(d10) + q0Var6.f4787d;
                }
            }
            if (m1() && this.f13700t == 1) {
                e10 = this.f13699s.i() - (((this.f13696p - 1) - q0Var.f4788e) * this.f13701u);
                m10 = e10 - this.f13699s.e(d10);
            } else {
                m10 = this.f13699s.m() + (q0Var.f4788e * this.f13701u);
                e10 = this.f13699s.e(d10) + m10;
            }
            if (this.f13700t == 1) {
                a.W(d10, m10, e2, e10, h10);
            } else {
                a.W(d10, e2, m10, h10, e10);
            }
            y1(q0Var, c0309x2.f4851e, i15);
            r1(y10, c0309x2);
            if (c0309x2.f4853h && d10.hasFocusable()) {
                i10 = 0;
                this.f13705y.set(q0Var.f4788e, false);
            } else {
                i10 = 0;
            }
            y11 = y10;
            i13 = i10;
            i14 = 1;
            z8 = true;
        }
        int i25 = i13;
        Y y12 = y11;
        if (!z8) {
            r1(y12, c0309x2);
        }
        int m12 = c0309x2.f4851e == -1 ? this.f13698r.m() - j1(this.f13698r.m()) : i1(this.f13698r.i()) - this.f13698r.i();
        return m12 > 0 ? Math.min(c0309x.f4848b, m12) : i25;
    }

    @Override // androidx.recyclerview.widget.a
    public final void c0(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f13708b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f13695K);
        }
        for (int i7 = 0; i7 < this.f13696p; i7++) {
            this.f13697q[i7].b();
        }
        recyclerView.requestLayout();
    }

    public final View c1(boolean z8) {
        int m10 = this.f13698r.m();
        int i7 = this.f13698r.i();
        View view = null;
        for (int y10 = y() - 1; y10 >= 0; y10--) {
            View x2 = x(y10);
            int g = this.f13698r.g(x2);
            int d10 = this.f13698r.d(x2);
            if (d10 > m10 && g < i7) {
                if (d10 <= i7 || !z8) {
                    return x2;
                }
                if (view == null) {
                    view = x2;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.a
    public final void d(String str) {
        if (this.f13690F == null) {
            super.d(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0039, code lost:
    
        if (r8.f13700t == 1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x003e, code lost:
    
        if (r8.f13700t == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x004b, code lost:
    
        if (m1() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0058, code lost:
    
        if (m1() == false) goto L38;
     */
    @Override // androidx.recyclerview.widget.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View d0(View view, int i7, Y y10, e0 e0Var) {
        View s3;
        int i10;
        if (y() == 0 || (s3 = s(view)) == null) {
            return null;
        }
        u1();
        if (i7 == 1) {
            if (this.f13700t != 1) {
            }
            i10 = -1;
        } else if (i7 == 2) {
            if (this.f13700t != 1) {
            }
            i10 = 1;
        } else if (i7 != 17) {
            if (i7 != 33) {
                if (i7 == 66) {
                }
            }
            i10 = Integer.MIN_VALUE;
        }
        if (i10 == Integer.MIN_VALUE) {
            return null;
        }
        n0 n0Var = (n0) s3.getLayoutParams();
        n0Var.getClass();
        q0 q0Var = n0Var.f4759e;
        int h12 = i10 == 1 ? h1() : g1();
        x1(h12, e0Var);
        w1(i10);
        C0309x c0309x = this.f13702v;
        c0309x.f4849c = c0309x.f4850d + h12;
        c0309x.f4848b = (int) (this.f13698r.n() * 0.33333334f);
        c0309x.f4853h = true;
        c0309x.f4847a = false;
        b1(y10, c0309x, e0Var);
        this.f13688D = this.f13704x;
        View g = q0Var.g(h12, i10);
        if (g != null && g != s3) {
            return g;
        }
        if (p1(i10)) {
            for (int i11 = this.f13696p - 1; i11 >= 0; i11--) {
                View g2 = this.f13697q[i11].g(h12, i10);
                if (g2 != null && g2 != s3) {
                    return g2;
                }
            }
        } else {
            for (int i12 = 0; i12 < this.f13696p; i12++) {
                View g10 = this.f13697q[i12].g(h12, i10);
                if (g10 != null && g10 != s3) {
                    return g10;
                }
            }
        }
        boolean z8 = (this.f13703w ^ true) == (i10 == -1);
        View t5 = t(z8 ? q0Var.c() : q0Var.d());
        if (t5 != null && t5 != s3) {
            return t5;
        }
        if (p1(i10)) {
            for (int i13 = this.f13696p - 1; i13 >= 0; i13--) {
                if (i13 != q0Var.f4788e) {
                    View t10 = t(z8 ? this.f13697q[i13].c() : this.f13697q[i13].d());
                    if (t10 != null && t10 != s3) {
                        return t10;
                    }
                }
            }
        } else {
            for (int i14 = 0; i14 < this.f13696p; i14++) {
                View t11 = t(z8 ? this.f13697q[i14].c() : this.f13697q[i14].d());
                if (t11 != null && t11 != s3) {
                    return t11;
                }
            }
        }
        return null;
    }

    public final View d1(boolean z8) {
        int m10 = this.f13698r.m();
        int i7 = this.f13698r.i();
        int y10 = y();
        View view = null;
        for (int i10 = 0; i10 < y10; i10++) {
            View x2 = x(i10);
            int g = this.f13698r.g(x2);
            if (this.f13698r.d(x2) > m10 && g < i7) {
                if (g >= m10 || !z8) {
                    return x2;
                }
                if (view == null) {
                    view = x2;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.a
    public final void e0(AccessibilityEvent accessibilityEvent) {
        super.e0(accessibilityEvent);
        if (y() > 0) {
            View d12 = d1(false);
            View c12 = c1(false);
            if (d12 == null || c12 == null) {
                return;
            }
            int O10 = a.O(d12);
            int O11 = a.O(c12);
            if (O10 < O11) {
                accessibilityEvent.setFromIndex(O10);
                accessibilityEvent.setToIndex(O11);
            } else {
                accessibilityEvent.setFromIndex(O11);
                accessibilityEvent.setToIndex(O10);
            }
        }
    }

    public final void e1(Y y10, e0 e0Var, boolean z8) {
        int i7;
        int i12 = i1(Integer.MIN_VALUE);
        if (i12 != Integer.MIN_VALUE && (i7 = this.f13698r.i() - i12) > 0) {
            int i10 = i7 - (-v1(-i7, y10, e0Var));
            if (!z8 || i10 <= 0) {
                return;
            }
            this.f13698r.r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean f() {
        return this.f13700t == 0;
    }

    public final void f1(Y y10, e0 e0Var, boolean z8) {
        int m10;
        int j12 = j1(f.API_PRIORITY_OTHER);
        if (j12 != Integer.MAX_VALUE && (m10 = j12 - this.f13698r.m()) > 0) {
            int v12 = m10 - v1(m10, y10, e0Var);
            if (!z8 || v12 <= 0) {
                return;
            }
            this.f13698r.r(-v12);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean g() {
        return this.f13700t == 1;
    }

    public final int g1() {
        if (y() == 0) {
            return 0;
        }
        return a.O(x(0));
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean h(T t5) {
        return t5 instanceof n0;
    }

    public final int h1() {
        int y10 = y();
        if (y10 == 0) {
            return 0;
        }
        return a.O(x(y10 - 1));
    }

    public final int i1(int i7) {
        int f4 = this.f13697q[0].f(i7);
        for (int i10 = 1; i10 < this.f13696p; i10++) {
            int f10 = this.f13697q[i10].f(i7);
            if (f10 > f4) {
                f4 = f10;
            }
        }
        return f4;
    }

    @Override // androidx.recyclerview.widget.a
    public final void j(int i7, int i10, e0 e0Var, C0305t c0305t) {
        C0309x c0309x;
        int f4;
        int i11;
        if (this.f13700t != 0) {
            i7 = i10;
        }
        if (y() == 0 || i7 == 0) {
            return;
        }
        q1(i7, e0Var);
        int[] iArr = this.f13694J;
        if (iArr == null || iArr.length < this.f13696p) {
            this.f13694J = new int[this.f13696p];
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.f13696p;
            c0309x = this.f13702v;
            if (i12 >= i14) {
                break;
            }
            if (c0309x.f4850d == -1) {
                f4 = c0309x.f4852f;
                i11 = this.f13697q[i12].h(f4);
            } else {
                f4 = this.f13697q[i12].f(c0309x.g);
                i11 = c0309x.g;
            }
            int i15 = f4 - i11;
            if (i15 >= 0) {
                this.f13694J[i13] = i15;
                i13++;
            }
            i12++;
        }
        Arrays.sort(this.f13694J, 0, i13);
        for (int i16 = 0; i16 < i13; i16++) {
            int i17 = c0309x.f4849c;
            if (i17 < 0 || i17 >= e0Var.b()) {
                return;
            }
            c0305t.a(c0309x.f4849c, this.f13694J[i16]);
            c0309x.f4849c += c0309x.f4850d;
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void j0(int i7, int i10) {
        k1(i7, i10, 1);
    }

    public final int j1(int i7) {
        int h10 = this.f13697q[0].h(i7);
        for (int i10 = 1; i10 < this.f13696p; i10++) {
            int h11 = this.f13697q[i10].h(i7);
            if (h11 < h10) {
                h10 = h11;
            }
        }
        return h10;
    }

    @Override // androidx.recyclerview.widget.a
    public final void k0() {
        this.f13686B.h();
        F0();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k1(int i7, int i10, int i11) {
        int i12;
        int i13;
        c cVar;
        int[] iArr;
        ArrayList arrayList;
        int i14;
        int h12 = this.f13704x ? h1() : g1();
        if (i11 != 8) {
            i12 = i7 + i10;
        } else {
            if (i7 >= i10) {
                i12 = i7 + 1;
                i13 = i10;
                cVar = this.f13686B;
                iArr = (int[]) cVar.f23371b;
                if (iArr != null && i13 < iArr.length) {
                    arrayList = (ArrayList) cVar.f23372c;
                    if (arrayList != null) {
                        o0 o0Var = null;
                        if (arrayList != null) {
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size < 0) {
                                    break;
                                }
                                o0 o0Var2 = (o0) ((ArrayList) cVar.f23372c).get(size);
                                if (o0Var2.f4764a == i13) {
                                    o0Var = o0Var2;
                                    break;
                                }
                                size--;
                            }
                        }
                        if (o0Var != null) {
                            ((ArrayList) cVar.f23372c).remove(o0Var);
                        }
                        int size2 = ((ArrayList) cVar.f23372c).size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size2) {
                                i15 = -1;
                                break;
                            } else if (((o0) ((ArrayList) cVar.f23372c).get(i15)).f4764a >= i13) {
                                break;
                            } else {
                                i15++;
                            }
                        }
                        if (i15 != -1) {
                            o0 o0Var3 = (o0) ((ArrayList) cVar.f23372c).get(i15);
                            ((ArrayList) cVar.f23372c).remove(i15);
                            i14 = o0Var3.f4764a;
                            if (i14 == -1) {
                                int[] iArr2 = (int[]) cVar.f23371b;
                                Arrays.fill(iArr2, i13, iArr2.length, -1);
                                int length = ((int[]) cVar.f23371b).length;
                            } else {
                                Arrays.fill((int[]) cVar.f23371b, i13, Math.min(i14 + 1, ((int[]) cVar.f23371b).length), -1);
                            }
                        }
                    }
                    i14 = -1;
                    if (i14 == -1) {
                    }
                }
                if (i11 != 1) {
                    cVar.r(i7, i10);
                } else if (i11 == 2) {
                    cVar.s(i7, i10);
                } else if (i11 == 8) {
                    cVar.s(i7, 1);
                    cVar.r(i10, 1);
                }
                if (i12 > h12) {
                    return;
                }
                if (i13 <= (this.f13704x ? g1() : h1())) {
                    F0();
                    return;
                }
                return;
            }
            i12 = i10 + 1;
        }
        i13 = i7;
        cVar = this.f13686B;
        iArr = (int[]) cVar.f23371b;
        if (iArr != null) {
            arrayList = (ArrayList) cVar.f23372c;
            if (arrayList != null) {
            }
            i14 = -1;
            if (i14 == -1) {
            }
        }
        if (i11 != 1) {
        }
        if (i12 > h12) {
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final int l(e0 e0Var) {
        return Y0(e0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final void l0(int i7, int i10) {
        k1(i7, i10, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View l1() {
        int y10 = y();
        int i7 = y10 - 1;
        BitSet bitSet = new BitSet(this.f13696p);
        bitSet.set(0, this.f13696p, true);
        char c10 = (this.f13700t == 1 && m1()) ? (char) 1 : (char) 65535;
        if (this.f13704x) {
            y10 = -1;
        } else {
            i7 = 0;
        }
        int i10 = i7 < y10 ? 1 : -1;
        while (i7 != y10) {
            View x2 = x(i7);
            n0 n0Var = (n0) x2.getLayoutParams();
            if (bitSet.get(n0Var.f4759e.f4788e)) {
                q0 q0Var = n0Var.f4759e;
                if (this.f13704x) {
                    int i11 = q0Var.f4786c;
                    if (i11 == Integer.MIN_VALUE) {
                        q0Var.a();
                        i11 = q0Var.f4786c;
                    }
                    if (i11 < this.f13698r.i()) {
                        ((n0) ((View) o.k(1, q0Var.f4784a)).getLayoutParams()).getClass();
                        return x2;
                    }
                    bitSet.clear(n0Var.f4759e.f4788e);
                } else {
                    int i12 = q0Var.f4785b;
                    if (i12 == Integer.MIN_VALUE) {
                        View view = (View) q0Var.f4784a.get(0);
                        n0 n0Var2 = (n0) view.getLayoutParams();
                        q0Var.f4785b = q0Var.f4789f.f13698r.g(view);
                        n0Var2.getClass();
                        i12 = q0Var.f4785b;
                    }
                    if (i12 > this.f13698r.m()) {
                        ((n0) ((View) q0Var.f4784a.get(0)).getLayoutParams()).getClass();
                        return x2;
                    }
                    bitSet.clear(n0Var.f4759e.f4788e);
                }
            }
            i7 += i10;
            if (i7 != y10) {
                View x10 = x(i7);
                if (this.f13704x) {
                    int d10 = this.f13698r.d(x2);
                    int d11 = this.f13698r.d(x10);
                    if (d10 < d11) {
                        return x2;
                    }
                    if (d10 == d11) {
                        if ((n0Var.f4759e.f4788e - ((n0) x10.getLayoutParams()).f4759e.f4788e >= 0) == (c10 >= 0)) {
                            return x2;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int g = this.f13698r.g(x2);
                    int g2 = this.f13698r.g(x10);
                    if (g > g2) {
                        return x2;
                    }
                    if (g == g2) {
                        if ((n0Var.f4759e.f4788e - ((n0) x10.getLayoutParams()).f4759e.f4788e >= 0) == (c10 >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.a
    public final int m(e0 e0Var) {
        return Z0(e0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final void m0(int i7, int i10) {
        k1(i7, i10, 2);
    }

    public final boolean m1() {
        return J() == 1;
    }

    @Override // androidx.recyclerview.widget.a
    public final int n(e0 e0Var) {
        return a1(e0Var);
    }

    public final void n1(View view, int i7, int i10) {
        Rect rect = this.f13691G;
        e(rect, view);
        n0 n0Var = (n0) view.getLayoutParams();
        int z12 = z1(i7, ((ViewGroup.MarginLayoutParams) n0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) n0Var).rightMargin + rect.right);
        int z13 = z1(i10, ((ViewGroup.MarginLayoutParams) n0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) n0Var).bottomMargin + rect.bottom);
        if (Q0(view, z12, z13, n0Var)) {
            view.measure(z12, z13);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final int o(e0 e0Var) {
        return Y0(e0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final void o0(RecyclerView recyclerView, int i7, int i10) {
        k1(i7, i10, 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:254:0x0402, code lost:
    
        if (X0() != false) goto L247;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o1(Y y10, e0 e0Var, boolean z8) {
        p0 p0Var;
        int i7;
        int i10;
        p0 p0Var2 = this.f13690F;
        m0 m0Var = this.f13692H;
        if (!(p0Var2 == null && this.f13706z == -1) && e0Var.b() == 0) {
            z0(y10);
            m0Var.a();
            return;
        }
        boolean z10 = true;
        boolean z11 = (m0Var.f4754e && this.f13706z == -1 && this.f13690F == null) ? false : true;
        c cVar = this.f13686B;
        StaggeredGridLayoutManager staggeredGridLayoutManager = m0Var.g;
        if (z11) {
            m0Var.a();
            p0 p0Var3 = this.f13690F;
            if (p0Var3 != null) {
                int i11 = p0Var3.f4775c;
                if (i11 > 0) {
                    if (i11 == this.f13696p) {
                        for (int i12 = 0; i12 < this.f13696p; i12++) {
                            this.f13697q[i12].b();
                            p0 p0Var4 = this.f13690F;
                            int i13 = p0Var4.f4776d[i12];
                            if (i13 != Integer.MIN_VALUE) {
                                i13 += p0Var4.f4781w ? this.f13698r.i() : this.f13698r.m();
                            }
                            q0 q0Var = this.f13697q[i12];
                            q0Var.f4785b = i13;
                            q0Var.f4786c = i13;
                        }
                    } else {
                        p0Var3.f4776d = null;
                        p0Var3.f4775c = 0;
                        p0Var3.f4777e = 0;
                        p0Var3.f4778f = null;
                        p0Var3.f4779u = null;
                        p0Var3.f4773a = p0Var3.f4774b;
                    }
                }
                p0 p0Var5 = this.f13690F;
                this.f13689E = p0Var5.f4782x;
                boolean z12 = p0Var5.f4780v;
                d(null);
                p0 p0Var6 = this.f13690F;
                if (p0Var6 != null && p0Var6.f4780v != z12) {
                    p0Var6.f4780v = z12;
                }
                this.f13703w = z12;
                F0();
                u1();
                p0 p0Var7 = this.f13690F;
                int i14 = p0Var7.f4773a;
                if (i14 != -1) {
                    this.f13706z = i14;
                    m0Var.f4752c = p0Var7.f4781w;
                } else {
                    m0Var.f4752c = this.f13704x;
                }
                if (p0Var7.f4777e > 1) {
                    cVar.f23371b = p0Var7.f4778f;
                    cVar.f23372c = p0Var7.f4779u;
                }
            } else {
                u1();
                m0Var.f4752c = this.f13704x;
            }
            if (!e0Var.g && (i10 = this.f13706z) != -1) {
                if (i10 < 0 || i10 >= e0Var.b()) {
                    this.f13706z = -1;
                    this.f13685A = Integer.MIN_VALUE;
                } else {
                    p0 p0Var8 = this.f13690F;
                    if (p0Var8 == null || p0Var8.f4773a == -1 || p0Var8.f4775c < 1) {
                        View t5 = t(this.f13706z);
                        if (t5 != null) {
                            m0Var.f4750a = this.f13704x ? h1() : g1();
                            if (this.f13685A != Integer.MIN_VALUE) {
                                if (m0Var.f4752c) {
                                    m0Var.f4751b = (this.f13698r.i() - this.f13685A) - this.f13698r.d(t5);
                                } else {
                                    m0Var.f4751b = (this.f13698r.m() + this.f13685A) - this.f13698r.g(t5);
                                }
                            } else if (this.f13698r.e(t5) > this.f13698r.n()) {
                                m0Var.f4751b = m0Var.f4752c ? this.f13698r.i() : this.f13698r.m();
                            } else {
                                int g = this.f13698r.g(t5) - this.f13698r.m();
                                if (g < 0) {
                                    m0Var.f4751b = -g;
                                } else {
                                    int i15 = this.f13698r.i() - this.f13698r.d(t5);
                                    if (i15 < 0) {
                                        m0Var.f4751b = i15;
                                    } else {
                                        m0Var.f4751b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i16 = this.f13706z;
                            m0Var.f4750a = i16;
                            int i17 = this.f13685A;
                            if (i17 == Integer.MIN_VALUE) {
                                boolean z13 = W0(i16) == 1;
                                m0Var.f4752c = z13;
                                m0Var.f4751b = z13 ? staggeredGridLayoutManager.f13698r.i() : staggeredGridLayoutManager.f13698r.m();
                            } else if (m0Var.f4752c) {
                                m0Var.f4751b = staggeredGridLayoutManager.f13698r.i() - i17;
                            } else {
                                m0Var.f4751b = staggeredGridLayoutManager.f13698r.m() + i17;
                            }
                            m0Var.f4753d = true;
                        }
                    } else {
                        m0Var.f4751b = Integer.MIN_VALUE;
                        m0Var.f4750a = this.f13706z;
                    }
                    m0Var.f4754e = true;
                }
            }
            if (this.f13688D) {
                int b2 = e0Var.b();
                for (int y11 = y() - 1; y11 >= 0; y11--) {
                    i7 = a.O(x(y11));
                    if (i7 >= 0 && i7 < b2) {
                        break;
                    }
                }
                i7 = 0;
                m0Var.f4750a = i7;
                m0Var.f4751b = Integer.MIN_VALUE;
                m0Var.f4754e = true;
            } else {
                int b10 = e0Var.b();
                int y12 = y();
                for (int i18 = 0; i18 < y12; i18++) {
                    int O10 = a.O(x(i18));
                    if (O10 >= 0 && O10 < b10) {
                        i7 = O10;
                        break;
                    }
                }
                i7 = 0;
                m0Var.f4750a = i7;
                m0Var.f4751b = Integer.MIN_VALUE;
                m0Var.f4754e = true;
            }
        }
        if (this.f13690F == null && this.f13706z == -1 && (m0Var.f4752c != this.f13688D || m1() != this.f13689E)) {
            cVar.h();
            m0Var.f4753d = true;
        }
        if (y() > 0 && ((p0Var = this.f13690F) == null || p0Var.f4775c < 1)) {
            if (m0Var.f4753d) {
                for (int i19 = 0; i19 < this.f13696p; i19++) {
                    this.f13697q[i19].b();
                    int i20 = m0Var.f4751b;
                    if (i20 != Integer.MIN_VALUE) {
                        q0 q0Var2 = this.f13697q[i19];
                        q0Var2.f4785b = i20;
                        q0Var2.f4786c = i20;
                    }
                }
            } else if (z11 || m0Var.f4755f == null) {
                for (int i21 = 0; i21 < this.f13696p; i21++) {
                    q0 q0Var3 = this.f13697q[i21];
                    boolean z14 = this.f13704x;
                    int i22 = m0Var.f4751b;
                    int f4 = z14 ? q0Var3.f(Integer.MIN_VALUE) : q0Var3.h(Integer.MIN_VALUE);
                    q0Var3.b();
                    if (f4 != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = q0Var3.f4789f;
                        if ((!z14 || f4 >= staggeredGridLayoutManager2.f13698r.i()) && (z14 || f4 <= staggeredGridLayoutManager2.f13698r.m())) {
                            if (i22 != Integer.MIN_VALUE) {
                                f4 += i22;
                            }
                            q0Var3.f4786c = f4;
                            q0Var3.f4785b = f4;
                        }
                    }
                }
                q0[] q0VarArr = this.f13697q;
                int length = q0VarArr.length;
                int[] iArr = m0Var.f4755f;
                if (iArr == null || iArr.length < length) {
                    m0Var.f4755f = new int[staggeredGridLayoutManager.f13697q.length];
                }
                for (int i23 = 0; i23 < length; i23++) {
                    m0Var.f4755f[i23] = q0VarArr[i23].h(Integer.MIN_VALUE);
                }
            } else {
                for (int i24 = 0; i24 < this.f13696p; i24++) {
                    q0 q0Var4 = this.f13697q[i24];
                    q0Var4.b();
                    int i25 = m0Var.f4755f[i24];
                    q0Var4.f4785b = i25;
                    q0Var4.f4786c = i25;
                }
            }
        }
        r(y10);
        C0309x c0309x = this.f13702v;
        c0309x.f4847a = false;
        int n6 = this.f13699s.n();
        this.f13701u = n6 / this.f13696p;
        View.MeasureSpec.makeMeasureSpec(n6, this.f13699s.k());
        x1(m0Var.f4750a, e0Var);
        if (m0Var.f4752c) {
            w1(-1);
            b1(y10, c0309x, e0Var);
            w1(1);
            c0309x.f4849c = m0Var.f4750a + c0309x.f4850d;
            b1(y10, c0309x, e0Var);
        } else {
            w1(1);
            b1(y10, c0309x, e0Var);
            w1(-1);
            c0309x.f4849c = m0Var.f4750a + c0309x.f4850d;
            b1(y10, c0309x, e0Var);
        }
        if (this.f13699s.k() != 1073741824) {
            int y13 = y();
            float f10 = 0.0f;
            for (int i26 = 0; i26 < y13; i26++) {
                View x2 = x(i26);
                float e2 = this.f13699s.e(x2);
                if (e2 >= f10) {
                    ((n0) x2.getLayoutParams()).getClass();
                    f10 = Math.max(f10, e2);
                }
            }
            int i27 = this.f13701u;
            int round = Math.round(f10 * this.f13696p);
            if (this.f13699s.k() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f13699s.n());
            }
            this.f13701u = round / this.f13696p;
            View.MeasureSpec.makeMeasureSpec(round, this.f13699s.k());
            if (this.f13701u != i27) {
                for (int i28 = 0; i28 < y13; i28++) {
                    View x10 = x(i28);
                    n0 n0Var = (n0) x10.getLayoutParams();
                    n0Var.getClass();
                    if (m1() && this.f13700t == 1) {
                        int i29 = -((this.f13696p - 1) - n0Var.f4759e.f4788e);
                        x10.offsetLeftAndRight((this.f13701u * i29) - (i29 * i27));
                    } else {
                        int i30 = n0Var.f4759e.f4788e;
                        int i31 = this.f13701u * i30;
                        int i32 = i30 * i27;
                        if (this.f13700t == 1) {
                            x10.offsetLeftAndRight(i31 - i32);
                        } else {
                            x10.offsetTopAndBottom(i31 - i32);
                        }
                    }
                }
            }
        }
        if (y() > 0) {
            if (this.f13704x) {
                e1(y10, e0Var, true);
                f1(y10, e0Var, false);
            } else {
                f1(y10, e0Var, true);
                e1(y10, e0Var, false);
            }
        }
        if (z8 && !e0Var.g && this.f13687C != 0 && y() > 0 && l1() != null) {
            RecyclerView recyclerView = this.f13708b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f13695K);
            }
        }
        z10 = false;
        if (e0Var.g) {
            m0Var.a();
        }
        this.f13688D = m0Var.f4752c;
        this.f13689E = m1();
        if (z10) {
            m0Var.a();
            o1(y10, e0Var, false);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final int p(e0 e0Var) {
        return Z0(e0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final void p0(Y y10, e0 e0Var) {
        o1(y10, e0Var, true);
    }

    public final boolean p1(int i7) {
        if (this.f13700t == 0) {
            return (i7 == -1) != this.f13704x;
        }
        return ((i7 == -1) == this.f13704x) == m1();
    }

    @Override // androidx.recyclerview.widget.a
    public final int q(e0 e0Var) {
        return a1(e0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final void q0(e0 e0Var) {
        this.f13706z = -1;
        this.f13685A = Integer.MIN_VALUE;
        this.f13690F = null;
        this.f13692H.a();
    }

    public final void q1(int i7, e0 e0Var) {
        int g12;
        int i10;
        if (i7 > 0) {
            g12 = h1();
            i10 = 1;
        } else {
            g12 = g1();
            i10 = -1;
        }
        C0309x c0309x = this.f13702v;
        c0309x.f4847a = true;
        x1(g12, e0Var);
        w1(i10);
        c0309x.f4849c = g12 + c0309x.f4850d;
        c0309x.f4848b = Math.abs(i7);
    }

    public final void r1(Y y10, C0309x c0309x) {
        if (!c0309x.f4847a || c0309x.f4854i) {
            return;
        }
        if (c0309x.f4848b == 0) {
            if (c0309x.f4851e == -1) {
                s1(c0309x.g, y10);
                return;
            } else {
                t1(c0309x.f4852f, y10);
                return;
            }
        }
        int i7 = 1;
        if (c0309x.f4851e == -1) {
            int i10 = c0309x.f4852f;
            int h10 = this.f13697q[0].h(i10);
            while (i7 < this.f13696p) {
                int h11 = this.f13697q[i7].h(i10);
                if (h11 > h10) {
                    h10 = h11;
                }
                i7++;
            }
            int i11 = i10 - h10;
            s1(i11 < 0 ? c0309x.g : c0309x.g - Math.min(i11, c0309x.f4848b), y10);
            return;
        }
        int i12 = c0309x.g;
        int f4 = this.f13697q[0].f(i12);
        while (i7 < this.f13696p) {
            int f10 = this.f13697q[i7].f(i12);
            if (f10 < f4) {
                f4 = f10;
            }
            i7++;
        }
        int i13 = f4 - c0309x.g;
        t1(i13 < 0 ? c0309x.f4852f : Math.min(i13, c0309x.f4848b) + c0309x.f4852f, y10);
    }

    public final void s1(int i7, Y y10) {
        for (int y11 = y() - 1; y11 >= 0; y11--) {
            View x2 = x(y11);
            if (this.f13698r.g(x2) < i7 || this.f13698r.q(x2) < i7) {
                return;
            }
            n0 n0Var = (n0) x2.getLayoutParams();
            n0Var.getClass();
            if (n0Var.f4759e.f4784a.size() == 1) {
                return;
            }
            q0 q0Var = n0Var.f4759e;
            ArrayList arrayList = q0Var.f4784a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            n0 n0Var2 = (n0) view.getLayoutParams();
            n0Var2.f4759e = null;
            if (n0Var2.f4615a.k() || n0Var2.f4615a.n()) {
                q0Var.f4787d -= q0Var.f4789f.f13698r.e(view);
            }
            if (size == 1) {
                q0Var.f4785b = Integer.MIN_VALUE;
            }
            q0Var.f4786c = Integer.MIN_VALUE;
            B0(x2, y10);
        }
    }

    public final void t1(int i7, Y y10) {
        while (y() > 0) {
            View x2 = x(0);
            if (this.f13698r.d(x2) > i7 || this.f13698r.p(x2) > i7) {
                return;
            }
            n0 n0Var = (n0) x2.getLayoutParams();
            n0Var.getClass();
            if (n0Var.f4759e.f4784a.size() == 1) {
                return;
            }
            q0 q0Var = n0Var.f4759e;
            ArrayList arrayList = q0Var.f4784a;
            View view = (View) arrayList.remove(0);
            n0 n0Var2 = (n0) view.getLayoutParams();
            n0Var2.f4759e = null;
            if (arrayList.size() == 0) {
                q0Var.f4786c = Integer.MIN_VALUE;
            }
            if (n0Var2.f4615a.k() || n0Var2.f4615a.n()) {
                q0Var.f4787d -= q0Var.f4789f.f13698r.e(view);
            }
            q0Var.f4785b = Integer.MIN_VALUE;
            B0(x2, y10);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final T u() {
        return this.f13700t == 0 ? new T(-2, -1) : new T(-1, -2);
    }

    @Override // androidx.recyclerview.widget.a
    public final void u0(Parcelable parcelable) {
        if (parcelable instanceof p0) {
            p0 p0Var = (p0) parcelable;
            this.f13690F = p0Var;
            if (this.f13706z != -1) {
                p0Var.f4776d = null;
                p0Var.f4775c = 0;
                p0Var.f4773a = -1;
                p0Var.f4774b = -1;
                p0Var.f4776d = null;
                p0Var.f4775c = 0;
                p0Var.f4777e = 0;
                p0Var.f4778f = null;
                p0Var.f4779u = null;
            }
            F0();
        }
    }

    public final void u1() {
        if (this.f13700t == 1 || !m1()) {
            this.f13704x = this.f13703w;
        } else {
            this.f13704x = !this.f13703w;
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final T v(Context context, AttributeSet attributeSet) {
        return new T(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object, H2.p0] */
    /* JADX WARN: Type inference failed for: r1v28, types: [android.os.Parcelable, java.lang.Object, H2.p0] */
    @Override // androidx.recyclerview.widget.a
    public final Parcelable v0() {
        int h10;
        int m10;
        int[] iArr;
        p0 p0Var = this.f13690F;
        if (p0Var != null) {
            ?? obj = new Object();
            obj.f4775c = p0Var.f4775c;
            obj.f4773a = p0Var.f4773a;
            obj.f4774b = p0Var.f4774b;
            obj.f4776d = p0Var.f4776d;
            obj.f4777e = p0Var.f4777e;
            obj.f4778f = p0Var.f4778f;
            obj.f4780v = p0Var.f4780v;
            obj.f4781w = p0Var.f4781w;
            obj.f4782x = p0Var.f4782x;
            obj.f4779u = p0Var.f4779u;
            return obj;
        }
        ?? obj2 = new Object();
        obj2.f4780v = this.f13703w;
        obj2.f4781w = this.f13688D;
        obj2.f4782x = this.f13689E;
        c cVar = this.f13686B;
        if (cVar == null || (iArr = (int[]) cVar.f23371b) == null) {
            obj2.f4777e = 0;
        } else {
            obj2.f4778f = iArr;
            obj2.f4777e = iArr.length;
            obj2.f4779u = (ArrayList) cVar.f23372c;
        }
        if (y() > 0) {
            obj2.f4773a = this.f13688D ? h1() : g1();
            View c12 = this.f13704x ? c1(true) : d1(true);
            obj2.f4774b = c12 != null ? a.O(c12) : -1;
            int i7 = this.f13696p;
            obj2.f4775c = i7;
            obj2.f4776d = new int[i7];
            for (int i10 = 0; i10 < this.f13696p; i10++) {
                if (this.f13688D) {
                    h10 = this.f13697q[i10].f(Integer.MIN_VALUE);
                    if (h10 != Integer.MIN_VALUE) {
                        m10 = this.f13698r.i();
                        h10 -= m10;
                        obj2.f4776d[i10] = h10;
                    } else {
                        obj2.f4776d[i10] = h10;
                    }
                } else {
                    h10 = this.f13697q[i10].h(Integer.MIN_VALUE);
                    if (h10 != Integer.MIN_VALUE) {
                        m10 = this.f13698r.m();
                        h10 -= m10;
                        obj2.f4776d[i10] = h10;
                    } else {
                        obj2.f4776d[i10] = h10;
                    }
                }
            }
        } else {
            obj2.f4773a = -1;
            obj2.f4774b = -1;
            obj2.f4775c = 0;
        }
        return obj2;
    }

    public final int v1(int i7, Y y10, e0 e0Var) {
        if (y() == 0 || i7 == 0) {
            return 0;
        }
        q1(i7, e0Var);
        C0309x c0309x = this.f13702v;
        int b12 = b1(y10, c0309x, e0Var);
        if (c0309x.f4848b >= b12) {
            i7 = i7 < 0 ? -b12 : b12;
        }
        this.f13698r.r(-i7);
        this.f13688D = this.f13704x;
        c0309x.f4848b = 0;
        r1(y10, c0309x);
        return i7;
    }

    @Override // androidx.recyclerview.widget.a
    public final T w(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new T((ViewGroup.MarginLayoutParams) layoutParams) : new T(layoutParams);
    }

    @Override // androidx.recyclerview.widget.a
    public final void w0(int i7) {
        if (i7 == 0) {
            X0();
        }
    }

    public final void w1(int i7) {
        C0309x c0309x = this.f13702v;
        c0309x.f4851e = i7;
        c0309x.f4850d = this.f13704x != (i7 == -1) ? -1 : 1;
    }

    public final void x1(int i7, e0 e0Var) {
        int i10;
        int i11;
        int i12;
        C0309x c0309x = this.f13702v;
        boolean z8 = false;
        c0309x.f4848b = 0;
        c0309x.f4849c = i7;
        if (!V() || (i12 = e0Var.f4664a) == -1) {
            i10 = 0;
            i11 = 0;
        } else {
            if (this.f13704x == (i12 < i7)) {
                i10 = this.f13698r.n();
                i11 = 0;
            } else {
                i11 = this.f13698r.n();
                i10 = 0;
            }
        }
        RecyclerView recyclerView = this.f13708b;
        if (recyclerView == null || !recyclerView.f13675v) {
            c0309x.g = this.f13698r.h() + i10;
            c0309x.f4852f = -i11;
        } else {
            c0309x.f4852f = this.f13698r.m() - i11;
            c0309x.g = this.f13698r.i() + i10;
        }
        c0309x.f4853h = false;
        c0309x.f4847a = true;
        if (this.f13698r.k() == 0 && this.f13698r.h() == 0) {
            z8 = true;
        }
        c0309x.f4854i = z8;
    }

    public final void y1(q0 q0Var, int i7, int i10) {
        int i11 = q0Var.f4787d;
        int i12 = q0Var.f4788e;
        if (i7 != -1) {
            int i13 = q0Var.f4786c;
            if (i13 == Integer.MIN_VALUE) {
                q0Var.a();
                i13 = q0Var.f4786c;
            }
            if (i13 - i11 >= i10) {
                this.f13705y.set(i12, false);
                return;
            }
            return;
        }
        int i14 = q0Var.f4785b;
        if (i14 == Integer.MIN_VALUE) {
            View view = (View) q0Var.f4784a.get(0);
            n0 n0Var = (n0) view.getLayoutParams();
            q0Var.f4785b = q0Var.f4789f.f13698r.g(view);
            n0Var.getClass();
            i14 = q0Var.f4785b;
        }
        if (i14 + i11 <= i10) {
            this.f13705y.set(i12, false);
        }
    }
}
