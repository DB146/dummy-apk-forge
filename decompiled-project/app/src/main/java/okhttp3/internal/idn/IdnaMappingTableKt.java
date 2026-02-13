package okhttp3.internal.idn;

import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class IdnaMappingTableKt {
    public static final int a(int i7, String str) {
        l.e(str, "<this>");
        char charAt = str.charAt(i7);
        return (charAt << 7) + str.charAt(i7 + 1);
    }
}
