package n;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;

/* renamed from: n.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1673g extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f20928a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1674h f20929b;

    public C1673g(C1674h c1674h) {
        this.f20929b = c1674h;
        a();
    }

    public final void a() {
        MenuC1678l menuC1678l = this.f20929b.f20932c;
        C1680n c1680n = menuC1678l.f20952J;
        if (c1680n != null) {
            menuC1678l.i();
            ArrayList arrayList = menuC1678l.f20963x;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((C1680n) arrayList.get(i7)) == c1680n) {
                    this.f20928a = i7;
                    return;
                }
            }
        }
        this.f20928a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1680n getItem(int i7) {
        C1674h c1674h = this.f20929b;
        MenuC1678l menuC1678l = c1674h.f20932c;
        menuC1678l.i();
        ArrayList arrayList = menuC1678l.f20963x;
        c1674h.getClass();
        int i10 = this.f20928a;
        if (i10 >= 0 && i7 >= i10) {
            i7++;
        }
        return (C1680n) arrayList.get(i7);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C1674h c1674h = this.f20929b;
        MenuC1678l menuC1678l = c1674h.f20932c;
        menuC1678l.i();
        int size = menuC1678l.f20963x.size();
        c1674h.getClass();
        return this.f20928a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f20929b.f20931b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC1691y) view).a(getItem(i7));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
