package o;

import H2.C0288b;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.kt.apps.media.xemtv.beta.R;
import y1.C2355c;
import y1.C2357e;
import y1.C2359g;
import y1.InterfaceC2356d;
import y1.InterfaceC2367o;

/* renamed from: o.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1759t extends EditText implements InterfaceC2367o {

    /* renamed from: a, reason: collision with root package name */
    public final C0288b f21599a;

    /* renamed from: b, reason: collision with root package name */
    public final S f21600b;

    /* renamed from: c, reason: collision with root package name */
    public final C1767x f21601c;

    /* renamed from: d, reason: collision with root package name */
    public final C1.l f21602d;

    /* renamed from: e, reason: collision with root package name */
    public final C1767x f21603e;

    /* renamed from: f, reason: collision with root package name */
    public C1757s f21604f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v5, types: [C1.l, java.lang.Object] */
    public C1759t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        L0.a(context);
        K0.a(getContext(), this);
        C0288b c0288b = new C0288b(this);
        this.f21599a = c0288b;
        c0288b.k(attributeSet, R.attr.editTextStyle);
        S s3 = new S(this);
        this.f21600b = s3;
        s3.f(attributeSet, R.attr.editTextStyle);
        s3.b();
        C1767x c1767x = new C1767x();
        c1767x.f21616b = this;
        this.f21601c = c1767x;
        this.f21602d = new Object();
        C1767x c1767x2 = new C1767x(this);
        this.f21603e = c1767x2;
        c1767x2.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a9 = c1767x2.a(keyListener);
        if (a9 == keyListener) {
            return;
        }
        super.setKeyListener(a9);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    private C1757s getSuperCaller() {
        if (this.f21604f == null) {
            this.f21604f = new C1757s(this);
        }
        return this.f21604f;
    }

    @Override // y1.InterfaceC2367o
    public final C2359g a(C2359g c2359g) {
        this.f21602d.getClass();
        return C1.l.a(this, c2359g);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0288b c0288b = this.f21599a;
        if (c0288b != null) {
            c0288b.a();
        }
        S s3 = this.f21600b;
        if (s3 != null) {
            s3.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return y7.u0.P(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0288b c0288b = this.f21599a;
        if (c0288b != null) {
            return c0288b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0288b c0288b = this.f21599a;
        if (c0288b != null) {
            return c0288b.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f21600b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f21600b.e();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C1767x c1767x;
        if (Build.VERSION.SDK_INT >= 28 || (c1767x = this.f21601c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c1767x.f21617c;
        return textClassifier == null ? M.a((TextView) c1767x.f21616b) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] g;
        InputConnection fVar;
        String[] strArr;
        int i7;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f21600b.getClass();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 && onCreateInputConnection != null) {
            CharSequence text = getText();
            if (i10 >= 30) {
                A1.b.a(editorInfo, text);
            } else {
                text.getClass();
                if (i10 >= 30) {
                    A1.b.a(editorInfo, text);
                } else {
                    int i11 = editorInfo.initialSelStart;
                    int i12 = editorInfo.initialSelEnd;
                    int i13 = i11 > i12 ? i12 : i11;
                    if (i11 <= i12) {
                        i11 = i12;
                    }
                    int length = text.length();
                    if (i13 < 0 || i11 > length) {
                        A1.c.a(editorInfo, null, 0, 0);
                    } else {
                        int i14 = editorInfo.inputType & 4095;
                        if (i14 == 129 || i14 == 225 || i14 == 18) {
                            A1.c.a(editorInfo, null, 0, 0);
                        } else if (length <= 2048) {
                            A1.c.a(editorInfo, text, i13, i11);
                        } else {
                            int i15 = i11 - i13;
                            int i16 = i15 > 1024 ? 0 : i15;
                            int i17 = 2048 - i16;
                            int min = Math.min(text.length() - i11, i17 - Math.min(i13, (int) (i17 * 0.8d)));
                            int min2 = Math.min(i13, i17 - min);
                            int i18 = i13 - min2;
                            if (Character.isLowSurrogate(text.charAt(i18))) {
                                i7 = 1;
                                i18++;
                                min2--;
                            } else {
                                i7 = 1;
                            }
                            if (Character.isHighSurrogate(text.charAt((i11 + min) - i7))) {
                                min -= i7;
                            }
                            int i19 = min2 + i16;
                            A1.c.a(editorInfo, i16 != i15 ? TextUtils.concat(text.subSequence(i18, i18 + min2), text.subSequence(i11, min + i11)) : text.subSequence(i18, i19 + min + i18), min2, i19);
                        }
                    }
                }
            }
        }
        vc.i.F(onCreateInputConnection, editorInfo, this);
        if (onCreateInputConnection != null && i10 <= 30 && (g = y1.K.g(this)) != null) {
            if (i10 >= 25) {
                editorInfo.contentMimeTypes = g;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", g);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", g);
            }
            A1.d dVar = new A1.d(this, 0);
            if (i10 >= 25) {
                fVar = new A1.e(onCreateInputConnection, dVar);
            } else {
                String[] strArr2 = A1.c.f328a;
                if (i10 >= 25) {
                    strArr = editorInfo.contentMimeTypes;
                    if (strArr != null) {
                        strArr2 = strArr;
                    }
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle != null) {
                        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                        if (stringArray != null) {
                            strArr2 = stringArray;
                        }
                    }
                }
                if (strArr2.length != 0) {
                    fVar = new A1.f(onCreateInputConnection, dVar);
                }
            }
            onCreateInputConnection = fVar;
        }
        return this.f21603e.c(onCreateInputConnection);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 30 || i7 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z8 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && y1.K.g(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z8 = AbstractC1720A.a(dragEvent, this, activity);
            }
        }
        if (z8) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i7) {
        InterfaceC2356d interfaceC2356d;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 || y1.K.g(this) == null || !(i7 == 16908322 || i7 == 16908337)) {
            return super.onTextContextMenuItem(i7);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i10 >= 31) {
                interfaceC2356d = new C2355c(primaryClip, 1);
            } else {
                C2357e c2357e = new C2357e();
                c2357e.f26690b = primaryClip;
                c2357e.f26691c = 1;
                interfaceC2356d = c2357e;
            }
            interfaceC2356d.c(i7 == 16908322 ? 0 : 1);
            y1.K.j(this, interfaceC2356d.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0288b c0288b = this.f21599a;
        if (c0288b != null) {
            c0288b.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C0288b c0288b = this.f21599a;
        if (c0288b != null) {
            c0288b.o(i7);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        S s3 = this.f21600b;
        if (s3 != null) {
            s3.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        S s3 = this.f21600b;
        if (s3 != null) {
            s3.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(y7.u0.R(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z8) {
        this.f21603e.d(z8);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f21603e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0288b c0288b = this.f21599a;
        if (c0288b != null) {
            c0288b.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0288b c0288b = this.f21599a;
        if (c0288b != null) {
            c0288b.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        S s3 = this.f21600b;
        s3.k(colorStateList);
        s3.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        S s3 = this.f21600b;
        s3.l(mode);
        s3.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        S s3 = this.f21600b;
        if (s3 != null) {
            s3.g(context, i7);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C1767x c1767x;
        if (Build.VERSION.SDK_INT >= 28 || (c1767x = this.f21601c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c1767x.f21617c = textClassifier;
        }
    }
}
