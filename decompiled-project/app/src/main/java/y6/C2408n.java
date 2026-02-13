package y6;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import x6.C2268a;

/* renamed from: y6.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2408n extends r {

    /* renamed from: c, reason: collision with root package name */
    public final p f27061c;

    /* renamed from: d, reason: collision with root package name */
    public final float f27062d;

    /* renamed from: e, reason: collision with root package name */
    public final float f27063e;

    public C2408n(p pVar, float f4, float f10) {
        this.f27061c = pVar;
        this.f27062d = f4;
        this.f27063e = f10;
    }

    @Override // y6.r
    public final void a(Matrix matrix, C2268a c2268a, int i7, Canvas canvas) {
        p pVar = this.f27061c;
        float f4 = pVar.f27071c;
        float f10 = this.f27063e;
        float f11 = pVar.f27070b;
        float f12 = this.f27062d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f4 - f10, f11 - f12), 0.0f);
        Matrix matrix2 = this.f27074a;
        matrix2.set(matrix);
        matrix2.preTranslate(f12, f10);
        matrix2.preRotate(b());
        c2268a.getClass();
        rectF.bottom += i7;
        rectF.offset(0.0f, -i7);
        int[] iArr = C2268a.f26226i;
        iArr[0] = c2268a.f26233f;
        iArr[1] = c2268a.f26232e;
        iArr[2] = c2268a.f26231d;
        Paint paint = c2268a.f26230c;
        float f13 = rectF.left;
        paint.setShader(new LinearGradient(f13, rectF.top, f13, rectF.bottom, iArr, C2268a.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        p pVar = this.f27061c;
        return (float) Math.toDegrees(Math.atan((pVar.f27071c - this.f27063e) / (pVar.f27070b - this.f27062d)));
    }
}
