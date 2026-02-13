package V4;

import N6.H;
import N6.r;
import U4.t;
import U4.u;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
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
import r4.C1935g;
import r4.C1936h;

/* loaded from: classes.dex */
public final class o implements L {

    /* renamed from: a, reason: collision with root package name */
    public final l f10169a;

    /* renamed from: b, reason: collision with root package name */
    public final i f10170b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f10145c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f10147d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f10149e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f10151f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: u, reason: collision with root package name */
    public static final Pattern f10163u = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: v, reason: collision with root package name */
    public static final Pattern f10164v = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: w, reason: collision with root package name */
    public static final Pattern f10165w = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f10166x = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f10167y = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: z, reason: collision with root package name */
    public static final Pattern f10168z = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: A, reason: collision with root package name */
    public static final Pattern f10118A = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: B, reason: collision with root package name */
    public static final Pattern f10119B = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: C, reason: collision with root package name */
    public static final Pattern f10120C = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: D, reason: collision with root package name */
    public static final Pattern f10121D = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: E, reason: collision with root package name */
    public static final Pattern f10122E = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: F, reason: collision with root package name */
    public static final Pattern f10123F = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: G, reason: collision with root package name */
    public static final Pattern f10124G = a("CAN-SKIP-DATERANGES");

    /* renamed from: H, reason: collision with root package name */
    public static final Pattern f10125H = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: I, reason: collision with root package name */
    public static final Pattern f10126I = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: J, reason: collision with root package name */
    public static final Pattern f10127J = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: K, reason: collision with root package name */
    public static final Pattern f10128K = a("CAN-BLOCK-RELOAD");
    public static final Pattern L = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: M, reason: collision with root package name */
    public static final Pattern f10129M = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: N, reason: collision with root package name */
    public static final Pattern f10130N = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: O, reason: collision with root package name */
    public static final Pattern f10131O = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: P, reason: collision with root package name */
    public static final Pattern f10132P = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: Q, reason: collision with root package name */
    public static final Pattern f10133Q = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: R, reason: collision with root package name */
    public static final Pattern f10134R = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: S, reason: collision with root package name */
    public static final Pattern f10135S = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: T, reason: collision with root package name */
    public static final Pattern f10136T = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: U, reason: collision with root package name */
    public static final Pattern f10137U = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: V, reason: collision with root package name */
    public static final Pattern f10138V = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: W, reason: collision with root package name */
    public static final Pattern f10139W = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: X, reason: collision with root package name */
    public static final Pattern f10140X = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: Y, reason: collision with root package name */
    public static final Pattern f10141Y = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: Z, reason: collision with root package name */
    public static final Pattern f10142Z = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: a0, reason: collision with root package name */
    public static final Pattern f10143a0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: b0, reason: collision with root package name */
    public static final Pattern f10144b0 = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: c0, reason: collision with root package name */
    public static final Pattern f10146c0 = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: d0, reason: collision with root package name */
    public static final Pattern f10148d0 = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: e0, reason: collision with root package name */
    public static final Pattern f10150e0 = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: f0, reason: collision with root package name */
    public static final Pattern f10152f0 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: g0, reason: collision with root package name */
    public static final Pattern f10153g0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: h0, reason: collision with root package name */
    public static final Pattern f10154h0 = a("AUTOSELECT");

    /* renamed from: i0, reason: collision with root package name */
    public static final Pattern f10155i0 = a("DEFAULT");

    /* renamed from: j0, reason: collision with root package name */
    public static final Pattern f10156j0 = a("FORCED");

    /* renamed from: k0, reason: collision with root package name */
    public static final Pattern f10157k0 = a("INDEPENDENT");

    /* renamed from: l0, reason: collision with root package name */
    public static final Pattern f10158l0 = a("GAP");

    /* renamed from: m0, reason: collision with root package name */
    public static final Pattern f10159m0 = a("PRECISE");

    /* renamed from: n0, reason: collision with root package name */
    public static final Pattern f10160n0 = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: o0, reason: collision with root package name */
    public static final Pattern f10161o0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: p0, reason: collision with root package name */
    public static final Pattern f10162p0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public o(l lVar, i iVar) {
        this.f10169a = lVar;
        this.f10170b = iVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static C1936h b(String str, C1935g[] c1935gArr) {
        C1935g[] c1935gArr2 = new C1935g[c1935gArr.length];
        for (int i7 = 0; i7 < c1935gArr.length; i7++) {
            C1935g c1935g = c1935gArr[i7];
            c1935gArr2[i7] = new C1935g(c1935g.f23757b, c1935g.f23758c, c1935g.f23759d, null);
        }
        return new C1936h(str, true, c1935gArr2);
    }

    public static C1935g c(String str, String str2, HashMap hashMap) {
        String j = j(str, f10140X, "1", hashMap);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f10141Y;
        if (equals) {
            String k = k(str, pattern, hashMap);
            return new C1935g(AbstractC1571h.f20385d, null, "video/mp4", Base64.decode(k.substring(k.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = AbstractC1571h.f20385d;
            int i7 = D.f21141a;
            return new C1935g(uuid, null, "hls", str.getBytes(M6.e.f6799c));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(j)) {
            return null;
        }
        String k7 = k(str, pattern, hashMap);
        byte[] decode = Base64.decode(k7.substring(k7.indexOf(44)), 0);
        UUID uuid2 = AbstractC1571h.f20386e;
        return new C1935g(uuid2, null, "video/mp4", A4.o.a(uuid2, null, decode));
    }

    public static i d(l lVar, i iVar, Q7.h hVar, String str) {
        int i7;
        String str2;
        HashMap hashMap;
        HashMap hashMap2;
        d dVar;
        ArrayList arrayList;
        String str3;
        d dVar2;
        int i10;
        String str4;
        HashMap hashMap3;
        int i11;
        long j;
        long j10;
        HashMap hashMap4;
        f fVar;
        C1936h c1936h;
        l lVar2 = lVar;
        i iVar2 = iVar;
        boolean z8 = lVar2.f10117c;
        HashMap hashMap5 = new HashMap();
        HashMap hashMap6 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        h hVar2 = new h(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        String str5 = "";
        boolean z10 = z8;
        h hVar3 = hVar2;
        String str6 = "";
        long j11 = -1;
        int i12 = 0;
        boolean z11 = false;
        long j12 = -9223372036854775807L;
        long j13 = 0;
        boolean z12 = false;
        int i13 = 0;
        long j14 = 0;
        int i14 = 1;
        long j15 = -9223372036854775807L;
        long j16 = -9223372036854775807L;
        boolean z13 = false;
        C1936h c1936h2 = null;
        long j17 = 0;
        C1936h c1936h3 = null;
        long j18 = 0;
        long j19 = 0;
        boolean z14 = false;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        int i15 = 0;
        long j20 = 0;
        boolean z15 = false;
        f fVar2 = null;
        long j21 = 0;
        long j22 = 0;
        ArrayList arrayList6 = arrayList3;
        d dVar3 = null;
        while (hVar.E()) {
            String J10 = hVar.J();
            if (J10.startsWith("#EXT")) {
                arrayList5.add(J10);
            }
            if (J10.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String k = k(J10, f10122E, hashMap5);
                if ("VOD".equals(k)) {
                    i12 = 1;
                } else if ("EVENT".equals(k)) {
                    i12 = 2;
                }
            } else if (J10.equals("#EXT-X-I-FRAMES-ONLY")) {
                z15 = true;
            } else {
                if (J10.startsWith("#EXT-X-START")) {
                    str2 = str5;
                    long parseDouble = (long) (Double.parseDouble(k(J10, f10133Q, Collections.emptyMap())) * 1000000.0d);
                    z11 = f(J10, f10159m0);
                    j12 = parseDouble;
                } else {
                    str2 = str5;
                    if (J10.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double h10 = h(J10, f10123F);
                        long j23 = h10 == -9.223372036854776E18d ? -9223372036854775807L : (long) (h10 * 1000000.0d);
                        boolean f4 = f(J10, f10124G);
                        double h11 = h(J10, f10126I);
                        long j24 = h11 == -9.223372036854776E18d ? -9223372036854775807L : (long) (h11 * 1000000.0d);
                        double h12 = h(J10, f10127J);
                        hVar3 = new h(j23, f4, j24, h12 == -9.223372036854776E18d ? -9223372036854775807L : (long) (h12 * 1000000.0d), f(J10, f10128K));
                    } else if (J10.startsWith("#EXT-X-PART-INF")) {
                        j16 = (long) (Double.parseDouble(k(J10, f10120C, Collections.emptyMap())) * 1000000.0d);
                    } else {
                        boolean startsWith = J10.startsWith("#EXT-X-MAP");
                        Pattern pattern = f10135S;
                        boolean z16 = z11;
                        Pattern pattern2 = f10141Y;
                        if (startsWith) {
                            String k7 = k(J10, pattern2, hashMap5);
                            String j25 = j(J10, pattern, null, hashMap5);
                            if (j25 != null) {
                                int i16 = D.f21141a;
                                String[] split = j25.split("@", -1);
                                j11 = Long.parseLong(split[0]);
                                if (split.length > 1) {
                                    j17 = Long.parseLong(split[1]);
                                }
                            }
                            if (j11 == -1) {
                                j17 = 0;
                            }
                            if (str7 != null && str8 == null) {
                                throw C1586o0.b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                            }
                            fVar2 = new f(k7, j17, j11, str7, str8);
                            if (j11 != -1) {
                                j17 += j11;
                            }
                            j11 = -1;
                            str5 = str2;
                            z11 = z16;
                        } else {
                            ArrayList arrayList7 = arrayList6;
                            ArrayList arrayList8 = arrayList5;
                            if (J10.startsWith("#EXT-X-TARGETDURATION")) {
                                j15 = Integer.parseInt(k(J10, f10118A, Collections.emptyMap())) * 1000000;
                            } else if (J10.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j18 = Long.parseLong(k(J10, L, Collections.emptyMap()));
                                j14 = j18;
                            } else if (J10.startsWith("#EXT-X-VERSION")) {
                                i14 = Integer.parseInt(k(J10, f10121D, Collections.emptyMap()));
                            } else {
                                if (J10.startsWith("#EXT-X-DEFINE")) {
                                    String j26 = j(J10, f10161o0, null, hashMap5);
                                    if (j26 != null) {
                                        String str10 = (String) lVar2.f10113l.get(j26);
                                        if (str10 != null) {
                                            hashMap5.put(j26, str10);
                                        }
                                    } else {
                                        hashMap5.put(k(J10, f10148d0, hashMap5), k(J10, f10160n0, hashMap5));
                                    }
                                    hashMap = hashMap5;
                                    hashMap2 = hashMap6;
                                    dVar = dVar3;
                                    arrayList = arrayList7;
                                    str3 = str9;
                                } else if (J10.startsWith("#EXTINF")) {
                                    j21 = new BigDecimal(k(J10, f10129M, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
                                    str6 = j(J10, f10130N, str2, hashMap5);
                                    str5 = str2;
                                    arrayList6 = arrayList7;
                                    z11 = z16;
                                    arrayList5 = arrayList8;
                                } else {
                                    String str11 = str2;
                                    if (J10.startsWith("#EXT-X-SKIP")) {
                                        int parseInt = Integer.parseInt(k(J10, f10125H, Collections.emptyMap()));
                                        AbstractC1705a.m(iVar2 != null && arrayList2.isEmpty());
                                        int i17 = D.f21141a;
                                        int i18 = (int) (j14 - iVar2.k);
                                        int i19 = parseInt + i18;
                                        if (i18 >= 0) {
                                            H h13 = iVar2.f10093r;
                                            if (i19 <= h13.size()) {
                                                while (i18 < i19) {
                                                    f fVar3 = (f) h13.get(i18);
                                                    if (j14 != iVar2.k) {
                                                        int i20 = (iVar2.j - i13) + fVar3.f10069d;
                                                        ArrayList arrayList9 = new ArrayList();
                                                        long j27 = j20;
                                                        int i21 = 0;
                                                        while (true) {
                                                            H h14 = fVar3.f10064A;
                                                            i10 = i19;
                                                            if (i21 >= h14.size()) {
                                                                break;
                                                            }
                                                            d dVar4 = (d) h14.get(i21);
                                                            arrayList9.add(new d(dVar4.f10066a, dVar4.f10067b, dVar4.f10068c, i20, j27, dVar4.f10071f, dVar4.f10072u, dVar4.f10073v, dVar4.f10074w, dVar4.f10075x, dVar4.f10076y, dVar4.f10060z, dVar4.f10059A));
                                                            j27 += dVar4.f10068c;
                                                            i21++;
                                                            hashMap6 = hashMap6;
                                                            i19 = i10;
                                                            str11 = str11;
                                                            dVar3 = dVar3;
                                                        }
                                                        dVar2 = dVar3;
                                                        str4 = str11;
                                                        hashMap3 = hashMap6;
                                                        fVar3 = new f(fVar3.f10066a, fVar3.f10067b, fVar3.f10065z, fVar3.f10068c, i20, j20, fVar3.f10071f, fVar3.f10072u, fVar3.f10073v, fVar3.f10074w, fVar3.f10075x, fVar3.f10076y, arrayList9);
                                                    } else {
                                                        dVar2 = dVar3;
                                                        i10 = i19;
                                                        str4 = str11;
                                                        hashMap3 = hashMap6;
                                                    }
                                                    arrayList2.add(fVar3);
                                                    j20 += fVar3.f10068c;
                                                    long j28 = fVar3.f10075x;
                                                    if (j28 != -1) {
                                                        j17 = fVar3.f10074w + j28;
                                                    }
                                                    String str12 = fVar3.f10073v;
                                                    if (str12 == null || !str12.equals(Long.toHexString(j18))) {
                                                        str8 = str12;
                                                    }
                                                    j18++;
                                                    i18++;
                                                    i15 = fVar3.f10069d;
                                                    fVar2 = fVar3.f10067b;
                                                    c1936h3 = fVar3.f10071f;
                                                    str7 = fVar3.f10072u;
                                                    hashMap6 = hashMap3;
                                                    i19 = i10;
                                                    j19 = j20;
                                                    str11 = str4;
                                                    dVar3 = dVar2;
                                                    iVar2 = iVar;
                                                }
                                                str2 = str11;
                                                lVar2 = lVar;
                                                iVar2 = iVar;
                                            }
                                        }
                                        throw new IOException();
                                    }
                                    dVar = dVar3;
                                    str2 = str11;
                                    HashMap hashMap7 = hashMap6;
                                    if (J10.startsWith("#EXT-X-KEY")) {
                                        String k10 = k(J10, f10138V, hashMap5);
                                        String j29 = j(J10, f10139W, "identity", hashMap5);
                                        if ("NONE".equals(k10)) {
                                            treeMap.clear();
                                            c1936h3 = null;
                                            str7 = null;
                                            str8 = null;
                                        } else {
                                            String j30 = j(J10, f10142Z, null, hashMap5);
                                            if (!"identity".equals(j29)) {
                                                String str13 = str9;
                                                if (str13 == null) {
                                                    str9 = ("SAMPLE-AES-CENC".equals(k10) || "SAMPLE-AES-CTR".equals(k10)) ? "cenc" : "cbcs";
                                                } else {
                                                    str9 = str13;
                                                }
                                                C1935g c10 = c(J10, j29, hashMap5);
                                                if (c10 != null) {
                                                    treeMap.put(j29, c10);
                                                    str8 = j30;
                                                    c1936h3 = null;
                                                    str7 = null;
                                                }
                                            } else if ("AES-128".equals(k10)) {
                                                str7 = k(J10, pattern2, hashMap5);
                                                str8 = j30;
                                            }
                                            str8 = j30;
                                            str7 = null;
                                        }
                                        lVar2 = lVar;
                                        iVar2 = iVar;
                                        hashMap6 = hashMap7;
                                    } else {
                                        str3 = str9;
                                        if (J10.startsWith("#EXT-X-BYTERANGE")) {
                                            String k11 = k(J10, f10134R, hashMap5);
                                            int i22 = D.f21141a;
                                            String[] split2 = k11.split("@", -1);
                                            j11 = Long.parseLong(split2[0]);
                                            if (split2.length > 1) {
                                                j17 = Long.parseLong(split2[1]);
                                            }
                                        } else if (J10.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i13 = Integer.parseInt(J10.substring(J10.indexOf(58) + 1));
                                            lVar2 = lVar;
                                            iVar2 = iVar;
                                            z12 = true;
                                            hashMap6 = hashMap7;
                                            str9 = str3;
                                        } else if (J10.equals("#EXT-X-DISCONTINUITY")) {
                                            i15++;
                                        } else if (J10.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                            if (j13 == 0) {
                                                j13 = D.M(D.P(J10.substring(J10.indexOf(58) + 1))) - j20;
                                            } else {
                                                hashMap = hashMap5;
                                                arrayList = arrayList7;
                                                hashMap2 = hashMap7;
                                            }
                                        } else if (J10.equals("#EXT-X-GAP")) {
                                            lVar2 = lVar;
                                            iVar2 = iVar;
                                            hashMap6 = hashMap7;
                                            str9 = str3;
                                            arrayList6 = arrayList7;
                                            str5 = str2;
                                            z11 = z16;
                                            arrayList5 = arrayList8;
                                            dVar3 = dVar;
                                            z14 = true;
                                        } else if (J10.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                            lVar2 = lVar;
                                            iVar2 = iVar;
                                            hashMap6 = hashMap7;
                                            str9 = str3;
                                            arrayList6 = arrayList7;
                                            str5 = str2;
                                            z11 = z16;
                                            arrayList5 = arrayList8;
                                            dVar3 = dVar;
                                            z10 = true;
                                        } else if (J10.equals("#EXT-X-ENDLIST")) {
                                            lVar2 = lVar;
                                            iVar2 = iVar;
                                            hashMap6 = hashMap7;
                                            str9 = str3;
                                            arrayList6 = arrayList7;
                                            str5 = str2;
                                            z11 = z16;
                                            arrayList5 = arrayList8;
                                            dVar3 = dVar;
                                            z13 = true;
                                        } else {
                                            if (J10.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                long i23 = i(J10, f10131O);
                                                Matcher matcher = f10132P.matcher(J10);
                                                if (matcher.find()) {
                                                    String group = matcher.group(1);
                                                    group.getClass();
                                                    i11 = Integer.parseInt(group);
                                                } else {
                                                    i11 = -1;
                                                }
                                                arrayList4.add(new e(i11, i23, Uri.parse(AbstractC1705a.N(str, k(J10, pattern2, hashMap5)))));
                                            } else if (J10.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                if (dVar == null && "PART".equals(k(J10, f10144b0, hashMap5))) {
                                                    String k12 = k(J10, pattern2, hashMap5);
                                                    long i24 = i(J10, f10136T);
                                                    long i25 = i(J10, f10137U);
                                                    String hexString = str7 == null ? null : str8 != null ? str8 : Long.toHexString(j18);
                                                    if (c1936h3 == null && !treeMap.isEmpty()) {
                                                        C1935g[] c1935gArr = (C1935g[]) treeMap.values().toArray(new C1935g[0]);
                                                        C1936h c1936h4 = new C1936h(str3, true, c1935gArr);
                                                        if (c1936h2 == null) {
                                                            c1936h2 = b(str3, c1935gArr);
                                                        }
                                                        c1936h3 = c1936h4;
                                                    }
                                                    if (i24 == -1 || i25 != -1) {
                                                        dVar = new d(k12, fVar2, 0L, i15, j19, c1936h3, str7, hexString, i24 != -1 ? i24 : 0L, i25, false, false, true);
                                                    }
                                                }
                                            } else if (J10.startsWith("#EXT-X-PART")) {
                                                String hexString2 = str7 == null ? null : str8 != null ? str8 : Long.toHexString(j18);
                                                String k13 = k(J10, pattern2, hashMap5);
                                                long parseDouble2 = (long) (Double.parseDouble(k(J10, f10119B, Collections.emptyMap())) * 1000000.0d);
                                                boolean f10 = f(J10, f10157k0) | (z10 && arrayList7.isEmpty());
                                                boolean f11 = f(J10, f10158l0);
                                                String j31 = j(J10, pattern, null, hashMap5);
                                                if (j31 != null) {
                                                    int i26 = D.f21141a;
                                                    String[] split3 = j31.split("@", -1);
                                                    j = Long.parseLong(split3[0]);
                                                    if (split3.length > 1) {
                                                        j22 = Long.parseLong(split3[1]);
                                                    }
                                                } else {
                                                    j = -1;
                                                }
                                                if (j == -1) {
                                                    j22 = 0;
                                                }
                                                if (c1936h3 == null && !treeMap.isEmpty()) {
                                                    C1935g[] c1935gArr2 = (C1935g[]) treeMap.values().toArray(new C1935g[0]);
                                                    C1936h c1936h5 = new C1936h(str3, true, c1935gArr2);
                                                    if (c1936h2 == null) {
                                                        c1936h2 = b(str3, c1935gArr2);
                                                    }
                                                    c1936h3 = c1936h5;
                                                }
                                                arrayList7.add(new d(k13, fVar2, parseDouble2, i15, j19, c1936h3, str7, hexString2, j22, j, f11, f10, false));
                                                j19 += parseDouble2;
                                                if (j != -1) {
                                                    j22 += j;
                                                }
                                                lVar2 = lVar;
                                                iVar2 = iVar;
                                                hashMap6 = hashMap7;
                                                str9 = str3;
                                                arrayList6 = arrayList7;
                                                str5 = str2;
                                                z11 = z16;
                                                arrayList5 = arrayList8;
                                                dVar3 = dVar;
                                            } else {
                                                arrayList = arrayList7;
                                                if (J10.startsWith("#")) {
                                                    hashMap = hashMap5;
                                                    hashMap2 = hashMap7;
                                                } else {
                                                    String hexString3 = str7 == null ? null : str8 != null ? str8 : Long.toHexString(j18);
                                                    long j32 = j18 + 1;
                                                    String l10 = l(J10, hashMap5);
                                                    f fVar4 = (f) hashMap7.get(l10);
                                                    if (j11 == -1) {
                                                        j10 = 0;
                                                    } else {
                                                        if (z15 && fVar2 == null && fVar4 == null) {
                                                            fVar4 = new f(l10, 0L, j17, null, null);
                                                            hashMap7.put(l10, fVar4);
                                                        }
                                                        j10 = j17;
                                                    }
                                                    if (c1936h3 != null || treeMap.isEmpty()) {
                                                        hashMap4 = hashMap5;
                                                        fVar = fVar4;
                                                        c1936h = c1936h3;
                                                    } else {
                                                        hashMap4 = hashMap5;
                                                        fVar = fVar4;
                                                        C1935g[] c1935gArr3 = (C1935g[]) treeMap.values().toArray(new C1935g[0]);
                                                        c1936h = new C1936h(str3, true, c1935gArr3);
                                                        if (c1936h2 == null) {
                                                            c1936h2 = b(str3, c1935gArr3);
                                                        }
                                                    }
                                                    arrayList2.add(new f(l10, fVar2 != null ? fVar2 : fVar, str6, j21, i15, j20, c1936h, str7, hexString3, j10, j11, z14, arrayList));
                                                    j19 = j20 + j21;
                                                    ArrayList arrayList10 = new ArrayList();
                                                    if (j11 != -1) {
                                                        j10 += j11;
                                                    }
                                                    j17 = j10;
                                                    iVar2 = iVar;
                                                    arrayList6 = arrayList10;
                                                    hashMap6 = hashMap7;
                                                    str9 = str3;
                                                    c1936h3 = c1936h;
                                                    j11 = -1;
                                                    j20 = j19;
                                                    j18 = j32;
                                                    hashMap5 = hashMap4;
                                                    str5 = str2;
                                                    str6 = str5;
                                                    z11 = z16;
                                                    arrayList5 = arrayList8;
                                                    dVar3 = dVar;
                                                    z14 = false;
                                                    j21 = 0;
                                                    lVar2 = lVar;
                                                }
                                            }
                                            hashMap = hashMap5;
                                            arrayList = arrayList7;
                                            hashMap2 = hashMap7;
                                        }
                                        lVar2 = lVar;
                                        iVar2 = iVar;
                                        hashMap6 = hashMap7;
                                        str9 = str3;
                                    }
                                    arrayList6 = arrayList7;
                                    str5 = str2;
                                    z11 = z16;
                                    arrayList5 = arrayList8;
                                    dVar3 = dVar;
                                }
                                lVar2 = lVar;
                                iVar2 = iVar;
                                hashMap6 = hashMap2;
                                str9 = str3;
                                arrayList6 = arrayList;
                                hashMap5 = hashMap;
                                str5 = str2;
                                z11 = z16;
                                arrayList5 = arrayList8;
                                dVar3 = dVar;
                            }
                            arrayList6 = arrayList7;
                            str5 = str2;
                            z11 = z16;
                            arrayList5 = arrayList8;
                        }
                    }
                }
                str5 = str2;
            }
        }
        d dVar5 = dVar3;
        ArrayList arrayList11 = arrayList6;
        ArrayList arrayList12 = arrayList5;
        boolean z17 = z11;
        HashMap hashMap8 = new HashMap();
        int i27 = 0;
        while (i27 < arrayList4.size()) {
            e eVar = (e) arrayList4.get(i27);
            long j33 = eVar.f10062b;
            if (j33 == -1) {
                j33 = (j14 + arrayList2.size()) - (arrayList11.isEmpty() ? 1L : 0L);
            }
            int i28 = eVar.f10063c;
            if (i28 != -1 || j16 == -9223372036854775807L) {
                i7 = 1;
            } else {
                i7 = 1;
                i28 = (arrayList11.isEmpty() ? ((f) r.l(arrayList2)).f10064A : arrayList11).size() - 1;
            }
            Uri uri = eVar.f10061a;
            hashMap8.put(uri, new e(i28, j33, uri));
            i27 += i7;
        }
        if (dVar5 != null) {
            arrayList11.add(dVar5);
        }
        return new i(i12, str, arrayList12, j12, z17, j13, z12, i13, j14, i14, j15, j16, z10, z13, j13 != 0, c1936h2, arrayList2, arrayList11, hVar3, hashMap8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x015b, code lost:
    
        if (r8 > 0) goto L50;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:102:0x03b1. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r14v48 */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r14v8, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static l e(Q7.h hVar, String str) {
        int i7;
        char c10;
        Pattern pattern;
        ArrayList arrayList;
        ArrayList arrayList2;
        k kVar;
        String str2;
        ArrayList arrayList3;
        int parseInt;
        String str3;
        int i10;
        int i11;
        k kVar2;
        String str4;
        k kVar3;
        HashSet hashSet;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i12;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        int i13;
        int i14;
        ArrayList arrayList9;
        Uri O10;
        HashMap hashMap;
        String str5 = str;
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        boolean z8 = false;
        boolean z10 = false;
        while (true) {
            boolean E10 = hVar.E();
            String str6 = "application/x-mpegURL";
            Pattern pattern2 = f10141Y;
            Pattern pattern3 = f10148d0;
            if (!E10) {
                HashMap hashMap4 = hashMap2;
                ArrayList arrayList18 = arrayList11;
                ArrayList arrayList19 = arrayList12;
                ArrayList arrayList20 = arrayList13;
                ArrayList arrayList21 = arrayList14;
                ArrayList arrayList22 = arrayList15;
                ArrayList arrayList23 = arrayList16;
                ArrayList arrayList24 = arrayList17;
                ArrayList arrayList25 = new ArrayList();
                HashSet hashSet2 = new HashSet();
                int i15 = 0;
                while (i15 < arrayList10.size()) {
                    k kVar4 = (k) arrayList10.get(i15);
                    if (hashSet2.add(kVar4.f10101a)) {
                        m4.L l10 = kVar4.f10102b;
                        AbstractC1705a.m(l10.f20094x == null);
                        ArrayList arrayList26 = (ArrayList) hashMap4.get(kVar4.f10101a);
                        arrayList26.getClass();
                        F4.c cVar = new F4.c(new u(null, null, arrayList26));
                        K a9 = l10.a();
                        a9.f19983i = cVar;
                        hashSet = hashSet2;
                        arrayList25.add(new k(kVar4.f10101a, new m4.L(a9), kVar4.f10103c, kVar4.f10104d, kVar4.f10105e, kVar4.f10106f));
                    } else {
                        hashSet = hashSet2;
                    }
                    i15++;
                    hashSet2 = hashSet;
                }
                int i16 = 0;
                m4.L l11 = null;
                ArrayList arrayList27 = null;
                while (i16 < arrayList22.size()) {
                    ArrayList arrayList28 = arrayList22;
                    String str7 = (String) arrayList28.get(i16);
                    String k = k(str7, f10150e0, hashMap3);
                    String k7 = k(str7, pattern3, hashMap3);
                    K k10 = new K();
                    k10.f19976a = X.c.i(k, ":", k7);
                    k10.f19977b = k7;
                    k10.j = str6;
                    boolean f4 = f(str7, f10155i0);
                    String str8 = str6;
                    boolean z11 = f4;
                    if (f(str7, f10156j0)) {
                        z11 = (f4 ? 1 : 0) | 2;
                    }
                    ?? r14 = z11;
                    if (f(str7, f10154h0)) {
                        r14 = (z11 ? 1 : 0) | 4;
                    }
                    k10.f19979d = r14;
                    String j = j(str7, f10152f0, null, hashMap3);
                    if (TextUtils.isEmpty(j)) {
                        arrayList22 = arrayList28;
                        i7 = 0;
                    } else {
                        int i17 = D.f21141a;
                        arrayList22 = arrayList28;
                        String[] split = j.split(",", -1);
                        i7 = D.k(split, "public.accessibility.describes-video") ? 512 : 0;
                        if (D.k(split, "public.accessibility.transcribes-spoken-dialog")) {
                            i7 |= 4096;
                        }
                        if (D.k(split, "public.accessibility.describes-music-and-sound")) {
                            i7 |= 1024;
                        }
                        if (D.k(split, "public.easy-to-read")) {
                            i7 |= 8192;
                        }
                    }
                    k10.f19980e = i7;
                    k10.f19978c = j(str7, f10146c0, null, hashMap3);
                    String j10 = j(str7, pattern2, null, hashMap3);
                    Uri O11 = j10 == null ? null : AbstractC1705a.O(str5, j10);
                    Pattern pattern4 = pattern2;
                    F4.c cVar2 = new F4.c(new u(k, k7, Collections.emptyList()));
                    String k11 = k(str7, f10143a0, hashMap3);
                    switch (k11.hashCode()) {
                        case -959297733:
                            if (k11.equals("SUBTITLES")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case -333210994:
                            if (k11.equals("CLOSED-CAPTIONS")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 62628790:
                            if (k11.equals("AUDIO")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 81665115:
                            if (k11.equals("VIDEO")) {
                                c10 = 3;
                                break;
                            }
                            break;
                    }
                    c10 = 65535;
                    switch (c10) {
                        case 0:
                            pattern = pattern3;
                            arrayList = arrayList19;
                            arrayList2 = arrayList18;
                            int i18 = 0;
                            while (true) {
                                if (i18 < arrayList10.size()) {
                                    kVar = (k) arrayList10.get(i18);
                                    if (!k.equals(kVar.f10105e)) {
                                        i18++;
                                    }
                                } else {
                                    kVar = null;
                                }
                            }
                            if (kVar != null) {
                                String s3 = D.s(3, kVar.f10102b.f20093w);
                                k10.f19982h = s3;
                                str2 = n5.o.d(s3);
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = "text/vtt";
                            }
                            k10.k = str2;
                            k10.f19983i = cVar2;
                            if (O11 != null) {
                                arrayList3 = arrayList20;
                                arrayList3.add(new j(O11, new m4.L(k10), k7));
                            } else {
                                arrayList3 = arrayList20;
                                AbstractC1705a.S("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            i10 = 1;
                            break;
                        case 1:
                            pattern = pattern3;
                            arrayList = arrayList19;
                            arrayList2 = arrayList18;
                            String k12 = k(str7, f10153g0, hashMap3);
                            if (k12.startsWith("CC")) {
                                parseInt = Integer.parseInt(k12.substring(2));
                                str3 = "application/cea-608";
                            } else {
                                parseInt = Integer.parseInt(k12.substring(7));
                                str3 = "application/cea-708";
                            }
                            if (arrayList27 == null) {
                                arrayList27 = new ArrayList();
                            }
                            k10.k = str3;
                            k10.f19972C = parseInt;
                            arrayList27.add(new m4.L(k10));
                            arrayList3 = arrayList20;
                            i10 = 1;
                            break;
                        case 2:
                            arrayList2 = arrayList18;
                            int i19 = 0;
                            while (true) {
                                if (i19 < arrayList10.size()) {
                                    k kVar5 = (k) arrayList10.get(i19);
                                    pattern = pattern3;
                                    if (k.equals(kVar5.f10104d)) {
                                        kVar2 = kVar5;
                                        i11 = 1;
                                    } else {
                                        i19++;
                                        pattern3 = pattern;
                                    }
                                } else {
                                    pattern = pattern3;
                                    i11 = 1;
                                    kVar2 = null;
                                }
                            }
                            if (kVar2 != null) {
                                String s10 = D.s(i11, kVar2.f10102b.f20093w);
                                k10.f19982h = s10;
                                str4 = n5.o.d(s10);
                            } else {
                                str4 = null;
                            }
                            String j11 = j(str7, f10165w, null, hashMap3);
                            if (j11 != null) {
                                int i20 = D.f21141a;
                                k10.f19996x = Integer.parseInt(j11.split("/", 2)[0]);
                                if ("audio/eac3".equals(str4) && j11.endsWith("/JOC")) {
                                    k10.f19982h = "ec+3";
                                    str4 = "audio/eac3-joc";
                                }
                            }
                            k10.k = str4;
                            if (O11 == null) {
                                arrayList = arrayList19;
                                if (kVar2 != null) {
                                    l11 = new m4.L(k10);
                                    arrayList3 = arrayList20;
                                    i10 = 1;
                                    break;
                                }
                            } else {
                                k10.f19983i = cVar2;
                                arrayList = arrayList19;
                                arrayList.add(new j(O11, new m4.L(k10), k7));
                            }
                            arrayList3 = arrayList20;
                            i10 = 1;
                            break;
                        case 3:
                            int i21 = 0;
                            while (true) {
                                if (i21 < arrayList10.size()) {
                                    kVar3 = (k) arrayList10.get(i21);
                                    if (!k.equals(kVar3.f10103c)) {
                                        i21++;
                                    }
                                } else {
                                    kVar3 = null;
                                }
                            }
                            if (kVar3 != null) {
                                m4.L l12 = kVar3.f10102b;
                                String s11 = D.s(2, l12.f20093w);
                                k10.f19982h = s11;
                                k10.k = n5.o.d(s11);
                                k10.f19988p = l12.f20068E;
                                k10.f19989q = l12.f20069F;
                                k10.f19990r = l12.f20070G;
                            }
                            if (O11 != null) {
                                k10.f19983i = cVar2;
                                arrayList2 = arrayList18;
                                arrayList2.add(new j(O11, new m4.L(k10), k7));
                                pattern = pattern3;
                                arrayList3 = arrayList20;
                                arrayList = arrayList19;
                                i10 = 1;
                                break;
                            }
                        default:
                            pattern = pattern3;
                            arrayList3 = arrayList20;
                            arrayList = arrayList19;
                            arrayList2 = arrayList18;
                            i10 = 1;
                            break;
                    }
                    i16 += i10;
                    str5 = str;
                    arrayList19 = arrayList;
                    arrayList20 = arrayList3;
                    arrayList18 = arrayList2;
                    str6 = str8;
                    pattern2 = pattern4;
                    pattern3 = pattern;
                }
                ArrayList arrayList29 = arrayList20;
                ArrayList arrayList30 = arrayList19;
                ArrayList arrayList31 = arrayList18;
                if (z10) {
                    arrayList27 = Collections.emptyList();
                }
                return new l(str, arrayList24, arrayList25, arrayList31, arrayList30, arrayList29, arrayList21, l11, arrayList27, z8, hashMap3, arrayList23);
            }
            String J10 = hVar.J();
            if (J10.startsWith("#EXT")) {
                arrayList17.add(J10);
            }
            boolean startsWith = J10.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList32 = arrayList14;
            if (J10.startsWith("#EXT-X-DEFINE")) {
                hashMap3.put(k(J10, pattern3, hashMap3), k(J10, f10160n0, hashMap3));
            } else {
                if (J10.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    hashMap = hashMap2;
                    arrayList8 = arrayList11;
                    arrayList7 = arrayList12;
                    arrayList6 = arrayList13;
                    arrayList9 = arrayList15;
                    arrayList4 = arrayList16;
                    arrayList5 = arrayList17;
                    z8 = true;
                } else if (J10.startsWith("#EXT-X-MEDIA")) {
                    arrayList15.add(J10);
                } else if (J10.startsWith("#EXT-X-SESSION-KEY")) {
                    C1935g c11 = c(J10, j(J10, f10139W, "identity", hashMap3), hashMap3);
                    if (c11 != null) {
                        String k13 = k(J10, f10138V, hashMap3);
                        arrayList16.add(new C1936h(("SAMPLE-AES-CENC".equals(k13) || "SAMPLE-AES-CTR".equals(k13)) ? "cenc" : "cbcs", true, c11));
                    }
                } else if (J10.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                    z10 |= J10.contains("CLOSED-CAPTIONS=NONE");
                    int i22 = startsWith ? 16384 : 0;
                    arrayList4 = arrayList16;
                    int parseInt2 = Integer.parseInt(k(J10, f10164v, Collections.emptyMap()));
                    Matcher matcher = f10145c.matcher(J10);
                    if (matcher.find()) {
                        arrayList5 = arrayList17;
                        String group = matcher.group(1);
                        group.getClass();
                        i12 = Integer.parseInt(group);
                    } else {
                        arrayList5 = arrayList17;
                        i12 = -1;
                    }
                    arrayList6 = arrayList13;
                    String j12 = j(J10, f10166x, null, hashMap3);
                    arrayList7 = arrayList12;
                    String j13 = j(J10, f10167y, null, hashMap3);
                    if (j13 != null) {
                        int i23 = D.f21141a;
                        arrayList8 = arrayList11;
                        String[] split2 = j13.split("x", -1);
                        i13 = Integer.parseInt(split2[0]);
                        i14 = Integer.parseInt(split2[1]);
                        if (i13 > 0) {
                        }
                    } else {
                        arrayList8 = arrayList11;
                    }
                    i13 = -1;
                    i14 = -1;
                    arrayList9 = arrayList15;
                    String j14 = j(J10, f10168z, null, hashMap3);
                    float parseFloat = j14 != null ? Float.parseFloat(j14) : -1.0f;
                    HashMap hashMap5 = hashMap2;
                    String j15 = j(J10, f10147d, null, hashMap3);
                    String j16 = j(J10, f10149e, null, hashMap3);
                    String j17 = j(J10, f10151f, null, hashMap3);
                    String j18 = j(J10, f10163u, null, hashMap3);
                    if (startsWith) {
                        O10 = AbstractC1705a.O(str5, k(J10, pattern2, hashMap3));
                    } else {
                        if (!hVar.E()) {
                            throw C1586o0.b("#EXT-X-STREAM-INF must be followed by another line", null);
                        }
                        O10 = AbstractC1705a.O(str5, l(hVar.J(), hashMap3));
                    }
                    K k14 = new K();
                    k14.f19976a = Integer.toString(arrayList10.size());
                    k14.j = "application/x-mpegURL";
                    k14.f19982h = j12;
                    k14.f19981f = i12;
                    k14.g = parseInt2;
                    k14.f19988p = i13;
                    k14.f19989q = i14;
                    k14.f19990r = parseFloat;
                    k14.f19980e = i22;
                    arrayList10.add(new k(O10, new m4.L(k14), j15, j16, j17, j18));
                    hashMap = hashMap5;
                    ArrayList arrayList33 = (ArrayList) hashMap.get(O10);
                    if (arrayList33 == null) {
                        arrayList33 = new ArrayList();
                        hashMap.put(O10, arrayList33);
                    }
                    arrayList33.add(new t(i12, parseInt2, j15, j16, j17, j18));
                }
                hashMap2 = hashMap;
                arrayList14 = arrayList32;
                arrayList16 = arrayList4;
                arrayList17 = arrayList5;
                arrayList13 = arrayList6;
                arrayList12 = arrayList7;
                arrayList11 = arrayList8;
                arrayList15 = arrayList9;
            }
            hashMap = hashMap2;
            arrayList8 = arrayList11;
            arrayList7 = arrayList12;
            arrayList6 = arrayList13;
            arrayList9 = arrayList15;
            arrayList4 = arrayList16;
            arrayList5 = arrayList17;
            hashMap2 = hashMap;
            arrayList14 = arrayList32;
            arrayList16 = arrayList4;
            arrayList17 = arrayList5;
            arrayList13 = arrayList6;
            arrayList12 = arrayList7;
            arrayList11 = arrayList8;
            arrayList15 = arrayList9;
        }
    }

    public static boolean f(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -9.223372036854776E18d;
        }
        String group = matcher.group(1);
        group.getClass();
        return Double.parseDouble(group);
    }

    public static long i(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String group = matcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }

    public static String j(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : l(str2, map);
    }

    public static String k(String str, Pattern pattern, Map map) {
        String j = j(str, pattern, null, map);
        if (j != null) {
            return j;
        }
        throw C1586o0.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String l(String str, Map map) {
        Matcher matcher = f10162p0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069 A[Catch: all -> 0x0096, LOOP:0: B:13:0x0069->B:38:0x0069, LOOP_START, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:13:0x0069, B:15:0x006f, B:18:0x007a, B:53:0x0082, B:20:0x0098, B:22:0x00a0, B:24:0x00a8, B:26:0x00b0, B:28:0x00b8, B:30:0x00c0, B:32:0x00c8, B:34:0x00d0, B:36:0x00d9, B:41:0x00dd, B:60:0x00fd, B:61:0x0103, B:65:0x0030, B:67:0x0036, B:72:0x003f, B:74:0x0048, B:79:0x0051, B:81:0x0057, B:83:0x005d, B:85:0x0062), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fd A[Catch: all -> 0x0096, TRY_ENTER, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:13:0x0069, B:15:0x006f, B:18:0x007a, B:53:0x0082, B:20:0x0098, B:22:0x00a0, B:24:0x00a8, B:26:0x00b0, B:28:0x00b8, B:30:0x00c0, B:32:0x00c8, B:34:0x00d0, B:36:0x00d9, B:41:0x00dd, B:60:0x00fd, B:61:0x0103, B:65:0x0030, B:67:0x0036, B:72:0x003f, B:74:0x0048, B:79:0x0051, B:81:0x0057, B:83:0x005d, B:85:0x0062), top: B:2:0x000f }] */
    @Override // m5.L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Uri uri, C1618o c1618o) {
        String trim;
        Object e2;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c1618o));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            int read = bufferedReader.read();
            boolean z8 = false;
            if (read == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    read = bufferedReader.read();
                }
                if (z8) {
                    throw C1586o0.b("Input does not start with the #EXTM3U header.", null);
                }
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        D.g(bufferedReader);
                        throw C1586o0.b("Failed to parse the playlist, could not identify any tags.", null);
                    }
                    trim = readLine.trim();
                    if (!trim.isEmpty()) {
                        if (!trim.startsWith("#EXT-X-STREAM-INF")) {
                            if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || trim.equals("#EXT-X-ENDLIST")) {
                                break;
                            }
                            arrayDeque.add(trim);
                        } else {
                            arrayDeque.add(trim);
                            e2 = e(new Q7.h(arrayDeque, bufferedReader), uri.toString());
                            break;
                        }
                    }
                }
                arrayDeque.add(trim);
                e2 = d(this.f10169a, this.f10170b, new Q7.h(arrayDeque, bufferedReader), uri.toString());
                return e2;
            }
            while (read != -1 && Character.isWhitespace(read)) {
                read = bufferedReader.read();
            }
            int i7 = 0;
            while (true) {
                if (i7 >= 7) {
                    while (read != -1 && Character.isWhitespace(read) && !D.K(read)) {
                        read = bufferedReader.read();
                    }
                    z8 = D.K(read);
                } else {
                    if (read != "#EXTM3U".charAt(i7)) {
                        break;
                    }
                    read = bufferedReader.read();
                    i7++;
                }
            }
            if (z8) {
            }
        } finally {
            D.g(bufferedReader);
        }
    }
}
