package com.kt.apps.core.base.leanback;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public class ThumbsBar extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public int f16100a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16101b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16102c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16103d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16104e;

    /* renamed from: f, reason: collision with root package name */
    public int f16105f;

    /* renamed from: u, reason: collision with root package name */
    public final SparseArray f16106u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f16107v;

    public ThumbsBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f16100a = -1;
        this.f16106u = new SparseArray();
        this.f16107v = false;
        this.f16101b = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_thumbs_width);
        this.f16102c = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_thumbs_height);
        this.f16104e = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_hero_thumbs_width);
        this.f16103d = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_hero_thumbs_height);
        this.f16105f = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_thumbs_margin);
    }

    public final void a() {
        int i7;
        int i10;
        while (getChildCount() > this.f16100a) {
            removeView(getChildAt(getChildCount() - 1));
        }
        while (true) {
            int childCount = getChildCount();
            int i11 = this.f16100a;
            i7 = this.f16102c;
            i10 = this.f16101b;
            if (childCount >= i11) {
                break;
            } else {
                addView(new ImageView(getContext()), new LinearLayout.LayoutParams(i10, i7));
            }
        }
        int heroIndex = getHeroIndex();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (heroIndex == i12) {
                layoutParams.width = this.f16103d;
                layoutParams.height = this.f16104e;
            } else {
                layoutParams.width = i10;
                layoutParams.height = i7;
            }
            childAt.setLayoutParams(layoutParams);
        }
    }

    public int getHeroIndex() {
        return getChildCount() / 2;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        super.onLayout(z8, i7, i10, i11, i12);
        int heroIndex = getHeroIndex();
        View childAt = getChildAt(heroIndex);
        int width = (getWidth() / 2) - (childAt.getMeasuredWidth() / 2);
        int measuredWidth = (childAt.getMeasuredWidth() / 2) + (getWidth() / 2);
        childAt.layout(width, getPaddingTop(), measuredWidth, childAt.getMeasuredHeight() + getPaddingTop());
        int measuredHeight = (childAt.getMeasuredHeight() / 2) + getPaddingTop();
        for (int i13 = heroIndex - 1; i13 >= 0; i13--) {
            int i14 = width - this.f16105f;
            View childAt2 = getChildAt(i13);
            childAt2.layout(i14 - childAt2.getMeasuredWidth(), measuredHeight - (childAt2.getMeasuredHeight() / 2), i14, (childAt2.getMeasuredHeight() / 2) + measuredHeight);
            width = i14 - childAt2.getMeasuredWidth();
        }
        while (true) {
            heroIndex++;
            if (heroIndex >= this.f16100a) {
                return;
            }
            int i15 = measuredWidth + this.f16105f;
            View childAt3 = getChildAt(heroIndex);
            childAt3.layout(i15, measuredHeight - (childAt3.getMeasuredHeight() / 2), childAt3.getMeasuredWidth() + i15, (childAt3.getMeasuredHeight() / 2) + measuredHeight);
            measuredWidth = i15 + childAt3.getMeasuredWidth();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int measuredWidth = getMeasuredWidth();
        if (this.f16107v) {
            return;
        }
        int i11 = measuredWidth - this.f16103d;
        int i12 = ((i11 + r3) - 1) / (this.f16101b + this.f16105f);
        if (i12 < 2) {
            i12 = 2;
        } else if ((i12 & 1) != 0) {
            i12++;
        }
        int i13 = i12 + 1;
        if (this.f16100a != i13) {
            this.f16100a = i13;
            a();
        }
    }

    public void setNumberOfThumbs(int i7) {
        this.f16107v = true;
        this.f16100a = i7;
        a();
    }

    public void setThumbSpace(int i7) {
        this.f16105f = i7;
        requestLayout();
    }
}
