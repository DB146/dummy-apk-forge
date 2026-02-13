package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15308a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f15309b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f15310c;

    public /* synthetic */ f(l lVar, t tVar, int i7) {
        this.f15308a = i7;
        this.f15310c = lVar;
        this.f15309b = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f15308a) {
            case 0:
                l lVar = this.f15310c;
                int g12 = ((LinearLayoutManager) lVar.f15327t0.getLayoutManager()).g1() - 1;
                if (g12 >= 0) {
                    Calendar a9 = x.a(this.f15309b.f15376d.f15294a.f15360a);
                    a9.add(2, g12);
                    lVar.o0(new p(a9));
                    return;
                }
                return;
            default:
                l lVar2 = this.f15310c;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) lVar2.f15327t0.getLayoutManager();
                View i12 = linearLayoutManager.i1(false, 0, linearLayoutManager.y());
                int O10 = (i12 == null ? -1 : androidx.recyclerview.widget.a.O(i12)) + 1;
                if (O10 < lVar2.f15327t0.getAdapter().a()) {
                    Calendar a10 = x.a(this.f15309b.f15376d.f15294a.f15360a);
                    a10.add(2, O10);
                    lVar2.o0(new p(a10));
                    return;
                }
                return;
        }
    }
}
