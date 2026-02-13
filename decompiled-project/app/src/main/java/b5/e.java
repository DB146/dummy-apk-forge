package b5;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f13923A;

    /* renamed from: B, reason: collision with root package name */
    public static final boolean[] f13924B;

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f13925C;

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f13926D;

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f13927E;

    /* renamed from: F, reason: collision with root package name */
    public static final int[] f13928F;

    /* renamed from: w, reason: collision with root package name */
    public static final int f13929w = c(2, 2, 2, 0);

    /* renamed from: x, reason: collision with root package name */
    public static final int f13930x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f13931y;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f13932z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13933a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f13934b = new SpannableStringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public boolean f13935c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13936d;

    /* renamed from: e, reason: collision with root package name */
    public int f13937e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13938f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f13939h;

    /* renamed from: i, reason: collision with root package name */
    public int f13940i;
    public int j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public int f13941l;

    /* renamed from: m, reason: collision with root package name */
    public int f13942m;

    /* renamed from: n, reason: collision with root package name */
    public int f13943n;

    /* renamed from: o, reason: collision with root package name */
    public int f13944o;

    /* renamed from: p, reason: collision with root package name */
    public int f13945p;

    /* renamed from: q, reason: collision with root package name */
    public int f13946q;

    /* renamed from: r, reason: collision with root package name */
    public int f13947r;

    /* renamed from: s, reason: collision with root package name */
    public int f13948s;

    /* renamed from: t, reason: collision with root package name */
    public int f13949t;

    /* renamed from: u, reason: collision with root package name */
    public int f13950u;

    /* renamed from: v, reason: collision with root package name */
    public int f13951v;

    static {
        int c10 = c(0, 0, 0, 0);
        f13930x = c10;
        int c11 = c(0, 0, 0, 3);
        f13931y = new int[]{0, 0, 0, 0, 0, 2, 0};
        f13932z = new int[]{0, 0, 0, 0, 0, 0, 2};
        f13923A = new int[]{3, 3, 3, 3, 3, 3, 1};
        f13924B = new boolean[]{false, false, false, true, true, true, false};
        f13925C = new int[]{c10, c11, c10, c10, c11, c10, c10};
        f13926D = new int[]{0, 1, 2, 3, 4, 3, 4};
        f13927E = new int[]{0, 0, 0, 0, 0, 3, 3};
        f13928F = new int[]{c10, c10, c10, c10, c10, c11, c11};
    }

    public e() {
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(int i7, int i10, int i11, int i12) {
        int i13;
        AbstractC1705a.k(i7, 4);
        AbstractC1705a.k(i10, 4);
        AbstractC1705a.k(i11, 4);
        AbstractC1705a.k(i12, 4);
        if (i12 != 0 && i12 != 1) {
            if (i12 == 2) {
                i13 = 127;
            } else if (i12 == 3) {
                i13 = 0;
            }
            return Color.argb(i13, i7 <= 1 ? 255 : 0, i10 <= 1 ? 255 : 0, i11 > 1 ? 255 : 0);
        }
        i13 = 255;
        return Color.argb(i13, i7 <= 1 ? 255 : 0, i10 <= 1 ? 255 : 0, i11 > 1 ? 255 : 0);
    }

    public final void a(char c10) {
        SpannableStringBuilder spannableStringBuilder = this.f13934b;
        if (c10 != '\n') {
            spannableStringBuilder.append(c10);
            return;
        }
        ArrayList arrayList = this.f13933a;
        arrayList.add(b());
        spannableStringBuilder.clear();
        if (this.f13945p != -1) {
            this.f13945p = 0;
        }
        if (this.f13946q != -1) {
            this.f13946q = 0;
        }
        if (this.f13947r != -1) {
            this.f13947r = 0;
        }
        if (this.f13949t != -1) {
            this.f13949t = 0;
        }
        while (true) {
            if ((!this.k || arrayList.size() < this.j) && arrayList.size() < 15) {
                return;
            } else {
                arrayList.remove(0);
            }
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f13934b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f13945p != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f13945p, length, 33);
            }
            if (this.f13946q != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f13946q, length, 33);
            }
            if (this.f13947r != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f13948s), this.f13947r, length, 33);
            }
            if (this.f13949t != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f13950u), this.f13949t, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f13933a.clear();
        this.f13934b.clear();
        this.f13945p = -1;
        this.f13946q = -1;
        this.f13947r = -1;
        this.f13949t = -1;
        this.f13951v = 0;
        this.f13935c = false;
        this.f13936d = false;
        this.f13937e = 4;
        this.f13938f = false;
        this.g = 0;
        this.f13939h = 0;
        this.f13940i = 0;
        this.j = 15;
        this.k = true;
        this.f13941l = 0;
        this.f13942m = 0;
        this.f13943n = 0;
        int i7 = f13930x;
        this.f13944o = i7;
        this.f13948s = f13929w;
        this.f13950u = i7;
    }

    public final void e(boolean z8, boolean z10) {
        int i7 = this.f13945p;
        SpannableStringBuilder spannableStringBuilder = this.f13934b;
        if (i7 != -1) {
            if (!z8) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f13945p, spannableStringBuilder.length(), 33);
                this.f13945p = -1;
            }
        } else if (z8) {
            this.f13945p = spannableStringBuilder.length();
        }
        if (this.f13946q == -1) {
            if (z10) {
                this.f13946q = spannableStringBuilder.length();
            }
        } else {
            if (z10) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f13946q, spannableStringBuilder.length(), 33);
            this.f13946q = -1;
        }
    }

    public final void f(int i7, int i10) {
        int i11 = this.f13947r;
        SpannableStringBuilder spannableStringBuilder = this.f13934b;
        if (i11 != -1 && this.f13948s != i7) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f13948s), this.f13947r, spannableStringBuilder.length(), 33);
        }
        if (i7 != f13929w) {
            this.f13947r = spannableStringBuilder.length();
            this.f13948s = i7;
        }
        if (this.f13949t != -1 && this.f13950u != i10) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f13950u), this.f13949t, spannableStringBuilder.length(), 33);
        }
        if (i10 != f13930x) {
            this.f13949t = spannableStringBuilder.length();
            this.f13950u = i10;
        }
    }
}
