package com.google.ads.interactivemedia.v3.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.ads.interactivemedia.v3.api.BaseRequest;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import r5.C1942a;
import r5.C1943b;
import u5.C2110b;

/* loaded from: classes.dex */
public final class zzgx {
    private final Context zza;
    private final boolean zzb;
    private final long zzc;
    private final zzgu zzd;
    private final zzgp zze;

    public zzgx(Context context, zzgu zzguVar, zzhc zzhcVar) {
        this.zza = context;
        this.zzb = !zzguVar.zza;
        long j = zzguVar.zzb;
        this.zzc = j <= 0 ? 150L : j;
        this.zzd = zzguVar;
        this.zze = new zzgp(context, zzguVar.zzf, zzhcVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.ads.interactivemedia.v3.impl.data.zzbc zza(BaseRequest baseRequest) {
        String str;
        boolean z8;
        String str2;
        String str3;
        String str4;
        int i7;
        String str5;
        int i10 = 0;
        try {
            C1942a a9 = C1943b.a(this.zza);
            String str6 = a9.f23785a;
            str3 = "adid";
            z8 = a9.f23786b;
            str2 = str6;
        } catch (Exception | NoClassDefFoundError unused) {
            try {
                ContentResolver contentResolver = this.zza.getContentResolver();
                str2 = Settings.Secure.getString(contentResolver, "advertising_id");
                boolean z10 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") == 1;
                str3 = "afai";
                z8 = z10;
            } catch (Settings.SettingNotFoundException unused2) {
                zzhd.zzd("Failed to get advertising ID.");
                str = "";
                z8 = false;
                str2 = "";
            }
        }
        str = str3;
        if (this.zzb) {
            try {
                C2110b c2110b = (C2110b) Tasks.await(new com.google.android.gms.internal.appset.zzr(this.zza).getAppSetIdInfo(), this.zzc, TimeUnit.MILLISECONDS);
                str4 = c2110b.f24869a;
                try {
                    i10 = c2110b.f24870b;
                } catch (InterruptedException | ExecutionException | TimeoutException unused3) {
                    zzhd.zzd("Timeout getting AppSet ID.");
                    i7 = i10;
                    str5 = str4;
                    return com.google.ads.interactivemedia.v3.impl.data.zzbc.create(str2, str, z8, str5, i7, baseRequest.zza().zza(this.zzd, z8) ? this.zze.zza() : "");
                } catch (Exception | NoClassDefFoundError | NoSuchMethodError unused4) {
                    zzhd.zzd("Unable to contact the App Set SDK.");
                    i7 = i10;
                    str5 = str4;
                    return com.google.ads.interactivemedia.v3.impl.data.zzbc.create(str2, str, z8, str5, i7, baseRequest.zza().zza(this.zzd, z8) ? this.zze.zza() : "");
                }
            } catch (InterruptedException | ExecutionException | TimeoutException unused5) {
                str4 = "";
            } catch (Exception | NoClassDefFoundError | NoSuchMethodError unused6) {
                str4 = "";
            }
            i7 = i10;
            str5 = str4;
        } else {
            str5 = "";
            i7 = 0;
        }
        return com.google.ads.interactivemedia.v3.impl.data.zzbc.create(str2, str, z8, str5, i7, baseRequest.zza().zza(this.zzd, z8) ? this.zze.zza() : "");
    }
}
