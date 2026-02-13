package w1;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import com.kt.apps.core.utils.h;
import java.util.Objects;

/* renamed from: w1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2199c {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f25649a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f25650b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25651c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25652d;

    public C2199c(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.f25649a = textPaint;
        textDirection = params.getTextDirection();
        this.f25650b = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.f25651c = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.f25652d = hyphenationFrequency;
    }

    public C2199c(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i7, int i10) {
        PrecomputedText.Params.Builder breakStrategy;
        PrecomputedText.Params.Builder hyphenationFrequency;
        PrecomputedText.Params.Builder textDirection;
        if (Build.VERSION.SDK_INT >= 29) {
            breakStrategy = h.h(textPaint).setBreakStrategy(i7);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i10);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.f25649a = textPaint;
        this.f25650b = textDirectionHeuristic;
        this.f25651c = i7;
        this.f25652d = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2199c)) {
            return false;
        }
        C2199c c2199c = (C2199c) obj;
        if (this.f25651c == c2199c.f25651c && this.f25652d == c2199c.f25652d) {
            TextPaint textPaint = this.f25649a;
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = c2199c.f25649a;
            return textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales()) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null) && this.f25650b == c2199c.f25650b;
        }
        return false;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f25649a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f25650b, Integer.valueOf(this.f25651c), Integer.valueOf(this.f25652d));
    }

    public final String toString() {
        String fontVariationSettings;
        StringBuilder sb2 = new StringBuilder("{");
        StringBuilder sb3 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f25649a;
        sb3.append(textPaint.getTextSize());
        sb2.append(sb3.toString());
        sb2.append(", textScaleX=" + textPaint.getTextScaleX());
        sb2.append(", textSkewX=" + textPaint.getTextSkewX());
        int i7 = Build.VERSION.SDK_INT;
        sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb2.append(", textLocale=" + textPaint.getTextLocales());
        sb2.append(", typeface=" + textPaint.getTypeface());
        if (i7 >= 26) {
            StringBuilder sb4 = new StringBuilder(", variationSettings=");
            fontVariationSettings = textPaint.getFontVariationSettings();
            sb4.append(fontVariationSettings);
            sb2.append(sb4.toString());
        }
        sb2.append(", textDir=" + this.f25650b);
        sb2.append(", breakStrategy=" + this.f25651c);
        sb2.append(", hyphenationFrequency=" + this.f25652d);
        sb2.append("}");
        return sb2.toString();
    }
}
