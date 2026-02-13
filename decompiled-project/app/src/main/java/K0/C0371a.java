package K0;

import Eb.C0252c;
import android.graphics.Canvas;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import j0.AbstractC1365c;
import java.util.ArrayList;

/* renamed from: K0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0371a {

    /* renamed from: a, reason: collision with root package name */
    public final R0.c f5860a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5861b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5862c;

    /* renamed from: d, reason: collision with root package name */
    public final L0.j f5863d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f5864e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f5865f;

    /* JADX WARN: Removed duplicated region for block: B:142:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0312  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0371a(R0.c cVar, int i7, int i10, long j) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        TextUtils.TruncateAt truncateAt;
        L0.j a9;
        int i19;
        int i20;
        C0371a c0371a;
        L0.j jVar;
        T0.b[] bVarArr;
        CharSequence charSequence;
        Object obj;
        i0.c cVar2;
        float g;
        Layout layout;
        this.f5860a = cVar;
        this.f5861b = i7;
        this.f5862c = j;
        if (V0.a.i(j) != 0 || V0.a.j(j) != 0) {
            P0.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i7 < 1) {
            P0.a.a("maxLines should be greater than 0");
        }
        boolean t5 = tc.b.t(i10, 2);
        F f4 = cVar.f8784b;
        CharSequence charSequence2 = cVar.f8790v;
        CharSequence charSequence3 = charSequence2;
        if (t5) {
            charSequence3 = charSequence2;
            if (!V0.n.a(f4.f5855a.f5992h, android.support.v4.media.session.b.v(0))) {
                charSequence3 = charSequence2;
                if (!V0.n.a(f4.f5855a.f5992h, V0.n.f9987c)) {
                    p pVar = f4.f5856b;
                    charSequence3 = charSequence2;
                    if (!U0.k.a(pVar.f5925a, Integer.MIN_VALUE)) {
                        int i21 = pVar.f5925a;
                        charSequence3 = charSequence2;
                        if (!U0.k.a(i21, 5)) {
                            charSequence3 = charSequence2;
                            if (!U0.k.a(i21, 4)) {
                                int length = charSequence2.length();
                                charSequence3 = charSequence2;
                                if (length != 0) {
                                    Spannable spannable = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : null;
                                    Spannable spannableString = spannable == null ? new SpannableString(charSequence2) : spannable;
                                    boolean c10 = L0.g.c(spannableString, M0.c.class);
                                    charSequence3 = spannableString;
                                    if (!c10) {
                                        spannableString.setSpan(new Object(), spannableString.length() - 1, spannableString.length() - 1, 33);
                                        charSequence3 = spannableString;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        CharSequence charSequence4 = charSequence3;
        this.f5864e = charSequence4;
        int i22 = f4.f5856b.f5925a;
        int i23 = U0.k.a(i22, 1) ? 3 : U0.k.a(i22, 2) ? 4 : U0.k.a(i22, 3) ? 2 : (!U0.k.a(i22, 5) && U0.k.a(i22, 6)) ? 1 : 0;
        p pVar2 = f4.f5856b;
        boolean a10 = U0.k.a(pVar2.f5925a, 4);
        int i24 = U0.d.a(pVar2.f5931h, 2) ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : 0;
        int i25 = pVar2.g;
        int i26 = i25 & 255;
        if (!c2.q.i(i26, 1)) {
            if (c2.q.i(i26, 2)) {
                i11 = 1;
            } else if (c2.q.i(i26, 3)) {
                i11 = 2;
            }
            i12 = (i25 >> 8) & 255;
            if (!c2.i.m(i12, 1)) {
                if (c2.i.m(i12, 2)) {
                    i13 = 1;
                } else if (c2.i.m(i12, 3)) {
                    i13 = 2;
                } else if (c2.i.m(i12, 4)) {
                    i13 = 3;
                }
                i14 = (i25 >> 16) & 255;
                if (i14 == 1) {
                    i16 = 0;
                    i15 = 2;
                } else {
                    i15 = 2;
                    i16 = i14 == 2 ? 1 : 0;
                }
                if (tc.b.t(i10, i15)) {
                    truncateAt = TextUtils.TruncateAt.END;
                    i18 = 4;
                    i17 = 5;
                } else {
                    i17 = 5;
                    if (tc.b.t(i10, 5)) {
                        truncateAt = TextUtils.TruncateAt.MIDDLE;
                        i18 = 4;
                    } else {
                        i18 = 4;
                        truncateAt = tc.b.t(i10, 4) ? TextUtils.TruncateAt.START : null;
                    }
                }
                int i27 = i18;
                int i28 = i17;
                a9 = a(i23, a10 ? 1 : 0, truncateAt, i7, i24, i11, i13, i16, charSequence4);
                if (Build.VERSION.SDK_INT < 35 && cVar.f8789u.getLetterSpacing() != 0.0f && (tc.b.t(i10, i27) || tc.b.t(i10, i28))) {
                    layout = a9.f6252e;
                    if (layout.getEllipsisCount(0) > 0) {
                        int ellipsisStart = layout.getEllipsisStart(0);
                        int ellipsisCount = layout.getEllipsisCount(0) + ellipsisStart;
                        CharSequence subSequence = charSequence4.subSequence(0, ellipsisStart);
                        CharSequence subSequence2 = charSequence4.subSequence(ellipsisCount, charSequence4.length());
                        i19 = 1;
                        i20 = 2;
                        a9 = a(i23, a10 ? 1 : 0, truncateAt, i7, i24, i11, i13, i16, TextUtils.concat(subSequence, "…", subSequence2));
                        if (tc.b.t(i10, i20) || a9.a() <= V0.a.g(j) || i7 <= i19) {
                            c0371a = this;
                            c0371a.f5863d = a9;
                        } else {
                            int g2 = V0.a.g(j);
                            int i29 = 0;
                            while (true) {
                                int i30 = a9.f6253f;
                                if (i29 >= i30) {
                                    i29 = i30;
                                    break;
                                } else if (a9.d(i29) > g2) {
                                    break;
                                } else {
                                    i29 += i19;
                                }
                            }
                            c0371a = this;
                            if (i29 >= 0 && i29 != c0371a.f5861b) {
                                a9 = a(i23, a10 ? 1 : 0, truncateAt, i29 < i19 ? i19 : i29, i24, i11, i13, i16, c0371a.f5864e);
                            }
                            c0371a.f5863d = a9;
                        }
                        R0.c cVar3 = c0371a.f5860a;
                        x xVar = f4.f5855a;
                        cVar3.f8789u.c(xVar.f5986a.c(), (Float.floatToRawIntBits(b()) & 4294967295L) | (Float.floatToRawIntBits(c()) << 32), xVar.f5986a.a());
                        jVar = c0371a.f5863d;
                        if (jVar.f6252e.getText() instanceof Spanned) {
                            Layout layout2 = jVar.f6252e;
                            CharSequence text = layout2.getText();
                            kotlin.jvm.internal.l.c(text, "null cannot be cast to non-null type android.text.Spanned");
                            Spanned spanned = (Spanned) text;
                            if (spanned.nextSpanTransition(-1, spanned.length(), T0.b.class) != spanned.length()) {
                                CharSequence text2 = layout2.getText();
                                kotlin.jvm.internal.l.c(text2, "null cannot be cast to non-null type android.text.Spanned");
                                bVarArr = (T0.b[]) ((Spanned) text2).getSpans(0, layout2.getText().length(), T0.b.class);
                                if (bVarArr != null) {
                                    C0252c h10 = kotlin.jvm.internal.l.h(bVarArr);
                                    while (h10.hasNext()) {
                                        ((T0.b) h10.next()).f9198b.setValue(new i0.e((Float.floatToRawIntBits(b()) & 4294967295L) | (Float.floatToRawIntBits(c()) << 32)));
                                    }
                                }
                                charSequence = c0371a.f5864e;
                                if (charSequence instanceof Spanned) {
                                    Spanned spanned2 = (Spanned) charSequence;
                                    Object[] spans = spanned2.getSpans(0, charSequence.length(), M0.i.class);
                                    ArrayList arrayList = new ArrayList(spans.length);
                                    int length2 = spans.length;
                                    for (int i31 = 0; i31 < length2; i31 += i19) {
                                        M0.i iVar = (M0.i) spans[i31];
                                        int spanStart = spanned2.getSpanStart(iVar);
                                        int spanEnd = spanned2.getSpanEnd(iVar);
                                        int lineForOffset = c0371a.f5863d.f6252e.getLineForOffset(spanStart);
                                        int i32 = lineForOffset >= c0371a.f5861b ? i19 : 0;
                                        int i33 = (c0371a.f5863d.f6252e.getEllipsisCount(lineForOffset) <= 0 || spanEnd <= c0371a.f5863d.f6252e.getEllipsisStart(lineForOffset)) ? 0 : i19;
                                        int i34 = spanEnd > c0371a.f5863d.e(lineForOffset) ? i19 : 0;
                                        if (i33 == 0 && i34 == 0 && i32 == 0) {
                                            int ordinal = (c0371a.f5863d.f6252e.isRtlCharAt(spanStart) ? U0.j.f9429b : U0.j.f9428a).ordinal();
                                            if (ordinal == 0) {
                                                g = c0371a.f5863d.g(spanStart, false);
                                            } else {
                                                if (ordinal != i19) {
                                                    throw new Db.d(i19);
                                                }
                                                float g10 = c0371a.f5863d.g(spanStart, false);
                                                if (!iVar.f6545d) {
                                                    P0.a.b("PlaceholderSpan is not laid out yet.");
                                                }
                                                g = g10 - iVar.f6543b;
                                            }
                                            if (!iVar.f6545d) {
                                                P0.a.b("PlaceholderSpan is not laid out yet.");
                                            }
                                            float c11 = c0371a.f5863d.c(lineForOffset) - iVar.b();
                                            cVar2 = new i0.c(g, c11, iVar.f6543b + g, iVar.b() + c11);
                                        } else {
                                            cVar2 = null;
                                        }
                                        arrayList.add(cVar2);
                                    }
                                    obj = arrayList;
                                } else {
                                    obj = Eb.v.f3891a;
                                }
                                c0371a.f5865f = obj;
                            }
                        }
                        bVarArr = null;
                        if (bVarArr != null) {
                        }
                        charSequence = c0371a.f5864e;
                        if (charSequence instanceof Spanned) {
                        }
                        c0371a.f5865f = obj;
                    }
                }
                i19 = 1;
                i20 = 2;
                if (tc.b.t(i10, i20)) {
                }
                c0371a = this;
                c0371a.f5863d = a9;
                R0.c cVar32 = c0371a.f5860a;
                x xVar2 = f4.f5855a;
                cVar32.f8789u.c(xVar2.f5986a.c(), (Float.floatToRawIntBits(b()) & 4294967295L) | (Float.floatToRawIntBits(c()) << 32), xVar2.f5986a.a());
                jVar = c0371a.f5863d;
                if (jVar.f6252e.getText() instanceof Spanned) {
                }
                bVarArr = null;
                if (bVarArr != null) {
                }
                charSequence = c0371a.f5864e;
                if (charSequence instanceof Spanned) {
                }
                c0371a.f5865f = obj;
            }
            i13 = 0;
            i14 = (i25 >> 16) & 255;
            if (i14 == 1) {
            }
            if (tc.b.t(i10, i15)) {
            }
            int i272 = i18;
            int i282 = i17;
            a9 = a(i23, a10 ? 1 : 0, truncateAt, i7, i24, i11, i13, i16, charSequence4);
            if (Build.VERSION.SDK_INT < 35) {
                layout = a9.f6252e;
                if (layout.getEllipsisCount(0) > 0) {
                }
            }
            i19 = 1;
            i20 = 2;
            if (tc.b.t(i10, i20)) {
            }
            c0371a = this;
            c0371a.f5863d = a9;
            R0.c cVar322 = c0371a.f5860a;
            x xVar22 = f4.f5855a;
            cVar322.f8789u.c(xVar22.f5986a.c(), (Float.floatToRawIntBits(b()) & 4294967295L) | (Float.floatToRawIntBits(c()) << 32), xVar22.f5986a.a());
            jVar = c0371a.f5863d;
            if (jVar.f6252e.getText() instanceof Spanned) {
            }
            bVarArr = null;
            if (bVarArr != null) {
            }
            charSequence = c0371a.f5864e;
            if (charSequence instanceof Spanned) {
            }
            c0371a.f5865f = obj;
        }
        i11 = 0;
        i12 = (i25 >> 8) & 255;
        if (!c2.i.m(i12, 1)) {
        }
        i13 = 0;
        i14 = (i25 >> 16) & 255;
        if (i14 == 1) {
        }
        if (tc.b.t(i10, i15)) {
        }
        int i2722 = i18;
        int i2822 = i17;
        a9 = a(i23, a10 ? 1 : 0, truncateAt, i7, i24, i11, i13, i16, charSequence4);
        if (Build.VERSION.SDK_INT < 35) {
        }
        i19 = 1;
        i20 = 2;
        if (tc.b.t(i10, i20)) {
        }
        c0371a = this;
        c0371a.f5863d = a9;
        R0.c cVar3222 = c0371a.f5860a;
        x xVar222 = f4.f5855a;
        cVar3222.f8789u.c(xVar222.f5986a.c(), (Float.floatToRawIntBits(b()) & 4294967295L) | (Float.floatToRawIntBits(c()) << 32), xVar222.f5986a.a());
        jVar = c0371a.f5863d;
        if (jVar.f6252e.getText() instanceof Spanned) {
        }
        bVarArr = null;
        if (bVarArr != null) {
        }
        charSequence = c0371a.f5864e;
        if (charSequence instanceof Spanned) {
        }
        c0371a.f5865f = obj;
    }

    public final L0.j a(int i7, int i10, TextUtils.TruncateAt truncateAt, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence) {
        r rVar;
        float c10 = c();
        R0.c cVar = this.f5860a;
        R0.a aVar = R0.b.f8782a;
        s sVar = cVar.f8784b.f5857c;
        return new L0.j(charSequence, c10, cVar.f8789u, i7, truncateAt, cVar.f8793y, (sVar == null || (rVar = sVar.f5936a) == null) ? false : rVar.f5935a, i11, i13, i14, i15, i12, i10, cVar.f8791w);
    }

    public final float b() {
        return this.f5863d.a();
    }

    public final float c() {
        return V0.a.h(this.f5862c);
    }

    public final void d(j0.l lVar) {
        Canvas a9 = AbstractC1365c.a(lVar);
        L0.j jVar = this.f5863d;
        if (jVar.f6251d) {
            a9.save();
            a9.clipRect(0.0f, 0.0f, c(), b());
        }
        if (a9.getClipBounds(jVar.f6259o)) {
            int i7 = jVar.g;
            if (i7 != 0) {
                a9.translate(0.0f, i7);
            }
            L0.i iVar = L0.k.f6261a;
            iVar.f6247a = a9;
            jVar.f6252e.draw(iVar);
            if (i7 != 0) {
                a9.translate(0.0f, (-1) * i7);
            }
        }
        if (jVar.f6251d) {
            a9.restore();
        }
    }
}
