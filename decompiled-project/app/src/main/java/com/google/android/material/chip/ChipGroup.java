package com.google.android.material.chip;

import D6.a;
import U2.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import c6.AbstractC0911a;
import com.kt.apps.media.xemtv.beta.R;
import i1.C1290a;
import ia.C1358d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import m6.C1631g;
import m6.InterfaceC1632h;
import m6.InterfaceC1633i;
import m6.ViewGroupOnHierarchyChangeListenerC1634j;
import s6.AbstractC1994d;
import s6.InterfaceC1997g;
import s6.o;
import y1.C2355c;
import y1.K;

/* loaded from: classes.dex */
public class ChipGroup extends AbstractC1994d {

    /* renamed from: e, reason: collision with root package name */
    public int f15285e;

    /* renamed from: f, reason: collision with root package name */
    public int f15286f;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC1633i f15287u;

    /* renamed from: v, reason: collision with root package name */
    public final b f15288v;

    /* renamed from: w, reason: collision with root package name */
    public final int f15289w;

    /* renamed from: x, reason: collision with root package name */
    public final ViewGroupOnHierarchyChangeListenerC1634j f15290x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChipGroup(Context context, AttributeSet attributeSet) {
        super(r11, attributeSet, R.attr.chipGroupStyle);
        Context a9 = a.a(context, attributeSet, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup);
        this.f24158c = false;
        TypedArray obtainStyledAttributes = a9.getTheme().obtainStyledAttributes(attributeSet, AbstractC0911a.j, 0, 0);
        this.f24156a = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f24157b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        b bVar = new b();
        this.f15288v = bVar;
        ViewGroupOnHierarchyChangeListenerC1634j viewGroupOnHierarchyChangeListenerC1634j = new ViewGroupOnHierarchyChangeListenerC1634j(this);
        this.f15290x = viewGroupOnHierarchyChangeListenerC1634j;
        TypedArray g = o.g(getContext(), attributeSet, AbstractC0911a.f14406e, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = g.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(g.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(g.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(g.getBoolean(5, false));
        setSingleSelection(g.getBoolean(6, false));
        setSelectionRequired(g.getBoolean(4, false));
        this.f15289w = g.getResourceId(0, -1);
        g.recycle();
        bVar.f9510e = new C1358d(this, 3);
        super.setOnHierarchyChangeListener(viewGroupOnHierarchyChangeListenerC1634j);
        WeakHashMap weakHashMap = K.f26642a;
        setImportantForAccessibility(1);
    }

    private int getVisibleChipCount() {
        int i7 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if ((getChildAt(i10) instanceof Chip) && getChildAt(i10).getVisibility() == 0) {
                i7++;
            }
        }
        return i7;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C1631g);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public int getCheckedChipId() {
        return this.f15288v.f();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f15288v.d(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f15285e;
    }

    public int getChipSpacingVertical() {
        return this.f15286f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i7 = this.f15289w;
        if (i7 != -1) {
            b bVar = this.f15288v;
            InterfaceC1997g interfaceC1997g = (InterfaceC1997g) ((HashMap) bVar.f9508c).get(Integer.valueOf(i7));
            if (interfaceC1997g != null && bVar.b(interfaceC1997g)) {
                bVar.g();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C2355c.g(getRowCount(), this.f24158c ? getVisibleChipCount() : -1, this.f15288v.f9506a ? 1 : 2).f26687a);
    }

    public void setChipSpacing(int i7) {
        setChipSpacingHorizontal(i7);
        setChipSpacingVertical(i7);
    }

    public void setChipSpacingHorizontal(int i7) {
        if (this.f15285e != i7) {
            this.f15285e = i7;
            setItemSpacing(i7);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i7) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i7));
    }

    public void setChipSpacingResource(int i7) {
        setChipSpacing(getResources().getDimensionPixelOffset(i7));
    }

    public void setChipSpacingVertical(int i7) {
        if (this.f15286f != i7) {
            this.f15286f = i7;
            setLineSpacing(i7);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i7) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i7));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i7) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(InterfaceC1632h interfaceC1632h) {
        if (interfaceC1632h == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new C1290a(this, 8));
        }
    }

    public void setOnCheckedStateChangeListener(InterfaceC1633i interfaceC1633i) {
        this.f15287u = interfaceC1633i;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f15290x.f20752a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z8) {
        this.f15288v.f9507b = z8;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i7) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i7) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i7) {
        setSingleLine(getResources().getBoolean(i7));
    }

    @Override // s6.AbstractC1994d
    public void setSingleLine(boolean z8) {
        super.setSingleLine(z8);
    }

    public void setSingleSelection(int i7) {
        setSingleSelection(getResources().getBoolean(i7));
    }

    public void setSingleSelection(boolean z8) {
        b bVar = this.f15288v;
        if (bVar.f9506a != z8) {
            bVar.f9506a = z8;
            boolean isEmpty = ((HashSet) bVar.f9509d).isEmpty();
            Iterator it = ((HashMap) bVar.f9508c).values().iterator();
            while (it.hasNext()) {
                bVar.h((InterfaceC1997g) it.next(), false);
            }
            if (isEmpty) {
                return;
            }
            bVar.g();
        }
    }
}
