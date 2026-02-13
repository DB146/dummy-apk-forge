package com.kt.apps.core.base.leanback;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public class ScaleFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public float f16010a;

    /* renamed from: b, reason: collision with root package name */
    public float f16011b;

    /* renamed from: c, reason: collision with root package name */
    public float f16012c;

    public ScaleFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f16010a = 1.0f;
        this.f16011b = 1.0f;
        this.f16012c = 1.0f;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        view.setScaleX(this.f16012c);
        view.setScaleY(this.f16012c);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i7, ViewGroup.LayoutParams layoutParams, boolean z8) {
        boolean addViewInLayout = super.addViewInLayout(view, i7, layoutParams, z8);
        if (addViewInLayout) {
            view.setScaleX(this.f16012c);
            view.setScaleY(this.f16012c);
        }
        return addViewInLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        int paddingLeft;
        int i13;
        int paddingRight;
        int paddingTop;
        int i14;
        int paddingBottom;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        ScaleFrameLayout scaleFrameLayout = this;
        int childCount = getChildCount();
        int layoutDirection = getLayoutDirection();
        float width = layoutDirection == 1 ? getWidth() - getPivotX() : getPivotX();
        if (scaleFrameLayout.f16010a != 1.0f) {
            int paddingLeft2 = getPaddingLeft();
            float f4 = scaleFrameLayout.f16010a;
            paddingLeft = paddingLeft2 + ((int) ((width - (width / f4)) + 0.5f));
            i13 = (int) ((((i11 - i7) - width) / f4) + width + 0.5f);
            paddingRight = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
            i13 = i11 - i7;
            paddingRight = getPaddingRight();
        }
        int i22 = i13 - paddingRight;
        float pivotY = getPivotY();
        if (scaleFrameLayout.f16011b != 1.0f) {
            int paddingTop2 = getPaddingTop();
            float f10 = scaleFrameLayout.f16011b;
            paddingTop = paddingTop2 + ((int) ((pivotY - (pivotY / f10)) + 0.5f));
            i14 = (int) ((((i12 - i10) - pivotY) / f10) + pivotY + 0.5f);
            paddingBottom = getPaddingBottom();
        } else {
            paddingTop = getPaddingTop();
            i14 = i12 - i10;
            paddingBottom = getPaddingBottom();
        }
        int i23 = i14 - paddingBottom;
        int i24 = 0;
        while (i24 < childCount) {
            View childAt = scaleFrameLayout.getChildAt(i24);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i25 = layoutParams.gravity;
                if (i25 == -1) {
                    i25 = 8388659;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i25, layoutDirection);
                int i26 = i25 & 112;
                int i27 = absoluteGravity & 7;
                if (i27 == 1) {
                    i15 = (((i22 - paddingLeft) - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                    i16 = layoutParams.rightMargin;
                } else if (i27 != 5) {
                    i17 = layoutParams.leftMargin + paddingLeft;
                    if (i26 == 16) {
                        if (i26 == 48) {
                            i21 = layoutParams.topMargin;
                        } else if (i26 != 80) {
                            i21 = layoutParams.topMargin;
                        } else {
                            i18 = i23 - measuredHeight;
                            i19 = layoutParams.bottomMargin;
                        }
                        i20 = i21 + paddingTop;
                        childAt.layout(i17, i20, measuredWidth + i17, measuredHeight + i20);
                        childAt.setPivotX(width - i17);
                        childAt.setPivotY(pivotY - i20);
                    } else {
                        i18 = (((i23 - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams.topMargin;
                        i19 = layoutParams.bottomMargin;
                    }
                    i20 = i18 - i19;
                    childAt.layout(i17, i20, measuredWidth + i17, measuredHeight + i20);
                    childAt.setPivotX(width - i17);
                    childAt.setPivotY(pivotY - i20);
                } else {
                    i15 = i22 - measuredWidth;
                    i16 = layoutParams.rightMargin;
                }
                i17 = i15 - i16;
                if (i26 == 16) {
                }
                i20 = i18 - i19;
                childAt.layout(i17, i20, measuredWidth + i17, measuredHeight + i20);
                childAt.setPivotX(width - i17);
                childAt.setPivotY(pivotY - i20);
            }
            i24++;
            scaleFrameLayout = this;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        float f4 = this.f16010a;
        if (f4 == 1.0f && this.f16011b == 1.0f) {
            super.onMeasure(i7, i10);
            return;
        }
        if (f4 != 1.0f) {
            i7 = View.MeasureSpec.makeMeasureSpec((int) ((View.MeasureSpec.getSize(i7) / f4) + 0.5f), View.MeasureSpec.getMode(i7));
        }
        float f10 = this.f16011b;
        if (f10 != 1.0f) {
            i10 = View.MeasureSpec.makeMeasureSpec((int) ((View.MeasureSpec.getSize(i10) / f10) + 0.5f), View.MeasureSpec.getMode(i10));
        }
        super.onMeasure(i7, i10);
        setMeasuredDimension((int) ((getMeasuredWidth() * this.f16010a) + 0.5f), (int) ((getMeasuredHeight() * this.f16011b) + 0.5f));
    }

    public void setChildScale(float f4) {
        if (this.f16012c != f4) {
            this.f16012c = f4;
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                getChildAt(i7).setScaleX(f4);
                getChildAt(i7).setScaleY(f4);
            }
        }
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        throw new UnsupportedOperationException();
    }

    public void setLayoutScaleX(float f4) {
        if (f4 != this.f16010a) {
            this.f16010a = f4;
            requestLayout();
        }
    }

    public void setLayoutScaleY(float f4) {
        if (f4 != this.f16011b) {
            this.f16011b = f4;
            requestLayout();
        }
    }
}
