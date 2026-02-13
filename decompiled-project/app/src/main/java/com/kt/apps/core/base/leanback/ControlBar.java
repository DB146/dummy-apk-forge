package com.kt.apps.core.base.leanback;

import A9.C0067b0;
import A9.C0093h2;
import A9.C0101j2;
import A9.C0109l2;
import A9.T;
import A9.Y;
import A9.d3;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class ControlBar extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public int f15917a;

    /* renamed from: b, reason: collision with root package name */
    public Y f15918b;

    /* renamed from: c, reason: collision with root package name */
    public int f15919c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15920d;

    public ControlBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15919c = -1;
        this.f15920d = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i7, int i10) {
        if (i7 != 33 && i7 != 130) {
            super.addFocusables(arrayList, i7, i10);
            return;
        }
        int i11 = this.f15919c;
        if (i11 >= 0 && i11 < getChildCount()) {
            arrayList.add(getChildAt(this.f15919c));
        } else if (getChildCount() > 0) {
            arrayList.add(getChildAt(getDefaultFocusIndex()));
        }
    }

    public int getDefaultFocusIndex() {
        if (this.f15920d) {
            return getChildCount() / 2;
        }
        return 0;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.f15917a <= 0) {
            return;
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < getChildCount() - 1) {
            View childAt = getChildAt(i11);
            i11++;
            View childAt2 = getChildAt(i11);
            int measuredWidth = this.f15917a - ((childAt2.getMeasuredWidth() + childAt.getMeasuredWidth()) / 2);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
            int marginStart = measuredWidth - layoutParams.getMarginStart();
            layoutParams.setMarginStart(measuredWidth);
            childAt2.setLayoutParams(layoutParams);
            i12 += marginStart;
        }
        setMeasuredDimension(getMeasuredWidth() + i12, getMeasuredHeight());
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i7, Rect rect) {
        if (getChildCount() > 0) {
            int i10 = this.f15919c;
            if (getChildAt((i10 < 0 || i10 >= getChildCount()) ? getDefaultFocusIndex() : this.f15919c).requestFocus(i7, rect)) {
                return true;
            }
        }
        return super.onRequestFocusInDescendants(i7, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        this.f15919c = indexOfChild(view);
        Y y10 = this.f15918b;
        if (y10 == null) {
            return;
        }
        C0067b0 c0067b0 = (C0067b0) ((T) y10).f964a;
        if (c0067b0.f1064i.f1088c == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = c0067b0.g;
            if (i7 >= sparseArray.size()) {
                return;
            }
            if (((C0109l2) sparseArray.get(i7)).f1271a == view) {
                d3 d3Var = c0067b0.f1064i.f1088c;
                C0109l2 c0109l2 = (C0109l2) sparseArray.get(i7);
                Object obj = c0067b0.f1058b.f1233c.get(i7);
                C0093h2 c0093h2 = c0067b0.f1059c;
                d3Var.getClass();
                C0101j2 c0101j2 = c0093h2.f1221c;
                if (c0101j2.f1242E == c0109l2 && c0101j2.f1243F == obj) {
                    return;
                }
                c0101j2.f1242E = c0109l2;
                c0101j2.f1243F = obj;
                c0101j2.c();
                return;
            }
            i7++;
        }
    }

    public void setChildMarginFromCenter(int i7) {
        this.f15917a = i7;
    }

    public void setDefaultFocusToMiddle(boolean z8) {
        this.f15920d = z8;
    }

    public void setOnChildFocusedListener(Y y10) {
        this.f15918b = y10;
    }
}
