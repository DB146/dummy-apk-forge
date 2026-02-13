package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.kt.apps.media.xemtv.beta.R;
import h.AbstractC1213a;
import java.util.WeakHashMap;
import y1.K;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f13000a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13001b;

    /* renamed from: c, reason: collision with root package name */
    public int f13002c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13002c = -1;
        int[] iArr = AbstractC1213a.k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        K.m(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f13000a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f13000a);
        }
    }

    private void setStacked(boolean z8) {
        if (this.f13001b != z8) {
            if (!z8 || this.f13000a) {
                this.f13001b = z8;
                setOrientation(z8 ? 1 : 0);
                setGravity(z8 ? 8388613 : 80);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    findViewById.setVisibility(z8 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        boolean z8;
        int i12;
        int size = View.MeasureSpec.getSize(i7);
        int i13 = 0;
        if (this.f13000a) {
            if (size > this.f13002c && this.f13001b) {
                setStacked(false);
            }
            this.f13002c = size;
        }
        if (this.f13001b || View.MeasureSpec.getMode(i7) != 1073741824) {
            i11 = i7;
            z8 = false;
        } else {
            i11 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z8 = true;
        }
        super.onMeasure(i11, i10);
        if (this.f13000a && !this.f13001b && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z8 = true;
        }
        if (z8) {
            super.onMeasure(i7, i10);
        }
        int childCount = getChildCount();
        int i14 = 0;
        while (true) {
            i12 = -1;
            if (i14 >= childCount) {
                i14 = -1;
                break;
            } else if (getChildAt(i14).getVisibility() == 0) {
                break;
            } else {
                i14++;
            }
        }
        if (i14 >= 0) {
            View childAt = getChildAt(i14);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f13001b) {
                int i15 = i14 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i15 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i15).getVisibility() == 0) {
                        i12 = i15;
                        break;
                    }
                    i15++;
                }
                i13 = i12 >= 0 ? getChildAt(i12).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                i13 = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = K.f26642a;
        if (getMinimumHeight() != i13) {
            setMinimumHeight(i13);
            if (i10 == 0) {
                super.onMeasure(i7, i10);
            }
        }
    }

    public void setAllowStacking(boolean z8) {
        if (this.f13000a != z8) {
            this.f13000a = z8;
            if (!z8 && this.f13001b) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
