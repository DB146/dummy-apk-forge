package C6;

import android.view.View;
import android.widget.AdapterView;
import o.C1770y0;
import o.I;
import o.L;

/* loaded from: classes.dex */
public final class q implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3007b;

    public /* synthetic */ q(Object obj, int i7) {
        this.f3006a = i7;
        this.f3007b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j) {
        Object item;
        switch (this.f3006a) {
            case 0:
                s sVar = (s) this.f3007b;
                if (i7 < 0) {
                    C1770y0 c1770y0 = sVar.f3011e;
                    item = !c1770y0.f21637N.isShowing() ? null : c1770y0.f21640c.getSelectedItem();
                } else {
                    item = sVar.getAdapter().getItem(i7);
                }
                s.a(sVar, item);
                AdapterView.OnItemClickListener onItemClickListener = sVar.getOnItemClickListener();
                C1770y0 c1770y02 = sVar.f3011e;
                if (onItemClickListener != null) {
                    if (view == null || i7 < 0) {
                        view = c1770y02.f21637N.isShowing() ? c1770y02.f21640c.getSelectedView() : null;
                        i7 = !c1770y02.f21637N.isShowing() ? -1 : c1770y02.f21640c.getSelectedItemPosition();
                        j = !c1770y02.f21637N.isShowing() ? Long.MIN_VALUE : c1770y02.f21640c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(c1770y02.f21640c, view, i7, j);
                }
                c1770y02.dismiss();
                return;
            default:
                I i10 = (I) this.f3007b;
                i10.f21394U.setSelection(i7);
                L l10 = i10.f21394U;
                if (l10.getOnItemClickListener() != null) {
                    l10.performItemClick(view, i7, i10.f21391R.getItemId(i7));
                }
                i10.dismiss();
                return;
        }
    }
}
