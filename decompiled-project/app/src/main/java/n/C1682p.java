package n;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import m.InterfaceC1520b;

/* renamed from: n.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1682p extends FrameLayout implements InterfaceC1520b {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f21000a;

    /* JADX WARN: Multi-variable type inference failed */
    public C1682p(View view) {
        super(view.getContext());
        this.f21000a = (CollapsibleActionView) view;
        addView(view);
    }
}
