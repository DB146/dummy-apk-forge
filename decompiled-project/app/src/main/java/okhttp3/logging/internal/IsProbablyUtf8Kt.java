package okhttp3.logging.internal;

import h3.H;
import java.io.EOFException;
import kotlin.jvm.internal.l;
import rc.C1964h;

/* loaded from: classes2.dex */
public final class IsProbablyUtf8Kt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, rc.h] */
    public static final boolean a(C1964h c1964h) {
        l.e(c1964h, "<this>");
        try {
            ?? obj = new Object();
            c1964h.F(obj, 0L, H.h(c1964h.f23966b, 64L));
            for (int i7 = 0; i7 < 16; i7++) {
                if (obj.K()) {
                    return true;
                }
                int e02 = obj.e0();
                if (Character.isISOControl(e02) && !Character.isWhitespace(e02)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
