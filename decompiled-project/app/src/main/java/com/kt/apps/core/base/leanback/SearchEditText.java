package com.kt.apps.core.base.leanback;

import A9.I2;
import A9.RunnableC0102k;
import A9.m3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyEvent;

/* loaded from: classes2.dex */
public class SearchEditText extends m3 {

    /* renamed from: v, reason: collision with root package name */
    public I2 f16036v;

    public SearchEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i7, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && this.f16036v != null) {
            post(new RunnableC0102k(this, 8));
        }
        return super.onKeyPreIme(i7, keyEvent);
    }

    @Override // A9.m3, android.widget.TextView
    public /* bridge */ /* synthetic */ void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setFinalRecognizedText(CharSequence charSequence) {
        setText(charSequence);
        bringPointIntoView(length());
    }

    public void setOnKeyboardDismissListener(I2 i22) {
        this.f16036v = i22;
    }
}
