package E4;

import B0.M;
import N6.H;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.utils.blurry.BlurFactor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m4.L;
import n5.AbstractC1705a;
import n5.D;
import o5.C1807b;
import y7.u0;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f3667a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f3668b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static int f3669c = -1;

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (D.f21141a < 26 && D.f21142b.equals("R9") && arrayList.size() == 1 && ((m) arrayList.get(0)).f3581a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(m.h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, false));
            }
            Collections.sort(arrayList, new M(new r(1), 1));
        }
        int i7 = D.f21141a;
        if (i7 < 21 && arrayList.size() > 1) {
            String str2 = ((m) arrayList.get(0)).f3581a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new M(new r(2), 1));
            }
        }
        if (i7 >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((m) arrayList.get(0)).f3581a)) {
            return;
        }
        arrayList.add((m) arrayList.remove(0));
    }

    public static String b(L l10) {
        Pair d10;
        if ("audio/eac3-joc".equals(l10.f20096z)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(l10.f20096z) || (d10 = d(l10)) == null) {
            return null;
        }
        int intValue = ((Integer) d10.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0363 A[Catch: NumberFormatException -> 0x0374, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0374, blocks: (B:201:0x031a, B:203:0x032c, B:215:0x034a, B:218:0x0363), top: B:200:0x031a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:222:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x065a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair d(L l10) {
        char c10;
        int i7;
        int i10;
        int i11;
        int parseInt;
        int parseInt2;
        int i12;
        int i13;
        int i14;
        char c11;
        char c12;
        Integer num;
        int i15;
        int i16;
        char c13;
        Integer num2;
        char c14;
        Integer num3;
        Pattern pattern = f3667a;
        int i17 = 16;
        int i18 = 2;
        String str = l10.f20093w;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        boolean equals = "video/dolby-vision".equals(l10.f20096z);
        String str2 = l10.f20093w;
        if (!equals) {
            String str3 = split[0];
            str3.getClass();
            switch (str3.hashCode()) {
                case 3004662:
                    if (str3.equals("av01")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3006243:
                    if (str3.equals("avc1")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3006244:
                    if (str3.equals("avc2")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3199032:
                    if (str3.equals("hev1")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3214780:
                    if (str3.equals("hvc1")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3356560:
                    if (str3.equals("mp4a")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3624515:
                    if (str3.equals("vp09")) {
                        c10 = 6;
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
                    if (split.length < 4) {
                        A3.c.q("Ignoring malformed AV1 codec string: ", str2, "MediaCodecUtil");
                        return null;
                    }
                    try {
                        int parseInt3 = Integer.parseInt(split[1]);
                        int parseInt4 = Integer.parseInt(split[2].substring(0, 2));
                        int parseInt5 = Integer.parseInt(split[3]);
                        if (parseInt3 != 0) {
                            h3.o.u(parseInt3, "Unknown AV1 profile: ", "MediaCodecUtil");
                            return null;
                        }
                        if (parseInt5 != 8 && parseInt5 != 10) {
                            h3.o.u(parseInt5, "Unknown AV1 bit depth: ", "MediaCodecUtil");
                            return null;
                        }
                        if (parseInt5 == 8) {
                            i7 = 1;
                        } else {
                            C1807b c1807b = l10.L;
                            i7 = (c1807b == null || !(c1807b.f21944d != null || (i10 = c1807b.f21943c) == 7 || i10 == 6)) ? 2 : 4096;
                        }
                        switch (parseInt4) {
                            case 0:
                                i17 = 1;
                                i11 = -1;
                                break;
                            case 1:
                                i17 = 2;
                                i11 = -1;
                                break;
                            case 2:
                                i17 = 4;
                                i11 = -1;
                                break;
                            case 3:
                                i17 = 8;
                                i11 = -1;
                                break;
                            case 4:
                                i11 = -1;
                                break;
                            case 5:
                                i17 = 32;
                                i11 = -1;
                                break;
                            case 6:
                                i17 = 64;
                                i11 = -1;
                                break;
                            case 7:
                                i17 = 128;
                                i11 = -1;
                                break;
                            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                                i17 = 256;
                                i11 = -1;
                                break;
                            case 9:
                                i17 = 512;
                                i11 = -1;
                                break;
                            case 10:
                                i17 = 1024;
                                i11 = -1;
                                break;
                            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                                i17 = 2048;
                                i11 = -1;
                                break;
                            case 12:
                                i17 = 4096;
                                i11 = -1;
                                break;
                            case 13:
                                i11 = -1;
                                i17 = 8192;
                                break;
                            case 14:
                                i11 = -1;
                                i17 = 16384;
                                break;
                            case 15:
                                i17 = 32768;
                                i11 = -1;
                                break;
                            case 16:
                                i11 = -1;
                                i17 = 65536;
                                break;
                            case 17:
                                i17 = 131072;
                                i11 = -1;
                                break;
                            case 18:
                                i17 = 262144;
                                i11 = -1;
                                break;
                            case 19:
                                i17 = 524288;
                                i11 = -1;
                                break;
                            case 20:
                                i17 = 1048576;
                                i11 = -1;
                                break;
                            case 21:
                                i17 = 2097152;
                                i11 = -1;
                                break;
                            case 22:
                                i17 = 4194304;
                                i11 = -1;
                                break;
                            case 23:
                                i17 = 8388608;
                                i11 = -1;
                                break;
                            default:
                                i11 = -1;
                                i17 = -1;
                                break;
                        }
                        if (i17 != i11) {
                            return new Pair(Integer.valueOf(i7), Integer.valueOf(i17));
                        }
                        h3.o.u(parseInt4, "Unknown AV1 level: ", "MediaCodecUtil");
                        return null;
                    } catch (NumberFormatException unused) {
                        A3.c.q("Ignoring malformed AV1 codec string: ", str2, "MediaCodecUtil");
                        return null;
                    }
                case 1:
                case 2:
                    if (split.length < 2) {
                        A3.c.q("Ignoring malformed AVC codec string: ", str2, "MediaCodecUtil");
                        return null;
                    }
                    try {
                        if (split[1].length() == 6) {
                            parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                            parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                        } else {
                            if (split.length < 3) {
                                AbstractC1705a.S("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str2);
                                return null;
                            }
                            parseInt = Integer.parseInt(split[1]);
                            parseInt2 = Integer.parseInt(split[2]);
                        }
                        if (parseInt == 66) {
                            i18 = 1;
                        } else if (parseInt != 77) {
                            if (parseInt == 88) {
                                i18 = 4;
                            } else if (parseInt == 100) {
                                i18 = 8;
                            } else if (parseInt == 110) {
                                i18 = 16;
                            } else if (parseInt == 122) {
                                i18 = 32;
                            } else {
                                if (parseInt != 244) {
                                    i12 = -1;
                                    i18 = -1;
                                    if (i18 != i12) {
                                        h3.o.u(parseInt, "Unknown AVC profile: ", "MediaCodecUtil");
                                        return null;
                                    }
                                    switch (parseInt2) {
                                        case 10:
                                            i17 = 1;
                                            i13 = -1;
                                            break;
                                        case ModuleDescriptor.MODULE_VERSION /* 11 */:
                                            i17 = 4;
                                            i13 = -1;
                                            break;
                                        case 12:
                                            i17 = 8;
                                            i13 = -1;
                                            break;
                                        case 13:
                                            i13 = -1;
                                            break;
                                        default:
                                            switch (parseInt2) {
                                                case 20:
                                                    i17 = 32;
                                                    i13 = -1;
                                                    break;
                                                case 21:
                                                    i17 = 64;
                                                    i13 = -1;
                                                    break;
                                                case 22:
                                                    i17 = 128;
                                                    i13 = -1;
                                                    break;
                                                default:
                                                    switch (parseInt2) {
                                                        case 30:
                                                            i17 = 256;
                                                            i13 = -1;
                                                            break;
                                                        case 31:
                                                            i17 = 512;
                                                            i13 = -1;
                                                            break;
                                                        case 32:
                                                            i17 = 1024;
                                                            i13 = -1;
                                                            break;
                                                        default:
                                                            switch (parseInt2) {
                                                                case 40:
                                                                    i17 = 2048;
                                                                    i13 = -1;
                                                                    break;
                                                                case 41:
                                                                    i17 = 4096;
                                                                    i13 = -1;
                                                                    break;
                                                                case 42:
                                                                    i17 = 8192;
                                                                    i13 = -1;
                                                                    break;
                                                                default:
                                                                    switch (parseInt2) {
                                                                        case 50:
                                                                            i17 = 16384;
                                                                            i13 = -1;
                                                                            break;
                                                                        case 51:
                                                                            i17 = 32768;
                                                                            i13 = -1;
                                                                            break;
                                                                        case 52:
                                                                            i13 = -1;
                                                                            i17 = 65536;
                                                                            break;
                                                                        default:
                                                                            i13 = -1;
                                                                            i17 = -1;
                                                                            break;
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                                    if (i17 != i13) {
                                        return new Pair(Integer.valueOf(i18), Integer.valueOf(i17));
                                    }
                                    h3.o.u(parseInt2, "Unknown AVC level: ", "MediaCodecUtil");
                                    return null;
                                }
                                i18 = 64;
                            }
                        }
                        i12 = -1;
                        if (i18 != i12) {
                        }
                    } catch (NumberFormatException unused2) {
                        A3.c.q("Ignoring malformed AVC codec string: ", str2, "MediaCodecUtil");
                        return null;
                    }
                case 3:
                case 4:
                    if (split.length < 4) {
                        A3.c.q("Ignoring malformed HEVC codec string: ", str2, "MediaCodecUtil");
                        return null;
                    }
                    Matcher matcher = pattern.matcher(split[1]);
                    if (!matcher.matches()) {
                        A3.c.q("Ignoring malformed HEVC codec string: ", str2, "MediaCodecUtil");
                        return null;
                    }
                    String group = matcher.group(1);
                    if ("1".equals(group)) {
                        i14 = 1;
                    } else {
                        if (!"2".equals(group)) {
                            A3.c.q("Unknown HEVC profile string: ", group, "MediaCodecUtil");
                            return null;
                        }
                        C1807b c1807b2 = l10.L;
                        i14 = (c1807b2 == null || c1807b2.f21943c != 6) ? 2 : 4096;
                    }
                    String str4 = split[3];
                    if (str4 != null) {
                        switch (str4.hashCode()) {
                            case 70821:
                                if (str4.equals("H30")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 70914:
                                if (str4.equals("H60")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 70917:
                                if (str4.equals("H63")) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 71007:
                                if (str4.equals("H90")) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 71010:
                                if (str4.equals("H93")) {
                                    c11 = 4;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 74665:
                                if (str4.equals("L30")) {
                                    c11 = 5;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 74758:
                                if (str4.equals("L60")) {
                                    c11 = 6;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 74761:
                                if (str4.equals("L63")) {
                                    c11 = 7;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 74851:
                                if (str4.equals("L90")) {
                                    c11 = '\b';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 74854:
                                if (str4.equals("L93")) {
                                    c11 = '\t';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2193639:
                                if (str4.equals("H120")) {
                                    c11 = '\n';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2193642:
                                if (str4.equals("H123")) {
                                    c11 = 11;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2193732:
                                if (str4.equals("H150")) {
                                    c12 = '\f';
                                    c11 = c12;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2193735:
                                if (str4.equals("H153")) {
                                    c12 = '\r';
                                    c11 = c12;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2193738:
                                if (str4.equals("H156")) {
                                    c12 = 14;
                                    c11 = c12;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2193825:
                                if (str4.equals("H180")) {
                                    c12 = 15;
                                    c11 = c12;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2193828:
                                if (str4.equals("H183")) {
                                    c11 = 16;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2193831:
                                if (str4.equals("H186")) {
                                    c12 = 17;
                                    c11 = c12;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2312803:
                                if (str4.equals("L120")) {
                                    c12 = 18;
                                    c11 = c12;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2312806:
                                if (str4.equals("L123")) {
                                    c12 = 19;
                                    c11 = c12;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2312896:
                                if (str4.equals("L150")) {
                                    c11 = 20;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2312899:
                                if (str4.equals("L153")) {
                                    c12 = 21;
                                    c11 = c12;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2312902:
                                if (str4.equals("L156")) {
                                    c12 = 22;
                                    c11 = c12;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2312989:
                                if (str4.equals("L180")) {
                                    c12 = 23;
                                    c11 = c12;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2312992:
                                if (str4.equals("L183")) {
                                    c12 = 24;
                                    c11 = c12;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2312995:
                                if (str4.equals("L186")) {
                                    c12 = 25;
                                    c11 = c12;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        switch (c11) {
                            case 0:
                                num = 2;
                                break;
                            case 1:
                                num = 8;
                                break;
                            case 2:
                                num = 32;
                                break;
                            case 3:
                                num = 128;
                                break;
                            case 4:
                                num = 512;
                                break;
                            case 5:
                                num = 1;
                                break;
                            case 6:
                                num = 4;
                                break;
                            case 7:
                                num = 16;
                                break;
                            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                                num = 64;
                                break;
                            case '\t':
                                num = 256;
                                break;
                            case '\n':
                                num = 2048;
                                break;
                            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                                num = 8192;
                                break;
                            case '\f':
                                num = 32768;
                                break;
                            case '\r':
                                num = 131072;
                                break;
                            case 14:
                                num = 524288;
                                break;
                            case 15:
                                num = 2097152;
                                break;
                            case 16:
                                num = 8388608;
                                break;
                            case 17:
                                num = 33554432;
                                break;
                            case 18:
                                num = 1024;
                                break;
                            case 19:
                                num = 4096;
                                break;
                            case 20:
                                num = 16384;
                                break;
                            case 21:
                                num = 65536;
                                break;
                            case 22:
                                num = 262144;
                                break;
                            case 23:
                                num = 1048576;
                                break;
                            case 24:
                                num = 4194304;
                                break;
                            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                                num = 16777216;
                                break;
                        }
                        if (num == null) {
                            return new Pair(Integer.valueOf(i14), num);
                        }
                        A3.c.q("Unknown HEVC level string: ", str4, "MediaCodecUtil");
                        return null;
                    }
                    num = null;
                    if (num == null) {
                    }
                    break;
                case 5:
                    if (split.length != 3) {
                        A3.c.q("Ignoring malformed MP4A codec string: ", str2, "MediaCodecUtil");
                        return null;
                    }
                    try {
                        if (!"audio/mp4a-latm".equals(n5.o.e(Integer.parseInt(split[1], 16)))) {
                            return null;
                        }
                        int parseInt6 = Integer.parseInt(split[2]);
                        int i19 = 17;
                        if (parseInt6 != 17) {
                            if (parseInt6 != 20) {
                                i19 = 23;
                                if (parseInt6 != 23) {
                                    i19 = 29;
                                    if (parseInt6 != 29) {
                                        i19 = 39;
                                        if (parseInt6 != 39) {
                                            i19 = 42;
                                            if (parseInt6 != 42) {
                                                switch (parseInt6) {
                                                    case 1:
                                                        i18 = 1;
                                                        break;
                                                    case 2:
                                                        break;
                                                    case 3:
                                                        i18 = 3;
                                                        break;
                                                    case 4:
                                                        i18 = 4;
                                                        break;
                                                    case 5:
                                                        i18 = 5;
                                                        break;
                                                    case 6:
                                                        i15 = -1;
                                                        i18 = 6;
                                                        break;
                                                    default:
                                                        i15 = -1;
                                                        i18 = -1;
                                                        break;
                                                }
                                                if (i18 != i15) {
                                                    return new Pair(Integer.valueOf(i18), 0);
                                                }
                                                return null;
                                            }
                                        }
                                    }
                                }
                            } else {
                                i18 = 20;
                            }
                            i15 = -1;
                            if (i18 != i15) {
                            }
                        }
                        i18 = i19;
                        i15 = -1;
                        if (i18 != i15) {
                        }
                    } catch (NumberFormatException unused3) {
                        A3.c.q("Ignoring malformed MP4A codec string: ", str2, "MediaCodecUtil");
                        return null;
                    }
                case 6:
                    if (split.length < 3) {
                        A3.c.q("Ignoring malformed VP9 codec string: ", str2, "MediaCodecUtil");
                        return null;
                    }
                    try {
                        int parseInt7 = Integer.parseInt(split[1]);
                        int parseInt8 = Integer.parseInt(split[2]);
                        int i20 = parseInt7 != 0 ? parseInt7 != 1 ? parseInt7 != 2 ? parseInt7 != 3 ? -1 : 8 : 4 : 2 : 1;
                        if (i20 == -1) {
                            h3.o.u(parseInt7, "Unknown VP9 profile: ", "MediaCodecUtil");
                            return null;
                        }
                        if (parseInt8 == 10) {
                            i17 = 1;
                        } else if (parseInt8 == 11) {
                            i17 = 2;
                        } else if (parseInt8 == 20) {
                            i17 = 4;
                        } else if (parseInt8 == 21) {
                            i17 = 8;
                        } else if (parseInt8 != 30) {
                            if (parseInt8 == 31) {
                                i17 = 32;
                            } else if (parseInt8 == 40) {
                                i17 = 64;
                            } else if (parseInt8 == 41) {
                                i17 = 128;
                            } else if (parseInt8 == 50) {
                                i17 = 256;
                            } else {
                                if (parseInt8 != 51) {
                                    switch (parseInt8) {
                                        case 60:
                                            i17 = 2048;
                                            break;
                                        case 61:
                                            i17 = 4096;
                                            break;
                                        case 62:
                                            i17 = 8192;
                                            break;
                                        default:
                                            i16 = -1;
                                            i17 = -1;
                                            break;
                                    }
                                    if (i17 == i16) {
                                        return new Pair(Integer.valueOf(i20), Integer.valueOf(i17));
                                    }
                                    h3.o.u(parseInt8, "Unknown VP9 level: ", "MediaCodecUtil");
                                    return null;
                                }
                                i17 = 512;
                            }
                        }
                        i16 = -1;
                        if (i17 == i16) {
                        }
                    } catch (NumberFormatException unused4) {
                        A3.c.q("Ignoring malformed VP9 codec string: ", str2, "MediaCodecUtil");
                        return null;
                    }
                default:
                    return null;
            }
        } else {
            if (split.length < 3) {
                A3.c.q("Ignoring malformed Dolby Vision codec string: ", str2, "MediaCodecUtil");
                return null;
            }
            Matcher matcher2 = pattern.matcher(split[1]);
            if (!matcher2.matches()) {
                A3.c.q("Ignoring malformed Dolby Vision codec string: ", str2, "MediaCodecUtil");
                return null;
            }
            String group2 = matcher2.group(1);
            if (group2 != null) {
                switch (group2.hashCode()) {
                    case 1536:
                        if (group2.equals("00")) {
                            c13 = 0;
                            break;
                        }
                        c13 = 65535;
                        break;
                    case 1537:
                        if (group2.equals("01")) {
                            c13 = 1;
                            break;
                        }
                        c13 = 65535;
                        break;
                    case 1538:
                        if (group2.equals("02")) {
                            c13 = 2;
                            break;
                        }
                        c13 = 65535;
                        break;
                    case 1539:
                        if (group2.equals("03")) {
                            c13 = 3;
                            break;
                        }
                        c13 = 65535;
                        break;
                    case 1540:
                        if (group2.equals("04")) {
                            c13 = 4;
                            break;
                        }
                        c13 = 65535;
                        break;
                    case 1541:
                        if (group2.equals("05")) {
                            c13 = 5;
                            break;
                        }
                        c13 = 65535;
                        break;
                    case 1542:
                        if (group2.equals("06")) {
                            c13 = 6;
                            break;
                        }
                        c13 = 65535;
                        break;
                    case 1543:
                        if (group2.equals("07")) {
                            c13 = 7;
                            break;
                        }
                        c13 = 65535;
                        break;
                    case 1544:
                        if (group2.equals("08")) {
                            c13 = '\b';
                            break;
                        }
                        c13 = 65535;
                        break;
                    case 1545:
                        if (group2.equals("09")) {
                            c13 = '\t';
                            break;
                        }
                        c13 = 65535;
                        break;
                    default:
                        c13 = 65535;
                        break;
                }
                switch (c13) {
                    case 0:
                        num2 = 1;
                        break;
                    case 1:
                        num2 = 2;
                        break;
                    case 2:
                        num2 = 4;
                        break;
                    case 3:
                        num2 = 8;
                        break;
                    case 4:
                        num2 = 16;
                        break;
                    case 5:
                        num2 = 32;
                        break;
                    case 6:
                        num2 = 64;
                        break;
                    case 7:
                        num2 = 128;
                        break;
                    case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                        num2 = 256;
                        break;
                    case '\t':
                        num2 = 512;
                        break;
                }
                if (num2 != null) {
                    A3.c.q("Unknown Dolby Vision profile string: ", group2, "MediaCodecUtil");
                    return null;
                }
                String str5 = split[2];
                if (str5 != null) {
                    switch (str5.hashCode()) {
                        case 1537:
                            if (str5.equals("01")) {
                                c14 = 0;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case 1538:
                            if (str5.equals("02")) {
                                c14 = 1;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case 1539:
                            if (str5.equals("03")) {
                                c14 = 2;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case 1540:
                            if (str5.equals("04")) {
                                c14 = 3;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case 1541:
                            if (str5.equals("05")) {
                                c14 = 4;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case 1542:
                            if (str5.equals("06")) {
                                c14 = 5;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case 1543:
                            if (str5.equals("07")) {
                                c14 = 6;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case 1544:
                            if (str5.equals("08")) {
                                c14 = 7;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case 1545:
                            if (str5.equals("09")) {
                                c14 = '\b';
                                break;
                            }
                            c14 = 65535;
                            break;
                        case 1567:
                            if (str5.equals("10")) {
                                c14 = '\t';
                                break;
                            }
                            c14 = 65535;
                            break;
                        case 1568:
                            if (str5.equals("11")) {
                                c14 = '\n';
                                break;
                            }
                            c14 = 65535;
                            break;
                        case 1569:
                            if (str5.equals("12")) {
                                c14 = 11;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case 1570:
                            if (str5.equals("13")) {
                                c14 = '\f';
                                break;
                            }
                            c14 = 65535;
                            break;
                        default:
                            c14 = 65535;
                            break;
                    }
                    switch (c14) {
                        case 0:
                            num3 = 1;
                            break;
                        case 1:
                            num3 = 2;
                            break;
                        case 2:
                            num3 = 4;
                            break;
                        case 3:
                            num3 = 8;
                            break;
                        case 4:
                            num3 = 16;
                            break;
                        case 5:
                            num3 = 32;
                            break;
                        case 6:
                            num3 = 64;
                            break;
                        case 7:
                            num3 = 128;
                            break;
                        case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                            num3 = 256;
                            break;
                        case '\t':
                            num3 = 512;
                            break;
                        case '\n':
                            num3 = 1024;
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 11 */:
                            num3 = 2048;
                            break;
                        case '\f':
                            num3 = 4096;
                            break;
                    }
                    if (num3 == null) {
                        return new Pair(num2, num3);
                    }
                    A3.c.q("Unknown Dolby Vision level string: ", str5, "MediaCodecUtil");
                    return null;
                }
                num3 = null;
                if (num3 == null) {
                }
            }
            num2 = null;
            if (num2 != null) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [A7.a, java.lang.Object] */
    public static synchronized List e(String str, boolean z8, boolean z10) {
        U9.j jVar;
        int i7;
        synchronized (x.class) {
            try {
                t tVar = new t(str, z8, z10);
                HashMap hashMap = f3668b;
                List list = (List) hashMap.get(tVar);
                if (list != null) {
                    return list;
                }
                int i10 = D.f21141a;
                if (i10 >= 21) {
                    ?? obj = new Object();
                    if (!z8 && !z10) {
                        i7 = 0;
                        obj.f531a = i7;
                        jVar = obj;
                    }
                    i7 = 1;
                    obj.f531a = i7;
                    jVar = obj;
                } else {
                    jVar = new U9.j(4);
                }
                ArrayList f4 = f(tVar, jVar);
                if (z8 && f4.isEmpty() && 21 <= i10 && i10 <= 23) {
                    f4 = f(tVar, new U9.j(4));
                    if (!f4.isEmpty()) {
                        AbstractC1705a.S("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((m) f4.get(0)).f3581a);
                    }
                }
                a(str, f4);
                H F10 = H.F(f4);
                hashMap.put(tVar, F10);
                return F10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ArrayList f(t tVar, v vVar) {
        String c10;
        String str;
        String str2;
        boolean isAlias;
        t tVar2 = tVar;
        v vVar2 = vVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str3 = tVar2.f3664a;
            int g = vVar.g();
            boolean j = vVar.j();
            int i7 = 0;
            while (i7 < g) {
                MediaCodecInfo c11 = vVar2.c(i7);
                int i10 = D.f21141a;
                if (i10 >= 29) {
                    isAlias = c11.isAlias();
                    if (isAlias) {
                        i7++;
                        tVar2 = tVar;
                        vVar2 = vVar;
                    }
                }
                String name = c11.getName();
                if (g(c11, name, j, str3) && (c10 = c(c11, name, str3)) != null) {
                    try {
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = c11.getCapabilitiesForType(c10);
                        boolean i11 = vVar2.i("tunneled-playback", c10, capabilitiesForType);
                        boolean e2 = vVar2.e("tunneled-playback", capabilitiesForType);
                        boolean z8 = tVar2.f3666c;
                        if ((z8 || !e2) && (!z8 || i11)) {
                            boolean i12 = vVar2.i("secure-playback", c10, capabilitiesForType);
                            boolean e10 = vVar2.e("secure-playback", capabilitiesForType);
                            boolean z10 = tVar2.f3665b;
                            if ((z10 || !e10) && (!z10 || i12)) {
                                boolean isHardwareAccelerated = i10 >= 29 ? c11.isHardwareAccelerated() : !h(c11, str3);
                                h(c11, str3);
                                if (i10 >= 29) {
                                    c11.isVendor();
                                } else {
                                    String N10 = u0.N(c11.getName());
                                    if (!N10.startsWith("omx.google.") && !N10.startsWith("c2.android.")) {
                                        N10.startsWith("c2.google.");
                                    }
                                }
                                if (!(j && z10 == i12) && (j || z10)) {
                                    str = c10;
                                    str2 = name;
                                    if (!j && i12) {
                                        arrayList.add(m.h(str2 + ".secure", str3, str, capabilitiesForType, isHardwareAccelerated, true));
                                        return arrayList;
                                    }
                                } else {
                                    str = c10;
                                    str2 = name;
                                    try {
                                        arrayList.add(m.h(name, str3, c10, capabilitiesForType, isHardwareAccelerated, false));
                                    } catch (Exception e11) {
                                        e = e11;
                                        if (D.f21141a > 23 || arrayList.isEmpty()) {
                                            AbstractC1705a.t("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                            throw e;
                                        }
                                        AbstractC1705a.t("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                        i7++;
                                        tVar2 = tVar;
                                        vVar2 = vVar;
                                    }
                                }
                            }
                        }
                    } catch (Exception e12) {
                        e = e12;
                        str = c10;
                        str2 = name;
                    }
                }
                i7++;
                tVar2 = tVar;
                vVar2 = vVar;
            }
            return arrayList;
        } catch (Exception e13) {
            throw new Exception("Failed to query underlying media codecs", e13);
        }
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str, boolean z8, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z8 && str.endsWith(".secure"))) {
            return false;
        }
        int i7 = D.f21141a;
        if (i7 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i7 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = D.f21142b;
            if ("a70".equals(str3) || ("Xiaomi".equals(D.f21143c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i7 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = D.f21142b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i7 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = D.f21142b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i7 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(D.f21143c))) {
            String str6 = D.f21142b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i7 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(D.f21143c)) {
            String str7 = D.f21142b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i7 <= 19 && D.f21142b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i7 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (D.f21141a >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (n5.o.j(str)) {
            return true;
        }
        String N10 = u0.N(mediaCodecInfo.getName());
        if (N10.startsWith("arc.")) {
            return false;
        }
        if (N10.startsWith("omx.google.") || N10.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((N10.startsWith("omx.sec.") && N10.contains(".sw.")) || N10.equals("omx.qcom.video.decoder.hevcswvdec") || N10.startsWith("c2.android.") || N10.startsWith("c2.google.")) {
            return true;
        }
        return (N10.startsWith("omx.") || N10.startsWith("c2.")) ? false : true;
    }

    public static int i() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i7;
        if (f3669c == -1) {
            int i10 = 0;
            List e2 = e("video/avc", false, false);
            m mVar = e2.isEmpty() ? null : (m) e2.get(0);
            if (mVar != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f3584d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = codecProfileLevelArr[i10].level;
                    if (i12 != 1 && i12 != 2) {
                        switch (i12) {
                            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                            case 16:
                            case 32:
                                i7 = 101376;
                                break;
                            case 64:
                                i7 = 202752;
                                break;
                            case 128:
                            case 256:
                                i7 = 414720;
                                break;
                            case 512:
                                i7 = 921600;
                                break;
                            case 1024:
                                i7 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i7 = 2097152;
                                break;
                            case 8192:
                                i7 = 2228224;
                                break;
                            case 16384:
                                i7 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i7 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i7 = 35651584;
                                break;
                            default:
                                i7 = -1;
                                break;
                        }
                    } else {
                        i7 = 25344;
                    }
                    i11 = Math.max(i7, i11);
                    i10++;
                }
                i10 = Math.max(i11, D.f21141a >= 21 ? 345600 : 172800);
            }
            f3669c = i10;
        }
        return f3669c;
    }
}
