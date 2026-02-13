package C6;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;
import y1.C2354b;

/* loaded from: classes.dex */
public final class w extends C2354b {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f3034d;

    public w(TextInputLayout textInputLayout) {
        this.f3034d = textInputLayout;
    }

    @Override // y1.C2354b
    public final void d(View view, z1.e eVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f26680a;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f28173a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f3034d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z8 = textInputLayout.f15461I0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        boolean z10 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String charSequence = !isEmpty2 ? hint.toString() : "";
        u uVar = textInputLayout.f15484b;
        AppCompatTextView appCompatTextView = uVar.f3022b;
        if (appCompatTextView.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(appCompatTextView);
            accessibilityNodeInfo.setTraversalAfter(appCompatTextView);
        } else {
            accessibilityNodeInfo.setTraversalAfter(uVar.f3024d);
        }
        if (!isEmpty) {
            eVar.n(text);
        } else if (!TextUtils.isEmpty(charSequence)) {
            eVar.n(charSequence);
            if (!z8 && placeholderText != null) {
                eVar.n(charSequence + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            eVar.n(placeholderText);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 26) {
                eVar.l(charSequence);
            } else {
                if (!isEmpty) {
                    charSequence = ((Object) text) + ", " + charSequence;
                }
                eVar.n(charSequence);
            }
            if (i7 >= 26) {
                accessibilityNodeInfo.setShowingHintText(isEmpty);
            } else {
                eVar.h(4, isEmpty);
            }
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z10) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        AppCompatTextView appCompatTextView2 = textInputLayout.f15514x.f3004y;
        if (appCompatTextView2 != null) {
            accessibilityNodeInfo.setLabelFor(appCompatTextView2);
        }
        textInputLayout.f15486c.b().n(eVar);
    }

    @Override // y1.C2354b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f3034d.f15486c.b().o(accessibilityEvent);
    }
}
