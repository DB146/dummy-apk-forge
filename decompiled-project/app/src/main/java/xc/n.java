package xc;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f26360a = {',', ';'};

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f26361b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f26362c = new ArrayList(106);

    /* renamed from: d, reason: collision with root package name */
    public static final wc.g f26363d = new wc.g(new wc.d(3), 1);

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f26364e = new ThreadLocal();

    public static void a(wc.c cVar, m mVar, int i7) {
        String str;
        int binarySearch = Arrays.binarySearch(mVar.f26358c, i7);
        if (binarySearch >= 0) {
            String[] strArr = mVar.f26359d;
            if (binarySearch < strArr.length - 1) {
                int i10 = binarySearch + 1;
                if (mVar.f26358c[i10] == i7) {
                    str = strArr[i10];
                }
            }
            str = strArr[binarySearch];
        } else {
            str = "";
        }
        if ("".equals(str)) {
            cVar.b("&#x").b(Integer.toHexString(i7)).a(';');
        } else {
            cVar.a('&').b(str).a(';');
        }
    }

    public static boolean b(int i7, char c10, CharsetEncoder charsetEncoder) {
        int b2 = P.c.b(i7);
        return b2 != 0 ? b2 != 1 ? charsetEncoder.canEncode(c10) : c10 < 55296 || c10 >= 57344 : c10 < 128;
    }

    public static void c(wc.c cVar, String str, f fVar, int i7) {
        m mVar = fVar.f26335a;
        Charset charset = fVar.f26336b;
        String name = charset.name();
        int i10 = name.equals("US-ASCII") ? 1 : name.startsWith("UTF-") ? 2 : 3;
        ThreadLocal threadLocal = f26364e;
        CharsetEncoder charsetEncoder = (CharsetEncoder) threadLocal.get();
        if (charsetEncoder == null || !charsetEncoder.charset().equals(charset)) {
            charsetEncoder = charset.newEncoder();
            threadLocal.set(charsetEncoder);
        }
        int length = str.length();
        int i11 = 0;
        boolean z8 = false;
        boolean z10 = false;
        boolean z11 = false;
        while (i11 < length) {
            int codePointAt = str.codePointAt(i11);
            if ((i7 & 4) != 0) {
                if (wc.l.i(codePointAt)) {
                    if (((i7 & 8) == 0 || z10) && !z11) {
                        if ((i7 & 16) != 0) {
                            z8 = true;
                        } else {
                            cVar.a(' ');
                            z11 = true;
                        }
                        i11 += Character.charCount(codePointAt);
                    }
                    i11 += Character.charCount(codePointAt);
                } else {
                    if (z8) {
                        cVar.a(' ');
                        z8 = false;
                    }
                    z10 = true;
                    z11 = false;
                }
            }
            m mVar2 = m.f26352e;
            if (mVar2 != mVar || codePointAt == 9 || codePointAt == 10 || codePointAt == 13 || ((codePointAt >= 32 && codePointAt <= 55295) || ((codePointAt >= 57344 && codePointAt <= 65533) || (codePointAt >= 65536 && codePointAt <= 1114111)))) {
                char c10 = (char) codePointAt;
                if (codePointAt >= 65536) {
                    if (b(i10, c10, charsetEncoder)) {
                        char[] cArr = (char[]) f26363d.get();
                        int chars = Character.toChars(codePointAt, cArr, 0);
                        switch (cVar.f25873a) {
                            case 0:
                                try {
                                    cVar.f25874b.append((CharSequence) new String(cArr, 0, chars));
                                    break;
                                } catch (IOException e2) {
                                    throw new Db.d(13, e2);
                                }
                            default:
                                cVar.f25874b.append(cArr, 0, chars);
                                break;
                        }
                    } else {
                        a(cVar, mVar, codePointAt);
                    }
                    i11 += Character.charCount(codePointAt);
                } else if (c10 == '\t' || c10 == '\n' || c10 == '\r') {
                    cVar.a(c10);
                } else if (c10 != '\"') {
                    if (c10 == '<') {
                        cVar.b("&lt;");
                    } else if (c10 == '>') {
                        cVar.b("&gt;");
                    } else if (c10 != 160) {
                        if (c10 == '&') {
                            cVar.b("&amp;");
                        } else if (c10 != '\'') {
                            if (c10 < ' ' || !b(i10, c10, charsetEncoder)) {
                                a(cVar, mVar, codePointAt);
                            } else {
                                cVar.a(c10);
                            }
                        } else if ((i7 & 2) == 0 || (i7 & 1) == 0) {
                            cVar.a('\'');
                        } else if (mVar == mVar2) {
                            cVar.b("&#x27;");
                        } else {
                            cVar.b("&apos;");
                        }
                    } else if (mVar != mVar2) {
                        cVar.b("&nbsp;");
                    } else {
                        cVar.b("&#xa0;");
                    }
                } else if ((i7 & 2) != 0) {
                    cVar.b("&quot;");
                } else {
                    cVar.a(c10);
                }
            }
            i11 += Character.charCount(codePointAt);
        }
    }
}
