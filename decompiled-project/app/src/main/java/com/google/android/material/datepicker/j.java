package com.google.android.material.datepicker;

import H2.V;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class j extends V {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f15316a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f15317b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f15318c;

    public j(l lVar, t tVar, MaterialButton materialButton) {
        this.f15318c = lVar;
        this.f15316a = tVar;
        this.f15317b = materialButton;
    }

    @Override // H2.V
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 0) {
            recyclerView.announceForAccessibility(this.f15317b.getText());
        }
    }

    @Override // H2.V
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int g12;
        l lVar = this.f15318c;
        if (i7 < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) lVar.f15327t0.getLayoutManager();
            View i12 = linearLayoutManager.i1(false, 0, linearLayoutManager.y());
            g12 = i12 == null ? -1 : androidx.recyclerview.widget.a.O(i12);
        } else {
            g12 = ((LinearLayoutManager) lVar.f15327t0.getLayoutManager()).g1();
        }
        b bVar = this.f15316a.f15376d;
        Calendar a9 = x.a(bVar.f15294a.f15360a);
        a9.add(2, g12);
        lVar.f15323p0 = new p(a9);
        Calendar a10 = x.a(bVar.f15294a.f15360a);
        a10.add(2, g12);
        a10.set(5, 1);
        Calendar a11 = x.a(a10);
        a11.get(2);
        a11.get(1);
        a11.getMaximum(7);
        a11.getActualMaximum(5);
        a11.getTimeInMillis();
        long timeInMillis = a11.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = x.f15380a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        this.f15317b.setText(instanceForSkeleton.format(new Date(timeInMillis)));
    }
}
