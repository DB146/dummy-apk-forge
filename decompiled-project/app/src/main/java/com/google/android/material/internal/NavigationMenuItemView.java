package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.datepicker.i;
import java.util.WeakHashMap;
import n.C1680n;
import n.InterfaceC1691y;
import n1.k;
import o.C1755q0;
import s6.AbstractC1995e;
import y1.K;
import y7.u0;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC1995e implements InterfaceC1691y {

    /* renamed from: U, reason: collision with root package name */
    public static final int[] f15406U = {R.attr.state_checked};

    /* renamed from: J, reason: collision with root package name */
    public int f15407J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f15408K;
    public boolean L;

    /* renamed from: M, reason: collision with root package name */
    public final boolean f15409M;

    /* renamed from: N, reason: collision with root package name */
    public final CheckedTextView f15410N;

    /* renamed from: O, reason: collision with root package name */
    public FrameLayout f15411O;

    /* renamed from: P, reason: collision with root package name */
    public C1680n f15412P;

    /* renamed from: Q, reason: collision with root package name */
    public ColorStateList f15413Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f15414R;

    /* renamed from: S, reason: collision with root package name */
    public Drawable f15415S;

    /* renamed from: T, reason: collision with root package name */
    public final i f15416T;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15409M = true;
        i iVar = new i(this, 5);
        this.f15416T = iVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.kt.apps.media.xemtv.beta.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.kt.apps.media.xemtv.beta.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.kt.apps.media.xemtv.beta.R.id.design_menu_item_text);
        this.f15410N = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        K.n(checkedTextView, iVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f15411O == null) {
                this.f15411O = (FrameLayout) ((ViewStub) findViewById(com.kt.apps.media.xemtv.beta.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f15411O.removeAllViews();
            this.f15411O.addView(view);
        }
    }

    @Override // n.InterfaceC1691y
    public final void a(C1680n c1680n) {
        StateListDrawable stateListDrawable;
        this.f15412P = c1680n;
        int i7 = c1680n.f20985a;
        if (i7 > 0) {
            setId(i7);
        }
        setVisibility(c1680n.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.kt.apps.media.xemtv.beta.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f15406U, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = K.f26642a;
            setBackground(stateListDrawable);
        }
        setCheckable(c1680n.isCheckable());
        setChecked(c1680n.isChecked());
        setEnabled(c1680n.isEnabled());
        setTitle(c1680n.f20989e);
        setIcon(c1680n.getIcon());
        setActionView(c1680n.getActionView());
        setContentDescription(c1680n.f20973E);
        u0.K(this, c1680n.f20974F);
        C1680n c1680n2 = this.f15412P;
        CharSequence charSequence = c1680n2.f20989e;
        CheckedTextView checkedTextView = this.f15410N;
        if (charSequence == null && c1680n2.getIcon() == null && this.f15412P.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f15411O;
            if (frameLayout != null) {
                C1755q0 c1755q0 = (C1755q0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c1755q0).width = -1;
                this.f15411O.setLayoutParams(c1755q0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f15411O;
        if (frameLayout2 != null) {
            C1755q0 c1755q02 = (C1755q0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c1755q02).width = -2;
            this.f15411O.setLayoutParams(c1755q02);
        }
    }

    @Override // n.InterfaceC1691y
    public C1680n getItemData() {
        return this.f15412P;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i7) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i7 + 1);
        C1680n c1680n = this.f15412P;
        if (c1680n != null && c1680n.isCheckable() && this.f15412P.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f15406U);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z8) {
        refreshDrawableState();
        if (this.L != z8) {
            this.L = z8;
            this.f15416T.h(this.f15410N, 2048);
        }
    }

    public void setChecked(boolean z8) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f15410N;
        checkedTextView.setChecked(z8);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z8 && this.f15409M) ? 1 : 0);
    }

    public void setHorizontalPadding(int i7) {
        setPadding(i7, getPaddingTop(), i7, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f15414R) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f15413Q);
            }
            int i7 = this.f15407J;
            drawable.setBounds(0, 0, i7, i7);
        } else if (this.f15408K) {
            if (this.f15415S == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = k.f21047a;
                Drawable drawable2 = resources.getDrawable(com.kt.apps.media.xemtv.beta.R.drawable.navigation_empty_icon, theme);
                this.f15415S = drawable2;
                if (drawable2 != null) {
                    int i10 = this.f15407J;
                    drawable2.setBounds(0, 0, i10, i10);
                }
            }
            drawable = this.f15415S;
        }
        this.f15410N.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i7) {
        this.f15410N.setCompoundDrawablePadding(i7);
    }

    public void setIconSize(int i7) {
        this.f15407J = i7;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f15413Q = colorStateList;
        this.f15414R = colorStateList != null;
        C1680n c1680n = this.f15412P;
        if (c1680n != null) {
            setIcon(c1680n.getIcon());
        }
    }

    public void setMaxLines(int i7) {
        this.f15410N.setMaxLines(i7);
    }

    public void setNeedsEmptyIcon(boolean z8) {
        this.f15408K = z8;
    }

    public void setTextAppearance(int i7) {
        this.f15410N.setTextAppearance(i7);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f15410N.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f15410N.setText(charSequence);
    }
}
