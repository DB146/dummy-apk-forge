package t;

import android.graphics.drawable.Drawable;

/* renamed from: t.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2014b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f24409a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f4, float f10, boolean z8) {
        if (!z8) {
            return f4;
        }
        return (float) (((1.0d - f24409a) * f10) + f4);
    }

    public static float b(float f4, float f10, boolean z8) {
        if (!z8) {
            return f4 * 1.5f;
        }
        return (float) (((1.0d - f24409a) * f10) + (f4 * 1.5f));
    }
}
