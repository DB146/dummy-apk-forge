package y;

import android.view.ViewConfiguration;

/* renamed from: y.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2315x {

    /* renamed from: a, reason: collision with root package name */
    public static final float f26534a = ViewConfiguration.getScrollFriction();

    /* renamed from: b, reason: collision with root package name */
    public static final double f26535b;

    /* renamed from: c, reason: collision with root package name */
    public static final double f26536c;

    static {
        double log = Math.log(0.78d) / Math.log(0.9d);
        f26535b = log;
        f26536c = log - 1.0d;
    }
}
