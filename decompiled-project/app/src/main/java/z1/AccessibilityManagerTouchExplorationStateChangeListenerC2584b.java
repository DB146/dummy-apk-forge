package z1;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;
import y1.K;

/* renamed from: z1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC2584b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final A1.d f28158a;

    public AccessibilityManagerTouchExplorationStateChangeListenerC2584b(A1.d dVar) {
        this.f28158a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC2584b) {
            return this.f28158a.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC2584b) obj).f28158a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28158a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z8) {
        C6.i iVar = (C6.i) this.f28158a.f330b;
        AutoCompleteTextView autoCompleteTextView = iVar.f2935h;
        if (autoCompleteTextView == null || Q5.e.C(autoCompleteTextView)) {
            return;
        }
        int i7 = z8 ? 2 : 1;
        WeakHashMap weakHashMap = K.f26642a;
        iVar.f2975d.setImportantForAccessibility(i7);
    }
}
