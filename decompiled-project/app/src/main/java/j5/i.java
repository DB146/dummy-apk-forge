package j5;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m4.C1586o0;
import n5.AbstractC1705a;
import n5.AbstractC1706b;
import n5.D;
import n5.v;
import y7.u0;

/* loaded from: classes.dex */
public final class i extends a5.f {

    /* renamed from: A, reason: collision with root package name */
    public final v f18644A = new v();

    /* renamed from: B, reason: collision with root package name */
    public final C1378a f18645B = new C1378a();

    /* JADX WARN: Code restructure failed: missing block: B:196:0x011a, code lost:
    
        r1 = r4;
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x039a, code lost:
    
        r6.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x010b, code lost:
    
        if (")".equals(j5.C1378a.b(r8, r11)) == false) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object, j5.b] */
    @Override // a5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a5.g b(int i7, boolean z8, byte[] bArr) {
        int i10;
        int i11;
        C1380c c1380c;
        String str;
        int i12;
        String sb2;
        int i13;
        char c10;
        i iVar = this;
        int i14 = 2;
        boolean z10 = false;
        int i15 = -1;
        int i16 = 1;
        v vVar = iVar.f18644A;
        vVar.E(i7, bArr);
        ArrayList arrayList = new ArrayList();
        try {
            j.d(vVar);
            do {
            } while (!TextUtils.isEmpty(vVar.i(M6.e.f6799c)));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int i17 = z10 ? 1 : 0;
                int i18 = i15;
                while (i18 == i15) {
                    i17 = vVar.f21230b;
                    String i19 = vVar.i(M6.e.f6799c);
                    i18 = i19 == null ? z10 ? 1 : 0 : "STYLE".equals(i19) ? i14 : i19.startsWith("NOTE") ? i16 : 3;
                }
                vVar.G(i17);
                if (i18 == 0) {
                    return new Q7.h(arrayList2);
                }
                if (i18 == i16) {
                    do {
                    } while (!TextUtils.isEmpty(vVar.i(M6.e.f6799c)));
                } else {
                    String str2 = null;
                    if (i18 != i14) {
                        i10 = i14;
                        i11 = i16;
                        if (i18 == 3) {
                            Pattern pattern = h.f18640a;
                            Charset charset = M6.e.f6799c;
                            String i20 = vVar.i(charset);
                            if (i20 == null) {
                                c1380c = null;
                            } else {
                                Pattern pattern2 = h.f18640a;
                                Matcher matcher = pattern2.matcher(i20);
                                if (matcher.matches()) {
                                    c1380c = h.d(null, matcher, vVar, arrayList);
                                } else {
                                    c1380c = null;
                                    String i21 = vVar.i(charset);
                                    if (i21 != null) {
                                        Matcher matcher2 = pattern2.matcher(i21);
                                        if (matcher2.matches()) {
                                            c1380c = h.d(i20.trim(), matcher2, vVar, arrayList);
                                        }
                                    }
                                }
                            }
                            if (c1380c != null) {
                                arrayList2.add(c1380c);
                            }
                        }
                    } else {
                        if (!arrayList2.isEmpty()) {
                            throw new Exception("A style block was found after the first cue.");
                        }
                        vVar.i(M6.e.f6799c);
                        C1378a c1378a = iVar.f18645B;
                        StringBuilder sb3 = c1378a.f18606b;
                        sb3.setLength(z10 ? 1 : 0);
                        int i22 = vVar.f21230b;
                        do {
                        } while (!TextUtils.isEmpty(vVar.i(M6.e.f6799c)));
                        byte[] bArr2 = vVar.f21229a;
                        int i23 = vVar.f21230b;
                        v vVar2 = c1378a.f18605a;
                        vVar2.E(i23, bArr2);
                        vVar2.G(i22);
                        ArrayList arrayList3 = new ArrayList();
                        boolean z11 = z10;
                        while (true) {
                            C1378a.c(vVar2);
                            if (vVar2.a() >= 5 && "::cue".equals(vVar2.t(5, M6.e.f6799c))) {
                                int i24 = vVar2.f21230b;
                                String b2 = C1378a.b(vVar2, sb3);
                                if (b2 != null) {
                                    if ("{".equals(b2)) {
                                        vVar2.G(i24);
                                        str = "";
                                    } else if ("(".equals(b2)) {
                                        int i25 = vVar2.f21230b;
                                        int i26 = vVar2.f21231c;
                                        int i27 = z11 ? 1 : 0;
                                        while (i25 < i26 && i27 == 0) {
                                            int i28 = i25 + 1;
                                            int i29 = ((char) vVar2.f21229a[i25]) == ')' ? i16 : z11 ? 1 : 0;
                                            i25 = i28;
                                            i27 = i29;
                                        }
                                        str = vVar2.t((i25 + i15) - vVar2.f21230b, M6.e.f6799c).trim();
                                    } else {
                                        str = str2;
                                    }
                                    if (str == null && "{".equals(C1378a.b(vVar2, sb3))) {
                                        ?? obj = new Object();
                                        obj.f18607a = "";
                                        obj.f18608b = "";
                                        obj.f18609c = Collections.emptySet();
                                        obj.f18610d = "";
                                        obj.f18611e = str2;
                                        obj.g = z11;
                                        obj.f18614i = z11;
                                        obj.j = i15;
                                        obj.k = i15;
                                        obj.f18615l = i15;
                                        obj.f18616m = i15;
                                        obj.f18618o = i15;
                                        obj.f18619p = z11;
                                        if (!"".equals(str)) {
                                            int indexOf = str.indexOf(91);
                                            if (indexOf != i15) {
                                                Matcher matcher3 = C1378a.f18603c.matcher(str.substring(indexOf));
                                                if (matcher3.matches()) {
                                                    String group = matcher3.group(i16);
                                                    group.getClass();
                                                    obj.f18610d = group;
                                                }
                                                str = str.substring(z11 ? 1 : 0, indexOf);
                                            }
                                            int i30 = D.f21141a;
                                            String[] split = str.split("\\.", i15);
                                            String str3 = split[z11 ? 1 : 0];
                                            int indexOf2 = str3.indexOf(35);
                                            if (indexOf2 != i15) {
                                                obj.f18608b = str3.substring(z11 ? 1 : 0, indexOf2);
                                                obj.f18607a = str3.substring(indexOf2 + i16);
                                            } else {
                                                obj.f18608b = str3;
                                            }
                                            if (split.length > i16) {
                                                int length = split.length;
                                                AbstractC1705a.h(length <= split.length ? i16 : z11 ? 1 : 0);
                                                obj.f18609c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, i16, length)));
                                            }
                                        }
                                        int i31 = z11 ? 1 : 0;
                                        String str4 = null;
                                        int i32 = z11;
                                        while (i31 == 0) {
                                            int i33 = vVar2.f21230b;
                                            str4 = C1378a.b(vVar2, sb3);
                                            int i34 = (str4 == null || "}".equals(str4)) ? i16 : i32;
                                            if (i34 == 0) {
                                                vVar2.G(i33);
                                                C1378a.c(vVar2);
                                                String a9 = C1378a.a(vVar2, sb3);
                                                if (!"".equals(a9) && ":".equals(C1378a.b(vVar2, sb3))) {
                                                    C1378a.c(vVar2);
                                                    StringBuilder sb4 = new StringBuilder();
                                                    boolean z12 = false;
                                                    while (true) {
                                                        if (z12) {
                                                            sb2 = sb4.toString();
                                                        } else {
                                                            int i35 = vVar2.f21230b;
                                                            boolean z13 = z12;
                                                            String b10 = C1378a.b(vVar2, sb3);
                                                            if (b10 == null) {
                                                                sb2 = null;
                                                            } else if ("}".equals(b10) || ";".equals(b10)) {
                                                                vVar2.G(i35);
                                                                z12 = true;
                                                            } else {
                                                                sb4.append(b10);
                                                                z12 = z13;
                                                            }
                                                        }
                                                    }
                                                    if (sb2 != null && !"".equals(sb2)) {
                                                        int i36 = vVar2.f21230b;
                                                        String b11 = C1378a.b(vVar2, sb3);
                                                        if (!";".equals(b11)) {
                                                            if ("}".equals(b11)) {
                                                                vVar2.G(i36);
                                                            }
                                                        }
                                                        if ("color".equals(a9)) {
                                                            i13 = 1;
                                                            obj.f18612f = AbstractC1706b.a(sb2, true);
                                                            obj.g = true;
                                                        } else {
                                                            i13 = 1;
                                                            if ("background-color".equals(a9)) {
                                                                obj.f18613h = AbstractC1706b.a(sb2, true);
                                                                obj.f18614i = true;
                                                            } else if ("ruby-position".equals(a9)) {
                                                                if ("over".equals(sb2)) {
                                                                    obj.f18618o = 1;
                                                                } else if ("under".equals(sb2)) {
                                                                    obj.f18618o = 2;
                                                                }
                                                            } else if ("text-combine-upright".equals(a9)) {
                                                                obj.f18619p = "all".equals(sb2) || sb2.startsWith("digits");
                                                            } else if ("text-decoration".equals(a9)) {
                                                                if ("underline".equals(sb2)) {
                                                                    obj.j = 1;
                                                                }
                                                            } else if ("font-family".equals(a9)) {
                                                                obj.f18611e = u0.N(sb2);
                                                            } else {
                                                                if (!"font-weight".equals(a9)) {
                                                                    i13 = 1;
                                                                    if ("font-style".equals(a9)) {
                                                                        if ("italic".equals(sb2)) {
                                                                            obj.f18615l = 1;
                                                                        }
                                                                    } else if ("font-size".equals(a9)) {
                                                                        Matcher matcher4 = C1378a.f18604d.matcher(u0.N(sb2));
                                                                        if (matcher4.matches()) {
                                                                            String group2 = matcher4.group(2);
                                                                            group2.getClass();
                                                                            switch (group2.hashCode()) {
                                                                                case 37:
                                                                                    if (group2.equals("%")) {
                                                                                        c10 = 0;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                case 3240:
                                                                                    if (group2.equals("em")) {
                                                                                        c10 = 1;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                case 3592:
                                                                                    if (group2.equals("px")) {
                                                                                        c10 = 2;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                            }
                                                                            c10 = 65535;
                                                                            switch (c10) {
                                                                                case 0:
                                                                                    i12 = 1;
                                                                                    obj.f18616m = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i12 = 1;
                                                                                    obj.f18616m = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i12 = 1;
                                                                                    obj.f18616m = 1;
                                                                                    break;
                                                                                default:
                                                                                    throw new IllegalStateException();
                                                                            }
                                                                            String group3 = matcher4.group(i12);
                                                                            group3.getClass();
                                                                            obj.f18617n = Float.parseFloat(group3);
                                                                            i16 = i12;
                                                                            i31 = i34;
                                                                            i32 = 0;
                                                                        } else {
                                                                            AbstractC1705a.S("WebvttCssParser", "Invalid font-size: '" + sb2 + "'.");
                                                                        }
                                                                    }
                                                                } else if ("bold".equals(sb2)) {
                                                                    i13 = 1;
                                                                    obj.k = 1;
                                                                }
                                                                i16 = i12;
                                                                i31 = i34;
                                                                i32 = 0;
                                                            }
                                                        }
                                                        i12 = i13;
                                                        i16 = i12;
                                                        i31 = i34;
                                                        i32 = 0;
                                                    }
                                                    i12 = 1;
                                                    i16 = i12;
                                                    i31 = i34;
                                                    i32 = 0;
                                                }
                                            }
                                            i12 = i16;
                                            i16 = i12;
                                            i31 = i34;
                                            i32 = 0;
                                        }
                                        int i37 = i16;
                                        if ("}".equals(str4)) {
                                            arrayList3.add(obj);
                                        }
                                        i16 = i37;
                                        z11 = 0;
                                        i15 = -1;
                                        str2 = null;
                                    }
                                }
                            }
                            str = str2;
                            if (str == null) {
                            }
                        }
                    }
                    i16 = i11;
                    i14 = i10;
                    z10 = false;
                    i15 = -1;
                    iVar = this;
                }
            }
        } catch (C1586o0 e2) {
            throw new Exception(e2);
        }
    }
}
