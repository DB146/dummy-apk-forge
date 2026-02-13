package androidx.appcompat.widget;

import A1.b;
import A1.c;
import C1.j;
import H2.C0288b;
import Q5.e;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import i1.C1290a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import o.C1723a0;
import o.C1761u;
import o.C1767x;
import o.K0;
import o.L0;
import o.M;
import o.S;
import o.T;
import o.U;
import o.V;
import o.c1;
import q1.AbstractC1878d;
import vc.i;
import w1.AbstractC2200d;
import w1.C2199c;
import y7.u0;

/* loaded from: classes.dex */
public class AppCompatTextView extends TextView {

    /* renamed from: a, reason: collision with root package name */
    public final C0288b f12993a;

    /* renamed from: b, reason: collision with root package name */
    public final S f12994b;

    /* renamed from: c, reason: collision with root package name */
    public final C1767x f12995c;

    /* renamed from: d, reason: collision with root package name */
    public C1761u f12996d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12997e;

    /* renamed from: f, reason: collision with root package name */
    public C1290a f12998f;

    /* renamed from: u, reason: collision with root package name */
    public Future f12999u;

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        L0.a(context);
        this.f12997e = false;
        this.f12998f = null;
        K0.a(getContext(), this);
        C0288b c0288b = new C0288b(this);
        this.f12993a = c0288b;
        c0288b.k(attributeSet, i7);
        S s3 = new S(this);
        this.f12994b = s3;
        s3.f(attributeSet, i7);
        s3.b();
        C1767x c1767x = new C1767x();
        c1767x.f21616b = this;
        this.f12995c = c1767x;
        getEmojiTextViewHelper().b(attributeSet, i7);
    }

    private C1761u getEmojiTextViewHelper() {
        if (this.f12996d == null) {
            this.f12996d = new C1761u(this);
        }
        return this.f12996d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0288b c0288b = this.f12993a;
        if (c0288b != null) {
            c0288b.a();
        }
        S s3 = this.f12994b;
        if (s3 != null) {
            s3.b();
        }
    }

    public final void g() {
        Future future = this.f12999u;
        if (future == null) {
            return;
        }
        try {
            this.f12999u = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            u0.v(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (c1.f21488c) {
            return super.getAutoSizeMaxTextSize();
        }
        S s3 = this.f12994b;
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
        S s3 = this.f12994b;
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
        S s3 = this.f12994b;
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
        S s3 = this.f12994b;
        return s3 != null ? s3.f21428i.f21478f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (c1.f21488c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        S s3 = this.f12994b;
        if (s3 != null) {
            return s3.f21428i.f21473a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return u0.P(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public T getSuperCaller() {
        if (this.f12998f == null) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 34) {
                this.f12998f = new V(this);
            } else if (i7 >= 28) {
                this.f12998f = new U(this);
            } else if (i7 >= 26) {
                this.f12998f = new C1290a(this, 11);
            }
        }
        return this.f12998f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0288b c0288b = this.f12993a;
        if (c0288b != null) {
            return c0288b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0288b c0288b = this.f12993a;
        if (c0288b != null) {
            return c0288b.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f12994b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f12994b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        g();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C1767x c1767x;
        if (Build.VERSION.SDK_INT >= 28 || (c1767x = this.f12995c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c1767x.f21617c;
        return textClassifier == null ? M.a((TextView) c1767x.f21616b) : textClassifier;
    }

    public C2199c getTextMetricsParamsCompat() {
        return u0.v(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f12994b.getClass();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 30 && onCreateInputConnection != null) {
            CharSequence text = getText();
            if (i7 >= 30) {
                b.a(editorInfo, text);
            } else {
                text.getClass();
                if (i7 >= 30) {
                    b.a(editorInfo, text);
                } else {
                    int i10 = editorInfo.initialSelStart;
                    int i11 = editorInfo.initialSelEnd;
                    int i12 = i10 > i11 ? i11 : i10;
                    if (i10 <= i11) {
                        i10 = i11;
                    }
                    int length = text.length();
                    if (i12 < 0 || i10 > length) {
                        c.a(editorInfo, null, 0, 0);
                    } else {
                        int i13 = editorInfo.inputType & 4095;
                        if (i13 == 129 || i13 == 225 || i13 == 18) {
                            c.a(editorInfo, null, 0, 0);
                        } else if (length <= 2048) {
                            c.a(editorInfo, text, i12, i10);
                        } else {
                            int i14 = i10 - i12;
                            int i15 = i14 > 1024 ? 0 : i14;
                            int i16 = 2048 - i15;
                            int min = Math.min(text.length() - i10, i16 - Math.min(i12, (int) (i16 * 0.8d)));
                            int min2 = Math.min(i12, i16 - min);
                            int i17 = i12 - min2;
                            if (Character.isLowSurrogate(text.charAt(i17))) {
                                i17++;
                                min2--;
                            }
                            if (Character.isHighSurrogate(text.charAt((i10 + min) - 1))) {
                                min--;
                            }
                            int i18 = min2 + i15;
                            c.a(editorInfo, i15 != i14 ? TextUtils.concat(text.subSequence(i17, i17 + min2), text.subSequence(i10, min + i10)) : text.subSequence(i17, i18 + min + i17), min2, i18);
                        }
                    }
                }
            }
        }
        i.F(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 30 || i7 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        super.onLayout(z8, i7, i10, i11, i12);
        S s3 = this.f12994b;
        if (s3 == null || c1.f21488c) {
            return;
        }
        s3.f21428i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i10) {
        g();
        super.onMeasure(i7, i10);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        S s3 = this.f12994b;
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
        S s3 = this.f12994b;
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
        S s3 = this.f12994b;
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
        S s3 = this.f12994b;
        if (s3 != null) {
            s3.j(i7);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0288b c0288b = this.f12993a;
        if (c0288b != null) {
            c0288b.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C0288b c0288b = this.f12993a;
        if (c0288b != null) {
            c0288b.o(i7);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        S s3 = this.f12994b;
        if (s3 != null) {
            s3.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        S s3 = this.f12994b;
        if (s3 != null) {
            s3.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i7, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i7 != 0 ? e.x(context, i7) : null, i10 != 0 ? e.x(context, i10) : null, i11 != 0 ? e.x(context, i11) : null, i12 != 0 ? e.x(context, i12) : null);
        S s3 = this.f12994b;
        if (s3 != null) {
            s3.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        S s3 = this.f12994b;
        if (s3 != null) {
            s3.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i7, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i7 != 0 ? e.x(context, i7) : null, i10 != 0 ? e.x(context, i10) : null, i11 != 0 ? e.x(context, i11) : null, i12 != 0 ? e.x(context, i12) : null);
        S s3 = this.f12994b;
        if (s3 != null) {
            s3.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        S s3 = this.f12994b;
        if (s3 != null) {
            s3.b();
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().e(i7);
        } else {
            u0.H(this, i7);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i7);
        } else {
            u0.I(this, i7);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i7) {
        u0.J(this, i7);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i7, float f4) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            getSuperCaller().g(i7, f4);
        } else if (i10 >= 34) {
            j.i(this, i7, f4);
        } else {
            u0.J(this, Math.round(TypedValue.applyDimension(i7, f4, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(AbstractC2200d abstractC2200d) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        u0.v(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0288b c0288b = this.f12993a;
        if (c0288b != null) {
            c0288b.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0288b c0288b = this.f12993a;
        if (c0288b != null) {
            c0288b.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        S s3 = this.f12994b;
        s3.k(colorStateList);
        s3.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        S s3 = this.f12994b;
        s3.l(mode);
        s3.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        S s3 = this.f12994b;
        if (s3 != null) {
            s3.g(context, i7);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C1767x c1767x;
        if (Build.VERSION.SDK_INT >= 28 || (c1767x = this.f12995c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c1767x.f21617c = textClassifier;
        }
    }

    public void setTextFuture(Future<AbstractC2200d> future) {
        this.f12999u = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C2199c c2199c) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c2199c.f25650b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i7 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i7 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i7 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i7 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i7 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i7 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i7 = 7;
            }
        }
        setTextDirection(i7);
        getPaint().set(c2199c.f25649a);
        setBreakStrategy(c2199c.f25651c);
        setHyphenationFrequency(c2199c.f25652d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i7, float f4) {
        boolean z8 = c1.f21488c;
        if (z8) {
            super.setTextSize(i7, f4);
            return;
        }
        S s3 = this.f12994b;
        if (s3 == null || z8) {
            return;
        }
        C1723a0 c1723a0 = s3.f21428i;
        if (c1723a0.f()) {
            return;
        }
        c1723a0.g(i7, f4);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i7) {
        Typeface typeface2;
        if (this.f12997e) {
            return;
        }
        if (typeface == null || i7 <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            i iVar = AbstractC1878d.f23347a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i7);
        }
        this.f12997e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i7);
        } finally {
            this.f12997e = false;
        }
    }
}
