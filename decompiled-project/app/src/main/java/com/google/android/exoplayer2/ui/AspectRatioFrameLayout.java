package com.google.android.exoplayer2.ui;

import A9.J;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import l5.AbstractC1498l;
import l5.InterfaceC1487a;

@Deprecated
/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f14734d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final J f14735a;

    /* renamed from: b, reason: collision with root package name */
    public float f14736b;

    /* renamed from: c, reason: collision with root package name */
    public int f14737c;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14737c = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC1498l.f19519a, 0, 0);
            try {
                this.f14737c = obtainStyledAttributes.getInt(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f14735a = new J(this);
    }

    public int getResizeMode() {
        return this.f14737c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        float f4;
        float f10;
        super.onMeasure(i7, i10);
        if (this.f14736b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f11 = measuredWidth;
        float f12 = measuredHeight;
        float f13 = (this.f14736b / (f11 / f12)) - 1.0f;
        float abs = Math.abs(f13);
        J j = this.f14735a;
        if (abs <= 0.01f) {
            if (j.f841b) {
                return;
            }
            j.f841b = true;
            ((AspectRatioFrameLayout) j.f842c).post(j);
            return;
        }
        int i11 = this.f14737c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f4 = this.f14736b;
                } else if (i11 == 4) {
                    if (f13 > 0.0f) {
                        f4 = this.f14736b;
                    } else {
                        f10 = this.f14736b;
                    }
                }
                measuredWidth = (int) (f12 * f4);
            } else {
                f10 = this.f14736b;
            }
            measuredHeight = (int) (f11 / f10);
        } else if (f13 > 0.0f) {
            f10 = this.f14736b;
            measuredHeight = (int) (f11 / f10);
        } else {
            f4 = this.f14736b;
            measuredWidth = (int) (f12 * f4);
        }
        if (!j.f841b) {
            j.f841b = true;
            ((AspectRatioFrameLayout) j.f842c).post(j);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f4) {
        if (this.f14736b != f4) {
            this.f14736b = f4;
            requestLayout();
        }
    }

    public void setAspectRatioListener(InterfaceC1487a interfaceC1487a) {
    }

    public void setResizeMode(int i7) {
        if (this.f14737c != i7) {
            this.f14737c = i7;
            requestLayout();
        }
    }
}
