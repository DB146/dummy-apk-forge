package z1;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static /* bridge */ /* synthetic */ void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setPaneTitle(charSequence);
    }

    public static /* bridge */ /* synthetic */ void d(AccessibilityNodeInfo accessibilityNodeInfo, boolean z8) {
        accessibilityNodeInfo.setScreenReaderFocusable(z8);
    }

    public static /* bridge */ /* synthetic */ void f(AccessibilityNodeInfo accessibilityNodeInfo, boolean z8) {
        accessibilityNodeInfo.setHeading(z8);
    }
}
