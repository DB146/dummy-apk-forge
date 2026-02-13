package com.google.android.material.datepicker;

import A9.B2;
import H2.G;
import H2.l0;
import P4.C0463k;
import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import y1.K;

/* loaded from: classes.dex */
public final class l<S> extends u {

    /* renamed from: n0, reason: collision with root package name */
    public int f15321n0;

    /* renamed from: o0, reason: collision with root package name */
    public b f15322o0;

    /* renamed from: p0, reason: collision with root package name */
    public p f15323p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f15324q0;

    /* renamed from: r0, reason: collision with root package name */
    public c f15325r0;

    /* renamed from: s0, reason: collision with root package name */
    public RecyclerView f15326s0;

    /* renamed from: t0, reason: collision with root package name */
    public RecyclerView f15327t0;

    /* renamed from: u0, reason: collision with root package name */
    public View f15328u0;

    /* renamed from: v0, reason: collision with root package name */
    public View f15329v0;

    /* renamed from: w0, reason: collision with root package name */
    public View f15330w0;

    /* renamed from: x0, reason: collision with root package name */
    public View f15331x0;

    @Override // W1.C
    public final void S(Bundle bundle) {
        super.S(bundle);
        if (bundle == null) {
            bundle = this.f10300u;
        }
        this.f15321n0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f15322o0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f15323p0 = (p) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // W1.C
    public final View T(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i7;
        int i10;
        G g;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(C(), this.f15321n0);
        this.f15325r0 = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        p pVar = this.f15322o0.f15294a;
        if (n.w0(contextThemeWrapper, R.attr.windowFullscreen)) {
            i7 = com.kt.apps.media.xemtv.beta.R.layout.mtrl_calendar_vertical;
            i10 = 1;
        } else {
            i7 = com.kt.apps.media.xemtv.beta.R.layout.mtrl_calendar_horizontal;
            i10 = 0;
        }
        View inflate = cloneInContext.inflate(i7, viewGroup, false);
        Resources resources = i0().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.kt.apps.media.xemtv.beta.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.kt.apps.media.xemtv.beta.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.kt.apps.media.xemtv.beta.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.kt.apps.media.xemtv.beta.R.dimen.mtrl_calendar_days_of_week_height);
        int i11 = q.f15367d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.kt.apps.media.xemtv.beta.R.dimen.mtrl_calendar_month_vertical_padding) * (i11 - 1)) + (resources.getDimensionPixelSize(com.kt.apps.media.xemtv.beta.R.dimen.mtrl_calendar_day_height) * i11) + resources.getDimensionPixelOffset(com.kt.apps.media.xemtv.beta.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(com.kt.apps.media.xemtv.beta.R.id.mtrl_calendar_days_of_week);
        K.n(gridView, new C1.e(1));
        int i12 = this.f15322o0.f15298e;
        gridView.setAdapter((ListAdapter) (i12 > 0 ? new e(i12) : new e()));
        gridView.setNumColumns(pVar.f15363d);
        gridView.setEnabled(false);
        this.f15327t0 = (RecyclerView) inflate.findViewById(com.kt.apps.media.xemtv.beta.R.id.mtrl_calendar_months);
        this.f15327t0.setLayoutManager(new g(this, i10, i10));
        this.f15327t0.setTag("MONTHS_VIEW_GROUP_TAG");
        t tVar = new t(contextThemeWrapper, this.f15322o0, new C0463k(this, 20));
        this.f15327t0.setAdapter(tVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.kt.apps.media.xemtv.beta.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(com.kt.apps.media.xemtv.beta.R.id.mtrl_calendar_year_selector_frame);
        this.f15326s0 = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f15326s0.setLayoutManager(new GridLayoutManager(integer));
            this.f15326s0.setAdapter(new z(this));
            this.f15326s0.i(new h(this));
        }
        if (inflate.findViewById(com.kt.apps.media.xemtv.beta.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(com.kt.apps.media.xemtv.beta.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            K.n(materialButton, new i(this, 0));
            View findViewById = inflate.findViewById(com.kt.apps.media.xemtv.beta.R.id.month_navigation_previous);
            this.f15328u0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(com.kt.apps.media.xemtv.beta.R.id.month_navigation_next);
            this.f15329v0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f15330w0 = inflate.findViewById(com.kt.apps.media.xemtv.beta.R.id.mtrl_calendar_year_selector_frame);
            this.f15331x0 = inflate.findViewById(com.kt.apps.media.xemtv.beta.R.id.mtrl_calendar_day_selector_frame);
            p0(1);
            materialButton.setText(this.f15323p0.d());
            this.f15327t0.j(new j(this, tVar, materialButton));
            materialButton.setOnClickListener(new k(this, 0));
            this.f15329v0.setOnClickListener(new f(this, tVar, 1));
            this.f15328u0.setOnClickListener(new f(this, tVar, 0));
        }
        if (!n.w0(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (g = new G()).f4591a) != (recyclerView = this.f15327t0)) {
            l0 l0Var = g.f4592b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f13680x0;
                if (arrayList != null) {
                    arrayList.remove(l0Var);
                }
                g.f4591a.setOnFlingListener(null);
            }
            g.f4591a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                g.f4591a.j(l0Var);
                g.f4591a.setOnFlingListener(g);
                new Scroller(g.f4591a.getContext(), new DecelerateInterpolator());
                g.f();
            }
        }
        this.f15327t0.h0(tVar.f15376d.f15294a.f(this.f15323p0));
        K.n(this.f15327t0, new C1.e(2));
        return inflate;
    }

    @Override // W1.C
    public final void a0(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f15321n0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f15322o0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f15323p0);
    }

    public final void o0(p pVar) {
        t tVar = (t) this.f15327t0.getAdapter();
        int f4 = tVar.f15376d.f15294a.f(pVar);
        int f10 = f4 - tVar.f15376d.f15294a.f(this.f15323p0);
        boolean z8 = Math.abs(f10) > 3;
        boolean z10 = f10 > 0;
        this.f15323p0 = pVar;
        if (z8 && z10) {
            this.f15327t0.h0(f4 - 3);
            this.f15327t0.post(new B2(this, f4, 2));
        } else if (!z8) {
            this.f15327t0.post(new B2(this, f4, 2));
        } else {
            this.f15327t0.h0(f4 + 3);
            this.f15327t0.post(new B2(this, f4, 2));
        }
    }

    public final void p0(int i7) {
        this.f15324q0 = i7;
        if (i7 == 2) {
            this.f15326s0.getLayoutManager().I0(this.f15323p0.f15362c - ((z) this.f15326s0.getAdapter()).f15382d.f15322o0.f15294a.f15362c);
            this.f15330w0.setVisibility(0);
            this.f15331x0.setVisibility(8);
            this.f15328u0.setVisibility(8);
            this.f15329v0.setVisibility(8);
            return;
        }
        if (i7 == 1) {
            this.f15330w0.setVisibility(8);
            this.f15331x0.setVisibility(0);
            this.f15328u0.setVisibility(0);
            this.f15329v0.setVisibility(0);
            o0(this.f15323p0);
        }
    }
}
