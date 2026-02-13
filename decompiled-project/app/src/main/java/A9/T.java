package A9;

import android.graphics.Rect;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import java.util.HashMap;
import u.C2066t;

/* loaded from: classes2.dex */
public final class T implements H2.C, Y, W0, InterfaceC0064a1, InterfaceC0137t, N1, I2 {

    /* renamed from: b, reason: collision with root package name */
    public static final P f963b = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f964a;

    public T() {
        HashMap hashMap = new HashMap();
        this.f964a = hashMap;
        hashMap.put(C0139t1.class, f963b);
    }

    public T(A2 a22) {
        if (a22 == null) {
            throw new IllegalArgumentException("Fragment can't be null");
        }
        this.f964a = a22;
    }

    public /* synthetic */ T(Object obj) {
        this.f964a = obj;
    }

    @Override // A9.InterfaceC0137t
    public boolean a(KeyEvent keyEvent) {
        C0147v1 c0147v1 = (C0147v1) this.f964a;
        View.OnKeyListener onKeyListener = c0147v1.f1465l;
        return onKeyListener != null && onKeyListener.onKey(c0147v1.f1271a, keyEvent.getKeyCode(), keyEvent);
    }

    @Override // A9.InterfaceC0149w
    public void b(C0109l2 c0109l2, Object obj, C0152w2 c0152w2, Object obj2) {
        if (obj instanceof AbstractC0074d) {
            ((C9.g) ((C9.c) this.f964a)).d((AbstractC0074d) obj, null);
        }
    }

    @Override // H2.C
    public void c(Object obj, int i7, int i10) {
        ((C0098j) this.f964a).f851a.f(obj, i7, i10);
    }

    @Override // H2.C
    public void d(int i7, int i10) {
        ((C0098j) this.f964a).f851a.i(i7, i10);
    }

    @Override // H2.C
    public void e(int i7, int i10) {
        ((C0098j) this.f964a).f851a.c(i7, i10);
    }

    public void f(Object obj, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        K0 k02;
        int i15;
        View view = (View) obj;
        N0 n02 = (N0) this.f964a;
        if (i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE) {
            boolean z8 = n02.f896X.f826c;
            r8.o oVar = n02.f898Z;
            if (z8) {
                v3 v3Var = (v3) oVar.f23859d;
                i12 = v3Var.f1447i - v3Var.k;
            } else {
                i12 = ((v3) oVar.f23859d).j;
            }
        }
        if (n02.f896X.f826c) {
            i13 = i12 - i10;
            i14 = i12;
        } else {
            i14 = i10 + i12;
            i13 = i12;
        }
        int e12 = (n02.e1(i11) + ((v3) n02.f898Z.f23860e).j) - n02.L;
        A4.h hVar = n02.f903e0;
        if (((C2066t) hVar.f387d) != null) {
            SparseArray<Parcelable> sparseArray = (SparseArray) ((C2066t) hVar.f387d).remove(Integer.toString(i7));
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
            }
        }
        ((N0) this.f964a).n1(view, i11, i13, i14, e12);
        if (!n02.f913v.g) {
            n02.J1();
        }
        if ((n02.f875B & 3) != 1 && (k02 = n02.f882I) != null) {
            boolean z10 = k02.f856s;
            N0 n03 = k02.f858u;
            if (z10 && (i15 = k02.f857t) != 0) {
                k02.f857t = n03.t1(i15, true);
            }
            int i16 = k02.f857t;
            if (i16 == 0 || ((i16 > 0 && n03.l1()) || (k02.f857t < 0 && n03.k1()))) {
                k02.f4572a = n03.f879F;
                k02.l();
            }
        }
        if (n02.f878E != null) {
            n02.f909r.L(view);
            n02.f878E.a(i7);
        }
    }

    public int g(int i7, boolean z8, Object[] objArr, boolean z10) {
        int i10;
        View h10;
        N0 n02 = (N0) this.f964a;
        View j12 = n02.j1(i7 - n02.f914w);
        if (!((J0) j12.getLayoutParams()).f4615a.k()) {
            if (z10) {
                if (z8) {
                    n02.c(j12, -1, true);
                } else {
                    n02.c(j12, 0, true);
                }
            } else if (z8) {
                n02.b(j12);
            } else {
                n02.c(j12, 0, false);
            }
            int i11 = n02.f884K;
            if (i11 != -1) {
                j12.setVisibility(i11);
            }
            K0 k02 = n02.f882I;
            if (k02 != null && !k02.f856s && (i10 = k02.f857t) != 0) {
                N0 n03 = k02.f858u;
                int i12 = i10 > 0 ? n03.f879F + n03.f894V : n03.f879F - n03.f894V;
                View view = null;
                while (k02.f857t != 0 && (h10 = k02.h(i12)) != null) {
                    n03.getClass();
                    if (h10.getVisibility() == 0 && (!n03.S() || h10.hasFocusable())) {
                        n03.f879F = i12;
                        n03.f880G = 0;
                        int i13 = k02.f857t;
                        if (i13 > 0) {
                            k02.f857t = i13 - 1;
                        } else {
                            k02.f857t = i13 + 1;
                        }
                        view = h10;
                    }
                    i12 = k02.f857t > 0 ? i12 + n03.f894V : i12 - n03.f894V;
                }
                if (view != null && n03.S()) {
                    n03.f875B |= 32;
                    view.requestFocus();
                    n03.f875B &= -33;
                }
            }
            int i14 = n02.i1(j12, j12.findFocus());
            int i15 = n02.f875B;
            if ((i15 & 3) != 1) {
                if (i7 == n02.f879F && i14 == n02.f880G && n02.f882I == null) {
                    n02.X0();
                }
            } else if ((i15 & 4) == 0) {
                int i16 = i15 & 16;
                if (i16 == 0 && i7 == n02.f879F && i14 == n02.f880G) {
                    n02.X0();
                } else if (i16 != 0 && i7 >= n02.f879F && j12.hasFocusable()) {
                    n02.f879F = i7;
                    n02.f880G = i14;
                    n02.f875B &= -17;
                    n02.X0();
                }
            }
            n02.p1(j12);
        }
        objArr[0] = j12;
        return n02.f910s == 0 ? n02.b1(j12) : n02.a1(j12);
    }

    public int h() {
        N0 n02 = (N0) this.f964a;
        return n02.f913v.b() + n02.f914w;
    }

    public int i(int i7) {
        N0 n02 = (N0) this.f964a;
        View t5 = n02.t(i7 - n02.f914w);
        return (n02.f875B & 262144) != 0 ? n02.f911t.d(t5) : n02.f911t.g(t5);
    }

    public int j(int i7) {
        N0 n02 = (N0) this.f964a;
        View t5 = n02.t(i7 - n02.f914w);
        Rect rect = N0.f872i0;
        n02.C(rect, t5);
        return n02.f910s == 0 ? rect.width() : rect.height();
    }

    @Override // H2.C
    public void k(int i7, int i10) {
        ((C0098j) this.f964a).c(i7, i10);
    }

    public void l(int i7, String str) {
        ((y9.s) this.f964a).f27531b.s0(i7, str);
    }

    public void m(int i7) {
        N0 n02 = (N0) this.f964a;
        View t5 = n02.t(i7 - n02.f914w);
        if ((n02.f875B & 3) == 1) {
            n02.G0(n02.f874A, n02.f13707a.r(t5), t5);
        } else {
            n02.B0(t5, n02.f874A);
        }
    }
}
