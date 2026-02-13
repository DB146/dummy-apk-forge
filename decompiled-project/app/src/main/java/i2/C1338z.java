package i2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: i2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1338z extends AbstractC1309Q {

    /* renamed from: e, reason: collision with root package name */
    public static int f18313e;

    @Override // i2.AbstractC1309Q
    public final C1324l g(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (f18313e == 0) {
            f18313e = context.getResources().getDimensionPixelSize(R.dimen.lb_browse_selected_row_top_padding);
            context.getResources().getDimensionPixelSize(R.dimen.lb_browse_expanded_selected_row_top_padding);
            context.getResources().getDimensionPixelSize(R.dimen.lb_browse_expanded_row_no_hovercard_bottom_padding);
        }
        Context context2 = viewGroup.getContext();
        LinearLayout linearLayout = new LinearLayout(context2, null, 0);
        LayoutInflater.from(context2).inflate(R.layout.lb_list_row, linearLayout);
        linearLayout.findViewById(R.id.row_content).getClass();
        throw new ClassCastException();
    }

    @Override // i2.AbstractC1309Q
    public final void h(C1324l c1324l, boolean z8) {
        throw new ClassCastException();
    }

    @Override // i2.AbstractC1309Q
    public final void i(C1324l c1324l) {
        A3.c.p(c1324l);
        throw null;
    }

    @Override // i2.AbstractC1309Q
    public final void k(C1324l c1324l, Object obj) {
        c1324l.f18274c = obj;
        c1324l.f18273b = obj instanceof AbstractC1304L ? (AbstractC1304L) obj : null;
        throw new ClassCastException();
    }

    @Override // i2.AbstractC1309Q
    public final void n(C1324l c1324l, boolean z8) {
        super.n(c1324l, z8);
        throw new ClassCastException();
    }

    @Override // i2.AbstractC1309Q
    public final void o(C1324l c1324l, boolean z8) {
        super.o(c1324l, z8);
        throw new ClassCastException();
    }

    @Override // i2.AbstractC1309Q
    public final void p(C1324l c1324l) {
        super.p(c1324l);
        throw new ClassCastException();
    }

    @Override // i2.AbstractC1309Q
    public final void q(C1324l c1324l) {
        c1324l.getClass();
        throw new ClassCastException();
    }

    @Override // i2.AbstractC1309Q
    public final void r(C1324l c1324l, boolean z8) {
        c1324l.getClass();
        throw new ClassCastException();
    }
}
