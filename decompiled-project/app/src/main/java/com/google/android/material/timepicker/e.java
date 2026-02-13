package com.google.android.material.timepicker;

import A9.S2;
import L7.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import c6.AbstractC0911a;
import com.kt.apps.media.xemtv.beta.R;
import java.util.WeakHashMap;
import y1.K;
import y6.C2401g;
import y6.C2402h;

/* loaded from: classes.dex */
public abstract class e extends ConstraintLayout {

    /* renamed from: E, reason: collision with root package name */
    public final S2 f15554E;

    /* renamed from: F, reason: collision with root package name */
    public int f15555F;

    /* renamed from: G, reason: collision with root package name */
    public final C2401g f15556G;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C2401g c2401g = new C2401g();
        this.f15556G = c2401g;
        C2402h c2402h = new C2402h(0.5f);
        j e2 = c2401g.f27035a.f27011a.e();
        e2.f6360f = c2402h;
        e2.g = c2402h;
        e2.f6361h = c2402h;
        e2.f6362i = c2402h;
        c2401g.setShapeAppearanceModel(e2.c());
        this.f15556G.k(ColorStateList.valueOf(-1));
        C2401g c2401g2 = this.f15556G;
        WeakHashMap weakHashMap = K.f26642a;
        setBackground(c2401g2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0911a.f14421w, R.attr.materialClockStyle, 0);
        this.f15555F = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f15554E = new S2(this, 24);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = K.f26642a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            S2 s22 = this.f15554E;
            handler.removeCallbacks(s22);
            handler.post(s22);
        }
    }

    public abstract void m();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            S2 s22 = this.f15554E;
            handler.removeCallbacks(s22);
            handler.post(s22);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i7) {
        this.f15556G.k(ColorStateList.valueOf(i7));
    }
}
