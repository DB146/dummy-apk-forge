package com.google.ads.interactivemedia.v3.api;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public interface CompanionAdSlot {
    public static final int FLUID_SIZE = -2;

    /* loaded from: classes.dex */
    public interface ClickListener {
        void onCompanionAdClick();
    }

    void addClickListener(ClickListener clickListener);

    ViewGroup getContainer();

    int getHeight();

    int getWidth();

    boolean isFilled();

    void removeClickListener(ClickListener clickListener);

    void setContainer(ViewGroup viewGroup);

    void setSize(int i7, int i10);
}
