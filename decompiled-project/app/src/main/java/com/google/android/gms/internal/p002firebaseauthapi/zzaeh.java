package com.google.android.gms.internal.p002firebaseauthapi;

import I5.a;
import O5.b;
import X.c;
import Y6.i;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.gms.common.internal.G;
import com.google.firebase.auth.FirebaseAuth;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/* loaded from: classes.dex */
public final class zzaeh extends AsyncTask<Void, Void, zzaek> {
    private static final a zza = new a("FirebaseAuth", "GetAuthDomainTask");
    private final String zzb;
    private final String zzc;
    private final WeakReference<zzaej> zzd;
    private final Uri.Builder zze;
    private final String zzf;
    private final i zzg;

    public zzaeh(String str, String str2, Intent intent, i iVar, zzaej zzaejVar) {
        G.d(str);
        this.zzb = str;
        G.g(iVar);
        this.zzg = iVar;
        G.d(str2);
        G.g(intent);
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        G.d(stringExtra);
        Uri.Builder buildUpon = Uri.parse(zzaejVar.zza(stringExtra)).buildUpon();
        Uri.Builder appendQueryParameter = buildUpon.appendPath("getProjectConfig").appendQueryParameter("key", stringExtra).appendQueryParameter("androidPackageName", str);
        G.g(str2);
        appendQueryParameter.appendQueryParameter("sha1Cert", str2);
        this.zzc = buildUpon.build().toString();
        this.zzd = new WeakReference<>(zzaejVar);
        this.zze = zzaejVar.zza(intent, str, str2);
        this.zzf = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzaek doInBackground(Void... voidArr) {
        try {
            URL url = new URL(this.zzc);
            zzaej zzaejVar = this.zzd.get();
            HttpURLConnection zza2 = zzaejVar.zza(url);
            zza2.addRequestProperty("Content-Type", "application/json; charset=UTF-8");
            zza2.setConnectTimeout(60000);
            new zzaew(zzaejVar.zza(), this.zzg, zzaeu.zza().zzb()).zza(zza2);
            int responseCode = zza2.getResponseCode();
            if (responseCode != 200) {
                String zza3 = zza(zza2);
                zza.c("Error getting project config. Failed with " + zza3 + " " + responseCode, new Object[0]);
                return zzaek.zzb(zza3);
            }
            zzahi zzahiVar = new zzahi();
            zzahiVar.zza(new String(zza(zza2.getInputStream(), 128)));
            if (!TextUtils.isEmpty(this.zzf)) {
                return !zzahiVar.zza().contains(this.zzf) ? zzaek.zzb("UNAUTHORIZED_DOMAIN") : zzaek.zza(this.zzf);
            }
            for (String str : zzahiVar.zza()) {
                if (zza(str)) {
                    return zzaek.zza(str);
                }
            }
            return null;
        } catch (zzaci e2) {
            zza.c(c.t("ConversionException encountered: ", e2.getMessage()), new Object[0]);
            return null;
        } catch (IOException e10) {
            zza.c(c.t("IOException occurred: ", e10.getMessage()), new Object[0]);
            return null;
        } catch (NullPointerException e11) {
            zza.c(c.t("Null pointer encountered: ", e11.getMessage()), new Object[0]);
            return null;
        }
    }

    private static String zza(HttpURLConnection httpURLConnection) {
        try {
            if (httpURLConnection.getResponseCode() < 400) {
                return null;
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            return errorStream == null ? "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again." : (String) zzaep.zza(new String(zza(errorStream, 128)), String.class);
        } catch (IOException e2) {
            zza.f("Error parsing error message from response body in getErrorMessageFromBody. ".concat(String.valueOf(e2)), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final void onPostExecute(zzaek zzaekVar) {
        String str;
        String str2;
        Uri.Builder builder;
        zzaej zzaejVar = this.zzd.get();
        if (zzaekVar != null) {
            str = zzaekVar.zza();
            str2 = zzaekVar.zzb();
        } else {
            str = null;
            str2 = null;
        }
        if (zzaejVar == null) {
            zza.c("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (TextUtils.isEmpty(str) || (builder = this.zze) == null) {
            zzaejVar.zza(this.zzb, b.K(str2));
        } else {
            builder.authority(str);
            zzaejVar.zza(this.zze.build(), this.zzb, FirebaseAuth.getInstance(this.zzg).f15840p);
        }
    }

    private static boolean zza(String str) {
        try {
            String host = new URI("https://" + str).getHost();
            if (host != null) {
                if (host.endsWith("firebaseapp.com")) {
                    return true;
                }
                if (host.endsWith("web.app")) {
                    return true;
                }
            }
        } catch (URISyntaxException e2) {
            zza.c(A3.c.j("Error parsing URL for auth domain check: ", str, ". ", e2.getMessage()), new Object[0]);
        }
        return false;
    }

    private static byte[] zza(InputStream inputStream, int i7) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th) {
            byteArrayOutputStream.close();
            throw th;
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onCancelled(zzaek zzaekVar) {
        onPostExecute((zzaek) null);
    }
}
