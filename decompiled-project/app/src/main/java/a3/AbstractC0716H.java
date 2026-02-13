package a3;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: a3.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0716H {
    public static void a(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    public static void b(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public static void c(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
