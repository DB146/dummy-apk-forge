package W4;

import N6.t0;
import N6.y0;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import m4.C1586o0;
import m4.K;
import m4.L;
import n5.AbstractC1705a;
import o4.AbstractC1787a;
import o4.M;
import y7.u0;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final l f10790a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f10791b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x02c5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:36:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x06bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v(o oVar, C0585c c0585c, Uri uri) {
        String str;
        char c10;
        String str2;
        C0584b c0584b;
        int i7;
        y0 y0Var;
        Object obj;
        int i10;
        int i11;
        y0 g;
        char c11;
        int i12;
        boolean z8;
        boolean z10;
        boolean z11;
        int i13;
        Uri parse;
        y0 y0Var2 = c0585c.f10679i;
        AbstractC1705a.g("missing attribute control", y0Var2.containsKey("control"));
        K k = new K();
        int i14 = c0585c.f10676e;
        if (i14 > 0) {
            k.f19981f = i14;
        }
        C0584b c0584b2 = c0585c.j;
        String str3 = c0584b2.f10669b;
        String O10 = u0.O(str3);
        O10.getClass();
        switch (O10.hashCode()) {
            case -1922091719:
                str = "audio/3gpp";
                if (O10.equals("MPEG4-GENERIC")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 2412:
                str = "audio/3gpp";
                if (O10.equals("L8")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 64593:
                str = "audio/3gpp";
                if (O10.equals("AC3")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 64934:
                str = "audio/3gpp";
                if (O10.equals("AMR")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 74609:
                str = "audio/3gpp";
                if (O10.equals("L16")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 85182:
                str = "audio/3gpp";
                if (O10.equals("VP8")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 85183:
                str = "audio/3gpp";
                if (O10.equals("VP9")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 2194728:
                str = "audio/3gpp";
                if (O10.equals("H264")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 2194729:
                str = "audio/3gpp";
                if (O10.equals("H265")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 2433087:
                str = "audio/3gpp";
                if (O10.equals("OPUS")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 2450119:
                str = "audio/3gpp";
                if (O10.equals("PCMA")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 2450139:
                str = "audio/3gpp";
                if (O10.equals("PCMU")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case 1061166827:
                str = "audio/3gpp";
                if (O10.equals("MP4A-LATM")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 1934494802:
                str = "audio/3gpp";
                if (O10.equals("AMR-WB")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case 1959269366:
                str = "audio/3gpp";
                if (O10.equals("MP4V-ES")) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case 2137188397:
                str = "audio/3gpp";
                if (O10.equals("H263-1998")) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case 2137209252:
                str = "audio/3gpp";
                if (O10.equals("H263-2000")) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            default:
                str = "audio/3gpp";
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
            case '\f':
                str2 = "audio/mp4a-latm";
                break;
            case 1:
            case 4:
                str2 = "audio/raw";
                break;
            case 2:
                str2 = "audio/ac3";
                break;
            case 3:
                str2 = str;
                break;
            case 5:
                str2 = "video/x-vnd.on2.vp8";
                break;
            case 6:
                str2 = "video/x-vnd.on2.vp9";
                break;
            case 7:
                str2 = "video/avc";
                break;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                str2 = "video/hevc";
                break;
            case '\t':
                str2 = "audio/opus";
                break;
            case '\n':
                str2 = "audio/g711-alaw";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                str2 = "audio/g711-mlaw";
                break;
            case '\r':
                str2 = "audio/amr-wb";
                break;
            case 14:
                str2 = "video/mp4v-es";
                break;
            case 15:
            case 16:
                str2 = "video/3gpp";
                break;
            default:
                throw new IllegalArgumentException(str3);
        }
        k.k = str2;
        boolean equals = "audio".equals(c0585c.f10672a);
        int i15 = c0584b2.f10670c;
        if (equals) {
            int i16 = c0584b2.f10671d;
            c0584b = c0584b2;
            i16 = i16 == -1 ? str2.equals("audio/ac3") ? 6 : 1 : i16;
            k.f19997y = i15;
            k.f19996x = i16;
            i7 = i16;
        } else {
            c0584b = c0584b2;
            i7 = -1;
        }
        String str4 = (String) y0Var2.get("fmtp");
        if (str4 == null) {
            g = y0.f7368u;
            y0Var = y0Var2;
            obj = "MP4A-LATM";
            i11 = i7;
            i10 = i15;
        } else {
            int i17 = n5.D.f21141a;
            y0Var = y0Var2;
            obj = "MP4A-LATM";
            String[] split = str4.split(" ", 2);
            i10 = i15;
            AbstractC1705a.g(str4, split.length == 2);
            String[] split2 = split[1].split(";\\s?", 0);
            A4.s sVar = new A4.s(4);
            int length = split2.length;
            int i18 = 0;
            while (i18 < length) {
                String[] strArr = split2;
                String[] split3 = split2[i18].split("=", 2);
                sVar.B(split3[0], split3[1]);
                i18++;
                length = length;
                split2 = strArr;
                i7 = i7;
            }
            i11 = i7;
            g = sVar.g();
        }
        switch (str2.hashCode()) {
            case -1664118616:
                if (str2.equals("video/3gpp")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            case -1662541442:
                if (str2.equals("video/hevc")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case -1606874997:
                if (str2.equals("audio/amr-wb")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case -53558318:
                if (str2.equals("audio/mp4a-latm")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case 187078296:
                if (str2.equals("audio/ac3")) {
                    c11 = 11;
                    break;
                }
                c11 = 65535;
                break;
            case 187094639:
                if (str2.equals("audio/raw")) {
                    c11 = '\n';
                    break;
                }
                c11 = 65535;
                break;
            case 1187890754:
                if (str2.equals("video/mp4v-es")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case 1331836730:
                if (str2.equals("video/avc")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case 1503095341:
                if (str2.equals(str)) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case 1504891608:
                if (str2.equals("audio/opus")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case 1599127256:
                if (str2.equals("video/x-vnd.on2.vp8")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            case 1599127257:
                if (str2.equals("video/x-vnd.on2.vp9")) {
                    c11 = '\t';
                    break;
                }
                c11 = 65535;
                break;
            case 1903231877:
                if (str2.equals("audio/g711-alaw")) {
                    c11 = '\f';
                    break;
                }
                c11 = 65535;
                break;
            case 1903589369:
                if (str2.equals("audio/g711-mlaw")) {
                    c11 = '\r';
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
                i12 = i10;
                int i19 = i11;
                AbstractC1705a.h(i19 != -1);
                AbstractC1705a.g("missing attribute fmtp", !g.isEmpty());
                Object obj2 = obj;
                if (str3.equals(obj2)) {
                    AbstractC1705a.g("Only supports cpresent=0 in AAC audio.", g.containsKey("cpresent") && ((String) g.get("cpresent")).equals("0"));
                    String str5 = (String) g.get("config");
                    if (str5 == null) {
                        throw new NullPointerException("AAC audio stream must include config fmtp parameter");
                    }
                    AbstractC1705a.g("Malformat MPEG4 config: ".concat(str5), str5.length() % 2 == 0);
                    byte[] q10 = n5.D.q(str5);
                    b5.f fVar = new b5.f(q10, q10.length);
                    z8 = true;
                    AbstractC1705a.g("Only supports audio mux version 0.", fVar.i(1) == 0);
                    AbstractC1705a.g("Only supports allStreamsSameTimeFraming.", fVar.i(1) == 1);
                    fVar.s(6);
                    AbstractC1705a.g("Only supports one program.", fVar.i(4) == 0);
                    AbstractC1705a.g("Only supports one numLayer.", fVar.i(3) == 0);
                    z10 = false;
                    try {
                        M k7 = AbstractC1787a.k(fVar, false);
                        k.f19997y = k7.f21766a;
                        k.f19996x = k7.f21767b;
                        k.a((String) k7.f21768c);
                    } catch (C1586o0 e2) {
                        throw new IllegalArgumentException(e2);
                    }
                } else {
                    z8 = true;
                    z10 = false;
                }
                String str6 = (String) g.get("profile-level-id");
                if (str6 == null && str3.equals(obj2)) {
                    str6 = "30";
                }
                AbstractC1705a.g("missing profile-level-id param", (str6 == null || str6.isEmpty()) ? z10 : z8);
                k.f19982h = "mp4a.40." + str6;
                k.f19985m = N6.H.K(AbstractC1787a.a(i12, i19));
                AbstractC1705a.h(i12 > 0 ? z8 : z10);
                this.f10790a = new l(new L(k), c0584b.f10668a, i12, g, str3);
                String str7 = (String) y0Var.get("control");
                int i20 = n5.D.f21141a;
                parse = Uri.parse(str7);
                if (!parse.isAbsolute()) {
                    parse = !TextUtils.isEmpty(oVar.c("Content-Base")) ? Uri.parse(oVar.c("Content-Base")) : !TextUtils.isEmpty(oVar.c("Content-Location")) ? Uri.parse(oVar.c("Content-Location")) : uri;
                    if (!str7.equals("*")) {
                        parse = parse.buildUpon().appendEncodedPath(str7).build();
                    }
                }
                this.f10791b = parse;
                return;
            case 1:
            case 2:
                i12 = i10;
                AbstractC1705a.g("Multi channel AMR is not currently supported.", i11 == 1);
                AbstractC1705a.g("fmtp parameters must include octet-align.", !g.isEmpty());
                AbstractC1705a.g("Only octet aligned mode is currently supported.", g.containsKey("octet-align"));
                AbstractC1705a.g("Interleaving mode is not currently supported.", !g.containsKey("interleaving"));
                z8 = true;
                z10 = false;
                AbstractC1705a.h(i12 > 0 ? z8 : z10);
                this.f10790a = new l(new L(k), c0584b.f10668a, i12, g, str3);
                String str72 = (String) y0Var.get("control");
                int i202 = n5.D.f21141a;
                parse = Uri.parse(str72);
                if (!parse.isAbsolute()) {
                }
                this.f10791b = parse;
                return;
            case 3:
                AbstractC1705a.h(i11 != -1);
                i12 = i10;
                AbstractC1705a.g("Invalid OPUS clock rate.", i12 == 48000);
                z8 = true;
                z10 = false;
                AbstractC1705a.h(i12 > 0 ? z8 : z10);
                this.f10790a = new l(new L(k), c0584b.f10668a, i12, g, str3);
                String str722 = (String) y0Var.get("control");
                int i2022 = n5.D.f21141a;
                parse = Uri.parse(str722);
                if (!parse.isAbsolute()) {
                }
                this.f10791b = parse;
                return;
            case 4:
                AbstractC1705a.h(!g.isEmpty());
                String str8 = (String) g.get("config");
                if (str8 != null) {
                    byte[] q11 = n5.D.q(str8);
                    k.f19985m = N6.H.K(q11);
                    n5.v vVar = new n5.v(q11);
                    int i21 = 0;
                    while (true) {
                        int i22 = i21 + 3;
                        if (i22 >= q11.length) {
                            z11 = false;
                        } else if (vVar.x() == 1 && (q11[i22] & 240) == 32) {
                            z11 = true;
                        } else {
                            vVar.G(vVar.f21230b - 2);
                            i21++;
                        }
                    }
                    AbstractC1705a.g("Invalid input: VOL not found.", z11);
                    b5.f fVar2 = new b5.f(q11, q11.length);
                    fVar2.s((i21 + 4) * 8);
                    fVar2.s(1);
                    fVar2.s(8);
                    if (fVar2.h()) {
                        fVar2.s(4);
                        fVar2.s(3);
                    }
                    if (fVar2.i(4) == 15) {
                        fVar2.s(8);
                        fVar2.s(8);
                    }
                    if (fVar2.h()) {
                        i13 = 2;
                        fVar2.s(2);
                        fVar2.s(1);
                        if (fVar2.h()) {
                            fVar2.s(79);
                        }
                    } else {
                        i13 = 2;
                    }
                    AbstractC1705a.g("Only supports rectangular video object layer shape.", fVar2.i(i13) == 0);
                    AbstractC1705a.h(fVar2.h());
                    int i23 = fVar2.i(16);
                    AbstractC1705a.h(fVar2.h());
                    if (fVar2.h()) {
                        AbstractC1705a.h(i23 > 0);
                        int i24 = 0;
                        for (int i25 = i23 - 1; i25 > 0; i25 >>= 1) {
                            i24++;
                        }
                        fVar2.s(i24);
                    }
                    AbstractC1705a.h(fVar2.h());
                    int i26 = fVar2.i(13);
                    AbstractC1705a.h(fVar2.h());
                    int i27 = fVar2.i(13);
                    AbstractC1705a.h(fVar2.h());
                    fVar2.s(1);
                    Pair create = Pair.create(Integer.valueOf(i26), Integer.valueOf(i27));
                    k.f19988p = ((Integer) create.first).intValue();
                    k.f19989q = ((Integer) create.second).intValue();
                } else {
                    k.f19988p = 352;
                    k.f19989q = 288;
                }
                String str9 = (String) g.get("profile-level-id");
                k.f19982h = "mp4v.".concat(str9 == null ? "1" : str9);
                i12 = i10;
                z8 = true;
                z10 = false;
                AbstractC1705a.h(i12 > 0 ? z8 : z10);
                this.f10790a = new l(new L(k), c0584b.f10668a, i12, g, str3);
                String str7222 = (String) y0Var.get("control");
                int i20222 = n5.D.f21141a;
                parse = Uri.parse(str7222);
                if (!parse.isAbsolute()) {
                }
                this.f10791b = parse;
                return;
            case 5:
                k.e(352);
                k.b(288);
                i12 = i10;
                z8 = true;
                z10 = false;
                AbstractC1705a.h(i12 > 0 ? z8 : z10);
                this.f10790a = new l(new L(k), c0584b.f10668a, i12, g, str3);
                String str72222 = (String) y0Var.get("control");
                int i202222 = n5.D.f21141a;
                parse = Uri.parse(str72222);
                if (!parse.isAbsolute()) {
                }
                this.f10791b = parse;
                return;
            case 6:
                AbstractC1705a.g("missing attribute fmtp", !g.isEmpty());
                AbstractC1705a.g("missing sprop parameter", g.containsKey("sprop-parameter-sets"));
                String str10 = (String) g.get("sprop-parameter-sets");
                AbstractC1705a.l(str10);
                String[] W10 = n5.D.W(str10, ",");
                AbstractC1705a.g("empty sprop value", W10.length == 2);
                t0 L = N6.H.L(a(W10[0]), a(W10[1]));
                k.c(L);
                byte[] bArr = (byte[]) L.get(0);
                n5.r J10 = AbstractC1705a.J(4, bArr, bArr.length);
                k.d(J10.g);
                k.b(J10.f21211f);
                k.e(J10.f21210e);
                String str11 = (String) g.get("profile-level-id");
                if (str11 != null) {
                    k.a("avc1.".concat(str11));
                } else {
                    k.a(AbstractC1705a.e(J10.f21206a, J10.f21207b, J10.f21208c));
                }
                i12 = i10;
                z8 = true;
                z10 = false;
                AbstractC1705a.h(i12 > 0 ? z8 : z10);
                this.f10790a = new l(new L(k), c0584b.f10668a, i12, g, str3);
                String str722222 = (String) y0Var.get("control");
                int i2022222 = n5.D.f21141a;
                parse = Uri.parse(str722222);
                if (!parse.isAbsolute()) {
                }
                this.f10791b = parse;
                return;
            case 7:
                AbstractC1705a.g("missing attribute fmtp", !g.isEmpty());
                if (g.containsKey("sprop-max-don-diff")) {
                    String str12 = (String) g.get("sprop-max-don-diff");
                    AbstractC1705a.l(str12);
                    int parseInt = Integer.parseInt(str12);
                    AbstractC1705a.g("non-zero sprop-max-don-diff " + parseInt + " is not supported", parseInt == 0);
                }
                AbstractC1705a.g("missing sprop-vps parameter", g.containsKey("sprop-vps"));
                String str13 = (String) g.get("sprop-vps");
                AbstractC1705a.l(str13);
                AbstractC1705a.g("missing sprop-sps parameter", g.containsKey("sprop-sps"));
                String str14 = (String) g.get("sprop-sps");
                AbstractC1705a.l(str14);
                AbstractC1705a.g("missing sprop-pps parameter", g.containsKey("sprop-pps"));
                String str15 = (String) g.get("sprop-pps");
                AbstractC1705a.l(str15);
                t0 M3 = N6.H.M(a(str13), a(str14), a(str15));
                k.c(M3);
                byte[] bArr2 = (byte[]) M3.get(1);
                n5.p I6 = AbstractC1705a.I(4, bArr2, bArr2.length);
                k.d(I6.f21202i);
                k.b(I6.f21201h);
                k.e(I6.g);
                k.a(AbstractC1705a.f(I6.f21195a, I6.f21196b, I6.f21197c, I6.f21198d, I6.f21199e, I6.f21200f));
                i12 = i10;
                z8 = true;
                z10 = false;
                AbstractC1705a.h(i12 > 0 ? z8 : z10);
                this.f10790a = new l(new L(k), c0584b.f10668a, i12, g, str3);
                String str7222222 = (String) y0Var.get("control");
                int i20222222 = n5.D.f21141a;
                parse = Uri.parse(str7222222);
                if (!parse.isAbsolute()) {
                }
                this.f10791b = parse;
                return;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                k.f19988p = 320;
                k.f19989q = 240;
                i12 = i10;
                z8 = true;
                z10 = false;
                AbstractC1705a.h(i12 > 0 ? z8 : z10);
                this.f10790a = new l(new L(k), c0584b.f10668a, i12, g, str3);
                String str72222222 = (String) y0Var.get("control");
                int i202222222 = n5.D.f21141a;
                parse = Uri.parse(str72222222);
                if (!parse.isAbsolute()) {
                }
                this.f10791b = parse;
                return;
            case '\t':
                k.f19988p = 320;
                k.f19989q = 240;
                i12 = i10;
                z8 = true;
                z10 = false;
                AbstractC1705a.h(i12 > 0 ? z8 : z10);
                this.f10790a = new l(new L(k), c0584b.f10668a, i12, g, str3);
                String str722222222 = (String) y0Var.get("control");
                int i2022222222 = n5.D.f21141a;
                parse = Uri.parse(str722222222);
                if (!parse.isAbsolute()) {
                }
                this.f10791b = parse;
                return;
            case '\n':
                AbstractC1705a.h(str3.equals("L8") || str3.equals("L16"));
                k.f19998z = str3.equals("L8") ? 3 : 268435456;
                i12 = i10;
                z8 = true;
                z10 = false;
                AbstractC1705a.h(i12 > 0 ? z8 : z10);
                this.f10790a = new l(new L(k), c0584b.f10668a, i12, g, str3);
                String str7222222222 = (String) y0Var.get("control");
                int i20222222222 = n5.D.f21141a;
                parse = Uri.parse(str7222222222);
                if (!parse.isAbsolute()) {
                }
                this.f10791b = parse;
                return;
            default:
                i12 = i10;
                z8 = true;
                z10 = false;
                AbstractC1705a.h(i12 > 0 ? z8 : z10);
                this.f10790a = new l(new L(k), c0584b.f10668a, i12, g, str3);
                String str72222222222 = (String) y0Var.get("control");
                int i202222222222 = n5.D.f21141a;
                parse = Uri.parse(str72222222222);
                if (!parse.isAbsolute()) {
                }
                this.f10791b = parse;
                return;
        }
    }

    public static byte[] a(String str) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length + 4];
        System.arraycopy(AbstractC1705a.f21155d, 0, bArr, 0, 4);
        System.arraycopy(decode, 0, bArr, 4, decode.length);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        return this.f10790a.equals(vVar.f10790a) && this.f10791b.equals(vVar.f10791b);
    }

    public final int hashCode() {
        return this.f10791b.hashCode() + ((this.f10790a.hashCode() + 217) * 31);
    }
}
