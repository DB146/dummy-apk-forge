package com.google.android.material.button;

import B0.O;
import D6.a;
import L7.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import c6.AbstractC0911a;
import com.google.android.material.datepicker.i;
import com.google.android.material.timepicker.f;
import com.kt.apps.media.xemtv.beta.R;
import i1.C1290a;
import j6.C1384d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import s6.o;
import y1.C2355c;
import y1.K;
import y6.C2395a;
import y6.C2404j;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f15250y = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f15251a;

    /* renamed from: b, reason: collision with root package name */
    public final C1290a f15252b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f15253c;

    /* renamed from: d, reason: collision with root package name */
    public final O f15254d;

    /* renamed from: e, reason: collision with root package name */
    public Integer[] f15255e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15256f;

    /* renamed from: u, reason: collision with root package name */
    public boolean f15257u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f15258v;

    /* renamed from: w, reason: collision with root package name */
    public final int f15259w;

    /* renamed from: x, reason: collision with root package name */
    public HashSet f15260x;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f15251a = new ArrayList();
        this.f15252b = new C1290a(this, 4);
        this.f15253c = new LinkedHashSet();
        this.f15254d = new O(this, 2);
        this.f15256f = false;
        this.f15260x = new HashSet();
        TypedArray g = o.g(getContext(), attributeSet, AbstractC0911a.f14412n, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(g.getBoolean(3, false));
        this.f15259w = g.getResourceId(1, -1);
        this.f15258v = g.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(g.getBoolean(0, true));
        g.recycle();
        WeakHashMap weakHashMap = K.f26642a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            if (c(i7)) {
                return i7;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i7 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if ((getChildAt(i10) instanceof MaterialButton) && c(i10)) {
                i7++;
            }
        }
        return i7;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = K.f26642a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f15252b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i7 = firstVisibleChildIndex + 1; i7 < getChildCount(); i7++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i7);
            int min = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i7 - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-min);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -min;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i7, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.f15238C);
        C2404j shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f15251a.add(new C1384d(shapeAppearanceModel.f27052e, shapeAppearanceModel.f27054h, shapeAppearanceModel.f27053f, shapeAppearanceModel.g));
        materialButton.setEnabled(isEnabled());
        K.n(materialButton, new i(this, 3));
    }

    public final void b(int i7, boolean z8) {
        if (i7 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i7);
            return;
        }
        HashSet hashSet = new HashSet(this.f15260x);
        if (z8 && !hashSet.contains(Integer.valueOf(i7))) {
            if (this.f15257u && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i7));
        } else {
            if (z8 || !hashSet.contains(Integer.valueOf(i7))) {
                return;
            }
            if (!this.f15258v || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i7));
            }
        }
        d(hashSet);
    }

    public final boolean c(int i7) {
        return getChildAt(i7).getVisibility() != 8;
    }

    public final void d(Set set) {
        HashSet hashSet = this.f15260x;
        this.f15260x = new HashSet(set);
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            int id = ((MaterialButton) getChildAt(i7)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f15256f = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f15256f = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f15253c.iterator();
                while (it.hasNext()) {
                    ((f) it.next()).a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f15254d);
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            treeMap.put((MaterialButton) getChildAt(i7), Integer.valueOf(i7));
        }
        this.f15255e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        C1384d c1384d;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i7 = 0; i7 < childCount; i7++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i7);
            if (materialButton.getVisibility() != 8) {
                j e2 = materialButton.getShapeAppearanceModel().e();
                C1384d c1384d2 = (C1384d) this.f15251a.get(i7);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z8 = getOrientation() == 0;
                    C2395a c2395a = C1384d.f18665e;
                    if (i7 == firstVisibleChildIndex) {
                        c1384d = z8 ? o.f(this) ? new C1384d(c2395a, c2395a, c1384d2.f18667b, c1384d2.f18668c) : new C1384d(c1384d2.f18666a, c1384d2.f18669d, c2395a, c2395a) : new C1384d(c1384d2.f18666a, c2395a, c1384d2.f18667b, c2395a);
                    } else if (i7 == lastVisibleChildIndex) {
                        c1384d = z8 ? o.f(this) ? new C1384d(c1384d2.f18666a, c1384d2.f18669d, c2395a, c2395a) : new C1384d(c2395a, c2395a, c1384d2.f18667b, c1384d2.f18668c) : new C1384d(c2395a, c1384d2.f18669d, c2395a, c1384d2.f18668c);
                    } else {
                        c1384d2 = null;
                    }
                    c1384d2 = c1384d;
                }
                if (c1384d2 == null) {
                    e2.f6360f = new C2395a(0.0f);
                    e2.g = new C2395a(0.0f);
                    e2.f6361h = new C2395a(0.0f);
                    e2.f6362i = new C2395a(0.0f);
                } else {
                    e2.f6360f = c1384d2.f18666a;
                    e2.f6362i = c1384d2.f18669d;
                    e2.g = c1384d2.f18667b;
                    e2.f6361h = c1384d2.f18668c;
                }
                materialButton.setShapeAppearanceModel(e2.c());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f15257u || this.f15260x.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f15260x.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            int id = ((MaterialButton) getChildAt(i7)).getId();
            if (this.f15260x.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i7, int i10) {
        Integer[] numArr = this.f15255e;
        if (numArr != null && i10 < numArr.length) {
            return numArr[i10].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i10;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i7 = this.f15259w;
        if (i7 != -1) {
            d(Collections.singleton(Integer.valueOf(i7)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C2355c.g(1, getVisibleButtonCount(), this.f15257u ? 1 : 2).f26687a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        e();
        a();
        super.onMeasure(i7, i10);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f15251a.remove(indexOfChild);
        }
        e();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z8) {
        super.setEnabled(z8);
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            ((MaterialButton) getChildAt(i7)).setEnabled(z8);
        }
    }

    public void setSelectionRequired(boolean z8) {
        this.f15258v = z8;
    }

    public void setSingleSelection(int i7) {
        setSingleSelection(getResources().getBoolean(i7));
    }

    public void setSingleSelection(boolean z8) {
        if (this.f15257u != z8) {
            this.f15257u = z8;
            d(new HashSet());
        }
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            ((MaterialButton) getChildAt(i7)).setA11yClassName((this.f15257u ? RadioButton.class : ToggleButton.class).getName());
        }
    }
}
