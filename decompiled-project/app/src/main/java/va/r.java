package va;

import A9.O0;
import W1.C0558a;
import W1.U;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.leanback.tab.LeanbackTabLayout;
import androidx.leanback.tab.LeanbackViewPager;
import com.google.android.material.button.MaterialButton;
import com.kt.apps.core.storage.local.RoomDataBase;
import com.kt.apps.core.utils.leanback.ViewUtilsKt;
import com.kt.apps.media.xemtv.beta.R;
import com.kt.apps.media.xemtv.ui.search.TVSearchActivity;
import hb.C1268a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public final class r extends H {

    /* renamed from: Q0, reason: collision with root package name */
    public final O0 f25348Q0;

    /* renamed from: R0, reason: collision with root package name */
    public final Db.o f25349R0;

    /* renamed from: S0, reason: collision with root package name */
    public final Db.o f25350S0;

    /* renamed from: T0, reason: collision with root package name */
    public MaterialButton f25351T0;

    /* renamed from: U0, reason: collision with root package name */
    public LeanbackViewPager f25352U0;

    public r() {
        vc.i.o(this, kotlin.jvm.internal.w.a(ta.c.class), new q(this, 0), new q(this, 1), new q(this, 2));
        this.f25348Q0 = vc.i.o(this, kotlin.jvm.internal.w.a(C2161e.class), new q(this, 3), new q(this, 4), new q(this, 5));
        final int i7 = 0;
        this.f25349R0 = android.support.v4.media.session.b.z(new Rb.a(this) { // from class: va.m

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f25338b;

            {
                this.f25338b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return (LeanbackViewPager) this.f25338b.j0().findViewById(R.id.view_pager);
                    default:
                        U B10 = this.f25338b.B();
                        kotlin.jvm.internal.l.d(B10, "getChildFragmentManager(...)");
                        return new p(B10);
                }
            }
        });
        final int i10 = 1;
        this.f25350S0 = android.support.v4.media.session.b.z(new Rb.a(this) { // from class: va.m

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f25338b;

            {
                this.f25338b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return (LeanbackViewPager) this.f25338b.j0().findViewById(R.id.view_pager);
                    default:
                        U B10 = this.f25338b.B();
                        kotlin.jvm.internal.l.d(B10, "getChildFragmentManager(...)");
                        return new p(B10);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, hb.a] */
    @Override // y9.AbstractC2457B
    public final void C0(View rootView) {
        kotlin.jvm.internal.l.e(rootView, "rootView");
        I0().c(false);
        v0(this.f763z0);
        MaterialButton materialButton = this.f25351T0;
        if (materialButton != null) {
            materialButton.setOnClickListener(new Aa.q(this, 13));
        }
        final int i7 = 0;
        I0().a().e(H(), new Aa.b(new Rb.c(this) { // from class: va.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f25334b;

            {
                this.f25334b = this;
            }

            @Override // Rb.c
            public final Object invoke(Object obj) {
                int i10;
                B6.j g;
                boolean z8;
                y9.I i11 = (y9.I) obj;
                switch (i7) {
                    case 0:
                        if (i11 instanceof y9.H) {
                            M9.d extensionsConfig = (M9.d) ((y9.H) i11).f27484a;
                            r rVar = this.f25334b;
                            List j = rVar.J0().j();
                            ListIterator listIterator = j.listIterator(j.size());
                            while (true) {
                                if (!listIterator.hasPrevious()) {
                                    i10 = -1;
                                } else if (kotlin.jvm.internal.l.a(((M9.d) listIterator.previous()).f6851b, extensionsConfig.f6851b)) {
                                    i10 = listIterator.nextIndex();
                                }
                            }
                            if (i10 > -1) {
                                LeanbackTabLayout F02 = rVar.F0();
                                if (F02 != null && (g = F02.g(i10)) != null) {
                                    g.a(extensionsConfig.f6850a);
                                }
                                p J02 = rVar.J0();
                                J02.getClass();
                                kotlin.jvm.internal.l.e(extensionsConfig, "extensionsConfig");
                                J02.j().remove(i10);
                                J02.j().add(i10, extensionsConfig);
                            }
                        }
                        return Db.q.f3365a;
                    default:
                        if (i11 instanceof y9.G) {
                            List list = (List) ((y9.G) i11).f27483a;
                            boolean isEmpty = list.isEmpty();
                            r rVar2 = this.f25334b;
                            if (isEmpty) {
                                g1.n nVar = new g1.n();
                                View inflate = LayoutInflater.from(rVar2.i0()).inflate(R.layout.fragment_extensions_dashboard_empty_sence, (ViewGroup) null, false);
                                kotlin.jvm.internal.l.c(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                                nVar.b((ConstraintLayout) inflate);
                                View view = rVar2.f10277U;
                                kotlin.jvm.internal.l.c(view, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                nVar.a(constraintLayout);
                                constraintLayout.setConstraintSet(null);
                                constraintLayout.requestLayout();
                            } else {
                                LeanbackViewPager K02 = rVar2.K0();
                                kotlin.jvm.internal.l.d(K02, "<get-viewPager>(...)");
                                if (K02.getVisibility() != 0) {
                                    rVar2.K0().setCurrentItem(0);
                                    g1.n nVar2 = new g1.n();
                                    View inflate2 = LayoutInflater.from(rVar2.i0()).inflate(R.layout.fragment_extensions_dashboard, (ViewGroup) null, false);
                                    kotlin.jvm.internal.l.c(inflate2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                                    nVar2.b((ConstraintLayout) inflate2);
                                    View view2 = rVar2.f10277U;
                                    kotlin.jvm.internal.l.c(view2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) view2;
                                    nVar2.a(constraintLayout2);
                                    constraintLayout2.setConstraintSet(null);
                                    constraintLayout2.requestLayout();
                                }
                            }
                            p J03 = rVar2.J0();
                            J03.getClass();
                            if (J03.j().isEmpty() || list.isEmpty()) {
                                z8 = false;
                            } else {
                                List j10 = J03.j();
                                ArrayList arrayList = new ArrayList(Eb.p.S(j10, 10));
                                Iterator it = j10.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((M9.d) it.next()).f6851b);
                                }
                                Iterator it2 = arrayList.iterator();
                                if (!it2.hasNext()) {
                                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                                }
                                Object next = it2.next();
                                while (it2.hasNext()) {
                                    next = X.c.h((String) next, (String) it2.next());
                                }
                                ArrayList arrayList2 = new ArrayList(Eb.p.S(list, 10));
                                Iterator it3 = list.iterator();
                                while (it3.hasNext()) {
                                    arrayList2.add(((M9.d) it3.next()).f6851b);
                                }
                                Iterator it4 = arrayList2.iterator();
                                if (!it4.hasNext()) {
                                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                                }
                                Object next2 = it4.next();
                                while (it4.hasNext()) {
                                    next2 = X.c.h((String) next2, (String) it4.next());
                                }
                                z8 = kotlin.jvm.internal.l.a(next, next2);
                            }
                            if (!z8) {
                                p J04 = rVar2.J0();
                                J04.getClass();
                                J04.j().clear();
                                J04.j().addAll(list);
                                J04.f();
                                rVar2.K0().setAdapter(rVar2.J0());
                                LeanbackTabLayout F03 = rVar2.F0();
                                if (F03 != null) {
                                    F03.m(rVar2.K0(), false);
                                }
                            }
                        } else if (!(i11 instanceof y9.D)) {
                            boolean z10 = i11 instanceof y9.E;
                        }
                        return Db.q.f3365a;
                }
            }
        }, 7));
        final int i10 = 1;
        I0().b().e(H(), new Aa.b(new Rb.c(this) { // from class: va.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f25334b;

            {
                this.f25334b = this;
            }

            @Override // Rb.c
            public final Object invoke(Object obj) {
                int i102;
                B6.j g;
                boolean z8;
                y9.I i11 = (y9.I) obj;
                switch (i10) {
                    case 0:
                        if (i11 instanceof y9.H) {
                            M9.d extensionsConfig = (M9.d) ((y9.H) i11).f27484a;
                            r rVar = this.f25334b;
                            List j = rVar.J0().j();
                            ListIterator listIterator = j.listIterator(j.size());
                            while (true) {
                                if (!listIterator.hasPrevious()) {
                                    i102 = -1;
                                } else if (kotlin.jvm.internal.l.a(((M9.d) listIterator.previous()).f6851b, extensionsConfig.f6851b)) {
                                    i102 = listIterator.nextIndex();
                                }
                            }
                            if (i102 > -1) {
                                LeanbackTabLayout F02 = rVar.F0();
                                if (F02 != null && (g = F02.g(i102)) != null) {
                                    g.a(extensionsConfig.f6850a);
                                }
                                p J02 = rVar.J0();
                                J02.getClass();
                                kotlin.jvm.internal.l.e(extensionsConfig, "extensionsConfig");
                                J02.j().remove(i102);
                                J02.j().add(i102, extensionsConfig);
                            }
                        }
                        return Db.q.f3365a;
                    default:
                        if (i11 instanceof y9.G) {
                            List list = (List) ((y9.G) i11).f27483a;
                            boolean isEmpty = list.isEmpty();
                            r rVar2 = this.f25334b;
                            if (isEmpty) {
                                g1.n nVar = new g1.n();
                                View inflate = LayoutInflater.from(rVar2.i0()).inflate(R.layout.fragment_extensions_dashboard_empty_sence, (ViewGroup) null, false);
                                kotlin.jvm.internal.l.c(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                                nVar.b((ConstraintLayout) inflate);
                                View view = rVar2.f10277U;
                                kotlin.jvm.internal.l.c(view, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                nVar.a(constraintLayout);
                                constraintLayout.setConstraintSet(null);
                                constraintLayout.requestLayout();
                            } else {
                                LeanbackViewPager K02 = rVar2.K0();
                                kotlin.jvm.internal.l.d(K02, "<get-viewPager>(...)");
                                if (K02.getVisibility() != 0) {
                                    rVar2.K0().setCurrentItem(0);
                                    g1.n nVar2 = new g1.n();
                                    View inflate2 = LayoutInflater.from(rVar2.i0()).inflate(R.layout.fragment_extensions_dashboard, (ViewGroup) null, false);
                                    kotlin.jvm.internal.l.c(inflate2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                                    nVar2.b((ConstraintLayout) inflate2);
                                    View view2 = rVar2.f10277U;
                                    kotlin.jvm.internal.l.c(view2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) view2;
                                    nVar2.a(constraintLayout2);
                                    constraintLayout2.setConstraintSet(null);
                                    constraintLayout2.requestLayout();
                                }
                            }
                            p J03 = rVar2.J0();
                            J03.getClass();
                            if (J03.j().isEmpty() || list.isEmpty()) {
                                z8 = false;
                            } else {
                                List j10 = J03.j();
                                ArrayList arrayList = new ArrayList(Eb.p.S(j10, 10));
                                Iterator it = j10.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((M9.d) it.next()).f6851b);
                                }
                                Iterator it2 = arrayList.iterator();
                                if (!it2.hasNext()) {
                                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                                }
                                Object next = it2.next();
                                while (it2.hasNext()) {
                                    next = X.c.h((String) next, (String) it2.next());
                                }
                                ArrayList arrayList2 = new ArrayList(Eb.p.S(list, 10));
                                Iterator it3 = list.iterator();
                                while (it3.hasNext()) {
                                    arrayList2.add(((M9.d) it3.next()).f6851b);
                                }
                                Iterator it4 = arrayList2.iterator();
                                if (!it4.hasNext()) {
                                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                                }
                                Object next2 = it4.next();
                                while (it4.hasNext()) {
                                    next2 = X.c.h((String) next2, (String) it4.next());
                                }
                                z8 = kotlin.jvm.internal.l.a(next, next2);
                            }
                            if (!z8) {
                                p J04 = rVar2.J0();
                                J04.getClass();
                                J04.j().clear();
                                J04.j().addAll(list);
                                J04.f();
                                rVar2.K0().setAdapter(rVar2.J0());
                                LeanbackTabLayout F03 = rVar2.F0();
                                if (F03 != null) {
                                    F03.m(rVar2.K0(), false);
                                }
                            }
                        } else if (!(i11 instanceof y9.D)) {
                            boolean z10 = i11 instanceof y9.E;
                        }
                        return Db.q.f3365a;
                }
            }
        }, 7));
        final ?? obj = new Object();
        LeanbackTabLayout F02 = F0();
        kotlin.jvm.internal.l.b(F02);
        F02.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: va.l
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                B6.m mVar;
                final r rVar = r.this;
                LeanbackTabLayout F03 = rVar.F0();
                kotlin.jvm.internal.l.b(F03);
                int tabCount = F03.getTabCount();
                for (final int i19 = 0; i19 < tabCount; i19++) {
                    LeanbackTabLayout F04 = rVar.F0();
                    kotlin.jvm.internal.l.b(F04);
                    B6.j g = F04.g(i19);
                    if (g != null && (mVar = g.g) != null) {
                        final C1268a c1268a = obj;
                        mVar.setOnLongClickListener(new View.OnLongClickListener() { // from class: va.n
                            @Override // android.view.View.OnLongClickListener
                            public final boolean onLongClick(View view2) {
                                List list;
                                boolean z8;
                                r rVar2 = r.this;
                                Object d10 = rVar2.I0().b().d();
                                y9.G g2 = d10 instanceof y9.G ? (y9.G) d10 : null;
                                if (g2 == null || (list = (List) g2.f27483a) == null) {
                                    return false;
                                }
                                int i20 = i19;
                                C2159c c2159c = new C2159c((M9.d) list.get(i20), rVar2.B0(), c1268a, RoomDataBase.f16124l.g(rVar2.i0()), new o(rVar2, list, i20, 0), new o(rVar2, list, i20, 1));
                                W1.G g02 = rVar2.g0();
                                g02.getWindow().getDecorView();
                                U j = g02.j();
                                if (j.E("leanBackGuidedStepSupportFragment") != null) {
                                    Log.w("GuidedStepF", "Fragment is already exists, likely calling addAsRoot() when savedInstanceState is not null in Activity.onCreate().");
                                } else {
                                    C0558a c0558a = new C0558a(j);
                                    Bundle bundle = c2159c.f10300u;
                                    int i21 = bundle == null ? 1 : bundle.getInt("uiStyle", 1);
                                    Bundle bundle2 = c2159c.f10300u;
                                    if (bundle2 == null) {
                                        bundle2 = new Bundle();
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    bundle2.putInt("uiStyle", 2);
                                    if (z8) {
                                        c2159c.l0(bundle2);
                                    }
                                    if (2 != i21) {
                                        c2159c.t0();
                                    }
                                    c0558a.j(android.R.id.content, c2159c, "leanBackGuidedStepSupportFragment");
                                    c0558a.e(false);
                                }
                                return true;
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // y9.AbstractC2457B
    public final void D0(View view) {
        this.f25351T0 = (MaterialButton) view.findViewById(R.id.btn_add_source);
        this.f25352U0 = (LeanbackViewPager) view.findViewById(R.id.view_pager);
    }

    @Override // Ca.b
    public final int E0() {
        LeanbackViewPager leanbackViewPager;
        View view = this.f10277U;
        if (view == null || (leanbackViewPager = (LeanbackViewPager) view.findViewById(R.id.view_pager)) == null) {
            return 0;
        }
        return leanbackViewPager.getCurrentItem();
    }

    @Override // Ca.b
    public final LeanbackTabLayout F0() {
        View view = this.f10277U;
        if (view != null) {
            return (LeanbackTabLayout) view.findViewById(R.id.tab_layout);
        }
        return null;
    }

    @Override // Ca.b
    public final LeanbackViewPager G0() {
        return this.f25352U0;
    }

    public final C2161e I0() {
        return (C2161e) this.f25348Q0.getValue();
    }

    public final p J0() {
        return (p) this.f25350S0.getValue();
    }

    public final LeanbackViewPager K0() {
        return (LeanbackViewPager) this.f25349R0.getValue();
    }

    public final View L0(View view, int i7) {
        B6.j g;
        if ((view instanceof B6.m) && i7 == 130) {
            l2.H h10 = I0().j;
            if ((h10 != null ? (y9.I) h10.d() : null) instanceof y9.E) {
                return view;
            }
            l2.H h11 = I0().j;
            return (h11 != null ? (y9.I) h11.d() : null) instanceof y9.D ? view : K0();
        }
        if (kotlin.jvm.internal.l.a(view, this.f25351T0)) {
            if (J0().c() == 0 && (i7 == 66 || i7 == 130 || i7 == 33)) {
                return this.f25351T0;
            }
            if (i7 == 33) {
                n0(new Intent(i0(), (Class<?>) TVSearchActivity.class));
                return null;
            }
            if (i7 == 66) {
                LeanbackTabLayout F02 = F0();
                kotlin.jvm.internal.l.b(F02);
                if (F02.getTabCount() > 0) {
                    LeanbackTabLayout F03 = F0();
                    if (F03 == null || (g = F03.g(0)) == null) {
                        return null;
                    }
                    return g.g;
                }
            } else if (i7 == 130) {
                l2.H h12 = I0().j;
                if ((h12 != null ? (y9.I) h12.d() : null) instanceof y9.E) {
                    return view;
                }
                l2.H h13 = I0().j;
                return (h13 != null ? (y9.I) h13.d() : null) instanceof y9.D ? view : K0();
            }
        }
        LeanbackTabLayout F04 = F0();
        if (kotlin.jvm.internal.l.a(view, F04 != null ? ViewUtilsKt.findCurrentFocusedView(F04) : null)) {
            LeanbackTabLayout F05 = F0();
            kotlin.jvm.internal.l.b(F05);
            int findCurrentFocusedPosition = ViewUtilsKt.findCurrentFocusedPosition(F05);
            LeanbackTabLayout F06 = F0();
            kotlin.jvm.internal.l.b(F06);
            int tabCount = F06.getTabCount();
            if (i7 != 17) {
                if (i7 == 66) {
                    if (findCurrentFocusedPosition == tabCount - 1) {
                        return view;
                    }
                    LeanbackTabLayout F07 = F0();
                    kotlin.jvm.internal.l.b(F07);
                    LeanbackTabLayout F08 = F0();
                    kotlin.jvm.internal.l.b(F08);
                    B6.j g2 = F07.g((findCurrentFocusedPosition + 1) % F08.getTabCount());
                    if (g2 != null) {
                        return g2.g;
                    }
                    return null;
                }
            } else if (findCurrentFocusedPosition == 0) {
                return this.f25351T0;
            }
        }
        throw new Throwable("Return to parent focus search");
    }

    @Override // y9.AbstractC2457B, A9.A2, W1.C
    public final void V() {
        this.f25351T0 = null;
        this.f25352U0 = null;
        super.V();
    }

    @Override // A9.A2
    public final int p0() {
        return R.layout.fragment_extensions_dashboard;
    }
}
