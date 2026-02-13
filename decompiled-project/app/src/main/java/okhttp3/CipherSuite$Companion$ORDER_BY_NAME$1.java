package okhttp3;

import java.util.Comparator;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class CipherSuite$Companion$ORDER_BY_NAME$1 implements Comparator<String> {
    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return -1;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(String str, String str2) {
        String a9 = str;
        String b2 = str2;
        l.e(a9, "a");
        l.e(b2, "b");
        int min = Math.min(a9.length(), b2.length());
        int i7 = 4;
        while (true) {
            if (i7 < min) {
                char charAt = a9.charAt(i7);
                char charAt2 = b2.charAt(i7);
                if (charAt == charAt2) {
                    i7++;
                } else if (l.f(charAt, charAt2) >= 0) {
                    return 1;
                }
            } else {
                int length = a9.length();
                int length2 = b2.length();
                if (length == length2) {
                    return 0;
                }
                if (length >= length2) {
                    return 1;
                }
            }
        }
    }
}
