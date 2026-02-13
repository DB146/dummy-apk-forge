package com.google.android.material.textview;

import D6.a;
import Q5.e;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;
import c6.AbstractC0911a;

/* loaded from: classes.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        if (e.O(context2, com.kt.apps.media.xemtv.beta.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC0911a.f14419u;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int h10 = h(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (h10 != -1) {
                return;
            }
            TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
            obtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC0911a.f14418t);
                int h11 = h(getContext(), obtainStyledAttributes3, 1, 2);
                obtainStyledAttributes3.recycle();
                if (h11 >= 0) {
                    setLineHeight(h11);
                }
            }
        }
    }

    public static int h(Context context, TypedArray typedArray, int... iArr) {
        int i7 = -1;
        for (int i10 = 0; i10 < iArr.length && i7 < 0; i10++) {
            int i11 = iArr[i10];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i11, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i7 = dimensionPixelSize;
            } else {
                i7 = typedArray.getDimensionPixelSize(i11, -1);
            }
        }
        return i7;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        if (e.O(context, com.kt.apps.media.xemtv.beta.R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i7, AbstractC0911a.f14418t);
            int h10 = h(getContext(), obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (h10 >= 0) {
                setLineHeight(h10);
            }
        }
    }
}
