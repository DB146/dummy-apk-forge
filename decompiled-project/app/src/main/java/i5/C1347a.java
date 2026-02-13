package i5;

import A3.c;
import M6.e;
import a5.C0776b;
import a5.f;
import a5.g;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import h3.o;
import java.nio.charset.Charset;
import java.util.List;
import n5.AbstractC1705a;
import n5.D;
import n5.v;

/* renamed from: i5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1347a extends f {

    /* renamed from: A, reason: collision with root package name */
    public final v f18423A = new v();

    /* renamed from: B, reason: collision with root package name */
    public final boolean f18424B;

    /* renamed from: C, reason: collision with root package name */
    public final int f18425C;

    /* renamed from: D, reason: collision with root package name */
    public final int f18426D;

    /* renamed from: E, reason: collision with root package name */
    public final String f18427E;

    /* renamed from: F, reason: collision with root package name */
    public final float f18428F;

    /* renamed from: G, reason: collision with root package name */
    public final int f18429G;

    public C1347a(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f18425C = 0;
            this.f18426D = -1;
            this.f18427E = "sans-serif";
            this.f18424B = false;
            this.f18428F = 0.85f;
            this.f18429G = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f18425C = bArr[24];
        this.f18426D = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f18427E = "Serif".equals(new String(bArr, 43, bArr.length - 43, e.f6799c)) ? "serif" : "sans-serif";
        int i7 = bArr[25] * 20;
        this.f18429G = i7;
        boolean z8 = (bArr[0] & 32) != 0;
        this.f18424B = z8;
        if (z8) {
            this.f18428F = D.h(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i7, 0.0f, 0.95f);
        } else {
            this.f18428F = 0.85f;
        }
    }

    public static void g(SpannableStringBuilder spannableStringBuilder, int i7, int i10, int i11, int i12, int i13) {
        if (i7 != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i7 >>> 8) | ((i7 & 255) << 24)), i11, i12, i13 | 33);
        }
    }

    public static void i(SpannableStringBuilder spannableStringBuilder, int i7, int i10, int i11, int i12, int i13) {
        if (i7 != i10) {
            int i14 = i13 | 33;
            boolean z8 = (i7 & 1) != 0;
            boolean z10 = (i7 & 2) != 0;
            if (z8) {
                if (z10) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i11, i12, i14);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i11, i12, i14);
                }
            } else if (z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i11, i12, i14);
            }
            boolean z11 = (i7 & 4) != 0;
            if (z11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i12, i14);
            }
            if (z11 || z8 || z10) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i11, i12, i14);
        }
    }

    @Override // a5.f
    public final g b(int i7, boolean z8, byte[] bArr) {
        String t5;
        v vVar = this.f18423A;
        vVar.E(i7, bArr);
        if (vVar.a() < 2) {
            throw new Exception("Unexpected subtitle format.");
        }
        int A10 = vVar.A();
        if (A10 == 0) {
            t5 = "";
        } else {
            int i10 = vVar.f21230b;
            Charset C2 = vVar.C();
            int i11 = A10 - (vVar.f21230b - i10);
            if (C2 == null) {
                C2 = e.f6799c;
            }
            t5 = vVar.t(i11, C2);
        }
        if (t5.isEmpty()) {
            return b.f18430b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(t5);
        i(spannableStringBuilder, this.f18425C, 0, 0, spannableStringBuilder.length(), 16711680);
        g(spannableStringBuilder, this.f18426D, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        int i12 = 0;
        String str = this.f18427E;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f4 = this.f18428F;
        while (vVar.a() >= 8) {
            int i13 = vVar.f21230b;
            int h10 = vVar.h();
            int h11 = vVar.h();
            if (h11 == 1937013100) {
                if (vVar.a() < 2) {
                    throw new Exception("Unexpected subtitle format.");
                }
                int A11 = vVar.A();
                for (int i14 = i12; i14 < A11; i14++) {
                    if (vVar.a() < 12) {
                        throw new Exception("Unexpected subtitle format.");
                    }
                    int A12 = vVar.A();
                    int A13 = vVar.A();
                    vVar.H(2);
                    int v10 = vVar.v();
                    vVar.H(1);
                    int h12 = vVar.h();
                    if (A13 > spannableStringBuilder.length()) {
                        StringBuilder r10 = o.r(A13, "Truncating styl end (", ") to cueText.length() (");
                        r10.append(spannableStringBuilder.length());
                        r10.append(").");
                        AbstractC1705a.S("Tx3gDecoder", r10.toString());
                        A13 = spannableStringBuilder.length();
                    }
                    int i15 = A13;
                    if (A12 >= i15) {
                        AbstractC1705a.S("Tx3gDecoder", c.e(A12, i15, "Ignoring styl with start (", ") >= end (", ")."));
                    } else {
                        i(spannableStringBuilder, v10, this.f18425C, A12, i15, 0);
                        g(spannableStringBuilder, h12, this.f18426D, A12, i15, 0);
                    }
                }
            } else if (h11 == 1952608120 && this.f18424B) {
                if (vVar.a() < 2) {
                    throw new Exception("Unexpected subtitle format.");
                }
                f4 = D.h(vVar.A() / this.f18429G, 0.0f, 0.95f);
            }
            vVar.G(i13 + h10);
            i12 = 0;
        }
        return new b(new C0776b(spannableStringBuilder, null, null, null, f4, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f));
    }
}
