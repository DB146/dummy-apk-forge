package M0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* renamed from: a, reason: collision with root package name */
    public final float f6533a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6534b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6535c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6536d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6537e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6538f;
    public int g = Integer.MIN_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public int f6539h = Integer.MIN_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public int f6540i = Integer.MIN_VALUE;
    public int j = Integer.MIN_VALUE;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f6541l;

    public h(float f4, int i7, boolean z8, boolean z10, float f10, boolean z11) {
        this.f6533a = f4;
        this.f6534b = i7;
        this.f6535c = z8;
        this.f6536d = z10;
        this.f6537e = f10;
        this.f6538f = z11;
        if ((0.0f > f10 || f10 > 1.0f) && f10 != -1.0f) {
            P0.a.b("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i7, int i10, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        int i13 = fontMetricsInt.descent;
        int i14 = fontMetricsInt.ascent;
        if (i13 - i14 <= 0) {
            return;
        }
        boolean z8 = i7 == 0;
        boolean z10 = i10 == this.f6534b;
        boolean z11 = this.f6536d;
        boolean z12 = this.f6535c;
        if (z8 && z10 && z12 && z11) {
            return;
        }
        if (this.g == Integer.MIN_VALUE) {
            int i15 = i13 - i14;
            int ceil = (int) Math.ceil(this.f6533a);
            int i16 = ceil - i15;
            if (!this.f6538f || i16 > 0) {
                float f4 = this.f6537e;
                if (f4 == -1.0f) {
                    f4 = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int ceil2 = (int) (i16 <= 0 ? Math.ceil(i16 * f4) : Math.ceil((1.0f - f4) * i16));
                int i17 = fontMetricsInt.descent;
                int i18 = ceil2 + i17;
                this.f6540i = i18;
                int i19 = i18 - ceil;
                this.f6539h = i19;
                if (z12) {
                    i19 = fontMetricsInt.ascent;
                }
                this.g = i19;
                if (z11) {
                    i18 = i17;
                }
                this.j = i18;
                this.k = fontMetricsInt.ascent - i19;
                this.f6541l = i18 - i17;
            } else {
                int i20 = fontMetricsInt.ascent;
                this.f6539h = i20;
                int i21 = fontMetricsInt.descent;
                this.f6540i = i21;
                this.g = i20;
                this.j = i21;
                this.k = 0;
                this.f6541l = 0;
            }
        }
        fontMetricsInt.ascent = z8 ? this.g : this.f6539h;
        fontMetricsInt.descent = z10 ? this.j : this.f6540i;
    }
}
