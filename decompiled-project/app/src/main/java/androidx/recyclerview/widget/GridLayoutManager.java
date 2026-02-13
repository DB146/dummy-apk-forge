package androidx.recyclerview.widget;

import A3.c;
import C4.v;
import H2.C0305t;
import H2.C0308w;
import H2.C0310y;
import H2.C0311z;
import H2.T;
import H2.Y;
import H2.e0;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import h3.o;
import java.util.Arrays;
import java.util.WeakHashMap;
import q3.s;
import y1.K;
import z1.e;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public boolean f13580E;

    /* renamed from: F, reason: collision with root package name */
    public int f13581F;

    /* renamed from: G, reason: collision with root package name */
    public int[] f13582G;

    /* renamed from: H, reason: collision with root package name */
    public View[] f13583H;

    /* renamed from: I, reason: collision with root package name */
    public final SparseIntArray f13584I;

    /* renamed from: J, reason: collision with root package name */
    public final SparseIntArray f13585J;

    /* renamed from: K, reason: collision with root package name */
    public final s f13586K;
    public final Rect L;

    public GridLayoutManager(int i7) {
        super(1);
        this.f13580E = false;
        this.f13581F = -1;
        this.f13584I = new SparseIntArray();
        this.f13585J = new SparseIntArray();
        this.f13586K = new s(7);
        this.L = new Rect();
        H1(i7);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i7, int i10) {
        super(context, attributeSet, i7, i10);
        this.f13580E = false;
        this.f13581F = -1;
        this.f13584I = new SparseIntArray();
        this.f13585J = new SparseIntArray();
        this.f13586K = new s(7);
        this.L = new Rect();
        H1(a.P(context, attributeSet, i7, i10).f4612b);
    }

    @Override // androidx.recyclerview.widget.a
    public final int A(Y y10, e0 e0Var) {
        if (this.f13591p == 1) {
            return this.f13581F;
        }
        if (e0Var.b() < 1) {
            return 0;
        }
        return D1(e0Var.b() - 1, y10, e0Var) + 1;
    }

    public final void A1(int i7) {
        int i10;
        int[] iArr = this.f13582G;
        int i11 = this.f13581F;
        if (iArr == null || iArr.length != i11 + 1 || iArr[iArr.length - 1] != i7) {
            iArr = new int[i11 + 1];
        }
        int i12 = 0;
        iArr[0] = 0;
        int i13 = i7 / i11;
        int i14 = i7 % i11;
        int i15 = 0;
        for (int i16 = 1; i16 <= i11; i16++) {
            i12 += i14;
            if (i12 <= 0 || i11 - i12 >= i14) {
                i10 = i13;
            } else {
                i10 = i13 + 1;
                i12 -= i11;
            }
            i15 += i10;
            iArr[i16] = i15;
        }
        this.f13582G = iArr;
    }

    public final void B1() {
        View[] viewArr = this.f13583H;
        if (viewArr == null || viewArr.length != this.f13581F) {
            this.f13583H = new View[this.f13581F];
        }
    }

    public final int C1(int i7, int i10) {
        if (this.f13591p != 1 || !o1()) {
            int[] iArr = this.f13582G;
            return iArr[i10 + i7] - iArr[i7];
        }
        int[] iArr2 = this.f13582G;
        int i11 = this.f13581F;
        return iArr2[i11 - i7] - iArr2[(i11 - i7) - i10];
    }

    public final int D1(int i7, Y y10, e0 e0Var) {
        boolean z8 = e0Var.g;
        s sVar = this.f13586K;
        if (!z8) {
            int i10 = this.f13581F;
            sVar.getClass();
            return s.v(i7, i10);
        }
        int b2 = y10.b(i7);
        if (b2 != -1) {
            int i11 = this.f13581F;
            sVar.getClass();
            return s.v(b2, i11);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i7);
        return 0;
    }

    public final int E1(int i7, Y y10, e0 e0Var) {
        boolean z8 = e0Var.g;
        s sVar = this.f13586K;
        if (!z8) {
            int i10 = this.f13581F;
            sVar.getClass();
            return i7 % i10;
        }
        int i11 = this.f13585J.get(i7, -1);
        if (i11 != -1) {
            return i11;
        }
        int b2 = y10.b(i7);
        if (b2 != -1) {
            int i12 = this.f13581F;
            sVar.getClass();
            return b2 % i12;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i7);
        return 0;
    }

    public final int F1(int i7, Y y10, e0 e0Var) {
        boolean z8 = e0Var.g;
        s sVar = this.f13586K;
        if (!z8) {
            sVar.getClass();
            return 1;
        }
        int i10 = this.f13584I.get(i7, -1);
        if (i10 != -1) {
            return i10;
        }
        if (y10.b(i7) != -1) {
            sVar.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i7);
        return 1;
    }

    public final void G1(View view, int i7, boolean z8) {
        int i10;
        int i11;
        C0308w c0308w = (C0308w) view.getLayoutParams();
        Rect rect = c0308w.f4616b;
        int i12 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0308w).topMargin + ((ViewGroup.MarginLayoutParams) c0308w).bottomMargin;
        int i13 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0308w).leftMargin + ((ViewGroup.MarginLayoutParams) c0308w).rightMargin;
        int C12 = C1(c0308w.f4845e, c0308w.f4846f);
        if (this.f13591p == 1) {
            i11 = a.z(false, C12, i7, i13, ((ViewGroup.MarginLayoutParams) c0308w).width);
            i10 = a.z(true, this.f13593r.n(), this.f13716m, i12, ((ViewGroup.MarginLayoutParams) c0308w).height);
        } else {
            int z10 = a.z(false, C12, i7, i12, ((ViewGroup.MarginLayoutParams) c0308w).height);
            int z11 = a.z(true, this.f13593r.n(), this.f13715l, i13, ((ViewGroup.MarginLayoutParams) c0308w).width);
            i10 = z10;
            i11 = z11;
        }
        T t5 = (T) view.getLayoutParams();
        if (z8 ? S0(view, i11, i10, t5) : Q0(view, i11, i10, t5)) {
            view.measure(i11, i10);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int H0(int i7, Y y10, e0 e0Var) {
        I1();
        B1();
        return super.H0(i7, y10, e0Var);
    }

    public final void H1(int i7) {
        if (i7 == this.f13581F) {
            return;
        }
        this.f13580E = true;
        if (i7 < 1) {
            throw new IllegalArgumentException(o.l(i7, "Span count should be at least 1. Provided "));
        }
        this.f13581F = i7;
        this.f13586K.x();
        F0();
    }

    public final void I1() {
        int K10;
        int N10;
        if (this.f13591p == 1) {
            K10 = this.f13717n - M();
            N10 = L();
        } else {
            K10 = this.f13718o - K();
            N10 = N();
        }
        A1(K10 - N10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int J0(int i7, Y y10, e0 e0Var) {
        I1();
        B1();
        return super.J0(i7, y10, e0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final void N0(Rect rect, int i7, int i10) {
        int i11;
        int i12;
        if (this.f13582G == null) {
            super.N0(rect, i7, i10);
        }
        int M3 = M() + L();
        int K10 = K() + N();
        if (this.f13591p == 1) {
            int height = rect.height() + K10;
            RecyclerView recyclerView = this.f13708b;
            WeakHashMap weakHashMap = K.f26642a;
            i12 = a.i(i10, height, recyclerView.getMinimumHeight());
            int[] iArr = this.f13582G;
            i11 = a.i(i7, iArr[iArr.length - 1] + M3, this.f13708b.getMinimumWidth());
        } else {
            int width = rect.width() + M3;
            RecyclerView recyclerView2 = this.f13708b;
            WeakHashMap weakHashMap2 = K.f26642a;
            i11 = a.i(i7, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f13582G;
            i12 = a.i(i10, iArr2[iArr2.length - 1] + K10, this.f13708b.getMinimumHeight());
        }
        M0(i11, i12);
    }

    @Override // androidx.recyclerview.widget.a
    public final int Q(Y y10, e0 e0Var) {
        if (this.f13591p == 0) {
            return this.f13581F;
        }
        if (e0Var.b() < 1) {
            return 0;
        }
        return D1(e0Var.b() - 1, y10, e0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final boolean V0() {
        return this.f13601z == null && !this.f13580E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void X0(e0 e0Var, C0311z c0311z, C0305t c0305t) {
        int i7;
        int i10 = this.f13581F;
        for (int i11 = 0; i11 < this.f13581F && (i7 = c0311z.f4862d) >= 0 && i7 < e0Var.b() && i10 > 0; i11++) {
            c0305t.a(c0311z.f4862d, Math.max(0, c0311z.g));
            this.f13586K.getClass();
            i10--;
            c0311z.f4862d += c0311z.f4863e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c7, code lost:
    
        if (r13 == (r2 > r15)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e9, code lost:
    
        if (r13 == (r2 > r8)) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0102  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View d0(View view, int i7, Y y10, e0 e0Var) {
        int y11;
        int i10;
        int i11;
        View view2;
        View view3;
        int i12;
        Y y12 = y10;
        e0 e0Var2 = e0Var;
        View s3 = s(view);
        View view4 = null;
        if (s3 == null) {
            return null;
        }
        C0308w c0308w = (C0308w) s3.getLayoutParams();
        int i13 = c0308w.f4845e;
        int i14 = c0308w.f4846f + i13;
        if (super.d0(view, i7, y10, e0Var) == null) {
            return null;
        }
        if ((b1(i7) == 1) != this.f13596u) {
            i11 = y() - 1;
            y11 = -1;
            i10 = -1;
        } else {
            y11 = y();
            i10 = 1;
            i11 = 0;
        }
        boolean z8 = this.f13591p == 1 && o1();
        int D12 = D1(i11, y12, e0Var2);
        int i15 = -1;
        int i16 = -1;
        int i17 = i10;
        int i18 = 0;
        int i19 = 0;
        int i20 = i11;
        View view5 = null;
        while (i20 != y11) {
            int i21 = y11;
            int D13 = D1(i20, y12, e0Var2);
            View x2 = x(i20);
            if (x2 == s3) {
                break;
            }
            if (!x2.hasFocusable() || D13 == D12) {
                C0308w c0308w2 = (C0308w) x2.getLayoutParams();
                int i22 = c0308w2.f4845e;
                view2 = s3;
                int i23 = c0308w2.f4846f + i22;
                if (x2.hasFocusable() && i22 == i13 && i23 == i14) {
                    return x2;
                }
                if (!(x2.hasFocusable() && view4 == null) && (x2.hasFocusable() || view5 != null)) {
                    view3 = view5;
                    int min = Math.min(i23, i14) - Math.max(i22, i13);
                    if (x2.hasFocusable()) {
                        if (min <= i18) {
                            if (min == i18) {
                            }
                        }
                    } else if (view4 == null) {
                        i12 = i18;
                        if (!this.f13709c.r(x2) || !this.f13710d.r(x2)) {
                            if (min <= i19) {
                                if (min == i19) {
                                }
                            }
                            if (x2.hasFocusable()) {
                                int i24 = c0308w2.f4845e;
                                i19 = Math.min(i23, i14) - Math.max(i22, i13);
                                i15 = i24;
                                i18 = i12;
                                view5 = x2;
                            } else {
                                int i25 = c0308w2.f4845e;
                                i18 = Math.min(i23, i14) - Math.max(i22, i13);
                                i16 = i25;
                                view5 = view3;
                                view4 = x2;
                            }
                            i20 += i17;
                            y12 = y10;
                            e0Var2 = e0Var;
                            y11 = i21;
                            s3 = view2;
                        }
                        i18 = i12;
                        view5 = view3;
                        i20 += i17;
                        y12 = y10;
                        e0Var2 = e0Var;
                        y11 = i21;
                        s3 = view2;
                    }
                } else {
                    view3 = view5;
                }
                i12 = i18;
                if (x2.hasFocusable()) {
                }
                i20 += i17;
                y12 = y10;
                e0Var2 = e0Var;
                y11 = i21;
                s3 = view2;
            } else {
                if (view4 != null) {
                    break;
                }
                view2 = s3;
                view3 = view5;
            }
            i12 = i18;
            i18 = i12;
            view5 = view3;
            i20 += i17;
            y12 = y10;
            e0Var2 = e0Var;
            y11 = i21;
            s3 = view2;
        }
        return view4 != null ? view4 : view5;
    }

    @Override // androidx.recyclerview.widget.a
    public final void f0(Y y10, e0 e0Var, e eVar) {
        super.f0(y10, e0Var, eVar);
        eVar.i(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.a
    public final void g0(Y y10, e0 e0Var, View view, e eVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0308w)) {
            h0(view, eVar);
            return;
        }
        C0308w c0308w = (C0308w) layoutParams;
        int D12 = D1(c0308w.f4615a.d(), y10, e0Var);
        if (this.f13591p == 0) {
            eVar.k(o7.o.m(false, c0308w.f4845e, c0308w.f4846f, D12, 1));
        } else {
            eVar.k(o7.o.m(false, D12, 1, c0308w.f4845e, c0308w.f4846f));
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean h(T t5) {
        return t5 instanceof C0308w;
    }

    @Override // androidx.recyclerview.widget.a
    public final void j0(int i7, int i10) {
        s sVar = this.f13586K;
        sVar.x();
        ((SparseIntArray) sVar.f23439c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View j1(Y y10, e0 e0Var, boolean z8, boolean z10) {
        int i7;
        int i10;
        int y11 = y();
        int i11 = 1;
        if (z10) {
            i10 = y() - 1;
            i7 = -1;
            i11 = -1;
        } else {
            i7 = y11;
            i10 = 0;
        }
        int b2 = e0Var.b();
        c1();
        int m10 = this.f13593r.m();
        int i12 = this.f13593r.i();
        View view = null;
        View view2 = null;
        while (i10 != i7) {
            View x2 = x(i10);
            int O10 = a.O(x2);
            if (O10 >= 0 && O10 < b2 && E1(O10, y10, e0Var) == 0) {
                if (((T) x2.getLayoutParams()).f4615a.k()) {
                    if (view2 == null) {
                        view2 = x2;
                    }
                } else {
                    if (this.f13593r.g(x2) < i12 && this.f13593r.d(x2) >= m10) {
                        return x2;
                    }
                    if (view == null) {
                        view = x2;
                    }
                }
            }
            i10 += i11;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.a
    public final void k0() {
        s sVar = this.f13586K;
        sVar.x();
        ((SparseIntArray) sVar.f23439c).clear();
    }

    @Override // androidx.recyclerview.widget.a
    public final void l0(int i7, int i10) {
        s sVar = this.f13586K;
        sVar.x();
        ((SparseIntArray) sVar.f23439c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int m(e0 e0Var) {
        return Z0(e0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final void m0(int i7, int i10) {
        s sVar = this.f13586K;
        sVar.x();
        ((SparseIntArray) sVar.f23439c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int n(e0 e0Var) {
        return a1(e0Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final void o0(RecyclerView recyclerView, int i7, int i10) {
        s sVar = this.f13586K;
        sVar.x();
        ((SparseIntArray) sVar.f23439c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int p(e0 e0Var) {
        return Z0(e0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final void p0(Y y10, e0 e0Var) {
        boolean z8 = e0Var.g;
        SparseIntArray sparseIntArray = this.f13585J;
        SparseIntArray sparseIntArray2 = this.f13584I;
        if (z8) {
            int y11 = y();
            for (int i7 = 0; i7 < y11; i7++) {
                C0308w c0308w = (C0308w) x(i7).getLayoutParams();
                int d10 = c0308w.f4615a.d();
                sparseIntArray2.put(d10, c0308w.f4846f);
                sparseIntArray.put(d10, c0308w.f4845e);
            }
        }
        super.p0(y10, e0Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
    
        r22.f4856b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
    
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p1(Y y10, e0 e0Var, C0311z c0311z, C0310y c0310y) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int z8;
        int i16;
        boolean z10;
        int i17;
        View b2;
        int l10 = this.f13593r.l();
        boolean z11 = l10 != 1073741824;
        int i18 = y() > 0 ? this.f13582G[this.f13581F] : 0;
        if (z11) {
            I1();
        }
        boolean z12 = c0311z.f4863e == 1;
        int i19 = this.f13581F;
        if (!z12) {
            i19 = E1(c0311z.f4862d, y10, e0Var) + F1(c0311z.f4862d, y10, e0Var);
        }
        int i20 = 0;
        while (i20 < this.f13581F && (i17 = c0311z.f4862d) >= 0 && i17 < e0Var.b() && i19 > 0) {
            int i21 = c0311z.f4862d;
            int F12 = F1(i21, y10, e0Var);
            if (F12 > this.f13581F) {
                throw new IllegalArgumentException(c.k(o.q(i21, F12, "Item at position ", " requires ", " spans but GridLayoutManager has only "), this.f13581F, " spans."));
            }
            i19 -= F12;
            if (i19 < 0 || (b2 = c0311z.b(y10)) == null) {
                break;
            }
            this.f13583H[i20] = b2;
            i20++;
        }
        if (z12) {
            i11 = 1;
            i10 = i20;
            i7 = 0;
        } else {
            i7 = i20 - 1;
            i10 = -1;
            i11 = -1;
        }
        int i22 = 0;
        while (i7 != i10) {
            View view = this.f13583H[i7];
            C0308w c0308w = (C0308w) view.getLayoutParams();
            int F13 = F1(a.O(view), y10, e0Var);
            c0308w.f4846f = F13;
            c0308w.f4845e = i22;
            i22 += F13;
            i7 += i11;
        }
        float f4 = 0.0f;
        int i23 = 0;
        for (int i24 = 0; i24 < i20; i24++) {
            View view2 = this.f13583H[i24];
            if (c0311z.k != null) {
                z10 = false;
                if (z12) {
                    c(view2, -1, true);
                } else {
                    c(view2, 0, true);
                }
            } else if (z12) {
                b(view2);
                z10 = false;
            } else {
                z10 = false;
                c(view2, 0, false);
            }
            e(this.L, view2);
            G1(view2, l10, z10);
            int e2 = this.f13593r.e(view2);
            if (e2 > i23) {
                i23 = e2;
            }
            float f10 = (this.f13593r.f(view2) * 1.0f) / ((C0308w) view2.getLayoutParams()).f4846f;
            if (f10 > f4) {
                f4 = f10;
            }
        }
        if (z11) {
            A1(Math.max(Math.round(f4 * this.f13581F), i18));
            i23 = 0;
            for (int i25 = 0; i25 < i20; i25++) {
                View view3 = this.f13583H[i25];
                G1(view3, 1073741824, true);
                int e10 = this.f13593r.e(view3);
                if (e10 > i23) {
                    i23 = e10;
                }
            }
        }
        for (int i26 = 0; i26 < i20; i26++) {
            View view4 = this.f13583H[i26];
            if (this.f13593r.e(view4) != i23) {
                C0308w c0308w2 = (C0308w) view4.getLayoutParams();
                Rect rect = c0308w2.f4616b;
                int i27 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0308w2).topMargin + ((ViewGroup.MarginLayoutParams) c0308w2).bottomMargin;
                int i28 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0308w2).leftMargin + ((ViewGroup.MarginLayoutParams) c0308w2).rightMargin;
                int C12 = C1(c0308w2.f4845e, c0308w2.f4846f);
                if (this.f13591p == 1) {
                    i16 = a.z(false, C12, 1073741824, i28, ((ViewGroup.MarginLayoutParams) c0308w2).width);
                    z8 = View.MeasureSpec.makeMeasureSpec(i23 - i27, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i23 - i28, 1073741824);
                    z8 = a.z(false, C12, 1073741824, i27, ((ViewGroup.MarginLayoutParams) c0308w2).height);
                    i16 = makeMeasureSpec;
                }
                if (S0(view4, i16, z8, (T) view4.getLayoutParams())) {
                    view4.measure(i16, z8);
                }
            }
        }
        c0310y.f4855a = i23;
        if (this.f13591p != 1) {
            if (c0311z.f4864f == -1) {
                int i29 = c0311z.f4860b;
                i13 = i29 - i23;
                i12 = i29;
            } else {
                int i30 = c0311z.f4860b;
                i12 = i30 + i23;
                i13 = i30;
            }
            i14 = 0;
            i15 = 0;
        } else if (c0311z.f4864f == -1) {
            i15 = c0311z.f4860b;
            i14 = i15 - i23;
            i13 = 0;
            i12 = 0;
        } else {
            int i31 = c0311z.f4860b;
            i14 = i31;
            i12 = 0;
            i15 = i31 + i23;
            i13 = 0;
        }
        for (int i32 = 0; i32 < i20; i32++) {
            View view5 = this.f13583H[i32];
            C0308w c0308w3 = (C0308w) view5.getLayoutParams();
            if (this.f13591p != 1) {
                i14 = N() + this.f13582G[c0308w3.f4845e];
                i15 = this.f13593r.f(view5) + i14;
            } else if (o1()) {
                int L = L() + this.f13582G[this.f13581F - c0308w3.f4845e];
                i12 = L;
                i13 = L - this.f13593r.f(view5);
            } else {
                i13 = L() + this.f13582G[c0308w3.f4845e];
                i12 = this.f13593r.f(view5) + i13;
            }
            a.W(view5, i13, i14, i12, i15);
            if (c0308w3.f4615a.k() || c0308w3.f4615a.n()) {
                c0310y.f4857c = true;
            }
            c0310y.f4858d = view5.hasFocusable() | c0310y.f4858d;
        }
        Arrays.fill(this.f13583H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int q(e0 e0Var) {
        return a1(e0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final void q0(e0 e0Var) {
        super.q0(e0Var);
        this.f13580E = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void q1(Y y10, e0 e0Var, v vVar, int i7) {
        I1();
        if (e0Var.b() > 0 && !e0Var.g) {
            boolean z8 = i7 == 1;
            int E12 = E1(vVar.f2874b, y10, e0Var);
            if (z8) {
                while (E12 > 0) {
                    int i10 = vVar.f2874b;
                    if (i10 <= 0) {
                        break;
                    }
                    int i11 = i10 - 1;
                    vVar.f2874b = i11;
                    E12 = E1(i11, y10, e0Var);
                }
            } else {
                int b2 = e0Var.b() - 1;
                int i12 = vVar.f2874b;
                while (i12 < b2) {
                    int i13 = i12 + 1;
                    int E13 = E1(i13, y10, e0Var);
                    if (E13 <= E12) {
                        break;
                    }
                    i12 = i13;
                    E12 = E13;
                }
                vVar.f2874b = i12;
            }
        }
        B1();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final T u() {
        return this.f13591p == 0 ? new C0308w(-2, -1) : new C0308w(-1, -2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [H2.T, H2.w] */
    @Override // androidx.recyclerview.widget.a
    public final T v(Context context, AttributeSet attributeSet) {
        ?? t5 = new T(context, attributeSet);
        t5.f4845e = -1;
        t5.f4846f = 0;
        return t5;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [H2.T, H2.w] */
    /* JADX WARN: Type inference failed for: r0v2, types: [H2.T, H2.w] */
    @Override // androidx.recyclerview.widget.a
    public final T w(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? t5 = new T((ViewGroup.MarginLayoutParams) layoutParams);
            t5.f4845e = -1;
            t5.f4846f = 0;
            return t5;
        }
        ?? t10 = new T(layoutParams);
        t10.f4845e = -1;
        t10.f4846f = 0;
        return t10;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void w1(boolean z8) {
        if (z8) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.w1(false);
    }
}
