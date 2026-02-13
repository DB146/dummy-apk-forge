package com.google.android.material.datepicker;

import android.view.View;
import y1.InterfaceC2366n;
import y1.p0;

/* loaded from: classes.dex */
public final class m implements InterfaceC2366n {

    /* renamed from: a, reason: collision with root package name */
    public final View f15332a;

    /* renamed from: b, reason: collision with root package name */
    public int f15333b;

    /* renamed from: c, reason: collision with root package name */
    public int f15334c;

    public m(View view) {
        this.f15332a = view;
    }

    public m(View view, int i7, int i10) {
        this.f15333b = i7;
        this.f15332a = view;
        this.f15334c = i10;
    }

    @Override // y1.InterfaceC2366n
    public p0 l(View view, p0 p0Var) {
        int i7 = p0Var.f26731a.g(519).f23342b;
        View view2 = this.f15332a;
        int i10 = this.f15333b;
        if (i10 >= 0) {
            view2.getLayoutParams().height = i10 + i7;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f15334c + i7, view2.getPaddingRight(), view2.getPaddingBottom());
        return p0Var;
    }
}
