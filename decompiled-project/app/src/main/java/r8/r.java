package r8;

import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;
import y.S;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f23869d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    public final String f23870a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23871b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23872c;

    public r(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            str3 = str2.substring(8);
        }
        if (str3 == null || !f23869d.matcher(str3).matches()) {
            throw new IllegalArgumentException(S.b("Invalid topic name: ", str3, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f23870a = str3;
        this.f23871b = str;
        this.f23872c = X.c.i(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f23870a.equals(rVar.f23870a) && this.f23871b.equals(rVar.f23871b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23871b, this.f23870a});
    }
}
