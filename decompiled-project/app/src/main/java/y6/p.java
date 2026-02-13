package y6;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class p extends q {

    /* renamed from: b, reason: collision with root package name */
    public float f27070b;

    /* renamed from: c, reason: collision with root package name */
    public float f27071c;

    @Override // y6.q
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f27072a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f27070b, this.f27071c);
        path.transform(matrix);
    }
}
