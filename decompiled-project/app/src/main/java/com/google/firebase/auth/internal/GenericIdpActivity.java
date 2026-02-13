package com.google.firebase.auth.internal;

import M5.c;
import O5.b;
import W1.G;
import Y6.i;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zza;
import com.google.android.gms.internal.p002firebaseauthapi.zzaeh;
import com.google.android.gms.internal.p002firebaseauthapi.zzaej;
import com.google.android.gms.internal.p002firebaseauthapi.zzaem;
import com.google.android.gms.internal.p002firebaseauthapi.zzaga;
import com.google.android.gms.internal.p002firebaseauthapi.zzagd;
import com.google.android.gms.internal.p002firebaseauthapi.zzait;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import ea.C1111f;
import h7.C1259e;
import j7.InterfaceC1385a;
import j8.InterfaceC1387b;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import o7.n;
import o7.s;
import o7.u;
import o7.w;
import o7.x;
import o7.y;
import org.json.JSONException;
import org.json.JSONObject;
import t2.C2017a;

@KeepName
/* loaded from: classes.dex */
public class GenericIdpActivity extends G implements zzaej {

    /* renamed from: O, reason: collision with root package name */
    public static long f15846O;

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ int f15847P = 0;

    /* renamed from: N, reason: collision with root package name */
    public boolean f15848N = false;

    static {
        u uVar = u.f22109b;
    }

    public final Uri.Builder l(Uri.Builder builder, Intent intent, String str, String str2) {
        String jSONObject;
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        String join = (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) ? null : TextUtils.join(",", stringArrayListExtra);
        Bundle bundleExtra = intent.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS");
        if (bundleExtra == null) {
            jSONObject = null;
        } else {
            JSONObject jSONObject2 = new JSONObject();
            try {
                for (String str3 : bundleExtra.keySet()) {
                    String string = bundleExtra.getString(str3);
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject2.put(str3, string);
                    }
                }
            } catch (JSONException unused) {
                Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
            }
            jSONObject = jSONObject2.toString();
        }
        String uuid = UUID.randomUUID().toString();
        String zza = zzaem.zza(this, UUID.randomUUID().toString());
        String action = intent.getAction();
        String stringExtra5 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        w wVar = w.f22111a;
        Context applicationContext = getApplicationContext();
        String str4 = jSONObject;
        String str5 = join;
        synchronized (wVar) {
            com.google.android.gms.common.internal.G.d(str);
            com.google.android.gms.common.internal.G.d(uuid);
            com.google.android.gms.common.internal.G.d(zza);
            com.google.android.gms.common.internal.G.d(stringExtra4);
            SharedPreferences a9 = w.a(applicationContext, str);
            w.b(a9);
            SharedPreferences.Editor edit = a9.edit();
            edit.putString("com.google.firebase.auth.internal.EVENT_ID." + uuid + ".SESSION_ID", zza);
            edit.putString("com.google.firebase.auth.internal.EVENT_ID." + uuid + ".OPERATION", action);
            edit.putString("com.google.firebase.auth.internal.EVENT_ID." + uuid + ".PROVIDER_ID", stringExtra2);
            edit.putString("com.google.firebase.auth.internal.EVENT_ID." + uuid + ".FIREBASE_APP_NAME", stringExtra4);
            edit.putString("com.google.firebase.auth.api.gms.config.tenant.id", stringExtra3);
            edit.apply();
        }
        String a10 = x.c(getApplicationContext(), i.f(stringExtra4).g()).a();
        if (TextUtils.isEmpty(a10)) {
            Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
            m(b.K("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        }
        if (zza == null) {
            return null;
        }
        builder.appendQueryParameter("eid", "p").appendQueryParameter("v", "X" + stringExtra5).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", zza).appendQueryParameter("eventId", uuid).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", a10);
        if (!TextUtils.isEmpty(str5)) {
            builder.appendQueryParameter("scopes", str5);
        }
        if (!TextUtils.isEmpty(str4)) {
            builder.appendQueryParameter("customParameters", str4);
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            builder.appendQueryParameter("tid", stringExtra3);
        }
        return builder;
    }

    public final void m(Status status) {
        f15846O = 0L;
        this.f15848N = false;
        Intent intent = new Intent();
        HashMap hashMap = s.f22108a;
        Parcel obtain = Parcel.obtain();
        status.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", marshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        C2017a.a(this).b(intent);
        n.a(getApplicationContext(), status);
        finish();
    }

    @Override // W1.G, c.AbstractActivityC0867k, k1.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("GenericIdpActivity", "Could not do operation - unknown action: " + action);
            p();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f15846O < 30000) {
            Log.e("GenericIdpActivity", "Could not start operation - already in progress");
            return;
        }
        f15846O = currentTimeMillis;
        if (bundle != null) {
            this.f15848N = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
        }
    }

    @Override // c.AbstractActivityC0867k, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // W1.G, android.app.Activity
    public final void onResume() {
        y yVar;
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (this.f15848N) {
                p();
                return;
            }
            String packageName = getPackageName();
            try {
                String lowerCase = c.b(c.e(this, packageName)).toLowerCase(Locale.US);
                i f4 = i.f(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(f4);
                if (zzagd.zza(f4)) {
                    f4.b();
                    zza(l(Uri.parse(zzagd.zza(f4.f12043c.f12054a)).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.f15840p);
                } else {
                    new zzaeh(packageName, lowerCase, getIntent(), f4, this).executeOnExecutor(firebaseAuth.f15843s, new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e("GenericIdpActivity", "Could not get package signature: " + packageName + " " + String.valueOf(e2));
                zzaem.zzb(this, packageName);
            }
            this.f15848N = true;
            return;
        }
        Intent intent = getIntent();
        if (intent.hasExtra("firebaseError")) {
            m(s.a(intent.getStringExtra("firebaseError")));
            return;
        }
        if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
            p();
            return;
        }
        String stringExtra = intent.getStringExtra("link");
        String stringExtra2 = intent.getStringExtra("eventId");
        String packageName2 = getPackageName();
        boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
        synchronized (w.f22111a) {
            com.google.android.gms.common.internal.G.d(packageName2);
            com.google.android.gms.common.internal.G.d(stringExtra2);
            SharedPreferences a9 = w.a(this, packageName2);
            String str = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".SESSION_ID";
            String str2 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".OPERATION";
            String str3 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".PROVIDER_ID";
            String str4 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".FIREBASE_APP_NAME";
            String string = a9.getString(str, null);
            String string2 = a9.getString(str2, null);
            String string3 = a9.getString(str3, null);
            String string4 = a9.getString("com.google.firebase.auth.api.gms.config.tenant.id", null);
            String string5 = a9.getString(str4, null);
            SharedPreferences.Editor edit = a9.edit();
            edit.remove(str);
            edit.remove(str2);
            edit.remove(str3);
            edit.remove(str4);
            edit.apply();
            yVar = (string == null || string2 == null || string3 == null) ? null : new y(string, string2, string3, string4, string5);
        }
        if (yVar == null) {
            p();
        }
        if (booleanExtra) {
            stringExtra = x.c(getApplicationContext(), i.f(yVar.f22120e).g()).b(stringExtra);
        }
        zzait zzaitVar = new zzait(yVar, stringExtra);
        String str5 = yVar.f22119d;
        String str6 = yVar.f22117b;
        zzaitVar.zzb(str5);
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(str6) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(str6) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(str6)) {
            Log.e("GenericIdpActivity", "unsupported operation: ".concat(str6));
            p();
            return;
        }
        f15846O = 0L;
        this.f15848N = false;
        Intent intent2 = new Intent();
        Parcel obtain = Parcel.obtain();
        zzaitVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent2.putExtra("com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", marshall);
        intent2.putExtra("com.google.firebase.auth.internal.OPERATION", str6);
        intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        C2017a.a(this).b(intent2);
        SharedPreferences.Editor edit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        Parcel obtain2 = Parcel.obtain();
        zzaitVar.writeToParcel(obtain2, 0);
        byte[] marshall2 = obtain2.marshall();
        obtain2.recycle();
        edit2.putString("verifyAssertionRequest", marshall2 != null ? Base64.encodeToString(marshall2, 10) : null);
        edit2.putString("operation", str6);
        edit2.putString("tenantId", str5);
        edit2.putLong("timestamp", System.currentTimeMillis());
        edit2.commit();
        finish();
    }

    @Override // c.AbstractActivityC0867k, k1.h, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.f15848N);
    }

    public final void p() {
        f15846O = 0L;
        this.f15848N = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        C2017a.a(this).b(intent);
        n.a(this, b.K("WEB_CONTEXT_CANCELED"));
        finish();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final Uri.Builder zza(Intent intent, String str, String str2) {
        return l(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final String zza(String str) {
        String zza = zzaga.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(zza)) {
            return zzagd.zzb(str);
        }
        Log.e("GenericIdpActivity", "Found hermetic configuration for identityToolkit URL: " + zza);
        return zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final HttpURLConnection zza(URL url) {
        try {
            return (HttpURLConnection) zza.zza().zza(url, "client-firebase-auth-api");
        } catch (IOException unused) {
            Log.e("GenericIdpActivity", "Error generating URL connection");
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [m4.N, com.google.android.gms.tasks.Continuation, java.lang.Object] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(Uri uri, String str, InterfaceC1387b interfaceC1387b) {
        Task forResult;
        InterfaceC1385a interfaceC1385a = (InterfaceC1385a) interfaceC1387b.get();
        if (interfaceC1385a != null) {
            Task b2 = ((C1259e) interfaceC1385a).b(false);
            ?? obj = new Object();
            obj.f20112a = uri;
            forResult = b2.continueWith(obj);
        } else {
            forResult = Tasks.forResult(uri);
        }
        C1111f c1111f = new C1111f(8);
        c1111f.f16837b = this;
        c1111f.f16838c = str;
        forResult.addOnCompleteListener(c1111f);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(String str, Status status) {
        if (status == null) {
            p();
        } else {
            m(status);
        }
    }
}
