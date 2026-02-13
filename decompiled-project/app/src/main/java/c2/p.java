package c2;

import A9.C0138t0;
import W1.C;
import W1.G;
import Y5.B;
import Y5.C0656w;
import android.os.Bundle;
import android.transition.Transition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.kt.apps.media.xemtv.beta.R;
import h2.C1233a;
import h2.C1234b;
import i2.C1322j;

/* loaded from: classes.dex */
public class p extends k {

    /* renamed from: J0, reason: collision with root package name */
    public final j f14178J0;

    /* renamed from: K0, reason: collision with root package name */
    public final j f14179K0;

    /* renamed from: T0, reason: collision with root package name */
    public C f14188T0;

    /* renamed from: U0, reason: collision with root package name */
    public C1322j f14189U0;

    /* renamed from: V0, reason: collision with root package name */
    public B f14190V0;

    /* renamed from: W0, reason: collision with root package name */
    public E.u f14191W0;

    /* renamed from: p0, reason: collision with root package name */
    public final C1233a f14192p0 = new C1233a("START", true, false);

    /* renamed from: q0, reason: collision with root package name */
    public final C1233a f14193q0 = new C1233a("ENTRANCE_INIT");

    /* renamed from: r0, reason: collision with root package name */
    public final j f14194r0 = new j(this, 0);

    /* renamed from: s0, reason: collision with root package name */
    public final j f14195s0 = new j(this, 1);

    /* renamed from: t0, reason: collision with root package name */
    public final j f14196t0 = new j(this, 2);

    /* renamed from: u0, reason: collision with root package name */
    public final j f14197u0 = new j(this, 3);

    /* renamed from: v0, reason: collision with root package name */
    public final C1233a f14198v0 = new C1233a("ENTRANCE_COMPLETE", true, false);

    /* renamed from: w0, reason: collision with root package name */
    public final D9.a f14199w0 = new D9.a("onCreate", false);

    /* renamed from: x0, reason: collision with root package name */
    public final D9.a f14200x0 = new D9.a("onCreateView", false);

    /* renamed from: y0, reason: collision with root package name */
    public final D9.a f14201y0 = new D9.a("prepareEntranceTransition", false);

    /* renamed from: z0, reason: collision with root package name */
    public final D9.a f14202z0 = new D9.a("startEntranceTransition", false);

    /* renamed from: A0, reason: collision with root package name */
    public final D9.a f14170A0 = new D9.a("onEntranceTransitionEnd", false);

    /* renamed from: B0, reason: collision with root package name */
    public final B f14171B0 = new B(7);
    public final D9.d C0 = new D9.d(1);

    /* renamed from: D0, reason: collision with root package name */
    public final u f14172D0 = new u();

    /* renamed from: E0, reason: collision with root package name */
    public final n f14173E0 = new C1233a("STATE_SET_ENTRANCE_START_STATE");

    /* renamed from: F0, reason: collision with root package name */
    public final C1233a f14174F0 = new C1233a("STATE_ENTER_TRANSIITON_INIT");

    /* renamed from: G0, reason: collision with root package name */
    public final j f14175G0 = new j(this, 4);

    /* renamed from: H0, reason: collision with root package name */
    public final j f14176H0 = new j(this, 5);

    /* renamed from: I0, reason: collision with root package name */
    public final C1233a f14177I0 = new C1233a("STATE_ENTER_TRANSIITON_COMPLETE", true, false);

    /* renamed from: L0, reason: collision with root package name */
    public final j f14180L0 = new j(this, 8);

    /* renamed from: M0, reason: collision with root package name */
    public final D9.a f14181M0 = new D9.a("onStart", false);

    /* renamed from: N0, reason: collision with root package name */
    public final D9.a f14182N0 = new D9.a("EVT_NO_ENTER_TRANSITION", false);

    /* renamed from: O0, reason: collision with root package name */
    public final D9.a f14183O0 = new D9.a("onFirstRowLoaded", false);

    /* renamed from: P0, reason: collision with root package name */
    public final D9.a f14184P0 = new D9.a("onEnterTransitionDone", false);

    /* renamed from: Q0, reason: collision with root package name */
    public final D9.a f14185Q0 = new D9.a("switchToVideo", false);

    /* renamed from: R0, reason: collision with root package name */
    public final C0138t0 f14186R0 = new C0138t0(this, 2);

    /* renamed from: S0, reason: collision with root package name */
    public final C0138t0 f14187S0 = new C0138t0(this, 3);

    /* JADX WARN: Type inference failed for: r0v15, types: [c2.n, h2.a] */
    public p() {
        boolean z8 = false;
        this.f14178J0 = new j(this, 6, z8);
        this.f14179K0 = new j(this, 7, z8);
        new C0656w(this);
    }

    @Override // W1.C
    public void S(Bundle bundle) {
        C1233a c1233a = this.f14192p0;
        D9.d dVar = this.C0;
        dVar.b(c1233a);
        C1233a c1233a2 = this.f14193q0;
        dVar.b(c1233a2);
        j jVar = this.f14194r0;
        dVar.b(jVar);
        j jVar2 = this.f14195s0;
        dVar.b(jVar2);
        j jVar3 = this.f14196t0;
        dVar.b(jVar3);
        j jVar4 = this.f14197u0;
        dVar.b(jVar4);
        C1233a c1233a3 = this.f14198v0;
        dVar.b(c1233a3);
        n nVar = this.f14173E0;
        dVar.b(nVar);
        j jVar5 = this.f14180L0;
        dVar.b(jVar5);
        j jVar6 = this.f14175G0;
        dVar.b(jVar6);
        C1233a c1233a4 = this.f14174F0;
        dVar.b(c1233a4);
        j jVar7 = this.f14178J0;
        dVar.b(jVar7);
        j jVar8 = this.f14176H0;
        dVar.b(jVar8);
        j jVar9 = this.f14179K0;
        dVar.b(jVar9);
        C1233a c1233a5 = this.f14177I0;
        dVar.b(c1233a5);
        D9.a aVar = this.f14199w0;
        D9.d.f(c1233a, c1233a2, aVar);
        B b2 = this.f14171B0;
        C1234b c1234b = new C1234b(c1233a2, c1233a3, b2);
        c1233a3.a(c1234b);
        c1233a2.b(c1234b);
        D9.a aVar2 = this.f14200x0;
        D9.d.f(c1233a2, c1233a3, aVar2);
        D9.d.f(c1233a2, jVar, this.f14201y0);
        D9.d.f(jVar, jVar2, aVar2);
        D9.d.f(jVar, jVar3, this.f14202z0);
        D9.d.e(jVar2, jVar3);
        D9.d.f(jVar3, jVar4, this.f14170A0);
        D9.d.e(jVar4, c1233a3);
        D9.d.f(c1233a, c1233a4, aVar);
        C1234b c1234b2 = new C1234b(c1233a4, c1233a5, b2);
        c1233a5.a(c1234b2);
        c1233a4.b(c1234b2);
        D9.d.f(c1233a4, c1233a5, this.f14182N0);
        D9.a aVar3 = this.f14185Q0;
        D9.d.f(c1233a4, jVar8, aVar3);
        D9.d.e(jVar8, c1233a5);
        D9.d.f(c1233a4, jVar7, aVar2);
        D9.a aVar4 = this.f14184P0;
        D9.d.f(jVar7, c1233a5, aVar4);
        D9.d.f(jVar7, jVar9, this.f14183O0);
        D9.d.f(jVar9, c1233a5, aVar4);
        D9.d.e(c1233a5, jVar3);
        D9.d.f(c1233a2, jVar6, aVar3);
        D9.d.e(jVar6, c1233a3);
        D9.d.f(c1233a3, jVar6, aVar3);
        D9.a aVar5 = this.f14181M0;
        D9.d.f(jVar, nVar, aVar5);
        D9.d.f(c1233a, jVar5, aVar5);
        D9.d.e(c1233a3, jVar5);
        D9.d.e(c1233a5, jVar5);
        D9.d dVar2 = this.C0;
        dVar2.f3304d.addAll(dVar2.f3302b);
        dVar2.i();
        super.S(bundle);
        dVar2.h(this.f14199w0);
        F().getDimensionPixelSize(R.dimen.lb_details_rows_align_top);
        G A10 = A();
        D9.a aVar6 = this.f14182N0;
        D9.d dVar3 = this.C0;
        if (A10 == null) {
            dVar3.h(aVar6);
            return;
        }
        if (A10.getWindow().getEnterTransition() == null) {
            dVar3.h(aVar6);
        }
        Transition returnTransition = A10.getWindow().getReturnTransition();
        if (returnTransition != null) {
            E6.b.c(returnTransition, this.f14187S0);
        }
    }

    @Override // W1.C
    public final View T(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.inflate(R.layout.lb_details_fragment, viewGroup, false).getClass();
        throw new ClassCastException();
    }

    @Override // c2.k, W1.C
    public final void V() {
        this.f14188T0 = null;
        u uVar = this.f14172D0;
        uVar.f14234b = null;
        uVar.f14235c = null;
        super.V();
    }

    @Override // c2.k, W1.C
    public final void b0() {
        this.f10275S = true;
        throw null;
    }

    @Override // W1.C
    public final void c0() {
        E.u uVar = this.f14191W0;
        if (uVar != null) {
            uVar.getClass();
        }
        this.f10275S = true;
    }

    @Override // c2.k, W1.C
    public void d0(View view, Bundle bundle) {
        super.d0(view, bundle);
        this.C0.h(this.f14200x0);
    }

    public final C1322j o0() {
        if (this.f14189U0 == null) {
            this.f14189U0 = new C1322j();
        }
        return this.f14189U0;
    }
}
