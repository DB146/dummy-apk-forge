package C1;

import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import android.window.BackEvent;

/* loaded from: classes.dex */
public abstract class j {
    public static AccessibilityNodeInfo.AccessibilityAction a() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float b(VelocityTracker velocityTracker, int i7) {
        return velocityTracker.getAxisVelocity(i7);
    }

    public static void c(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int e(ViewConfiguration viewConfiguration, int i7, int i10, int i11) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i7, i10, i11);
    }

    public static int f(ViewConfiguration viewConfiguration, int i7, int i10, int i11) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i7, i10, i11);
    }

    public static boolean g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static float h(BackEvent backEvent) {
        kotlin.jvm.internal.l.e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public static void i(TextView textView, int i7, float f4) {
        textView.setLineHeight(i7, f4);
    }

    public static int j(BackEvent backEvent) {
        kotlin.jvm.internal.l.e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public static float k(BackEvent backEvent) {
        kotlin.jvm.internal.l.e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public static float l(BackEvent backEvent) {
        kotlin.jvm.internal.l.e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
