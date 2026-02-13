package J4;

import Q5.e;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import y7.u0;

/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f5514f = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: d, reason: collision with root package name */
    public final CharsetDecoder f5515d = M6.e.f6799c.newDecoder();

    /* renamed from: e, reason: collision with root package name */
    public final CharsetDecoder f5516e = M6.e.f6798b.newDecoder();

    @Override // Q5.e
    public final F4.c u(F4.e eVar, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.f5516e;
        CharsetDecoder charsetDecoder2 = this.f5515d;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new F4.c(new c(bArr, null, null));
        }
        Matcher matcher = f5514f.matcher(str);
        String str3 = null;
        for (int i7 = 0; matcher.find(i7); i7 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String N10 = u0.N(group);
                N10.getClass();
                if (N10.equals("streamurl")) {
                    str3 = group2;
                } else if (N10.equals("streamtitle")) {
                    str2 = group2;
                }
            }
        }
        return new F4.c(new c(bArr, str2, str3));
    }
}
