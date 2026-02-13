package Da;

import A9.O;
import A9.O0;
import W1.U;
import android.os.Bundle;
import android.view.View;
import androidx.leanback.tab.LeanbackTabLayout;
import androidx.leanback.tab.LeanbackViewPager;
import com.kt.apps.media.xemtv.beta.R;
import com.kt.apps.media.xemtv.ui.main.MainActivity;
import e3.AbstractC1076a;
import kotlin.jvm.internal.w;

/* loaded from: classes2.dex */
public final class f extends o {

    /* renamed from: R0, reason: collision with root package name */
    public final Db.o f3315R0;

    /* renamed from: T0, reason: collision with root package name */
    public final Db.o f3317T0;

    /* renamed from: Q0, reason: collision with root package name */
    public final O0 f3314Q0 = vc.i.o(this, w.a(ta.c.class), new e(this, 0), new e(this, 1), new e(this, 2));

    /* renamed from: S0, reason: collision with root package name */
    public Aa.l f3316S0 = Aa.l.f1523a;

    public f() {
        final int i7 = 0;
        this.f3315R0 = android.support.v4.media.session.b.z(new Rb.a(this) { // from class: Da.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f3310b;

            {
                this.f3310b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return (LeanbackViewPager) this.f3310b.j0().findViewById(R.id.view_pager);
                    default:
                        f fVar = this.f3310b;
                        U B10 = fVar.B();
                        kotlin.jvm.internal.l.d(B10, "getChildFragmentManager(...)");
                        return new d(fVar, B10);
                }
            }
        });
        final int i10 = 1;
        this.f3317T0 = android.support.v4.media.session.b.z(new Rb.a(this) { // from class: Da.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f3310b;

            {
                this.f3310b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return (LeanbackViewPager) this.f3310b.j0().findViewById(R.id.view_pager);
                    default:
                        f fVar = this.f3310b;
                        U B10 = fVar.B();
                        kotlin.jvm.internal.l.d(B10, "getChildFragmentManager(...)");
                        return new d(fVar, B10);
                }
            }
        });
    }

    @Override // y9.AbstractC2457B
    public final void C0(View rootView) {
        kotlin.jvm.internal.l.e(rootView, "rootView");
        O0 o02 = this.f3314Q0;
        ((ta.c) o02.getValue()).getListTVChannel(false);
        O o10 = h().f937c;
        kotlin.jvm.internal.l.b(o10);
        h();
        o10.h();
        B6.o oVar = (B6.o) rootView.findViewById(R.id.tab_layout);
        I0().setAdapter((d) this.f3317T0.getValue());
        ((ta.c) o02.getValue()).getTvChannelLiveData().e(H(), new Aa.b(new Aa.t(3, this, oVar), 5));
        ((ta.c) o02.getValue()).getTvWithLinkStreamLiveData().e(H(), new Aa.b(new Ba.o(this, 4), 5));
    }

    @Override // y9.AbstractC2457B
    public final void D0(View view) {
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
        if (!(I0().getAdapter() instanceof d)) {
            return I0();
        }
        AbstractC1076a adapter = I0().getAdapter();
        kotlin.jvm.internal.l.c(adapter, "null cannot be cast to non-null type com.kt.apps.media.xemtv.ui.tv.settings.FragmentChannelNumberDashboard.TVViewPager");
        if (((d) adapter).k) {
            return null;
        }
        return I0();
    }

    public final LeanbackViewPager I0() {
        return (LeanbackViewPager) this.f3315R0.getValue();
    }

    @Override // A9.A2, W1.C
    public final void S(Bundle bundle) {
        super.S(bundle);
        this.f3316S0 = Aa.l.f1523a;
    }

    @Override // A9.A2, W1.C
    public final void a0(Bundle bundle) {
        bundle.putInt("currentSelectedPosition", this.f753p0);
        bundle.putAll(this.f10300u);
    }

    @Override // y9.AbstractC2457B, A9.A2, W1.C
    public final void d0(View view, Bundle bundle) {
        kotlin.jvm.internal.l.e(view, "view");
        super.d0(view, bundle);
        v0(this.f763z0);
        int i7 = MainActivity.f16195f0;
        view.findViewById(R.id.view_pager).getMeasuredWidth();
    }

    @Override // W1.C
    public final void e0(Bundle bundle) {
        this.f10275S = true;
        if (bundle == null || !bundle.containsKey("extra:type")) {
            return;
        }
        Aa.l lVar = (Aa.l) bundle.getParcelable("extra:type");
        if (lVar == null) {
            lVar = Aa.l.f1523a;
        }
        this.f3316S0 = lVar;
    }

    @Override // A9.A2
    public final int p0() {
        return R.layout.fragment_tv_dashboard_new;
    }
}
