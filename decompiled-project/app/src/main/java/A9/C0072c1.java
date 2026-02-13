package A9;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* renamed from: A9.c1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0072c1 extends View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1090a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1091b;

    public /* synthetic */ C0072c1(Object obj, int i7) {
        this.f1090a = i7;
        this.f1091b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if ((r2.f929f & 1) == 1) goto L12;
     */
    @Override // android.view.View.AccessibilityDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        boolean z8;
        switch (this.f1090a) {
            case 0:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                P0 p02 = ((C0080e1) this.f1091b).f1118u;
                if (p02 != null) {
                    z8 = true;
                    break;
                }
                z8 = false;
                accessibilityEvent.setChecked(z8);
                return;
            default:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                return;
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f1090a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                C0080e1 c0080e1 = (C0080e1) this.f1091b;
                P0 p02 = c0080e1.f1118u;
                boolean z8 = false;
                accessibilityNodeInfo.setCheckable(false);
                P0 p03 = c0080e1.f1118u;
                if (p03 != null && (p03.f929f & 1) == 1) {
                    z8 = true;
                }
                accessibilityNodeInfo.setChecked(z8);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                EditText editText = ((C6.p) this.f1091b).f2989h.getEditText();
                if (editText != null) {
                    accessibilityNodeInfo.setLabeledBy(editText);
                    return;
                }
                return;
        }
    }
}
