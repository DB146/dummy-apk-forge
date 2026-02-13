package com.kt.apps.core.base.leanback;

import A9.InterfaceC0100j1;
import A9.InterfaceC0104k1;
import A9.S0;
import A9.T;
import A9.V0;
import A9.W0;
import A9.X0;
import A9.Z0;
import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillValue;
import android.widget.EditText;
import android.widget.TextView;
import y7.u0;

/* loaded from: classes2.dex */
public class GuidedActionEditText extends EditText implements InterfaceC0104k1, X0 {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0100j1 f15922a;

    /* renamed from: b, reason: collision with root package name */
    public W0 f15923b;

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f15924c;

    /* renamed from: d, reason: collision with root package name */
    public final Z0 f15925d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [A9.Z0, android.graphics.drawable.Drawable] */
    public GuidedActionEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        this.f15924c = getBackground();
        ?? drawable = new Drawable();
        this.f15925d = drawable;
        setBackground(drawable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void autofill(AutofillValue autofillValue) {
        super.autofill(autofillValue);
        W0 w02 = this.f15923b;
        if (w02 != null) {
            V0 v02 = (V0) ((T) w02).f964a;
            v02.f983m.f(v02, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int getAutofillType() {
        return Build.VERSION.SDK_INT >= 26 ? 1 : 0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z8, int i7, Rect rect) {
        super.onFocusChanged(z8, i7, rect);
        if (z8) {
            setBackground(this.f15924c);
        } else {
            setBackground(this.f15925d);
        }
        if (z8) {
            return;
        }
        setFocusable(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((isFocused() ? EditText.class : TextView.class).getName());
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i7, KeyEvent keyEvent) {
        InterfaceC0100j1 interfaceC0100j1 = this.f15922a;
        boolean z8 = false;
        if (interfaceC0100j1 != null) {
            V0 v02 = (V0) ((S0) interfaceC0100j1).f957b;
            if (i7 == 4 && keyEvent.getAction() == 1) {
                v02.f983m.g(v02, this);
            } else if (i7 == 66 && keyEvent.getAction() == 1) {
                v02.f983m.f(v02, this);
            }
            z8 = true;
        }
        return !z8 ? super.onKeyPreIme(i7, keyEvent) : z8;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isInTouchMode() || isFocusableInTouchMode() || isTextSelectable()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(u0.R(callback, this));
    }

    @Override // A9.InterfaceC0104k1
    public void setImeKeyListener(InterfaceC0100j1 interfaceC0100j1) {
        this.f15922a = interfaceC0100j1;
    }

    @Override // A9.X0
    public void setOnAutofillListener(W0 w02) {
        this.f15923b = w02;
    }
}
