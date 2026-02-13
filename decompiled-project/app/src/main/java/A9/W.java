package A9;

import W1.C0558a;
import a2.AbstractC0708a;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.Transition;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.kt.apps.core.base.leanback.BrowseFrameLayout;
import com.kt.apps.core.base.leanback.NavDrawerView;
import com.kt.apps.media.xemtv.beta.R;
import i2.C1332t;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class W extends D {
    public static final String t1 = W.class.getCanonicalName() + ".title";

    /* renamed from: u1, reason: collision with root package name */
    public static final String f993u1 = W.class.getCanonicalName() + ".headersState";

    /* renamed from: M0, reason: collision with root package name */
    public Q f999M0;

    /* renamed from: N0, reason: collision with root package name */
    public W1.C f1000N0;

    /* renamed from: O0, reason: collision with root package name */
    public T f1001O0;

    /* renamed from: P0, reason: collision with root package name */
    public C0143u1 f1002P0;

    /* renamed from: Q0, reason: collision with root package name */
    public C0098j f1003Q0;

    /* renamed from: R0, reason: collision with root package name */
    public AbstractC0117n2 f1004R0;

    /* renamed from: T0, reason: collision with root package name */
    public BrowseFrameLayout f1006T0;

    /* renamed from: U0, reason: collision with root package name */
    public FrameLayout f1007U0;

    /* renamed from: W0, reason: collision with root package name */
    public String f1009W0;

    /* renamed from: X0, reason: collision with root package name */
    public NavDrawerView f1010X0;

    /* renamed from: a1, reason: collision with root package name */
    public int f1013a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f1014b1;

    /* renamed from: d1, reason: collision with root package name */
    public O1 f1016d1;

    /* renamed from: e1, reason: collision with root package name */
    public C1332t f1017e1;

    /* renamed from: g1, reason: collision with root package name */
    public float f1019g1;

    /* renamed from: h1, reason: collision with root package name */
    public boolean f1020h1;

    /* renamed from: i1, reason: collision with root package name */
    public Object f1021i1;

    /* renamed from: l1, reason: collision with root package name */
    public Scene f1024l1;

    /* renamed from: m1, reason: collision with root package name */
    public Scene f1025m1;

    /* renamed from: n1, reason: collision with root package name */
    public Scene f1026n1;

    /* renamed from: o1, reason: collision with root package name */
    public Transition f1027o1;
    public L p1;

    /* renamed from: q1, reason: collision with root package name */
    public View f1028q1;

    /* renamed from: H0, reason: collision with root package name */
    public final A f994H0 = new A(this);

    /* renamed from: I0, reason: collision with root package name */
    public final D9.a f995I0 = new D9.a("headerFragmentViewCreated", false);

    /* renamed from: J0, reason: collision with root package name */
    public final D9.a f996J0 = new D9.a("mainFragmentViewCreated", false);

    /* renamed from: K0, reason: collision with root package name */
    public final D9.a f997K0 = new D9.a("screenDataReady", false);

    /* renamed from: L0, reason: collision with root package name */
    public final T f998L0 = new T();

    /* renamed from: S0, reason: collision with root package name */
    public int f1005S0 = 1;

    /* renamed from: V0, reason: collision with root package name */
    public boolean f1008V0 = true;

    /* renamed from: Y0, reason: collision with root package name */
    public boolean f1011Y0 = true;

    /* renamed from: Z0, reason: collision with root package name */
    public boolean f1012Z0 = true;

    /* renamed from: c1, reason: collision with root package name */
    public final boolean f1015c1 = true;

    /* renamed from: f1, reason: collision with root package name */
    public int f1018f1 = -1;

    /* renamed from: j1, reason: collision with root package name */
    public boolean f1022j1 = true;

    /* renamed from: k1, reason: collision with root package name */
    public final V f1023k1 = new V(this);

    /* renamed from: r1, reason: collision with root package name */
    public final K f1029r1 = new K(this);

    /* renamed from: s1, reason: collision with root package name */
    public final K f1030s1 = new K(this);

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
    
        if (r0 == r2) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Type inference failed for: r0v9, types: [A9.N] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A0(C0098j c0098j, int i7) {
        Object obj;
        P p10;
        boolean z8 = false;
        if (this.f1012Z0) {
            if (c0098j != null) {
                ArrayList arrayList = c0098j.f1233c;
                if (arrayList.size() != 0) {
                    if (i7 < 0) {
                        i7 = 0;
                    } else if (i7 >= arrayList.size()) {
                        throw new IllegalArgumentException(String.format("Invalid position %d requested", Integer.valueOf(i7)));
                    }
                    obj = arrayList.get(i7);
                }
            }
            return false;
        }
        obj = null;
        boolean z10 = this.f1020h1;
        Object obj2 = this.f1021i1;
        boolean z11 = this.f1012Z0 && (obj instanceof P1);
        this.f1020h1 = z11;
        Object obj3 = z11 ? obj : null;
        this.f1021i1 = obj3;
        if (this.f1000N0 != null) {
            if (!z10) {
                z8 = z11;
            } else if (z11) {
                if (obj2 != null) {
                }
            }
            if (z8) {
                P p11 = T.f963b;
                T t5 = this.f998L0;
                if (obj == null) {
                    t5.getClass();
                    p10 = p11;
                } else {
                    p10 = (N) ((HashMap) t5.f964a).get(obj.getClass());
                }
                if (p10 != null || (obj instanceof P1)) {
                    p11 = p10;
                }
                this.f1000N0 = p11.a(obj);
                G0();
            }
            return z8;
        }
        z8 = true;
        if (z8) {
        }
        return z8;
    }

    public final boolean B0(int i7) {
        C0098j c0098j = this.f1003Q0;
        if (c0098j != null && c0098j.f1233c.size() != 0) {
            int i10 = 0;
            while (i10 < this.f1003Q0.f1233c.size()) {
                AbstractC0132r2 abstractC0132r2 = (AbstractC0132r2) this.f1003Q0.f1233c.get(i10);
                abstractC0132r2.getClass();
                if (!(abstractC0132r2 instanceof P1)) {
                    return i7 == i10;
                }
                i10++;
            }
        }
        return true;
    }

    public final void C0(int i7) {
        if (i7 == -1) {
            return;
        }
        this.f1010X0.h(i7);
        this.f1018f1 = i7;
        if (this.f999M0 == null) {
            return;
        }
        D0(i7);
        T t5 = this.f1001O0;
        if (t5 != null) {
            ((A2) t5.f964a).A0(i7, false);
        }
        N0();
    }

    public final void D0(int i7) {
        if (A0(this.f1003Q0, i7)) {
            if (!this.f1022j1) {
                z0();
            }
            this.f999M0.g((this.f1012Z0 && this.f1011Y0) ? false : true);
            H0();
        }
    }

    public final void E0(J1 j12) {
        this.f1003Q0 = (C0098j) j12;
        if (j12 == null) {
            this.f1004R0 = null;
        } else {
            AbstractC0117n2 abstractC0117n2 = j12.f852b;
            if (abstractC0117n2 == null) {
                throw new IllegalArgumentException("Adapter.getPresenterSelector() is null");
            }
            if (abstractC0117n2 != this.f1004R0) {
                this.f1004R0 = abstractC0117n2;
                AbstractC0113m2[] b2 = abstractC0117n2.b();
                C0108l1 c0108l1 = new C0108l1(0);
                c0108l1.f1470b = null;
                int length = b2.length;
                AbstractC0113m2[] abstractC0113m2Arr = new AbstractC0113m2[length + 1];
                System.arraycopy(abstractC0113m2Arr, 0, b2, 0, b2.length);
                abstractC0113m2Arr[length] = c0108l1;
                this.f1003Q0.d(new C0090h(abstractC0117n2, c0108l1, abstractC0113m2Arr));
            }
        }
        if (this.f10277U == null) {
            return;
        }
        M0();
    }

    public final void F0(int i7) {
        if (i7 < 1 || i7 > 3) {
            throw new IllegalArgumentException(h3.o.l(i7, "Invalid headers state: "));
        }
        Log.v("BrowseSupportFragment", "setHeadersState " + i7);
        if (i7 != this.f1005S0) {
            this.f1005S0 = i7;
            if (i7 == 1) {
                this.f1012Z0 = true;
                this.f1011Y0 = true;
                return;
            }
            if (i7 == 2) {
                this.f1012Z0 = true;
                this.f1011Y0 = false;
            } else if (i7 == 3) {
                this.f1012Z0 = false;
                this.f1011Y0 = false;
            } else {
                Log.w("BrowseSupportFragment", "Unknown headers state: " + i7);
            }
        }
    }

    public final void G0() {
        Q h10 = ((S) this.f1000N0).h();
        this.f999M0 = h10;
        h10.f937c = new O(this);
        if (this.f1020h1) {
            I0(null);
            return;
        }
        W1.C c10 = this.f1000N0;
        if (c10 instanceof A2) {
            A2 a22 = (A2) c10;
            if (a22.f758u0 == null) {
                a22.f758u0 = new T(a22);
            }
            I0(a22.f758u0);
        } else {
            I0(null);
        }
        this.f1020h1 = this.f1001O0 == null;
    }

    public final void H0() {
        int i7 = this.f1014b1;
        if (this.f1015c1 && this.f999M0.f935a && this.f1011Y0) {
            i7 = (int) ((i7 / this.f1019g1) + 0.5f);
        }
        this.f999M0.e(i7);
    }

    public final void I0(T t5) {
        T t10 = this.f1001O0;
        if (t5 == t10) {
            return;
        }
        if (t10 != null) {
            ((A2) t10.f964a).t0(null);
        }
        this.f1001O0 = t5;
        if (t5 != null) {
            ((A2) t5.f964a).y0(new U(this, t5));
            T t11 = this.f1001O0;
            ((A2) t11.f964a).x0(this.f1017e1);
        }
        M0();
    }

    public final void J0(boolean z8) {
        View searchAffordanceView = ((p3) this.f802p0).f1345a.getSearchAffordanceView();
        if (searchAffordanceView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) searchAffordanceView.getLayoutParams();
            marginLayoutParams.setMarginStart(z8 ? 0 : -this.f1013a1);
            searchAffordanceView.setLayoutParams(marginLayoutParams);
        }
    }

    public final void K0(boolean z8) {
        Log.v("BrowseSupportFragment", "showHeaders " + z8);
        NavDrawerView navDrawerView = this.f1010X0;
        if (navDrawerView == null) {
            return;
        }
        if (z8) {
            navDrawerView.f();
        } else {
            navDrawerView.d();
        }
        this.f999M0.g(!z8);
        H0();
    }

    public final void L0(boolean z8) {
        C0098j c0098j;
        if (this.f10265H.f10349J || (c0098j = this.f1003Q0) == null || c0098j.f1233c.size() == 0) {
            return;
        }
        this.f1011Y0 = z8;
        this.f999M0.c();
        this.f999M0.d();
        J j = new J(0, this, z8);
        if (!z8) {
            j.run();
            return;
        }
        Q q10 = this.f999M0;
        View view = this.f10277U;
        M m10 = new M(this, j, q10, view);
        view.getViewTreeObserver().addOnPreDrawListener(m10);
        q10.g(false);
        view.invalidate();
        m10.f867c = 0;
    }

    public final void M0() {
        C0143u1 c0143u1 = this.f1002P0;
        if (c0143u1 != null) {
            c0143u1.f1406c.f851a.unregisterObserver(c0143u1.f1408e);
            this.f1002P0 = null;
        }
        if (this.f1001O0 != null) {
            C0098j c0098j = this.f1003Q0;
            C0143u1 c0143u12 = c0098j != null ? new C0143u1(c0098j) : null;
            this.f1002P0 = c0143u12;
            ((A2) this.f1001O0.f964a).t0(c0143u12);
        }
    }

    public final void N0() {
        Q q10;
        Q q11;
        if (!this.f1011Y0) {
            if ((!this.f1020h1 || (q11 = this.f999M0) == null) ? B0(this.f1018f1) : q11.f937c.f920a) {
                q0(6);
                return;
            } else {
                r0(false);
                return;
            }
        }
        boolean B02 = (!this.f1020h1 || (q10 = this.f999M0) == null) ? B0(this.f1018f1) : q10.f937c.f920a;
        int i7 = this.f1018f1;
        C0098j c0098j = this.f1003Q0;
        boolean z8 = true;
        if (c0098j != null && c0098j.f1233c.size() != 0) {
            for (int i10 = 0; i10 < this.f1003Q0.f1233c.size(); i10++) {
                AbstractC0132r2 abstractC0132r2 = (AbstractC0132r2) this.f1003Q0.f1233c.get(i10);
                abstractC0132r2.getClass();
                boolean z10 = abstractC0132r2 instanceof P1;
                if (!z10 || z10) {
                    if (i7 != i10) {
                        z8 = false;
                    }
                }
            }
        }
        int i11 = B02 ? 2 : 0;
        if (z8) {
            i11 |= 4;
        }
        if (i11 != 0) {
            q0(i11);
        } else {
            r0(false);
        }
    }

    @Override // A9.D, W1.C
    public void S(Bundle bundle) {
        super.S(bundle);
        TypedArray obtainStyledAttributes = C().obtainStyledAttributes(AbstractC0708a.f12484b);
        this.f1013a1 = (int) obtainStyledAttributes.getDimension(6, r0.getResources().getDimensionPixelSize(R.dimen.lb_browse_rows_margin_start));
        this.f1014b1 = (int) obtainStyledAttributes.getDimension(7, r0.getResources().getDimensionPixelSize(R.dimen.lb_browse_rows_margin_top));
        obtainStyledAttributes.recycle();
        Bundle bundle2 = this.f10300u;
        if (bundle2 != null) {
            String str = t1;
            if (bundle2.containsKey(str)) {
                String string = bundle2.getString(str);
                this.f800n0 = string;
                r3 r3Var = this.f802p0;
                if (r3Var != null) {
                    ((p3) r3Var).f1345a.setTitle(string);
                }
            }
            String str2 = f993u1;
            if (bundle2.containsKey(str2)) {
                F0(bundle2.getInt(str2));
            }
        }
        if (this.f1012Z0) {
            if (this.f1008V0) {
                this.f1009W0 = "lbHeadersBackStack_" + this;
                L l10 = new L(this);
                this.p1 = l10;
                this.f10265H.f10365n.add(l10);
                L l11 = this.p1;
                W w10 = l11.f864c;
                if (bundle != null) {
                    int i7 = bundle.getInt("headerStackIndex", -1);
                    l11.f863b = i7;
                    w10.f1011Y0 = i7 == -1;
                } else if (!w10.f1011Y0) {
                    W1.U u3 = w10.f10265H;
                    u3.getClass();
                    C0558a c0558a = new C0558a(u3);
                    c0558a.c(w10.f1009W0);
                    c0558a.e(false);
                }
            } else if (bundle != null) {
                this.f1011Y0 = bundle.getBoolean("headerShow");
            }
        }
        this.f1019g1 = F().getFraction(R.fraction.lb_browse_rows_scale, 1, 1);
    }

    @Override // W1.C
    public View T(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (B().D(R.id.scale_frame) == null) {
            A0(this.f1003Q0, this.f1018f1);
            W1.U B10 = B();
            B10.getClass();
            C0558a c0558a = new C0558a(B10);
            W1.C c10 = this.f1000N0;
            if (c10 != null) {
                c0558a.j(R.id.scale_frame, c10, null);
            } else {
                Q q10 = new Q(null);
                this.f999M0 = q10;
                q10.f937c = new O(this);
            }
            c0558a.e(false);
        } else {
            this.f1000N0 = B().D(R.id.scale_frame);
            this.f1020h1 = bundle != null && bundle.getBoolean("isPageRow", false);
            this.f1018f1 = bundle != null ? bundle.getInt("currentSelectedPosition", 0) : 0;
            G0();
        }
        View inflate = layoutInflater.inflate(R.layout.base_lb_browse_fragment, viewGroup, false);
        this.f787G0.f14234b = (ViewGroup) inflate;
        this.f1006T0 = (BrowseFrameLayout) inflate.findViewById(R.id.browse_frame);
        this.f1010X0 = (NavDrawerView) inflate.findViewById(R.id.nav_drawer);
        this.f1006T0.setOnChildFocusListener(this.f1030s1);
        this.f1006T0.setOnFocusSearchListener(this.f1029r1);
        BrowseFrameLayout browseFrameLayout = this.f1006T0;
        View o02 = o0(layoutInflater, browseFrameLayout, bundle);
        if (o02 != null) {
            browseFrameLayout.addView(o02);
            p0(o02.findViewById(R.id.browse_title_group));
        } else {
            p0(null);
        }
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.scale_frame);
        this.f1007U0 = frameLayout;
        frameLayout.setPivotX(0.0f);
        this.f1007U0.setPivotY(this.f1014b1);
        final int i7 = 0;
        this.f1024l1 = E6.b.g(this.f1006T0, new Runnable(this) { // from class: A9.I

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ W f836b;

            {
                this.f836b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                W w10 = this.f836b;
                switch (i7) {
                    case 0:
                        String str = W.t1;
                        w10.K0(true);
                        return;
                    case 1:
                        String str2 = W.t1;
                        w10.K0(false);
                        return;
                    default:
                        w10.J0(true);
                        w10.f999M0.f(true);
                        return;
                }
            }
        });
        final int i10 = 1;
        this.f1025m1 = E6.b.g(this.f1006T0, new Runnable(this) { // from class: A9.I

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ W f836b;

            {
                this.f836b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                W w10 = this.f836b;
                switch (i10) {
                    case 0:
                        String str = W.t1;
                        w10.K0(true);
                        return;
                    case 1:
                        String str2 = W.t1;
                        w10.K0(false);
                        return;
                    default:
                        w10.J0(true);
                        w10.f999M0.f(true);
                        return;
                }
            }
        });
        final int i11 = 2;
        this.f1026n1 = E6.b.g(this.f1006T0, new Runnable(this) { // from class: A9.I

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ W f836b;

            {
                this.f836b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                W w10 = this.f836b;
                switch (i11) {
                    case 0:
                        String str = W.t1;
                        w10.K0(true);
                        return;
                    case 1:
                        String str2 = W.t1;
                        w10.K0(false);
                        return;
                    default:
                        w10.J0(true);
                        w10.f999M0.f(true);
                        return;
                }
            }
        });
        this.f1028q1 = inflate.findViewById(R.id.dim_background);
        this.f1010X0.setOnAnimatedFraction(new A1.d(this, 3));
        return inflate;
    }

    @Override // W1.C
    public void U() {
        L l10 = this.p1;
        if (l10 != null) {
            this.f10265H.f10365n.remove(l10);
        }
        this.f10275S = true;
    }

    @Override // A9.E, W1.C
    public void V() {
        I0(null);
        this.f1010X0 = null;
        this.f1021i1 = null;
        this.f999M0 = null;
        this.f1000N0 = null;
        this.f1006T0 = null;
        this.f1007U0 = null;
        this.f1026n1 = null;
        this.f1024l1 = null;
        this.f1025m1 = null;
        super.V();
    }

    @Override // A9.E, W1.C
    public final void a0(Bundle bundle) {
        bundle.putBoolean("titleShow", this.f799m0);
        bundle.putInt("currentSelectedPosition", this.f1018f1);
        bundle.putBoolean("isPageRow", this.f1020h1);
        L l10 = this.p1;
        if (l10 != null) {
            bundle.putInt("headerStackIndex", l10.f863b);
        } else {
            bundle.putBoolean("headerShow", this.f1011Y0);
        }
    }

    @Override // A9.E, W1.C
    public final void b0() {
        View view;
        super.b0();
        H0();
        W1.C c10 = this.f1000N0;
        if (c10 != null && (view = c10.f10277U) != null) {
            view.requestFocus();
        }
        this.f785E0.g(this.f995I0);
        this.f1022j1 = false;
        z0();
        V v10 = this.f1023k1;
        if (v10.f975b != -1) {
            v10.f976c.f1006T0.post(v10);
        }
    }

    @Override // W1.C
    public final void c0() {
        this.f1022j1 = true;
        V v10 = this.f1023k1;
        v10.f976c.f1006T0.removeCallbacks(v10);
        this.f10275S = true;
    }

    @Override // A9.D
    public final Object s0() {
        return E6.b.u(C(), R.transition.lb_browse_entrance_transition);
    }

    @Override // A9.D
    public final void t0() {
        super.t0();
        this.f785E0.a(this.f994H0);
    }

    @Override // A9.D
    public final void u0() {
        super.u0();
        this.f785E0.getClass();
        A a9 = this.f790t0;
        D9.d.d(a9, this.f994H0, this.f995I0);
        D9.d.d(a9, this.f791u0, this.f996J0);
        D9.d.d(a9, this.f792v0, this.f997K0);
    }

    @Override // A9.D
    public final void v0() {
        Q q10 = this.f999M0;
        if (q10 != null) {
            q10.b();
        }
    }

    @Override // A9.D
    public final void w0() {
        this.f999M0.f(false);
        this.f999M0.c();
    }

    @Override // A9.D
    public final void x0() {
        this.f999M0.d();
    }

    @Override // A9.D
    public final void y0(Object obj) {
        E6.b.z(this.f1026n1, obj);
    }

    public final void z0() {
        W1.U B10 = B();
        if (B10.D(R.id.scale_frame) != this.f1000N0) {
            C0558a c0558a = new C0558a(B10);
            c0558a.f10410d = R.anim.fade_in;
            c0558a.f10411e = R.anim.fade_out;
            c0558a.f10412f = R.anim.fade_in;
            c0558a.g = R.anim.fade_out;
            c0558a.j(R.id.scale_frame, this.f1000N0, null);
            c0558a.e(false);
        }
    }
}
