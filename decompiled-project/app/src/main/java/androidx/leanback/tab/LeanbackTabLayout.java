package androidx.leanback.tab;

import A9.T0;
import B6.g;
import B6.o;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import e3.AbstractC1084i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class LeanbackTabLayout extends o {

    /* renamed from: o0, reason: collision with root package name */
    public AbstractC1084i f13485o0;

    /* renamed from: p0, reason: collision with root package name */
    public final g f13486p0;

    public LeanbackTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13486p0 = new g(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i7, int i10) {
        AbstractC1084i abstractC1084i;
        AbstractC1084i abstractC1084i2 = this.f13485o0;
        boolean z8 = abstractC1084i2 != null && abstractC1084i2.hasFocus();
        boolean hasFocus = hasFocus();
        LinearLayout linearLayout = (LinearLayout) getChildAt(0);
        if ((i7 == 130 || i7 == 33) && linearLayout != null && linearLayout.getChildCount() > 0 && (abstractC1084i = this.f13485o0) != null) {
            View childAt = linearLayout.getChildAt(abstractC1084i.getCurrentItem());
            if (childAt != null) {
                arrayList.add(childAt);
                return;
            }
            return;
        }
        if ((i7 == 66 || i7 == 17) && !hasFocus && z8) {
            return;
        }
        super.addFocusables(arrayList, i7, i10);
    }

    public final void o() {
        LinearLayout linearLayout = (LinearLayout) getChildAt(0);
        if (linearLayout == null) {
            return;
        }
        int childCount = linearLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = linearLayout.getChildAt(i7);
            childAt.setFocusable(true);
            AbstractC1084i abstractC1084i = this.f13485o0;
            T0 t02 = new T0();
            t02.f966b = this;
            t02.f967c = abstractC1084i;
            childAt.setOnFocusChangeListener(t02);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        super.onLayout(z8, i7, i10, i11, i12);
        o();
    }

    @Override // B6.o
    public void setupWithViewPager(AbstractC1084i abstractC1084i) {
        super.setupWithViewPager(abstractC1084i);
        AbstractC1084i abstractC1084i2 = this.f13485o0;
        g gVar = this.f13486p0;
        if (abstractC1084i2 != null && abstractC1084i2.getAdapter() != null) {
            this.f13485o0.getAdapter().f16707a.unregisterObserver(gVar);
        }
        this.f13485o0 = abstractC1084i;
        if (abstractC1084i == null || abstractC1084i.getAdapter() == null) {
            return;
        }
        this.f13485o0.getAdapter().f16707a.registerObserver(gVar);
    }
}
