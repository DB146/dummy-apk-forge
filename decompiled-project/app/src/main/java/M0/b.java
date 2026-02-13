package M0;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6527a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6528b;

    public /* synthetic */ b(Object obj, int i7) {
        this.f6527a = i7;
        this.f6528b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f6527a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f6528b);
                return;
            default:
                textPaint.setTypeface((Typeface) this.f6528b);
                return;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f6527a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f6528b);
                return;
            default:
                textPaint.setTypeface((Typeface) this.f6528b);
                return;
        }
    }
}
