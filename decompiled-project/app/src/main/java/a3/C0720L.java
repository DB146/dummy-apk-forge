package a3;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: a3.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0720L extends C0719K {
    @Override // android.support.v4.media.session.b
    public final void D(View view, float f4) {
        view.setTransitionAlpha(f4);
    }

    @Override // a3.C0719K, android.support.v4.media.session.b
    public final void E(View view, int i7) {
        view.setTransitionVisibility(i7);
    }

    @Override // a3.C0719K
    public final void J(View view, int i7, int i10, int i11, int i12) {
        view.setLeftTopRightBottom(i7, i10, i11, i12);
    }

    @Override // a3.C0719K
    public final void K(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // a3.C0719K
    public final void L(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // android.support.v4.media.session.b
    public final float x(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }
}
