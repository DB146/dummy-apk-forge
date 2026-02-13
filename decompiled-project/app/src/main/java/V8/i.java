package V8;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f10230a = Charset.defaultCharset();

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f10231b;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f10232c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f10233d;

    static {
        Charset charset;
        Charset charset2;
        Charset charset3 = null;
        try {
            charset = Charset.forName("SJIS");
        } catch (UnsupportedCharsetException unused) {
            charset = null;
        }
        f10231b = charset;
        try {
            charset2 = Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused2) {
            charset2 = null;
        }
        f10232c = charset2;
        try {
            charset3 = Charset.forName("EUC_JP");
        } catch (UnsupportedCharsetException unused3) {
        }
        Charset charset4 = f10231b;
        f10233d = (charset4 != null && charset4.equals(f10230a)) || (charset3 != null && charset3.equals(f10230a));
    }
}
