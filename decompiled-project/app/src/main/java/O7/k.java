package O7;

import L7.C0385e;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f7501a = "0123456789abcdef".toCharArray();

    public static String a(double d10) {
        StringBuilder sb2 = new StringBuilder(16);
        long doubleToLongBits = Double.doubleToLongBits(d10);
        for (int i7 = 7; i7 >= 0; i7--) {
            int i10 = (int) ((doubleToLongBits >>> (i7 * 8)) & 255);
            char[] cArr = f7501a;
            sb2.append(cArr[(i10 >> 4) & 15]);
            sb2.append(cArr[i10 & 15]);
        }
        return sb2.toString();
    }

    public static void b(String str, boolean z8) {
        if (z8) {
            return;
        }
        Log.w("FirebaseDatabase", "Assertion failed: " + str);
    }

    public static void c(boolean z8) {
        b("", z8);
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [O7.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, L7.k] */
    public static h d(String str) {
        String str2;
        try {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            if (scheme == null) {
                throw new IllegalArgumentException("Database URL does not specify a URL scheme");
            }
            String host = parse.getHost();
            if (host == null) {
                throw new IllegalArgumentException("Database URL does not specify a valid host");
            }
            String queryParameter = parse.getQueryParameter("ns");
            if (queryParameter == null) {
                queryParameter = host.split("\\.", -1)[0].toLowerCase(Locale.US);
            }
            ?? obj = new Object();
            obj.f6365a = host.toLowerCase(Locale.US);
            int port = parse.getPort();
            if (port != -1) {
                obj.f6366b = scheme.equals("https") || scheme.equals("wss");
                obj.f6365a += ":" + port;
            } else {
                obj.f6366b = true;
            }
            obj.f6367c = queryParameter;
            int indexOf = str.indexOf("//");
            if (indexOf == -1) {
                throw new RuntimeException("Firebase Database URL is missing URL scheme");
            }
            String substring = str.substring(indexOf + 2);
            int indexOf2 = substring.indexOf("/");
            if (indexOf2 != -1) {
                int indexOf3 = substring.indexOf("?");
                str2 = indexOf3 != -1 ? substring.substring(indexOf2 + 1, indexOf3) : substring.substring(indexOf2 + 1);
            } else {
                str2 = "";
            }
            String replace = str2.replace("+", " ");
            l.b(replace);
            ?? obj2 = new Object();
            obj2.f7498b = new C0385e(replace);
            obj2.f7497a = obj;
            return obj2;
        } catch (Exception e2) {
            throw new RuntimeException(X.c.t("Invalid Firebase Database url specified: ", str), e2);
        }
    }

    public static String e(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes("UTF-8"));
            return Base64.encodeToString(messageDigest.digest(), 2);
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 encoding is required for Firebase Database to run!");
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException("Missing SHA-1 MessageDigest provider.", e2);
        }
    }

    public static String f(String str) {
        String replace = str.indexOf(92) != -1 ? str.replace("\\", "\\\\") : str;
        if (str.indexOf(34) != -1) {
            replace = replace.replace("\"", "\\\"");
        }
        return "\"" + replace + '\"';
    }

    public static Integer g(String str) {
        boolean z8;
        if (str.length() > 11 || str.length() == 0) {
            return null;
        }
        int i7 = 0;
        if (str.charAt(0) == '-') {
            z8 = true;
            if (str.length() == 1) {
                return null;
            }
            i7 = 1;
        } else {
            z8 = false;
        }
        long j = 0;
        while (i7 < str.length()) {
            char charAt = str.charAt(i7);
            if (charAt < '0' || charAt > '9') {
                return null;
            }
            j = (j * 10) + (charAt - '0');
            i7++;
        }
        if (!z8) {
            if (j > 2147483647L) {
                return null;
            }
            return Integer.valueOf((int) j);
        }
        long j10 = -j;
        if (j10 < -2147483648L) {
            return null;
        }
        return Integer.valueOf((int) j10);
    }
}
