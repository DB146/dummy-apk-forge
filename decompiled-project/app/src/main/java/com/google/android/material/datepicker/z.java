package com.google.android.material.datepicker;

import H2.K;
import H2.i0;
import Y5.A;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.kt.apps.media.xemtv.beta.R;
import java.util.Locale;

/* loaded from: classes.dex */
public final class z extends K {

    /* renamed from: d, reason: collision with root package name */
    public final l f15382d;

    public z(l lVar) {
        this.f15382d = lVar;
    }

    @Override // H2.K
    public final int a() {
        return this.f15382d.f15322o0.f15299f;
    }

    @Override // H2.K
    public final void e(i0 i0Var, int i7) {
        l lVar = this.f15382d;
        int i10 = lVar.f15322o0.f15294a.f15362c + i7;
        String format = String.format(Locale.getDefault(), "%d", Integer.valueOf(i10));
        TextView textView = ((y) i0Var).f15381u;
        textView.setText(format);
        Context context = textView.getContext();
        textView.setContentDescription(x.b().get(1) == i10 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i10)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i10)));
        c cVar = lVar.f15325r0;
        if (x.b().get(1) == i10) {
            A a9 = cVar.f15302b;
        } else {
            A a10 = cVar.f15301a;
        }
        throw null;
    }

    @Override // H2.K
    public final i0 g(ViewGroup viewGroup, int i7) {
        return new y((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
