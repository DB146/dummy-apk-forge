package s6;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: s6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1993c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f24154a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f24155b = new ThreadLocal();

    public static void a(ViewGroup viewGroup, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewGroup) {
            a(viewGroup, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
