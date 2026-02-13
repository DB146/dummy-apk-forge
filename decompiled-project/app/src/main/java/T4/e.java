package T4;

import N6.F;
import N6.H;
import N6.t0;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m4.AbstractC1571h;
import m4.C1586o0;
import m4.K;
import m5.C1618o;
import m5.L;
import n5.AbstractC1705a;
import n5.D;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import r4.C1935g;
import r4.C1936h;
import y7.u0;

/* loaded from: classes.dex */
public final class e extends DefaultHandler implements L {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f9264b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f9265c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f9266d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f9267e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f9268a;

    public e() {
        try {
            this.f9268a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    public static long a(ArrayList arrayList, long j, long j10, int i7, long j11) {
        int i10;
        if (i7 >= 0) {
            i10 = i7 + 1;
        } else {
            int i11 = D.f21141a;
            i10 = (int) ((((j11 - j) + j10) - 1) / j10);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            arrayList.add(new q(j, j10));
            j += j10;
        }
        return j;
    }

    public static void b(XmlPullParser xmlPullParser) {
        if (AbstractC1705a.F(xmlPullParser)) {
            int i7 = 1;
            while (i7 != 0) {
                xmlPullParser.next();
                if (AbstractC1705a.F(xmlPullParser)) {
                    i7++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i7--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0081, code lost:
    
        if (r0 == 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
    
        if (r6.equals("fa01") == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ee, code lost:
    
        if (r0 < 33) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(XmlPullParser xmlPullParser) {
        char c10;
        int i7 = 6;
        char c11 = 3;
        int i10 = -1;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = null;
        }
        attributeValue.getClass();
        switch (attributeValue.hashCode()) {
            case -2128649360:
                if (attributeValue.equals("urn:dts:dash:audio_channel_configuration:2012")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1352850286:
                if (attributeValue.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1138141449:
                if (attributeValue.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -986633423:
                if (attributeValue.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -79006963:
                if (attributeValue.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 312179081:
                if (attributeValue.equals("tag:dts.com,2018:uhd:audio_channel_configuration")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 2036691300:
                if (attributeValue.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
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
            case 4:
                i7 = l(xmlPullParser, "value", -1);
                if (i7 > 0) {
                    break;
                }
                break;
            case 1:
                i10 = l(xmlPullParser, "value", -1);
                break;
            case 2:
            case 6:
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue2 != null) {
                    String N10 = u0.N(attributeValue2);
                    N10.getClass();
                    switch (N10.hashCode()) {
                        case 1596796:
                            if (N10.equals("4000")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 2937391:
                            if (N10.equals("a000")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3094035:
                            if (N10.equals("f801")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3133436:
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    switch (c11) {
                        case 0:
                            i7 = 1;
                            break;
                        case 1:
                            i7 = 2;
                            break;
                        case 3:
                            i7 = 8;
                            break;
                    }
                    i10 = i7;
                    break;
                }
                i7 = -1;
                i10 = i7;
            case 3:
                int l10 = l(xmlPullParser, "value", -1);
                if (l10 >= 0) {
                    int[] iArr = f9267e;
                    if (l10 < iArr.length) {
                        i10 = iArr[l10];
                        break;
                    }
                }
                break;
            case 5:
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue3 != null) {
                    i7 = Integer.bitCount(Integer.parseInt(attributeValue3, 16));
                    break;
                }
                break;
        }
        do {
            xmlPullParser.next();
        } while (!AbstractC1705a.E(xmlPullParser, "AudioChannelConfiguration"));
        return i10;
    }

    public static long d(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return Float.parseFloat(attributeValue) * 1000000.0f;
    }

    public static ArrayList e(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z8) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : z8 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String str = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str = xmlPullParser.getText();
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC1705a.E(xmlPullParser, "BaseURL"));
        if (str != null && AbstractC1705a.A(str)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = str;
            }
            return N6.r.p(new b(parseInt, parseInt2, str, attributeValue3));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            b bVar = (b) arrayList.get(i7);
            String N10 = AbstractC1705a.N(bVar.f9243a, str);
            String str2 = attributeValue3 == null ? N10 : attributeValue3;
            if (z8) {
                parseInt = bVar.f9245c;
                parseInt2 = bVar.f9246d;
                str2 = bVar.f9244b;
            }
            arrayList2.add(new b(parseInt, parseInt2, N10, str2));
        }
        return arrayList2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v14, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.UUID] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair f(XmlPullParser xmlPullParser) {
        String str;
        ?? r62;
        String str2;
        String str3;
        ?? r72;
        char c10;
        String str4;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue != null) {
            String N10 = u0.N(attributeValue);
            N10.getClass();
            switch (N10.hashCode()) {
                case -1980789791:
                    if (N10.equals("urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 489446379:
                    if (N10.equals("urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 755418770:
                    if (N10.equals("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1812765994:
                    if (N10.equals("urn:mpeg:dash:mp4protection:2011")) {
                        c10 = 3;
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
                    r62 = AbstractC1571h.f20384c;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r72 = str2;
                    break;
                case 1:
                    r62 = AbstractC1571h.f20386e;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r72 = str2;
                    break;
                case 2:
                    r62 = AbstractC1571h.f20385d;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r72 = str2;
                    break;
                case 3:
                    str = xmlPullParser.getAttributeValue(null, "value");
                    int attributeCount = xmlPullParser.getAttributeCount();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= attributeCount) {
                            str4 = null;
                        } else {
                            String attributeName = xmlPullParser.getAttributeName(i7);
                            int indexOf = attributeName.indexOf(58);
                            if (indexOf != -1) {
                                attributeName = attributeName.substring(indexOf + 1);
                            }
                            if (attributeName.equals("default_KID")) {
                                str4 = xmlPullParser.getAttributeValue(i7);
                            } else {
                                i7++;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str4) && !"00000000-0000-0000-0000-000000000000".equals(str4)) {
                        String[] split = str4.split("\\s+");
                        UUID[] uuidArr = new UUID[split.length];
                        for (int i10 = 0; i10 < split.length; i10++) {
                            uuidArr[i10] = UUID.fromString(split[i10]);
                        }
                        r62 = AbstractC1571h.f20383b;
                        str3 = null;
                        r72 = A4.o.a(r62, uuidArr, null);
                        break;
                    } else {
                        r62 = null;
                        str2 = r62;
                        str3 = str2;
                        r72 = str2;
                        break;
                    }
            }
            do {
                xmlPullParser.next();
                if (!AbstractC1705a.G(xmlPullParser, "clearkey:Laurl") && xmlPullParser.next() == 4) {
                    str3 = xmlPullParser.getText();
                    r72 = r72;
                } else if (AbstractC1705a.G(xmlPullParser, "ms:laurl")) {
                    if (r72 == 0 && AbstractC1705a.F(xmlPullParser)) {
                        String name = xmlPullParser.getName();
                        int indexOf2 = name.indexOf(58);
                        if (indexOf2 != -1) {
                            name = name.substring(indexOf2 + 1);
                        }
                        if (name.equals("pssh") && xmlPullParser.next() == 4) {
                            byte[] decode = Base64.decode(xmlPullParser.getText(), 0);
                            A4.s e2 = A4.o.e(decode);
                            UUID uuid = e2 == null ? null : (UUID) e2.f471b;
                            if (uuid == null) {
                                AbstractC1705a.S("MpdParser", "Skipping malformed cenc:pssh data");
                                r62 = uuid;
                                r72 = 0;
                            } else {
                                UUID uuid2 = uuid;
                                r72 = decode;
                                r62 = uuid2;
                            }
                        }
                    }
                    if (r72 == 0) {
                        ?? r92 = AbstractC1571h.f20386e;
                        if (r92.equals(r62) && AbstractC1705a.G(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                            r72 = A4.o.a(r92, null, Base64.decode(xmlPullParser.getText(), 0));
                        }
                    }
                    b(xmlPullParser);
                    r72 = r72;
                } else {
                    str3 = xmlPullParser.getAttributeValue(null, "licenseUrl");
                    r72 = r72;
                }
            } while (!AbstractC1705a.E(xmlPullParser, "ContentProtection"));
            return Pair.create(str, r62 != null ? new C1935g(r62, str3, "video/mp4", r72) : null);
        }
        str = null;
        r62 = null;
        str2 = r62;
        str3 = str2;
        r72 = str2;
        do {
            xmlPullParser.next();
            if (!AbstractC1705a.G(xmlPullParser, "clearkey:Laurl")) {
            }
            if (AbstractC1705a.G(xmlPullParser, "ms:laurl")) {
            }
        } while (!AbstractC1705a.E(xmlPullParser, "ContentProtection"));
        return Pair.create(str, r62 != null ? new C1935g(r62, str3, "video/mp4", r72) : null);
    }

    public static int h(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public static f i(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!AbstractC1705a.E(xmlPullParser, str));
        return new f(attributeValue, attributeValue2, str2);
    }

    public static long j(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = D.f21147h.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        long parseDouble6 = (long) ((parseDouble5 + (group6 != null ? Double.parseDouble(group6) : 0.0d)) * 1000.0d);
        return !isEmpty ? -parseDouble6 : parseDouble6;
    }

    public static float k(XmlPullParser xmlPullParser, float f4) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f4;
        }
        Matcher matcher = f9264b.matcher(attributeValue);
        if (!matcher.matches()) {
            return f4;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        return !TextUtils.isEmpty(matcher.group(2)) ? parseInt / Integer.parseInt(r2) : parseInt;
    }

    public static int l(XmlPullParser xmlPullParser, String str, int i7) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i7 : Integer.parseInt(attributeValue);
    }

    public static long m(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x09c5, code lost:
    
        r0 = "audio/eac3-joc";
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x09d1, code lost:
    
        if ("audio/eac3-joc".equals(r0) != false) goto L274;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:609:0x10e6. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0fcd A[LOOP:5: B:153:0x03e2->B:161:0x0fcd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0e5d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0cbb A[LOOP:11: B:301:0x06a6->B:309:0x0cbb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0940 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0991  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x09e4  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0a13 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x13c3 A[LOOP:1: B:33:0x00d1->B:41:0x13c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0c4d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x138d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0c6b  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0c8c  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0c90  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0c6e  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0c50  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x09d7  */
    /* JADX WARN: Type inference failed for: r7v42, types: [T4.t, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c n(XmlPullParser xmlPullParser, Uri uri) {
        boolean z8;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        XmlPullParser xmlPullParser2;
        ArrayList arrayList3;
        long j;
        long j10;
        int i7;
        boolean z11;
        long j11;
        String str;
        String str2;
        String str3;
        ArrayList arrayList4;
        long j12;
        ArrayList arrayList5;
        String str4;
        String str5;
        ArrayList arrayList6;
        String str6;
        String str7;
        ArrayList arrayList7;
        String str8;
        ByteArrayOutputStream byteArrayOutputStream;
        long j13;
        String str9;
        ArrayList arrayList8;
        ArrayList arrayList9;
        String str10;
        ArrayList arrayList10;
        String str11;
        long j14;
        ArrayList arrayList11;
        ArrayList arrayList12;
        ArrayList arrayList13;
        String str12;
        ArrayList arrayList14;
        ArrayList arrayList15;
        String str13;
        ArrayList arrayList16;
        ArrayList arrayList17;
        String str14;
        String str15;
        int i10;
        float f4;
        String str16;
        int i11;
        ArrayList arrayList18;
        String str17;
        int i12;
        String str18;
        ArrayList arrayList19;
        long j15;
        int i13;
        ArrayList arrayList20;
        String str19;
        String str20;
        String str21;
        String str22;
        long j16;
        String str23;
        String str24;
        ArrayList arrayList21;
        String str25;
        String str26;
        ArrayList arrayList22;
        ArrayList arrayList23;
        String str27;
        ArrayList arrayList24;
        String str28;
        String str29;
        String str30;
        String str31;
        int i14;
        ArrayList arrayList25;
        String str32;
        String str33;
        int i15;
        String str34;
        ArrayList arrayList26;
        String str35;
        ArrayList arrayList27;
        String str36;
        ArrayList arrayList28;
        float f10;
        int i16;
        int i17;
        int i18;
        ArrayList arrayList29;
        ArrayList arrayList30;
        ArrayList arrayList31;
        ArrayList arrayList32;
        ArrayList arrayList33;
        String str37;
        ArrayList arrayList34;
        String str38;
        ArrayList arrayList35;
        ArrayList arrayList36;
        String str39;
        int i19;
        String str40;
        String str41;
        String str42;
        int i20;
        Pair pair;
        boolean z12;
        int i21;
        int i22;
        String str43;
        int i23;
        String str44;
        int i24;
        int i25;
        int i26;
        int i27;
        String str45;
        m kVar;
        String str46;
        String str47;
        long j17;
        boolean z13;
        long j18;
        long j19;
        long j20;
        XmlPullParser xmlPullParser3 = xmlPullParser;
        boolean z14 = true;
        int i28 = 0;
        String[] strArr = new String[0];
        String str48 = null;
        String attributeValue = xmlPullParser3.getAttributeValue(null, "profiles");
        if (attributeValue != null) {
            strArr = attributeValue.split(",");
        }
        int length = strArr.length;
        int i29 = 0;
        while (true) {
            if (i29 >= length) {
                z8 = false;
                break;
            }
            if (strArr[i29].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                z8 = true;
                break;
            }
            i29++;
        }
        String attributeValue2 = xmlPullParser3.getAttributeValue(null, "availabilityStartTime");
        long j21 = -9223372036854775807L;
        long P10 = attributeValue2 == null ? -9223372036854775807L : D.P(attributeValue2);
        long j22 = j(xmlPullParser3, "mediaPresentationDuration", -9223372036854775807L);
        long j23 = j(xmlPullParser3, "minBufferTime", -9223372036854775807L);
        boolean equals = "dynamic".equals(xmlPullParser3.getAttributeValue(null, "type"));
        long j24 = equals ? j(xmlPullParser3, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long j25 = equals ? j(xmlPullParser3, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long j26 = equals ? j(xmlPullParser3, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        String attributeValue3 = xmlPullParser3.getAttributeValue(null, "publishTime");
        long P11 = attributeValue3 == null ? -9223372036854775807L : D.P(attributeValue3);
        long j27 = equals ? 0L : -9223372036854775807L;
        ArrayList p10 = N6.r.p(new b(z8 ? 1 : Integer.MIN_VALUE, 1, uri.toString(), uri.toString()));
        ArrayList arrayList37 = new ArrayList();
        ArrayList arrayList38 = new ArrayList();
        i iVar = null;
        u uVar = null;
        Uri uri2 = null;
        t tVar = null;
        boolean z15 = false;
        boolean z16 = false;
        long j28 = j27;
        long j29 = equals ? -9223372036854775807L : 0L;
        long j30 = j28;
        while (true) {
            xmlPullParser.next();
            String str49 = "BaseURL";
            if (AbstractC1705a.G(xmlPullParser3, "BaseURL")) {
                if (!z15) {
                    j30 = d(xmlPullParser3, j30);
                    z15 = z14;
                }
                arrayList38.addAll(e(xmlPullParser3, p10, z8));
                j = j30;
                arrayList = p10;
                arrayList2 = arrayList38;
                z10 = z8;
                z11 = z14;
                i7 = i28;
                xmlPullParser2 = xmlPullParser3;
                arrayList3 = arrayList37;
            } else {
                String str50 = "lang";
                if (AbstractC1705a.G(xmlPullParser3, "ProgramInformation")) {
                    String attributeValue4 = xmlPullParser3.getAttributeValue(str48, "moreInformationURL");
                    String str51 = attributeValue4 == null ? str48 : attributeValue4;
                    String attributeValue5 = xmlPullParser3.getAttributeValue(str48, "lang");
                    String str52 = attributeValue5 == null ? str48 : attributeValue5;
                    String str53 = str48;
                    String str54 = str53;
                    String str55 = str54;
                    do {
                        xmlPullParser.next();
                        if (AbstractC1705a.G(xmlPullParser3, "Title")) {
                            str53 = xmlPullParser.nextText();
                        } else if (AbstractC1705a.G(xmlPullParser3, "Source")) {
                            str54 = xmlPullParser.nextText();
                        } else if (AbstractC1705a.G(xmlPullParser3, "Copyright")) {
                            str55 = xmlPullParser.nextText();
                        } else {
                            b(xmlPullParser);
                        }
                    } while (!AbstractC1705a.E(xmlPullParser3, "ProgramInformation"));
                    j = j30;
                    arrayList = p10;
                    arrayList2 = arrayList38;
                    z10 = z8;
                    iVar = new i(str53, str54, str55, str51, str52);
                    i7 = i28;
                    xmlPullParser2 = xmlPullParser3;
                    arrayList3 = arrayList37;
                    z11 = true;
                } else {
                    if (AbstractC1705a.G(xmlPullParser3, "UTCTiming")) {
                        j = j30;
                        arrayList = p10;
                        arrayList2 = arrayList38;
                        z10 = z8;
                        uVar = new u(i28, xmlPullParser3.getAttributeValue(str48, "schemeIdUri"), xmlPullParser3.getAttributeValue(str48, "value"));
                    } else if (AbstractC1705a.G(xmlPullParser3, "Location")) {
                        j = j30;
                        arrayList = p10;
                        arrayList2 = arrayList38;
                        uri2 = AbstractC1705a.O(uri.toString(), xmlPullParser.nextText());
                        z10 = z8;
                    } else if (AbstractC1705a.G(xmlPullParser3, "ServiceDescription")) {
                        float f11 = -3.4028235E38f;
                        float f12 = -3.4028235E38f;
                        long j31 = -9223372036854775807L;
                        long j32 = -9223372036854775807L;
                        long j33 = -9223372036854775807L;
                        while (true) {
                            xmlPullParser.next();
                            if (AbstractC1705a.G(xmlPullParser3, "Latency")) {
                                long m10 = m(xmlPullParser3, "target", -9223372036854775807L);
                                long m11 = m(xmlPullParser3, "min", -9223372036854775807L);
                                j31 = m10;
                                j19 = j30;
                                j20 = m(xmlPullParser3, "max", -9223372036854775807L);
                                j18 = m11;
                            } else {
                                if (AbstractC1705a.G(xmlPullParser3, "PlaybackRate")) {
                                    String attributeValue6 = xmlPullParser3.getAttributeValue(null, "min");
                                    f11 = attributeValue6 == null ? -3.4028235E38f : Float.parseFloat(attributeValue6);
                                    String attributeValue7 = xmlPullParser3.getAttributeValue(null, "max");
                                    f12 = attributeValue7 == null ? -3.4028235E38f : Float.parseFloat(attributeValue7);
                                }
                                j18 = j32;
                                j19 = j30;
                                j20 = j33;
                            }
                            if (AbstractC1705a.E(xmlPullParser3, "ServiceDescription")) {
                                ?? obj = new Object();
                                obj.f9310a = j31;
                                obj.f9311b = j18;
                                obj.f9312c = j20;
                                obj.f9313d = f11;
                                obj.f9314e = f12;
                                arrayList = p10;
                                arrayList2 = arrayList38;
                                tVar = obj;
                                z10 = z8;
                                xmlPullParser2 = xmlPullParser3;
                                arrayList3 = arrayList37;
                                j = j19;
                                j10 = -9223372036854775807L;
                                i7 = 0;
                                z11 = true;
                                if (!AbstractC1705a.E(xmlPullParser2, "MPD")) {
                                    if (j22 == j10) {
                                        if (j29 != j10) {
                                            j22 = j29;
                                        } else if (!equals) {
                                            throw C1586o0.b("Unable to determine duration of static manifest.", null);
                                        }
                                    }
                                    if (arrayList3.isEmpty()) {
                                        throw C1586o0.b("No periods found.", null);
                                    }
                                    return new c(P10, j22, j23, equals, j24, j25, j26, P11, iVar, uVar, tVar, uri2, arrayList3);
                                }
                                arrayList37 = arrayList3;
                                j21 = j10;
                                xmlPullParser3 = xmlPullParser2;
                                p10 = arrayList;
                                arrayList38 = arrayList2;
                                i28 = i7;
                                j30 = j;
                                z14 = z11;
                                z8 = z10;
                                str48 = null;
                            } else {
                                j33 = j20;
                                j30 = j19;
                                j32 = j18;
                            }
                        }
                    } else {
                        long j34 = j30;
                        String str56 = "Period";
                        if (!AbstractC1705a.G(xmlPullParser3, "Period") || z16) {
                            arrayList = p10;
                            arrayList2 = arrayList38;
                            z10 = z8;
                            xmlPullParser2 = xmlPullParser3;
                            arrayList3 = arrayList37;
                            j = j34;
                            j10 = -9223372036854775807L;
                            i7 = 0;
                            z11 = true;
                            b(xmlPullParser);
                            j29 = j29;
                        } else {
                            ArrayList arrayList39 = !arrayList38.isEmpty() ? arrayList38 : p10;
                            String str57 = "id";
                            String attributeValue8 = xmlPullParser3.getAttributeValue(null, "id");
                            long j35 = j(xmlPullParser3, "start", j29);
                            long j36 = P10 != -9223372036854775807L ? P10 + j35 : -9223372036854775807L;
                            long j37 = j(xmlPullParser3, "duration", -9223372036854775807L);
                            String str58 = "value";
                            ArrayList arrayList40 = new ArrayList();
                            ArrayList arrayList41 = new ArrayList();
                            ArrayList arrayList42 = new ArrayList();
                            long j38 = -9223372036854775807L;
                            String str59 = "schemeIdUri";
                            String str60 = "duration";
                            long j39 = j34;
                            s sVar = null;
                            boolean z17 = false;
                            while (true) {
                                xmlPullParser.next();
                                if (AbstractC1705a.G(xmlPullParser3, str49)) {
                                    if (!z17) {
                                        j39 = d(xmlPullParser3, j39);
                                        z17 = true;
                                    }
                                    arrayList42.addAll(e(xmlPullParser3, arrayList39, z8));
                                    j11 = j29;
                                    arrayList = p10;
                                    arrayList2 = arrayList38;
                                    str4 = str57;
                                    z10 = z8;
                                    str8 = str56;
                                    arrayList4 = arrayList39;
                                    str = str50;
                                    str2 = str49;
                                    j = j34;
                                    arrayList7 = arrayList40;
                                    arrayList6 = arrayList41;
                                    str6 = str59;
                                    str7 = str60;
                                    i7 = 0;
                                    z11 = true;
                                    xmlPullParser2 = xmlPullParser3;
                                    str5 = str58;
                                    j10 = -9223372036854775807L;
                                    arrayList5 = arrayList42;
                                } else {
                                    String str61 = str56;
                                    ArrayList arrayList43 = arrayList39;
                                    long j40 = j39;
                                    if (AbstractC1705a.G(xmlPullParser3, "AdaptationSet")) {
                                        j11 = j29;
                                        ArrayList arrayList44 = !arrayList42.isEmpty() ? arrayList42 : arrayList43;
                                        long m12 = m(xmlPullParser3, str57, -1L);
                                        int h10 = h(xmlPullParser);
                                        String attributeValue9 = xmlPullParser3.getAttributeValue(null, "mimeType");
                                        ArrayList arrayList45 = arrayList42;
                                        String str62 = "codecs";
                                        String attributeValue10 = xmlPullParser3.getAttributeValue(null, "codecs");
                                        String str63 = "SegmentTemplate";
                                        int l10 = l(xmlPullParser3, "width", -1);
                                        ArrayList arrayList46 = p10;
                                        ArrayList arrayList47 = arrayList38;
                                        int l11 = l(xmlPullParser3, "height", -1);
                                        float k = k(xmlPullParser3, -1.0f);
                                        String str64 = "AdaptationSet";
                                        String str65 = "SegmentBase";
                                        String str66 = "SegmentList";
                                        int l12 = l(xmlPullParser3, "audioSamplingRate", -1);
                                        String attributeValue11 = xmlPullParser3.getAttributeValue(null, str50);
                                        String str67 = "audioSamplingRate";
                                        String attributeValue12 = xmlPullParser3.getAttributeValue(null, "label");
                                        ArrayList arrayList48 = new ArrayList();
                                        String str68 = attributeValue12;
                                        ArrayList arrayList49 = new ArrayList();
                                        ArrayList arrayList50 = new ArrayList();
                                        int i30 = l12;
                                        ArrayList arrayList51 = new ArrayList();
                                        float f13 = k;
                                        ArrayList arrayList52 = new ArrayList();
                                        String str69 = "height";
                                        ArrayList arrayList53 = new ArrayList();
                                        int i31 = l11;
                                        ArrayList arrayList54 = new ArrayList();
                                        ArrayList arrayList55 = new ArrayList();
                                        String str70 = "width";
                                        String str71 = "mimeType";
                                        ArrayList arrayList56 = arrayList53;
                                        int i32 = l10;
                                        s sVar2 = sVar;
                                        long j41 = j38;
                                        long j42 = j40;
                                        int i33 = h10;
                                        String str72 = attributeValue11;
                                        int i34 = -1;
                                        String str73 = null;
                                        boolean z18 = false;
                                        while (true) {
                                            xmlPullParser.next();
                                            if (AbstractC1705a.G(xmlPullParser3, str49)) {
                                                if (z18) {
                                                    j17 = j42;
                                                } else {
                                                    j17 = d(xmlPullParser3, j42);
                                                    z18 = true;
                                                }
                                                arrayList55.addAll(e(xmlPullParser3, arrayList44, z8));
                                                arrayList11 = arrayList52;
                                                arrayList12 = arrayList50;
                                                arrayList13 = arrayList55;
                                                str12 = str57;
                                                arrayList14 = arrayList51;
                                                arrayList15 = arrayList48;
                                                str = str50;
                                                j = j34;
                                                str13 = str58;
                                                arrayList16 = arrayList40;
                                                arrayList17 = arrayList41;
                                                str14 = str59;
                                                str15 = str60;
                                                str3 = str61;
                                                arrayList4 = arrayList43;
                                                j12 = j40;
                                                arrayList5 = arrayList45;
                                                str23 = str63;
                                                arrayList = arrayList46;
                                                arrayList2 = arrayList47;
                                                str26 = str64;
                                                str22 = str66;
                                                str25 = str68;
                                                arrayList21 = arrayList49;
                                                i10 = i30;
                                                f4 = f13;
                                                str16 = str69;
                                                i11 = i31;
                                                arrayList18 = arrayList54;
                                                str17 = str70;
                                                i12 = i32;
                                                arrayList20 = arrayList56;
                                                j15 = j17;
                                                i7 = 0;
                                                z11 = true;
                                                arrayList19 = arrayList44;
                                            } else {
                                                ArrayList arrayList57 = arrayList44;
                                                if (AbstractC1705a.G(xmlPullParser3, "ContentProtection")) {
                                                    Pair f14 = f(xmlPullParser);
                                                    j14 = j42;
                                                    Object obj2 = f14.first;
                                                    if (obj2 != null) {
                                                        str73 = (String) obj2;
                                                    }
                                                    Object obj3 = f14.second;
                                                    if (obj3 != null) {
                                                        arrayList48.add((C1935g) obj3);
                                                    }
                                                } else {
                                                    j14 = j42;
                                                    if (AbstractC1705a.G(xmlPullParser3, "ContentComponent")) {
                                                        String attributeValue13 = xmlPullParser3.getAttributeValue(null, str50);
                                                        if (str72 == null) {
                                                            str72 = attributeValue13;
                                                        } else if (attributeValue13 != null) {
                                                            AbstractC1705a.m(str72.equals(attributeValue13));
                                                        }
                                                        int h11 = h(xmlPullParser);
                                                        if (i33 == -1) {
                                                            i33 = h11;
                                                        } else if (h11 != -1) {
                                                            AbstractC1705a.m(i33 == h11);
                                                        }
                                                    } else {
                                                        if (AbstractC1705a.G(xmlPullParser3, "Role")) {
                                                            arrayList51.add(i(xmlPullParser3, "Role"));
                                                        } else {
                                                            String str74 = "AudioChannelConfiguration";
                                                            if (AbstractC1705a.G(xmlPullParser3, "AudioChannelConfiguration")) {
                                                                arrayList11 = arrayList52;
                                                                arrayList12 = arrayList50;
                                                                i34 = c(xmlPullParser);
                                                                arrayList13 = arrayList55;
                                                                str12 = str57;
                                                                arrayList14 = arrayList51;
                                                                arrayList15 = arrayList48;
                                                                str = str50;
                                                                j = j34;
                                                                str13 = str58;
                                                                arrayList16 = arrayList40;
                                                                arrayList17 = arrayList41;
                                                                str14 = str59;
                                                                str15 = str60;
                                                                str3 = str61;
                                                                arrayList4 = arrayList43;
                                                                j12 = j40;
                                                                arrayList5 = arrayList45;
                                                                str23 = str63;
                                                                arrayList = arrayList46;
                                                                arrayList2 = arrayList47;
                                                                str26 = str64;
                                                                str22 = str66;
                                                                str25 = str68;
                                                                arrayList21 = arrayList49;
                                                                i10 = i30;
                                                                f4 = f13;
                                                                str16 = str69;
                                                                i11 = i31;
                                                                arrayList18 = arrayList54;
                                                                str17 = str70;
                                                                i12 = i32;
                                                                arrayList20 = arrayList56;
                                                                arrayList19 = arrayList57;
                                                                j15 = j14;
                                                                i7 = 0;
                                                                z11 = true;
                                                            } else if (AbstractC1705a.G(xmlPullParser3, "Accessibility")) {
                                                                arrayList50.add(i(xmlPullParser3, "Accessibility"));
                                                            } else {
                                                                String str75 = "EssentialProperty";
                                                                if (AbstractC1705a.G(xmlPullParser3, "EssentialProperty")) {
                                                                    arrayList52.add(i(xmlPullParser3, "EssentialProperty"));
                                                                } else {
                                                                    str = str50;
                                                                    if (AbstractC1705a.G(xmlPullParser3, "SupplementalProperty")) {
                                                                        ArrayList arrayList58 = arrayList56;
                                                                        arrayList58.add(i(xmlPullParser3, "SupplementalProperty"));
                                                                        arrayList11 = arrayList52;
                                                                        arrayList12 = arrayList50;
                                                                        arrayList13 = arrayList55;
                                                                        str12 = str57;
                                                                        arrayList14 = arrayList51;
                                                                        arrayList15 = arrayList48;
                                                                        j = j34;
                                                                        str13 = str58;
                                                                        arrayList16 = arrayList40;
                                                                        arrayList17 = arrayList41;
                                                                        str14 = str59;
                                                                        str15 = str60;
                                                                        str3 = str61;
                                                                        arrayList4 = arrayList43;
                                                                        j12 = j40;
                                                                        arrayList5 = arrayList45;
                                                                        str23 = str63;
                                                                        arrayList = arrayList46;
                                                                        arrayList2 = arrayList47;
                                                                        str22 = str66;
                                                                        arrayList21 = arrayList49;
                                                                        i10 = i30;
                                                                        f4 = f13;
                                                                        str16 = str69;
                                                                        i11 = i31;
                                                                        arrayList18 = arrayList54;
                                                                        str17 = str70;
                                                                        i12 = i32;
                                                                        arrayList19 = arrayList57;
                                                                        j15 = j14;
                                                                        i7 = 0;
                                                                        z11 = true;
                                                                        i13 = i33;
                                                                        arrayList20 = arrayList58;
                                                                        str18 = str72;
                                                                        z10 = z8;
                                                                        str19 = str62;
                                                                        str20 = str64;
                                                                        str21 = str67;
                                                                        j16 = j41;
                                                                        str2 = str49;
                                                                        xmlPullParser2 = xmlPullParser3;
                                                                        str24 = str65;
                                                                        j41 = j16;
                                                                        str72 = str18;
                                                                        i33 = i13;
                                                                        str25 = str68;
                                                                        str26 = str20;
                                                                        if (AbstractC1705a.E(xmlPullParser2, str26)) {
                                                                            arrayList49 = arrayList21;
                                                                            str65 = str24;
                                                                            xmlPullParser3 = xmlPullParser2;
                                                                            arrayList43 = arrayList4;
                                                                            arrayList50 = arrayList12;
                                                                            arrayList45 = arrayList5;
                                                                            i30 = i10;
                                                                            arrayList51 = arrayList14;
                                                                            str62 = str19;
                                                                            str68 = str25;
                                                                            arrayList44 = arrayList19;
                                                                            i32 = i12;
                                                                            i31 = i11;
                                                                            str49 = str2;
                                                                            f13 = f4;
                                                                            z8 = z10;
                                                                            arrayList56 = arrayList20;
                                                                            str67 = str21;
                                                                            arrayList55 = arrayList13;
                                                                            str70 = str17;
                                                                            j42 = j15;
                                                                            arrayList54 = arrayList18;
                                                                            str59 = str14;
                                                                            str60 = str15;
                                                                            str57 = str12;
                                                                            str61 = str3;
                                                                            arrayList48 = arrayList15;
                                                                            str58 = str13;
                                                                            arrayList40 = arrayList16;
                                                                            arrayList41 = arrayList17;
                                                                            str63 = str23;
                                                                            str64 = str26;
                                                                            str66 = str22;
                                                                            arrayList47 = arrayList2;
                                                                            j40 = j12;
                                                                            j34 = j;
                                                                            str69 = str16;
                                                                            str50 = str;
                                                                            arrayList52 = arrayList11;
                                                                            arrayList46 = arrayList;
                                                                        } else {
                                                                            ArrayList arrayList59 = new ArrayList(arrayList18.size());
                                                                            int i35 = i7;
                                                                            while (i35 < arrayList18.size()) {
                                                                                ArrayList arrayList60 = arrayList18;
                                                                                d dVar = (d) arrayList60.get(i35);
                                                                                K a9 = dVar.f9257a.a();
                                                                                if (str25 != null) {
                                                                                    a9.f19977b = str25;
                                                                                }
                                                                                String str76 = dVar.f9260d;
                                                                                if (str76 == null) {
                                                                                    str76 = str73;
                                                                                }
                                                                                ArrayList arrayList61 = dVar.f9261e;
                                                                                ArrayList arrayList62 = arrayList15;
                                                                                arrayList61.addAll(arrayList62);
                                                                                if (arrayList61.isEmpty()) {
                                                                                    arrayList18 = arrayList60;
                                                                                    str45 = str25;
                                                                                } else {
                                                                                    int i36 = i7;
                                                                                    while (true) {
                                                                                        if (i36 < arrayList61.size()) {
                                                                                            C1935g c1935g = (C1935g) arrayList61.get(i36);
                                                                                            if (!AbstractC1571h.f20384c.equals(c1935g.f23757b) || (str46 = c1935g.f23758c) == null) {
                                                                                                i36++;
                                                                                            } else {
                                                                                                arrayList61.remove(i36);
                                                                                            }
                                                                                        } else {
                                                                                            str46 = null;
                                                                                        }
                                                                                    }
                                                                                    if (str46 != null) {
                                                                                        int i37 = i7;
                                                                                        while (i37 < arrayList61.size()) {
                                                                                            C1935g c1935g2 = (C1935g) arrayList61.get(i37);
                                                                                            ArrayList arrayList63 = arrayList60;
                                                                                            if (AbstractC1571h.f20383b.equals(c1935g2.f23757b) && c1935g2.f23758c == null) {
                                                                                                str47 = str25;
                                                                                                arrayList61.set(i37, new C1935g(AbstractC1571h.f20384c, str46, c1935g2.f23759d, c1935g2.f23760e));
                                                                                            } else {
                                                                                                str47 = str25;
                                                                                            }
                                                                                            i37++;
                                                                                            str25 = str47;
                                                                                            arrayList60 = arrayList63;
                                                                                        }
                                                                                    }
                                                                                    arrayList18 = arrayList60;
                                                                                    str45 = str25;
                                                                                    for (int size = arrayList61.size() - 1; size >= 0; size--) {
                                                                                        C1935g c1935g3 = (C1935g) arrayList61.get(size);
                                                                                        if (c1935g3.f23760e == null) {
                                                                                            int i38 = i7;
                                                                                            while (true) {
                                                                                                if (i38 < arrayList61.size()) {
                                                                                                    C1935g c1935g4 = (C1935g) arrayList61.get(i38);
                                                                                                    if (c1935g4.f23760e != null && c1935g3.f23760e == null && c1935g4.a(c1935g3.f23757b)) {
                                                                                                        arrayList61.remove(size);
                                                                                                    } else {
                                                                                                        i38++;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    a9.f19986n = new C1936h(str76, arrayList61);
                                                                                }
                                                                                ArrayList arrayList64 = dVar.f9262f;
                                                                                arrayList64.addAll(arrayList21);
                                                                                m4.L l13 = new m4.L(a9);
                                                                                s sVar3 = dVar.f9259c;
                                                                                boolean z19 = sVar3 instanceof r;
                                                                                ArrayList arrayList65 = dVar.g;
                                                                                ArrayList arrayList66 = dVar.f9263h;
                                                                                H h12 = dVar.f9258b;
                                                                                if (z19) {
                                                                                    kVar = new l(l13, h12, (r) sVar3, arrayList64, arrayList65, arrayList66);
                                                                                } else {
                                                                                    if (!(sVar3 instanceof n)) {
                                                                                        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                                                    }
                                                                                    kVar = new k(l13, h12, (n) sVar3, arrayList64, arrayList65, arrayList66);
                                                                                }
                                                                                arrayList59.add(kVar);
                                                                                i35++;
                                                                                arrayList15 = arrayList62;
                                                                                str25 = str45;
                                                                            }
                                                                            ArrayList arrayList67 = arrayList16;
                                                                            arrayList67.add(new a(m12, i33, arrayList59, arrayList12, arrayList11, arrayList20));
                                                                            arrayList7 = arrayList67;
                                                                            str6 = str14;
                                                                            str7 = str15;
                                                                            str4 = str12;
                                                                            str5 = str13;
                                                                            arrayList6 = arrayList17;
                                                                            j10 = -9223372036854775807L;
                                                                        }
                                                                    } else {
                                                                        String str77 = "SupplementalProperty";
                                                                        ArrayList arrayList68 = arrayList56;
                                                                        String str78 = str72;
                                                                        ArrayList arrayList69 = arrayList68;
                                                                        String str79 = "Representation";
                                                                        if (AbstractC1705a.G(xmlPullParser3, "Representation")) {
                                                                            if (arrayList55.isEmpty()) {
                                                                                arrayList22 = arrayList51;
                                                                                arrayList23 = arrayList48;
                                                                                str27 = "InbandEventStream";
                                                                                arrayList24 = arrayList57;
                                                                                str28 = null;
                                                                            } else {
                                                                                arrayList22 = arrayList51;
                                                                                arrayList23 = arrayList48;
                                                                                str27 = "InbandEventStream";
                                                                                str28 = null;
                                                                                arrayList24 = arrayList55;
                                                                            }
                                                                            String attributeValue14 = xmlPullParser3.getAttributeValue(str28, str57);
                                                                            int l14 = l(xmlPullParser3, "bandwidth", -1);
                                                                            String str80 = str71;
                                                                            ArrayList arrayList70 = arrayList50;
                                                                            String attributeValue15 = xmlPullParser3.getAttributeValue(null, str80);
                                                                            String str81 = attributeValue15 == null ? attributeValue9 : attributeValue15;
                                                                            String attributeValue16 = xmlPullParser3.getAttributeValue(null, str62);
                                                                            String str82 = str62;
                                                                            if (attributeValue16 == null) {
                                                                                attributeValue16 = attributeValue10;
                                                                            }
                                                                            String str83 = str70;
                                                                            int i39 = i32;
                                                                            String str84 = "ContentProtection";
                                                                            arrayList13 = arrayList55;
                                                                            String str85 = str69;
                                                                            int i40 = i39;
                                                                            int i41 = i31;
                                                                            int l15 = l(xmlPullParser3, str83, i39);
                                                                            int i42 = i33;
                                                                            float f15 = f13;
                                                                            int l16 = l(xmlPullParser3, str85, i41);
                                                                            String str86 = str80;
                                                                            String str87 = str67;
                                                                            int i43 = l14;
                                                                            int i44 = i30;
                                                                            float k7 = k(xmlPullParser3, f15);
                                                                            int l17 = l(xmlPullParser3, str87, i44);
                                                                            ArrayList arrayList71 = new ArrayList();
                                                                            ArrayList arrayList72 = new ArrayList();
                                                                            ArrayList arrayList73 = new ArrayList(arrayList52);
                                                                            ArrayList arrayList74 = new ArrayList(arrayList69);
                                                                            ArrayList arrayList75 = new ArrayList();
                                                                            arrayList11 = arrayList52;
                                                                            float f16 = f15;
                                                                            int i45 = i44;
                                                                            String str88 = str83;
                                                                            int i46 = i34;
                                                                            s sVar4 = sVar2;
                                                                            long j43 = j41;
                                                                            long j44 = j14;
                                                                            String str89 = null;
                                                                            boolean z20 = false;
                                                                            while (true) {
                                                                                xmlPullParser.next();
                                                                                if (AbstractC1705a.G(xmlPullParser3, str49)) {
                                                                                    if (z20) {
                                                                                        str29 = str87;
                                                                                    } else {
                                                                                        j44 = d(xmlPullParser3, j44);
                                                                                        str29 = str87;
                                                                                        z20 = true;
                                                                                    }
                                                                                    arrayList75.addAll(e(xmlPullParser3, arrayList24, z8));
                                                                                } else {
                                                                                    str29 = str87;
                                                                                    if (AbstractC1705a.G(xmlPullParser3, str74)) {
                                                                                        i46 = c(xmlPullParser);
                                                                                    } else {
                                                                                        String str90 = str65;
                                                                                        if (AbstractC1705a.G(xmlPullParser3, str90)) {
                                                                                            str65 = str90;
                                                                                            sVar4 = r(xmlPullParser3, (r) sVar4);
                                                                                        } else {
                                                                                            String str91 = str66;
                                                                                            if (AbstractC1705a.G(xmlPullParser3, str91)) {
                                                                                                long d10 = d(xmlPullParser3, j43);
                                                                                                f4 = f16;
                                                                                                arrayList26 = arrayList24;
                                                                                                int i47 = i42;
                                                                                                str17 = str88;
                                                                                                j = j34;
                                                                                                j15 = j14;
                                                                                                str21 = str29;
                                                                                                str35 = str64;
                                                                                                arrayList27 = arrayList49;
                                                                                                str2 = str49;
                                                                                                String str92 = str86;
                                                                                                arrayList28 = arrayList70;
                                                                                                str71 = str92;
                                                                                                str34 = str74;
                                                                                                arrayList = arrayList46;
                                                                                                arrayList2 = arrayList47;
                                                                                                arrayList25 = arrayList54;
                                                                                                str16 = str85;
                                                                                                arrayList20 = arrayList69;
                                                                                                i11 = i41;
                                                                                                str14 = str59;
                                                                                                str15 = str60;
                                                                                                j12 = j40;
                                                                                                i12 = i40;
                                                                                                str32 = str78;
                                                                                                arrayList19 = arrayList57;
                                                                                                i15 = i47;
                                                                                                str36 = str84;
                                                                                                str12 = str57;
                                                                                                z10 = z8;
                                                                                                str3 = str61;
                                                                                                arrayList4 = arrayList43;
                                                                                                str31 = str90;
                                                                                                i14 = i43;
                                                                                                str30 = str91;
                                                                                                arrayList15 = arrayList23;
                                                                                                str33 = attributeValue14;
                                                                                                i10 = i45;
                                                                                                i7 = 0;
                                                                                                sVar4 = s(xmlPullParser, (o) sVar4, j36, j37, j44, d10, j25);
                                                                                                str13 = str58;
                                                                                                str37 = str27;
                                                                                                arrayList16 = arrayList40;
                                                                                                arrayList17 = arrayList41;
                                                                                                j44 = j44;
                                                                                                str75 = str75;
                                                                                                arrayList5 = arrayList45;
                                                                                                f10 = k7;
                                                                                                i16 = l16;
                                                                                                i17 = l15;
                                                                                                str38 = str77;
                                                                                                str39 = str79;
                                                                                                str19 = str82;
                                                                                                i18 = l17;
                                                                                                arrayList29 = arrayList71;
                                                                                                arrayList34 = arrayList72;
                                                                                                arrayList35 = arrayList73;
                                                                                                arrayList36 = arrayList74;
                                                                                                i19 = i46;
                                                                                                j43 = d10;
                                                                                                arrayList33 = arrayList75;
                                                                                            } else {
                                                                                                str30 = str91;
                                                                                                str12 = str57;
                                                                                                j = j34;
                                                                                                str14 = str59;
                                                                                                str15 = str60;
                                                                                                str3 = str61;
                                                                                                arrayList4 = arrayList43;
                                                                                                j12 = j40;
                                                                                                arrayList = arrayList46;
                                                                                                arrayList2 = arrayList47;
                                                                                                str31 = str90;
                                                                                                i14 = i43;
                                                                                                i12 = i40;
                                                                                                arrayList25 = arrayList54;
                                                                                                str32 = str78;
                                                                                                arrayList19 = arrayList57;
                                                                                                j15 = j14;
                                                                                                arrayList15 = arrayList23;
                                                                                                str33 = attributeValue14;
                                                                                                i15 = i42;
                                                                                                str17 = str88;
                                                                                                i10 = i45;
                                                                                                f4 = f16;
                                                                                                str21 = str29;
                                                                                                i7 = 0;
                                                                                                String str93 = str75;
                                                                                                str34 = str74;
                                                                                                str16 = str85;
                                                                                                arrayList20 = arrayList69;
                                                                                                i11 = i41;
                                                                                                z10 = z8;
                                                                                                long j45 = j44;
                                                                                                arrayList26 = arrayList24;
                                                                                                String str94 = str63;
                                                                                                str35 = str64;
                                                                                                arrayList27 = arrayList49;
                                                                                                str2 = str49;
                                                                                                str36 = str84;
                                                                                                String str95 = str86;
                                                                                                arrayList28 = arrayList70;
                                                                                                str71 = str95;
                                                                                                if (AbstractC1705a.G(xmlPullParser3, str94)) {
                                                                                                    long d11 = d(xmlPullParser3, j43);
                                                                                                    str63 = str94;
                                                                                                    str13 = str58;
                                                                                                    arrayList16 = arrayList40;
                                                                                                    arrayList17 = arrayList41;
                                                                                                    arrayList5 = arrayList45;
                                                                                                    f10 = k7;
                                                                                                    i16 = l16;
                                                                                                    i17 = l15;
                                                                                                    str19 = str82;
                                                                                                    i18 = l17;
                                                                                                    arrayList29 = arrayList71;
                                                                                                    arrayList30 = arrayList72;
                                                                                                    arrayList31 = arrayList73;
                                                                                                    arrayList32 = arrayList74;
                                                                                                    arrayList33 = arrayList75;
                                                                                                    sVar4 = t(xmlPullParser, (p) sVar4, arrayList20, j36, j37, j45, d11, j25);
                                                                                                    str37 = str27;
                                                                                                    j44 = j45;
                                                                                                    str75 = str93;
                                                                                                    j43 = d11;
                                                                                                } else {
                                                                                                    str63 = str94;
                                                                                                    str13 = str58;
                                                                                                    arrayList16 = arrayList40;
                                                                                                    arrayList17 = arrayList41;
                                                                                                    arrayList5 = arrayList45;
                                                                                                    f10 = k7;
                                                                                                    i16 = l16;
                                                                                                    i17 = l15;
                                                                                                    str19 = str82;
                                                                                                    i18 = l17;
                                                                                                    arrayList29 = arrayList71;
                                                                                                    arrayList30 = arrayList72;
                                                                                                    arrayList31 = arrayList73;
                                                                                                    arrayList32 = arrayList74;
                                                                                                    arrayList33 = arrayList75;
                                                                                                    if (AbstractC1705a.G(xmlPullParser3, str36)) {
                                                                                                        Pair f17 = f(xmlPullParser);
                                                                                                        Object obj4 = f17.first;
                                                                                                        if (obj4 != null) {
                                                                                                            str89 = (String) obj4;
                                                                                                        }
                                                                                                        Object obj5 = f17.second;
                                                                                                        if (obj5 != null) {
                                                                                                            arrayList29.add((C1935g) obj5);
                                                                                                        }
                                                                                                        str37 = str27;
                                                                                                        j44 = j45;
                                                                                                        str75 = str93;
                                                                                                    } else {
                                                                                                        str37 = str27;
                                                                                                        if (AbstractC1705a.G(xmlPullParser3, str37)) {
                                                                                                            arrayList34 = arrayList30;
                                                                                                            arrayList34.add(i(xmlPullParser3, str37));
                                                                                                            str75 = str93;
                                                                                                            str38 = str77;
                                                                                                            arrayList35 = arrayList31;
                                                                                                        } else {
                                                                                                            str75 = str93;
                                                                                                            arrayList34 = arrayList30;
                                                                                                            if (AbstractC1705a.G(xmlPullParser3, str75)) {
                                                                                                                arrayList35 = arrayList31;
                                                                                                                arrayList35.add(i(xmlPullParser3, str75));
                                                                                                                str38 = str77;
                                                                                                            } else {
                                                                                                                str38 = str77;
                                                                                                                arrayList35 = arrayList31;
                                                                                                                if (AbstractC1705a.G(xmlPullParser3, str38)) {
                                                                                                                    arrayList36 = arrayList32;
                                                                                                                    arrayList36.add(i(xmlPullParser3, str38));
                                                                                                                } else {
                                                                                                                    arrayList36 = arrayList32;
                                                                                                                    b(xmlPullParser);
                                                                                                                }
                                                                                                                j44 = j45;
                                                                                                                str39 = str79;
                                                                                                                i19 = i46;
                                                                                                            }
                                                                                                        }
                                                                                                        arrayList36 = arrayList32;
                                                                                                        j44 = j45;
                                                                                                        str39 = str79;
                                                                                                        i19 = i46;
                                                                                                    }
                                                                                                }
                                                                                                str38 = str77;
                                                                                                str39 = str79;
                                                                                                i19 = i46;
                                                                                                arrayList34 = arrayList30;
                                                                                                arrayList35 = arrayList31;
                                                                                                arrayList36 = arrayList32;
                                                                                            }
                                                                                            if (AbstractC1705a.E(xmlPullParser3, str39)) {
                                                                                                ArrayList arrayList76 = arrayList34;
                                                                                                xmlPullParser3 = xmlPullParser;
                                                                                                str27 = str37;
                                                                                                str77 = str38;
                                                                                                arrayList73 = arrayList35;
                                                                                                i46 = i19;
                                                                                                arrayList74 = arrayList36;
                                                                                                str79 = str39;
                                                                                                arrayList71 = arrayList29;
                                                                                                str84 = str36;
                                                                                                arrayList43 = arrayList4;
                                                                                                arrayList45 = arrayList5;
                                                                                                i45 = i10;
                                                                                                str82 = str19;
                                                                                                arrayList75 = arrayList33;
                                                                                                arrayList57 = arrayList19;
                                                                                                str85 = str16;
                                                                                                i41 = i11;
                                                                                                str49 = str2;
                                                                                                z8 = z10;
                                                                                                arrayList69 = arrayList20;
                                                                                                str87 = str21;
                                                                                                str64 = str35;
                                                                                                str74 = str34;
                                                                                                arrayList24 = arrayList26;
                                                                                                arrayList49 = arrayList27;
                                                                                                j14 = j15;
                                                                                                arrayList54 = arrayList25;
                                                                                                str60 = str15;
                                                                                                str78 = str32;
                                                                                                str57 = str12;
                                                                                                str61 = str3;
                                                                                                str65 = str31;
                                                                                                arrayList23 = arrayList15;
                                                                                                attributeValue14 = str33;
                                                                                                i43 = i14;
                                                                                                str58 = str13;
                                                                                                arrayList40 = arrayList16;
                                                                                                arrayList41 = arrayList17;
                                                                                                l15 = i17;
                                                                                                l16 = i16;
                                                                                                k7 = f10;
                                                                                                l17 = i18;
                                                                                                arrayList72 = arrayList76;
                                                                                                arrayList46 = arrayList;
                                                                                                arrayList47 = arrayList2;
                                                                                                i40 = i12;
                                                                                                f16 = f4;
                                                                                                str88 = str17;
                                                                                                str66 = str30;
                                                                                                j40 = j12;
                                                                                                i42 = i15;
                                                                                                j34 = j;
                                                                                                str59 = str14;
                                                                                                ArrayList arrayList77 = arrayList28;
                                                                                                str86 = str71;
                                                                                                arrayList70 = arrayList77;
                                                                                            } else {
                                                                                                if (n5.o.j(str81)) {
                                                                                                    str41 = n5.o.a(attributeValue16);
                                                                                                } else if (n5.o.l(str81)) {
                                                                                                    str41 = n5.o.i(attributeValue16);
                                                                                                } else {
                                                                                                    if (n5.o.k(str81) || "image".equals(n5.o.g(str81))) {
                                                                                                        str41 = str81;
                                                                                                        str40 = str41;
                                                                                                    } else {
                                                                                                        str40 = str81;
                                                                                                        if ("application/mp4".equals(str40)) {
                                                                                                            str41 = n5.o.d(attributeValue16);
                                                                                                            if ("text/vtt".equals(str41)) {
                                                                                                                str41 = "application/x-mp4-vtt";
                                                                                                            }
                                                                                                        } else {
                                                                                                            str41 = null;
                                                                                                        }
                                                                                                    }
                                                                                                    if (!"audio/eac3".equals(str41)) {
                                                                                                        int i48 = i7;
                                                                                                        while (true) {
                                                                                                            str42 = "ec+3";
                                                                                                            if (i48 < arrayList36.size()) {
                                                                                                                f fVar = (f) arrayList36.get(i48);
                                                                                                                String str96 = fVar.f9269a;
                                                                                                                boolean equals2 = "tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str96);
                                                                                                                String str97 = fVar.f9270b;
                                                                                                                if ((!equals2 || !"JOC".equals(str97)) && (!"tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str96) || !"ec+3".equals(str97))) {
                                                                                                                    i48++;
                                                                                                                }
                                                                                                            } else {
                                                                                                                str41 = "audio/eac3";
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    str42 = attributeValue16;
                                                                                                    int i49 = i7;
                                                                                                    i20 = i49;
                                                                                                    while (true) {
                                                                                                        String str98 = "urn:mpeg:dash:role:2011";
                                                                                                        if (i20 >= arrayList22.size()) {
                                                                                                            ArrayList arrayList78 = arrayList22;
                                                                                                            f fVar2 = (f) arrayList78.get(i20);
                                                                                                            if (u0.o("urn:mpeg:dash:role:2011", fVar2.f9269a)) {
                                                                                                                String str99 = fVar2.f9270b;
                                                                                                                i49 |= (str99 != null && (str99.equals("forced_subtitle") || str99.equals("forced-subtitle"))) ? 2 : i7;
                                                                                                            }
                                                                                                            i20++;
                                                                                                            arrayList22 = arrayList78;
                                                                                                        } else {
                                                                                                            ArrayList arrayList79 = arrayList22;
                                                                                                            int i50 = i7;
                                                                                                            int i51 = i50;
                                                                                                            while (i51 < arrayList79.size()) {
                                                                                                                f fVar3 = (f) arrayList79.get(i51);
                                                                                                                ArrayList arrayList80 = arrayList79;
                                                                                                                if (u0.o("urn:mpeg:dash:role:2011", fVar3.f9269a)) {
                                                                                                                    i50 = p(fVar3.f9270b) | i50;
                                                                                                                }
                                                                                                                i51++;
                                                                                                                arrayList79 = arrayList80;
                                                                                                            }
                                                                                                            ArrayList arrayList81 = arrayList79;
                                                                                                            int i52 = i7;
                                                                                                            int i53 = i52;
                                                                                                            while (i53 < arrayList28.size()) {
                                                                                                                ArrayList arrayList82 = arrayList28;
                                                                                                                f fVar4 = (f) arrayList82.get(i53);
                                                                                                                ArrayList arrayList83 = arrayList34;
                                                                                                                boolean o10 = u0.o(str98, fVar4.f9269a);
                                                                                                                String str100 = str98;
                                                                                                                String str101 = fVar4.f9270b;
                                                                                                                if (o10) {
                                                                                                                    i52 |= p(str101);
                                                                                                                } else if (u0.o("urn:tva:metadata:cs:AudioPurposeCS:2007", fVar4.f9269a)) {
                                                                                                                    if (str101 != null) {
                                                                                                                        switch (str101.hashCode()) {
                                                                                                                            case 49:
                                                                                                                                if (str101.equals("1")) {
                                                                                                                                    i26 = i7;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 50:
                                                                                                                                if (str101.equals("2")) {
                                                                                                                                    i26 = 1;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 51:
                                                                                                                                if (str101.equals("3")) {
                                                                                                                                    i26 = 2;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 52:
                                                                                                                                if (str101.equals("4")) {
                                                                                                                                    i26 = 3;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 54:
                                                                                                                                if (str101.equals("6")) {
                                                                                                                                    i26 = 4;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                        }
                                                                                                                        i26 = -1;
                                                                                                                        switch (i26) {
                                                                                                                            case 0:
                                                                                                                                i27 = 512;
                                                                                                                                break;
                                                                                                                            case 1:
                                                                                                                                i27 = 2048;
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                i27 = 4;
                                                                                                                                break;
                                                                                                                            case 3:
                                                                                                                                i27 = 8;
                                                                                                                                break;
                                                                                                                            case 4:
                                                                                                                                i27 = 1;
                                                                                                                                break;
                                                                                                                        }
                                                                                                                        i52 |= i27;
                                                                                                                    }
                                                                                                                    i27 = i7;
                                                                                                                    i52 |= i27;
                                                                                                                }
                                                                                                                i53++;
                                                                                                                arrayList28 = arrayList82;
                                                                                                                str98 = str100;
                                                                                                                arrayList34 = arrayList83;
                                                                                                            }
                                                                                                            ArrayList arrayList84 = arrayList34;
                                                                                                            ArrayList arrayList85 = arrayList28;
                                                                                                            int q10 = i52 | i50 | q(arrayList35) | q(arrayList36);
                                                                                                            int i54 = i7;
                                                                                                            while (true) {
                                                                                                                if (i54 < arrayList35.size()) {
                                                                                                                    f fVar5 = (f) arrayList35.get(i54);
                                                                                                                    if (u0.o("http://dashif.org/thumbnail_tile", fVar5.f9269a) || u0.o("http://dashif.org/guidelines/thumbnail_tile", fVar5.f9269a)) {
                                                                                                                        String str102 = fVar5.f9270b;
                                                                                                                        if (str102 != null) {
                                                                                                                            int i55 = D.f21141a;
                                                                                                                            String[] split = str102.split("x", -1);
                                                                                                                            if (split.length == 2) {
                                                                                                                                try {
                                                                                                                                    pair = Pair.create(Integer.valueOf(Integer.parseInt(split[i7])), Integer.valueOf(Integer.parseInt(split[1])));
                                                                                                                                } catch (NumberFormatException unused) {
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                        i25 = 1;
                                                                                                                    } else {
                                                                                                                        i25 = 1;
                                                                                                                    }
                                                                                                                    i54 += i25;
                                                                                                                } else {
                                                                                                                    pair = null;
                                                                                                                }
                                                                                                            }
                                                                                                            K k10 = new K();
                                                                                                            k10.f19976a = str33;
                                                                                                            k10.j = str40;
                                                                                                            k10.k = str41;
                                                                                                            k10.f19982h = str42;
                                                                                                            k10.g = i14;
                                                                                                            k10.f19979d = i49;
                                                                                                            k10.f19980e = q10;
                                                                                                            String str103 = str32;
                                                                                                            k10.f19978c = str103;
                                                                                                            k10.f19973D = pair != null ? ((Integer) pair.first).intValue() : -1;
                                                                                                            k10.f19974E = pair != null ? ((Integer) pair.second).intValue() : -1;
                                                                                                            if (n5.o.l(str41)) {
                                                                                                                k10.f19988p = i17;
                                                                                                                k10.f19989q = i16;
                                                                                                                k10.f19990r = f10;
                                                                                                            } else {
                                                                                                                int i56 = i17;
                                                                                                                int i57 = i16;
                                                                                                                if (n5.o.j(str41)) {
                                                                                                                    k10.f19996x = i19;
                                                                                                                    k10.f19997y = i18;
                                                                                                                } else {
                                                                                                                    if (n5.o.k(str41)) {
                                                                                                                        if ("application/cea-608".equals(str41)) {
                                                                                                                            int i58 = i7;
                                                                                                                            while (true) {
                                                                                                                                if (i58 < arrayList85.size()) {
                                                                                                                                    f fVar6 = (f) arrayList85.get(i58);
                                                                                                                                    if (!"urn:scte:dash:cc:cea-608:2015".equals(fVar6.f9269a) || (str44 = fVar6.f9270b) == null) {
                                                                                                                                        i23 = 1;
                                                                                                                                    } else {
                                                                                                                                        Matcher matcher = f9265c.matcher(str44);
                                                                                                                                        if (matcher.matches()) {
                                                                                                                                            i21 = Integer.parseInt(matcher.group(1));
                                                                                                                                        } else {
                                                                                                                                            i23 = 1;
                                                                                                                                            AbstractC1705a.S("MpdParser", "Unable to parse CEA-608 channel number from: ".concat(str44));
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    i58 += i23;
                                                                                                                                } else {
                                                                                                                                    i21 = -1;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            z12 = true;
                                                                                                                        } else {
                                                                                                                            if ("application/cea-708".equals(str41)) {
                                                                                                                                int i59 = i7;
                                                                                                                                while (i59 < arrayList85.size()) {
                                                                                                                                    f fVar7 = (f) arrayList85.get(i59);
                                                                                                                                    if (!"urn:scte:dash:cc:cea-708:2015".equals(fVar7.f9269a) || (str43 = fVar7.f9270b) == null) {
                                                                                                                                        i22 = 1;
                                                                                                                                    } else {
                                                                                                                                        Matcher matcher2 = f9266d.matcher(str43);
                                                                                                                                        if (matcher2.matches()) {
                                                                                                                                            z12 = true;
                                                                                                                                            i21 = Integer.parseInt(matcher2.group(1));
                                                                                                                                        } else {
                                                                                                                                            i22 = 1;
                                                                                                                                            AbstractC1705a.S("MpdParser", "Unable to parse CEA-708 service block number from: ".concat(str43));
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    i59 += i22;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            z12 = true;
                                                                                                                            i21 = -1;
                                                                                                                        }
                                                                                                                        k10.f19972C = i21;
                                                                                                                    } else {
                                                                                                                        z12 = true;
                                                                                                                        if ("image".equals(n5.o.g(str41))) {
                                                                                                                            k10.f19988p = i56;
                                                                                                                            k10.f19989q = i57;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    m4.L l18 = new m4.L(k10);
                                                                                                                    d dVar2 = new d(l18, arrayList33.isEmpty() ? arrayList33 : arrayList26, sVar4 == null ? sVar4 : new r(null, 1L, 0L, 0L, 0L), str89, arrayList29, arrayList84, arrayList35, arrayList36);
                                                                                                                    int h13 = n5.o.h(l18.f20096z);
                                                                                                                    i24 = i15;
                                                                                                                    if (i24 != -1) {
                                                                                                                        i24 = h13;
                                                                                                                    } else if (h13 != -1) {
                                                                                                                        AbstractC1705a.m(i24 == h13 ? z12 : i7);
                                                                                                                    }
                                                                                                                    ArrayList arrayList86 = arrayList25;
                                                                                                                    arrayList86.add(dVar2);
                                                                                                                    arrayList18 = arrayList86;
                                                                                                                    str72 = str103;
                                                                                                                    i33 = i24;
                                                                                                                    z11 = z12;
                                                                                                                    arrayList12 = arrayList85;
                                                                                                                    str23 = str63;
                                                                                                                    str25 = str68;
                                                                                                                    str26 = str35;
                                                                                                                    arrayList14 = arrayList81;
                                                                                                                    arrayList21 = arrayList27;
                                                                                                                    str24 = str31;
                                                                                                                    str22 = str30;
                                                                                                                    xmlPullParser2 = xmlPullParser;
                                                                                                                }
                                                                                                            }
                                                                                                            z12 = true;
                                                                                                            m4.L l182 = new m4.L(k10);
                                                                                                            if (sVar4 == null) {
                                                                                                            }
                                                                                                            d dVar22 = new d(l182, arrayList33.isEmpty() ? arrayList33 : arrayList26, sVar4 == null ? sVar4 : new r(null, 1L, 0L, 0L, 0L), str89, arrayList29, arrayList84, arrayList35, arrayList36);
                                                                                                            int h132 = n5.o.h(l182.f20096z);
                                                                                                            i24 = i15;
                                                                                                            if (i24 != -1) {
                                                                                                            }
                                                                                                            ArrayList arrayList862 = arrayList25;
                                                                                                            arrayList862.add(dVar22);
                                                                                                            arrayList18 = arrayList862;
                                                                                                            str72 = str103;
                                                                                                            i33 = i24;
                                                                                                            z11 = z12;
                                                                                                            arrayList12 = arrayList85;
                                                                                                            str23 = str63;
                                                                                                            str25 = str68;
                                                                                                            str26 = str35;
                                                                                                            arrayList14 = arrayList81;
                                                                                                            arrayList21 = arrayList27;
                                                                                                            str24 = str31;
                                                                                                            str22 = str30;
                                                                                                            xmlPullParser2 = xmlPullParser;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                str40 = str81;
                                                                                                if (!"audio/eac3".equals(str41)) {
                                                                                                }
                                                                                                str42 = attributeValue16;
                                                                                                int i492 = i7;
                                                                                                i20 = i492;
                                                                                                while (true) {
                                                                                                    String str982 = "urn:mpeg:dash:role:2011";
                                                                                                    if (i20 >= arrayList22.size()) {
                                                                                                    }
                                                                                                    i20++;
                                                                                                    arrayList22 = arrayList78;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                str12 = str57;
                                                                                j = j34;
                                                                                str13 = str58;
                                                                                str37 = str27;
                                                                                arrayList16 = arrayList40;
                                                                                arrayList17 = arrayList41;
                                                                                str14 = str59;
                                                                                str15 = str60;
                                                                                str3 = str61;
                                                                                arrayList4 = arrayList43;
                                                                                j12 = j40;
                                                                                arrayList5 = arrayList45;
                                                                                arrayList = arrayList46;
                                                                                arrayList2 = arrayList47;
                                                                                str30 = str66;
                                                                                str31 = str65;
                                                                                i14 = i43;
                                                                                f10 = k7;
                                                                                i16 = l16;
                                                                                i12 = i40;
                                                                                i17 = l15;
                                                                                arrayList25 = arrayList54;
                                                                                str32 = str78;
                                                                                arrayList19 = arrayList57;
                                                                                j15 = j14;
                                                                                arrayList15 = arrayList23;
                                                                                str33 = attributeValue14;
                                                                                str19 = str82;
                                                                                i15 = i42;
                                                                                i18 = l17;
                                                                                arrayList36 = arrayList74;
                                                                                str17 = str88;
                                                                                i10 = i45;
                                                                                f4 = f16;
                                                                                str21 = str29;
                                                                                i7 = 0;
                                                                                str34 = str74;
                                                                                str16 = str85;
                                                                                arrayList20 = arrayList69;
                                                                                i11 = i41;
                                                                                z10 = z8;
                                                                                arrayList33 = arrayList75;
                                                                                arrayList26 = arrayList24;
                                                                                str35 = str64;
                                                                                arrayList27 = arrayList49;
                                                                                str38 = str77;
                                                                                str39 = str79;
                                                                                arrayList29 = arrayList71;
                                                                                arrayList34 = arrayList72;
                                                                                arrayList35 = arrayList73;
                                                                                i19 = i46;
                                                                                str2 = str49;
                                                                                str36 = str84;
                                                                                String str104 = str86;
                                                                                arrayList28 = arrayList70;
                                                                                str71 = str104;
                                                                                if (AbstractC1705a.E(xmlPullParser3, str39)) {
                                                                                }
                                                                            }
                                                                        } else {
                                                                            arrayList11 = arrayList52;
                                                                            arrayList12 = arrayList50;
                                                                            arrayList13 = arrayList55;
                                                                            str12 = str57;
                                                                            arrayList14 = arrayList51;
                                                                            arrayList15 = arrayList48;
                                                                            XmlPullParser xmlPullParser4 = xmlPullParser3;
                                                                            j = j34;
                                                                            str13 = str58;
                                                                            arrayList16 = arrayList40;
                                                                            arrayList17 = arrayList41;
                                                                            str14 = str59;
                                                                            str15 = str60;
                                                                            str3 = str61;
                                                                            arrayList4 = arrayList43;
                                                                            j12 = j40;
                                                                            arrayList5 = arrayList45;
                                                                            arrayList = arrayList46;
                                                                            arrayList2 = arrayList47;
                                                                            String str105 = str66;
                                                                            String str106 = str65;
                                                                            ArrayList arrayList87 = arrayList49;
                                                                            i10 = i30;
                                                                            f4 = f13;
                                                                            str16 = str69;
                                                                            i11 = i31;
                                                                            arrayList18 = arrayList54;
                                                                            str17 = str70;
                                                                            i12 = i32;
                                                                            str18 = str78;
                                                                            arrayList19 = arrayList57;
                                                                            j15 = j14;
                                                                            i7 = 0;
                                                                            z11 = true;
                                                                            i13 = i33;
                                                                            arrayList20 = arrayList69;
                                                                            z10 = z8;
                                                                            str19 = str62;
                                                                            str20 = str64;
                                                                            str21 = str67;
                                                                            str2 = str49;
                                                                            if (AbstractC1705a.G(xmlPullParser4, str106)) {
                                                                                sVar2 = r(xmlPullParser4, (r) sVar2);
                                                                                xmlPullParser2 = xmlPullParser4;
                                                                                str24 = str106;
                                                                                str72 = str18;
                                                                                i33 = i13;
                                                                                str23 = str63;
                                                                                str25 = str68;
                                                                                str26 = str20;
                                                                                arrayList21 = arrayList87;
                                                                                str22 = str105;
                                                                            } else {
                                                                                str22 = str105;
                                                                                if (AbstractC1705a.G(xmlPullParser4, str22)) {
                                                                                    j41 = d(xmlPullParser4, j41);
                                                                                    xmlPullParser2 = xmlPullParser4;
                                                                                    sVar2 = s(xmlPullParser, (o) sVar2, j36, j37, j15, j41, j25);
                                                                                    str24 = str106;
                                                                                    str72 = str18;
                                                                                    i33 = i13;
                                                                                    str23 = str63;
                                                                                } else {
                                                                                    xmlPullParser2 = xmlPullParser4;
                                                                                    String str107 = str63;
                                                                                    j16 = j41;
                                                                                    if (AbstractC1705a.G(xmlPullParser2, str107)) {
                                                                                        j41 = d(xmlPullParser2, j16);
                                                                                        str23 = str107;
                                                                                        str24 = str106;
                                                                                        sVar2 = t(xmlPullParser, (p) sVar2, arrayList20, j36, j37, j15, j41, j25);
                                                                                        str72 = str18;
                                                                                        i33 = i13;
                                                                                    } else {
                                                                                        str23 = str107;
                                                                                        str24 = str106;
                                                                                        if (AbstractC1705a.G(xmlPullParser2, "InbandEventStream")) {
                                                                                            arrayList21 = arrayList87;
                                                                                            arrayList21.add(i(xmlPullParser2, "InbandEventStream"));
                                                                                        } else {
                                                                                            arrayList21 = arrayList87;
                                                                                            if (AbstractC1705a.G(xmlPullParser2, "Label")) {
                                                                                                str25 = "";
                                                                                                do {
                                                                                                    xmlPullParser.next();
                                                                                                    if (xmlPullParser.getEventType() == 4) {
                                                                                                        str25 = xmlPullParser.getText();
                                                                                                    } else {
                                                                                                        b(xmlPullParser);
                                                                                                    }
                                                                                                } while (!AbstractC1705a.E(xmlPullParser2, "Label"));
                                                                                                j41 = j16;
                                                                                                str72 = str18;
                                                                                                i33 = i13;
                                                                                                str26 = str20;
                                                                                            } else if (AbstractC1705a.F(xmlPullParser)) {
                                                                                                b(xmlPullParser);
                                                                                            }
                                                                                        }
                                                                                        j41 = j16;
                                                                                        str72 = str18;
                                                                                        i33 = i13;
                                                                                        str25 = str68;
                                                                                        str26 = str20;
                                                                                    }
                                                                                }
                                                                                str25 = str68;
                                                                                str26 = str20;
                                                                                arrayList21 = arrayList87;
                                                                            }
                                                                        }
                                                                        if (AbstractC1705a.E(xmlPullParser2, str26)) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        arrayList11 = arrayList52;
                                                        arrayList12 = arrayList50;
                                                        arrayList13 = arrayList55;
                                                        str12 = str57;
                                                        arrayList14 = arrayList51;
                                                        arrayList15 = arrayList48;
                                                        str = str50;
                                                        j = j34;
                                                        str13 = str58;
                                                        arrayList16 = arrayList40;
                                                        arrayList17 = arrayList41;
                                                        str14 = str59;
                                                        str15 = str60;
                                                        str3 = str61;
                                                        arrayList4 = arrayList43;
                                                        j12 = j40;
                                                        arrayList5 = arrayList45;
                                                        str23 = str63;
                                                        arrayList = arrayList46;
                                                        arrayList2 = arrayList47;
                                                        str22 = str66;
                                                        arrayList21 = arrayList49;
                                                        i10 = i30;
                                                        f4 = f13;
                                                        str16 = str69;
                                                        i11 = i31;
                                                        arrayList18 = arrayList54;
                                                        str17 = str70;
                                                        i12 = i32;
                                                        arrayList20 = arrayList56;
                                                        arrayList19 = arrayList57;
                                                        j15 = j14;
                                                        i7 = 0;
                                                        z11 = true;
                                                        i13 = i33;
                                                        str18 = str72;
                                                        z10 = z8;
                                                        str19 = str62;
                                                        str20 = str64;
                                                        str21 = str67;
                                                        j16 = j41;
                                                        str2 = str49;
                                                        xmlPullParser2 = xmlPullParser3;
                                                        str24 = str65;
                                                        j41 = j16;
                                                        str72 = str18;
                                                        i33 = i13;
                                                        str25 = str68;
                                                        str26 = str20;
                                                        if (AbstractC1705a.E(xmlPullParser2, str26)) {
                                                        }
                                                    }
                                                }
                                                arrayList11 = arrayList52;
                                                arrayList12 = arrayList50;
                                                arrayList13 = arrayList55;
                                                str12 = str57;
                                                arrayList14 = arrayList51;
                                                arrayList15 = arrayList48;
                                                str = str50;
                                                j = j34;
                                                str13 = str58;
                                                arrayList16 = arrayList40;
                                                arrayList17 = arrayList41;
                                                str14 = str59;
                                                str15 = str60;
                                                str3 = str61;
                                                arrayList4 = arrayList43;
                                                j12 = j40;
                                                arrayList5 = arrayList45;
                                                str23 = str63;
                                                arrayList = arrayList46;
                                                arrayList2 = arrayList47;
                                                str26 = str64;
                                                str22 = str66;
                                                str25 = str68;
                                                arrayList21 = arrayList49;
                                                i10 = i30;
                                                f4 = f13;
                                                str16 = str69;
                                                i11 = i31;
                                                arrayList18 = arrayList54;
                                                str17 = str70;
                                                i12 = i32;
                                                arrayList20 = arrayList56;
                                                arrayList19 = arrayList57;
                                                j15 = j14;
                                                i7 = 0;
                                                z11 = true;
                                            }
                                            z10 = z8;
                                            str19 = str62;
                                            str2 = str49;
                                            str21 = str67;
                                            xmlPullParser2 = xmlPullParser3;
                                            str24 = str65;
                                            if (AbstractC1705a.E(xmlPullParser2, str26)) {
                                            }
                                        }
                                    } else {
                                        j11 = j29;
                                        arrayList = p10;
                                        arrayList2 = arrayList38;
                                        String str108 = str57;
                                        z10 = z8;
                                        str = str50;
                                        str2 = str49;
                                        j = j34;
                                        String str109 = str58;
                                        ArrayList arrayList88 = arrayList41;
                                        String str110 = str59;
                                        String str111 = str60;
                                        str3 = str61;
                                        arrayList4 = arrayList43;
                                        j12 = j40;
                                        i7 = 0;
                                        z11 = true;
                                        arrayList5 = arrayList42;
                                        xmlPullParser2 = xmlPullParser3;
                                        ArrayList arrayList89 = arrayList40;
                                        if (AbstractC1705a.G(xmlPullParser2, "EventStream")) {
                                            String str112 = str110;
                                            String attributeValue17 = xmlPullParser2.getAttributeValue(null, str112);
                                            if (attributeValue17 == null) {
                                                attributeValue17 = "";
                                            }
                                            String attributeValue18 = xmlPullParser2.getAttributeValue(null, str109);
                                            String str113 = attributeValue18 == null ? "" : attributeValue18;
                                            long m13 = m(xmlPullParser2, "timescale", 1L);
                                            long j46 = 0;
                                            long m14 = m(xmlPullParser2, "presentationTimeOffset", 0L);
                                            ArrayList arrayList90 = new ArrayList();
                                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(512);
                                            while (true) {
                                                xmlPullParser.next();
                                                String str114 = "Event";
                                                if (AbstractC1705a.G(xmlPullParser2, "Event")) {
                                                    String str115 = str108;
                                                    long m15 = m(xmlPullParser2, str115, j46);
                                                    String str116 = str111;
                                                    long m16 = m(xmlPullParser2, str116, -9223372036854775807L);
                                                    long m17 = m(xmlPullParser2, "presentationTime", j46);
                                                    long T10 = D.T(m16, 1000L, m13);
                                                    long T11 = D.T(m17 - m14, 1000000L, m13);
                                                    String attributeValue19 = xmlPullParser2.getAttributeValue(null, "messageData");
                                                    String str117 = attributeValue19 == null ? null : attributeValue19;
                                                    byteArrayOutputStream2.reset();
                                                    XmlSerializer newSerializer = Xml.newSerializer();
                                                    newSerializer.setOutput(byteArrayOutputStream2, M6.e.f6799c.name());
                                                    xmlPullParser.nextToken();
                                                    while (!AbstractC1705a.E(xmlPullParser2, str114)) {
                                                        switch (xmlPullParser.getEventType()) {
                                                            case 0:
                                                                str10 = str114;
                                                                arrayList10 = arrayList90;
                                                                str11 = str116;
                                                                newSerializer.startDocument(null, Boolean.FALSE);
                                                                break;
                                                            case 1:
                                                                str10 = str114;
                                                                arrayList10 = arrayList90;
                                                                str11 = str116;
                                                                newSerializer.endDocument();
                                                                break;
                                                            case 2:
                                                                str10 = str114;
                                                                newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                int i60 = 0;
                                                                while (i60 < xmlPullParser.getAttributeCount()) {
                                                                    newSerializer.attribute(xmlPullParser2.getAttributeNamespace(i60), xmlPullParser2.getAttributeName(i60), xmlPullParser2.getAttributeValue(i60));
                                                                    i60++;
                                                                    arrayList90 = arrayList90;
                                                                    str116 = str116;
                                                                }
                                                                arrayList10 = arrayList90;
                                                                str11 = str116;
                                                                break;
                                                            case 3:
                                                                str10 = str114;
                                                                newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                arrayList10 = arrayList90;
                                                                str11 = str116;
                                                                break;
                                                            case 4:
                                                                newSerializer.text(xmlPullParser.getText());
                                                                str10 = str114;
                                                                arrayList10 = arrayList90;
                                                                str11 = str116;
                                                                break;
                                                            case 5:
                                                                newSerializer.cdsect(xmlPullParser.getText());
                                                                str10 = str114;
                                                                arrayList10 = arrayList90;
                                                                str11 = str116;
                                                                break;
                                                            case 6:
                                                                newSerializer.entityRef(xmlPullParser.getText());
                                                                str10 = str114;
                                                                arrayList10 = arrayList90;
                                                                str11 = str116;
                                                                break;
                                                            case 7:
                                                                newSerializer.ignorableWhitespace(xmlPullParser.getText());
                                                                str10 = str114;
                                                                arrayList10 = arrayList90;
                                                                str11 = str116;
                                                                break;
                                                            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                                                                newSerializer.processingInstruction(xmlPullParser.getText());
                                                                str10 = str114;
                                                                arrayList10 = arrayList90;
                                                                str11 = str116;
                                                                break;
                                                            case 9:
                                                                newSerializer.comment(xmlPullParser.getText());
                                                                str10 = str114;
                                                                arrayList10 = arrayList90;
                                                                str11 = str116;
                                                                break;
                                                            case 10:
                                                                newSerializer.docdecl(xmlPullParser.getText());
                                                                str10 = str114;
                                                                arrayList10 = arrayList90;
                                                                str11 = str116;
                                                                break;
                                                            default:
                                                                str10 = str114;
                                                                arrayList10 = arrayList90;
                                                                str11 = str116;
                                                                break;
                                                        }
                                                        xmlPullParser.nextToken();
                                                        str114 = str10;
                                                        arrayList90 = arrayList10;
                                                        str116 = str11;
                                                    }
                                                    ArrayList arrayList91 = arrayList90;
                                                    str111 = str116;
                                                    newSerializer.flush();
                                                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                                                    Long valueOf = Long.valueOf(T11);
                                                    if (str117 != null) {
                                                        byteArray = str117.getBytes(M6.e.f6799c);
                                                    }
                                                    str9 = str112;
                                                    arrayList8 = arrayList89;
                                                    byteArrayOutputStream = byteArrayOutputStream2;
                                                    str4 = str115;
                                                    j13 = 0;
                                                    arrayList9 = arrayList91;
                                                    arrayList9.add(Pair.create(valueOf, new H4.a(attributeValue17, str113, T10, m15, byteArray)));
                                                } else {
                                                    byteArrayOutputStream = byteArrayOutputStream2;
                                                    j13 = j46;
                                                    str9 = str112;
                                                    arrayList8 = arrayList89;
                                                    str4 = str108;
                                                    arrayList9 = arrayList90;
                                                    b(xmlPullParser);
                                                }
                                                if (AbstractC1705a.E(xmlPullParser2, "EventStream")) {
                                                    long[] jArr = new long[arrayList9.size()];
                                                    H4.a[] aVarArr = new H4.a[arrayList9.size()];
                                                    for (int i61 = 0; i61 < arrayList9.size(); i61++) {
                                                        Pair pair2 = (Pair) arrayList9.get(i61);
                                                        jArr[i61] = ((Long) pair2.first).longValue();
                                                        aVarArr[i61] = (H4.a) pair2.second;
                                                    }
                                                    arrayList88.add(new g(attributeValue17, str113, jArr, aVarArr));
                                                    arrayList6 = arrayList88;
                                                    str5 = str109;
                                                    str6 = str9;
                                                    str7 = str111;
                                                    arrayList7 = arrayList8;
                                                    j10 = -9223372036854775807L;
                                                } else {
                                                    arrayList90 = arrayList9;
                                                    str108 = str4;
                                                    j46 = j13;
                                                    byteArrayOutputStream2 = byteArrayOutputStream;
                                                    str112 = str9;
                                                    arrayList89 = arrayList8;
                                                }
                                            }
                                        } else {
                                            str4 = str108;
                                            str5 = str109;
                                            if (AbstractC1705a.G(xmlPullParser2, "SegmentBase")) {
                                                sVar = r(xmlPullParser2, null);
                                                arrayList6 = arrayList88;
                                                j39 = j12;
                                                str6 = str110;
                                                str7 = str111;
                                                str8 = str3;
                                                arrayList7 = arrayList89;
                                                j10 = -9223372036854775807L;
                                            } else if (AbstractC1705a.G(xmlPullParser2, "SegmentList")) {
                                                long d12 = d(xmlPullParser2, -9223372036854775807L);
                                                j39 = j12;
                                                arrayList6 = arrayList88;
                                                j10 = -9223372036854775807L;
                                                str6 = str110;
                                                str7 = str111;
                                                sVar = s(xmlPullParser, null, j36, j37, j39, d12, j25);
                                                j38 = d12;
                                                str8 = str3;
                                                arrayList7 = arrayList89;
                                            } else {
                                                arrayList6 = arrayList88;
                                                str6 = str110;
                                                str7 = str111;
                                                j10 = -9223372036854775807L;
                                                if (AbstractC1705a.G(xmlPullParser2, "SegmentTemplate")) {
                                                    long d13 = d(xmlPullParser2, -9223372036854775807L);
                                                    F f18 = H.f7232b;
                                                    arrayList7 = arrayList89;
                                                    sVar = t(xmlPullParser, null, t0.f7341e, j36, j37, j12, d13, j25);
                                                    j39 = j12;
                                                    j38 = d13;
                                                    str8 = str3;
                                                } else {
                                                    arrayList7 = arrayList89;
                                                    if (AbstractC1705a.G(xmlPullParser2, "AssetIdentifier")) {
                                                        i(xmlPullParser2, "AssetIdentifier");
                                                    } else {
                                                        b(xmlPullParser);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j39 = j12;
                                    str8 = str3;
                                }
                                if (AbstractC1705a.E(xmlPullParser2, str8)) {
                                    Pair create = Pair.create(new h(attributeValue8, j35, arrayList7, arrayList6), Long.valueOf(j37));
                                    h hVar = (h) create.first;
                                    if (hVar.f9277b != j10) {
                                        long longValue = ((Long) create.second).longValue();
                                        long j47 = longValue == j10 ? j10 : hVar.f9277b + longValue;
                                        arrayList3 = arrayList37;
                                        arrayList3.add(hVar);
                                        j29 = j47;
                                        z13 = z16;
                                    } else {
                                        if (!equals) {
                                            throw C1586o0.b("Unable to determine start of period " + arrayList37.size(), null);
                                        }
                                        arrayList3 = arrayList37;
                                        j29 = j11;
                                        z13 = z11;
                                    }
                                    z16 = z13;
                                } else {
                                    str56 = str8;
                                    xmlPullParser3 = xmlPullParser2;
                                    p10 = arrayList;
                                    arrayList38 = arrayList2;
                                    arrayList39 = arrayList4;
                                    str57 = str4;
                                    arrayList42 = arrayList5;
                                    str59 = str6;
                                    str58 = str5;
                                    j34 = j;
                                    j29 = j11;
                                    str49 = str2;
                                    z8 = z10;
                                    str50 = str;
                                    arrayList40 = arrayList7;
                                    str60 = str7;
                                    arrayList41 = arrayList6;
                                }
                            }
                        }
                        if (!AbstractC1705a.E(xmlPullParser2, "MPD")) {
                        }
                    }
                    i7 = i28;
                    xmlPullParser2 = xmlPullParser3;
                    arrayList3 = arrayList37;
                    j10 = -9223372036854775807L;
                    z11 = true;
                    if (!AbstractC1705a.E(xmlPullParser2, "MPD")) {
                    }
                }
            }
            j10 = j21;
            if (!AbstractC1705a.E(xmlPullParser2, "MPD")) {
            }
        }
    }

    public static j o(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j10;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j10 = (Long.parseLong(split[1]) - j) + 1;
                return new j(j, j10, attributeValue);
            }
        } else {
            j = 0;
        }
        j10 = -1;
        return new j(j, j10, attributeValue);
    }

    public static int p(String str) {
        if (str == null) {
            return 0;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2060497896:
                if (str.equals("subtitle")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1724546052:
                if (str.equals("description")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1580883024:
                if (str.equals("enhanced-audio-intelligibility")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1574842690:
                if (str.equals("forced_subtitle")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1408024454:
                if (str.equals("alternate")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1396432756:
                if (str.equals("forced-subtitle")) {
                    c10 = 5;
                    break;
                }
                break;
            case 99825:
                if (str.equals("dub")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3343801:
                if (str.equals("main")) {
                    c10 = 7;
                    break;
                }
                break;
            case 3530173:
                if (str.equals("sign")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 552573414:
                if (str.equals("caption")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 899152809:
                if (str.equals("commentary")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1629013393:
                if (str.equals("emergency")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1855372047:
                if (str.equals("supplementary")) {
                    c10 = '\f';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 3:
            case 5:
                return 128;
            case 1:
                return 512;
            case 2:
                return 2048;
            case 4:
                return 2;
            case 6:
                return 16;
            case 7:
                return 1;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return 256;
            case '\t':
                return 64;
            case '\n':
                return 8;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return 32;
            case '\f':
                return 4;
            default:
                return 0;
        }
    }

    public static int q(ArrayList arrayList) {
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (u0.o("http://dashif.org/guidelines/trickmode", ((f) arrayList.get(i10)).f9269a)) {
                i7 = 16384;
            }
        }
        return i7;
    }

    public static r r(XmlPullParser xmlPullParser, r rVar) {
        long j;
        long j10;
        long m10 = m(xmlPullParser, "timescale", rVar != null ? rVar.f9308b : 1L);
        long m11 = m(xmlPullParser, "presentationTimeOffset", rVar != null ? rVar.f9309c : 0L);
        long j11 = rVar != null ? rVar.f9305d : 0L;
        long j12 = rVar != null ? rVar.f9306e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            long parseLong = Long.parseLong(split[0]);
            j = (Long.parseLong(split[1]) - parseLong) + 1;
            j10 = parseLong;
        } else {
            j = j12;
            j10 = j11;
        }
        j jVar = rVar != null ? rVar.f9307a : null;
        do {
            xmlPullParser.next();
            if (AbstractC1705a.G(xmlPullParser, "Initialization")) {
                jVar = o(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC1705a.E(xmlPullParser, "SegmentBase"));
        return new r(jVar, m10, m11, j10, j);
    }

    public static o s(XmlPullParser xmlPullParser, o oVar, long j, long j10, long j11, long j12, long j13) {
        long m10 = m(xmlPullParser, "timescale", oVar != null ? oVar.f9308b : 1L);
        long m11 = m(xmlPullParser, "presentationTimeOffset", oVar != null ? oVar.f9309c : 0L);
        long m12 = m(xmlPullParser, "duration", oVar != null ? oVar.f9298e : -9223372036854775807L);
        long m13 = m(xmlPullParser, "startNumber", oVar != null ? oVar.f9297d : 1L);
        long j14 = j12 == -9223372036854775807L ? j11 : j12;
        long j15 = j14 == Long.MAX_VALUE ? -9223372036854775807L : j14;
        List list = null;
        j jVar = null;
        List list2 = null;
        do {
            xmlPullParser.next();
            if (AbstractC1705a.G(xmlPullParser, "Initialization")) {
                jVar = o(xmlPullParser, "sourceURL", "range");
            } else if (AbstractC1705a.G(xmlPullParser, "SegmentTimeline")) {
                list2 = u(xmlPullParser, m10, j10);
            } else if (AbstractC1705a.G(xmlPullParser, "SegmentURL")) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(o(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC1705a.E(xmlPullParser, "SegmentList"));
        if (oVar != null) {
            if (jVar == null) {
                jVar = oVar.f9307a;
            }
            if (list2 == null) {
                list2 = oVar.f9299f;
            }
            if (list == null) {
                list = oVar.j;
            }
        }
        return new o(jVar, m10, m11, m13, m12, list2, j15, list, D.M(j13), D.M(j));
    }

    public static p t(XmlPullParser xmlPullParser, p pVar, List list, long j, long j10, long j11, long j12, long j13) {
        long j14;
        long m10 = m(xmlPullParser, "timescale", pVar != null ? pVar.f9308b : 1L);
        long m11 = m(xmlPullParser, "presentationTimeOffset", pVar != null ? pVar.f9309c : 0L);
        long m12 = m(xmlPullParser, "duration", pVar != null ? pVar.f9298e : -9223372036854775807L);
        long m13 = m(xmlPullParser, "startNumber", pVar != null ? pVar.f9297d : 1L);
        int i7 = 0;
        while (true) {
            if (i7 >= list.size()) {
                j14 = -1;
                break;
            }
            f fVar = (f) list.get(i7);
            if (u0.o("http://dashif.org/guidelines/last-segment-number", fVar.f9269a)) {
                j14 = Long.parseLong(fVar.f9270b);
                break;
            }
            i7++;
        }
        long j15 = j14;
        long j16 = j12 == -9223372036854775807L ? j11 : j12;
        long j17 = j16 == Long.MAX_VALUE ? -9223372036854775807L : j16;
        j jVar = null;
        E5.o v10 = v(xmlPullParser, "media", pVar != null ? pVar.k : null);
        E5.o v11 = v(xmlPullParser, "initialization", pVar != null ? pVar.j : null);
        List list2 = null;
        do {
            xmlPullParser.next();
            if (AbstractC1705a.G(xmlPullParser, "Initialization")) {
                jVar = o(xmlPullParser, "sourceURL", "range");
            } else if (AbstractC1705a.G(xmlPullParser, "SegmentTimeline")) {
                list2 = u(xmlPullParser, m10, j10);
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC1705a.E(xmlPullParser, "SegmentTemplate"));
        if (pVar != null) {
            if (jVar == null) {
                jVar = pVar.f9307a;
            }
            if (list2 == null) {
                list2 = pVar.f9299f;
            }
        }
        return new p(jVar, m10, m11, m13, j15, m12, list2, j17, v11, v10, D.M(j13), D.M(j));
    }

    public static ArrayList u(XmlPullParser xmlPullParser, long j, long j10) {
        ArrayList arrayList = new ArrayList();
        long j11 = 0;
        long j12 = -9223372036854775807L;
        boolean z8 = false;
        int i7 = 0;
        do {
            xmlPullParser.next();
            if (AbstractC1705a.G(xmlPullParser, "S")) {
                long m10 = m(xmlPullParser, "t", -9223372036854775807L);
                if (z8) {
                    j11 = a(arrayList, j11, j12, i7, m10);
                }
                if (m10 == -9223372036854775807L) {
                    m10 = j11;
                }
                long m11 = m(xmlPullParser, "d", -9223372036854775807L);
                i7 = l(xmlPullParser, "r", 0);
                z8 = true;
                j12 = m11;
                j11 = m10;
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC1705a.E(xmlPullParser, "SegmentTimeline"));
        if (z8) {
            a(arrayList, j11, j12, i7, D.T(j10, j, 1000L));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [E5.o, java.lang.Object] */
    public static E5.o v(XmlPullParser xmlPullParser, String str, E5.o oVar) {
        String str2;
        char c10;
        int i7 = -1;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return oVar;
        }
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        strArr[0] = "";
        int i10 = 0;
        int i11 = 0;
        while (i10 < attributeValue.length()) {
            int indexOf = attributeValue.indexOf("$", i10);
            if (indexOf == i7) {
                strArr[i11] = strArr[i11] + attributeValue.substring(i10);
                i10 = attributeValue.length();
            } else if (indexOf != i10) {
                strArr[i11] = strArr[i11] + attributeValue.substring(i10, indexOf);
                i10 = indexOf;
            } else if (attributeValue.startsWith("$$", i10)) {
                strArr[i11] = h3.o.p(new StringBuilder(), strArr[i11], "$");
                i10 += 2;
            } else {
                int i12 = i10 + 1;
                int indexOf2 = attributeValue.indexOf("$", i12);
                String substring = attributeValue.substring(i12, indexOf2);
                if (substring.equals("RepresentationID")) {
                    iArr[i11] = 1;
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != i7) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d") && !str2.endsWith("x") && !str2.endsWith("X")) {
                            str2 = str2.concat("d");
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    substring.getClass();
                    switch (substring.hashCode()) {
                        case -1950496919:
                            if (substring.equals("Number")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 2606829:
                            if (substring.equals("Time")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 38199441:
                            if (substring.equals("Bandwidth")) {
                                c10 = 2;
                                break;
                            }
                            break;
                    }
                    c10 = 65535;
                    switch (c10) {
                        case 0:
                            iArr[i11] = 2;
                            break;
                        case 1:
                            iArr[i11] = 4;
                            break;
                        case 2:
                            iArr[i11] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                    }
                    strArr2[i11] = str2;
                }
                i11++;
                strArr[i11] = "";
                i10 = indexOf2 + 1;
            }
            i7 = -1;
        }
        ?? obj = new Object();
        obj.f3713b = strArr;
        obj.f3714c = iArr;
        obj.f3715d = strArr2;
        obj.f3712a = i11;
        return obj;
    }

    @Override // m5.L
    public final Object g(Uri uri, C1618o c1618o) {
        try {
            XmlPullParser newPullParser = this.f9268a.newPullParser();
            newPullParser.setInput(c1618o, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return n(newPullParser, uri);
            }
            throw C1586o0.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e2) {
            throw C1586o0.b(null, e2);
        }
    }
}
