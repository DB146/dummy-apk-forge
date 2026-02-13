package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import c6.AbstractC0911a;
import com.kt.apps.media.xemtv.beta.R;
import g1.j;
import g1.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l1.AbstractC1449a;
import y1.C2355c;
import y1.K;

/* loaded from: classes.dex */
class ClockFaceView extends e implements d {

    /* renamed from: H, reason: collision with root package name */
    public final ClockHandView f15522H;

    /* renamed from: I, reason: collision with root package name */
    public final Rect f15523I;

    /* renamed from: J, reason: collision with root package name */
    public final RectF f15524J;

    /* renamed from: K, reason: collision with root package name */
    public final Rect f15525K;
    public final SparseArray L;

    /* renamed from: M, reason: collision with root package name */
    public final c f15526M;

    /* renamed from: N, reason: collision with root package name */
    public final int[] f15527N;

    /* renamed from: O, reason: collision with root package name */
    public final float[] f15528O;

    /* renamed from: P, reason: collision with root package name */
    public final int f15529P;

    /* renamed from: Q, reason: collision with root package name */
    public final int f15530Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f15531R;

    /* renamed from: S, reason: collision with root package name */
    public final int f15532S;

    /* renamed from: T, reason: collision with root package name */
    public final String[] f15533T;

    /* renamed from: U, reason: collision with root package name */
    public float f15534U;

    /* renamed from: V, reason: collision with root package name */
    public final ColorStateList f15535V;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15523I = new Rect();
        this.f15524J = new RectF();
        this.f15525K = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.L = sparseArray;
        this.f15528O = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0911a.f14407f, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList n6 = Tb.a.n(context, obtainStyledAttributes, 1);
        this.f15535V = n6;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f15522H = clockHandView;
        this.f15529P = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = n6.getColorForState(new int[]{android.R.attr.state_selected}, n6.getDefaultColor());
        this.f15527N = new int[]{colorForState, colorForState, n6.getDefaultColor()};
        clockHandView.f15539c.add(this);
        int defaultColor = AbstractC1449a.getColorStateList(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList n8 = Tb.a.n(context, obtainStyledAttributes, 0);
        setBackgroundColor(n8 != null ? n8.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f15526M = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f15533T = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z8 = false;
        for (int i7 = 0; i7 < Math.max(this.f15533T.length, size); i7++) {
            TextView textView = (TextView) sparseArray.get(i7);
            if (i7 >= this.f15533T.length) {
                removeView(textView);
                sparseArray.remove(i7);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i7, textView);
                    addView(textView);
                }
                textView.setText(this.f15533T[i7]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i7));
                int i10 = (i7 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i10));
                z8 = i10 > 1 ? true : z8;
                K.n(textView, this.f15526M);
                textView.setTextColor(this.f15535V);
            }
        }
        ClockHandView clockHandView2 = this.f15522H;
        if (clockHandView2.f15538b && !z8) {
            clockHandView2.f15536A = 1;
        }
        clockHandView2.f15538b = z8;
        clockHandView2.invalidate();
        this.f15530Q = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f15531R = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f15532S = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.e
    public final void m() {
        n nVar = new n();
        nVar.b(this);
        HashMap hashMap = new HashMap();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i10 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i10 == null) {
                    i10 = 1;
                }
                if (!hashMap.containsKey(i10)) {
                    hashMap.put(i10, new ArrayList());
                }
                ((List) hashMap.get(i10)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            int round = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f15555F * 0.66f) : this.f15555F;
            Iterator it = list.iterator();
            float f4 = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap hashMap2 = nVar.f17421c;
                if (!hashMap2.containsKey(Integer.valueOf(id))) {
                    hashMap2.put(Integer.valueOf(id), new g1.i());
                }
                j jVar = ((g1.i) hashMap2.get(Integer.valueOf(id))).f17326d;
                jVar.f17392z = R.id.circle_center;
                jVar.f17330A = round;
                jVar.f17331B = f4;
                f4 += 360.0f / list.size();
            }
        }
        nVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.L;
            if (i11 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i11)).setVisibility(0);
            i11++;
        }
    }

    public final void n() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f15522H.f15543u;
        float f4 = Float.MAX_VALUE;
        TextView textView = null;
        int i7 = 0;
        while (true) {
            sparseArray = this.L;
            int size = sparseArray.size();
            rectF = this.f15524J;
            rect = this.f15523I;
            if (i7 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i7);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f4) {
                    textView = textView2;
                    f4 = height;
                }
            }
            i7++;
        }
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            TextView textView3 = (TextView) sparseArray.get(i10);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f15525K);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f15527N, this.f15528O, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C2355c.g(1, this.f15533T.length, 1).f26687a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        super.onLayout(z8, i7, i10, i11, i12);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f15532S / Math.max(Math.max(this.f15530Q / displayMetrics.heightPixels, this.f15531R / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
