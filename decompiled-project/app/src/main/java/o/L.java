package o;

import H2.C0288b;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import h.AbstractC1213a;
import m.C1521c;
import n.ViewTreeObserverOnGlobalLayoutListenerC1670d;

/* loaded from: classes.dex */
public final class L extends Spinner {

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f21402w = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final C0288b f21403a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f21404b;

    /* renamed from: c, reason: collision with root package name */
    public final D f21405c;

    /* renamed from: d, reason: collision with root package name */
    public SpinnerAdapter f21406d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f21407e;

    /* renamed from: f, reason: collision with root package name */
    public final K f21408f;

    /* renamed from: u, reason: collision with root package name */
    public int f21409u;

    /* renamed from: v, reason: collision with root package name */
    public final Rect f21410v;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public L(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.kt.apps.media.xemtv.beta.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.f21410v = new Rect();
        K0.a(getContext(), this);
        int[] iArr = AbstractC1213a.f17583u;
        l2.X u3 = l2.X.u(context, attributeSet, iArr, com.kt.apps.media.xemtv.beta.R.attr.spinnerStyle);
        this.f21403a = new C0288b(this);
        TypedArray typedArray2 = (TypedArray) u3.f19195c;
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f21404b = new C1521c(context, resourceId);
        } else {
            this.f21404b = context;
        }
        int i7 = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, f21402w, com.kt.apps.media.xemtv.beta.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArray.hasValue(0)) {
                        i7 = typedArray.getInt(0, 0);
                    }
                } catch (Exception e2) {
                    e = e2;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                }
            } catch (Throwable th) {
                th = th;
                typedArray3 = typedArray;
                if (typedArray3 != null) {
                    typedArray3.recycle();
                }
                throw th;
            }
        } catch (Exception e10) {
            e = e10;
            typedArray = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray3 != null) {
            }
            throw th;
        }
        typedArray.recycle();
        if (i7 == 0) {
            F f4 = new F(this);
            this.f21408f = f4;
            f4.f21370c = typedArray2.getString(2);
        } else if (i7 == 1) {
            I i10 = new I(this, this.f21404b, attributeSet);
            l2.X u10 = l2.X.u(this.f21404b, attributeSet, iArr, com.kt.apps.media.xemtv.beta.R.attr.spinnerStyle);
            this.f21409u = ((TypedArray) u10.f19195c).getLayoutDimension(3, -2);
            i10.h(u10.n(1));
            i10.f21390Q = typedArray2.getString(2);
            u10.w();
            this.f21408f = i10;
            this.f21405c = new D(this, this, i10);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.kt.apps.media.xemtv.beta.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        u3.w();
        this.f21407e = true;
        SpinnerAdapter spinnerAdapter = this.f21406d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f21406d = null;
        }
        this.f21403a.k(attributeSet, com.kt.apps.media.xemtv.beta.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i7 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i10 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i10 = Math.max(i10, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i10;
        }
        Rect rect = this.f21410v;
        drawable.getPadding(rect);
        return i10 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0288b c0288b = this.f21403a;
        if (c0288b != null) {
            c0288b.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        K k = this.f21408f;
        return k != null ? k.a() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        K k = this.f21408f;
        return k != null ? k.m() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f21408f != null ? this.f21409u : super.getDropDownWidth();
    }

    public final K getInternalPopup() {
        return this.f21408f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        K k = this.f21408f;
        return k != null ? k.d() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f21404b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        K k = this.f21408f;
        return k != null ? k.o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0288b c0288b = this.f21403a;
        if (c0288b != null) {
            return c0288b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0288b c0288b = this.f21403a;
        if (c0288b != null) {
            return c0288b.i();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        K k = this.f21408f;
        if (k == null || !k.b()) {
            return;
        }
        k.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.f21408f == null || View.MeasureSpec.getMode(i7) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i7)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        J j = (J) parcelable;
        super.onRestoreInstanceState(j.getSuperState());
        if (!j.f21395a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1670d(this, 2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, o.J] */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        K k = this.f21408f;
        baseSavedState.f21395a = k != null && k.b();
        return baseSavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        D d10 = this.f21405c;
        if (d10 == null || !d10.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        K k = this.f21408f;
        if (k == null) {
            return super.performClick();
        }
        if (k.b()) {
            return true;
        }
        this.f21408f.l(getTextDirection(), getTextAlignment());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.widget.ListAdapter, o.G, java.lang.Object] */
    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f21407e) {
            this.f21406d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        K k = this.f21408f;
        if (k != 0) {
            Context context = this.f21404b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            ?? obj = new Object();
            obj.f21379a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                obj.f21380b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                E.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            k.p(obj);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0288b c0288b = this.f21403a;
        if (c0288b != null) {
            c0288b.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C0288b c0288b = this.f21403a;
        if (c0288b != null) {
            c0288b.o(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i7) {
        K k = this.f21408f;
        if (k == null) {
            super.setDropDownHorizontalOffset(i7);
        } else {
            k.j(i7);
            k.k(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i7) {
        K k = this.f21408f;
        if (k != null) {
            k.i(i7);
        } else {
            super.setDropDownVerticalOffset(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i7) {
        if (this.f21408f != null) {
            this.f21409u = i7;
        } else {
            super.setDropDownWidth(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        K k = this.f21408f;
        if (k != null) {
            k.h(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i7) {
        setPopupBackgroundDrawable(Q5.e.x(getPopupContext(), i7));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        K k = this.f21408f;
        if (k != null) {
            k.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0288b c0288b = this.f21403a;
        if (c0288b != null) {
            c0288b.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0288b c0288b = this.f21403a;
        if (c0288b != null) {
            c0288b.u(mode);
        }
    }
}
