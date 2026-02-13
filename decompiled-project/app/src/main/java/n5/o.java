package n5;

import H2.O;
import android.text.TextUtils;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import y7.u0;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f21193a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f21194b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : D.X(str)) {
            String d10 = d(str2);
            if (d10 != null && j(d10)) {
                return d10;
            }
        }
        return null;
    }

    public static String b(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] X10 = D.X(str);
        StringBuilder sb2 = new StringBuilder();
        for (String str3 : X10) {
            if (str2.equals(d(str3))) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str3);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    public static int c(String str, String str2) {
        O f4;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1365340241:
                if (str.equals("audio/vnd.dts.hd;profile=lbr")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c10 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c10 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 4;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c10 = 5;
                    break;
                }
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c10 = 11;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 18;
            case 1:
                return 8;
            case 2:
                return 7;
            case 3:
                if (str2 == null || (f4 = f(str2)) == null) {
                    return 0;
                }
                return f4.a();
            case 4:
                return 5;
            case 5:
                return 17;
            case 6:
                return 30;
            case 7:
                return 6;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return 9;
            case '\t':
                return 20;
            case '\n':
                return 8;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return 14;
            default:
                return 0;
        }
    }

    public static String d(String str) {
        O f4;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String N10 = u0.N(str.trim());
        if (N10.startsWith("avc1") || N10.startsWith("avc3")) {
            return "video/avc";
        }
        if (N10.startsWith("hev1") || N10.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (N10.startsWith("dvav") || N10.startsWith("dva1") || N10.startsWith("dvhe") || N10.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (N10.startsWith("av01")) {
            return "video/av01";
        }
        if (N10.startsWith("vp9") || N10.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (N10.startsWith("vp8") || N10.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (N10.startsWith("mp4a")) {
            if (N10.startsWith("mp4a.") && (f4 = f(N10)) != null) {
                str2 = e(f4.f4603b);
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        }
        if (N10.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (N10.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (N10.startsWith("ac-3") || N10.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (N10.startsWith("ec-3") || N10.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (N10.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (N10.startsWith("ac-4") || N10.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (N10.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (N10.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (N10.startsWith("dtsh") || N10.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (N10.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (N10.startsWith("opus")) {
            return "audio/opus";
        }
        if (N10.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (N10.startsWith("flac")) {
            return "audio/flac";
        }
        if (N10.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (N10.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (N10.contains("cea708")) {
            return "application/cea-708";
        }
        if (N10.contains("eia608") || N10.contains("cea608")) {
            return "application/cea-608";
        }
        ArrayList arrayList = f21193a;
        if (arrayList.size() <= 0) {
            return null;
        }
        throw h3.o.i(0, arrayList);
    }

    public static String e(int i7) {
        if (i7 == 32) {
            return "video/mp4v-es";
        }
        if (i7 == 33) {
            return "video/avc";
        }
        if (i7 == 35) {
            return "video/hevc";
        }
        if (i7 == 64) {
            return "audio/mp4a-latm";
        }
        if (i7 == 163) {
            return "video/wvc1";
        }
        if (i7 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i7 == 165) {
            return "audio/ac3";
        }
        if (i7 == 166) {
            return "audio/eac3";
        }
        switch (i7) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i7) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static O f(String str) {
        Matcher matcher = f21194b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            return new O(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0, 8);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String g(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int h(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (j(str)) {
            return 1;
        }
        if (l(str)) {
            return 2;
        }
        if (k(str)) {
            return 3;
        }
        if ("image".equals(g(str))) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f21193a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        throw h3.o.i(0, arrayList);
    }

    public static String i(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : D.X(str)) {
            String d10 = d(str2);
            if (d10 != null && l(d10)) {
                return d10;
            }
        }
        return null;
    }

    public static boolean j(String str) {
        return "audio".equals(g(str));
    }

    public static boolean k(String str) {
        return "text".equals(g(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean l(String str) {
        return "video".equals(g(str));
    }
}
