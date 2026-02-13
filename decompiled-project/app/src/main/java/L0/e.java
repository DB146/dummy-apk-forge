package L0;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f6238a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f6239b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6240c;

    /* renamed from: d, reason: collision with root package name */
    public float f6241d = Float.NaN;

    /* renamed from: e, reason: collision with root package name */
    public float f6242e = Float.NaN;

    /* renamed from: f, reason: collision with root package name */
    public BoringLayout.Metrics f6243f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f6244h;

    public e(CharSequence charSequence, TextPaint textPaint, int i7) {
        this.f6238a = charSequence;
        this.f6239b = textPaint;
        this.f6240c = i7;
    }

    public final BoringLayout.Metrics a() {
        if (!this.g) {
            TextDirectionHeuristic a9 = k.a(this.f6240c);
            int i7 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f6238a;
            TextPaint textPaint = this.f6239b;
            this.f6243f = i7 >= 33 ? BoringLayout.isBoring(charSequence, textPaint, a9, true, null) : !a9.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            this.g = true;
        }
        return this.f6243f;
    }

    public final CharSequence b() {
        CharSequence charSequence = this.f6244h;
        if (charSequence == null) {
            charSequence = this.f6238a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (g.c(spanned, CharacterStyle.class)) {
                    CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence.length(), CharacterStyle.class);
                    if (characterStyleArr != null && characterStyleArr.length != 0) {
                        SpannableString spannableString = null;
                        for (CharacterStyle characterStyle : characterStyleArr) {
                            if (!(characterStyle instanceof MetricAffectingSpan)) {
                                if (spannableString == null) {
                                    spannableString = new SpannableString(charSequence);
                                }
                                spannableString.removeSpan(characterStyle);
                            }
                        }
                        if (spannableString != null) {
                            charSequence = spannableString;
                        }
                    }
                }
            }
            this.f6244h = charSequence;
        } else {
            l.b(charSequence);
        }
        return charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (L0.g.c(r2, M0.e.class) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r3.getLetterSpacing() == 0.0f) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float c() {
        if (!Float.isNaN(this.f6241d)) {
            return this.f6241d;
        }
        BoringLayout.Metrics a9 = a();
        float f4 = a9 != null ? a9.width : -1;
        TextPaint textPaint = this.f6239b;
        if (f4 < 0.0f) {
            f4 = (float) Math.ceil(Layout.getDesiredWidth(b(), 0, b().length(), textPaint));
        }
        if (f4 != 0.0f) {
            CharSequence charSequence = this.f6238a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (!g.c(spanned, M0.f.class)) {
                }
                f4 += 0.5f;
            }
        }
        this.f6241d = f4;
        return f4;
    }
}
