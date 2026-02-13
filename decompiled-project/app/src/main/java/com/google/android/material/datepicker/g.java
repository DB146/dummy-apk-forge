package com.google.android.material.datepicker;

import H2.B;
import H2.e0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class g extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ int f15311E;

    /* renamed from: F, reason: collision with root package name */
    public final /* synthetic */ l f15312F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, int i7, int i10) {
        super(i7);
        this.f15312F = lVar;
        this.f15311E = i10;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final void T0(RecyclerView recyclerView, int i7) {
        B b2 = new B(recyclerView.getContext());
        b2.f4572a = i7;
        U0(b2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void W0(e0 e0Var, int[] iArr) {
        int i7 = this.f15311E;
        l lVar = this.f15312F;
        if (i7 == 0) {
            iArr[0] = lVar.f15327t0.getWidth();
            iArr[1] = lVar.f15327t0.getWidth();
        } else {
            iArr[0] = lVar.f15327t0.getHeight();
            iArr[1] = lVar.f15327t0.getHeight();
        }
    }
}
