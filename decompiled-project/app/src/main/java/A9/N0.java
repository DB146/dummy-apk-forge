package A9;

import H2.C0305t;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.FocusFinder;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import u.C2066t;
import y1.C2355c;

/* loaded from: classes2.dex */
public final class N0 extends androidx.recyclerview.widget.a {

    /* renamed from: i0, reason: collision with root package name */
    public static final Rect f872i0 = new Rect();

    /* renamed from: j0, reason: collision with root package name */
    public static final int[] f873j0 = new int[2];

    /* renamed from: A, reason: collision with root package name */
    public H2.Y f874A;

    /* renamed from: H, reason: collision with root package name */
    public I0 f881H;

    /* renamed from: I, reason: collision with root package name */
    public K0 f882I;

    /* renamed from: K, reason: collision with root package name */
    public int f884K;
    public int L;

    /* renamed from: M, reason: collision with root package name */
    public int f885M;

    /* renamed from: N, reason: collision with root package name */
    public int f886N;

    /* renamed from: O, reason: collision with root package name */
    public int[] f887O;

    /* renamed from: P, reason: collision with root package name */
    public int f888P;

    /* renamed from: Q, reason: collision with root package name */
    public int f889Q;

    /* renamed from: R, reason: collision with root package name */
    public int f890R;

    /* renamed from: S, reason: collision with root package name */
    public int f891S;

    /* renamed from: T, reason: collision with root package name */
    public int f892T;

    /* renamed from: V, reason: collision with root package name */
    public int f894V;

    /* renamed from: X, reason: collision with root package name */
    public G0 f896X;

    /* renamed from: b0, reason: collision with root package name */
    public int f900b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f901c0;

    /* renamed from: e0, reason: collision with root package name */
    public final A4.h f903e0;

    /* renamed from: f0, reason: collision with root package name */
    public C0135s1 f904f0;

    /* renamed from: g0, reason: collision with root package name */
    public final RunnableC0102k f905g0;

    /* renamed from: h0, reason: collision with root package name */
    public final T f906h0;

    /* renamed from: r, reason: collision with root package name */
    public final AbstractC0145v f909r;

    /* renamed from: u, reason: collision with root package name */
    public int f912u;

    /* renamed from: v, reason: collision with root package name */
    public H2.e0 f913v;

    /* renamed from: w, reason: collision with root package name */
    public int f914w;

    /* renamed from: x, reason: collision with root package name */
    public int f915x;

    /* renamed from: z, reason: collision with root package name */
    public int[] f917z;

    /* renamed from: p, reason: collision with root package name */
    public float f907p = 1.0f;

    /* renamed from: q, reason: collision with root package name */
    public int f908q = 10;

    /* renamed from: s, reason: collision with root package name */
    public int f910s = 0;

    /* renamed from: t, reason: collision with root package name */
    public H2.E f911t = new H2.D(this, 0);

    /* renamed from: y, reason: collision with root package name */
    public final SparseIntArray f916y = new SparseIntArray();

    /* renamed from: B, reason: collision with root package name */
    public int f875B = 221696;

    /* renamed from: C, reason: collision with root package name */
    public L1 f876C = null;

    /* renamed from: D, reason: collision with root package name */
    public ArrayList f877D = null;

    /* renamed from: E, reason: collision with root package name */
    public K1 f878E = null;

    /* renamed from: F, reason: collision with root package name */
    public int f879F = -1;

    /* renamed from: G, reason: collision with root package name */
    public int f880G = 0;

    /* renamed from: J, reason: collision with root package name */
    public int f883J = 0;

    /* renamed from: U, reason: collision with root package name */
    public int f893U = 8388659;

    /* renamed from: W, reason: collision with root package name */
    public int f895W = 1;

    /* renamed from: Y, reason: collision with root package name */
    public int f897Y = 0;

    /* renamed from: Z, reason: collision with root package name */
    public final r8.o f898Z = new r8.o(1);

    /* renamed from: a0, reason: collision with root package name */
    public final A0.G0 f899a0 = new A0.G0(3, (byte) 0);

    /* renamed from: d0, reason: collision with root package name */
    public final int[] f902d0 = new int[2];

    public N0(AbstractC0145v abstractC0145v) {
        A4.h hVar = new A4.h(1);
        hVar.f385b = 0;
        hVar.f386c = 100;
        this.f903e0 = hVar;
        this.f905g0 = new RunnableC0102k(this, 5);
        this.f906h0 = new T(this);
        this.f909r = abstractC0145v;
        this.f884K = -1;
        if (this.f13714i) {
            this.f13714i = false;
            this.j = 0;
            RecyclerView recyclerView = this.f13708b;
            if (recyclerView != null) {
                recyclerView.f13651c.n();
            }
        }
    }

    public static int Z0(View view) {
        J0 j02;
        if (view == null || (j02 = (J0) view.getLayoutParams()) == null || j02.f4615a.k()) {
            return -1;
        }
        return j02.f4615a.c();
    }

    @Override // androidx.recyclerview.widget.a
    public final int A(H2.Y y10, H2.e0 e0Var) {
        G0 g02;
        if (this.f910s != 1 || (g02 = this.f896X) == null) {
            return -1;
        }
        return g02.f828e;
    }

    public final void A1(View view, boolean z8) {
        B1(view, view.findFocus(), z8, 0, 0);
    }

    @Override // androidx.recyclerview.widget.a
    public final int B(View view) {
        return super.B(view) - ((J0) view.getLayoutParams()).f846v;
    }

    public final void B1(View view, View view2, boolean z8, int i7, int i10) {
        if ((this.f875B & 64) != 0) {
            return;
        }
        int Z02 = Z0(view);
        int i12 = i1(view, view2);
        int i11 = this.f879F;
        AbstractC0145v abstractC0145v = this.f909r;
        if (Z02 != i11 || i12 != this.f880G) {
            this.f879F = Z02;
            this.f880G = i12;
            this.f883J = 0;
            if ((this.f875B & 3) != 1) {
                X0();
            }
            if (abstractC0145v.P()) {
                abstractC0145v.invalidate();
            }
        }
        if (view == null) {
            return;
        }
        if (!view.hasFocus() && abstractC0145v.hasFocus()) {
            view.requestFocus();
        }
        if ((this.f875B & 131072) == 0 && z8) {
            return;
        }
        int[] iArr = f873j0;
        if (!f1(view, view2, iArr) && i7 == 0 && i10 == 0) {
            return;
        }
        int i13 = iArr[0] + i7;
        int i14 = iArr[1] + i10;
        if ((this.f875B & 3) == 1) {
            x1(i13);
            y1(i14);
            return;
        }
        if (this.f910s != 0) {
            i14 = i13;
            i13 = i14;
        }
        if (z8) {
            abstractC0145v.j0(i13, i14);
        } else {
            abstractC0145v.scrollBy(i13, i14);
            Y0();
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void C(Rect rect, View view) {
        super.C(rect, view);
        J0 j02 = (J0) view.getLayoutParams();
        rect.left += j02.f843e;
        rect.top += j02.f844f;
        rect.right -= j02.f845u;
        rect.bottom -= j02.f846v;
    }

    public final void C1(int i7) {
        if (i7 == 0 || i7 == 1) {
            this.f910s = i7;
            this.f911t = H2.E.b(this, i7);
            r8.o oVar = this.f898Z;
            oVar.getClass();
            v3 v3Var = (v3) oVar.f23857b;
            v3 v3Var2 = (v3) oVar.f23858c;
            if (i7 == 0) {
                oVar.f23859d = v3Var2;
                oVar.f23860e = v3Var;
            } else {
                oVar.f23859d = v3Var;
                oVar.f23860e = v3Var2;
            }
            A0.G0 g02 = this.f899a0;
            g02.getClass();
            if (i7 == 0) {
                g02.f29d = (C0112m1) g02.f28c;
            } else {
                g02.f29d = (C0112m1) g02.f27b;
            }
            this.f875B |= 256;
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final int D(View view) {
        return super.D(view) + ((J0) view.getLayoutParams()).f843e;
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean D0(RecyclerView recyclerView, View view, Rect rect, boolean z8) {
        return false;
    }

    public final void D1(int i7) {
        if (i7 < 0 && i7 != -2) {
            throw new IllegalArgumentException(h3.o.l(i7, "Invalid row height: "));
        }
        this.f885M = i7;
    }

    public final void E1(int i7, boolean z8) {
        if ((this.f879F == i7 || i7 == -1) && this.f880G == 0) {
            return;
        }
        z1(z8, i7, 0);
    }

    public final void F1() {
        int y10 = y();
        for (int i7 = 0; i7 < y10; i7++) {
            G1(x(i7));
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final int G(View view) {
        return super.G(view) - ((J0) view.getLayoutParams()).f845u;
    }

    public final void G1(View view) {
        J0 j02 = (J0) view.getLayoutParams();
        C0120o1 c0120o1 = j02.f850z;
        A0.G0 g02 = this.f899a0;
        if (c0120o1 == null) {
            C0112m1 c0112m1 = (C0112m1) g02.f28c;
            j02.f847w = AbstractC0124p1.a(view, c0112m1, c0112m1.g);
            C0112m1 c0112m12 = (C0112m1) g02.f27b;
            j02.f848x = AbstractC0124p1.a(view, c0112m12, c0112m12.g);
            return;
        }
        int i7 = this.f910s;
        C0116n1[] c0116n1Arr = c0120o1.f1326a;
        int[] iArr = j02.f849y;
        if (iArr == null || iArr.length != c0116n1Arr.length) {
            j02.f849y = new int[c0116n1Arr.length];
        }
        for (int i10 = 0; i10 < c0116n1Arr.length; i10++) {
            j02.f849y[i10] = AbstractC0124p1.a(view, c0116n1Arr[i10], i7);
        }
        if (i7 == 0) {
            j02.f847w = j02.f849y[0];
        } else {
            j02.f848x = j02.f849y[0];
        }
        if (this.f910s == 0) {
            C0112m1 c0112m13 = (C0112m1) g02.f27b;
            j02.f848x = AbstractC0124p1.a(view, c0112m13, c0112m13.g);
        } else {
            C0112m1 c0112m14 = (C0112m1) g02.f28c;
            j02.f847w = AbstractC0124p1.a(view, c0112m14, c0112m14.g);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final int H(View view) {
        return super.H(view) + ((J0) view.getLayoutParams()).f844f;
    }

    @Override // androidx.recyclerview.widget.a
    public final int H0(int i7, H2.Y y10, H2.e0 e0Var) {
        if ((this.f875B & 512) == 0 || this.f896X == null) {
            return 0;
        }
        w1(y10, e0Var);
        this.f875B = (this.f875B & (-4)) | 2;
        int x12 = this.f910s == 0 ? x1(i7) : y1(i7);
        o1();
        this.f875B &= -4;
        return x12;
    }

    public final void H1() {
        if (y() <= 0) {
            this.f914w = 0;
        } else {
            this.f914w = this.f896X.f829f - ((J0) x(0).getLayoutParams()).f4615a.d();
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void I0(int i7) {
        E1(i7, false);
    }

    public final void I1() {
        int i7 = (this.f875B & (-1025)) | (s1(false) ? 1024 : 0);
        this.f875B = i7;
        if ((i7 & 1024) != 0) {
            WeakHashMap weakHashMap = y1.K.f26642a;
            this.f909r.postOnAnimation(this.f905g0);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final int J0(int i7, H2.Y y10, H2.e0 e0Var) {
        int i10 = this.f875B;
        if ((i10 & 512) == 0 || this.f896X == null) {
            return 0;
        }
        this.f875B = (i10 & (-4)) | 2;
        w1(y10, e0Var);
        int x12 = this.f910s == 1 ? x1(i7) : y1(i7);
        o1();
        this.f875B &= -4;
        return x12;
    }

    public final void J1() {
        int i7;
        int i10;
        int b2;
        int i11;
        int i12;
        int i13;
        int top;
        int i14;
        int top2;
        int i15;
        if (this.f913v.b() == 0) {
            return;
        }
        if ((this.f875B & 262144) == 0) {
            i11 = this.f896X.g;
            int b10 = this.f913v.b() - 1;
            i7 = this.f896X.f829f;
            i10 = b10;
            b2 = 0;
        } else {
            G0 g02 = this.f896X;
            int i16 = g02.f829f;
            i7 = g02.g;
            i10 = 0;
            b2 = this.f913v.b() - 1;
            i11 = i16;
        }
        if (i11 < 0 || i7 < 0) {
            return;
        }
        boolean z8 = i11 == i10;
        boolean z10 = i7 == b2;
        int i17 = Integer.MIN_VALUE;
        int i18 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        r8.o oVar = this.f898Z;
        if (!z8) {
            v3 v3Var = (v3) oVar.f23859d;
            if (v3Var.f1440a == Integer.MAX_VALUE && !z10 && v3Var.f1441b == Integer.MIN_VALUE) {
                return;
            }
        }
        int[] iArr = f873j0;
        if (z8) {
            i18 = this.f896X.f(true, iArr);
            View t5 = t(iArr[1]);
            if (this.f910s == 0) {
                J0 j02 = (J0) t5.getLayoutParams();
                j02.getClass();
                top2 = t5.getLeft() + j02.f843e;
                i15 = j02.f847w;
            } else {
                J0 j03 = (J0) t5.getLayoutParams();
                j03.getClass();
                top2 = t5.getTop() + j03.f844f;
                i15 = j03.f848x;
            }
            int i19 = top2 + i15;
            int[] iArr2 = ((J0) t5.getLayoutParams()).f849y;
            i12 = (iArr2 == null || iArr2.length <= 0) ? i19 : (iArr2[iArr2.length - 1] - iArr2[0]) + i19;
        } else {
            i12 = Integer.MAX_VALUE;
        }
        if (z10) {
            i17 = this.f896X.h(false, iArr);
            View t10 = t(iArr[1]);
            if (this.f910s == 0) {
                J0 j04 = (J0) t10.getLayoutParams();
                j04.getClass();
                top = t10.getLeft() + j04.f843e;
                i14 = j04.f847w;
            } else {
                J0 j05 = (J0) t10.getLayoutParams();
                j05.getClass();
                top = t10.getTop() + j05.f844f;
                i14 = j05.f848x;
            }
            i13 = top + i14;
        } else {
            i13 = Integer.MIN_VALUE;
        }
        ((v3) oVar.f23859d).c(i17, i18, i13, i12);
    }

    public final void K1() {
        v3 v3Var = (v3) this.f898Z.f23860e;
        int i7 = v3Var.j - this.L;
        int g12 = g1() + i7;
        v3Var.c(i7, g12, i7, g12);
    }

    @Override // androidx.recyclerview.widget.a
    public final int Q(H2.Y y10, H2.e0 e0Var) {
        G0 g02;
        if (this.f910s != 0 || (g02 = this.f896X) == null) {
            return -1;
        }
        return g02.f828e;
    }

    @Override // androidx.recyclerview.widget.a
    public final void T0(RecyclerView recyclerView, int i7) {
        E1(i7, true);
    }

    @Override // androidx.recyclerview.widget.a
    public final void U0(H2.B b2) {
        I0 i02 = this.f881H;
        if (i02 != null) {
            i02.f837q = true;
        }
        super.U0(b2);
        if (!b2.f4576e || !(b2 instanceof I0)) {
            this.f881H = null;
            this.f882I = null;
            return;
        }
        I0 i03 = (I0) b2;
        this.f881H = i03;
        if (i03 instanceof K0) {
            this.f882I = (K0) i03;
        } else {
            this.f882I = null;
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean V0() {
        return true;
    }

    public final void W0() {
        this.f896X.b((this.f875B & 262144) != 0 ? (-this.f901c0) - this.f915x : this.f900b0 + this.f901c0 + this.f915x, false);
    }

    public final void X0() {
        ArrayList arrayList;
        if (this.f876C != null || ((arrayList = this.f877D) != null && arrayList.size() > 0)) {
            int i7 = this.f879F;
            View t5 = i7 == -1 ? null : t(i7);
            AbstractC0145v abstractC0145v = this.f909r;
            if (t5 != null) {
                H2.i0 L = abstractC0145v.L(t5);
                L1 l12 = this.f876C;
                if (l12 != null) {
                    l12.j(t5, this.f879F);
                }
                int i10 = this.f879F;
                int i11 = this.f880G;
                ArrayList arrayList2 = this.f877D;
                if (arrayList2 != null) {
                    for (int size = arrayList2.size() - 1; size >= 0; size--) {
                        ((M1) this.f877D.get(size)).a(abstractC0145v, L, i10, i11);
                    }
                }
            } else {
                L1 l13 = this.f876C;
                if (l13 != null) {
                    l13.j(null, -1);
                }
                ArrayList arrayList3 = this.f877D;
                if (arrayList3 != null) {
                    for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                        ((M1) this.f877D.get(size2)).a(abstractC0145v, null, -1, 0);
                    }
                }
            }
            if ((this.f875B & 3) == 1 || abstractC0145v.isLayoutRequested()) {
                return;
            }
            int y10 = y();
            for (int i12 = 0; i12 < y10; i12++) {
                if (x(i12).isLayoutRequested()) {
                    WeakHashMap weakHashMap = y1.K.f26642a;
                    abstractC0145v.postOnAnimation(this.f905g0);
                    return;
                }
            }
        }
    }

    public final void Y0() {
        ArrayList arrayList = this.f877D;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        int i7 = this.f879F;
        View t5 = i7 == -1 ? null : t(i7);
        if (t5 != null) {
            H2.i0 L = this.f909r.L(t5);
            int i10 = this.f879F;
            ArrayList arrayList2 = this.f877D;
            if (arrayList2 == null) {
                return;
            }
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                ((M1) this.f877D.get(size)).b(L, i10);
            }
            return;
        }
        L1 l12 = this.f876C;
        if (l12 != null) {
            l12.j(null, -1);
        }
        ArrayList arrayList3 = this.f877D;
        if (arrayList3 == null) {
            return;
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ((M1) this.f877D.get(size2)).b(null, -1);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void Z(H2.K k, H2.K k7) {
        if (k != null) {
            this.f896X = null;
            this.f887O = null;
            this.f875B &= -1025;
            this.f879F = -1;
            this.f883J = 0;
            C2066t c2066t = (C2066t) this.f903e0.f387d;
            if (c2066t != null) {
                c2066t.evictAll();
            }
        }
        if (k7 instanceof C0135s1) {
            this.f904f0 = (C0135s1) k7;
        } else {
            this.f904f0 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d2  */
    @Override // androidx.recyclerview.widget.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a0(RecyclerView recyclerView, ArrayList arrayList, int i7, int i10) {
        int i11;
        View x2;
        AbstractC0145v abstractC0145v;
        View s3;
        if ((this.f875B & 32768) != 0) {
            return true;
        }
        if (!recyclerView.hasFocus()) {
            int size = arrayList.size();
            if (this.f897Y != 0) {
                v3 v3Var = (v3) this.f898Z.f23859d;
                int i12 = v3Var.j;
                int i13 = ((v3Var.f1447i - i12) - v3Var.k) + i12;
                int y10 = y();
                for (int i14 = 0; i14 < y10; i14++) {
                    View x10 = x(i14);
                    if (x10.getVisibility() == 0 && this.f911t.g(x10) >= i12 && this.f911t.d(x10) <= i13) {
                        x10.addFocusables(arrayList, i7, i10);
                    }
                }
                if (arrayList.size() == size) {
                    int y11 = y();
                    for (int i15 = 0; i15 < y11; i15++) {
                        View x11 = x(i15);
                        if (x11.getVisibility() == 0) {
                            x11.addFocusables(arrayList, i7, i10);
                        }
                    }
                }
            } else {
                View t5 = t(this.f879F);
                if (t5 != null) {
                    t5.addFocusables(arrayList, i7, i10);
                }
            }
            if (arrayList.size() == size && recyclerView.isFocusable()) {
                arrayList.add(recyclerView);
            }
        } else {
            if (this.f882I != null) {
                return true;
            }
            int c12 = c1(i7);
            View findFocus = recyclerView.findFocus();
            if (findFocus != null && (abstractC0145v = this.f909r) != null && findFocus != abstractC0145v && (s3 = s(findFocus)) != null) {
                int y12 = y();
                i11 = 0;
                while (i11 < y12) {
                    if (x(i11) == s3) {
                        break;
                    }
                    i11++;
                }
            }
            i11 = -1;
            int Z02 = Z0(x(i11));
            View t10 = Z02 == -1 ? null : t(Z02);
            if (t10 != null) {
                t10.addFocusables(arrayList, i7, i10);
            }
            if (this.f896X == null || y() == 0) {
                return true;
            }
            if ((c12 == 3 || c12 == 2) && this.f896X.f828e <= 1) {
                return true;
            }
            G0 g02 = this.f896X;
            int i16 = (g02 == null || t10 == null) ? -1 : g02.k(Z02).f1468a;
            int size2 = arrayList.size();
            int i17 = (c12 == 1 || c12 == 3) ? 1 : -1;
            int y13 = i17 > 0 ? y() - 1 : 0;
            int y14 = i11 == -1 ? i17 > 0 ? 0 : y() - 1 : i11 + i17;
            while (true) {
                if (i17 > 0) {
                    if (y14 > y13) {
                        break;
                    }
                    x2 = x(y14);
                    if (x2.getVisibility() == 0 && x2.hasFocusable()) {
                        if (t10 != null) {
                            x2.addFocusables(arrayList, i7, i10);
                            if (arrayList.size() > size2) {
                                break;
                            }
                        } else {
                            int Z03 = Z0(x(y14));
                            C0154x0 k = this.f896X.k(Z03);
                            if (k != null) {
                                int i18 = k.f1468a;
                                if (c12 == 1) {
                                    if (i18 == i16 && Z03 > Z02) {
                                        x2.addFocusables(arrayList, i7, i10);
                                        if (arrayList.size() > size2) {
                                            break;
                                        }
                                    }
                                } else if (c12 == 0) {
                                    if (i18 == i16 && Z03 < Z02) {
                                        x2.addFocusables(arrayList, i7, i10);
                                        if (arrayList.size() > size2) {
                                            break;
                                        }
                                    }
                                } else if (c12 == 3) {
                                    if (i18 != i16) {
                                        if (i18 < i16) {
                                            break;
                                        }
                                        x2.addFocusables(arrayList, i7, i10);
                                    }
                                } else if (c12 == 2 && i18 != i16) {
                                    if (i18 > i16) {
                                        break;
                                    }
                                    x2.addFocusables(arrayList, i7, i10);
                                }
                            }
                        }
                    }
                    y14 += i17;
                } else {
                    if (y14 < y13) {
                        break;
                    }
                    x2 = x(y14);
                    if (x2.getVisibility() == 0) {
                        if (t10 != null) {
                        }
                    }
                    y14 += i17;
                }
            }
        }
        return true;
    }

    public final int a1(View view) {
        J0 j02 = (J0) view.getLayoutParams();
        return androidx.recyclerview.widget.a.E(view) + ((ViewGroup.MarginLayoutParams) j02).topMargin + ((ViewGroup.MarginLayoutParams) j02).bottomMargin;
    }

    public final int b1(View view) {
        J0 j02 = (J0) view.getLayoutParams();
        return androidx.recyclerview.widget.a.F(view) + ((ViewGroup.MarginLayoutParams) j02).leftMargin + ((ViewGroup.MarginLayoutParams) j02).rightMargin;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if ((r9.f875B & 262144) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
    
        if ((r9.f875B & 262144) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
    
        if ((r9.f875B & 524288) == 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        if ((r9.f875B & 524288) == 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c1(int i7) {
        int i10 = this.f910s;
        int i11 = 2;
        if (i10 == 0) {
            if (i7 != 17) {
                if (i7 != 33) {
                    if (i7 != 66) {
                        if (i7 != 130) {
                            i11 = 17;
                        }
                        i11 = 3;
                    }
                }
            }
            return i11;
        }
        if (i10 == 1) {
            if (i7 != 17) {
                if (i7 == 33) {
                    return 0;
                }
                if (i7 != 66) {
                    if (i7 == 130) {
                        return 1;
                    }
                }
            }
        }
        return 17;
    }

    public final int d1(int i7) {
        int i10 = this.f886N;
        if (i10 != 0) {
            return i10;
        }
        int[] iArr = this.f887O;
        if (iArr == null) {
            return 0;
        }
        return iArr[i7];
    }

    public final int e1(int i7) {
        int i10 = 0;
        if ((this.f875B & 524288) != 0) {
            for (int i11 = this.f894V - 1; i11 > i7; i11--) {
                i10 += d1(i11) + this.f892T;
            }
            return i10;
        }
        int i12 = 0;
        while (i10 < i7) {
            i12 += d1(i10) + this.f892T;
            i10++;
        }
        return i12;
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean f() {
        return this.f910s == 0 || this.f894V > 1;
    }

    @Override // androidx.recyclerview.widget.a
    public final void f0(H2.Y y10, H2.e0 e0Var, z1.e eVar) {
        w1(y10, e0Var);
        int b2 = e0Var.b();
        int i7 = this.f875B;
        boolean z8 = (262144 & i7) != 0;
        if ((i7 & 2048) == 0 || (b2 > 1 && !m1(0))) {
            if (this.f910s == 0) {
                eVar.b(z8 ? z1.d.f28167p : z1.d.f28165n);
            } else {
                eVar.b(z1.d.f28164m);
            }
            eVar.m(true);
        }
        if ((this.f875B & 4096) == 0 || (b2 > 1 && !m1(b2 - 1))) {
            if (this.f910s == 0) {
                eVar.b(z8 ? z1.d.f28165n : z1.d.f28167p);
            } else {
                eVar.b(z1.d.f28166o);
            }
            eVar.m(true);
        }
        eVar.j(C2355c.g(Q(y10, e0Var), A(y10, e0Var), 0));
        o1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0143, code lost:
    
        if (r3 != null) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f1(View view, View view2, int[] iArr) {
        View view3;
        int i7;
        int d10;
        int left;
        int i10;
        int b2;
        int top;
        int i11;
        int left2;
        int i12;
        int i13;
        int i14 = this.f897Y;
        r8.o oVar = this.f898Z;
        if (i14 != 1 && i14 != 2) {
            v3 v3Var = (v3) oVar.f23859d;
            if (this.f910s == 0) {
                J0 j02 = (J0) view.getLayoutParams();
                j02.getClass();
                top = view.getLeft() + j02.f843e;
                i11 = j02.f847w;
            } else {
                J0 j03 = (J0) view.getLayoutParams();
                j03.getClass();
                top = view.getTop() + j03.f844f;
                i11 = j03.f848x;
            }
            int b10 = v3Var.b(top + i11);
            if (view2 != null && (i13 = i1(view, view2)) != 0) {
                int[] iArr2 = ((J0) view.getLayoutParams()).f849y;
                b10 += iArr2[i13] - iArr2[0];
            }
            if (this.f910s == 0) {
                J0 j04 = (J0) view.getLayoutParams();
                j04.getClass();
                left2 = view.getTop() + j04.f844f;
                i12 = j04.f848x;
            } else {
                J0 j05 = (J0) view.getLayoutParams();
                j05.getClass();
                left2 = view.getLeft() + j05.f843e;
                i12 = j05.f847w;
            }
            int b11 = ((v3) oVar.f23860e).b(left2 + i12);
            if (b10 == 0 && b11 == 0) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
            iArr[0] = b10;
            iArr[1] = b11;
            return true;
        }
        int Z02 = Z0(view);
        int g = this.f911t.g(view);
        int d11 = this.f911t.d(view);
        v3 v3Var2 = (v3) oVar.f23859d;
        int i15 = v3Var2.j;
        int i16 = (v3Var2.f1447i - i15) - v3Var2.k;
        C0154x0 k = this.f896X.k(Z02);
        int i17 = k == null ? -1 : k.f1468a;
        View view4 = null;
        if (g < i15) {
            if (this.f897Y == 2) {
                View view5 = view;
                while (true) {
                    G0 g02 = this.f896X;
                    if (!g02.m(g02.f826c ? Integer.MIN_VALUE : com.google.android.gms.common.api.f.API_PRIORITY_OTHER, true)) {
                        view3 = null;
                        view4 = view5;
                        break;
                    }
                    G0 g03 = this.f896X;
                    A4.h hVar = g03.j(g03.f829f, Z02)[i17];
                    View t5 = t(hVar.s(0));
                    if (d11 - this.f911t.g(t5) <= i16) {
                        view5 = t5;
                    } else if (hVar.u() > 2) {
                        view3 = null;
                        view4 = t(hVar.s(2));
                    } else {
                        view3 = null;
                        view4 = t5;
                    }
                }
            } else {
                view3 = null;
                view4 = view;
            }
        } else if (d11 > i16 + i15) {
            if (this.f897Y != 2) {
                view3 = view;
            }
            while (true) {
                G0 g04 = this.f896X;
                A4.h hVar2 = g04.j(Z02, g04.g)[i17];
                view3 = t(hVar2.s(hVar2.u() - 1));
                if (this.f911t.d(view3) - g > i16) {
                    view3 = null;
                    break;
                }
                if (!this.f896X.a()) {
                    break;
                }
            }
        } else {
            view3 = null;
        }
        if (view4 != null) {
            d10 = this.f911t.g(view4);
        } else {
            if (view3 == null) {
                i7 = 0;
                if (view4 == null) {
                    view = view4;
                } else if (view3 != null) {
                    view = view3;
                }
                if (this.f910s != 0) {
                    J0 j06 = (J0) view.getLayoutParams();
                    j06.getClass();
                    left = view.getTop() + j06.f844f;
                    i10 = j06.f848x;
                } else {
                    J0 j07 = (J0) view.getLayoutParams();
                    j07.getClass();
                    left = view.getLeft() + j07.f843e;
                    i10 = j07.f847w;
                }
                b2 = ((v3) oVar.f23860e).b(left + i10);
                if (i7 != 0 && b2 == 0) {
                    return false;
                }
                iArr[0] = i7;
                iArr[1] = b2;
                return true;
            }
            d10 = this.f911t.d(view3);
            i15 += i16;
        }
        i7 = d10 - i15;
        if (view4 == null) {
        }
        if (this.f910s != 0) {
        }
        b2 = ((v3) oVar.f23860e).b(left + i10);
        if (i7 != 0) {
        }
        iArr[0] = i7;
        iArr[1] = b2;
        return true;
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean g() {
        return this.f910s == 1 || this.f894V > 1;
    }

    @Override // androidx.recyclerview.widget.a
    public final void g0(H2.Y y10, H2.e0 e0Var, View view, z1.e eVar) {
        C0154x0 k;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (this.f896X == null || !(layoutParams instanceof J0)) {
            return;
        }
        int c10 = ((J0) layoutParams).f4615a.c();
        int i7 = -1;
        if (c10 >= 0 && (k = this.f896X.k(c10)) != null) {
            i7 = k.f1468a;
        }
        if (i7 < 0) {
            return;
        }
        int i10 = c10 / this.f896X.f828e;
        if (this.f910s == 0) {
            eVar.k(o7.o.m(false, i7, 1, i10, 1));
        } else {
            eVar.k(o7.o.m(false, i10, 1, i7, 1));
        }
    }

    public final int g1() {
        int i7 = (this.f875B & 524288) != 0 ? 0 : this.f894V - 1;
        return d1(i7) + e1(i7);
    }

    public final int h1() {
        int i7;
        int left;
        int right;
        if (this.f910s == 1) {
            i7 = -this.f13718o;
            if (y() <= 0 || (left = x(0).getTop()) >= 0) {
                return i7;
            }
        } else {
            if ((this.f875B & 262144) != 0) {
                int i10 = this.f13717n;
                return (y() <= 0 || (right = x(0).getRight()) <= i10) ? i10 : right;
            }
            i7 = -this.f13717n;
            if (y() <= 0 || (left = x(0).getLeft()) >= 0) {
                return i7;
            }
        }
        return i7 + left;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    @Override // androidx.recyclerview.widget.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View i0(View view, int i7) {
        View view2;
        View view3;
        if ((this.f875B & 32768) != 0) {
            return view;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        AbstractC0145v abstractC0145v = this.f909r;
        if (i7 == 2 || i7 == 1) {
            if (g()) {
                view2 = focusFinder.findNextFocus(abstractC0145v, view, i7 == 2 ? 130 : 33);
            } else {
                view2 = null;
            }
            if (f()) {
                view3 = focusFinder.findNextFocus(abstractC0145v, view, (J() == 1) ^ (i7 == 2) ? 66 : 17);
            } else {
                view3 = view2;
            }
        } else {
            view3 = focusFinder.findNextFocus(abstractC0145v, view, i7);
        }
        if (view3 != null) {
            return view3;
        }
        if (abstractC0145v.getDescendantFocusability() == 393216) {
            return abstractC0145v.getParent().focusSearch(view, i7);
        }
        int c12 = c1(i7);
        boolean z8 = abstractC0145v.getScrollState() != 0;
        if (c12 == 1) {
            if (z8 || (this.f875B & 4096) == 0) {
                view3 = view;
            }
            if ((this.f875B & 131072) != 0 && !l1()) {
                r1(true);
                view3 = view;
            }
            if (view3 == null) {
                return view3;
            }
            View focusSearch = abstractC0145v.getParent().focusSearch(view, i7);
            return focusSearch != null ? focusSearch : view != null ? view : abstractC0145v;
        }
        if (c12 == 0) {
            if (z8 || (this.f875B & 2048) == 0) {
                view3 = view;
            }
            if ((this.f875B & 131072) != 0 && !k1()) {
                r1(false);
                view3 = view;
            }
            if (view3 == null) {
            }
        } else if (c12 == 3) {
            if (view3 == null) {
            }
        } else if (view3 == null) {
        }
    }

    public final int i1(View view, View view2) {
        C0120o1 c0120o1;
        if (view != null && view2 != null && (c0120o1 = ((J0) view.getLayoutParams()).f850z) != null) {
            C0116n1[] c0116n1Arr = c0120o1.f1326a;
            if (c0116n1Arr.length > 1) {
                while (view2 != view) {
                    int id = view2.getId();
                    if (id != -1) {
                        for (int i7 = 1; i7 < c0116n1Arr.length; i7++) {
                            C0116n1 c0116n1 = c0116n1Arr[i7];
                            int i10 = c0116n1.f1300b;
                            if (i10 == -1) {
                                i10 = c0116n1.f1299a;
                            }
                            if (i10 == id) {
                                return i7;
                            }
                        }
                    }
                    view2 = (View) view2.getParent();
                }
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final void j(int i7, int i10, H2.e0 e0Var, C0305t c0305t) {
        try {
            w1(null, e0Var);
            if (this.f910s != 0) {
                i7 = i10;
            }
            if (y() != 0 && i7 != 0) {
                this.f896X.e(i7 < 0 ? -this.f901c0 : this.f900b0 + this.f901c0, i7, c0305t);
                o1();
            }
        } finally {
            o1();
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void j0(int i7, int i10) {
        G0 g02;
        int i11;
        int i12 = this.f879F;
        if (i12 != -1 && (g02 = this.f896X) != null && g02.f829f >= 0 && (i11 = this.f883J) != Integer.MIN_VALUE && i7 <= i12 + i11) {
            this.f883J = i11 + i10;
        }
        C2066t c2066t = (C2066t) this.f903e0.f387d;
        if (c2066t != null) {
            c2066t.evictAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View j1(int i7) {
        C0135s1 c0135s1;
        View d10 = this.f874A.d(i7);
        J0 j02 = (J0) d10.getLayoutParams();
        H2.i0 L = this.f909r.L(d10);
        Object b2 = L instanceof InterfaceC0150w0 ? ((InterfaceC0150w0) L).b() : null;
        if (b2 == null && (c0135s1 = this.f904f0) != null) {
            InterfaceC0150w0 interfaceC0150w0 = (InterfaceC0150w0) c0135s1.f1364h.get(L.f4712f);
            if (interfaceC0150w0 != null) {
                b2 = interfaceC0150w0.b();
            }
        }
        j02.f850z = (C0120o1) b2;
        return d10;
    }

    @Override // androidx.recyclerview.widget.a
    public final void k(int i7, C0305t c0305t) {
        int initialPrefetchItemCount = this.f909r.getInitialPrefetchItemCount();
        if (i7 == 0 || initialPrefetchItemCount == 0) {
            return;
        }
        int max = Math.max(0, Math.min(this.f879F - ((initialPrefetchItemCount - 1) / 2), i7 - initialPrefetchItemCount));
        for (int i10 = max; i10 < i7 && i10 < max + initialPrefetchItemCount; i10++) {
            c0305t.a(i10, 0);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void k0() {
        this.f883J = 0;
        C2066t c2066t = (C2066t) this.f903e0.f387d;
        if (c2066t != null) {
            c2066t.evictAll();
        }
    }

    public final boolean k1() {
        return I() == 0 || this.f909r.H(0) != null;
    }

    @Override // androidx.recyclerview.widget.a
    public final void l0(int i7, int i10) {
        int i11;
        int i12 = this.f879F;
        if (i12 != -1 && (i11 = this.f883J) != Integer.MIN_VALUE) {
            int i13 = i12 + i11;
            if (i7 <= i13 && i13 < i7 + 1) {
                this.f883J = (i10 - i7) + i11;
            } else if (i7 < i13 && i10 > i13 - 1) {
                this.f883J = i11 - 1;
            } else if (i7 > i13 && i10 < i13) {
                this.f883J = i11 + 1;
            }
        }
        C2066t c2066t = (C2066t) this.f903e0.f387d;
        if (c2066t != null) {
            c2066t.evictAll();
        }
    }

    public final boolean l1() {
        int I6 = I();
        return I6 == 0 || this.f909r.H(I6 - 1) != null;
    }

    @Override // androidx.recyclerview.widget.a
    public final void m0(int i7, int i10) {
        G0 g02;
        int i11;
        int i12;
        int i13 = this.f879F;
        if (i13 != -1 && (g02 = this.f896X) != null && g02.f829f >= 0 && (i11 = this.f883J) != Integer.MIN_VALUE && i7 <= (i12 = i13 + i11)) {
            if (i7 + i10 > i12) {
                this.f879F = (i7 - i12) + i11 + i13;
                this.f883J = Integer.MIN_VALUE;
            } else {
                this.f883J = i11 - i10;
            }
        }
        C2066t c2066t = (C2066t) this.f903e0.f387d;
        if (c2066t != null) {
            c2066t.evictAll();
        }
    }

    public final boolean m1(int i7) {
        AbstractC0145v abstractC0145v = this.f909r;
        H2.i0 H10 = abstractC0145v.H(i7);
        if (H10 == null) {
            return false;
        }
        View view = H10.f4707a;
        return view.getLeft() >= 0 && view.getRight() <= abstractC0145v.getWidth() && view.getTop() >= 0 && view.getBottom() <= abstractC0145v.getHeight();
    }

    @Override // androidx.recyclerview.widget.a
    public final void n0(int i7, int i10) {
        int i11 = i10 + i7;
        while (i7 < i11) {
            A4.h hVar = this.f903e0;
            C2066t c2066t = (C2066t) hVar.f387d;
            if (c2066t != null && c2066t.size() != 0) {
                ((C2066t) hVar.f387d).remove(Integer.toString(i7));
            }
            i7++;
        }
    }

    public final void n1(View view, int i7, int i10, int i11, int i12) {
        int d12;
        int i13;
        int a12 = this.f910s == 0 ? a1(view) : b1(view);
        int i14 = this.f886N;
        if (i14 > 0) {
            a12 = Math.min(a12, i14);
        }
        int i15 = this.f893U;
        int i16 = i15 & 112;
        int absoluteGravity = (this.f875B & 786432) != 0 ? Gravity.getAbsoluteGravity(i15 & 8388615, 1) : i15 & 7;
        int i17 = this.f910s;
        if ((i17 != 0 || i16 != 48) && (i17 != 1 || absoluteGravity != 3)) {
            if ((i17 == 0 && i16 == 80) || (i17 == 1 && absoluteGravity == 5)) {
                d12 = d1(i7) - a12;
            } else if ((i17 == 0 && i16 == 16) || (i17 == 1 && absoluteGravity == 1)) {
                d12 = (d1(i7) - a12) / 2;
            }
            i12 += d12;
        }
        if (this.f910s == 0) {
            i13 = a12 + i12;
        } else {
            int i18 = a12 + i12;
            int i19 = i12;
            i12 = i10;
            i10 = i19;
            i13 = i11;
            i11 = i18;
        }
        J0 j02 = (J0) view.getLayoutParams();
        androidx.recyclerview.widget.a.W(view, i10, i12, i11, i13);
        Rect rect = f872i0;
        super.C(rect, view);
        int i20 = i10 - rect.left;
        int i21 = i12 - rect.top;
        int i22 = rect.right - i11;
        int i23 = rect.bottom - i13;
        j02.f843e = i20;
        j02.f844f = i21;
        j02.f845u = i22;
        j02.f846v = i23;
        G1(view);
    }

    public final void o1() {
        int i7 = this.f912u - 1;
        this.f912u = i7;
        if (i7 == 0) {
            this.f874A = null;
            this.f913v = null;
            this.f914w = 0;
            this.f915x = 0;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 414
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // androidx.recyclerview.widget.a
    public final void p0(H2.Y r27, H2.e0 r28) {
        /*
            Method dump skipped, instructions count: 1551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A9.N0.p0(H2.Y, H2.e0):void");
    }

    public final void p1(View view) {
        int childMeasureSpec;
        int i7;
        J0 j02 = (J0) view.getLayoutParams();
        Rect rect = f872i0;
        e(rect, view);
        int i10 = ((ViewGroup.MarginLayoutParams) j02).leftMargin + ((ViewGroup.MarginLayoutParams) j02).rightMargin + rect.left + rect.right;
        int i11 = ((ViewGroup.MarginLayoutParams) j02).topMargin + ((ViewGroup.MarginLayoutParams) j02).bottomMargin + rect.top + rect.bottom;
        int makeMeasureSpec = this.f885M == -2 ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(this.f886N, 1073741824);
        if (this.f910s == 0) {
            childMeasureSpec = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), i10, ((ViewGroup.MarginLayoutParams) j02).width);
            i7 = ViewGroup.getChildMeasureSpec(makeMeasureSpec, i11, ((ViewGroup.MarginLayoutParams) j02).height);
        } else {
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), i11, ((ViewGroup.MarginLayoutParams) j02).height);
            childMeasureSpec = ViewGroup.getChildMeasureSpec(makeMeasureSpec, i10, ((ViewGroup.MarginLayoutParams) j02).width);
            i7 = childMeasureSpec2;
        }
        view.measure(childMeasureSpec, i7);
    }

    @Override // androidx.recyclerview.widget.a
    public final void q0(H2.e0 e0Var) {
    }

    public final void q1() {
        this.f896X.m((this.f875B & 262144) != 0 ? this.f900b0 + this.f901c0 + this.f915x : (-this.f901c0) - this.f915x, false);
    }

    @Override // androidx.recyclerview.widget.a
    public final void r0(H2.Y y10, H2.e0 e0Var, int i7, int i10) {
        int size;
        int size2;
        int mode;
        int L;
        int M3;
        int i11;
        w1(y10, e0Var);
        if (this.f910s == 0) {
            size2 = View.MeasureSpec.getSize(i7);
            size = View.MeasureSpec.getSize(i10);
            mode = View.MeasureSpec.getMode(i10);
            L = N();
            M3 = K();
        } else {
            size = View.MeasureSpec.getSize(i7);
            size2 = View.MeasureSpec.getSize(i10);
            mode = View.MeasureSpec.getMode(i7);
            L = L();
            M3 = M();
        }
        int i12 = M3 + L;
        this.f888P = size;
        int i13 = this.f885M;
        if (i13 == -2) {
            int i14 = this.f895W;
            if (i14 == 0) {
                i14 = 1;
            }
            this.f894V = i14;
            this.f886N = 0;
            int[] iArr = this.f887O;
            if (iArr == null || iArr.length != i14) {
                this.f887O = new int[i14];
            }
            if (this.f913v.g) {
                H1();
            }
            s1(true);
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(g1() + i12, this.f888P);
            } else if (mode == 0) {
                i11 = g1();
                size = i11 + i12;
            } else {
                if (mode != 1073741824) {
                    throw new IllegalStateException("wrong spec");
                }
                size = this.f888P;
            }
        } else {
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    if (i13 == 0) {
                        i13 = size - i12;
                    }
                    this.f886N = i13;
                    int i15 = this.f895W;
                    if (i15 == 0) {
                        i15 = 1;
                    }
                    this.f894V = i15;
                    i11 = ((i15 - 1) * this.f892T) + (i13 * i15);
                    size = i11 + i12;
                } else if (mode != 1073741824) {
                    throw new IllegalStateException("wrong spec");
                }
            }
            int i16 = this.f895W;
            if (i16 == 0 && i13 == 0) {
                this.f894V = 1;
                this.f886N = size - i12;
            } else if (i16 == 0) {
                this.f886N = i13;
                int i17 = this.f892T;
                this.f894V = (size + i17) / (i13 + i17);
            } else if (i13 == 0) {
                this.f894V = i16;
                this.f886N = ((size - i12) - ((i16 - 1) * this.f892T)) / i16;
            } else {
                this.f894V = i16;
                this.f886N = i13;
            }
            if (mode == Integer.MIN_VALUE) {
                int i18 = this.f886N;
                int i19 = this.f894V;
                int i20 = ((i19 - 1) * this.f892T) + (i18 * i19) + i12;
                if (i20 < size) {
                    size = i20;
                }
            }
        }
        if (this.f910s == 0) {
            M0(size2, size);
        } else {
            M0(size, size2);
        }
        o1();
    }

    public final void r1(boolean z8) {
        if (z8) {
            if (l1()) {
                return;
            }
        } else if (k1()) {
            return;
        }
        K0 k02 = this.f882I;
        if (k02 == null) {
            K0 k03 = new K0(this, z8 ? 1 : -1, this.f894V > 1);
            this.f883J = 0;
            U0(k03);
            return;
        }
        N0 n02 = k02.f858u;
        if (z8) {
            int i7 = k02.f857t;
            if (i7 < n02.f908q) {
                k02.f857t = i7 + 1;
                return;
            }
            return;
        }
        int i10 = k02.f857t;
        if (i10 > (-n02.f908q)) {
            k02.f857t = i10 - 1;
        }
    }

    public final boolean s1(boolean z8) {
        if (this.f886N != 0 || this.f887O == null) {
            return false;
        }
        G0 g02 = this.f896X;
        A4.h[] j = g02 == null ? null : g02.j(g02.f829f, g02.g);
        boolean z10 = false;
        int i7 = -1;
        for (int i10 = 0; i10 < this.f894V; i10++) {
            A4.h hVar = j == null ? null : j[i10];
            int u3 = hVar == null ? 0 : hVar.u();
            int i11 = -1;
            for (int i12 = 0; i12 < u3; i12 += 2) {
                int s3 = hVar.s(i12 + 1);
                for (int s10 = hVar.s(i12); s10 <= s3; s10++) {
                    View t5 = t(s10 - this.f914w);
                    if (t5 != null) {
                        if (z8) {
                            p1(t5);
                        }
                        int a12 = this.f910s == 0 ? a1(t5) : b1(t5);
                        if (a12 > i11) {
                            i11 = a12;
                        }
                    }
                }
            }
            int b2 = this.f913v.b();
            AbstractC0145v abstractC0145v = this.f909r;
            if (!abstractC0145v.f13627I && z8 && i11 < 0 && b2 > 0) {
                if (i7 < 0) {
                    int i13 = this.f879F;
                    if (i13 < 0) {
                        i13 = 0;
                    } else if (i13 >= b2) {
                        i13 = b2 - 1;
                    }
                    if (y() > 0) {
                        int d10 = abstractC0145v.L(x(0)).d();
                        int d11 = abstractC0145v.L(x(y() - 1)).d();
                        if (i13 >= d10 && i13 <= d11) {
                            i13 = i13 - d10 <= d11 - i13 ? d10 - 1 : d11 + 1;
                            if (i13 < 0 && d11 < b2 - 1) {
                                i13 = d11 + 1;
                            } else if (i13 >= b2 && d10 > 0) {
                                i13 = d10 - 1;
                            }
                        }
                    }
                    if (i13 >= 0 && i13 < b2) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                        View d12 = this.f874A.d(i13);
                        int[] iArr = this.f902d0;
                        if (d12 != null) {
                            J0 j02 = (J0) d12.getLayoutParams();
                            Rect rect = f872i0;
                            e(rect, d12);
                            d12.measure(ViewGroup.getChildMeasureSpec(makeMeasureSpec, M() + L() + ((ViewGroup.MarginLayoutParams) j02).leftMargin + ((ViewGroup.MarginLayoutParams) j02).rightMargin + rect.left + rect.right, ((ViewGroup.MarginLayoutParams) j02).width), ViewGroup.getChildMeasureSpec(makeMeasureSpec2, K() + N() + ((ViewGroup.MarginLayoutParams) j02).topMargin + ((ViewGroup.MarginLayoutParams) j02).bottomMargin + rect.top + rect.bottom, ((ViewGroup.MarginLayoutParams) j02).height));
                            iArr[0] = b1(d12);
                            iArr[1] = a1(d12);
                            this.f874A.i(d12);
                        }
                        i7 = this.f910s == 0 ? iArr[1] : iArr[0];
                    }
                }
                if (i7 >= 0) {
                    i11 = i7;
                }
            }
            if (i11 < 0) {
                i11 = 0;
            }
            int[] iArr2 = this.f887O;
            if (iArr2[i10] != i11) {
                iArr2[i10] = i11;
                z10 = true;
            }
        }
        return z10;
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean t0(RecyclerView recyclerView, View view, View view2) {
        if ((this.f875B & 32768) == 0 && Z0(view) != -1 && (this.f875B & 35) == 0) {
            B1(view, view2, true, 0, 0);
        }
        return true;
    }

    public final int t1(int i7, boolean z8) {
        C0154x0 k;
        G0 g02 = this.f896X;
        if (g02 == null) {
            return i7;
        }
        int i10 = this.f879F;
        int i11 = (i10 == -1 || (k = g02.k(i10)) == null) ? -1 : k.f1468a;
        int y10 = y();
        View view = null;
        for (int i12 = 0; i12 < y10 && i7 != 0; i12++) {
            int i13 = i7 > 0 ? i12 : (y10 - 1) - i12;
            View x2 = x(i13);
            if (x2.getVisibility() == 0 && (!S() || x2.hasFocusable())) {
                int Z02 = Z0(x(i13));
                C0154x0 k7 = this.f896X.k(Z02);
                int i14 = k7 == null ? -1 : k7.f1468a;
                if (i11 == -1) {
                    i10 = Z02;
                    view = x2;
                    i11 = i14;
                } else if (i14 == i11 && ((i7 > 0 && Z02 > i10) || (i7 < 0 && Z02 < i10))) {
                    i7 = i7 > 0 ? i7 - 1 : i7 + 1;
                    i10 = Z02;
                    view = x2;
                }
            }
        }
        if (view != null) {
            if (z8) {
                if (S()) {
                    this.f875B |= 32;
                    view.requestFocus();
                    this.f875B &= -33;
                }
                this.f879F = i10;
                this.f880G = 0;
            } else {
                A1(view, true);
            }
        }
        return i7;
    }

    @Override // androidx.recyclerview.widget.a
    public final H2.T u() {
        return new H2.T(-2, -2);
    }

    @Override // androidx.recyclerview.widget.a
    public final void u0(Parcelable parcelable) {
        if (parcelable instanceof M0) {
            M0 m02 = (M0) parcelable;
            this.f879F = m02.f870a;
            this.f883J = 0;
            Bundle bundle = m02.f871b;
            A4.h hVar = this.f903e0;
            C2066t c2066t = (C2066t) hVar.f387d;
            if (c2066t != null && bundle != null) {
                c2066t.evictAll();
                for (String str : bundle.keySet()) {
                    ((C2066t) hVar.f387d).put(str, bundle.getSparseParcelableArray(str));
                }
            }
            this.f875B |= 256;
            F0();
        }
    }

    public final void u1() {
        int i7 = this.f875B;
        if ((65600 & i7) == 65536) {
            G0 g02 = this.f896X;
            int i10 = this.f879F;
            int i11 = (i7 & 262144) != 0 ? -this.f901c0 : this.f900b0 + this.f901c0;
            while (true) {
                int i12 = g02.g;
                if (i12 < g02.f829f || i12 <= i10) {
                    break;
                }
                if (!g02.f826c) {
                    if (g02.f825b.i(i12) < i11) {
                        break;
                    }
                    g02.f825b.m(g02.g);
                    g02.g--;
                } else {
                    if (g02.f825b.i(i12) > i11) {
                        break;
                    }
                    g02.f825b.m(g02.g);
                    g02.g--;
                }
            }
            if (g02.g < g02.f829f) {
                g02.g = -1;
                g02.f829f = -1;
            }
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final H2.T v(Context context, AttributeSet attributeSet) {
        return new H2.T(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, A9.M0, java.lang.Object] */
    @Override // androidx.recyclerview.widget.a
    public final Parcelable v0() {
        Bundle bundle;
        ?? obj = new Object();
        obj.f871b = Bundle.EMPTY;
        obj.f870a = this.f879F;
        A4.h hVar = this.f903e0;
        C2066t c2066t = (C2066t) hVar.f387d;
        if (c2066t == null || c2066t.size() == 0) {
            bundle = null;
        } else {
            Map<Object, Object> snapshot = ((C2066t) hVar.f387d).snapshot();
            bundle = new Bundle();
            for (Map.Entry<Object, Object> entry : snapshot.entrySet()) {
                bundle.putSparseParcelableArray((String) entry.getKey(), (SparseArray) entry.getValue());
            }
        }
        int y10 = y();
        for (int i7 = 0; i7 < y10; i7++) {
            View x2 = x(i7);
            int Z02 = Z0(x2);
            if (Z02 != -1 && hVar.f385b != 0) {
                String num = Integer.toString(Z02);
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                x2.saveHierarchyState(sparseArray);
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putSparseParcelableArray(num, sparseArray);
            }
        }
        obj.f871b = bundle;
        return obj;
    }

    public final void v1() {
        int i7 = this.f875B;
        if ((65600 & i7) == 65536) {
            G0 g02 = this.f896X;
            int i10 = this.f879F;
            int i11 = (i7 & 262144) != 0 ? this.f900b0 + this.f901c0 : -this.f901c0;
            while (true) {
                int i12 = g02.g;
                int i13 = g02.f829f;
                if (i12 < i13 || i13 >= i10) {
                    break;
                }
                int j = g02.f825b.j(i13);
                if (!g02.f826c) {
                    if (g02.f825b.i(g02.f829f) + j > i11) {
                        break;
                    }
                    g02.f825b.m(g02.f829f);
                    g02.f829f++;
                } else {
                    if (g02.f825b.i(g02.f829f) - j < i11) {
                        break;
                    }
                    g02.f825b.m(g02.f829f);
                    g02.f829f++;
                }
            }
            if (g02.g < g02.f829f) {
                g02.g = -1;
                g02.f829f = -1;
            }
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final H2.T w(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof J0 ? new H2.T((H2.T) layoutParams) : layoutParams instanceof H2.T ? new H2.T((H2.T) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new H2.T((ViewGroup.MarginLayoutParams) layoutParams) : new H2.T(layoutParams);
    }

    public final void w1(H2.Y y10, H2.e0 e0Var) {
        int i7 = this.f912u;
        if (i7 == 0) {
            this.f874A = y10;
            this.f913v = e0Var;
            this.f914w = 0;
            this.f915x = 0;
        }
        this.f912u = i7 + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r7 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
    
        r6 = 4096;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0031, code lost:
    
        if (r7 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0044, code lost:
    
        if (r6 == z1.d.f28166o.a()) goto L23;
     */
    @Override // androidx.recyclerview.widget.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean x0(int i7, H2.Y y10, H2.e0 e0Var) {
        boolean z8;
        if ((this.f875B & 131072) != 0) {
            w1(y10, e0Var);
            boolean z10 = (this.f875B & 262144) != 0;
            if (this.f910s == 0) {
                if (i7 != z1.d.f28165n.a()) {
                    if (i7 == z1.d.f28167p.a()) {
                    }
                }
                int i10 = this.f879F;
                z8 = i10 != 0 && i7 == 8192;
                boolean z11 = i10 != e0Var.b() - 1 && i7 == 4096;
                if (!z8 || z11) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain(4096);
                    AbstractC0145v abstractC0145v = this.f909r;
                    abstractC0145v.onInitializeAccessibilityEvent(obtain);
                    abstractC0145v.requestSendAccessibilityEvent(abstractC0145v, obtain);
                } else if (i7 == 4096) {
                    r1(true);
                    t1(1, false);
                } else if (i7 == 8192) {
                    r1(false);
                    t1(-1, false);
                }
                o1();
            } else {
                if (i7 != z1.d.f28164m.a()) {
                }
                i7 = 8192;
                int i102 = this.f879F;
                if (i102 != 0) {
                }
                if (i102 != e0Var.b() - 1) {
                }
                if (z8) {
                }
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain(4096);
                AbstractC0145v abstractC0145v2 = this.f909r;
                abstractC0145v2.onInitializeAccessibilityEvent(obtain2);
                abstractC0145v2.requestSendAccessibilityEvent(abstractC0145v2, obtain2);
                o1();
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r7 <= r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r7 >= r0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int x1(int i7) {
        int i10;
        int i11 = this.f875B;
        if ((i11 & 64) == 0 && (i11 & 3) != 1) {
            r8.o oVar = this.f898Z;
            if (i7 > 0) {
                v3 v3Var = (v3) oVar.f23859d;
                if (v3Var.f1440a != Integer.MAX_VALUE) {
                    i10 = v3Var.f1442c;
                }
            } else if (i7 < 0) {
                v3 v3Var2 = (v3) oVar.f23859d;
                if (v3Var2.f1441b != Integer.MIN_VALUE) {
                    i10 = v3Var2.f1443d;
                }
            }
        }
        if (i7 == 0) {
            return 0;
        }
        int i12 = -i7;
        int y10 = y();
        if (this.f910s == 1) {
            for (int i13 = 0; i13 < y10; i13++) {
                x(i13).offsetTopAndBottom(i12);
            }
        } else {
            for (int i14 = 0; i14 < y10; i14++) {
                x(i14).offsetLeftAndRight(i12);
            }
        }
        if ((this.f875B & 3) == 1) {
            J1();
            return i7;
        }
        int y11 = y();
        if ((this.f875B & 262144) == 0 ? i7 >= 0 : i7 <= 0) {
            W0();
        } else {
            q1();
        }
        boolean z8 = y() > y11;
        int y12 = y();
        if ((262144 & this.f875B) == 0 ? i7 >= 0 : i7 <= 0) {
            v1();
        } else {
            u1();
        }
        if (z8 | (y() < y12)) {
            I1();
        }
        this.f909r.invalidate();
        J1();
        return i7;
    }

    public final int y1(int i7) {
        int i10 = 0;
        if (i7 == 0) {
            return 0;
        }
        int i11 = -i7;
        int y10 = y();
        if (this.f910s == 0) {
            while (i10 < y10) {
                x(i10).offsetTopAndBottom(i11);
                i10++;
            }
        } else {
            while (i10 < y10) {
                x(i10).offsetLeftAndRight(i11);
                i10++;
            }
        }
        this.L += i7;
        K1();
        this.f909r.invalidate();
        return i7;
    }

    @Override // androidx.recyclerview.widget.a
    public final void z0(H2.Y y10) {
        for (int y11 = y() - 1; y11 >= 0; y11--) {
            C0(y11, y10);
        }
    }

    public final void z1(boolean z8, int i7, int i10) {
        View t5 = t(i7);
        boolean V7 = V();
        AbstractC0145v abstractC0145v = this.f909r;
        if (!V7 && !abstractC0145v.isLayoutRequested() && t5 != null && Z0(t5) == i7) {
            this.f875B |= 32;
            A1(t5, z8);
            this.f875B &= -33;
            return;
        }
        int i11 = this.f875B;
        if ((i11 & 512) == 0 || (i11 & 64) != 0) {
            this.f879F = i7;
            this.f880G = i10;
            this.f883J = Integer.MIN_VALUE;
            return;
        }
        if (z8 && !abstractC0145v.isLayoutRequested()) {
            this.f879F = i7;
            this.f880G = i10;
            this.f883J = Integer.MIN_VALUE;
            if (this.f896X == null) {
                Log.w("GridLayoutManager:" + abstractC0145v.getId(), "setSelectionSmooth should not be called before first layout pass");
                return;
            }
            H0 h02 = new H0(this);
            h02.f4572a = i7;
            U0(h02);
            int i12 = h02.f4572a;
            if (i12 != this.f879F) {
                this.f879F = i12;
                this.f880G = 0;
                return;
            }
            return;
        }
        if (V7) {
            I0 i02 = this.f881H;
            if (i02 != null) {
                i02.f837q = true;
            }
            abstractC0145v.q0();
        }
        if (!abstractC0145v.isLayoutRequested() && t5 != null && Z0(t5) == i7) {
            this.f875B |= 32;
            A1(t5, z8);
            this.f875B &= -33;
        } else {
            this.f879F = i7;
            this.f880G = i10;
            this.f883J = Integer.MIN_VALUE;
            this.f875B |= 256;
            F0();
        }
    }
}
