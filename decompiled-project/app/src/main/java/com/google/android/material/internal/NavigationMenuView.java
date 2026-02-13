package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import n.InterfaceC1692z;
import n.MenuC1678l;

/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC1692z {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    @Override // n.InterfaceC1692z
    public final void b(MenuC1678l menuC1678l) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
