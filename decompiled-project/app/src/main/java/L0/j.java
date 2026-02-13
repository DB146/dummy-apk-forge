package L0;

import A8.g0;
import A9.O0;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f6248a;

    /* renamed from: b, reason: collision with root package name */
    public final TextUtils.TruncateAt f6249b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6250c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6251d;

    /* renamed from: e, reason: collision with root package name */
    public final Layout f6252e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6253f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6254h;

    /* renamed from: i, reason: collision with root package name */
    public final float f6255i;
    public final float j;
    public final boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint.FontMetricsInt f6256l;

    /* renamed from: m, reason: collision with root package name */
    public final int f6257m;

    /* renamed from: n, reason: collision with root package name */
    public final M0.h[] f6258n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f6259o = new Rect();

    /* renamed from: p, reason: collision with root package name */
    public O0 f6260p;

    /* JADX WARN: Removed duplicated region for block: B:101:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0245 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j(CharSequence charSequence, float f4, TextPaint textPaint, int i7, TextUtils.TruncateAt truncateAt, int i10, boolean z8, int i11, int i12, int i13, int i14, int i15, int i16, e eVar) {
        int i17;
        Layout a9;
        int i18;
        long j;
        M0.h[] hVarArr;
        int i19;
        Layout layout;
        int i20;
        boolean isFallbackLineSpacingEnabled;
        this.f6248a = textPaint;
        this.f6249b = truncateAt;
        this.f6250c = z8;
        int length = charSequence.length();
        TextDirectionHeuristic a10 = k.a(i10);
        Layout.Alignment alignment = h.f6245a;
        Layout.Alignment alignment2 = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? Layout.Alignment.ALIGN_NORMAL : h.f6246b : h.f6245a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z10 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, M0.a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics a11 = eVar.a();
            double d10 = f4;
            int ceil = (int) Math.ceil(d10);
            if (a11 == null || eVar.c() > f4 || z10) {
                this.k = false;
                i17 = i11;
                a9 = g.a(charSequence, textPaint, ceil, charSequence.length(), a10, alignment2, i11, truncateAt, (int) Math.ceil(d10), i16, z8, i12, i13, i14, i15);
            } else {
                this.k = true;
                if (ceil < 0) {
                    P0.a.a("negative width");
                }
                if (ceil < 0) {
                    P0.a.a("negative ellipsized width");
                }
                a9 = Build.VERSION.SDK_INT >= 33 ? g0.k(charSequence, textPaint, ceil, alignment2, a11, z8, truncateAt, ceil) : new BoringLayout(charSequence, textPaint, ceil, alignment2, 1.0f, 0.0f, a11, z8, truncateAt, ceil);
                i17 = i11;
            }
            this.f6252e = a9;
            Trace.endSection();
            int min = Math.min(a9.getLineCount(), i17);
            this.f6253f = min;
            int i21 = min - 1;
            this.f6251d = min >= i17 && (a9.getEllipsisCount(i21) > 0 || a9.getLineEnd(i21) != charSequence.length());
            long j10 = k.f6262b;
            if (z8) {
                i18 = 33;
            } else {
                if (this.k) {
                    i18 = 33;
                    isFallbackLineSpacingEnabled = Build.VERSION.SDK_INT >= 33 ? ((BoringLayout) a9).isFallbackLineSpacingEnabled() : false;
                } else {
                    i18 = 33;
                    StaticLayout staticLayout = (StaticLayout) a9;
                    int i22 = Build.VERSION.SDK_INT;
                    isFallbackLineSpacingEnabled = i22 >= 33 ? staticLayout.isFallbackLineSpacingEnabled() : i22 >= 28;
                }
                if (!isFallbackLineSpacingEnabled) {
                    TextPaint paint = a9.getPaint();
                    CharSequence text = a9.getText();
                    Rect b2 = g.b(paint, text, a9.getLineStart(0), a9.getLineEnd(0));
                    int lineAscent = a9.getLineAscent(0);
                    int i23 = b2.top;
                    int topPadding = i23 < lineAscent ? lineAscent - i23 : a9.getTopPadding();
                    b2 = min != 1 ? g.b(paint, text, a9.getLineStart(i21), a9.getLineEnd(i21)) : b2;
                    int lineDescent = a9.getLineDescent(i21);
                    int i24 = b2.bottom;
                    int bottomPadding = i24 > lineDescent ? i24 - lineDescent : a9.getBottomPadding();
                    if (topPadding != 0 || bottomPadding != 0) {
                        j = (bottomPadding & 4294967295L) | (topPadding << 32);
                        Paint.FontMetricsInt fontMetricsInt = null;
                        if (a9.getText() instanceof Spanned) {
                            CharSequence text2 = a9.getText();
                            l.c(text2, "null cannot be cast to non-null type android.text.Spanned");
                            if (g.c((Spanned) text2, M0.h.class) || a9.getText().length() <= 0) {
                                CharSequence text3 = a9.getText();
                                l.c(text3, "null cannot be cast to non-null type android.text.Spanned");
                                hVarArr = (M0.h[]) ((Spanned) text3).getSpans(0, a9.getText().length(), M0.h.class);
                                this.f6258n = hVarArr;
                                if (hVarArr != null) {
                                    int i25 = 0;
                                    int i26 = 0;
                                    for (M0.h hVar : hVarArr) {
                                        int i27 = hVar.k;
                                        i25 = i27 < 0 ? Math.max(i25, Math.abs(i27)) : i25;
                                        int i28 = hVar.f6541l;
                                        if (i28 < 0) {
                                            i26 = Math.max(i25, Math.abs(i28));
                                        }
                                    }
                                    j10 = (i25 == 0 && i26 == 0) ? k.f6262b : (i25 << 32) | (i26 & 4294967295L);
                                }
                                this.g = Math.max((int) (j >> 32), (int) (j10 >> 32));
                                this.f6254h = Math.max((int) (j & 4294967295L), (int) (j10 & 4294967295L));
                                TextPaint textPaint2 = this.f6248a;
                                M0.h[] hVarArr2 = this.f6258n;
                                i19 = this.f6253f - 1;
                                layout = this.f6252e;
                                if (layout.getLineStart(i19) == layout.getLineEnd(i19) || hVarArr2 == null || hVarArr2.length == 0) {
                                    i20 = 0;
                                } else {
                                    SpannableString spannableString = new SpannableString("\u200b");
                                    if (hVarArr2.length == 0) {
                                        throw new NoSuchElementException("Array is empty.");
                                    }
                                    M0.h hVar2 = hVarArr2[0];
                                    spannableString.setSpan(new M0.h(hVar2.f6533a, spannableString.length(), (i19 == 0 || !hVar2.f6536d) ? hVar2.f6536d : false, hVar2.f6536d, hVar2.f6537e, hVar2.f6538f), 0, spannableString.length(), i18);
                                    StaticLayout a12 = g.a(spannableString, textPaint2, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, spannableString.length(), a10, c.f6234a, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, null, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 0, this.f6250c, 0, 0, 0, 0);
                                    fontMetricsInt = new Paint.FontMetricsInt();
                                    i20 = 0;
                                    fontMetricsInt.ascent = a12.getLineAscent(0);
                                    fontMetricsInt.descent = a12.getLineDescent(0);
                                    fontMetricsInt.top = a12.getLineTop(0);
                                    fontMetricsInt.bottom = a12.getLineBottom(0);
                                }
                                this.f6257m = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (d(i21) - f(i21))) : i20;
                                this.f6256l = fontMetricsInt;
                                Layout layout2 = this.f6252e;
                                this.f6255i = tc.b.u(layout2, i21, layout2.getPaint());
                                Layout layout3 = this.f6252e;
                                this.j = tc.b.v(layout3, i21, layout3.getPaint());
                            }
                        }
                        hVarArr = null;
                        this.f6258n = hVarArr;
                        if (hVarArr != null) {
                        }
                        this.g = Math.max((int) (j >> 32), (int) (j10 >> 32));
                        this.f6254h = Math.max((int) (j & 4294967295L), (int) (j10 & 4294967295L));
                        TextPaint textPaint22 = this.f6248a;
                        M0.h[] hVarArr22 = this.f6258n;
                        i19 = this.f6253f - 1;
                        layout = this.f6252e;
                        if (layout.getLineStart(i19) == layout.getLineEnd(i19)) {
                        }
                        i20 = 0;
                        this.f6257m = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (d(i21) - f(i21))) : i20;
                        this.f6256l = fontMetricsInt;
                        Layout layout22 = this.f6252e;
                        this.f6255i = tc.b.u(layout22, i21, layout22.getPaint());
                        Layout layout32 = this.f6252e;
                        this.j = tc.b.v(layout32, i21, layout32.getPaint());
                    }
                }
            }
            j = j10;
            Paint.FontMetricsInt fontMetricsInt2 = null;
            if (a9.getText() instanceof Spanned) {
            }
            hVarArr = null;
            this.f6258n = hVarArr;
            if (hVarArr != null) {
            }
            this.g = Math.max((int) (j >> 32), (int) (j10 >> 32));
            this.f6254h = Math.max((int) (j & 4294967295L), (int) (j10 & 4294967295L));
            TextPaint textPaint222 = this.f6248a;
            M0.h[] hVarArr222 = this.f6258n;
            i19 = this.f6253f - 1;
            layout = this.f6252e;
            if (layout.getLineStart(i19) == layout.getLineEnd(i19)) {
            }
            i20 = 0;
            this.f6257m = fontMetricsInt2 != null ? fontMetricsInt2.bottom - ((int) (d(i21) - f(i21))) : i20;
            this.f6256l = fontMetricsInt2;
            Layout layout222 = this.f6252e;
            this.f6255i = tc.b.u(layout222, i21, layout222.getPaint());
            Layout layout322 = this.f6252e;
            this.j = tc.b.v(layout322, i21, layout322.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int a() {
        boolean z8 = this.f6251d;
        Layout layout = this.f6252e;
        return (z8 ? layout.getLineBottom(this.f6253f - 1) : layout.getHeight()) + this.g + this.f6254h + this.f6257m;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [A9.O0, java.lang.Object] */
    public final O0 b() {
        O0 o02 = this.f6260p;
        if (o02 != null) {
            return o02;
        }
        Layout layout = this.f6252e;
        ?? obj = new Object();
        obj.f922a = layout;
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        do {
            int e02 = ac.g.e0(((Layout) obj.f922a).getText(), '\n', i7, 4);
            i7 = e02 < 0 ? ((Layout) obj.f922a).getText().length() : e02 + 1;
            arrayList.add(Integer.valueOf(i7));
        } while (i7 < ((Layout) obj.f922a).getText().length());
        obj.f923b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(null);
        }
        obj.f924c = arrayList2;
        obj.f925d = new boolean[((ArrayList) obj.f923b).size()];
        ((ArrayList) obj.f923b).size();
        this.f6260p = obj;
        return obj;
    }

    public final float c(int i7) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.g + ((i7 != this.f6253f + (-1) || (fontMetricsInt = this.f6256l) == null) ? this.f6252e.getLineBaseline(i7) : f(i7) - fontMetricsInt.ascent);
    }

    public final float d(int i7) {
        Paint.FontMetricsInt fontMetricsInt;
        int i10 = this.f6253f;
        int i11 = i10 - 1;
        Layout layout = this.f6252e;
        if (i7 != i11 || (fontMetricsInt = this.f6256l) == null) {
            return this.g + layout.getLineBottom(i7) + (i7 == i10 + (-1) ? this.f6254h : 0);
        }
        return layout.getLineBottom(i7 - 1) + fontMetricsInt.bottom;
    }

    public final int e(int i7) {
        i iVar = k.f6261a;
        Layout layout = this.f6252e;
        return (layout.getEllipsisCount(i7) <= 0 || this.f6249b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i7) : layout.getText().length();
    }

    public final float f(int i7) {
        return this.f6252e.getLineTop(i7) + (i7 == 0 ? 0 : this.g);
    }

    public final float g(int i7, boolean z8) {
        return (this.f6252e.getLineForOffset(i7) == this.f6253f - 1 ? this.f6255i + this.j : 0.0f) + b().u(i7, true, z8);
    }

    public final float h(int i7, boolean z8) {
        return (this.f6252e.getLineForOffset(i7) == this.f6253f + (-1) ? this.f6255i + this.j : 0.0f) + b().u(i7, false, z8);
    }
}
