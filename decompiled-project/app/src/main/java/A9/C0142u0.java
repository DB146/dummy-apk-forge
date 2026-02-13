package A9;

import W1.C0558a;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.Transition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.kt.apps.core.base.leanback.BrowseFrameLayout;
import com.kt.apps.core.base.leanback.VerticalGridView;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: A9.u0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0142u0 extends D {

    /* renamed from: M0, reason: collision with root package name */
    public final C0130r0 f1383M0;

    /* renamed from: N0, reason: collision with root package name */
    public final C0130r0 f1384N0;

    /* renamed from: W0, reason: collision with root package name */
    public BrowseFrameLayout f1393W0;

    /* renamed from: X0, reason: collision with root package name */
    public View f1394X0;

    /* renamed from: Y0, reason: collision with root package name */
    public C0119o0 f1395Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public W1.C f1396Z0;

    /* renamed from: a1, reason: collision with root package name */
    public C0115n0 f1397a1;

    /* renamed from: b1, reason: collision with root package name */
    public A2 f1398b1;

    /* renamed from: c1, reason: collision with root package name */
    public C0098j f1399c1;

    /* renamed from: d1, reason: collision with root package name */
    public int f1400d1;

    /* renamed from: e1, reason: collision with root package name */
    public A1.d f1401e1;

    /* renamed from: f1, reason: collision with root package name */
    public C0146v0 f1402f1;

    /* renamed from: h1, reason: collision with root package name */
    public Scene f1404h1;

    /* renamed from: H0, reason: collision with root package name */
    public final C0130r0 f1378H0 = new C0130r0(this, 0);

    /* renamed from: I0, reason: collision with root package name */
    public final D9.b f1379I0 = new D9.b("STATE_ENTER_TRANSIITON_INIT");

    /* renamed from: J0, reason: collision with root package name */
    public final C0130r0 f1380J0 = new C0130r0(this, 1);

    /* renamed from: K0, reason: collision with root package name */
    public final C0130r0 f1381K0 = new C0130r0(this, 2);

    /* renamed from: L0, reason: collision with root package name */
    public final D9.b f1382L0 = new D9.b("STATE_ENTER_TRANSIITON_COMPLETE", true, false);

    /* renamed from: O0, reason: collision with root package name */
    public final C0130r0 f1385O0 = new C0130r0(this, 5);

    /* renamed from: P0, reason: collision with root package name */
    public final D9.a f1386P0 = new D9.a("onStart", false);

    /* renamed from: Q0, reason: collision with root package name */
    public final D9.a f1387Q0 = new D9.a("EVT_NO_ENTER_TRANSITION", false);

    /* renamed from: R0, reason: collision with root package name */
    public final D9.a f1388R0 = new D9.a("onFirstRowLoaded", false);

    /* renamed from: S0, reason: collision with root package name */
    public final D9.a f1389S0 = new D9.a("onEnterTransitionDone", false);

    /* renamed from: T0, reason: collision with root package name */
    public final D9.a f1390T0 = new D9.a("switchToVideo", false);

    /* renamed from: U0, reason: collision with root package name */
    public final C0138t0 f1391U0 = new C0138t0(this, 0);

    /* renamed from: V0, reason: collision with root package name */
    public final C0138t0 f1392V0 = new C0138t0(this, 1);

    /* renamed from: g1, reason: collision with root package name */
    public boolean f1403g1 = false;

    /* renamed from: i1, reason: collision with root package name */
    public final C0123p0 f1405i1 = new C0123p0(this);

    public C0142u0() {
        boolean z8 = false;
        this.f1383M0 = new C0130r0(this, 3, z8);
        this.f1384N0 = new C0130r0(this, 4, z8);
    }

    public final void A0() {
        if (z0() != null) {
            N0 n02 = z0().f1419Y0;
            int i7 = n02.f875B;
            if ((i7 & 64) != 0) {
                return;
            }
            n02.f875B = i7 | 64;
            if (n02.y() == 0) {
                return;
            }
            int i10 = n02.f910s;
            AbstractC0145v abstractC0145v = n02.f909r;
            if (i10 == 1) {
                abstractC0145v.k0(0, n02.h1(), new AccelerateDecelerateInterpolator(), false);
            } else {
                abstractC0145v.k0(n02.h1(), 0, new AccelerateDecelerateInterpolator(), false);
            }
        }
    }

    @Override // A9.D, W1.C
    public void S(Bundle bundle) {
        super.S(bundle);
        this.f1400d1 = F().getDimensionPixelSize(R.dimen.lb_details_rows_align_top);
        W1.G A10 = A();
        D9.a aVar = this.f1387Q0;
        D9.d dVar = this.f785E0;
        if (A10 == null) {
            dVar.g(aVar);
            return;
        }
        if (A10.getWindow().getEnterTransition() == null) {
            dVar.g(aVar);
        }
        Transition returnTransition = A10.getWindow().getReturnTransition();
        if (returnTransition != null) {
            E6.b.c(returnTransition, this.f1392V0);
        }
    }

    @Override // W1.C
    public final View T(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        BrowseFrameLayout browseFrameLayout = (BrowseFrameLayout) layoutInflater.inflate(R.layout.lb_details_fragment, viewGroup, false);
        this.f1393W0 = browseFrameLayout;
        View findViewById = browseFrameLayout.findViewById(R.id.details_background_view);
        this.f1394X0 = findViewById;
        if (findViewById != null) {
            findViewById.setBackground(this.f1395Y0);
        }
        A2 a22 = (A2) B().D(R.id.details_rows_dock);
        this.f1398b1 = a22;
        if (a22 == null) {
            this.f1398b1 = new A2();
            W1.U B10 = B();
            B10.getClass();
            C0558a c0558a = new C0558a(B10);
            c0558a.j(R.id.details_rows_dock, this.f1398b1, null);
            c0558a.e(false);
        }
        BrowseFrameLayout browseFrameLayout2 = this.f1393W0;
        View o02 = o0(layoutInflater, browseFrameLayout2, bundle);
        if (o02 != null) {
            browseFrameLayout2.addView(o02);
            p0(o02.findViewById(R.id.browse_title_group));
        } else {
            p0(null);
        }
        this.f1398b1.t0(this.f1399c1);
        this.f1398b1.y0(this.f1405i1);
        this.f1398b1.x0(this.f1401e1);
        this.f1404h1 = E6.b.g(this.f1393W0, new RunnableC0102k(this, 2));
        this.f1393W0.setOnChildFocusListener(new C0123p0(this));
        this.f1393W0.setOnFocusSearchListener(new C0123p0(this));
        this.f1393W0.setOnDispatchKeyListener(new ViewOnKeyListenerC0127q0(this, 0));
        this.f1398b1.f748I0 = new C0134s0(0, this);
        return this.f1393W0;
    }

    @Override // A9.E, W1.C
    public void V() {
        C0115n0 c0115n0 = this.f1397a1;
        if (c0115n0 != null) {
            c0115n0.e(null);
        }
        this.f1393W0 = null;
        this.f1394X0 = null;
        this.f1398b1 = null;
        this.f1396Z0 = null;
        this.f1404h1 = null;
        super.V();
    }

    @Override // A9.E, W1.C
    public final void b0() {
        super.b0();
        VerticalGridView verticalGridView = this.f1398b1.f751n0;
        verticalGridView.setItemAlignmentOffset(-this.f1400d1);
        verticalGridView.setItemAlignmentOffsetPercent(-1.0f);
        verticalGridView.setWindowAlignmentOffset(0);
        verticalGridView.setWindowAlignmentOffsetPercent(-1.0f);
        verticalGridView.setWindowAlignment(0);
        this.f785E0.g(this.f1386P0);
        C0115n0 c0115n0 = this.f1397a1;
        if (c0115n0 != null) {
            c0115n0.e(this.f1398b1.f751n0);
        }
        if (this.f1403g1) {
            A0();
        } else {
            if (this.f10277U.hasFocus()) {
                return;
            }
            this.f1398b1.f751n0.requestFocus();
        }
    }

    @Override // W1.C
    public final void c0() {
        C0146v0 c0146v0 = this.f1402f1;
        if (c0146v0 != null) {
            c0146v0.getClass();
        }
        this.f10275S = true;
    }

    @Override // A9.D
    public final Object s0() {
        return E6.b.u(C(), R.transition.lb_details_enter_transition);
    }

    @Override // A9.D
    public final void t0() {
        super.t0();
        D9.d dVar = this.f785E0;
        dVar.a(this.f1378H0);
        dVar.a(this.f1385O0);
        dVar.a(this.f1380J0);
        dVar.a(this.f1379I0);
        dVar.a(this.f1383M0);
        dVar.a(this.f1381K0);
        dVar.a(this.f1384N0);
        dVar.a(this.f1382L0);
    }

    @Override // A9.D
    public final void u0() {
        super.u0();
        D9.b bVar = this.f788r0;
        D9.b bVar2 = this.f1379I0;
        this.f785E0.getClass();
        D9.d.d(bVar, bVar2, this.f795y0);
        D9.b bVar3 = this.f1382L0;
        D9.c cVar = new D9.c(bVar2, bVar3, this.f784D0);
        bVar3.a(cVar);
        bVar2.b(cVar);
        D9.d.d(bVar2, bVar3, this.f1387Q0);
        C0130r0 c0130r0 = this.f1381K0;
        D9.a aVar = this.f1390T0;
        D9.d.d(bVar2, c0130r0, aVar);
        D9.d.c(c0130r0, bVar3);
        D9.a aVar2 = this.f796z0;
        C0130r0 c0130r02 = this.f1383M0;
        D9.d.d(bVar2, c0130r02, aVar2);
        D9.a aVar3 = this.f1389S0;
        D9.d.d(c0130r02, bVar3, aVar3);
        D9.a aVar4 = this.f1388R0;
        C0130r0 c0130r03 = this.f1384N0;
        D9.d.d(c0130r02, c0130r03, aVar4);
        D9.d.d(c0130r03, bVar3, aVar3);
        D9.d.c(bVar3, this.f792v0);
        D9.b bVar4 = this.f789s0;
        C0130r0 c0130r04 = this.f1380J0;
        D9.d.d(bVar4, c0130r04, aVar);
        D9.b bVar5 = this.f794x0;
        D9.d.c(c0130r04, bVar5);
        D9.d.d(bVar5, c0130r04, aVar);
        A a9 = this.f790t0;
        C0130r0 c0130r05 = this.f1378H0;
        D9.a aVar5 = this.f1386P0;
        D9.d.d(a9, c0130r05, aVar5);
        C0130r0 c0130r06 = this.f1385O0;
        D9.d.d(bVar, c0130r06, aVar5);
        D9.d.c(bVar5, c0130r06);
        D9.d.c(bVar3, c0130r06);
    }

    @Override // A9.D
    public final void v0() {
        this.f1398b1.r0();
    }

    @Override // A9.D
    public final void w0() {
        this.f1398b1.s0();
    }

    @Override // A9.D
    public final void x0() {
        A2 a22 = this.f1398b1;
        VerticalGridView verticalGridView = a22.f751n0;
        if (verticalGridView != null) {
            verticalGridView.setPruneChild(false);
            a22.f751n0.setFocusSearchDisabled(true);
        }
    }

    @Override // A9.D
    public final void y0(Object obj) {
        E6.b.z(this.f1404h1, obj);
    }

    public final VerticalGridView z0() {
        A2 a22 = this.f1398b1;
        if (a22 == null) {
            return null;
        }
        return a22.f751n0;
    }
}
