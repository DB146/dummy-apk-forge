package o;

import H2.C0288b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: o.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1769y extends RadioButton implements C1.m {

    /* renamed from: a, reason: collision with root package name */
    public final C1754q f21619a;

    /* renamed from: b, reason: collision with root package name */
    public final C0288b f21620b;

    /* renamed from: c, reason: collision with root package name */
    public final S f21621c;

    /* renamed from: d, reason: collision with root package name */
    public C1761u f21622d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1769y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        L0.a(context);
        K0.a(getContext(), this);
        C1754q c1754q = new C1754q(this);
        this.f21619a = c1754q;
        c1754q.c(attributeSet, R.attr.radioButtonStyle);
        C0288b c0288b = new C0288b(this);
        this.f21620b = c0288b;
        c0288b.k(attributeSet, R.attr.radioButtonStyle);
        S s3 = new S(this);
        this.f21621c = s3;
        s3.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.radioButtonStyle);
    }

    private C1761u getEmojiTextViewHelper() {
        if (this.f21622d == null) {
            this.f21622d = new C1761u(this);
        }
        return this.f21622d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0288b c0288b = this.f21620b;
        if (c0288b != null) {
            c0288b.a();
        }
        S s3 = this.f21621c;
        if (s3 != null) {
            s3.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0288b c0288b = this.f21620b;
        if (c0288b != null) {
            return c0288b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0288b c0288b = this.f21620b;
        if (c0288b != null) {
            return c0288b.i();
        }
        return null;
    }

    @Override // C1.m
    public ColorStateList getSupportButtonTintList() {
        C1754q c1754q = this.f21619a;
        if (c1754q != null) {
            return c1754q.f21573a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C1754q c1754q = this.f21619a;
        if (c1754q != null) {
            return c1754q.f21574b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f21621c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f21621c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z8) {
        super.setAllCaps(z8);
        getEmojiTextViewHelper().c(z8);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0288b c0288b = this.f21620b;
        if (c0288b != null) {
            c0288b.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C0288b c0288b = this.f21620b;
        if (c0288b != null) {
            c0288b.o(i7);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i7) {
        setButtonDrawable(Q5.e.x(getContext(), i7));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C1754q c1754q = this.f21619a;
        if (c1754q != null) {
            if (c1754q.f21577e) {
                c1754q.f21577e = false;
            } else {
                c1754q.f21577e = true;
                c1754q.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        S s3 = this.f21621c;
        if (s3 != null) {
            s3.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        S s3 = this.f21621c;
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
        C0288b c0288b = this.f21620b;
        if (c0288b != null) {
            c0288b.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0288b c0288b = this.f21620b;
        if (c0288b != null) {
            c0288b.u(mode);
        }
    }

    @Override // C1.m
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C1754q c1754q = this.f21619a;
        if (c1754q != null) {
            c1754q.f21573a = colorStateList;
            c1754q.f21575c = true;
            c1754q.a();
        }
    }

    @Override // C1.m
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C1754q c1754q = this.f21619a;
        if (c1754q != null) {
            c1754q.f21574b = mode;
            c1754q.f21576d = true;
            c1754q.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        S s3 = this.f21621c;
        s3.k(colorStateList);
        s3.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        S s3 = this.f21621c;
        s3.l(mode);
        s3.b();
    }
}
