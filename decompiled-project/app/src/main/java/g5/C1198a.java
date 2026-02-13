package g5;

import M6.e;
import a5.C0776b;
import a5.f;
import a5.g;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n5.AbstractC1705a;
import n5.v;

/* renamed from: g5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1198a extends f {

    /* renamed from: C, reason: collision with root package name */
    public static final Pattern f17457C = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: D, reason: collision with root package name */
    public static final Pattern f17458D = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: A, reason: collision with root package name */
    public final StringBuilder f17459A = new StringBuilder();

    /* renamed from: B, reason: collision with root package name */
    public final ArrayList f17460B = new ArrayList();

    public static long g(Matcher matcher, int i7) {
        String group = matcher.group(i7 + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0L;
        String group2 = matcher.group(i7 + 2);
        group2.getClass();
        long parseLong2 = (Long.parseLong(group2) * 60000) + parseLong;
        String group3 = matcher.group(i7 + 3);
        group3.getClass();
        long parseLong3 = (Long.parseLong(group3) * 1000) + parseLong2;
        String group4 = matcher.group(i7 + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x029f, code lost:
    
        return new ea.C1112g(2, (a5.C0776b[]) r2.toArray(new a5.C0776b[r6]), java.util.Arrays.copyOf(r3, r7));
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:49:0x0143. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:66:0x01ac. Please report as an issue. */
    @Override // a5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g b(int i7, boolean z8, byte[] bArr) {
        String i10;
        String str;
        long[] jArr;
        v vVar;
        Charset charset;
        char c10;
        char c11;
        int i11;
        int i12;
        float f4;
        float f10;
        C0776b c0776b;
        C1198a c1198a = this;
        ArrayList arrayList = new ArrayList();
        long[] jArr2 = new long[32];
        v vVar2 = new v(bArr, i7);
        Charset C2 = vVar2.C();
        if (C2 == null) {
            C2 = e.f6799c;
        }
        int i13 = 0;
        int i14 = 0;
        while (true) {
            String i15 = vVar2.i(C2);
            if (i15 != null) {
                if (i15.length() != 0) {
                    try {
                        Integer.parseInt(i15);
                        i10 = vVar2.i(C2);
                    } catch (NumberFormatException unused) {
                        AbstractC1705a.S("SubripDecoder", "Skipping invalid index: ".concat(i15));
                    }
                    if (i10 == null) {
                        AbstractC1705a.S("SubripDecoder", "Unexpected end");
                    } else {
                        Matcher matcher = f17457C.matcher(i10);
                        if (matcher.matches()) {
                            long g = g(matcher, 1);
                            if (i14 == jArr2.length) {
                                jArr2 = Arrays.copyOf(jArr2, i14 * 2);
                            }
                            int i16 = i14 + 1;
                            jArr2[i14] = g;
                            long g2 = g(matcher, 6);
                            if (i16 == jArr2.length) {
                                jArr2 = Arrays.copyOf(jArr2, i16 * 2);
                            }
                            i14 += 2;
                            jArr2[i16] = g2;
                            StringBuilder sb2 = c1198a.f17459A;
                            sb2.setLength(i13);
                            ArrayList arrayList2 = c1198a.f17460B;
                            arrayList2.clear();
                            String i17 = vVar2.i(C2);
                            while (!TextUtils.isEmpty(i17)) {
                                if (sb2.length() > 0) {
                                    sb2.append("<br>");
                                }
                                String trim = i17.trim();
                                StringBuilder sb3 = new StringBuilder(trim);
                                Matcher matcher2 = f17458D.matcher(trim);
                                int i18 = i13;
                                while (matcher2.find()) {
                                    String group = matcher2.group();
                                    arrayList2.add(group);
                                    int start = matcher2.start() - i18;
                                    int length = group.length();
                                    sb3.replace(start, start + length, "");
                                    i18 += length;
                                }
                                sb2.append(sb3.toString());
                                i17 = vVar2.i(C2);
                                i13 = 0;
                            }
                            Spanned fromHtml = Html.fromHtml(sb2.toString());
                            int i19 = 0;
                            while (true) {
                                if (i19 < arrayList2.size()) {
                                    str = (String) arrayList2.get(i19);
                                    if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                        i19++;
                                    }
                                } else {
                                    str = null;
                                }
                            }
                            if (str == null) {
                                c0776b = new C0776b(fromHtml, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                jArr = jArr2;
                                vVar = vVar2;
                                charset = C2;
                            } else {
                                jArr = jArr2;
                                vVar = vVar2;
                                charset = C2;
                                switch (str.hashCode()) {
                                    case -685620710:
                                        if (str.equals("{\\an1}")) {
                                            c10 = 0;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620679:
                                        if (str.equals("{\\an2}")) {
                                            c10 = 6;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620648:
                                        if (str.equals("{\\an3}")) {
                                            c10 = 3;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620617:
                                        if (str.equals("{\\an4}")) {
                                            c10 = 1;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620586:
                                        if (str.equals("{\\an5}")) {
                                            c10 = 7;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620555:
                                        if (str.equals("{\\an6}")) {
                                            c10 = 4;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620524:
                                        if (str.equals("{\\an7}")) {
                                            c10 = 2;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620493:
                                        if (str.equals("{\\an8}")) {
                                            c10 = '\b';
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620462:
                                        if (str.equals("{\\an9}")) {
                                            c10 = 5;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    default:
                                        c10 = 65535;
                                        break;
                                }
                                int i20 = (c10 == 0 || c10 == 1 || c10 == 2) ? 0 : (c10 == 3 || c10 == 4 || c10 == 5) ? 2 : 1;
                                switch (str.hashCode()) {
                                    case -685620710:
                                        if (str.equals("{\\an1}")) {
                                            c11 = 0;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620679:
                                        if (str.equals("{\\an2}")) {
                                            c11 = 1;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620648:
                                        if (str.equals("{\\an3}")) {
                                            c11 = 2;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620617:
                                        if (str.equals("{\\an4}")) {
                                            c11 = 6;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620586:
                                        if (str.equals("{\\an5}")) {
                                            c11 = 7;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620555:
                                        if (str.equals("{\\an6}")) {
                                            c11 = '\b';
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620524:
                                        if (str.equals("{\\an7}")) {
                                            c11 = 3;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620493:
                                        if (str.equals("{\\an8}")) {
                                            c11 = 4;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620462:
                                        if (str.equals("{\\an9}")) {
                                            c11 = 5;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    default:
                                        c11 = 65535;
                                        break;
                                }
                                int i21 = (c11 == 0 || c11 == 1 || c11 == 2) ? 2 : (c11 == 3 || c11 == 4 || c11 == 5) ? 0 : 1;
                                if (i20 != 0) {
                                    i11 = 1;
                                    if (i20 != 1) {
                                        i12 = 2;
                                        if (i20 != 2) {
                                            throw new IllegalArgumentException();
                                        }
                                        f4 = 0.92f;
                                    } else {
                                        i12 = 2;
                                        f4 = 0.5f;
                                    }
                                } else {
                                    i11 = 1;
                                    i12 = 2;
                                    f4 = 0.08f;
                                }
                                if (i21 == 0) {
                                    f10 = 0.08f;
                                } else if (i21 == i11) {
                                    f10 = 0.5f;
                                } else {
                                    if (i21 != i12) {
                                        throw new IllegalArgumentException();
                                    }
                                    f10 = 0.92f;
                                }
                                c0776b = new C0776b(fromHtml, null, null, null, f10, 0, i21, f4, i20, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                            }
                            arrayList.add(c0776b);
                            arrayList.add(C0776b.f12708F);
                            c1198a = this;
                            jArr2 = jArr;
                            vVar2 = vVar;
                            C2 = charset;
                            i13 = 0;
                        } else {
                            AbstractC1705a.S("SubripDecoder", "Skipping invalid timing: ".concat(i10));
                            c1198a = this;
                            i13 = 0;
                        }
                    }
                }
            }
        }
    }
}
