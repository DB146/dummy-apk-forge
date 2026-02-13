package y6;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class o extends q {

    /* renamed from: h, reason: collision with root package name */
    public static final RectF f27064h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f27065b;

    /* renamed from: c, reason: collision with root package name */
    public final float f27066c;

    /* renamed from: d, reason: collision with root package name */
    public final float f27067d;

    /* renamed from: e, reason: collision with root package name */
    public final float f27068e;

    /* renamed from: f, reason: collision with root package name */
    public float f27069f;
    public float g;

    public o(float f4, float f10, float f11, float f12) {
        this.f27065b = f4;
        this.f27066c = f10;
        this.f27067d = f11;
        this.f27068e = f12;
    }

    @Override // y6.q
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f27072a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f27064h;
        rectF.set(this.f27065b, this.f27066c, this.f27067d, this.f27068e);
        path.arcTo(rectF, this.f27069f, this.g, false);
        path.transform(matrix);
    }
}
