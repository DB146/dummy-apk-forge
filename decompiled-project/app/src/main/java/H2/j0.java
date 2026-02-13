package H2;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import y1.C2354b;
import y1.C2355c;

/* loaded from: classes.dex */
public final class j0 extends C2354b {

    /* renamed from: d, reason: collision with root package name */
    public final k0 f4733d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f4734e = new WeakHashMap();

    public j0(k0 k0Var) {
        this.f4733d = k0Var;
    }

    @Override // y1.C2354b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C2354b c2354b = (C2354b) this.f4734e.get(view);
        return c2354b != null ? c2354b.a(view, accessibilityEvent) : this.f26680a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // y1.C2354b
    public final C2355c b(View view) {
        C2354b c2354b = (C2354b) this.f4734e.get(view);
        return c2354b != null ? c2354b.b(view) : super.b(view);
    }

    @Override // y1.C2354b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C2354b c2354b = (C2354b) this.f4734e.get(view);
        if (c2354b != null) {
            c2354b.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // y1.C2354b
    public final void d(View view, z1.e eVar) {
        k0 k0Var = this.f4733d;
        boolean O10 = k0Var.f4737d.O();
        View.AccessibilityDelegate accessibilityDelegate = this.f26680a;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f28173a;
        if (!O10) {
            RecyclerView recyclerView = k0Var.f4737d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().h0(view, eVar);
                C2354b c2354b = (C2354b) this.f4734e.get(view);
                if (c2354b != null) {
                    c2354b.d(view, eVar);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // y1.C2354b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C2354b c2354b = (C2354b) this.f4734e.get(view);
        if (c2354b != null) {
            c2354b.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // y1.C2354b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C2354b c2354b = (C2354b) this.f4734e.get(viewGroup);
        return c2354b != null ? c2354b.f(viewGroup, view, accessibilityEvent) : this.f26680a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // y1.C2354b
    public final boolean g(View view, int i7, Bundle bundle) {
        k0 k0Var = this.f4733d;
        if (!k0Var.f4737d.O()) {
            RecyclerView recyclerView = k0Var.f4737d;
            if (recyclerView.getLayoutManager() != null) {
                C2354b c2354b = (C2354b) this.f4734e.get(view);
                if (c2354b != null) {
                    if (c2354b.g(view, i7, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i7, bundle)) {
                    return true;
                }
                Y y10 = recyclerView.getLayoutManager().f13708b.f13651c;
                return false;
            }
        }
        return super.g(view, i7, bundle);
    }

    @Override // y1.C2354b
    public final void h(View view, int i7) {
        C2354b c2354b = (C2354b) this.f4734e.get(view);
        if (c2354b != null) {
            c2354b.h(view, i7);
        } else {
            super.h(view, i7);
        }
    }

    @Override // y1.C2354b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C2354b c2354b = (C2354b) this.f4734e.get(view);
        if (c2354b != null) {
            c2354b.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
