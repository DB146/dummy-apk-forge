package o;

import H2.C0288b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.kt.apps.media.xemtv.beta.R;
import h.AbstractC1213a;

/* renamed from: o.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1752p extends CheckedTextView {

    /* renamed from: a, reason: collision with root package name */
    public final C1754q f21560a;

    /* renamed from: b, reason: collision with root package name */
    public final C0288b f21561b;

    /* renamed from: c, reason: collision with root package name */
    public final S f21562c;

    /* renamed from: d, reason: collision with root package name */
    public C1761u f21563d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0087 A[Catch: all -> 0x0067, TryCatch #1 {all -> 0x0067, blocks: (B:3:0x004e, B:5:0x0055, B:8:0x005b, B:9:0x0080, B:11:0x0087, B:12:0x008e, B:14:0x0095, B:21:0x0069, B:23:0x006f, B:25:0x0075), top: B:2:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0095 A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #1 {all -> 0x0067, blocks: (B:3:0x004e, B:5:0x0055, B:8:0x005b, B:9:0x0080, B:11:0x0087, B:12:0x008e, B:14:0x0095, B:21:0x0069, B:23:0x006f, B:25:0x0075), top: B:2:0x004e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1752p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        int resourceId;
        int resourceId2;
        L0.a(context);
        K0.a(getContext(), this);
        S s3 = new S(this);
        this.f21562c = s3;
        s3.f(attributeSet, R.attr.checkedTextViewStyle);
        s3.b();
        C0288b c0288b = new C0288b(this);
        this.f21561b = c0288b;
        c0288b.k(attributeSet, R.attr.checkedTextViewStyle);
        this.f21560a = new C1754q(this);
        Context context2 = getContext();
        int[] iArr = AbstractC1213a.f17574l;
        l2.X u3 = l2.X.u(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) u3.f19195c;
        y1.K.m(this, getContext(), iArr, attributeSet, (TypedArray) u3.f19195c, R.attr.checkedTextViewStyle, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(Q5.e.x(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setCheckMarkTintList(u3.m(2));
                }
                if (typedArray.hasValue(3)) {
                    setCheckMarkTintMode(AbstractC1737h0.c(typedArray.getInt(3, -1), null));
                }
                u3.w();
                getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(Q5.e.x(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            u3.w();
            getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            u3.w();
            throw th;
        }
    }

    private C1761u getEmojiTextViewHelper() {
        if (this.f21563d == null) {
            this.f21563d = new C1761u(this);
        }
        return this.f21563d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        S s3 = this.f21562c;
        if (s3 != null) {
            s3.b();
        }
        C0288b c0288b = this.f21561b;
        if (c0288b != null) {
            c0288b.a();
        }
        C1754q c1754q = this.f21560a;
        if (c1754q != null) {
            c1754q.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return y7.u0.P(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0288b c0288b = this.f21561b;
        if (c0288b != null) {
            return c0288b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0288b c0288b = this.f21561b;
        if (c0288b != null) {
            return c0288b.i();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C1754q c1754q = this.f21560a;
        if (c1754q != null) {
            return c1754q.f21573a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C1754q c1754q = this.f21560a;
        if (c1754q != null) {
            return c1754q.f21574b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f21562c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f21562c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        vc.i.F(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z8) {
        super.setAllCaps(z8);
        getEmojiTextViewHelper().c(z8);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0288b c0288b = this.f21561b;
        if (c0288b != null) {
            c0288b.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C0288b c0288b = this.f21561b;
        if (c0288b != null) {
            c0288b.o(i7);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i7) {
        setCheckMarkDrawable(Q5.e.x(getContext(), i7));
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C1754q c1754q = this.f21560a;
        if (c1754q != null) {
            if (c1754q.f21577e) {
                c1754q.f21577e = false;
            } else {
                c1754q.f21577e = true;
                c1754q.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        S s3 = this.f21562c;
        if (s3 != null) {
            s3.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        S s3 = this.f21562c;
        if (s3 != null) {
            s3.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(y7.u0.R(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z8) {
        getEmojiTextViewHelper().d(z8);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0288b c0288b = this.f21561b;
        if (c0288b != null) {
            c0288b.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0288b c0288b = this.f21561b;
        if (c0288b != null) {
            c0288b.u(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C1754q c1754q = this.f21560a;
        if (c1754q != null) {
            c1754q.f21573a = colorStateList;
            c1754q.f21575c = true;
            c1754q.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C1754q c1754q = this.f21560a;
        if (c1754q != null) {
            c1754q.f21574b = mode;
            c1754q.f21576d = true;
            c1754q.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        S s3 = this.f21562c;
        s3.k(colorStateList);
        s3.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        S s3 = this.f21562c;
        s3.l(mode);
        s3.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        S s3 = this.f21562c;
        if (s3 != null) {
            s3.g(context, i7);
        }
    }
}
