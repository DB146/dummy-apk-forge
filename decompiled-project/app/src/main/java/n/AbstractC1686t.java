package n;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: n.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1686t implements InterfaceC1664B, InterfaceC1690x, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Rect f21007a;

    public static int m(ListAdapter listAdapter, Context context, int i7) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i10 = 0;
        int i11 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i12 = 0; i12 < count; i12++) {
            int itemViewType = listAdapter.getItemViewType(i12);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i12, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i7) {
                return i7;
            }
            if (measuredWidth > i10) {
                i10 = measuredWidth;
            }
        }
        return i10;
    }

    public static boolean u(MenuC1678l menuC1678l) {
        int size = menuC1678l.f20959f.size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = menuC1678l.getItem(i7);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // n.InterfaceC1690x
    public final boolean f(C1680n c1680n) {
        return false;
    }

    @Override // n.InterfaceC1690x
    public final void g(Context context, MenuC1678l menuC1678l) {
    }

    @Override // n.InterfaceC1690x
    public final boolean k(C1680n c1680n) {
        return false;
    }

    public abstract void l(MenuC1678l menuC1678l);

    public abstract void n(View view);

    public abstract void o(boolean z8);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C1675i) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C1675i) listAdapter).f20936a.q((MenuItem) listAdapter.getItem(i7), this, !(this instanceof ViewOnKeyListenerC1672f) ? 0 : 4);
    }

    public abstract void p(int i7);

    public abstract void q(int i7);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z8);

    public abstract void t(int i7);
}
