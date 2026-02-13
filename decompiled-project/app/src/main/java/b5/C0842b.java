package b5;

import a5.C0776b;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* renamed from: b5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0842b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13888a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f13889b;

    /* renamed from: c, reason: collision with root package name */
    public final StringBuilder f13890c;

    /* renamed from: d, reason: collision with root package name */
    public int f13891d;

    /* renamed from: e, reason: collision with root package name */
    public int f13892e;

    /* renamed from: f, reason: collision with root package name */
    public int f13893f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f13894h;

    public C0842b(int i7, int i10) {
        ArrayList arrayList = new ArrayList();
        this.f13888a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f13889b = arrayList2;
        StringBuilder sb2 = new StringBuilder();
        this.f13890c = sb2;
        this.g = i7;
        arrayList.clear();
        arrayList2.clear();
        sb2.setLength(0);
        this.f13891d = 15;
        this.f13892e = 0;
        this.f13893f = 0;
        this.f13894h = i10;
    }

    public final void a(char c10) {
        StringBuilder sb2 = this.f13890c;
        if (sb2.length() < 32) {
            sb2.append(c10);
        }
    }

    public final void b() {
        StringBuilder sb2 = this.f13890c;
        int length = sb2.length();
        if (length > 0) {
            sb2.delete(length - 1, length);
            ArrayList arrayList = this.f13888a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C0841a c0841a = (C0841a) arrayList.get(size);
                int i7 = c0841a.f13887c;
                if (i7 != length) {
                    return;
                }
                c0841a.f13887c = i7 - 1;
            }
        }
    }

    public final C0776b c(int i7) {
        float f4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f13889b;
            if (i10 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i10));
            spannableStringBuilder.append('\n');
            i10++;
        }
        spannableStringBuilder.append((CharSequence) d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i11 = this.f13892e + this.f13893f;
        int length = (32 - i11) - spannableStringBuilder.length();
        int i12 = i11 - length;
        int i13 = i7 != Integer.MIN_VALUE ? i7 : (this.g != 2 || (Math.abs(i12) >= 3 && length >= 0)) ? (this.g != 2 || i12 <= 0) ? 0 : 2 : 1;
        if (i13 != 1) {
            if (i13 == 2) {
                i11 = 32 - length;
            }
            f4 = ((i11 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f4 = 0.5f;
        }
        int i14 = this.f13891d;
        if (i14 > 7) {
            i14 -= 17;
        } else if (this.g == 1) {
            i14 -= this.f13894h - 1;
        }
        return new C0776b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i14, 1, Integer.MIN_VALUE, f4, i13, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    public final SpannableString d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f13890c);
        int length = spannableStringBuilder.length();
        int i7 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = 0;
        int i14 = 0;
        boolean z8 = false;
        while (true) {
            ArrayList arrayList = this.f13888a;
            if (i13 >= arrayList.size()) {
                break;
            }
            C0841a c0841a = (C0841a) arrayList.get(i13);
            boolean z10 = c0841a.f13886b;
            int i15 = c0841a.f13885a;
            if (i15 != 8) {
                boolean z11 = i15 == 7;
                if (i15 != 7) {
                    i12 = C0843c.f13897O[i15];
                }
                z8 = z11;
            }
            int i16 = c0841a.f13887c;
            i13++;
            if (i16 != (i13 < arrayList.size() ? ((C0841a) arrayList.get(i13)).f13887c : length)) {
                if (i7 != -1 && !z10) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i7, i16, 33);
                    i7 = -1;
                } else if (i7 == -1 && z10) {
                    i7 = i16;
                }
                if (i10 != -1 && !z8) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i10, i16, 33);
                    i10 = -1;
                } else if (i10 == -1 && z8) {
                    i10 = i16;
                }
                if (i12 != i11) {
                    if (i11 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i11), i14, i16, 33);
                    }
                    i11 = i12;
                    i14 = i16;
                }
            }
        }
        if (i7 != -1 && i7 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i7, length, 33);
        }
        if (i10 != -1 && i10 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
        }
        if (i14 != length && i11 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i11), i14, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        return this.f13888a.isEmpty() && this.f13889b.isEmpty() && this.f13890c.length() == 0;
    }
}
