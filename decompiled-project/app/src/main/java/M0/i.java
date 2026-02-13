package M0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class i extends ReplacementSpan {

    /* renamed from: a, reason: collision with root package name */
    public Paint.FontMetricsInt f6542a;

    /* renamed from: b, reason: collision with root package name */
    public int f6543b;

    /* renamed from: c, reason: collision with root package name */
    public int f6544c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6545d;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f6542a;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        l.j("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.f6545d) {
            P0.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f6544c;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f4, int i11, int i12, int i13, Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        this.f6545d = true;
        paint.getTextSize();
        this.f6542a = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            P0.a.a("Invalid fontMetrics: line height can not be negative.");
        }
        this.f6543b = (int) Math.ceil(0.0f);
        this.f6544c = (int) Math.ceil(0.0f);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            if (fontMetricsInt.ascent > (-b())) {
                fontMetricsInt.ascent = -b();
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        if (!this.f6545d) {
            P0.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f6543b;
    }
}
