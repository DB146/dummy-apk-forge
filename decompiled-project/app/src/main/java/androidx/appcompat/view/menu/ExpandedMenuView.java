package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import l2.X;
import n.C1680n;
import n.InterfaceC1677k;
import n.InterfaceC1692z;
import n.MenuC1678l;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC1677k, InterfaceC1692z, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f12895b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public MenuC1678l f12896a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        X u3 = X.u(context, attributeSet, f12895b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) u3.f19195c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(u3.n(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(u3.n(1));
        }
        u3.w();
    }

    @Override // n.InterfaceC1692z
    public final void b(MenuC1678l menuC1678l) {
        this.f12896a = menuC1678l;
    }

    @Override // n.InterfaceC1677k
    public final boolean c(C1680n c1680n) {
        return this.f12896a.q(c1680n, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j) {
        c((C1680n) getAdapter().getItem(i7));
    }
}
