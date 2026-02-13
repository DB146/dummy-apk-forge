package l6;

import A9.C0076d1;
import Q5.e;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import c3.C0885b;
import c3.C0887d;
import c3.C0888e;
import c6.AbstractC0911a;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l2.X;
import n1.k;
import o.C1750o;
import q3.f;
import s6.o;

/* renamed from: l6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1508c extends C1750o {

    /* renamed from: M, reason: collision with root package name */
    public static final int[] f19562M = {R.attr.state_indeterminate};

    /* renamed from: N, reason: collision with root package name */
    public static final int[] f19563N = {R.attr.state_error};

    /* renamed from: O, reason: collision with root package name */
    public static final int[][] f19564O = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: P, reason: collision with root package name */
    public static final int f19565P = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* renamed from: A, reason: collision with root package name */
    public Drawable f19566A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f19567B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f19568C;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f19569D;

    /* renamed from: E, reason: collision with root package name */
    public PorterDuff.Mode f19570E;

    /* renamed from: F, reason: collision with root package name */
    public int f19571F;

    /* renamed from: G, reason: collision with root package name */
    public int[] f19572G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f19573H;

    /* renamed from: I, reason: collision with root package name */
    public CharSequence f19574I;

    /* renamed from: J, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f19575J;

    /* renamed from: K, reason: collision with root package name */
    public final C0888e f19576K;
    public final C1506a L;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f19577e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f19578f;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f19579u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f19580v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f19581w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f19582x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f19583y;

    /* renamed from: z, reason: collision with root package name */
    public Drawable f19584z;

    public C1508c(Context context, AttributeSet attributeSet) {
        super(D6.a.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f19577e = new LinkedHashSet();
        this.f19578f = new LinkedHashSet();
        Context context2 = getContext();
        C0888e c0888e = new C0888e(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = k.f21047a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        c0888e.f14279a = drawable;
        drawable.setCallback(c0888e.f14278f);
        new N3.b(c0888e.f14279a.getConstantState(), 1);
        this.f19576K = c0888e;
        this.L = new C1506a(this);
        Context context3 = getContext();
        this.f19584z = getButtonDrawable();
        this.f19568C = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = AbstractC0911a.f14415q;
        o.a(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        o.b(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        X x2 = new X(context3, obtainStyledAttributes);
        this.f19566A = x2.n(2);
        if (this.f19584z != null && e.O(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f19565P && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f19584z = e.x(context3, R.drawable.mtrl_checkbox_button);
                this.f19567B = true;
                if (this.f19566A == null) {
                    this.f19566A = e.x(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f19569D = Tb.a.o(context3, x2, 3);
        this.f19570E = o.h(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f19580v = obtainStyledAttributes.getBoolean(10, false);
        this.f19581w = obtainStyledAttributes.getBoolean(6, true);
        this.f19582x = obtainStyledAttributes.getBoolean(9, false);
        this.f19583y = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        x2.w();
        a();
    }

    private String getButtonStateDescription() {
        int i7 = this.f19571F;
        return i7 == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i7 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f19579u == null) {
            int p10 = f.p(this, R.attr.colorControlActivated);
            int p11 = f.p(this, R.attr.colorError);
            int p12 = f.p(this, R.attr.colorSurface);
            int p13 = f.p(this, R.attr.colorOnSurface);
            this.f19579u = new ColorStateList(f19564O, new int[]{f.u(1.0f, p12, p11), f.u(1.0f, p12, p10), f.u(0.54f, p12, p13), f.u(0.38f, p12, p13), f.u(0.38f, p12, p13)});
        }
        return this.f19579u;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f19568C;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0076d1 c0076d1;
        Drawable drawable = this.f19584z;
        ColorStateList colorStateList3 = this.f19568C;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (buttonTintMode != null) {
                drawable.setTintMode(buttonTintMode);
            }
        }
        this.f19584z = drawable;
        Drawable drawable2 = this.f19566A;
        ColorStateList colorStateList4 = this.f19569D;
        PorterDuff.Mode mode = this.f19570E;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                drawable2.setTintMode(mode);
            }
        }
        this.f19566A = drawable2;
        if (this.f19567B) {
            C0888e c0888e = this.f19576K;
            if (c0888e != null) {
                Drawable drawable3 = c0888e.f14279a;
                C1506a c1506a = this.L;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (c1506a.f19559a == null) {
                        c1506a.f19559a = new C0885b(c1506a);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c1506a.f19559a);
                }
                ArrayList arrayList = c0888e.f14277e;
                C0887d c0887d = c0888e.f14274b;
                if (arrayList != null && c1506a != null) {
                    arrayList.remove(c1506a);
                    if (c0888e.f14277e.size() == 0 && (c0076d1 = c0888e.f14276d) != null) {
                        c0887d.f14271b.removeListener(c0076d1);
                        c0888e.f14276d = null;
                    }
                }
                Drawable drawable4 = c0888e.f14279a;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (c1506a.f19559a == null) {
                        c1506a.f19559a = new C0885b(c1506a);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c1506a.f19559a);
                } else if (c1506a != null) {
                    if (c0888e.f14277e == null) {
                        c0888e.f14277e = new ArrayList();
                    }
                    if (!c0888e.f14277e.contains(c1506a)) {
                        c0888e.f14277e.add(c1506a);
                        if (c0888e.f14276d == null) {
                            c0888e.f14276d = new C0076d1(c0888e, 5);
                        }
                        c0887d.f14271b.addListener(c0888e.f14276d);
                    }
                }
            }
            Drawable drawable5 = this.f19584z;
            if ((drawable5 instanceof AnimatedStateListDrawable) && c0888e != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, c0888e, false);
                ((AnimatedStateListDrawable) this.f19584z).addTransition(R.id.indeterminate, R.id.unchecked, c0888e, false);
            }
        }
        Drawable drawable6 = this.f19584z;
        if (drawable6 != null && (colorStateList2 = this.f19568C) != null) {
            drawable6.setTintList(colorStateList2);
        }
        Drawable drawable7 = this.f19566A;
        if (drawable7 != null && (colorStateList = this.f19569D) != null) {
            drawable7.setTintList(colorStateList);
        }
        Drawable drawable8 = this.f19584z;
        Drawable drawable9 = this.f19566A;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            int intrinsicWidth = drawable9.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable8.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable9.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable8.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable8.getIntrinsicWidth() || intrinsicHeight > drawable8.getIntrinsicHeight()) {
                float f4 = intrinsicWidth / intrinsicHeight;
                if (f4 >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f4);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f4 * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f19584z;
    }

    public Drawable getButtonIconDrawable() {
        return this.f19566A;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f19569D;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f19570E;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f19568C;
    }

    public int getCheckedState() {
        return this.f19571F;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f19583y;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f19571F == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f19580v && this.f19568C == null && this.f19569D == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i7) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i7 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f19562M);
        }
        if (this.f19582x) {
            View.mergeDrawableStates(onCreateDrawableState, f19563N);
        }
        int i10 = 0;
        while (true) {
            if (i10 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i11 = onCreateDrawableState[i10];
            if (i11 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            }
            if (i11 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i10] = 16842912;
                break;
            }
            i10++;
        }
        this.f19572G = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.f19581w || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (o.f(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f19582x) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f19583y));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1507b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1507b c1507b = (C1507b) parcelable;
        super.onRestoreInstanceState(c1507b.getSuperState());
        setCheckedState(c1507b.f19561a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, l6.b] */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f19561a = getCheckedState();
        return baseSavedState;
    }

    @Override // o.C1750o, android.widget.CompoundButton
    public void setButtonDrawable(int i7) {
        setButtonDrawable(e.x(getContext(), i7));
    }

    @Override // o.C1750o, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f19584z = drawable;
        this.f19567B = false;
        a();
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f19566A = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i7) {
        setButtonIconDrawable(e.x(getContext(), i7));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f19569D == colorStateList) {
            return;
        }
        this.f19569D = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f19570E == mode) {
            return;
        }
        this.f19570E = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f19568C == colorStateList) {
            return;
        }
        this.f19568C = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z8) {
        this.f19581w = z8;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z8) {
        setCheckedState(z8 ? 1 : 0);
    }

    public void setCheckedState(int i7) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f19571F != i7) {
            this.f19571F = i7;
            super.setChecked(i7 == 1);
            refreshDrawableState();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && this.f19574I == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f19573H) {
                return;
            }
            this.f19573H = true;
            LinkedHashSet linkedHashSet = this.f19578f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw h3.o.j(it);
                }
            }
            if (this.f19571F != 2 && (onCheckedChangeListener = this.f19575J) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i10 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f19573H = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z8) {
        super.setEnabled(z8);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f19583y = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i7) {
        setErrorAccessibilityLabel(i7 != 0 ? getResources().getText(i7) : null);
    }

    public void setErrorShown(boolean z8) {
        if (this.f19582x == z8) {
            return;
        }
        this.f19582x = z8;
        refreshDrawableState();
        Iterator it = this.f19577e.iterator();
        if (it.hasNext()) {
            throw h3.o.j(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f19575J = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f19574I = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z8) {
        this.f19580v = z8;
        if (z8) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }
}
