package z1;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import y1.C2355c;

/* loaded from: classes.dex */
public class f extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final C2355c f28176a;

    public f(C2355c c2355c) {
        this.f28176a = c2355c;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i7) {
        e e2 = this.f28176a.e(i7);
        if (e2 == null) {
            return null;
        }
        return e2.f28173a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i7) {
        this.f28176a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i7) {
        e f4 = this.f28176a.f(i7);
        if (f4 == null) {
            return null;
        }
        return f4.f28173a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i7, int i10, Bundle bundle) {
        return this.f28176a.h(i7, i10, bundle);
    }
}
