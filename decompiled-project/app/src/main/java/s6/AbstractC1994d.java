package s6;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import com.kt.apps.media.xemtv.beta.R;
import java.util.WeakHashMap;
import y1.K;

/* renamed from: s6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1994d extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public int f24156a;

    /* renamed from: b, reason: collision with root package name */
    public int f24157b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24158c;

    /* renamed from: d, reason: collision with root package name */
    public int f24159d;

    public int getItemSpacing() {
        return this.f24157b;
    }

    public int getLineSpacing() {
        return this.f24156a;
    }

    public int getRowCount() {
        return this.f24159d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        if (getChildCount() == 0) {
            this.f24159d = 0;
            return;
        }
        this.f24159d = 1;
        WeakHashMap weakHashMap = K.f26642a;
        boolean z10 = getLayoutDirection() == 1;
        int paddingRight = z10 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z10 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i15 = (i11 - i7) - paddingLeft;
        int i16 = paddingRight;
        int i17 = paddingTop;
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i14 = marginLayoutParams.getMarginStart();
                    i13 = marginLayoutParams.getMarginEnd();
                } else {
                    i13 = 0;
                    i14 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i16 + i14;
                if (!this.f24158c && measuredWidth > i15) {
                    i17 = this.f24156a + paddingTop;
                    this.f24159d++;
                    i16 = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f24159d - 1));
                int i19 = i16 + i14;
                int measuredWidth2 = childAt.getMeasuredWidth() + i19;
                int measuredHeight = childAt.getMeasuredHeight() + i17;
                if (z10) {
                    childAt.layout(i15 - measuredWidth2, i17, (i15 - i16) - i14, measuredHeight);
                } else {
                    childAt.layout(i19, i17, measuredWidth2, measuredHeight);
                }
                i16 += childAt.getMeasuredWidth() + i14 + i13 + this.f24157b;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i7);
        int mode = View.MeasureSpec.getMode(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        int i15 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i15 - getPaddingRight();
        int i16 = paddingTop;
        int i17 = 0;
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i7, i10);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i13 = marginLayoutParams.leftMargin;
                    i12 = marginLayoutParams.rightMargin;
                } else {
                    i12 = 0;
                    i13 = 0;
                }
                int i19 = paddingLeft;
                if (childAt.getMeasuredWidth() + paddingLeft + i13 <= paddingRight || ((ChipGroup) this).f24158c) {
                    i14 = i19;
                } else {
                    i14 = getPaddingLeft();
                    i16 = this.f24156a + paddingTop;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i14 + i13;
                int measuredHeight = childAt.getMeasuredHeight() + i16;
                if (measuredWidth > i17) {
                    i17 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i13 + i12 + this.f24157b + i14;
                if (i18 == getChildCount() - 1) {
                    i17 += i12;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i17;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i11 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i11 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != i11) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i7) {
        this.f24157b = i7;
    }

    public void setLineSpacing(int i7) {
        this.f24156a = i7;
    }

    public void setSingleLine(boolean z8) {
        this.f24158c = z8;
    }
}
