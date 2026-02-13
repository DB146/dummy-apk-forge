package j5;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import e5.C1094c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n5.AbstractC1705a;
import n5.D;
import n5.v;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f18640a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f18641b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Map f18642c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f18643d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f18642c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f18643d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(String str, e eVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c10;
        int i7;
        int i10 = eVar.f18627b;
        int length = spannableStringBuilder.length();
        String str2 = eVar.f18626a;
        str2.getClass();
        int i11 = -1;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 98:
                if (str2.equals("b")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 99:
                if (str2.equals("c")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 105:
                if (str2.equals("i")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 117:
                if (str2.equals("u")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 118:
                if (str2.equals("v")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i10, length, 33);
                break;
            case 2:
                for (String str3 : eVar.f18629d) {
                    Map map = f18642c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i10, length, 33);
                    } else {
                        Map map2 = f18643d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i10, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                break;
            case 7:
                int c11 = c(list2, str, eVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, d.f18623c);
                int i12 = eVar.f18627b;
                int i13 = 0;
                int i14 = 0;
                while (i13 < arrayList.size()) {
                    if ("rt".equals(((d) arrayList.get(i13)).f18624a.f18626a)) {
                        d dVar = (d) arrayList.get(i13);
                        int c12 = c(list2, str, dVar.f18624a);
                        if (c12 == i11) {
                            c12 = c11 != i11 ? c11 : 1;
                        }
                        int i15 = dVar.f18624a.f18627b - i14;
                        int i16 = dVar.f18625b - i14;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i15, i16);
                        spannableStringBuilder.delete(i15, i16);
                        spannableStringBuilder.setSpan(new C1094c(subSequence.toString(), c12), i12, i15, 33);
                        i14 = subSequence.length() + i14;
                        i12 = i15;
                    }
                    i13++;
                    i11 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList b2 = b(list2, str, eVar);
        for (int i17 = 0; i17 < b2.size(); i17++) {
            C1379b c1379b = ((f) b2.get(i17)).f18631b;
            int i18 = c1379b.k;
            if (i18 == -1 && c1379b.f18615l == -1) {
                i7 = -1;
            } else {
                i7 = (c1379b.f18615l == 1 ? (char) 2 : (char) 0) | (i18 == 1 ? (char) 1 : (char) 0);
            }
            if (i7 != -1) {
                int i19 = c1379b.k;
                E6.b.b(spannableStringBuilder, new StyleSpan((i19 == -1 && c1379b.f18615l == -1) ? -1 : (i19 == 1 ? 1 : 0) | (c1379b.f18615l == 1 ? 2 : 0)), i10, length);
            }
            if (c1379b.j == 1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
            }
            if (c1379b.g) {
                if (!c1379b.g) {
                    throw new IllegalStateException("Font color not defined");
                }
                E6.b.b(spannableStringBuilder, new ForegroundColorSpan(c1379b.f18612f), i10, length);
            }
            if (c1379b.f18614i) {
                if (!c1379b.f18614i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                E6.b.b(spannableStringBuilder, new BackgroundColorSpan(c1379b.f18613h), i10, length);
            }
            if (c1379b.f18611e != null) {
                E6.b.b(spannableStringBuilder, new TypefaceSpan(c1379b.f18611e), i10, length);
            }
            int i20 = c1379b.f18616m;
            if (i20 == 1) {
                E6.b.b(spannableStringBuilder, new AbsoluteSizeSpan((int) c1379b.f18617n, true), i10, length);
            } else if (i20 == 2) {
                E6.b.b(spannableStringBuilder, new RelativeSizeSpan(c1379b.f18617n), i10, length);
            } else if (i20 == 3) {
                E6.b.b(spannableStringBuilder, new RelativeSizeSpan(c1379b.f18617n / 100.0f), i10, length);
            }
            if (c1379b.f18619p) {
                spannableStringBuilder.setSpan(new Object(), i10, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(List list, String str, e eVar) {
        int i7;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C1379b c1379b = (C1379b) list.get(i10);
            String str2 = eVar.f18626a;
            if (c1379b.f18607a.isEmpty() && c1379b.f18608b.isEmpty() && c1379b.f18609c.isEmpty() && c1379b.f18610d.isEmpty()) {
                i7 = TextUtils.isEmpty(str2);
            } else {
                int a9 = C1379b.a(C1379b.a(C1379b.a(0, 1073741824, c1379b.f18607a, str), 2, c1379b.f18608b, str2), 4, c1379b.f18610d, eVar.f18628c);
                if (a9 != -1) {
                    if (eVar.f18629d.containsAll(c1379b.f18609c)) {
                        i7 = a9 + (c1379b.f18609c.size() * 4);
                    }
                }
                i7 = 0;
            }
            if (i7 > 0) {
                arrayList.add(new f(i7, c1379b));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, e eVar) {
        ArrayList b2 = b(list, str, eVar);
        for (int i7 = 0; i7 < b2.size(); i7++) {
            int i10 = ((f) b2.get(i7)).f18631b.f18618o;
            if (i10 != -1) {
                return i10;
            }
        }
        return -1;
    }

    public static C1380c d(String str, Matcher matcher, v vVar, ArrayList arrayList) {
        g gVar = new g();
        try {
            String group = matcher.group(1);
            group.getClass();
            gVar.f18632a = j.c(group);
            String group2 = matcher.group(2);
            group2.getClass();
            gVar.f18633b = j.c(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, gVar);
            StringBuilder sb2 = new StringBuilder();
            vVar.getClass();
            String i7 = vVar.i(M6.e.f6799c);
            while (!TextUtils.isEmpty(i7)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(i7.trim());
                i7 = vVar.i(M6.e.f6799c);
            }
            gVar.f18634c = f(str, sb2.toString(), arrayList);
            return new C1380c(gVar.a().a(), gVar.f18632a, gVar.f18633b);
        } catch (NumberFormatException unused) {
            AbstractC1705a.S("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static void e(String str, g gVar) {
        char c10;
        int i7;
        char c11;
        int i10;
        int i11;
        Matcher matcher = f18641b.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                if ("line".equals(group)) {
                    g(group2, gVar);
                } else if ("align".equals(group)) {
                    switch (group2.hashCode()) {
                        case -1364013995:
                            if (group2.equals("center")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case -1074341483:
                            if (group2.equals("middle")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 100571:
                            if (group2.equals("end")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 3317767:
                            if (group2.equals("left")) {
                                c10 = 3;
                                break;
                            }
                            break;
                        case 108511772:
                            if (group2.equals("right")) {
                                c10 = 4;
                                break;
                            }
                            break;
                        case 109757538:
                            if (group2.equals("start")) {
                                c10 = 5;
                                break;
                            }
                            break;
                    }
                    c10 = 65535;
                    switch (c10) {
                        case 0:
                        case 1:
                            break;
                        case 2:
                            i7 = 3;
                            break;
                        case 3:
                            i7 = 4;
                            break;
                        case 4:
                            i7 = 5;
                            break;
                        case 5:
                            i7 = 1;
                            break;
                        default:
                            AbstractC1705a.S("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                            break;
                    }
                    i7 = 2;
                    gVar.f18635d = i7;
                } else if ("position".equals(group)) {
                    int indexOf = group2.indexOf(44);
                    if (indexOf != -1) {
                        String substring = group2.substring(indexOf + 1);
                        substring.getClass();
                        switch (substring.hashCode()) {
                            case -1842484672:
                                if (substring.equals("line-left")) {
                                    c11 = 0;
                                    break;
                                }
                                break;
                            case -1364013995:
                                if (substring.equals("center")) {
                                    c11 = 1;
                                    break;
                                }
                                break;
                            case -1276788989:
                                if (substring.equals("line-right")) {
                                    c11 = 2;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (substring.equals("middle")) {
                                    c11 = 3;
                                    break;
                                }
                                break;
                            case 100571:
                                if (substring.equals("end")) {
                                    c11 = 4;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (substring.equals("start")) {
                                    c11 = 5;
                                    break;
                                }
                                break;
                        }
                        c11 = 65535;
                        switch (c11) {
                            case 0:
                            case 5:
                                i10 = 0;
                                break;
                            case 1:
                            case 3:
                                i10 = 1;
                                break;
                            case 2:
                            case 4:
                                i10 = 2;
                                break;
                            default:
                                AbstractC1705a.S("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                                i10 = Integer.MIN_VALUE;
                                break;
                        }
                        gVar.f18639i = i10;
                        group2 = group2.substring(0, indexOf);
                    }
                    gVar.f18638h = j.b(group2);
                } else if ("size".equals(group)) {
                    gVar.j = j.b(group2);
                } else if ("vertical".equals(group)) {
                    if (group2.equals("lr")) {
                        i11 = 2;
                    } else if (group2.equals("rl")) {
                        i11 = 1;
                    } else {
                        AbstractC1705a.S("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                        i11 = Integer.MIN_VALUE;
                    }
                    gVar.k = i11;
                } else {
                    AbstractC1705a.S("WebvttCueParser", "Unknown cue setting " + group + ":" + group2);
                }
            } catch (NumberFormatException unused) {
                AbstractC1705a.S("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x00fb. Please report as an issue. */
    public static SpannedString f(String str, String str2, List list) {
        int i7;
        int i10;
        char c10;
        int i11;
        char c11;
        int i12 = -1;
        int i13 = 2;
        int i14 = 1;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        while (true) {
            String str3 = "";
            if (i15 >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (e) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new e("", 0, "", Collections.emptySet()), Collections.emptyList(), spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char charAt = str2.charAt(i15);
            if (charAt != '&') {
                if (charAt != '<') {
                    spannableStringBuilder.append(charAt);
                    i15 += i14;
                } else {
                    int i16 = i15 + 1;
                    if (i16 >= str2.length()) {
                        i15 = i16;
                    } else {
                        int i17 = str2.charAt(i16) == '/' ? i14 : 0;
                        int indexOf = str2.indexOf(62, i16);
                        int length = indexOf == i12 ? str2.length() : indexOf + i14;
                        int i18 = length - 2;
                        int i19 = str2.charAt(i18) == '/' ? i14 : 0;
                        int i20 = i15 + (i17 != 0 ? i13 : i14);
                        if (i19 == 0) {
                            i18 = length - 1;
                        }
                        String substring = str2.substring(i20, i18);
                        if (!substring.trim().isEmpty()) {
                            String trim = substring.trim();
                            AbstractC1705a.h(trim.isEmpty() ^ i14);
                            int i21 = D.f21141a;
                            String str4 = trim.split("[ \\.]", i13)[0];
                            str4.getClass();
                            switch (str4.hashCode()) {
                                case 98:
                                    if (str4.equals("b")) {
                                        i11 = 0;
                                        break;
                                    }
                                    break;
                                case 99:
                                    if (str4.equals("c")) {
                                        i11 = i14;
                                        break;
                                    }
                                    break;
                                case 105:
                                    if (str4.equals("i")) {
                                        i11 = i13;
                                        break;
                                    }
                                    break;
                                case 117:
                                    if (str4.equals("u")) {
                                        i11 = 3;
                                        break;
                                    }
                                    break;
                                case 118:
                                    if (str4.equals("v")) {
                                        i11 = 4;
                                        break;
                                    }
                                    break;
                                case 3650:
                                    if (str4.equals("rt")) {
                                        i11 = 5;
                                        break;
                                    }
                                    break;
                                case 3314158:
                                    if (str4.equals("lang")) {
                                        i11 = 6;
                                        break;
                                    }
                                    break;
                                case 3511770:
                                    if (str4.equals("ruby")) {
                                        i11 = 7;
                                        break;
                                    }
                                    break;
                            }
                            i11 = -1;
                            switch (i11) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                    if (i17 == 0) {
                                        if (i19 == 0) {
                                            int length2 = spannableStringBuilder.length();
                                            String trim2 = substring.trim();
                                            AbstractC1705a.h(trim2.isEmpty() ^ i14);
                                            int indexOf2 = trim2.indexOf(" ");
                                            if (indexOf2 == -1) {
                                                c11 = 0;
                                            } else {
                                                str3 = trim2.substring(indexOf2).trim();
                                                c11 = 0;
                                                trim2 = trim2.substring(0, indexOf2);
                                            }
                                            String[] split = trim2.split("\\.", -1);
                                            String str5 = split[c11];
                                            HashSet hashSet = new HashSet();
                                            for (int i22 = i14; i22 < split.length; i22 += i14) {
                                                hashSet.add(split[i22]);
                                            }
                                            arrayDeque.push(new e(str5, length2, str3, hashSet));
                                        }
                                        i15 = length;
                                        i10 = i14;
                                        i7 = -1;
                                        break;
                                    }
                                    while (!arrayDeque.isEmpty()) {
                                        e eVar = (e) arrayDeque.pop();
                                        a(str, eVar, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new d(eVar, spannableStringBuilder.length()));
                                        }
                                        if (eVar.f18626a.equals(str4)) {
                                            i15 = length;
                                            i10 = i14;
                                            i7 = -1;
                                        }
                                    }
                                    i15 = length;
                                    i10 = i14;
                                    i7 = -1;
                            }
                        }
                        i15 = length;
                        i12 = -1;
                    }
                }
                i10 = i14;
                i7 = i12;
            } else {
                i15 += i14;
                int indexOf3 = str2.indexOf(59, i15);
                int indexOf4 = str2.indexOf(32, i15);
                i7 = -1;
                if (indexOf3 == -1) {
                    indexOf3 = indexOf4;
                } else if (indexOf4 != -1) {
                    indexOf3 = Math.min(indexOf3, indexOf4);
                }
                if (indexOf3 != -1) {
                    String substring2 = str2.substring(i15, indexOf3);
                    substring2.getClass();
                    switch (substring2.hashCode()) {
                        case 3309:
                            if (substring2.equals("gt")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 3464:
                            if (substring2.equals("lt")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 96708:
                            if (substring2.equals("amp")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 3374865:
                            if (substring2.equals("nbsp")) {
                                c10 = 3;
                                break;
                            }
                            break;
                    }
                    c10 = 65535;
                    switch (c10) {
                        case 0:
                            spannableStringBuilder.append('>');
                            break;
                        case 1:
                            spannableStringBuilder.append('<');
                            break;
                        case 2:
                            spannableStringBuilder.append('&');
                            break;
                        case 3:
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            AbstractC1705a.S("WebvttCueParser", "ignoring unsupported entity: '&" + substring2 + ";'");
                            break;
                    }
                    if (indexOf3 == indexOf4) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i10 = 1;
                    i15 = indexOf3 + 1;
                } else {
                    i10 = 1;
                    spannableStringBuilder.append(charAt);
                }
            }
            i12 = i7;
            i13 = 2;
            i14 = i10;
        }
    }

    public static void g(String str, g gVar) {
        int i7 = 2;
        int indexOf = str.indexOf(44);
        char c10 = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.getClass();
            switch (substring.hashCode()) {
                case -1364013995:
                    if (substring.equals("center")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals("end")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals("start")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                    i7 = 1;
                    break;
                case 2:
                    break;
                case 3:
                    i7 = 0;
                    break;
                default:
                    AbstractC1705a.S("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i7 = Integer.MIN_VALUE;
                    break;
            }
            gVar.g = i7;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            gVar.f18636e = j.b(str);
            gVar.f18637f = 0;
        } else {
            gVar.f18636e = Integer.parseInt(str);
            gVar.f18637f = 1;
        }
    }
}
