package n5;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.kt.apps.core.utils.blurry.BlurFactor;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import m4.C1549C;
import m4.C1586o0;
import m4.x0;
import y7.u0;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static final int f21141a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f21142b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f21143c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f21144d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f21145e;

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f21146f;
    public static final Pattern g;

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f21147h;

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f21148i;
    public static HashMap j;
    public static final String[] k;

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f21149l;

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f21150m;

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f21151n;

    static {
        int i7 = Build.VERSION.SDK_INT;
        f21141a = i7;
        String str = Build.DEVICE;
        f21142b = str;
        String str2 = Build.MANUFACTURER;
        f21143c = str2;
        String str3 = Build.MODEL;
        f21144d = str3;
        f21145e = str + ", " + str3 + ", " + str2 + ", " + i7;
        f21146f = new byte[0];
        g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f21147h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f21148i = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        k = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f21149l = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f21150m = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f21151n = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, ModuleDescriptor.MODULE_VERSION, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static long A(long j10, float f4) {
        return f4 == 1.0f ? j10 : Math.round(j10 / f4);
    }

    public static String B(StringBuilder sb2, Formatter formatter, long j10) {
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        String str = j10 < 0 ? "-" : "";
        long abs = (Math.abs(j10) + 500) / 1000;
        long j11 = abs % 60;
        long j12 = (abs / 60) % 60;
        long j13 = abs / 3600;
        sb2.setLength(0);
        return j13 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j13), Long.valueOf(j12), Long.valueOf(j11)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j12), Long.valueOf(j11)).toString();
    }

    public static String[] C() {
        String[] strArr;
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i7 = f21141a;
        if (i7 >= 24) {
            strArr = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            Locale locale = configuration.locale;
            strArr = new String[]{i7 >= 21 ? locale.toLanguageTag() : locale.toString()};
        }
        for (int i10 = 0; i10 < strArr.length; i10++) {
            strArr[i10] = N(strArr[i10]);
        }
        return strArr;
    }

    public static String D(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            AbstractC1705a.u("Util", "Failed to read system property ".concat(str), e2);
            return null;
        }
    }

    public static String E(int i7) {
        switch (i7) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                return i7 >= 10000 ? A3.c.f(i7, "custom (", ")") : "?";
        }
    }

    public static boolean F(x0 x0Var) {
        if (x0Var != null) {
            C9.h hVar = (C9.h) x0Var;
            if (hVar.o(1)) {
                ((C1549C) hVar).q0(false);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean G(x0 x0Var) {
        C9.h hVar;
        boolean z8 = false;
        if (x0Var == null) {
            return false;
        }
        C1549C c1549c = (C1549C) x0Var;
        int d02 = c1549c.d0();
        if (d02 != 1 || !((C9.h) x0Var).o(2)) {
            if (d02 == 4) {
                C9.h hVar2 = (C9.h) x0Var;
                if (hVar2.o(4)) {
                    hVar2.y(((C1549C) hVar2).U(), -9223372036854775807L, false);
                }
            }
            hVar = (C9.h) x0Var;
            if (hVar.o(1)) {
                return z8;
            }
            ((C1549C) hVar).q0(true);
            return true;
        }
        c1549c.k0();
        z8 = true;
        hVar = (C9.h) x0Var;
        if (hVar.o(1)) {
        }
    }

    public static int H(Uri uri, String str) {
        int i7;
        char c10 = 65535;
        if (str != null) {
            switch (str.hashCode()) {
                case -979127466:
                    if (str.equals("application/x-mpegURL")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -156749520:
                    if (str.equals("application/vnd.ms-sstr+xml")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 64194685:
                    if (str.equals("application/dash+xml")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1154777587:
                    if (str.equals("application/x-rtsp")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    return 2;
                case 1:
                    return 1;
                case 2:
                    return 0;
                case 3:
                    return 3;
                default:
                    return 4;
            }
        }
        String scheme = uri.getScheme();
        if (scheme != null && u0.o("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            int lastIndexOf = lastPathSegment.lastIndexOf(46);
            if (lastIndexOf >= 0) {
                String N10 = u0.N(lastPathSegment.substring(lastIndexOf + 1));
                N10.getClass();
                switch (N10.hashCode()) {
                    case 104579:
                        if (N10.equals("ism")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case 108321:
                        if (N10.equals("mpd")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 3242057:
                        if (N10.equals("isml")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 3299913:
                        if (N10.equals("m3u8")) {
                            c10 = 3;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                    case 2:
                        i7 = 1;
                        break;
                    case 1:
                        i7 = 0;
                        break;
                    case 3:
                        i7 = 2;
                        break;
                    default:
                        i7 = 4;
                        break;
                }
                if (i7 != 4) {
                    return i7;
                }
            }
            String path = uri.getPath();
            path.getClass();
            Matcher matcher = f21148i.matcher(path);
            if (matcher.matches()) {
                String group = matcher.group(2);
                if (group == null) {
                    return 1;
                }
                if (group.contains("format=mpd-time-csf")) {
                    return 0;
                }
                return group.contains("format=m3u8-aapl") ? 2 : 1;
            }
        }
        return 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean I(v vVar, v vVar2, Inflater inflater) {
        if (vVar.a() <= 0) {
            return false;
        }
        if (vVar2.f21229a.length < vVar.a()) {
            vVar2.b(vVar.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(vVar.f21229a, vVar.f21230b, vVar.a());
        int i7 = 0;
        while (true) {
            try {
                byte[] bArr = vVar2.f21229a;
                i7 += inflater.inflate(bArr, i7, bArr.length - i7);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    byte[] bArr2 = vVar2.f21229a;
                    if (i7 == bArr2.length) {
                        vVar2.b(bArr2.length * 2);
                    }
                } else {
                    vVar2.F(i7);
                    inflater.reset();
                    return true;
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
    }

    public static boolean J(int i7) {
        return i7 == 3 || i7 == 2 || i7 == 268435456 || i7 == 536870912 || i7 == 805306368 || i7 == 4;
    }

    public static boolean K(int i7) {
        return i7 == 10 || i7 == 13;
    }

    public static boolean L(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static long M(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    public static String N(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String N10 = u0.N(str);
        int i7 = 0;
        String str2 = N10.split("-", 2)[0];
        if (j == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = k;
            HashMap hashMap = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i10 = 0; i10 < strArr.length; i10 += 2) {
                hashMap.put(strArr[i10], strArr[i10 + 1]);
            }
            j = hashMap;
        }
        String str4 = (String) j.get(str2);
        if (str4 != null) {
            StringBuilder m10 = X.c.m(str4);
            m10.append(N10.substring(str2.length()));
            N10 = m10.toString();
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return N10;
        }
        while (true) {
            String[] strArr2 = f21149l;
            if (i7 >= strArr2.length) {
                return N10;
            }
            if (N10.startsWith(strArr2[i7])) {
                return strArr2[i7 + 1] + N10.substring(strArr2[i7].length());
            }
            i7 += 2;
        }
    }

    public static Object[] O(int i7, Object[] objArr) {
        AbstractC1705a.h(i7 <= objArr.length);
        return Arrays.copyOf(objArr, i7);
    }

    public static long P(String str) {
        Matcher matcher = g.matcher(str);
        if (!matcher.matches()) {
            throw C1586o0.a("Invalid date/time format: " + str, null);
        }
        int i7 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i7 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
            if ("-".equals(matcher.group(11))) {
                i7 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i7 != 0 ? timeInMillis - (i7 * 60000) : timeInMillis;
    }

    public static void Q(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static void R(ArrayList arrayList, int i7, int i10) {
        if (i7 < 0 || i10 > arrayList.size() || i7 > i10) {
            throw new IllegalArgumentException();
        }
        if (i7 != i10) {
            arrayList.subList(i7, i10).clear();
        }
    }

    public static long S(int i7, long j10) {
        return (j10 * 1000000) / i7;
    }

    public static long T(long j10, long j11, long j12) {
        if (j12 >= j11 && j12 % j11 == 0) {
            return j10 / (j12 / j11);
        }
        if (j12 < j11 && j11 % j12 == 0) {
            return (j11 / j12) * j10;
        }
        return (long) (j10 * (j11 / j12));
    }

    public static void U(long[] jArr, long j10) {
        int i7 = 0;
        if (j10 >= 1000000 && j10 % 1000000 == 0) {
            long j11 = j10 / 1000000;
            while (i7 < jArr.length) {
                jArr[i7] = jArr[i7] / j11;
                i7++;
            }
            return;
        }
        if (j10 >= 1000000 || 1000000 % j10 != 0) {
            double d10 = 1000000 / j10;
            while (i7 < jArr.length) {
                jArr[i7] = (long) (jArr[i7] * d10);
                i7++;
            }
            return;
        }
        long j12 = 1000000 / j10;
        while (i7 < jArr.length) {
            jArr[i7] = jArr[i7] * j12;
            i7++;
        }
    }

    public static boolean V(x0 x0Var) {
        if (x0Var == null) {
            return true;
        }
        C1549C c1549c = (C1549C) x0Var;
        return !c1549c.c0() || c1549c.d0() == 1 || c1549c.d0() == 4;
    }

    public static String[] W(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] X(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
    }

    public static String Y(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i7 = 0; i7 < bArr.length; i7++) {
            sb2.append(Character.forDigit((bArr[i7] >> 4) & 15, 16));
            sb2.append(Character.forDigit(bArr[i7] & 15, 16));
        }
        return sb2.toString();
    }

    public static long Z(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int b(long[] jArr, long j10, boolean z8) {
        int i7;
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i7 = binarySearch + 1;
            if (i7 >= jArr.length || jArr[i7] != j10) {
                break;
            }
            binarySearch = i7;
        }
        return z8 ? binarySearch : i7;
    }

    public static int c(List list, Long l10, boolean z8) {
        int i7;
        int binarySearch = Collections.binarySearch(list, l10);
        if (binarySearch < 0) {
            i7 = -(binarySearch + 2);
        } else {
            while (true) {
                int i10 = binarySearch - 1;
                if (i10 < 0 || ((Comparable) list.get(i10)).compareTo(l10) != 0) {
                    break;
                }
                binarySearch = i10;
            }
            i7 = binarySearch;
        }
        return z8 ? Math.max(0, i7) : i7;
    }

    public static int d(int[] iArr, int i7, boolean z8, boolean z10) {
        int i10;
        int i11;
        int binarySearch = Arrays.binarySearch(iArr, i7);
        if (binarySearch < 0) {
            i11 = -(binarySearch + 2);
        } else {
            while (true) {
                i10 = binarySearch - 1;
                if (i10 < 0 || iArr[i10] != i7) {
                    break;
                }
                binarySearch = i10;
            }
            i11 = z8 ? binarySearch : i10;
        }
        return z10 ? Math.max(0, i11) : i11;
    }

    public static int e(long[] jArr, long j10, boolean z8) {
        int i7;
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            i7 = -(binarySearch + 2);
        } else {
            while (true) {
                int i10 = binarySearch - 1;
                if (i10 < 0 || jArr[i10] != j10) {
                    break;
                }
                binarySearch = i10;
            }
            i7 = binarySearch;
        }
        return z8 ? Math.max(0, i7) : i7;
    }

    public static int f(int i7, int i10) {
        return ((i7 + i10) - 1) / i10;
    }

    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static float h(float f4, float f10, float f11) {
        return Math.max(f10, Math.min(f4, f11));
    }

    public static int i(int i7, int i10, int i11) {
        return Math.max(i10, Math.min(i7, i11));
    }

    public static long j(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    public static boolean k(Object[] objArr, Comparable comparable) {
        for (Object obj : objArr) {
            if (a(obj, comparable)) {
                return true;
            }
        }
        return false;
    }

    public static int l(int i7, byte[] bArr, int i10, int i11) {
        while (i7 < i10) {
            i11 = f21150m[((i11 >>> 24) ^ (bArr[i7] & 255)) & 255] ^ (i11 << 8);
            i7++;
        }
        return i11;
    }

    public static Handler m(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        AbstractC1705a.n(myLooper);
        return new Handler(myLooper, callback);
    }

    public static String n(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String o(byte[] bArr) {
        return new String(bArr, M6.e.f6799c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int p(int i7) {
        switch (i7) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return 6396;
            case 9:
            case com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor.MODULE_VERSION /* 11 */:
            default:
                return 0;
            case 10:
                if (f21141a >= 32) {
                    return 737532;
                }
                break;
            case 12:
                return 743676;
        }
    }

    public static byte[] q(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i7 = 0; i7 < length; i7++) {
            int i10 = i7 * 2;
            bArr[i7] = (byte) (Character.digit(str.charAt(i10 + 1), 16) + (Character.digit(str.charAt(i10), 16) << 4));
        }
        return bArr;
    }

    public static int r(int i7, String str) {
        int i10 = 0;
        for (String str2 : X(str)) {
            if (i7 == o.h(o.d(str2))) {
                i10++;
            }
        }
        return i10;
    }

    public static String s(int i7, String str) {
        String[] X10 = X(str);
        if (X10.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : X10) {
            if (i7 == o.h(o.d(str2))) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    public static Drawable t(Context context, Resources resources, int i7) {
        return f21141a >= 21 ? C.a(context, resources, i7) : resources.getDrawable(i7);
    }

    public static int u(int i7) {
        if (i7 == 2 || i7 == 4) {
            return 6005;
        }
        if (i7 == 10) {
            return 6004;
        }
        if (i7 == 7) {
            return 6005;
        }
        if (i7 == 8) {
            return 6003;
        }
        switch (i7) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i7) {
                    case 24:
                    case BlurFactor.DEFAULT_RADIUS /* 25 */:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static int v(String str) {
        String[] split;
        int length;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        boolean z8 = length >= 3 && "neg".equals(split[length - 2]);
        try {
            str2.getClass();
            int parseInt = Integer.parseInt(str2);
            return z8 ? -parseInt : parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static long w(long j10, float f4) {
        return f4 == 1.0f ? j10 : Math.round(j10 * f4);
    }

    public static long x(long j10) {
        return j10 == -9223372036854775807L ? System.currentTimeMillis() : j10 + SystemClock.elapsedRealtime();
    }

    public static int y(int i7) {
        if (i7 == 8) {
            return 3;
        }
        if (i7 == 16) {
            return 2;
        }
        if (i7 != 24) {
            return i7 != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    public static int z(int i7, int i10) {
        if (i7 != 2) {
            if (i7 == 3) {
                return i10;
            }
            if (i7 != 4) {
                if (i7 != 268435456) {
                    if (i7 == 536870912) {
                        return i10 * 3;
                    }
                    if (i7 != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i10 * 4;
        }
        return i10 * 2;
    }
}
