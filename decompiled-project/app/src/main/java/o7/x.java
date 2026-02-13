package o7;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzbg;
import com.google.android.gms.internal.p002firebaseauthapi.zzbh;
import com.google.android.gms.internal.p002firebaseauthapi.zzbx;
import com.google.android.gms.internal.p002firebaseauthapi.zzks;
import com.google.android.gms.internal.p002firebaseauthapi.zzkv;
import com.google.android.gms.internal.p002firebaseauthapi.zzlg;
import com.google.android.gms.internal.p002firebaseauthapi.zzmy;
import com.google.android.gms.internal.p002firebaseauthapi.zzp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: c, reason: collision with root package name */
    public static x f22113c;

    /* renamed from: a, reason: collision with root package name */
    public final String f22114a;

    /* renamed from: b, reason: collision with root package name */
    public final zzmy f22115b;

    public x(Context context, String str) {
        zzmy zzmyVar;
        this.f22114a = str;
        try {
            zzks.zza();
            zzmy.zza zza = new zzmy.zza().zza(context, "GenericIdpKeyset", "com.google.firebase.auth.api.crypto." + str).zza(zzlg.zza);
            zza.zza("android-keystore://firebear_master_key_id." + str);
            zzmyVar = zza.zza();
        } catch (IOException | GeneralSecurityException e2) {
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n" + e2.getMessage());
            zzmyVar = null;
        }
        this.f22115b = zzmyVar;
    }

    public static x c(Context context, String str) {
        x xVar = f22113c;
        if (xVar == null || !zzp.zza(xVar.f22114a, str)) {
            f22113c = new x(context, str);
        }
        return f22113c;
    }

    public final String a() {
        if (this.f22115b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzbx zza = zzbg.zza(byteArrayOutputStream);
        try {
            synchronized (this.f22115b) {
                this.f22115b.zza().zzb().zza(zza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e2) {
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n" + e2.getMessage());
            return null;
        }
    }

    public final String b(String str) {
        String str2;
        zzmy zzmyVar = this.f22115b;
        if (zzmyVar == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (zzmyVar) {
                str2 = new String(((zzbh) this.f22115b.zza().zza(zzkv.zza(), zzbh.class)).zza(Base64.decode(str, 8), null), "UTF-8");
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e2) {
            Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n" + e2.getMessage());
            return null;
        }
    }
}
