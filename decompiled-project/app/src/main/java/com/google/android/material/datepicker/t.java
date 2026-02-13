package com.google.android.material.datepicker;

import H2.K;
import H2.T;
import H2.i0;
import P4.C0463k;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.kt.apps.media.xemtv.beta.R;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class t extends K {

    /* renamed from: d, reason: collision with root package name */
    public final b f15376d;

    /* renamed from: e, reason: collision with root package name */
    public final C0463k f15377e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15378f;

    public t(ContextThemeWrapper contextThemeWrapper, b bVar, C0463k c0463k) {
        p pVar = bVar.f15294a;
        p pVar2 = bVar.f15297d;
        if (pVar.f15360a.compareTo(pVar2.f15360a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (pVar2.f15360a.compareTo(bVar.f15295b.f15360a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f15378f = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * q.f15367d) + (n.w0(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f15376d = bVar;
        this.f15377e = c0463k;
        l(true);
    }

    @Override // H2.K
    public final int a() {
        return this.f15376d.f15300u;
    }

    @Override // H2.K
    public final long b(int i7) {
        Calendar a9 = x.a(this.f15376d.f15294a.f15360a);
        a9.add(2, i7);
        a9.set(5, 1);
        Calendar a10 = x.a(a9);
        a10.get(2);
        a10.get(1);
        a10.getMaximum(7);
        a10.getActualMaximum(5);
        a10.getTimeInMillis();
        return a10.getTimeInMillis();
    }

    @Override // H2.K
    public final void e(i0 i0Var, int i7) {
        s sVar = (s) i0Var;
        b bVar = this.f15376d;
        Calendar a9 = x.a(bVar.f15294a.f15360a);
        a9.add(2, i7);
        p pVar = new p(a9);
        sVar.f15374u.setText(pVar.d());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) sVar.f15375v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !pVar.equals(materialCalendarGridView.a().f15369a)) {
            new q(pVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // H2.K
    public final i0 g(ViewGroup viewGroup, int i7) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!n.w0(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new s(linearLayout, false);
        }
        linearLayout.setLayoutParams(new T(-1, this.f15378f));
        return new s(linearLayout, true);
    }
}
