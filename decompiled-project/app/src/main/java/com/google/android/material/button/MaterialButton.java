package com.google.android.material.button;

import D6.a;
import E6.b;
import L7.j;
import Q5.e;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import c6.AbstractC0911a;
import i1.C1290a;
import j6.C1382b;
import j6.C1383c;
import j6.InterfaceC1381a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l1.AbstractC1449a;
import s6.o;
import w6.AbstractC2221a;
import y1.K;
import y6.C2395a;
import y6.C2404j;
import y6.t;

/* loaded from: classes.dex */
public class MaterialButton extends AppCompatButton implements Checkable, t {

    /* renamed from: F, reason: collision with root package name */
    public static final int[] f15234F = {R.attr.state_checkable};

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f15235G = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public int f15236A;

    /* renamed from: B, reason: collision with root package name */
    public int f15237B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f15238C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f15239D;

    /* renamed from: E, reason: collision with root package name */
    public int f15240E;

    /* renamed from: d, reason: collision with root package name */
    public final C1383c f15241d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f15242e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC1381a f15243f;

    /* renamed from: u, reason: collision with root package name */
    public PorterDuff.Mode f15244u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f15245v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f15246w;

    /* renamed from: x, reason: collision with root package name */
    public String f15247x;

    /* renamed from: y, reason: collision with root package name */
    public int f15248y;

    /* renamed from: z, reason: collision with root package name */
    public int f15249z;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.kt.apps.media.xemtv.beta.R.attr.materialButtonStyle, com.kt.apps.media.xemtv.beta.R.style.Widget_MaterialComponents_Button), attributeSet, com.kt.apps.media.xemtv.beta.R.attr.materialButtonStyle);
        this.f15242e = new LinkedHashSet();
        this.f15238C = false;
        this.f15239D = false;
        Context context2 = getContext();
        TypedArray g = o.g(context2, attributeSet, AbstractC0911a.f14411m, com.kt.apps.media.xemtv.beta.R.attr.materialButtonStyle, com.kt.apps.media.xemtv.beta.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f15237B = g.getDimensionPixelSize(12, 0);
        int i7 = g.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f15244u = o.h(i7, mode);
        this.f15245v = Tb.a.n(getContext(), g, 14);
        this.f15246w = Tb.a.p(getContext(), g, 10);
        this.f15240E = g.getInteger(11, 1);
        this.f15248y = g.getDimensionPixelSize(13, 0);
        C1383c c1383c = new C1383c(this, C2404j.b(context2, attributeSet, com.kt.apps.media.xemtv.beta.R.attr.materialButtonStyle, com.kt.apps.media.xemtv.beta.R.style.Widget_MaterialComponents_Button).c());
        this.f15241d = c1383c;
        c1383c.f18650c = g.getDimensionPixelOffset(1, 0);
        c1383c.f18651d = g.getDimensionPixelOffset(2, 0);
        c1383c.f18652e = g.getDimensionPixelOffset(3, 0);
        c1383c.f18653f = g.getDimensionPixelOffset(4, 0);
        if (g.hasValue(8)) {
            int dimensionPixelSize = g.getDimensionPixelSize(8, -1);
            c1383c.g = dimensionPixelSize;
            float f4 = dimensionPixelSize;
            j e2 = c1383c.f18649b.e();
            e2.f6360f = new C2395a(f4);
            e2.g = new C2395a(f4);
            e2.f6361h = new C2395a(f4);
            e2.f6362i = new C2395a(f4);
            c1383c.c(e2.c());
            c1383c.f18660p = true;
        }
        c1383c.f18654h = g.getDimensionPixelSize(20, 0);
        c1383c.f18655i = o.h(g.getInt(7, -1), mode);
        c1383c.j = Tb.a.n(getContext(), g, 6);
        c1383c.k = Tb.a.n(getContext(), g, 19);
        c1383c.f18656l = Tb.a.n(getContext(), g, 16);
        c1383c.f18661q = g.getBoolean(5, false);
        c1383c.f18664t = g.getDimensionPixelSize(9, 0);
        c1383c.f18662r = g.getBoolean(21, true);
        WeakHashMap weakHashMap = K.f26642a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (g.hasValue(0)) {
            c1383c.f18659o = true;
            setSupportBackgroundTintList(c1383c.j);
            setSupportBackgroundTintMode(c1383c.f18655i);
        } else {
            c1383c.e();
        }
        setPaddingRelative(paddingStart + c1383c.f18650c, paddingTop + c1383c.f18652e, paddingEnd + c1383c.f18651d, paddingBottom + c1383c.f18653f);
        g.recycle();
        setCompoundDrawablePadding(this.f15237B);
        d(this.f15246w != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f4 = 0.0f;
        for (int i7 = 0; i7 < lineCount; i7++) {
            f4 = Math.max(f4, getLayout().getLineWidth(i7));
        }
        return (int) Math.ceil(f4);
    }

    public final boolean a() {
        C1383c c1383c = this.f15241d;
        return c1383c != null && c1383c.f18661q;
    }

    public final boolean b() {
        C1383c c1383c = this.f15241d;
        return (c1383c == null || c1383c.f18659o) ? false : true;
    }

    public final void c() {
        int i7 = this.f15240E;
        boolean z8 = true;
        if (i7 != 1 && i7 != 2) {
            z8 = false;
        }
        if (z8) {
            setCompoundDrawablesRelative(this.f15246w, null, null, null);
            return;
        }
        if (i7 == 3 || i7 == 4) {
            setCompoundDrawablesRelative(null, null, this.f15246w, null);
        } else if (i7 == 16 || i7 == 32) {
            setCompoundDrawablesRelative(null, this.f15246w, null, null);
        }
    }

    public final void d(boolean z8) {
        Drawable drawable = this.f15246w;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f15246w = mutate;
            mutate.setTintList(this.f15245v);
            PorterDuff.Mode mode = this.f15244u;
            if (mode != null) {
                this.f15246w.setTintMode(mode);
            }
            int i7 = this.f15248y;
            if (i7 == 0) {
                i7 = this.f15246w.getIntrinsicWidth();
            }
            int i10 = this.f15248y;
            if (i10 == 0) {
                i10 = this.f15246w.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f15246w;
            int i11 = this.f15249z;
            int i12 = this.f15236A;
            drawable2.setBounds(i11, i12, i7 + i11, i10 + i12);
            this.f15246w.setVisible(true, z8);
        }
        if (z8) {
            c();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i13 = this.f15240E;
        if (((i13 == 1 || i13 == 2) && drawable3 != this.f15246w) || (((i13 == 3 || i13 == 4) && drawable5 != this.f15246w) || ((i13 == 16 || i13 == 32) && drawable4 != this.f15246w))) {
            c();
        }
    }

    public final void e(int i7, int i10) {
        if (this.f15246w == null || getLayout() == null) {
            return;
        }
        int i11 = this.f15240E;
        if (!(i11 == 1 || i11 == 2) && i11 != 3 && i11 != 4) {
            if (i11 == 16 || i11 == 32) {
                this.f15249z = 0;
                if (i11 == 16) {
                    this.f15236A = 0;
                    d(false);
                    return;
                }
                int i12 = this.f15248y;
                if (i12 == 0) {
                    i12 = this.f15246w.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i10 - getTextHeight()) - getPaddingTop()) - i12) - this.f15237B) - getPaddingBottom()) / 2);
                if (this.f15236A != max) {
                    this.f15236A = max;
                    d(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f15236A = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i13 = this.f15240E;
        if (i13 == 1 || i13 == 3 || ((i13 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i13 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f15249z = 0;
            d(false);
            return;
        }
        int i14 = this.f15248y;
        if (i14 == 0) {
            i14 = this.f15246w.getIntrinsicWidth();
        }
        int textLayoutWidth = i7 - getTextLayoutWidth();
        WeakHashMap weakHashMap = K.f26642a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - i14) - this.f15237B) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f15240E == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f15249z != paddingEnd) {
            this.f15249z = paddingEnd;
            d(false);
        }
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f15247x)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.f15247x;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (b()) {
            return this.f15241d.g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f15246w;
    }

    public int getIconGravity() {
        return this.f15240E;
    }

    public int getIconPadding() {
        return this.f15237B;
    }

    public int getIconSize() {
        return this.f15248y;
    }

    public ColorStateList getIconTint() {
        return this.f15245v;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f15244u;
    }

    public int getInsetBottom() {
        return this.f15241d.f18653f;
    }

    public int getInsetTop() {
        return this.f15241d.f18652e;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.f15241d.f18656l;
        }
        return null;
    }

    public C2404j getShapeAppearanceModel() {
        if (b()) {
            return this.f15241d.f18649b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.f15241d.k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.f15241d.f18654h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return b() ? this.f15241d.j : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return b() ? this.f15241d.f18655i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f15238C;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b()) {
            b.A(this, this.f15241d.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i7) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i7 + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, f15234F);
        }
        if (this.f15238C) {
            View.mergeDrawableStates(onCreateDrawableState, f15235G);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f15238C);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(this.f15238C);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        super.onLayout(z8, i7, i10, i11, i12);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1382b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1382b c1382b = (C1382b) parcelable;
        super.onRestoreInstanceState(c1382b.f4568a);
        setChecked(c1382b.f18647c);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [j6.b, android.os.Parcelable, H1.b] */
    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new H1.b(super.onSaveInstanceState());
        bVar.f18647c = this.f15238C;
        return bVar;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f15241d.f18662r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f15246w != null) {
            if (this.f15246w.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f15247x = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        if (!b()) {
            super.setBackgroundColor(i7);
            return;
        }
        C1383c c1383c = this.f15241d;
        if (c1383c.b(false) != null) {
            c1383c.b(false).setTint(i7);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!b()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        C1383c c1383c = this.f15241d;
        c1383c.f18659o = true;
        ColorStateList colorStateList = c1383c.j;
        MaterialButton materialButton = c1383c.f18648a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(c1383c.f18655i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i7) {
        setBackgroundDrawable(i7 != 0 ? e.x(getContext(), i7) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z8) {
        if (b()) {
            this.f15241d.f18661q = z8;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z8) {
        if (a() && isEnabled() && this.f15238C != z8) {
            this.f15238C = z8;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z10 = this.f15238C;
                if (!materialButtonToggleGroup.f15256f) {
                    materialButtonToggleGroup.b(getId(), z10);
                }
            }
            if (this.f15239D) {
                return;
            }
            this.f15239D = true;
            Iterator it = this.f15242e.iterator();
            if (it.hasNext()) {
                throw h3.o.j(it);
            }
            this.f15239D = false;
        }
    }

    public void setCornerRadius(int i7) {
        if (b()) {
            C1383c c1383c = this.f15241d;
            if (c1383c.f18660p && c1383c.g == i7) {
                return;
            }
            c1383c.g = i7;
            c1383c.f18660p = true;
            float f4 = i7;
            j e2 = c1383c.f18649b.e();
            e2.f6360f = new C2395a(f4);
            e2.g = new C2395a(f4);
            e2.f6361h = new C2395a(f4);
            e2.f6362i = new C2395a(f4);
            c1383c.c(e2.c());
        }
    }

    public void setCornerRadiusResource(int i7) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i7));
        }
    }

    @Override // android.view.View
    public void setElevation(float f4) {
        super.setElevation(f4);
        if (b()) {
            this.f15241d.b(false).j(f4);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f15246w != drawable) {
            this.f15246w = drawable;
            d(true);
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i7) {
        if (this.f15240E != i7) {
            this.f15240E = i7;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i7) {
        if (this.f15237B != i7) {
            this.f15237B = i7;
            setCompoundDrawablePadding(i7);
        }
    }

    public void setIconResource(int i7) {
        setIcon(i7 != 0 ? e.x(getContext(), i7) : null);
    }

    public void setIconSize(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f15248y != i7) {
            this.f15248y = i7;
            d(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f15245v != colorStateList) {
            this.f15245v = colorStateList;
            d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f15244u != mode) {
            this.f15244u = mode;
            d(false);
        }
    }

    public void setIconTintResource(int i7) {
        setIconTint(AbstractC1449a.getColorStateList(getContext(), i7));
    }

    public void setInsetBottom(int i7) {
        C1383c c1383c = this.f15241d;
        c1383c.d(c1383c.f18652e, i7);
    }

    public void setInsetTop(int i7) {
        C1383c c1383c = this.f15241d;
        c1383c.d(i7, c1383c.f18653f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC1381a interfaceC1381a) {
        this.f15243f = interfaceC1381a;
    }

    @Override // android.view.View
    public void setPressed(boolean z8) {
        InterfaceC1381a interfaceC1381a = this.f15243f;
        if (interfaceC1381a != null) {
            ((MaterialButtonToggleGroup) ((C1290a) interfaceC1381a).f18187b).invalidate();
        }
        super.setPressed(z8);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            C1383c c1383c = this.f15241d;
            if (c1383c.f18656l != colorStateList) {
                c1383c.f18656l = colorStateList;
                MaterialButton materialButton = c1383c.f18648a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(AbstractC2221a.b(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i7) {
        if (b()) {
            setRippleColor(AbstractC1449a.getColorStateList(getContext(), i7));
        }
    }

    @Override // y6.t
    public void setShapeAppearanceModel(C2404j c2404j) {
        if (!b()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f15241d.c(c2404j);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z8) {
        if (b()) {
            C1383c c1383c = this.f15241d;
            c1383c.f18658n = z8;
            c1383c.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            C1383c c1383c = this.f15241d;
            if (c1383c.k != colorStateList) {
                c1383c.k = colorStateList;
                c1383c.f();
            }
        }
    }

    public void setStrokeColorResource(int i7) {
        if (b()) {
            setStrokeColor(AbstractC1449a.getColorStateList(getContext(), i7));
        }
    }

    public void setStrokeWidth(int i7) {
        if (b()) {
            C1383c c1383c = this.f15241d;
            if (c1383c.f18654h != i7) {
                c1383c.f18654h = i7;
                c1383c.f();
            }
        }
    }

    public void setStrokeWidthResource(int i7) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i7));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!b()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C1383c c1383c = this.f15241d;
        if (c1383c.j != colorStateList) {
            c1383c.j = colorStateList;
            if (c1383c.b(false) != null) {
                c1383c.b(false).setTintList(c1383c.j);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!b()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C1383c c1383c = this.f15241d;
        if (c1383c.f18655i != mode) {
            c1383c.f18655i = mode;
            if (c1383c.b(false) == null || c1383c.f18655i == null) {
                return;
            }
            c1383c.b(false).setTintMode(c1383c.f18655i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i7) {
        super.setTextAlignment(i7);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z8) {
        this.f15241d.f18662r = z8;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f15238C);
    }
}
