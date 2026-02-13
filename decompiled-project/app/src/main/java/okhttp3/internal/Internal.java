package okhttp3.internal;

import ac.AbstractC0796a;
import ac.n;
import c2.q;
import java.nio.charset.Charset;
import okhttp3.MediaType;

/* loaded from: classes2.dex */
public final class Internal {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Charset a(MediaType mediaType) {
        String str;
        if (mediaType != null) {
            MediaType.Companion companion = MediaType.f22350e;
            String[] strArr = mediaType.f22355d;
            int i7 = 0;
            int l10 = q.l(0, strArr.length - 1, 2);
            Charset charset = null;
            if (l10 >= 0) {
                while (!n.T(strArr[i7], "charset", true)) {
                    if (i7 != l10) {
                        i7 += 2;
                    }
                }
                str = strArr[i7 + 1];
                if (str != null) {
                    try {
                        charset = Charset.forName(str);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                if (charset != null) {
                    return charset;
                }
            }
            str = null;
            if (str != null) {
            }
            if (charset != null) {
            }
        }
        return AbstractC0796a.f12815a;
    }
}
