package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class o<S> extends u {

    /* renamed from: n0, reason: collision with root package name */
    public int f15358n0;

    /* renamed from: o0, reason: collision with root package name */
    public b f15359o0;

    @Override // W1.C
    public final void S(Bundle bundle) {
        super.S(bundle);
        if (bundle == null) {
            bundle = this.f10300u;
        }
        this.f15358n0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f15359o0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // W1.C
    public final View T(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(C(), this.f15358n0));
        throw null;
    }

    @Override // W1.C
    public final void a0(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f15358n0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f15359o0);
    }
}
