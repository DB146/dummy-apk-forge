package B0;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import j0.AbstractC1362A;

/* renamed from: B0.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0198q0 implements InterfaceC0196p0 {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f1951a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final int[] f1952b = new int[2];

    @Override // B0.InterfaceC0196p0
    public void a(View view, float[] fArr) {
        Matrix matrix = this.f1951a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f1952b;
        view.getLocationOnScreen(iArr);
        int i7 = iArr[0];
        int i10 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i7, iArr[1] - i10);
        AbstractC1362A.v(fArr, matrix);
    }
}
