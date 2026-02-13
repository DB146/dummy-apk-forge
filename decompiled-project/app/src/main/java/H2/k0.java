package H2;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import y1.C2354b;

/* loaded from: classes.dex */
public final class k0 extends C2354b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f4737d;

    /* renamed from: e, reason: collision with root package name */
    public final j0 f4738e;

    public k0(RecyclerView recyclerView) {
        this.f4737d = recyclerView;
        j0 j0Var = this.f4738e;
        if (j0Var != null) {
            this.f4738e = j0Var;
        } else {
            this.f4738e = new j0(this);
        }
    }

    @Override // y1.C2354b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f4737d.O()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().e0(accessibilityEvent);
        }
    }

    @Override // y1.C2354b
    public final void d(View view, z1.e eVar) {
        this.f26680a.onInitializeAccessibilityNodeInfo(view, eVar.f28173a);
        RecyclerView recyclerView = this.f4737d;
        if (recyclerView.O() || recyclerView.getLayoutManager() == null) {
            return;
        }
        androidx.recyclerview.widget.a layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f13708b;
        layoutManager.f0(recyclerView2.f13651c, recyclerView2.f13676v0, eVar);
    }

    @Override // y1.C2354b
    public final boolean g(View view, int i7, Bundle bundle) {
        if (super.g(view, i7, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f4737d;
        if (recyclerView.O() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        androidx.recyclerview.widget.a layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f13708b;
        return layoutManager.x0(i7, recyclerView2.f13651c, recyclerView2.f13676v0);
    }
}
