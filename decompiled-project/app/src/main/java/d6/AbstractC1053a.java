package d6;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import h3.o;

/* renamed from: d6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1053a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f16531a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final Z1.a f16532b = new Z1.a(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Z1.a f16533c = new Z1.a(0);

    /* renamed from: d, reason: collision with root package name */
    public static final Z1.a f16534d = new Z1.b(Z1.a.f12134e);

    /* JADX WARN: Type inference failed for: r0v3, types: [Z1.b, Z1.a] */
    static {
        new DecelerateInterpolator();
    }

    public static float a(float f4, float f10, float f11) {
        return o.d(f10, f4, f11, f4);
    }

    public static float b(float f4, float f10, float f11, float f12, float f13) {
        return f13 <= f11 ? f4 : f13 >= f12 ? f10 : a(f4, f10, (f13 - f11) / (f12 - f11));
    }

    public static int c(float f4, int i7, int i10) {
        return Math.round(f4 * (i10 - i7)) + i7;
    }
}
