package M0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class a extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6525a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6526b;

    public /* synthetic */ a(int i7, float f4) {
        this.f6525a = i7;
        this.f6526b = f4;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f6525a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f6526b);
                return;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f6526b);
                return;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f6525a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f6526b);
                return;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f6526b);
                return;
        }
    }
}
