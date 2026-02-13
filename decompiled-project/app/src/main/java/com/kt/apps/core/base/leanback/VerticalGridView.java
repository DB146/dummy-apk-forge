package com.kt.apps.core.base.leanback;

import A9.AbstractC0145v;
import A9.N0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import i2.AbstractC1302J;
import y1.K;

/* loaded from: classes2.dex */
public class VerticalGridView extends AbstractC0145v {
    public VerticalGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1419Y0.C1(1);
        r0(context, attributeSet);
        int[] iArr = AbstractC1302J.f18218c;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        K.m(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        setColumnWidth(obtainStyledAttributes);
        setNumColumns(obtainStyledAttributes.getInt(1, 1));
        obtainStyledAttributes.recycle();
    }

    public void setColumnWidth(int i7) {
        this.f1419Y0.D1(i7);
        requestLayout();
    }

    public void setColumnWidth(TypedArray typedArray) {
        if (typedArray.peekValue(0) != null) {
            setColumnWidth(typedArray.getLayoutDimension(0, 0));
        }
    }

    public void setNumColumns(int i7) {
        N0 n02 = this.f1419Y0;
        if (i7 < 0) {
            n02.getClass();
            throw new IllegalArgumentException();
        }
        n02.f895W = i7;
        requestLayout();
    }
}
