package V8;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f10214c = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public final CharsetEncoder[] f10215a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10216b;

    static {
        String[] strArr = {"IBM437", "ISO-8859-2", "ISO-8859-3", "ISO-8859-4", "ISO-8859-5", "ISO-8859-6", "ISO-8859-7", "ISO-8859-8", "ISO-8859-9", "ISO-8859-10", "ISO-8859-11", "ISO-8859-13", "ISO-8859-14", "ISO-8859-15", "ISO-8859-16", "windows-1250", "windows-1251", "windows-1252", "windows-1256", "Shift_JIS"};
        for (int i7 = 0; i7 < 20; i7++) {
            String str = strArr[i7];
            if (((d) d.f10202d.get(str)) != null) {
                try {
                    f10214c.add(Charset.forName(str).newEncoder());
                } catch (UnsupportedCharsetException unused) {
                }
            }
        }
    }

    public f(String str, Charset charset) {
        int i7;
        boolean z8;
        ArrayList arrayList = new ArrayList();
        arrayList.add(StandardCharsets.ISO_8859_1.newEncoder());
        int i10 = 0;
        boolean z10 = charset != null && charset.name().startsWith("UTF");
        int i11 = 0;
        while (true) {
            i7 = -1;
            if (i11 >= str.length()) {
                break;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                CharsetEncoder charsetEncoder = (CharsetEncoder) it.next();
                char charAt = str.charAt(i11);
                if (charAt == 65535 || charsetEncoder.canEncode(charAt)) {
                    z8 = true;
                    break;
                }
            }
            z8 = false;
            if (!z8) {
                Iterator it2 = f10214c.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    CharsetEncoder charsetEncoder2 = (CharsetEncoder) it2.next();
                    if (charsetEncoder2.canEncode(str.charAt(i11))) {
                        arrayList.add(charsetEncoder2);
                        z8 = true;
                        break;
                    }
                }
            }
            if (!z8) {
                z10 = true;
            }
            i11++;
        }
        if (arrayList.size() != 1 || z10) {
            this.f10215a = new CharsetEncoder[arrayList.size() + 2];
            Iterator it3 = arrayList.iterator();
            int i12 = 0;
            while (it3.hasNext()) {
                this.f10215a[i12] = (CharsetEncoder) it3.next();
                i12++;
            }
            this.f10215a[i12] = StandardCharsets.UTF_8.newEncoder();
            this.f10215a[i12 + 1] = StandardCharsets.UTF_16BE.newEncoder();
        } else {
            this.f10215a = new CharsetEncoder[]{(CharsetEncoder) arrayList.get(0)};
        }
        if (charset != null) {
            while (true) {
                CharsetEncoder[] charsetEncoderArr = this.f10215a;
                if (i10 < charsetEncoderArr.length) {
                    if (charsetEncoderArr[i10] != null && charset.name().equals(this.f10215a[i10].charset().name())) {
                        i7 = i10;
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
        }
        this.f10216b = i7;
    }
}
