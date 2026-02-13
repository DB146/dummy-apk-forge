package D5;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.G;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f3234c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public static b f3235d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f3236a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f3237b;

    public b(Context context) {
        this.f3237b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static b a(Context context) {
        G.g(context);
        ReentrantLock reentrantLock = f3234c;
        reentrantLock.lock();
        try {
            if (f3235d == null) {
                f3235d = new b(context.getApplicationContext());
            }
            b bVar = f3235d;
            reentrantLock.unlock();
            return bVar;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String g(String str, String str2) {
        return X.c.i(str, ":", str2);
    }

    public final GoogleSignInAccount b() {
        String e2;
        String e10 = e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e10) || (e2 = e(g("googleSignInAccount", e10))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.t(e2);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final GoogleSignInOptions c() {
        String e2;
        String e10 = e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e10) || (e2 = e(g("googleSignInOptions", e10))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.t(e2);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void d(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        G.g(googleSignInAccount);
        G.g(googleSignInOptions);
        String str = googleSignInAccount.f14858w;
        f("defaultGoogleSignInAccount", str);
        String g = g("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f14851b;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.f14852c;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.f14853d;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.f14854e;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.f14860y;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.f14861z;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f14855f;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.f14856u;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.f14857v);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = googleSignInAccount.f14859x;
            Scope[] scopeArr = (Scope[]) arrayList.toArray(new Scope[arrayList.size()]);
            Arrays.sort(scopeArr, C5.c.f2915b);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f14891b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            f(g, jSONObject.toString());
            String g2 = g("googleSignInOptions", str);
            String str9 = googleSignInOptions.f14874v;
            String str10 = googleSignInOptions.f14873u;
            ArrayList arrayList2 = googleSignInOptions.f14868b;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(arrayList2, GoogleSignInOptions.f14864C);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((Scope) it.next()).f14891b);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.f14869c;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.f14870d);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f14872f);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f14871e);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                f(g2, jSONObject2.toString());
            } catch (JSONException e2) {
                throw new RuntimeException(e2);
            }
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final String e(String str) {
        ReentrantLock reentrantLock = this.f3236a;
        reentrantLock.lock();
        try {
            return this.f3237b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void f(String str, String str2) {
        ReentrantLock reentrantLock = this.f3236a;
        reentrantLock.lock();
        try {
            this.f3237b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }
}
