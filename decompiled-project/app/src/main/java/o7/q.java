package o7;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzco;
import com.google.android.gms.internal.p002firebaseauthapi.zzcy;
import com.google.android.gms.internal.p002firebaseauthapi.zzmy;
import com.google.android.gms.internal.p002firebaseauthapi.zzp;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static q f22102c;

    /* renamed from: a, reason: collision with root package name */
    public final String f22103a;

    /* renamed from: b, reason: collision with root package name */
    public final zzmy f22104b;

    public q(String str, zzmy zzmyVar) {
        this.f22103a = str;
        this.f22104b = zzmyVar;
    }

    public static q a(Context context, String str) {
        zzmy zzmyVar;
        q qVar = f22102c;
        if (qVar == null || !zzp.zza(qVar.f22103a, str)) {
            try {
                zzco.zza();
                zzmyVar = new zzmy.zza().zza(context, "StorageCryptoKeyset", "com.google.firebase.auth.api.crypto." + str).zza(zzcy.zzb).zza("android-keystore://firebear_main_key_id_for_storage_crypto." + str).zza();
            } catch (IOException | GeneralSecurityException e2) {
                Log.e("FirebearStorageCryptoHelper", "Exception encountered during crypto setup:\n" + e2.getMessage());
                zzmyVar = null;
            }
            f22102c = new q(str, zzmyVar);
        }
        return f22102c;
    }
}
