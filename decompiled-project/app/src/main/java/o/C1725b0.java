package o;

import H2.C0288b;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* renamed from: o.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1725b0 extends ToggleButton {

    /* renamed from: a, reason: collision with root package name */
    public final C0288b f21483a;

    /* renamed from: b, reason: collision with root package name */
    public final S f21484b;

    /* renamed from: c, reason: collision with root package name */
    public C1761u f21485c;

    public C1725b0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        K0.a(getContext(), this);
        C0288b c0288b = new C0288b(this);
        this.f21483a = c0288b;
        c0288b.k(attributeSet, R.attr.buttonStyleToggle);
        S s3 = new S(this);
        this.f21484b = s3;
        s3.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.buttonStyleToggle);
    }

    private C1761u getEmojiTextViewHelper() {
        if (this.f21485c == null) {
            this.f21485c = new C1761u(this);
        }
        return this.f21485c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0288b c0288b = this.f21483a;
        if (c0288b != null) {
            c0288b.a();
        }
        S s3 = this.f21484b;
        if (s3 != null) {
            s3.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0288b c0288b = this.f21483a;
        if (c0288b != null) {
            return c0288b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0288b c0288b = this.f21483a;
        if (c0288b != null) {
            return c0288b.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f21484b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f21484b.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z8) {
        super.setAllCaps(z8);
        getEmojiTextViewHelper().c(z8);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0288b c0288b = this.f21483a;
        if (c0288b != null) {
            c0288b.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C0288b c0288b = this.f21483a;
        if (c0288b != null) {
            c0288b.o(i7);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        S s3 = this.f21484b;
        if (s3 != null) {
            s3.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        S s3 = this.f21484b;
        if (s3 != null) {
            s3.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z8) {
        getEmojiTextViewHelper().d(z8);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0288b c0288b = this.f21483a;
        if (c0288b != null) {
            c0288b.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0288b c0288b = this.f21483a;
        if (c0288b != null) {
            c0288b.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        S s3 = this.f21484b;
        s3.k(colorStateList);
        s3.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        S s3 = this.f21484b;
        s3.l(mode);
        s3.b();
    }
}
