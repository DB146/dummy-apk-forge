package androidx.appcompat.widget;

import H2.C0288b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.kt.apps.media.xemtv.beta.R;
import o.C1723a0;
import o.C1761u;
import o.K0;
import o.L0;
import o.S;
import o.c1;
import y7.u0;

/* loaded from: classes.dex */
public class AppCompatButton extends Button {

    /* renamed from: a, reason: collision with root package name */
    public final C0288b f12984a;

    /* renamed from: b, reason: collision with root package name */
    public final S f12985b;

    /* renamed from: c, reason: collision with root package name */
    public C1761u f12986c;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        L0.a(context);
        K0.a(getContext(), this);
        C0288b c0288b = new C0288b(this);
        this.f12984a = c0288b;
        c0288b.k(attributeSet, i7);
        S s3 = new S(this);
        this.f12985b = s3;
        s3.f(attributeSet, i7);
        s3.b();
        getEmojiTextViewHelper().b(attributeSet, i7);
    }

    private C1761u getEmojiTextViewHelper() {
        if (this.f12986c == null) {
            this.f12986c = new C1761u(this);
        }
        return this.f12986c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0288b c0288b = this.f12984a;
        if (c0288b != null) {
            c0288b.a();
        }
        S s3 = this.f12985b;
        if (s3 != null) {
            s3.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (c1.f21488c) {
            return super.getAutoSizeMaxTextSize();
        }
        S s3 = this.f12985b;
        if (s3 != null) {
            return Math.round(s3.f21428i.f21477e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (c1.f21488c) {
            return super.getAutoSizeMinTextSize();
        }
        S s3 = this.f12985b;
        if (s3 != null) {
            return Math.round(s3.f21428i.f21476d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (c1.f21488c) {
            return super.getAutoSizeStepGranularity();
        }
        S s3 = this.f12985b;
        if (s3 != null) {
            return Math.round(s3.f21428i.f21475c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (c1.f21488c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        S s3 = this.f12985b;
        return s3 != null ? s3.f21428i.f21478f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (c1.f21488c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        S s3 = this.f12985b;
        if (s3 != null) {
            return s3.f21428i.f21473a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return u0.P(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0288b c0288b = this.f12984a;
        if (c0288b != null) {
            return c0288b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0288b c0288b = this.f12984a;
        if (c0288b != null) {
            return c0288b.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f12985b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f12985b.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        super.onLayout(z8, i7, i10, i11, i12);
        S s3 = this.f12985b;
        if (s3 == null || c1.f21488c) {
            return;
        }
        s3.f21428i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        S s3 = this.f12985b;
        if (s3 == null || c1.f21488c) {
            return;
        }
        C1723a0 c1723a0 = s3.f21428i;
        if (c1723a0.f()) {
            c1723a0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z8) {
        super.setAllCaps(z8);
        getEmojiTextViewHelper().c(z8);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i7, int i10, int i11, int i12) {
        if (c1.f21488c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i7, i10, i11, i12);
            return;
        }
        S s3 = this.f12985b;
        if (s3 != null) {
            s3.h(i7, i10, i11, i12);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i7) {
        if (c1.f21488c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
            return;
        }
        S s3 = this.f12985b;
        if (s3 != null) {
            s3.i(iArr, i7);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i7) {
        if (c1.f21488c) {
            super.setAutoSizeTextTypeWithDefaults(i7);
            return;
        }
        S s3 = this.f12985b;
        if (s3 != null) {
            s3.j(i7);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0288b c0288b = this.f12984a;
        if (c0288b != null) {
            c0288b.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C0288b c0288b = this.f12984a;
        if (c0288b != null) {
            c0288b.o(i7);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(u0.R(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z8) {
        getEmojiTextViewHelper().d(z8);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z8) {
        S s3 = this.f12985b;
        if (s3 != null) {
            s3.f21421a.setAllCaps(z8);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0288b c0288b = this.f12984a;
        if (c0288b != null) {
            c0288b.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0288b c0288b = this.f12984a;
        if (c0288b != null) {
            c0288b.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        S s3 = this.f12985b;
        s3.k(colorStateList);
        s3.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        S s3 = this.f12985b;
        s3.l(mode);
        s3.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        S s3 = this.f12985b;
        if (s3 != null) {
            s3.g(context, i7);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i7, float f4) {
        boolean z8 = c1.f21488c;
        if (z8) {
            super.setTextSize(i7, f4);
            return;
        }
        S s3 = this.f12985b;
        if (s3 == null || z8) {
            return;
        }
        C1723a0 c1723a0 = s3.f21428i;
        if (c1723a0.f()) {
            return;
        }
        c1723a0.g(i7, f4);
    }
}
