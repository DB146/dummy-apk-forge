package j0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* renamed from: j0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1364b implements l {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f18529a = AbstractC1365c.f18532a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f18530b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f18531c;

    @Override // j0.l
    public final void a(z zVar) {
        Canvas canvas = this.f18529a;
        if (!(zVar instanceof C1368f)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((C1368f) zVar).f18539a, Region.Op.INTERSECT);
    }

    @Override // j0.l
    public final void b(float f4, float f10) {
        this.f18529a.scale(f4, f10);
    }

    @Override // j0.l
    public final void c(float f4, float f10, float f11, float f12, float f13, float f14, E5.o oVar) {
        this.f18529a.drawRoundRect(f4, f10, f11, f12, f13, f14, (Paint) oVar.f3713b);
    }

    @Override // j0.l
    public final void e(float f4, float f10, float f11, float f12, int i7) {
        this.f18529a.clipRect(f4, f10, f11, f12, i7 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // j0.l
    public final void f(float f4, float f10) {
        this.f18529a.translate(f4, f10);
    }

    @Override // j0.l
    public final void g() {
        this.f18529a.restore();
    }

    @Override // j0.l
    public final void h(R7.b bVar, long j, long j10, long j11, E5.o oVar) {
        if (this.f18530b == null) {
            this.f18530b = new Rect();
            this.f18531c = new Rect();
        }
        Canvas canvas = this.f18529a;
        if (bVar == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
        }
        Rect rect = this.f18530b;
        kotlin.jvm.internal.l.b(rect);
        int i7 = (int) (j >> 32);
        rect.left = i7;
        int i10 = (int) (j & 4294967295L);
        rect.top = i10;
        rect.right = i7 + ((int) (j10 >> 32));
        rect.bottom = i10 + ((int) (j10 & 4294967295L));
        Rect rect2 = this.f18531c;
        kotlin.jvm.internal.l.b(rect2);
        int i11 = (int) 0;
        rect2.left = i11;
        int i12 = (int) 0;
        rect2.top = i12;
        rect2.right = i11 + ((int) (j11 >> 32));
        rect2.bottom = i12 + ((int) (j11 & 4294967295L));
        canvas.drawBitmap((Bitmap) bVar.f8929b, rect, rect2, (Paint) oVar.f3713b);
    }

    @Override // j0.l
    public final void i() {
        this.f18529a.save();
    }

    @Override // j0.l
    public final void j() {
        AbstractC1362A.h(this.f18529a, false);
    }

    @Override // j0.l
    public final void k(z zVar, E5.o oVar) {
        Canvas canvas = this.f18529a;
        if (!(zVar instanceof C1368f)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((C1368f) zVar).f18539a, (Paint) oVar.f3713b);
    }

    @Override // j0.l
    public final void l(i0.c cVar, E5.o oVar) {
        Canvas canvas = this.f18529a;
        Paint paint = (Paint) oVar.f3713b;
        canvas.saveLayer(cVar.f18174a, cVar.f18175b, cVar.f18176c, cVar.f18177d, paint, 31);
    }

    @Override // j0.l
    public final void m(float f4, long j, E5.o oVar) {
        this.f18529a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f4, (Paint) oVar.f3713b);
    }

    @Override // j0.l
    public final void n(float[] fArr) {
        if (AbstractC1362A.q(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        float f4 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        float f17 = fArr[8];
        float f18 = fArr[12];
        float f19 = fArr[13];
        float f20 = fArr[15];
        fArr[0] = f4;
        fArr[1] = f13;
        fArr[2] = f18;
        fArr[3] = f10;
        fArr[4] = f14;
        fArr[5] = f19;
        fArr[6] = f12;
        fArr[7] = f16;
        fArr[8] = f20;
        matrix.setValues(fArr);
        fArr[0] = f4;
        fArr[1] = f10;
        fArr[2] = f11;
        fArr[3] = f12;
        fArr[4] = f13;
        fArr[5] = f14;
        fArr[6] = f15;
        fArr[7] = f16;
        fArr[8] = f17;
        this.f18529a.concat(matrix);
    }

    @Override // j0.l
    public final void o() {
        AbstractC1362A.h(this.f18529a, true);
    }

    @Override // j0.l
    public final void p(float f4, float f10, float f11, float f12, E5.o oVar) {
        this.f18529a.drawRect(f4, f10, f11, f12, (Paint) oVar.f3713b);
    }

    public final Canvas q() {
        return this.f18529a;
    }

    public final void r(Canvas canvas) {
        this.f18529a = canvas;
    }
}
