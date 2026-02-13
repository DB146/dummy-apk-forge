package com.google.android.material.datepicker;

import H2.Q;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class h extends Q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f15313a;

    public h(l lVar) {
        this.f15313a = lVar;
        x.c(null);
        x.c(null);
    }

    @Override // H2.Q
    public final void a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof z) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f15313a.getClass();
            throw null;
        }
    }
}
