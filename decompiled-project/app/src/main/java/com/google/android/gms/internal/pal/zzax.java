package com.google.android.gms.internal.pal;

import F5.g;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import r5.C1942a;
import r5.C1943b;

/* loaded from: classes.dex */
public final class zzax extends zzbg {
    private final Context zza;

    public zzax(Handler handler, ExecutorService executorService, Context context) {
        super(handler, executorService, zzagc.zzb(2L));
        this.zza = context;
    }

    private final zzil zzf() {
        if (this.zza.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv")) {
            try {
                ContentResolver contentResolver = this.zza.getContentResolver();
                String string = Settings.Secure.getString(contentResolver, "advertising_id");
                boolean z8 = true;
                if (Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 1) {
                    z8 = false;
                }
                return zzil.zzf(new zzaz(string, "afai", z8));
            } catch (Settings.SettingNotFoundException e2) {
                Log.e("NonceGenerator", "Failed to retrieve advertising info from amazon fire tv.", e2);
            }
        }
        return zzil.zze();
    }

    private final zzil zzg() {
        try {
            C1942a a9 = C1943b.a(this.zza);
            String str = a9.f23785a;
            if (str == null) {
                str = "";
            }
            return zzil.zzf(new zzaz(str, "adid", a9.f23786b));
        } catch (g e2) {
            Log.e("NonceGenerator", "Google Play services is not available entirely.", e2);
            return zzil.zze();
        } catch (IOException e10) {
            Log.e("NonceGenerator", "Unrecoverable error connecting to Google Play services.", e10);
            return zzil.zze();
        } catch (IllegalStateException e11) {
            Log.e("NonceGenerator", "IllegalStateException, can't access android advertising info.", e11);
            return zzil.zze();
        }
    }

    @Override // com.google.android.gms.internal.pal.zzbg
    public final zzil zza() {
        zzil zzf = zzf();
        return !zzf.zzd() ? zzg() : zzf;
    }
}
