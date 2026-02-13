package Z4;

import A4.o;
import A4.w;
import android.util.Base64;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: e, reason: collision with root package name */
    public boolean f12176e;

    /* renamed from: f, reason: collision with root package name */
    public UUID f12177f;
    public byte[] g;

    @Override // Z4.d
    public final Object b() {
        UUID uuid = this.f12177f;
        byte[] a9 = o.a(uuid, null, this.g);
        byte[] bArr = this.g;
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < bArr.length; i7 += 2) {
            sb2.append((char) bArr[i7]);
        }
        String sb3 = sb2.toString();
        byte[] decode = Base64.decode(sb3.substring(sb3.indexOf("<KID>") + 5, sb3.indexOf("</KID>")), 0);
        byte b2 = decode[0];
        decode[0] = decode[3];
        decode[3] = b2;
        byte b10 = decode[1];
        decode[1] = decode[2];
        decode[2] = b10;
        byte b11 = decode[4];
        decode[4] = decode[5];
        decode[5] = b11;
        byte b12 = decode[6];
        decode[6] = decode[7];
        decode[7] = b12;
        return new a(uuid, a9, new w[]{new w(true, null, 8, decode, 0, 0, null)});
    }

    @Override // Z4.d
    public final boolean d(String str) {
        return "ProtectionHeader".equals(str);
    }

    @Override // Z4.d
    public final void f(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f12176e = false;
        }
    }

    @Override // Z4.d
    public final void j(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f12176e = true;
            String attributeValue = xmlPullParser.getAttributeValue(null, "SystemID");
            if (attributeValue.charAt(0) == '{' && attributeValue.charAt(attributeValue.length() - 1) == '}') {
                attributeValue = attributeValue.substring(1, attributeValue.length() - 1);
            }
            this.f12177f = UUID.fromString(attributeValue);
        }
    }

    @Override // Z4.d
    public final void k(XmlPullParser xmlPullParser) {
        if (this.f12176e) {
            this.g = Base64.decode(xmlPullParser.getText(), 0);
        }
    }
}
