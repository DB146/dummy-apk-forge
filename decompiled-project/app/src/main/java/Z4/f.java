package Z4;

import P4.o0;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import m4.K;
import m4.L;
import n5.AbstractC1705a;
import n5.D;
import o4.AbstractC1787a;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class f extends d {

    /* renamed from: e, reason: collision with root package name */
    public L f12178e;

    public static ArrayList m(String str) {
        byte[][] bArr;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            byte[] q10 = D.q(str);
            if (q10.length > 4) {
                int i7 = 0;
                while (true) {
                    byte[] bArr2 = AbstractC1705a.f21152a;
                    if (i7 >= 4) {
                        ArrayList arrayList2 = new ArrayList();
                        int i10 = 0;
                        do {
                            arrayList2.add(Integer.valueOf(i10));
                            i10 += 4;
                            int length = q10.length - 4;
                            while (true) {
                                if (i10 > length) {
                                    i10 = -1;
                                    break;
                                }
                                if (q10.length - i10 > 4) {
                                    for (int i11 = 0; i11 < 4; i11++) {
                                        if (q10[i10 + i11] != bArr2[i11]) {
                                            break;
                                        }
                                    }
                                    break;
                                }
                                i10++;
                            }
                        } while (i10 != -1);
                        byte[][] bArr3 = new byte[arrayList2.size()];
                        int i12 = 0;
                        while (i12 < arrayList2.size()) {
                            int intValue = ((Integer) arrayList2.get(i12)).intValue();
                            int intValue2 = (i12 < arrayList2.size() + (-1) ? ((Integer) arrayList2.get(i12 + 1)).intValue() : q10.length) - intValue;
                            byte[] bArr4 = new byte[intValue2];
                            System.arraycopy(q10, intValue, bArr4, 0, intValue2);
                            bArr3[i12] = bArr4;
                            i12++;
                        }
                        bArr = bArr3;
                    } else {
                        if (q10[i7] != bArr2[i7]) {
                            break;
                        }
                        i7++;
                    }
                }
            }
            bArr = null;
            if (bArr == null) {
                arrayList.add(q10);
            } else {
                Collections.addAll(arrayList, bArr);
            }
        }
        return arrayList;
    }

    @Override // Z4.d
    public final Object b() {
        return this.f12178e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    @Override // Z4.d
    public final void j(XmlPullParser xmlPullParser) {
        int i7;
        K k = new K();
        String attributeValue = xmlPullParser.getAttributeValue(null, "FourCC");
        if (attributeValue == null) {
            throw new o0("FourCC", 1);
        }
        String str = (attributeValue.equalsIgnoreCase("H264") || attributeValue.equalsIgnoreCase("X264") || attributeValue.equalsIgnoreCase("AVC1") || attributeValue.equalsIgnoreCase("DAVC")) ? "video/avc" : (attributeValue.equalsIgnoreCase("AAC") || attributeValue.equalsIgnoreCase("AACL") || attributeValue.equalsIgnoreCase("AACH") || attributeValue.equalsIgnoreCase("AACP")) ? "audio/mp4a-latm" : (attributeValue.equalsIgnoreCase("TTML") || attributeValue.equalsIgnoreCase("DFXP")) ? "application/ttml+xml" : (attributeValue.equalsIgnoreCase("ac-3") || attributeValue.equalsIgnoreCase("dac3")) ? "audio/ac3" : (attributeValue.equalsIgnoreCase("ec-3") || attributeValue.equalsIgnoreCase("dec3")) ? "audio/eac3" : attributeValue.equalsIgnoreCase("dtsc") ? "audio/vnd.dts" : (attributeValue.equalsIgnoreCase("dtsh") || attributeValue.equalsIgnoreCase("dtsl")) ? "audio/vnd.dts.hd" : attributeValue.equalsIgnoreCase("dtse") ? "audio/vnd.dts.hd;profile=lbr" : attributeValue.equalsIgnoreCase("opus") ? "audio/opus" : null;
        int intValue = ((Integer) c("Type")).intValue();
        if (intValue == 2) {
            ArrayList m10 = m(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
            k.j = "video/mp4";
            k.f19988p = d.i(xmlPullParser, "MaxWidth");
            k.f19989q = d.i(xmlPullParser, "MaxHeight");
            k.f19985m = m10;
        } else if (intValue == 1) {
            if (str == null) {
                str = "audio/mp4a-latm";
            }
            int i10 = d.i(xmlPullParser, "Channels");
            int i11 = d.i(xmlPullParser, "SamplingRate");
            ArrayList m11 = m(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
            boolean isEmpty = m11.isEmpty();
            ArrayList arrayList = m11;
            if (isEmpty) {
                arrayList = m11;
                if ("audio/mp4a-latm".equals(str)) {
                    arrayList = Collections.singletonList(AbstractC1787a.a(i11, i10));
                }
            }
            k.j = "audio/mp4";
            k.f19996x = i10;
            k.f19997y = i11;
            k.f19985m = arrayList;
        } else if (intValue == 3) {
            String str2 = (String) c("Subtype");
            if (str2 != null) {
                if (str2.equals("CAPT")) {
                    i7 = 64;
                } else if (str2.equals("DESC")) {
                    i7 = 1024;
                }
                k.j = "application/mp4";
                k.f19980e = i7;
            }
            i7 = 0;
            k.j = "application/mp4";
            k.f19980e = i7;
        } else {
            k.j = "application/mp4";
        }
        k.f19976a = xmlPullParser.getAttributeValue(null, "Index");
        k.f19977b = (String) c("Name");
        k.k = str;
        k.f19981f = d.i(xmlPullParser, "Bitrate");
        k.f19978c = (String) c("Language");
        this.f12178e = new L(k);
    }
}
