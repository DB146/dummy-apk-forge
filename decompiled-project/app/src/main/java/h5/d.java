package h5;

import A9.C0154x0;
import A9.O0;
import H2.O;
import N6.D0;
import N6.G0;
import N6.L;
import N6.M;
import N6.r;
import N6.z0;
import a5.i;
import android.text.Layout;
import android.text.TextUtils;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n5.AbstractC1705a;
import n5.AbstractC1706b;
import n5.D;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import y.S;
import y7.u0;

/* loaded from: classes.dex */
public final class d extends a5.f {

    /* renamed from: B, reason: collision with root package name */
    public static final Pattern f17780B = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: C, reason: collision with root package name */
    public static final Pattern f17781C = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: D, reason: collision with root package name */
    public static final Pattern f17782D = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: E, reason: collision with root package name */
    public static final Pattern f17783E = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: F, reason: collision with root package name */
    public static final Pattern f17784F = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: G, reason: collision with root package name */
    public static final Pattern f17785G = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: H, reason: collision with root package name */
    public static final Pattern f17786H = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: I, reason: collision with root package name */
    public static final C1253c f17787I = new C1253c(30.0f, 1, 1);

    /* renamed from: J, reason: collision with root package name */
    public static final C0154x0 f17788J = new C0154x0(15);

    /* renamed from: A, reason: collision with root package name */
    public final XmlPullParserFactory f17789A;

    public d() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f17789A = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    public static g g(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    public static boolean i(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static C0154x0 j(XmlPullParser xmlPullParser, C0154x0 c0154x0) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return c0154x0;
        }
        Matcher matcher = f17786H.matcher(attributeValue);
        if (!matcher.matches()) {
            AbstractC1705a.S("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return c0154x0;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt != 0 && parseInt2 != 0) {
                return new C0154x0(parseInt2);
            }
            throw new Exception("Invalid cell resolution " + parseInt + " " + parseInt2);
        } catch (NumberFormatException unused) {
            AbstractC1705a.S("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return c0154x0;
        }
    }

    public static void k(String str, g gVar) {
        Matcher matcher;
        char c10 = 65535;
        int i7 = D.f21141a;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = f17782D;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (split.length != 2) {
                throw new Exception(A3.c.k(new StringBuilder("Invalid number of entries for fontSize: "), split.length, "."));
            }
            matcher = pattern.matcher(split[1]);
            AbstractC1705a.S("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new Exception(S.b("Invalid expression for fontSize: '", str, "'."));
        }
        String group = matcher.group(3);
        group.getClass();
        switch (group.hashCode()) {
            case 37:
                if (group.equals("%")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3240:
                if (group.equals("em")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3592:
                if (group.equals("px")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                gVar.j = 3;
                break;
            case 1:
                gVar.j = 2;
                break;
            case 2:
                gVar.j = 1;
                break;
            default:
                throw new Exception(S.b("Invalid unit for fontSize: '", group, "'."));
        }
        String group2 = matcher.group(1);
        group2.getClass();
        gVar.k = Float.parseFloat(group2);
    }

    public static C1253c l(XmlPullParser xmlPullParser) {
        float f4;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i7 = D.f21141a;
            if (attributeValue2.split(" ", -1).length != 2) {
                throw new Exception("frameRateMultiplier doesn't have 2 parts");
            }
            f4 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f4 = 1.0f;
        }
        C1253c c1253c = f17787I;
        int i10 = c1253c.f17778b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i10 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        return new C1253c(parseInt * f4, i10, attributeValue4 != null ? Integer.parseInt(attributeValue4) : c1253c.f17779c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0234, code lost:
    
        if (n5.AbstractC1705a.G(r20, "metadata") != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0236, code lost:
    
        r20.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x023f, code lost:
    
        if (n5.AbstractC1705a.G(r20, "image") == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0241, code lost:
    
        r7 = n5.AbstractC1705a.y(r20, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0245, code lost:
    
        if (r7 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0247, code lost:
    
        r25.put(r7, r20.nextText());
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0257, code lost:
    
        if (n5.AbstractC1705a.E(r20, "metadata") == false) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0262 A[LOOP:0: B:2:0x000a->B:22:0x0262, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0261 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m(XmlPullParser xmlPullParser, HashMap hashMap, C0154x0 c0154x0, O o10, HashMap hashMap2, HashMap hashMap3) {
        float parseFloat;
        float f4;
        float f10;
        float parseFloat2;
        C0154x0 c0154x02;
        int i7;
        String y10;
        int i10;
        char c10;
        String[] split;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            xmlPullParser.next();
            if (AbstractC1705a.G(xmlPullParser, "style")) {
                String y11 = AbstractC1705a.y(xmlPullParser, "style");
                g o11 = o(xmlPullParser, new g());
                if (y11 != null) {
                    String trim = y11.trim();
                    if (trim.isEmpty()) {
                        split = new String[i12];
                    } else {
                        int i13 = D.f21141a;
                        split = trim.split("\\s+", i11);
                    }
                    int length = split.length;
                    for (int i14 = i12; i14 < length; i14++) {
                        o11.a((g) hashMap.get(split[i14]));
                    }
                }
                String str = o11.f17816l;
                if (str != null) {
                    hashMap.put(str, o11);
                }
            } else {
                if (AbstractC1705a.G(xmlPullParser, "region")) {
                    String y12 = AbstractC1705a.y(xmlPullParser, "id");
                    f fVar = null;
                    if (y12 != null) {
                        String y13 = AbstractC1705a.y(xmlPullParser, "origin");
                        if (y13 != null) {
                            Pattern pattern = f17784F;
                            Matcher matcher = pattern.matcher(y13);
                            Pattern pattern2 = f17785G;
                            Matcher matcher2 = pattern2.matcher(y13);
                            if (matcher.matches()) {
                                try {
                                    String group = matcher.group(1);
                                    group.getClass();
                                    float parseFloat3 = Float.parseFloat(group) / 100.0f;
                                    String group2 = matcher.group(2);
                                    group2.getClass();
                                    parseFloat = Float.parseFloat(group2) / 100.0f;
                                    f4 = parseFloat3;
                                } catch (NumberFormatException unused) {
                                    AbstractC1705a.S("TtmlDecoder", "Ignoring region with malformed origin: ".concat(y13));
                                }
                            } else if (!matcher2.matches()) {
                                AbstractC1705a.S("TtmlDecoder", "Ignoring region with unsupported origin: ".concat(y13));
                            } else if (o10 == null) {
                                AbstractC1705a.S("TtmlDecoder", "Ignoring region with missing tts:extent: ".concat(y13));
                            } else {
                                try {
                                    String group3 = matcher2.group(1);
                                    group3.getClass();
                                    int parseInt = Integer.parseInt(group3);
                                    String group4 = matcher2.group(2);
                                    group4.getClass();
                                    f4 = parseInt / o10.f4603b;
                                    parseFloat = Integer.parseInt(group4) / o10.f4604c;
                                } catch (NumberFormatException unused2) {
                                    AbstractC1705a.S("TtmlDecoder", "Ignoring region with malformed origin: ".concat(y13));
                                }
                            }
                            String y14 = AbstractC1705a.y(xmlPullParser, "extent");
                            if (y14 != null) {
                                Matcher matcher3 = pattern.matcher(y14);
                                Matcher matcher4 = pattern2.matcher(y14);
                                if (matcher3.matches()) {
                                    try {
                                        String group5 = matcher3.group(1);
                                        group5.getClass();
                                        float parseFloat4 = Float.parseFloat(group5) / 100.0f;
                                        String group6 = matcher3.group(2);
                                        group6.getClass();
                                        f10 = parseFloat4;
                                        parseFloat2 = Float.parseFloat(group6) / 100.0f;
                                    } catch (NumberFormatException unused3) {
                                        AbstractC1705a.S("TtmlDecoder", "Ignoring region with malformed extent: ".concat(y13));
                                    }
                                } else if (!matcher4.matches()) {
                                    AbstractC1705a.S("TtmlDecoder", "Ignoring region with unsupported extent: ".concat(y13));
                                } else if (o10 == null) {
                                    AbstractC1705a.S("TtmlDecoder", "Ignoring region with missing tts:extent: ".concat(y13));
                                } else {
                                    try {
                                        String group7 = matcher4.group(1);
                                        group7.getClass();
                                        int parseInt2 = Integer.parseInt(group7);
                                        String group8 = matcher4.group(2);
                                        group8.getClass();
                                        f10 = parseInt2 / o10.f4603b;
                                        parseFloat2 = Integer.parseInt(group8) / o10.f4604c;
                                    } catch (NumberFormatException unused4) {
                                        AbstractC1705a.S("TtmlDecoder", "Ignoring region with malformed extent: ".concat(y13));
                                    }
                                }
                                String y15 = AbstractC1705a.y(xmlPullParser, "displayAlign");
                                if (y15 != null) {
                                    String N10 = u0.N(y15);
                                    N10.getClass();
                                    if (N10.equals("center")) {
                                        parseFloat = (parseFloat2 / 2.0f) + parseFloat;
                                        i7 = 1;
                                        c0154x02 = c0154x0;
                                    } else if (N10.equals("after")) {
                                        parseFloat += parseFloat2;
                                        c0154x02 = c0154x0;
                                        i7 = 2;
                                    }
                                    float f11 = 1.0f / c0154x02.f1468a;
                                    y10 = AbstractC1705a.y(xmlPullParser, "writingMode");
                                    if (y10 != null) {
                                        String N11 = u0.N(y10);
                                        N11.getClass();
                                        switch (N11.hashCode()) {
                                            case 3694:
                                                if (N11.equals("tb")) {
                                                    c10 = 0;
                                                    break;
                                                }
                                                break;
                                            case 3553396:
                                                if (N11.equals("tblr")) {
                                                    c10 = 1;
                                                    break;
                                                }
                                                break;
                                            case 3553576:
                                                if (N11.equals("tbrl")) {
                                                    c10 = 2;
                                                    break;
                                                }
                                                break;
                                        }
                                        c10 = 65535;
                                        switch (c10) {
                                            case 0:
                                            case 1:
                                                i10 = 2;
                                                break;
                                            case 2:
                                                i10 = 1;
                                                break;
                                        }
                                        fVar = new f(y12, f4, parseFloat, 0, i7, f10, parseFloat2, 1, f11, i10);
                                    }
                                    i10 = Integer.MIN_VALUE;
                                    fVar = new f(y12, f4, parseFloat, 0, i7, f10, parseFloat2, 1, f11, i10);
                                }
                                c0154x02 = c0154x0;
                                i7 = 0;
                                float f112 = 1.0f / c0154x02.f1468a;
                                y10 = AbstractC1705a.y(xmlPullParser, "writingMode");
                                if (y10 != null) {
                                }
                                i10 = Integer.MIN_VALUE;
                                fVar = new f(y12, f4, parseFloat, 0, i7, f10, parseFloat2, 1, f112, i10);
                            } else {
                                AbstractC1705a.S("TtmlDecoder", "Ignoring region without an extent");
                            }
                        } else {
                            AbstractC1705a.S("TtmlDecoder", "Ignoring region without an origin");
                        }
                        if (fVar != null) {
                            hashMap2.put(fVar.f17800a, fVar);
                        }
                    }
                    if (fVar != null) {
                    }
                }
                if (!AbstractC1705a.E(xmlPullParser, "head")) {
                    return;
                }
                i11 = -1;
                i12 = 0;
            }
            if (!AbstractC1705a.E(xmlPullParser, "head")) {
            }
        }
    }

    public static e n(XmlPullParser xmlPullParser, e eVar, HashMap hashMap, C1253c c1253c) {
        long j;
        long j10;
        char c10;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        g o10 = o(xmlPullParser, null);
        String[] strArr = null;
        String str = null;
        String str2 = "";
        long j11 = -9223372036854775807L;
        long j12 = -9223372036854775807L;
        long j13 = -9223372036854775807L;
        for (int i7 = 0; i7 < attributeCount; i7++) {
            String attributeName = xmlPullParser.getAttributeName(i7);
            String attributeValue = xmlPullParser.getAttributeValue(i7);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            c10 = 65535;
            switch (c10) {
                case 0:
                    if (!hashMap.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j13 = p(attributeValue, c1253c);
                    break;
                case 2:
                    j12 = p(attributeValue, c1253c);
                    break;
                case 3:
                    j11 = p(attributeValue, c1253c);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        int i10 = D.f21141a;
                        split = trim.split("\\s+", -1);
                    }
                    if (split.length > 0) {
                        strArr = split;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (eVar != null) {
            long j14 = eVar.f17793d;
            j = -9223372036854775807L;
            if (j14 != -9223372036854775807L) {
                if (j11 != -9223372036854775807L) {
                    j11 += j14;
                }
                if (j12 != -9223372036854775807L) {
                    j12 += j14;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (j12 == j) {
            if (j13 != j) {
                j10 = j11 + j13;
            } else if (eVar != null) {
                long j15 = eVar.f17794e;
                if (j15 != j) {
                    j10 = j15;
                }
            }
            return new e(xmlPullParser.getName(), null, j11, j10, o10, strArr, str2, str, eVar);
        }
        j10 = j12;
        return new e(xmlPullParser.getName(), null, j11, j10, o10, strArr, str2, str, eVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0140, code lost:
    
        r0.f17820p = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x04f6, code lost:
    
        r0.f17819o = r16;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x00eb. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024b  */
    /* JADX WARN: Type inference failed for: r11v84, types: [h5.b] */
    /* JADX WARN: Type inference failed for: r12v46, types: [h5.b] */
    /* JADX WARN: Type inference failed for: r12v55, types: [h5.b] */
    /* JADX WARN: Type inference failed for: r1v50, types: [h5.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g o(XmlPullParser xmlPullParser, g gVar) {
        char c10;
        String str;
        char c11;
        int i7;
        char c12;
        char c13;
        char c14;
        D0 n6;
        int i10;
        int hashCode;
        char c15;
        Layout.Alignment alignment;
        int i11;
        char c16;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String str2 = "after";
        int attributeCount = xmlPullParser.getAttributeCount();
        g gVar2 = gVar;
        int i12 = 0;
        while (i12 < attributeCount) {
            String attributeValue = xmlPullParser2.getAttributeValue(i12);
            String attributeName = xmlPullParser2.getAttributeName(i12);
            attributeName.getClass();
            Layout.Alignment alignment2 = null;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c10 = '\n';
                        break;
                    }
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c10 = 11;
                        break;
                    }
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c10 = '\f';
                        break;
                    }
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c10 = '\r';
                        break;
                    }
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c10 = 14;
                        break;
                    }
                    break;
            }
            c10 = 65535;
            switch (c10) {
                case 0:
                    str = str2;
                    gVar2 = g(gVar2);
                    gVar2.f17815i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    i7 = 1;
                    break;
                case 1:
                    str = str2;
                    gVar2 = g(gVar2);
                    gVar2.f17808a = attributeValue;
                    i7 = 1;
                    break;
                case 2:
                    str = str2;
                    gVar2 = g(gVar2);
                    String N10 = u0.N(attributeValue);
                    N10.getClass();
                    switch (N10.hashCode()) {
                        case -1364013995:
                            if (N10.equals("center")) {
                                c11 = 0;
                                break;
                            }
                            break;
                        case 100571:
                            if (N10.equals("end")) {
                                c11 = 1;
                                break;
                            }
                            break;
                        case 3317767:
                            if (N10.equals("left")) {
                                c11 = 2;
                                break;
                            }
                            break;
                        case 108511772:
                            if (N10.equals("right")) {
                                c11 = 3;
                                break;
                            }
                            break;
                        case 109757538:
                            if (N10.equals("start")) {
                                c11 = 4;
                                break;
                            }
                            break;
                    }
                    c11 = 65535;
                    switch (c11) {
                        case 0:
                            alignment2 = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case 1:
                        case 3:
                            alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case 2:
                        case 4:
                            alignment2 = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    i7 = 1;
                    break;
                case 3:
                    str = str2;
                    String N11 = u0.N(attributeValue);
                    N11.getClass();
                    switch (N11.hashCode()) {
                        case -1461280213:
                            if (N11.equals("nounderline")) {
                                c12 = 0;
                                break;
                            }
                            break;
                        case -1026963764:
                            if (N11.equals("underline")) {
                                c12 = 1;
                                break;
                            }
                            break;
                        case 913457136:
                            if (N11.equals("nolinethrough")) {
                                c12 = 2;
                                break;
                            }
                            break;
                        case 1679736913:
                            if (N11.equals("linethrough")) {
                                c12 = 3;
                                break;
                            }
                            break;
                    }
                    c12 = 65535;
                    switch (c12) {
                        case 0:
                            gVar2 = g(gVar2);
                            gVar2.g = 0;
                            break;
                        case 1:
                            gVar2 = g(gVar2);
                            gVar2.g = 1;
                            break;
                        case 2:
                            gVar2 = g(gVar2);
                            gVar2.f17813f = 0;
                            break;
                        case 3:
                            gVar2 = g(gVar2);
                            gVar2.f17813f = 1;
                            break;
                    }
                    i7 = 1;
                    break;
                case 4:
                    str = str2;
                    gVar2 = g(gVar2);
                    gVar2.f17814h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    i7 = 1;
                    break;
                case 5:
                    str = str2;
                    if ("style".equals(xmlPullParser.getName())) {
                        gVar2 = g(gVar2);
                        gVar2.f17816l = attributeValue;
                    }
                    i7 = 1;
                    break;
                case 6:
                    str = str2;
                    String N12 = u0.N(attributeValue);
                    N12.getClass();
                    switch (N12.hashCode()) {
                        case -618561360:
                            if (N12.equals("baseContainer")) {
                                c13 = 0;
                                break;
                            }
                            break;
                        case -410956671:
                            if (N12.equals("container")) {
                                c13 = 1;
                                break;
                            }
                            break;
                        case -250518009:
                            if (N12.equals("delimiter")) {
                                c13 = 2;
                                break;
                            }
                            break;
                        case -136074796:
                            if (N12.equals("textContainer")) {
                                c13 = 3;
                                break;
                            }
                            break;
                        case 3016401:
                            if (N12.equals("base")) {
                                c13 = 4;
                                break;
                            }
                            break;
                        case 3556653:
                            if (N12.equals("text")) {
                                c13 = 5;
                                break;
                            }
                            break;
                    }
                    c13 = 65535;
                    switch (c13) {
                        case 0:
                        case 4:
                            gVar2 = g(gVar2);
                            gVar2.f17817m = 2;
                            break;
                        case 1:
                            gVar2 = g(gVar2);
                            gVar2.f17817m = 1;
                            break;
                        case 2:
                            gVar2 = g(gVar2);
                            gVar2.f17817m = 4;
                            break;
                        case 3:
                        case 5:
                            gVar2 = g(gVar2);
                            gVar2.f17817m = 3;
                            break;
                    }
                    i7 = 1;
                    break;
                case 7:
                    str = str2;
                    gVar2 = g(gVar2);
                    try {
                        gVar2.f17809b = AbstractC1706b.a(attributeValue, false);
                        gVar2.f17810c = true;
                    } catch (IllegalArgumentException unused) {
                        A3.c.q("Failed parsing color value: ", attributeValue, "TtmlDecoder");
                    }
                    i7 = 1;
                    break;
                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                    str = str2;
                    g g = g(gVar2);
                    Matcher matcher = f17783E.matcher(attributeValue);
                    float f4 = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String group = matcher.group(1);
                            group.getClass();
                            f4 = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group)));
                        } catch (NumberFormatException e2) {
                            AbstractC1705a.R(e2, "TtmlDecoder", "Failed to parse shear: " + attributeValue);
                        }
                    } else {
                        A3.c.q("Invalid value for shear: ", attributeValue, "TtmlDecoder");
                    }
                    g.f17823s = f4;
                    gVar2 = g;
                    i7 = 1;
                    break;
                case '\t':
                    str = str2;
                    String N13 = u0.N(attributeValue);
                    N13.getClass();
                    if (N13.equals("all")) {
                        gVar2 = g(gVar2);
                        gVar2.f17821q = 1;
                    } else if (N13.equals("none")) {
                        gVar2 = g(gVar2);
                        gVar2.f17821q = 0;
                    }
                    i7 = 1;
                    break;
                case '\n':
                    str = str2;
                    try {
                        gVar2 = g(gVar2);
                        k(attributeValue, gVar2);
                    } catch (i unused2) {
                        A3.c.q("Failed parsing fontSize value: ", attributeValue, "TtmlDecoder");
                    }
                    i7 = 1;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    gVar2 = g(gVar2);
                    Pattern pattern = C1252b.f17770d;
                    if (attributeValue != null) {
                        String N14 = u0.N(attributeValue.trim());
                        if (!N14.isEmpty()) {
                            String[] split = TextUtils.split(N14, C1252b.f17770d);
                            int length = split.length;
                            L E10 = length != 0 ? length != 1 ? L.E(split.length, (Object[]) split.clone()) : new G0(split[0]) : z0.f7379x;
                            String str3 = (String) r.k(r.n(C1252b.f17773h, E10), "outside");
                            int hashCode2 = str3.hashCode();
                            if (hashCode2 == -1392885889) {
                                if (str3.equals("before")) {
                                    c14 = 2;
                                    if (c14 == 0) {
                                    }
                                    n6 = r.n(C1252b.f17771e, E10);
                                    if (n6.isEmpty()) {
                                    }
                                    alignment2 = alignment;
                                }
                                c14 = 65535;
                                if (c14 == 0) {
                                }
                                n6 = r.n(C1252b.f17771e, E10);
                                if (n6.isEmpty()) {
                                }
                                alignment2 = alignment;
                            } else if (hashCode2 != -1106037339) {
                                if (hashCode2 == 92734940 && str3.equals(str2)) {
                                    c14 = 0;
                                    int i13 = c14 == 0 ? c14 != 1 ? 1 : -2 : 2;
                                    n6 = r.n(C1252b.f17771e, E10);
                                    if (n6.isEmpty()) {
                                        String str4 = (String) new M(n6).next();
                                        int hashCode3 = str4.hashCode();
                                        if (hashCode3 == 3005871) {
                                            str4.equals("auto");
                                        } else if (hashCode3 == 3387192 && str4.equals("none")) {
                                            i11 = 0;
                                            str = str2;
                                            alignment = new C1252b(i11, 0, i13);
                                        }
                                        i11 = -1;
                                        str = str2;
                                        alignment = new C1252b(i11, 0, i13);
                                    } else {
                                        D0 n8 = r.n(C1252b.g, E10);
                                        D0 n10 = r.n(C1252b.f17772f, E10);
                                        if (n8.isEmpty() && n10.isEmpty()) {
                                            str = str2;
                                            alignment2 = new C1252b(-1, 0, i13);
                                        } else {
                                            String str5 = (String) r.k(n8, "filled");
                                            int hashCode4 = str5.hashCode();
                                            str = str2;
                                            if (hashCode4 == -1274499742) {
                                                str5.equals("filled");
                                            } else if (hashCode4 == 3417674 && str5.equals("open")) {
                                                i10 = 2;
                                                String str6 = (String) r.k(n10, "circle");
                                                hashCode = str6.hashCode();
                                                if (hashCode != -1360216880) {
                                                    if (str6.equals("circle")) {
                                                        c15 = 2;
                                                        alignment = new C1252b(c15 == 0 ? c15 != 1 ? 1 : 3 : 2, i10, i13);
                                                    }
                                                    c15 = 65535;
                                                    alignment = new C1252b(c15 == 0 ? c15 != 1 ? 1 : 3 : 2, i10, i13);
                                                } else if (hashCode != -905816648) {
                                                    if (hashCode == 99657 && str6.equals("dot")) {
                                                        c15 = 0;
                                                        alignment = new C1252b(c15 == 0 ? c15 != 1 ? 1 : 3 : 2, i10, i13);
                                                    }
                                                    c15 = 65535;
                                                    alignment = new C1252b(c15 == 0 ? c15 != 1 ? 1 : 3 : 2, i10, i13);
                                                } else {
                                                    if (str6.equals("sesame")) {
                                                        c15 = 1;
                                                        alignment = new C1252b(c15 == 0 ? c15 != 1 ? 1 : 3 : 2, i10, i13);
                                                    }
                                                    c15 = 65535;
                                                    alignment = new C1252b(c15 == 0 ? c15 != 1 ? 1 : 3 : 2, i10, i13);
                                                }
                                            }
                                            i10 = 1;
                                            String str62 = (String) r.k(n10, "circle");
                                            hashCode = str62.hashCode();
                                            if (hashCode != -1360216880) {
                                            }
                                        }
                                    }
                                    alignment2 = alignment;
                                }
                                c14 = 65535;
                                if (c14 == 0) {
                                }
                                n6 = r.n(C1252b.f17771e, E10);
                                if (n6.isEmpty()) {
                                }
                                alignment2 = alignment;
                            } else {
                                if (str3.equals("outside")) {
                                    c14 = 1;
                                    if (c14 == 0) {
                                    }
                                    n6 = r.n(C1252b.f17771e, E10);
                                    if (n6.isEmpty()) {
                                    }
                                    alignment2 = alignment;
                                }
                                c14 = 65535;
                                if (c14 == 0) {
                                }
                                n6 = r.n(C1252b.f17771e, E10);
                                if (n6.isEmpty()) {
                                }
                                alignment2 = alignment;
                            }
                            gVar2.f17822r = alignment2;
                            i7 = 1;
                            break;
                        }
                    }
                    str = str2;
                    gVar2.f17822r = alignment2;
                    i7 = 1;
                    break;
                case '\f':
                    String N15 = u0.N(attributeValue);
                    N15.getClass();
                    if (N15.equals("before")) {
                        gVar2 = g(gVar2);
                        gVar2.f17818n = 1;
                    } else if (N15.equals(str2)) {
                        gVar2 = g(gVar2);
                        gVar2.f17818n = 2;
                    }
                    str = str2;
                    i7 = 1;
                    break;
                case '\r':
                    gVar2 = g(gVar2);
                    try {
                        gVar2.f17811d = AbstractC1706b.a(attributeValue, false);
                        gVar2.f17812e = true;
                    } catch (IllegalArgumentException unused3) {
                        A3.c.q("Failed parsing background value: ", attributeValue, "TtmlDecoder");
                    }
                    str = str2;
                    i7 = 1;
                    break;
                case 14:
                    gVar2 = g(gVar2);
                    String N16 = u0.N(attributeValue);
                    N16.getClass();
                    switch (N16.hashCode()) {
                        case -1364013995:
                            if (N16.equals("center")) {
                                c16 = 0;
                                break;
                            }
                            break;
                        case 100571:
                            if (N16.equals("end")) {
                                c16 = 1;
                                break;
                            }
                            break;
                        case 3317767:
                            if (N16.equals("left")) {
                                c16 = 2;
                                break;
                            }
                            break;
                        case 108511772:
                            if (N16.equals("right")) {
                                c16 = 3;
                                break;
                            }
                            break;
                        case 109757538:
                            if (N16.equals("start")) {
                                c16 = 4;
                                break;
                            }
                            break;
                    }
                    c16 = 65535;
                    switch (c16) {
                        case 0:
                            alignment2 = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case 1:
                        case 3:
                            alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case 2:
                        case 4:
                            alignment2 = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    str = str2;
                    i7 = 1;
                    break;
                default:
                    str = str2;
                    i7 = 1;
                    break;
            }
            i12 += i7;
            xmlPullParser2 = xmlPullParser;
            str2 = str;
        }
        return gVar2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long p(String str, C1253c c1253c) {
        double d10;
        double d11;
        char c10 = 4;
        Matcher matcher = f17780B.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            double parseLong = Long.parseLong(group) * 3600;
            matcher.group(2).getClass();
            double parseLong2 = parseLong + (Long.parseLong(r13) * 60);
            matcher.group(3).getClass();
            double parseLong3 = parseLong2 + Long.parseLong(r13);
            String group2 = matcher.group(4);
            return (long) ((parseLong3 + (group2 != null ? Double.parseDouble(group2) : 0.0d) + (matcher.group(5) != null ? ((float) Long.parseLong(r13)) / c1253c.f17777a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / c1253c.f17778b) / c1253c.f17777a : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f17781C.matcher(str);
        if (!matcher2.matches()) {
            throw new Exception(X.c.t("Malformed time expression: ", str));
        }
        String group3 = matcher2.group(1);
        group3.getClass();
        double parseDouble = Double.parseDouble(group3);
        String group4 = matcher2.group(2);
        group4.getClass();
        switch (group4.hashCode()) {
            case 102:
                if (group4.equals("f")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 104:
                if (group4.equals("h")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 109:
                if (group4.equals("m")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 116:
                if (group4.equals("t")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 3494:
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                d10 = c1253c.f17777a;
                parseDouble /= d10;
                break;
            case 1:
                d11 = 3600.0d;
                break;
            case 2:
                d11 = 60.0d;
                break;
            case 3:
                d10 = c1253c.f17779c;
                parseDouble /= d10;
                break;
            case 4:
                d10 = 1000.0d;
                parseDouble /= d10;
                break;
        }
        parseDouble *= d11;
        return (long) (parseDouble * 1000000.0d);
    }

    public static O q(XmlPullParser xmlPullParser) {
        String y10 = AbstractC1705a.y(xmlPullParser, "extent");
        if (y10 == null) {
            return null;
        }
        Matcher matcher = f17785G.matcher(y10);
        if (!matcher.matches()) {
            AbstractC1705a.S("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(y10));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new O(parseInt, Integer.parseInt(group2), 5);
        } catch (NumberFormatException unused) {
            AbstractC1705a.S("TtmlDecoder", "Ignoring malformed tts extent: ".concat(y10));
            return null;
        }
    }

    @Override // a5.f
    public final a5.g b(int i7, boolean z8, byte[] bArr) {
        C0154x0 c0154x0;
        C1253c c1253c;
        try {
            XmlPullParser newPullParser = this.f17789A.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new f("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            O o10 = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i7), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C1253c c1253c2 = f17787I;
            C0154x0 c0154x02 = f17788J;
            int i10 = 0;
            O0 o02 = null;
            C0154x0 c0154x03 = c0154x02;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                e eVar = (e) arrayDeque.peek();
                if (i10 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            c1253c2 = l(newPullParser);
                            c0154x03 = j(newPullParser, c0154x02);
                            o10 = q(newPullParser);
                        }
                        C0154x0 c0154x04 = c0154x03;
                        O o11 = o10;
                        C1253c c1253c3 = c1253c2;
                        if (i(name)) {
                            if ("head".equals(name)) {
                                c0154x0 = c0154x04;
                                c1253c = c1253c3;
                                m(newPullParser, hashMap, c0154x04, o11, hashMap2, hashMap3);
                            } else {
                                c0154x0 = c0154x04;
                                c1253c = c1253c3;
                                try {
                                    e n6 = n(newPullParser, eVar, hashMap2, c1253c);
                                    arrayDeque.push(n6);
                                    if (eVar != null) {
                                        if (eVar.f17799m == null) {
                                            eVar.f17799m = new ArrayList();
                                        }
                                        eVar.f17799m.add(n6);
                                    }
                                } catch (i e2) {
                                    AbstractC1705a.R(e2, "TtmlDecoder", "Suppressing parser error");
                                    i10++;
                                }
                            }
                            c0154x03 = c0154x0;
                            c1253c2 = c1253c;
                        } else {
                            AbstractC1705a.B("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                            i10++;
                            c0154x03 = c0154x04;
                            c1253c2 = c1253c3;
                        }
                        o10 = o11;
                    } else if (eventType == 4) {
                        eVar.getClass();
                        e a9 = e.a(newPullParser.getText());
                        if (eVar.f17799m == null) {
                            eVar.f17799m = new ArrayList();
                        }
                        eVar.f17799m.add(a9);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            e eVar2 = (e) arrayDeque.peek();
                            eVar2.getClass();
                            o02 = new O0(eVar2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i10++;
                } else if (eventType == 3) {
                    i10--;
                }
                newPullParser.next();
            }
            if (o02 != null) {
                return o02;
            }
            throw new Exception("No TTML subtitles found");
        } catch (IOException e10) {
            throw new IllegalStateException("Unexpected error when reading input.", e10);
        } catch (XmlPullParserException e11) {
            throw new Exception("Unable to decode source", e11);
        }
    }
}
