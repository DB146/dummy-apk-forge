package W4;

import N6.t0;
import android.net.Uri;
import java.util.Arrays;
import m4.C1586o0;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final long f10630a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10631b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f10632c;

    public C(int i7, long j, Uri uri) {
        this.f10630a = j;
        this.f10631b = i7;
        this.f10632c = uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a A[Catch: Exception -> 0x0058, TRY_LEAVE, TryCatch #0 {Exception -> 0x0058, blocks: (B:7:0x002f, B:20:0x0077, B:25:0x007f, B:26:0x0084, B:29:0x0085, B:30:0x008a, B:31:0x004e, B:34:0x005a, B:37:0x0064), top: B:6:0x002f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static t0 a(Uri uri, String str) {
        char c10;
        char c11 = 1;
        N6.r.e(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i7 = n5.D.f21141a;
        int i10 = -1;
        String[] split = str.split(",", -1);
        int length = split.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            String str2 = split[i12];
            String[] split2 = str2.split(";", i10);
            int length2 = split2.length;
            int i14 = i10;
            int i15 = i11;
            Uri uri2 = null;
            long j = -9223372036854775807L;
            while (i15 < length2) {
                String str3 = split2[i15];
                try {
                    String[] split3 = str3.split("=", 2);
                    String str4 = split3[i11];
                    String str5 = split3[c11];
                    int hashCode = str4.hashCode();
                    if (hashCode == 113759) {
                        if (str4.equals("seq")) {
                            c10 = 1;
                            if (c10 != 0) {
                            }
                            i15++;
                            c11 = 1;
                            i11 = 0;
                        }
                        c10 = 65535;
                        if (c10 != 0) {
                        }
                        i15++;
                        c11 = 1;
                        i11 = 0;
                    } else if (hashCode != 116079) {
                        if (hashCode == 1524180539 && str4.equals("rtptime")) {
                            c10 = 2;
                            if (c10 != 0) {
                                uri2 = b(uri, str5);
                            } else if (c10 == 1) {
                                i14 = Integer.parseInt(str5);
                            } else {
                                if (c10 != 2) {
                                    throw C1586o0.b(str4, null);
                                }
                                j = Long.parseLong(str5);
                            }
                            i15++;
                            c11 = 1;
                            i11 = 0;
                        }
                        c10 = 65535;
                        if (c10 != 0) {
                        }
                        i15++;
                        c11 = 1;
                        i11 = 0;
                    } else {
                        if (str4.equals("url")) {
                            c10 = 0;
                            if (c10 != 0) {
                            }
                            i15++;
                            c11 = 1;
                            i11 = 0;
                        }
                        c10 = 65535;
                        if (c10 != 0) {
                        }
                        i15++;
                        c11 = 1;
                        i11 = 0;
                    }
                } catch (Exception e2) {
                    throw C1586o0.b(str3, e2);
                }
                throw C1586o0.b(str3, e2);
            }
            if (uri2 != null && uri2.getScheme() != null) {
                i10 = -1;
                long j10 = j;
                if (i14 != -1 || j10 != -9223372036854775807L) {
                    C c12 = new C(i14, j10, uri2);
                    int i16 = i13 + 1;
                    if (objArr.length < i16) {
                        objArr = Arrays.copyOf(objArr, N6.B.f(objArr.length, i16));
                    }
                    objArr[i13] = c12;
                    i12++;
                    i13 = i16;
                    c11 = 1;
                    i11 = 0;
                }
            }
            throw C1586o0.b(str2, null);
        }
        return N6.H.D(i13, objArr);
    }

    public static Uri b(Uri uri, String str) {
        String scheme = uri.getScheme();
        scheme.getClass();
        AbstractC1705a.h(scheme.equals("rtsp"));
        Uri parse = Uri.parse(str);
        if (parse.isAbsolute()) {
            return parse;
        }
        Uri parse2 = Uri.parse("rtsp://" + str);
        String uri2 = uri.toString();
        String host = parse2.getHost();
        host.getClass();
        return host.equals(uri.getHost()) ? parse2 : uri2.endsWith("/") ? AbstractC1705a.O(uri2, str) : AbstractC1705a.O(uri2.concat("/"), str);
    }
}
