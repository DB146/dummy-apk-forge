package com.kt.apps.core.base.leanback;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class NonOverlappingLinearLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f15970a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15971b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f15972c;

    public NonOverlappingLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f15970a = false;
        this.f15972c = new ArrayList();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void focusableViewAvailable(View view) {
        int i7;
        if (!this.f15971b) {
            super.focusableViewAvailable(view);
            return;
        }
        for (View view2 = view; view2 != this && view2 != null; view2 = (View) view2.getParent()) {
            if (view2.getParent() == this) {
                i7 = indexOfChild(view2);
                break;
            }
        }
        i7 = -1;
        if (i7 != -1) {
            ((ArrayList) this.f15972c.get(i7)).add(view);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        ArrayList arrayList = this.f15972c;
        int i13 = 0;
        try {
            boolean z10 = this.f15970a && getOrientation() == 0 && getLayoutDirection() == 1;
            this.f15971b = z10;
            if (z10) {
                while (arrayList.size() > getChildCount()) {
                    arrayList.remove(arrayList.size() - 1);
                }
                while (arrayList.size() < getChildCount()) {
                    arrayList.add(new ArrayList());
                }
            }
            super.onLayout(z8, i7, i10, i11, i12);
            if (this.f15971b) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    for (int i15 = 0; i15 < ((ArrayList) arrayList.get(i14)).size(); i15++) {
                        super.focusableViewAvailable((View) ((ArrayList) arrayList.get(i14)).get(i15));
                    }
                }
            }
            if (this.f15971b) {
                this.f15971b = false;
                while (i13 < arrayList.size()) {
                    ((ArrayList) arrayList.get(i13)).clear();
                    i13++;
                }
            }
        } catch (Throwable th) {
            if (this.f15971b) {
                this.f15971b = false;
                while (i13 < arrayList.size()) {
                    ((ArrayList) arrayList.get(i13)).clear();
                    i13++;
                }
            }
            throw th;
        }
    }

    public void setFocusableViewAvailableFixEnabled(boolean z8) {
        this.f15970a = z8;
    }
}
