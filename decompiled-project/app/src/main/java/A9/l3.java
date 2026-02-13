package A9;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes2.dex */
public final class l3 extends ReplacementSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f1272a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1273b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m3 f1274c;

    public l3(m3 m3Var, int i7, int i10) {
        this.f1274c = m3Var;
        this.f1272a = i7;
        this.f1273b = i10;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f4, int i11, int i12, int i13, Paint paint) {
        int measureText = (int) paint.measureText(charSequence, i7, i10);
        m3 m3Var = this.f1274c;
        int width = m3Var.f1286b.getWidth();
        int i14 = width * 2;
        int i15 = measureText / i14;
        int i16 = (measureText % i14) / 2;
        boolean z8 = 1 == m3Var.getLayoutDirection();
        m3Var.f1285a.setSeed(this.f1272a);
        int alpha = paint.getAlpha();
        for (int i17 = 0; i17 < i15 && this.f1273b + i17 < m3Var.f1288d; i17++) {
            float f10 = (width / 2) + (i17 * i14) + i16;
            float f11 = z8 ? ((f4 + measureText) - f10) - width : f4 + f10;
            paint.setAlpha((m3Var.f1285a.nextInt(4) + 1) * 63);
            if (m3Var.f1285a.nextBoolean()) {
                canvas.drawBitmap(m3Var.f1287c, f11, i12 - r13.getHeight(), paint);
            } else {
                canvas.drawBitmap(m3Var.f1286b, f11, i12 - r13.getHeight(), paint);
            }
        }
        paint.setAlpha(alpha);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText(charSequence, i7, i10);
    }
}
