package s6;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f24166a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f24167b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24168c;

    /* renamed from: d, reason: collision with root package name */
    public int f24169d;
    public boolean j;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f24170e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f24171f = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    public float g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public int f24172h = 1;

    /* renamed from: i, reason: collision with root package name */
    public boolean f24173i = true;
    public TextUtils.TruncateAt k = null;

    public k(CharSequence charSequence, TextPaint textPaint, int i7) {
        this.f24166a = charSequence;
        this.f24167b = textPaint;
        this.f24168c = i7;
        this.f24169d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f24166a == null) {
            this.f24166a = "";
        }
        int max = Math.max(0, this.f24168c);
        CharSequence charSequence = this.f24166a;
        int i7 = this.f24171f;
        TextPaint textPaint = this.f24167b;
        if (i7 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.k);
        }
        int min = Math.min(charSequence.length(), this.f24169d);
        this.f24169d = min;
        if (this.j && this.f24171f == 1) {
            this.f24170e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f24170e);
        obtain.setIncludePad(this.f24173i);
        obtain.setTextDirection(this.j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.k;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f24171f);
        float f4 = this.g;
        if (f4 != 1.0f) {
            obtain.setLineSpacing(0.0f, f4);
        }
        if (this.f24171f > 1) {
            obtain.setHyphenationFrequency(this.f24172h);
        }
        return obtain.build();
    }
}
