package a3;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* renamed from: a3.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0719K extends android.support.v4.media.session.b {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f12503f = true;
    public static boolean g = true;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f12504h = true;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f12505i = true;

    @Override // android.support.v4.media.session.b
    public void E(View view, int i7) {
        if (Build.VERSION.SDK_INT == 28) {
            super.E(view, i7);
        } else if (f12505i) {
            try {
                AbstractC0718J.a(view, i7);
            } catch (NoSuchMethodError unused) {
                f12505i = false;
            }
        }
    }

    public void J(View view, int i7, int i10, int i11, int i12) {
        if (f12504h) {
            try {
                AbstractC0717I.a(view, i7, i10, i11, i12);
            } catch (NoSuchMethodError unused) {
                f12504h = false;
            }
        }
    }

    public void K(View view, Matrix matrix) {
        if (f12503f) {
            try {
                AbstractC0716H.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f12503f = false;
            }
        }
    }

    public void L(View view, Matrix matrix) {
        if (g) {
            try {
                AbstractC0716H.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
    }
}
