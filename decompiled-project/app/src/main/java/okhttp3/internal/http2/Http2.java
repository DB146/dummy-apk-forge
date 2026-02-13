package okhttp3.internal.http2;

import Y5.C0658x;
import ac.n;
import h3.o;
import kotlin.jvm.internal.l;
import okhttp3.internal._UtilJvmKt;
import rc.C1967k;

/* loaded from: classes2.dex */
public final class Http2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Http2 f22755a = new Http2();

    /* renamed from: b, reason: collision with root package name */
    public static final C1967k f22756b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f22757c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f22758d;

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f22759e;

    static {
        C1967k c1967k = C1967k.f23967d;
        f22756b = C0658x.c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f22757c = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f22758d = new String[64];
        String[] strArr = new String[256];
        for (int i7 = 0; i7 < 256; i7++) {
            String binaryString = Integer.toBinaryString(i7);
            l.d(binaryString, "toBinaryString(...)");
            String replace = _UtilJvmKt.e("%8s", binaryString).replace(' ', '0');
            l.d(replace, "replace(...)");
            strArr[i7] = replace;
        }
        f22759e = strArr;
        String[] strArr2 = f22758d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i10 = iArr[0];
        strArr2[i10 | 8] = o.p(new StringBuilder(), strArr2[i10], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = iArr2[i11];
            int i13 = iArr[0];
            String[] strArr3 = f22758d;
            int i14 = i13 | i12;
            strArr3[i14] = strArr3[i13] + '|' + strArr3[i12];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArr3[i13]);
            sb2.append('|');
            strArr3[i14 | 8] = o.p(sb2, strArr3[i12], "|PADDED");
        }
        int length = f22758d.length;
        for (int i15 = 0; i15 < length; i15++) {
            String[] strArr4 = f22758d;
            if (strArr4[i15] == null) {
                strArr4[i15] = f22759e[i15];
            }
        }
    }

    private Http2() {
    }

    public static String a(int i7) {
        String[] strArr = f22757c;
        return i7 < strArr.length ? strArr[i7] : _UtilJvmKt.e("0x%02x", Integer.valueOf(i7));
    }

    public static String b(boolean z8, int i7, int i10, int i11, int i12) {
        String str;
        String str2;
        String a9 = a(i11);
        if (i12 == 0) {
            str = "";
        } else {
            String[] strArr = f22759e;
            if (i11 != 2 && i11 != 3) {
                if (i11 == 4 || i11 == 6) {
                    str = i12 == 1 ? "ACK" : strArr[i12];
                } else if (i11 != 7 && i11 != 8) {
                    String[] strArr2 = f22758d;
                    if (i12 < strArr2.length) {
                        str2 = strArr2[i12];
                        l.b(str2);
                    } else {
                        str2 = strArr[i12];
                    }
                    str = (i11 != 5 || (i12 & 4) == 0) ? (i11 != 0 || (i12 & 32) == 0) ? str2 : n.W(str2, "PRIORITY", "COMPRESSED") : n.W(str2, "HEADERS", "PUSH_PROMISE");
                }
            }
            str = strArr[i12];
        }
        return _UtilJvmKt.e("%s 0x%08x %5d %-13s %s", z8 ? "<<" : ">>", Integer.valueOf(i7), Integer.valueOf(i10), a9, str);
    }

    public static String c(int i7, int i10, long j, boolean z8) {
        return _UtilJvmKt.e("%s 0x%08x %5d %-13s %d", z8 ? "<<" : ">>", Integer.valueOf(i7), Integer.valueOf(i10), a(8), Long.valueOf(j));
    }
}
