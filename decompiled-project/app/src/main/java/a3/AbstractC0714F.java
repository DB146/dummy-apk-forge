package a3;

import A9.Q1;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* renamed from: a3.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0714F {

    /* renamed from: a, reason: collision with root package name */
    public static final C0719K f12501a;

    /* renamed from: b, reason: collision with root package name */
    public static final Q1 f12502b;

    /* JADX WARN: Type inference failed for: r0v1, types: [a3.K, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [a3.K, java.lang.Object] */
    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f12501a = new Object();
        } else {
            f12501a = new Object();
        }
        f12502b = new Q1(9, Float.class, "translationAlpha");
        new Q1(10, Rect.class, "clipBounds");
    }

    public static void a(View view, int i7, int i10, int i11, int i12) {
        f12501a.J(view, i7, i10, i11, i12);
    }

    public static void b(View view, int i7) {
        f12501a.E(view, i7);
    }
}
