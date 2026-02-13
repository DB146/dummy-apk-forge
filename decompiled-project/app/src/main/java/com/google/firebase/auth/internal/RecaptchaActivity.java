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
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zza;
import com.google.android.gms.internal.p002firebaseauthapi.zzaeh;
import com.google.android.gms.internal.p002firebaseauthapi.zzaej;
import com.google.android.gms.internal.p002firebaseauthapi.zzaem;
import com.google.android.gms.internal.p002firebaseauthapi.zzaev;
import com.google.android.gms.internal.p002firebaseauthapi.zzaga;
import com.google.android.gms.internal.p002firebaseauthapi.zzagd;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import ea.C1112g;
import h7.C1259e;
import i1.C1290a;
import j7.InterfaceC1385a;
import j8.InterfaceC1387b;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import o7.n;
import o7.s;
import o7.u;
import o7.w;
import o7.x;
import t2.C2017a;

/* loaded from: classes.dex */
public class RecaptchaActivity extends G implements zzaej {

    /* renamed from: O, reason: collision with root package name */
    public static long f15849O;

    /* renamed from: P, reason: collision with root package name */
    public static final u f15850P = u.f22109b;

    /* renamed from: N, reason: collision with root package name */
    public boolean f15851N = false;

    public final Uri.Builder l(Uri.Builder builder, Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String uuid = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        i f4 = i.f(stringExtra3);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(f4);
        w wVar = w.f22111a;
        Context applicationContext = getApplicationContext();
        synchronized (wVar) {
            com.google.android.gms.common.internal.G.d(str);
            com.google.android.gms.common.internal.G.d(uuid);
            SharedPreferences a9 = w.a(applicationContext, str);
            w.b(a9);
            SharedPreferences.Editor edit = a9.edit();
            edit.putString("com.google.firebase.auth.internal.EVENT_ID." + uuid + ".OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            edit.putString("com.google.firebase.auth.internal.EVENT_ID." + uuid + ".FIREBASE_APP_NAME", stringExtra3);
            edit.apply();
        }
        String a10 = x.c(getApplicationContext(), f4.g()).a();
        String str3 = null;
        if (TextUtils.isEmpty(a10)) {
            Log.e("RecaptchaActivity", "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            m(b.K("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        synchronized (firebaseAuth.g) {
        }
        if (TextUtils.isEmpty(null)) {
            str3 = zzaev.zza();
        }
        builder.appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", str3).appendQueryParameter("eventId", uuid).appendQueryParameter("v", "X" + stringExtra2).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", a10);
        return builder;
    }

    public final void m(Status status) {
        f15849O = 0L;
        this.f15851N = false;
        Intent intent = new Intent();
        HashMap hashMap = s.f22108a;
        Parcel obtain = Parcel.obtain();
        status.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", marshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        C2017a.a(this).b(intent);
        f15850P.f22110a.getClass();
        n.b(getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        finish();
    }

    @Override // W1.G, c.AbstractActivityC0867k, k1.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("RecaptchaActivity", "Could not do operation - unknown action: " + action);
            p();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f15849O < 30000) {
            Log.e("RecaptchaActivity", "Could not start operation - already in progress");
            return;
        }
        f15849O = currentTimeMillis;
        if (bundle != null) {
            this.f15851N = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
        }
    }

    @Override // c.AbstractActivityC0867k, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // W1.G, android.app.Activity
    public final void onResume() {
        String str;
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (this.f15851N) {
                p();
                return;
            }
            Intent intent = getIntent();
            String packageName = getPackageName();
            try {
                String lowerCase = c.b(c.e(this, packageName)).toLowerCase(Locale.US);
                i f4 = i.f(intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(f4);
                if (zzagd.zza(f4)) {
                    f4.b();
                    zza(l(Uri.parse(zzagd.zza(f4.f12043c.f12054a)).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.f15840p);
                } else {
                    new zzaeh(packageName, lowerCase, intent, f4, this).executeOnExecutor(firebaseAuth.f15843s, new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e("RecaptchaActivity", "Could not get package signature: " + packageName + " " + String.valueOf(e2));
                zzaem.zzb(this, packageName);
            }
            this.f15851N = true;
            return;
        }
        Intent intent2 = getIntent();
        if (intent2.hasExtra("firebaseError")) {
            m(s.a(intent2.getStringExtra("firebaseError")));
            return;
        }
        if (!intent2.hasExtra("link") || !intent2.hasExtra("eventId")) {
            p();
            return;
        }
        String stringExtra = intent2.getStringExtra("link");
        w wVar = w.f22111a;
        Context applicationContext = getApplicationContext();
        String packageName2 = getPackageName();
        String stringExtra2 = intent2.getStringExtra("eventId");
        synchronized (wVar) {
            com.google.android.gms.common.internal.G.d(packageName2);
            com.google.android.gms.common.internal.G.d(stringExtra2);
            SharedPreferences a9 = w.a(applicationContext, packageName2);
            String str2 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".OPERATION";
            str = null;
            String string = a9.getString(str2, null);
            String str3 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".FIREBASE_APP_NAME";
            String string2 = a9.getString(str3, null);
            SharedPreferences.Editor edit = a9.edit();
            edit.remove(str2);
            edit.remove(str3);
            edit.apply();
            if (!TextUtils.isEmpty(string)) {
                str = string2;
            }
        }
        if (TextUtils.isEmpty(str)) {
            Log.e("RecaptchaActivity", "Failed to find registration for this event - failing to prevent session injection.");
            m(b.K("Failed to find registration for this reCAPTCHA event"));
        }
        if (intent2.getBooleanExtra("encryptionEnabled", true)) {
            stringExtra = x.c(getApplicationContext(), i.f(str).g()).b(stringExtra);
        }
        String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
        f15849O = 0L;
        this.f15851N = false;
        Intent intent3 = new Intent();
        intent3.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
        intent3.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        intent3.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        C2017a.a(this).b(intent3);
        SharedPreferences.Editor edit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit2.putString("recaptchaToken", queryParameter);
        edit2.putString("operation", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        edit2.putLong("timestamp", System.currentTimeMillis());
        edit2.commit();
        finish();
    }

    @Override // c.AbstractActivityC0867k, k1.h, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.f15851N);
    }

    public final void p() {
        f15849O = 0L;
        this.f15851N = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        C2017a.a(this).b(intent);
        f15850P.f22110a.getClass();
        n.b(getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
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
        Log.e("RecaptchaActivity", "Found hermetic configuration for identityToolkit URL: " + zza);
        return zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final HttpURLConnection zza(URL url) {
        try {
            return (HttpURLConnection) zza.zza().zza(url, "client-firebase-auth-api");
        } catch (IOException unused) {
            zzaej.zza.c("Error generating connection", new Object[0]);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(Uri uri, String str, InterfaceC1387b interfaceC1387b) {
        Task forResult;
        InterfaceC1385a interfaceC1385a = (InterfaceC1385a) interfaceC1387b.get();
        if (interfaceC1385a != null) {
            Task b2 = ((C1259e) interfaceC1385a).b(false);
            C1290a c1290a = new C1290a(13);
            c1290a.f18187b = uri;
            forResult = b2.continueWith(c1290a);
        } else {
            forResult = Tasks.forResult(uri);
        }
        C1112g c1112g = new C1112g(8);
        c1112g.f16840b = this;
        c1112g.f16841c = str;
        forResult.addOnCompleteListener(c1112g);
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
