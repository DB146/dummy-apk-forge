package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class r implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f15372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f15373b;

    public r(t tVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f15373b = tVar;
        this.f15372a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.f15372a;
        q a9 = materialCalendarGridView.a();
        if (i7 < a9.a() || i7 > a9.c()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i7).longValue() >= ((l) this.f15373b.f15377e.f8074b).f15322o0.f15296c.f15303a) {
            throw null;
        }
    }
}
