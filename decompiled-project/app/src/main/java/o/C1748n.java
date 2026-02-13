package o;

import H2.C0288b;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* renamed from: o.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1748n extends AutoCompleteTextView {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f21550d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final C0288b f21551a;

    /* renamed from: b, reason: collision with root package name */
    public final S f21552b;

    /* renamed from: c, reason: collision with root package name */
    public final C1767x f21553c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1748n(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        L0.a(context);
        K0.a(getContext(), this);
        l2.X u3 = l2.X.u(getContext(), attributeSet, f21550d, i7);
        if (((TypedArray) u3.f19195c).hasValue(0)) {
            setDropDownBackgroundDrawable(u3.n(0));
        }
        u3.w();
        C0288b c0288b = new C0288b(this);
        this.f21551a = c0288b;
        c0288b.k(attributeSet, i7);
        S s3 = new S(this);
        this.f21552b = s3;
        s3.f(attributeSet, i7);
        s3.b();
        C1767x c1767x = new C1767x(this);
        this.f21553c = c1767x;
        c1767x.b(attributeSet, i7);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a9 = c1767x.a(keyListener);
        if (a9 == keyListener) {
            return;
        }
        super.setKeyListener(a9);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0288b c0288b = this.f21551a;
        if (c0288b != null) {
            c0288b.a();
        }
        S s3 = this.f21552b;
        if (s3 != null) {
            s3.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return y7.u0.P(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0288b c0288b = this.f21551a;
        if (c0288b != null) {
            return c0288b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0288b c0288b = this.f21551a;
        if (c0288b != null) {
            return c0288b.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f21552b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f21552b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        vc.i.F(onCreateInputConnection, editorInfo, this);
        return this.f21553c.c(onCreateInputConnection);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0288b c0288b = this.f21551a;
        if (c0288b != null) {
            c0288b.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C0288b c0288b = this.f21551a;
        if (c0288b != null) {
            c0288b.o(i7);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        S s3 = this.f21552b;
        if (s3 != null) {
            s3.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        S s3 = this.f21552b;
        if (s3 != null) {
            s3.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(y7.u0.R(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i7) {
        setDropDownBackgroundDrawable(Q5.e.x(getContext(), i7));
    }

    public void setEmojiCompatEnabled(boolean z8) {
        this.f21553c.d(z8);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f21553c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0288b c0288b = this.f21551a;
        if (c0288b != null) {
            c0288b.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0288b c0288b = this.f21551a;
        if (c0288b != null) {
            c0288b.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        S s3 = this.f21552b;
        s3.k(colorStateList);
        s3.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        S s3 = this.f21552b;
        s3.l(mode);
        s3.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        S s3 = this.f21552b;
        if (s3 != null) {
            s3.g(context, i7);
        }
    }
}
