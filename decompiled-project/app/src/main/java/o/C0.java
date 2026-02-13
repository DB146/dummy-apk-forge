package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import n.C1675i;
import n.C1680n;
import n.MenuC1678l;

/* loaded from: classes.dex */
public final class C0 extends C1747m0 {

    /* renamed from: A, reason: collision with root package name */
    public final int f21360A;

    /* renamed from: B, reason: collision with root package name */
    public final int f21361B;

    /* renamed from: C, reason: collision with root package name */
    public InterfaceC1772z0 f21362C;

    /* renamed from: D, reason: collision with root package name */
    public C1680n f21363D;

    public C0(Context context, boolean z8) {
        super(context, z8);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f21360A = 21;
            this.f21361B = 22;
        } else {
            this.f21360A = 22;
            this.f21361B = 21;
        }
    }

    @Override // o.C1747m0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C1675i c1675i;
        int i7;
        int pointToPosition;
        int i10;
        if (this.f21362C != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i7 = headerViewListAdapter.getHeadersCount();
                c1675i = (C1675i) headerViewListAdapter.getWrappedAdapter();
            } else {
                c1675i = (C1675i) adapter;
                i7 = 0;
            }
            C1680n item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i10 = pointToPosition - i7) < 0 || i10 >= c1675i.getCount()) ? null : c1675i.getItem(i10);
            C1680n c1680n = this.f21363D;
            if (c1680n != item) {
                MenuC1678l menuC1678l = c1675i.f20936a;
                if (c1680n != null) {
                    this.f21362C.f(menuC1678l, c1680n);
                }
                this.f21363D = item;
                if (item != null) {
                    this.f21362C.n(menuC1678l, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i7 == this.f21360A) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i7 != this.f21361B) {
            return super.onKeyDown(i7, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C1675i) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C1675i) adapter).f20936a.c(false);
        return true;
    }

    public void setHoverListener(InterfaceC1772z0 interfaceC1772z0) {
        this.f21362C = interfaceC1772z0;
    }

    @Override // o.C1747m0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
