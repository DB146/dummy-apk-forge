package n7;

import android.net.Uri;
import com.google.android.gms.internal.p002firebaseauthapi.zzan;
import java.util.HashMap;
import java.util.Set;
import y.S;

/* renamed from: n7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1711b {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f21278c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f21279a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21280b;

    static {
        HashMap hashMap = new HashMap();
        S.c(2, hashMap, "recoverEmail", 0, "resetPassword");
        S.c(4, hashMap, "signIn", 1, "verifyEmail");
        S.c(5, hashMap, "verifyBeforeChangeEmail", 6, "revertSecondFactorAddition");
        zzan.zza(hashMap);
    }

    public C1711b(String str) {
        String a9 = a(str, "apiKey");
        String a10 = a(str, "oobCode");
        String a11 = a(str, "mode");
        if (a9 == null || a10 == null || a11 == null) {
            throw new IllegalArgumentException("apiKey, oobCode and mode are required in a valid action code URL");
        }
        com.google.android.gms.common.internal.G.d(a9);
        com.google.android.gms.common.internal.G.d(a10);
        this.f21279a = a10;
        com.google.android.gms.common.internal.G.d(a11);
        a(str, "continueUrl");
        a(str, "lang");
        this.f21280b = a(str, "tenantId");
    }

    public static String a(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (!queryParameterNames.contains("link")) {
                return null;
            }
            String queryParameter = parse.getQueryParameter("link");
            com.google.android.gms.common.internal.G.d(queryParameter);
            return Uri.parse(queryParameter).getQueryParameter(str2);
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }
}
