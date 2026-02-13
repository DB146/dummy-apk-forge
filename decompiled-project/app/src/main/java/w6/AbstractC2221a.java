package w6;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import q1.AbstractC1875a;

/* renamed from: w6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2221a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f25808a = {R.attr.state_pressed};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f25809b = {R.attr.state_focused};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f25810c = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f25811d = {R.attr.state_selected};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f25812e = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: f, reason: collision with root package name */
    public static final String f25813f = AbstractC2221a.class.getSimpleName();

    public static int a(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return AbstractC1875a.h(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    public static ColorStateList b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f25812e, 0)) != 0) {
            Log.w(f25813f, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean c(int[] iArr) {
        boolean z8 = false;
        boolean z10 = false;
        for (int i7 : iArr) {
            if (i7 == 16842910) {
                z8 = true;
            } else if (i7 == 16842908 || i7 == 16842919 || i7 == 16843623) {
                z10 = true;
            }
        }
        return z8 && z10;
    }
}
