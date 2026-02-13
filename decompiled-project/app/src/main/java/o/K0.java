package o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import h.AbstractC1213a;
import q1.AbstractC1875a;

/* loaded from: classes.dex */
public abstract class K0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f21396a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f21397b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f21398c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f21399d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f21400e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f21401f = new int[0];
    public static final int[] g = new int[1];

    public static void a(Context context, View view) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC1213a.j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i7) {
        ColorStateList d10 = d(context, i7);
        if (d10 != null && d10.isStateful()) {
            return d10.getColorForState(f21397b, d10.getDefaultColor());
        }
        ThreadLocal threadLocal = f21396a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f4 = typedValue.getFloat();
        return AbstractC1875a.h(c(context, i7), Math.round(Color.alpha(r4) * f4));
    }

    public static int c(Context context, int i7) {
        int[] iArr = g;
        iArr[0] = i7;
        l2.X t5 = l2.X.t(context, null, iArr);
        try {
            return ((TypedArray) t5.f19195c).getColor(0, 0);
        } finally {
            t5.w();
        }
    }

    public static ColorStateList d(Context context, int i7) {
        int[] iArr = g;
        iArr[0] = i7;
        l2.X t5 = l2.X.t(context, null, iArr);
        try {
            return t5.m(0);
        } finally {
            t5.w();
        }
    }
}
