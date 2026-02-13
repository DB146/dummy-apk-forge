package n;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: n.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1675i extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final MenuC1678l f20936a;

    /* renamed from: b, reason: collision with root package name */
    public int f20937b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20938c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f20939d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f20940e;

    /* renamed from: f, reason: collision with root package name */
    public final int f20941f;

    public C1675i(MenuC1678l menuC1678l, LayoutInflater layoutInflater, boolean z8, int i7) {
        this.f20939d = z8;
        this.f20940e = layoutInflater;
        this.f20936a = menuC1678l;
        this.f20941f = i7;
        a();
    }

    public final void a() {
        MenuC1678l menuC1678l = this.f20936a;
        C1680n c1680n = menuC1678l.f20952J;
        if (c1680n != null) {
            menuC1678l.i();
            ArrayList arrayList = menuC1678l.f20963x;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((C1680n) arrayList.get(i7)) == c1680n) {
                    this.f20937b = i7;
                    return;
                }
            }
        }
        this.f20937b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1680n getItem(int i7) {
        ArrayList l10;
        MenuC1678l menuC1678l = this.f20936a;
        if (this.f20939d) {
            menuC1678l.i();
            l10 = menuC1678l.f20963x;
        } else {
            l10 = menuC1678l.l();
        }
        int i10 = this.f20937b;
        if (i10 >= 0 && i7 >= i10) {
            i7++;
        }
        return (C1680n) l10.get(i7);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l10;
        MenuC1678l menuC1678l = this.f20936a;
        if (this.f20939d) {
            menuC1678l.i();
            l10 = menuC1678l.f20963x;
        } else {
            l10 = menuC1678l.l();
        }
        return this.f20937b < 0 ? l10.size() : l10.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        boolean z8 = false;
        if (view == null) {
            view = this.f20940e.inflate(this.f20941f, viewGroup, false);
        }
        int i10 = getItem(i7).f20986b;
        int i11 = i7 - 1;
        int i12 = i11 >= 0 ? getItem(i11).f20986b : i10;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f20936a.m() && i10 != i12) {
            z8 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z8);
        InterfaceC1691y interfaceC1691y = (InterfaceC1691y) view;
        if (this.f20938c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC1691y.a(getItem(i7));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
