package com.google.android.material.datepicker;

import Y5.A;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import c6.AbstractC0911a;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final A f15301a;

    /* renamed from: b, reason: collision with root package name */
    public final A f15302b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Q5.e.P(R.attr.materialCalendarStyle, context, l.class.getCanonicalName()).data, AbstractC0911a.f14413o);
        A.s(context, obtainStyledAttributes.getResourceId(4, 0));
        A.s(context, obtainStyledAttributes.getResourceId(2, 0));
        A.s(context, obtainStyledAttributes.getResourceId(3, 0));
        A.s(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList n6 = Tb.a.n(context, obtainStyledAttributes, 7);
        this.f15301a = A.s(context, obtainStyledAttributes.getResourceId(9, 0));
        A.s(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f15302b = A.s(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(n6.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
