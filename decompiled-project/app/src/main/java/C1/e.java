package C1;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import y1.C2354b;

/* loaded from: classes.dex */
public final class e extends C2354b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2476d;

    public /* synthetic */ e(int i7) {
        this.f2476d = i7;
    }

    @Override // y1.C2354b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f2476d) {
            case 0:
                super.c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    @Override // y1.C2354b
    public final void d(View view, z1.e eVar) {
        int scrollRange;
        switch (this.f2476d) {
            case 0:
                this.f26680a.onInitializeAccessibilityNodeInfo(view, eVar.f28173a);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                eVar.i(ScrollView.class.getName());
                if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                    return;
                }
                eVar.m(true);
                if (nestedScrollView.getScrollY() > 0) {
                    eVar.b(z1.d.f28162i);
                    eVar.b(z1.d.f28164m);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    eVar.b(z1.d.f28161h);
                    eVar.b(z1.d.f28166o);
                    return;
                }
                return;
            case 1:
                this.f26680a.onInitializeAccessibilityNodeInfo(view, eVar.f28173a);
                eVar.j(null);
                return;
            case 2:
                this.f26680a.onInitializeAccessibilityNodeInfo(view, eVar.f28173a);
                eVar.m(false);
                return;
            default:
                this.f26680a.onInitializeAccessibilityNodeInfo(view, eVar.f28173a);
                eVar.j(null);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if (r6 != 16908346) goto L11;
     */
    @Override // y1.C2354b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean g(View view, int i7, Bundle bundle) {
        switch (this.f2476d) {
            case 0:
                if (super.g(view, i7, bundle)) {
                    return true;
                }
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                if (nestedScrollView.isEnabled()) {
                    int height = nestedScrollView.getHeight();
                    Rect rect = new Rect();
                    if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                        height = rect.height();
                    }
                    if (i7 != 4096) {
                        if (i7 != 8192 && i7 != 16908344) {
                            break;
                        } else {
                            int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                            if (max != nestedScrollView.getScrollY()) {
                                nestedScrollView.u(true, 0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY());
                                return true;
                            }
                        }
                    }
                    int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                    if (min != nestedScrollView.getScrollY()) {
                        nestedScrollView.u(true, 0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY());
                        return true;
                    }
                }
                return false;
            default:
                return super.g(view, i7, bundle);
        }
    }
}
