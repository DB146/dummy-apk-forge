package G7;

import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f4355c;

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f4356d;

    /* renamed from: a, reason: collision with root package name */
    public final int f4357a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4358b;

    static {
        HashMap hashMap = new HashMap();
        f4355c = hashMap;
        hashMap.put(-1, "The transaction needs to be run again with current data");
        hashMap.put(-2, "The server indicated that this operation failed");
        hashMap.put(-3, "This client does not have permission to perform this operation");
        hashMap.put(-4, "The operation had to be aborted due to a network disconnect");
        hashMap.put(-6, "The supplied auth token has expired");
        hashMap.put(-7, "The supplied auth token was invalid");
        hashMap.put(-8, "The transaction had too many retries");
        hashMap.put(-9, "The transaction was overridden by a subsequent set");
        hashMap.put(-10, "The service is unavailable");
        hashMap.put(-11, "User code called from the Firebase Database runloop threw an exception:\n");
        hashMap.put(-24, "The operation could not be performed due to a network error");
        hashMap.put(-25, "The write was canceled by the user.");
        hashMap.put(-999, "An unknown error occurred");
        HashMap hashMap2 = new HashMap();
        f4356d = hashMap2;
        hashMap2.put("datastale", -1);
        hashMap2.put("failure", -2);
        hashMap2.put("permission_denied", -3);
        hashMap2.put("disconnected", -4);
        hashMap2.put("expired_token", -6);
        hashMap2.put("invalid_token", -7);
        hashMap2.put("maxretries", -8);
        hashMap2.put("overriddenbyset", -9);
        hashMap2.put("unavailable", -10);
        hashMap2.put("network_error", -24);
        hashMap2.put("write_canceled", -25);
    }

    public b(int i7, String str) {
        this.f4357a = i7;
        this.f4358b = str;
    }

    public static b a(String str, String str2) {
        Integer num = (Integer) f4356d.get(str.toLowerCase(Locale.US));
        if (num == null) {
            num = -999;
        }
        if (str2 == null) {
            str2 = (String) f4355c.get(num);
        }
        return new b(num.intValue(), str2);
    }

    public final String toString() {
        return "DatabaseError: " + this.f4358b;
    }
}
