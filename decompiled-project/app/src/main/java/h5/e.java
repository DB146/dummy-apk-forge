package h5;

import a5.C0775a;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import e5.C1094c;
import e5.C1095d;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import n5.AbstractC1705a;
import n5.D;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f17790a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17791b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17792c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17793d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17794e;

    /* renamed from: f, reason: collision with root package name */
    public final g f17795f;
    public final String[] g;

    /* renamed from: h, reason: collision with root package name */
    public final String f17796h;

    /* renamed from: i, reason: collision with root package name */
    public final String f17797i;
    public final e j;
    public final HashMap k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f17798l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f17799m;

    public e(String str, String str2, long j, long j10, g gVar, String[] strArr, String str3, String str4, e eVar) {
        this.f17790a = str;
        this.f17791b = str2;
        this.f17797i = str4;
        this.f17795f = gVar;
        this.g = strArr;
        this.f17792c = str2 != null;
        this.f17793d = j;
        this.f17794e = j10;
        str3.getClass();
        this.f17796h = str3;
        this.j = eVar;
        this.k = new HashMap();
        this.f17798l = new HashMap();
    }

    public static e a(String str) {
        return new e(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C0775a c0775a = new C0775a();
            c0775a.f12694a = new SpannableStringBuilder();
            treeMap.put(str, c0775a);
        }
        CharSequence charSequence = ((C0775a) treeMap.get(str)).f12694a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final e b(int i7) {
        ArrayList arrayList = this.f17799m;
        if (arrayList != null) {
            return (e) arrayList.get(i7);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f17799m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z8) {
        String str = this.f17790a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z8 || equals || (equals2 && this.f17797i != null)) {
            long j = this.f17793d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j10 = this.f17794e;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
        }
        if (this.f17799m == null) {
            return;
        }
        for (int i7 = 0; i7 < this.f17799m.size(); i7++) {
            ((e) this.f17799m.get(i7)).d(treeSet, z8 || equals);
        }
    }

    public final boolean f(long j) {
        long j10 = this.f17793d;
        long j11 = this.f17794e;
        return (j10 == -9223372036854775807L && j11 == -9223372036854775807L) || (j10 <= j && j11 == -9223372036854775807L) || ((j10 == -9223372036854775807L && j < j11) || (j10 <= j && j < j11));
    }

    public final void g(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f17796h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j) && "div".equals(this.f17790a) && (str2 = this.f17797i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i7 = 0; i7 < c(); i7++) {
            b(i7).g(j, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x026b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(long j, Map map, HashMap hashMap, String str, TreeMap treeMap) {
        int i7;
        int i10;
        e eVar;
        int i11;
        g F10;
        int i12;
        int i13;
        int i14;
        int i15 = -1;
        int i16 = 1;
        if (f(j)) {
            String str2 = this.f17796h;
            String str3 = "".equals(str2) ? str : str2;
            for (Map.Entry entry : this.f17798l.entrySet()) {
                String str4 = (String) entry.getKey();
                HashMap hashMap2 = this.k;
                int intValue = hashMap2.containsKey(str4) ? ((Integer) hashMap2.get(str4)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    C0775a c0775a = (C0775a) treeMap.get(str4);
                    c0775a.getClass();
                    f fVar = (f) hashMap.get(str3);
                    fVar.getClass();
                    g F11 = O5.b.F(this.f17795f, this.g, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c0775a.f12694a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        c0775a.f12694a = spannableStringBuilder;
                    }
                    if (F11 != null) {
                        int i17 = F11.f17814h;
                        if (((i17 == i15 && F11.f17815i == i15) ? i15 : (i17 == i16 ? i16 : 0) | (F11.f17815i == i16 ? 2 : 0)) != i15) {
                            int i18 = F11.f17814h;
                            if (i18 == i15) {
                                if (F11.f17815i == i15) {
                                    i14 = i15;
                                    i16 = 1;
                                    StyleSpan styleSpan = new StyleSpan(i14);
                                    i10 = 33;
                                    spannableStringBuilder.setSpan(styleSpan, intValue, intValue2, 33);
                                } else {
                                    i16 = 1;
                                }
                            }
                            i14 = (i18 == i16 ? i16 : 0) | (F11.f17815i == i16 ? 2 : 0);
                            StyleSpan styleSpan2 = new StyleSpan(i14);
                            i10 = 33;
                            spannableStringBuilder.setSpan(styleSpan2, intValue, intValue2, 33);
                        } else {
                            i10 = 33;
                        }
                        if (F11.f17813f == i16) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, i10);
                        }
                        if (F11.g == i16) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, i10);
                        }
                        if (F11.f17810c) {
                            if (!F11.f17810c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            E6.b.b(spannableStringBuilder, new ForegroundColorSpan(F11.f17809b), intValue, intValue2);
                        }
                        if (F11.f17812e) {
                            if (!F11.f17812e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            E6.b.b(spannableStringBuilder, new BackgroundColorSpan(F11.f17811d), intValue, intValue2);
                        }
                        if (F11.f17808a != null) {
                            E6.b.b(spannableStringBuilder, new TypefaceSpan(F11.f17808a), intValue, intValue2);
                        }
                        C1252b c1252b = F11.f17822r;
                        if (c1252b != null) {
                            int i19 = c1252b.f17774a;
                            if (i19 == i15) {
                                int i20 = fVar.j;
                                i19 = (i20 == 2 || i20 == 1) ? 3 : 1;
                                i13 = 1;
                            } else {
                                i13 = c1252b.f17775b;
                            }
                            int i21 = c1252b.f17776c;
                            if (i21 == -2) {
                                i21 = 1;
                            }
                            E6.b.b(spannableStringBuilder, new C1095d(i19, i13, i21), intValue, intValue2);
                        }
                        int i22 = F11.f17817m;
                        if (i22 == 2) {
                            e eVar2 = this.j;
                            while (true) {
                                if (eVar2 == null) {
                                    eVar2 = null;
                                    break;
                                }
                                g F12 = O5.b.F(eVar2.f17795f, eVar2.g, map);
                                if (F12 != null && F12.f17817m == 1) {
                                    break;
                                } else {
                                    eVar2 = eVar2.j;
                                }
                            }
                            if (eVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(eVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        eVar = null;
                                        break;
                                    }
                                    e eVar3 = (e) arrayDeque.pop();
                                    g F13 = O5.b.F(eVar3.f17795f, eVar3.g, map);
                                    if (F13 != null && F13.f17817m == 3) {
                                        eVar = eVar3;
                                        break;
                                    }
                                    for (int c10 = eVar3.c() - 1; c10 >= 0; c10--) {
                                        arrayDeque.push(eVar3.b(c10));
                                    }
                                }
                                if (eVar != null) {
                                    if (eVar.c() != 1 || eVar.b(0).f17791b == null) {
                                        i7 = -1;
                                        AbstractC1705a.B("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str5 = eVar.b(0).f17791b;
                                        int i23 = D.f21141a;
                                        g F14 = O5.b.F(eVar.f17795f, eVar.g, map);
                                        if (F14 != null) {
                                            i11 = F14.f17818n;
                                            i7 = -1;
                                        } else {
                                            i7 = -1;
                                            i11 = -1;
                                        }
                                        if (i11 == i7 && (F10 = O5.b.F(eVar2.f17795f, eVar2.g, map)) != null) {
                                            i11 = F10.f17818n;
                                        }
                                        spannableStringBuilder.setSpan(new C1094c(str5, i11), intValue, intValue2, 33);
                                    }
                                    if (F11.f17821q == 1) {
                                        E6.b.b(spannableStringBuilder, new Object(), intValue, intValue2);
                                    }
                                    i12 = F11.j;
                                    if (i12 != 1) {
                                        E6.b.b(spannableStringBuilder, new AbsoluteSizeSpan((int) F11.k, true), intValue, intValue2);
                                    } else if (i12 == 2) {
                                        E6.b.b(spannableStringBuilder, new RelativeSizeSpan(F11.k), intValue, intValue2);
                                    } else if (i12 == 3) {
                                        E6.b.b(spannableStringBuilder, new RelativeSizeSpan(F11.k / 100.0f), intValue, intValue2);
                                    }
                                    if (!"p".equals(this.f17790a)) {
                                        float f4 = F11.f17823s;
                                        if (f4 != Float.MAX_VALUE) {
                                            c0775a.f12707q = (f4 * (-90.0f)) / 100.0f;
                                        }
                                        Layout.Alignment alignment = F11.f17819o;
                                        if (alignment != null) {
                                            c0775a.f12696c = alignment;
                                        }
                                        Layout.Alignment alignment2 = F11.f17820p;
                                        if (alignment2 != null) {
                                            c0775a.f12697d = alignment2;
                                        }
                                    }
                                    i15 = i7;
                                    i16 = 1;
                                }
                            }
                        } else if (i22 == 3 || i22 == 4) {
                            spannableStringBuilder.setSpan(new Object(), intValue, intValue2, 33);
                        }
                        i7 = -1;
                        if (F11.f17821q == 1) {
                        }
                        i12 = F11.j;
                        if (i12 != 1) {
                        }
                        if (!"p".equals(this.f17790a)) {
                        }
                        i15 = i7;
                        i16 = 1;
                    }
                }
                i7 = i15;
                i15 = i7;
                i16 = 1;
            }
            for (int i24 = 0; i24 < c(); i24++) {
                b(i24).h(j, map, hashMap, str3, treeMap);
            }
        }
    }

    public final void i(long j, boolean z8, String str, TreeMap treeMap) {
        HashMap hashMap = this.k;
        hashMap.clear();
        HashMap hashMap2 = this.f17798l;
        hashMap2.clear();
        String str2 = this.f17790a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f17796h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f17792c && z8) {
            SpannableStringBuilder e2 = e(str4, treeMap);
            String str5 = this.f17791b;
            str5.getClass();
            e2.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z8) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((C0775a) entry.getValue()).f12694a;
                charSequence.getClass();
                hashMap.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(str2);
            for (int i7 = 0; i7 < c(); i7++) {
                b(i7).i(j, z8 || equals, str4, treeMap);
            }
            if (equals) {
                SpannableStringBuilder e10 = e(str4, treeMap);
                int length = e10.length() - 1;
                while (length >= 0 && e10.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && e10.charAt(length) != '\n') {
                    e10.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((C0775a) entry2.getValue()).f12694a;
                charSequence2.getClass();
                hashMap2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
