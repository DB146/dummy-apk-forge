package f5;

import H2.r0;
import M6.e;
import a5.C0776b;
import a5.f;
import a5.g;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import ea.C1111f;
import h3.o;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n5.AbstractC1705a;
import n5.D;
import n5.v;
import y7.u0;

/* renamed from: f5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1135a extends f {

    /* renamed from: F, reason: collision with root package name */
    public static final Pattern f16940F = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: A, reason: collision with root package name */
    public final boolean f16941A;

    /* renamed from: B, reason: collision with root package name */
    public final r0 f16942B;

    /* renamed from: C, reason: collision with root package name */
    public LinkedHashMap f16943C;

    /* renamed from: D, reason: collision with root package name */
    public float f16944D = -3.4028235E38f;

    /* renamed from: E, reason: collision with root package name */
    public float f16945E = -3.4028235E38f;

    public C1135a(List list) {
        if (list == null || list.isEmpty()) {
            this.f16941A = false;
            this.f16942B = null;
            return;
        }
        this.f16941A = true;
        String o10 = D.o((byte[]) list.get(0));
        AbstractC1705a.h(o10.startsWith("Format:"));
        r0 b2 = r0.b(o10);
        b2.getClass();
        this.f16942B = b2;
        i(new v((byte[]) list.get(1)), e.f6799c);
    }

    public static int g(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i7;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i7 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i7 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i7, Long.valueOf(j));
        arrayList2.add(i7, i7 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i7 - 1)));
        return i7;
    }

    public static long j(String str) {
        Matcher matcher = f16940F.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i7 = D.f21141a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:88:0x0211. Please report as an issue. */
    @Override // a5.f
    public final g b(int i7, boolean z8, byte[] bArr) {
        v vVar;
        Charset charset;
        r0 r0Var;
        float f4;
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i11;
        PointF pointF;
        int i12;
        int i13;
        float f10;
        float f11;
        float f12;
        float f13;
        int i14;
        float f14;
        int i15;
        int i16;
        int i17;
        Integer num;
        int i18;
        int i19;
        C1135a c1135a = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        v vVar2 = new v(bArr, i7);
        Charset C2 = vVar2.C();
        if (C2 == null) {
            C2 = e.f6799c;
        }
        boolean z10 = c1135a.f16941A;
        if (!z10) {
            c1135a.i(vVar2, C2);
        }
        r0 r0Var2 = z10 ? c1135a.f16942B : null;
        while (true) {
            String i20 = vVar2.i(C2);
            if (i20 == null) {
                return new C1111f(1, arrayList, arrayList2);
            }
            if (i20.startsWith("Format:")) {
                r0Var2 = r0.b(i20);
            } else {
                if (i20.startsWith("Dialogue:")) {
                    if (r0Var2 == null) {
                        AbstractC1705a.S("SsaDecoder", "Skipping dialogue line before complete format: ".concat(i20));
                    } else {
                        AbstractC1705a.h(i20.startsWith("Dialogue:"));
                        String substring = i20.substring(9);
                        int i21 = r0Var2.f4797f;
                        String[] split = substring.split(",", i21);
                        if (split.length != i21) {
                            AbstractC1705a.S("SsaDecoder", "Skipping dialogue line with fewer columns than format: ".concat(i20));
                        } else {
                            long j = j(split[r0Var2.f4793b]);
                            if (j == -9223372036854775807L) {
                                AbstractC1705a.S("SsaDecoder", "Skipping invalid timing: ".concat(i20));
                            } else {
                                long j10 = j(split[r0Var2.f4794c]);
                                if (j10 == -9223372036854775807L) {
                                    AbstractC1705a.S("SsaDecoder", "Skipping invalid timing: ".concat(i20));
                                } else {
                                    LinkedHashMap linkedHashMap = c1135a.f16943C;
                                    C1138d c1138d = (linkedHashMap == null || (i19 = r0Var2.f4795d) == -1) ? null : (C1138d) linkedHashMap.get(split[i19].trim());
                                    String str = split[r0Var2.f4796e];
                                    Matcher matcher = C1137c.f16954a.matcher(str);
                                    int i22 = -1;
                                    PointF pointF2 = null;
                                    while (matcher.find()) {
                                        v vVar3 = vVar2;
                                        String group = matcher.group(1);
                                        group.getClass();
                                        try {
                                            PointF a9 = C1137c.a(group);
                                            if (a9 != null) {
                                                pointF2 = a9;
                                            }
                                        } catch (RuntimeException unused) {
                                        }
                                        try {
                                            Matcher matcher2 = C1137c.f16957d.matcher(group);
                                            if (matcher2.find()) {
                                                String group2 = matcher2.group(1);
                                                group2.getClass();
                                                i18 = C1138d.a(group2);
                                            } else {
                                                i18 = -1;
                                            }
                                            if (i18 != -1) {
                                                i22 = i18;
                                            }
                                        } catch (RuntimeException unused2) {
                                        }
                                        vVar2 = vVar3;
                                    }
                                    vVar = vVar2;
                                    String replace = C1137c.f16954a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f15 = c1135a.f16944D;
                                    float f16 = c1135a.f16945E;
                                    SpannableString spannableString = new SpannableString(replace);
                                    if (c1138d != null) {
                                        Integer num2 = c1138d.f16960c;
                                        if (num2 != null) {
                                            charset = C2;
                                            r0Var = r0Var2;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            charset = C2;
                                            r0Var = r0Var2;
                                        }
                                        if (c1138d.j == 3 && (num = c1138d.f16961d) != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f17 = c1138d.f16962e;
                                        if (f17 == -3.4028235E38f || f16 == -3.4028235E38f) {
                                            f13 = -3.4028235E38f;
                                            i14 = Integer.MIN_VALUE;
                                        } else {
                                            f13 = f17 / f16;
                                            i14 = 1;
                                        }
                                        boolean z11 = c1138d.g;
                                        boolean z12 = c1138d.f16963f;
                                        if (z12 && z11) {
                                            f14 = f13;
                                            i15 = i14;
                                            i16 = 0;
                                            i17 = 33;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            f14 = f13;
                                            i15 = i14;
                                            i16 = 0;
                                            i17 = 33;
                                            if (z12) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z11) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (c1138d.f16964h) {
                                            spannableString.setSpan(new UnderlineSpan(), i16, spannableString.length(), i17);
                                        }
                                        if (c1138d.f16965i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i16, spannableString.length(), i17);
                                        }
                                        i10 = i15;
                                        f4 = f14;
                                    } else {
                                        charset = C2;
                                        r0Var = r0Var2;
                                        f4 = -3.4028235E38f;
                                        i10 = Integer.MIN_VALUE;
                                    }
                                    int i23 = -1;
                                    if (i22 != -1) {
                                        i23 = i22;
                                    } else if (c1138d != null) {
                                        i23 = c1138d.f16959b;
                                    }
                                    switch (i23) {
                                        case 0:
                                        default:
                                            o.u(i23, "Unknown alignment: ", "SsaDecoder");
                                        case -1:
                                            alignment2 = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            alignment2 = alignment;
                                            break;
                                        case 2:
                                        case 5:
                                        case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            alignment2 = alignment;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            alignment2 = alignment;
                                            break;
                                    }
                                    int i24 = Integer.MIN_VALUE;
                                    switch (i23) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            o.u(i23, "Unknown alignment: ", "SsaDecoder");
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i11 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                                            i11 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i11 = 2;
                                            break;
                                    }
                                    i11 = Integer.MIN_VALUE;
                                    switch (i23) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            o.u(i23, "Unknown alignment: ", "SsaDecoder");
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            pointF = pointF2;
                                            i24 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            pointF = pointF2;
                                            i24 = 1;
                                            break;
                                        case 7:
                                        case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                                        case 9:
                                            pointF = pointF2;
                                            i24 = 0;
                                            break;
                                    }
                                    pointF = pointF2;
                                    float f18 = -3.4028235E38f;
                                    if (pointF == null || f16 == -3.4028235E38f || f15 == -3.4028235E38f) {
                                        if (i11 != 0) {
                                            i12 = 1;
                                            if (i11 != 1) {
                                                i13 = 2;
                                                f10 = i11 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                i13 = 2;
                                                f10 = 0.5f;
                                            }
                                        } else {
                                            i12 = 1;
                                            i13 = 2;
                                            f10 = 0.05f;
                                        }
                                        if (i24 == 0) {
                                            f18 = 0.05f;
                                        } else if (i24 == i12) {
                                            f18 = 0.5f;
                                        } else if (i24 == i13) {
                                            f18 = 0.95f;
                                        }
                                        f11 = f18;
                                        f12 = f10;
                                    } else {
                                        float f19 = pointF.x / f15;
                                        f11 = pointF.y / f16;
                                        f12 = f19;
                                    }
                                    C0776b c0776b = new C0776b(spannableString, alignment2, null, null, f11, 0, i24, f12, i11, i10, f4, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                    int g = g(j10, arrayList2, arrayList);
                                    for (int g2 = g(j, arrayList2, arrayList); g2 < g; g2++) {
                                        ((List) arrayList.get(g2)).add(c0776b);
                                    }
                                    c1135a = this;
                                    vVar2 = vVar;
                                    C2 = charset;
                                    r0Var2 = r0Var;
                                }
                            }
                        }
                    }
                }
                vVar = vVar2;
                charset = C2;
                r0Var = r0Var2;
                c1135a = this;
                vVar2 = vVar;
                C2 = charset;
                r0Var2 = r0Var;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x029d, code lost:
    
        if (r4 != 3) goto L160;
     */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0035 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(v vVar, Charset charset) {
        char c10;
        int i7;
        C1138d c1138d;
        float f4;
        int i10;
        String trim;
        int i11;
        float f10;
        int i12 = 6;
        int i13 = 7;
        int i14 = 2;
        int i15 = 0;
        while (true) {
            String i16 = vVar.i(charset);
            if (i16 == null) {
                return;
            }
            c10 = '[';
            if ("[Script Info]".equalsIgnoreCase(i16)) {
                while (true) {
                    String i17 = vVar.i(charset);
                    if (i17 == null && (vVar.a() == 0 || vVar.c(charset) != '[')) {
                        String[] split = i17.split(":");
                        if (split.length != i14) {
                            String N10 = u0.N(split[i15].trim());
                            N10.getClass();
                            if (N10.equals("playresx")) {
                                this.f16944D = Float.parseFloat(split[1].trim());
                            } else {
                                if (N10.equals("playresy")) {
                                    try {
                                        this.f16945E = Float.parseFloat(split[1].trim());
                                    } catch (NumberFormatException unused) {
                                    }
                                }
                                String i172 = vVar.i(charset);
                                if (i172 == null) {
                                    break;
                                }
                                String[] split2 = i172.split(":");
                                if (split2.length != i14) {
                                }
                            }
                        }
                    }
                }
            } else {
                if ("[V4+ Styles]".equalsIgnoreCase(i16)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C1136b c1136b = null;
                    while (true) {
                        String i18 = vVar.i(charset);
                        if (i18 != null && (vVar.a() == 0 || vVar.c(charset) != c10)) {
                            if (i18.startsWith("Format:")) {
                                String[] split3 = TextUtils.split(i18.substring(i13), ",");
                                int i19 = -1;
                                int i20 = -1;
                                int i21 = -1;
                                int i22 = -1;
                                int i23 = -1;
                                int i24 = -1;
                                int i25 = -1;
                                int i26 = -1;
                                int i27 = -1;
                                int i28 = -1;
                                for (int i29 = i15; i29 < split3.length; i29++) {
                                    String N11 = u0.N(split3[i29].trim());
                                    N11.getClass();
                                    switch (N11.hashCode()) {
                                        case -1178781136:
                                            if (N11.equals("italic")) {
                                                i7 = i15;
                                                break;
                                            }
                                            break;
                                        case -1026963764:
                                            if (N11.equals("underline")) {
                                                i7 = 1;
                                                break;
                                            }
                                            break;
                                        case -192095652:
                                            if (N11.equals("strikeout")) {
                                                i7 = i14;
                                                break;
                                            }
                                            break;
                                        case -70925746:
                                            if (N11.equals("primarycolour")) {
                                                i7 = 3;
                                                break;
                                            }
                                            break;
                                        case 3029637:
                                            if (N11.equals("bold")) {
                                                i7 = 4;
                                                break;
                                            }
                                            break;
                                        case 3373707:
                                            if (N11.equals("name")) {
                                                i7 = 5;
                                                break;
                                            }
                                            break;
                                        case 366554320:
                                            if (N11.equals("fontsize")) {
                                                i7 = i12;
                                                break;
                                            }
                                            break;
                                        case 767321349:
                                            if (N11.equals("borderstyle")) {
                                                i7 = 7;
                                                break;
                                            }
                                            break;
                                        case 1767875043:
                                            if (N11.equals("alignment")) {
                                                i7 = 8;
                                                break;
                                            }
                                            break;
                                        case 1988365454:
                                            if (N11.equals("outlinecolour")) {
                                                i7 = 9;
                                                break;
                                            }
                                            break;
                                    }
                                    i7 = -1;
                                    switch (i7) {
                                        case 0:
                                            i25 = i29;
                                            break;
                                        case 1:
                                            i26 = i29;
                                            break;
                                        case 2:
                                            i27 = i29;
                                            break;
                                        case 3:
                                            i21 = i29;
                                            break;
                                        case 4:
                                            i24 = i29;
                                            break;
                                        case 5:
                                            i19 = i29;
                                            break;
                                        case 6:
                                            i23 = i29;
                                            break;
                                        case 7:
                                            i28 = i29;
                                            break;
                                        case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                                            i20 = i29;
                                            break;
                                        case 9:
                                            i22 = i29;
                                            break;
                                    }
                                }
                                c1136b = i19 != -1 ? new C1136b(i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, split3.length) : null;
                                i13 = 7;
                            } else {
                                if (i18.startsWith("Style:")) {
                                    if (c1136b == null) {
                                        AbstractC1705a.S("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: ".concat(i18));
                                    } else {
                                        AbstractC1705a.h(i18.startsWith("Style:"));
                                        String[] split4 = TextUtils.split(i18.substring(i12), ",");
                                        int length = split4.length;
                                        int i30 = c1136b.k;
                                        if (length != i30) {
                                            int length2 = split4.length;
                                            int i31 = D.f21141a;
                                            Locale locale = Locale.US;
                                            StringBuilder q10 = o.q(i30, length2, "Skipping malformed 'Style:' line (expected ", " values, found ", "): '");
                                            q10.append(i18);
                                            q10.append("'");
                                            AbstractC1705a.S("SsaStyle", q10.toString());
                                        } else {
                                            try {
                                                String trim2 = split4[c1136b.f16946a].trim();
                                                int i32 = c1136b.f16947b;
                                                int a9 = i32 != -1 ? C1138d.a(split4[i32].trim()) : -1;
                                                int i33 = c1136b.f16948c;
                                                Integer c11 = i33 != -1 ? C1138d.c(split4[i33].trim()) : null;
                                                int i34 = c1136b.f16949d;
                                                Integer c12 = i34 != -1 ? C1138d.c(split4[i34].trim()) : null;
                                                int i35 = c1136b.f16950e;
                                                if (i35 != -1) {
                                                    String trim3 = split4[i35].trim();
                                                    try {
                                                        f10 = Float.parseFloat(trim3);
                                                    } catch (NumberFormatException e2) {
                                                        AbstractC1705a.R(e2, "SsaStyle", "Failed to parse font size: '" + trim3 + "'");
                                                        f10 = -3.4028235E38f;
                                                    }
                                                    f4 = f10;
                                                } else {
                                                    f4 = -3.4028235E38f;
                                                }
                                                int i36 = c1136b.f16951f;
                                                boolean z8 = i36 != -1 && C1138d.b(split4[i36].trim());
                                                int i37 = c1136b.g;
                                                boolean z10 = i37 != -1 && C1138d.b(split4[i37].trim());
                                                int i38 = c1136b.f16952h;
                                                boolean z11 = i38 != -1 && C1138d.b(split4[i38].trim());
                                                int i39 = c1136b.f16953i;
                                                boolean z12 = i39 != -1 && C1138d.b(split4[i39].trim());
                                                int i40 = c1136b.j;
                                                if (i40 != -1) {
                                                    trim = split4[i40].trim();
                                                    try {
                                                        i11 = Integer.parseInt(trim.trim());
                                                        if (i11 != 1) {
                                                        }
                                                    } catch (NumberFormatException unused2) {
                                                    }
                                                    i10 = i11;
                                                } else {
                                                    i10 = -1;
                                                }
                                                c1138d = new C1138d(trim2, a9, c11, c12, f4, z8, z10, z11, z12, i10);
                                            } catch (RuntimeException e10) {
                                                AbstractC1705a.R(e10, "SsaStyle", "Skipping malformed 'Style:' line: '" + i18 + "'");
                                            }
                                            if (c1138d != null) {
                                                linkedHashMap.put(c1138d.f16958a, c1138d);
                                            }
                                        }
                                        c1138d = null;
                                        if (c1138d != null) {
                                        }
                                    }
                                }
                                i12 = 6;
                                i13 = 7;
                                i14 = 2;
                                i15 = 0;
                                c10 = '[';
                            }
                        }
                    }
                    this.f16943C = linkedHashMap;
                } else if ("[V4 Styles]".equalsIgnoreCase(i16)) {
                    AbstractC1705a.B("SsaDecoder", "[V4 Styles] are not supported");
                } else if ("[Events]".equalsIgnoreCase(i16)) {
                    return;
                }
                i12 = 6;
                i13 = 7;
                i14 = 2;
                i15 = 0;
            }
        }
        AbstractC1705a.S("SsaStyle", "Ignoring unknown BorderStyle: " + trim);
        i11 = -1;
        i10 = i11;
        c1138d = new C1138d(trim2, a9, c11, c12, f4, z8, z10, z11, z12, i10);
        if (c1138d != null) {
        }
        i12 = 6;
        i13 = 7;
        i14 = 2;
        i15 = 0;
        c10 = '[';
    }
}
