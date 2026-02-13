package C6;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import c6.AbstractC0911a;
import com.google.android.material.textfield.TextInputLayout;
import com.kt.apps.media.xemtv.beta.R;
import java.util.List;
import java.util.Locale;
import o.C1748n;
import o.C1770y0;
import y6.C2401g;

/* loaded from: classes.dex */
public final class s extends C1748n {

    /* renamed from: e, reason: collision with root package name */
    public final C1770y0 f3011e;

    /* renamed from: f, reason: collision with root package name */
    public final AccessibilityManager f3012f;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f3013u;

    /* renamed from: v, reason: collision with root package name */
    public final int f3014v;

    /* renamed from: w, reason: collision with root package name */
    public final float f3015w;

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f3016x;

    /* renamed from: y, reason: collision with root package name */
    public int f3017y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f3018z;

    public s(Context context, AttributeSet attributeSet) {
        super(D6.a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, R.attr.autoCompleteTextViewStyle);
        this.f3013u = new Rect();
        Context context2 = getContext();
        TypedArray g = s6.o.g(context2, attributeSet, AbstractC0911a.f14410l, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (g.hasValue(0) && g.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f3014v = g.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f3015w = g.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (g.hasValue(2)) {
            this.f3016x = ColorStateList.valueOf(g.getColor(2, 0));
        }
        this.f3017y = g.getColor(4, 0);
        this.f3018z = Tb.a.n(context2, g, 5);
        this.f3012f = (AccessibilityManager) context2.getSystemService("accessibility");
        C1770y0 c1770y0 = new C1770y0(context2, null, R.attr.listPopupWindowStyle);
        this.f3011e = c1770y0;
        c1770y0.f21636M = true;
        c1770y0.f21637N.setFocusable(true);
        c1770y0.f21627C = this;
        c1770y0.f21637N.setInputMethodMode(2);
        c1770y0.p(getAdapter());
        c1770y0.f21628D = new q(this, 0);
        if (g.hasValue(6)) {
            setSimpleItems(g.getResourceId(6, 0));
        }
        g.recycle();
    }

    public static void a(s sVar, Object obj) {
        sVar.setText(sVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f3012f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) != null) {
                for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                    if (accessibilityServiceInfo.getSettingsActivityName() == null || !accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (c()) {
            this.f3011e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f3016x;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b2 = b();
        return (b2 == null || !b2.f15477S) ? super.getHint() : b2.getHint();
    }

    public float getPopupElevation() {
        return this.f3015w;
    }

    public int getSimpleItemSelectedColor() {
        return this.f3017y;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f3018z;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b2 = b();
        if (b2 != null && b2.f15477S && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3011e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (View.MeasureSpec.getMode(i7) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b2 = b();
            int i11 = 0;
            if (adapter != null && b2 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C1770y0 c1770y0 = this.f3011e;
                int min = Math.min(adapter.getCount(), Math.max(0, !c1770y0.f21637N.isShowing() ? -1 : c1770y0.f21640c.getSelectedItemPosition()) + 15);
                View view = null;
                int i12 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i11) {
                        view = null;
                        i11 = itemViewType;
                    }
                    view = adapter.getView(max, view, b2);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i12 = Math.max(i12, view.getMeasuredWidth());
                }
                Drawable background = c1770y0.f21637N.getBackground();
                if (background != null) {
                    Rect rect = this.f3013u;
                    background.getPadding(rect);
                    i12 += rect.left + rect.right;
                }
                i11 = b2.getEndIconView().getMeasuredWidth() + i12;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i11), View.MeasureSpec.getSize(i7)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z8) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z8);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t5) {
        super.setAdapter(t5);
        this.f3011e.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C1770y0 c1770y0 = this.f3011e;
        if (c1770y0 != null) {
            c1770y0.h(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i7) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i7));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f3016x = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof C2401g) {
            ((C2401g) dropDownBackground).k(this.f3016x);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f3011e.f21629E = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i7) {
        super.setRawInputType(i7);
        TextInputLayout b2 = b();
        if (b2 != null) {
            b2.s();
        }
    }

    public void setSimpleItemSelectedColor(int i7) {
        this.f3017y = i7;
        if (getAdapter() instanceof r) {
            ((r) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f3018z = colorStateList;
        if (getAdapter() instanceof r) {
            ((r) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i7) {
        setSimpleItems(getResources().getStringArray(i7));
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new r(this, getContext(), this.f3014v, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.f3011e.c();
        } else {
            super.showDropDown();
        }
    }
}
