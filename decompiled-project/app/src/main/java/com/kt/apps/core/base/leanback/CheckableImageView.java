package com.kt.apps.core.base.leanback;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public class CheckableImageView extends ImageView implements Checkable {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f15915b = {R.attr.state_checked};

    /* renamed from: a, reason: collision with root package name */
    public boolean f15916a;

    public CheckableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f15916a;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i7) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i7 + 1);
        if (this.f15916a) {
            View.mergeDrawableStates(onCreateDrawableState, f15915b);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z8) {
        if (this.f15916a != z8) {
            this.f15916a = z8;
            refreshDrawableState();
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f15916a);
    }
}
