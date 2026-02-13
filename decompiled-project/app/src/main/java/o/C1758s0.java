package o;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: o.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1758s0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1770y0 f21598a;

    public C1758s0(C1770y0 c1770y0) {
        this.f21598a = c1770y0;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i7, long j) {
        C1747m0 c1747m0;
        if (i7 == -1 || (c1747m0 = this.f21598a.f21640c) == null) {
            return;
        }
        c1747m0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
