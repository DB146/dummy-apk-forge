package y6;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import x6.C2268a;

/* renamed from: y6.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2407m extends r {

    /* renamed from: c, reason: collision with root package name */
    public final o f27060c;

    public C2407m(o oVar) {
        this.f27060c = oVar;
    }

    @Override // y6.r
    public final void a(Matrix matrix, C2268a c2268a, int i7, Canvas canvas) {
        o oVar = this.f27060c;
        float f4 = oVar.f27069f;
        float f10 = oVar.g;
        RectF rectF = new RectF(oVar.f27065b, oVar.f27066c, oVar.f27067d, oVar.f27068e);
        c2268a.getClass();
        boolean z8 = f10 < 0.0f;
        Path path = c2268a.g;
        int[] iArr = C2268a.k;
        if (z8) {
            iArr[0] = 0;
            iArr[1] = c2268a.f26233f;
            iArr[2] = c2268a.f26232e;
            iArr[3] = c2268a.f26231d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f4, f10);
            path.close();
            float f11 = -i7;
            rectF.inset(f11, f11);
            iArr[0] = 0;
            iArr[1] = c2268a.f26231d;
            iArr[2] = c2268a.f26232e;
            iArr[3] = c2268a.f26233f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f12 = 1.0f - (i7 / width);
        float[] fArr = C2268a.f26227l;
        fArr[1] = f12;
        fArr[2] = ((1.0f - f12) / 2.0f) + f12;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = c2268a.f26229b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z8) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, c2268a.f26234h);
        }
        canvas.drawArc(rectF, f4, f10, true, paint);
        canvas.restore();
    }
}
