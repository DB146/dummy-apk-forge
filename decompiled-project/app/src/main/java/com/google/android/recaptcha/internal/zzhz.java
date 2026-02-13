package com.google.android.recaptcha.internal;

import Eb.o;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzhz implements zzhx {
    private final zzhy zza;

    public zzhz(zzhy zzhyVar, zzhw zzhwVar) {
        this.zza = zzhyVar;
    }

    private final zztz zzb(String str, List list) {
        zzhu zzhuVar;
        if (str.length() == 0) {
            throw new zzce(3, 17, null);
        }
        try {
            long zza = this.zza.zza(o.t0(list));
            zzhuVar = zzhv.zza;
            zzhv zzhvVar = new zzhv(zza, 255L, zzhuVar);
            StringBuilder sb2 = new StringBuilder(str.length());
            for (int i7 = 0; i7 < str.length(); i7++) {
                sb2.append((char) (str.charAt(i7) ^ ((int) zzhvVar.zza())));
            }
            return zztz.zzg(zzkh.zzh().zzj(sb2.toString()));
        } catch (Exception e2) {
            throw new zzce(3, 18, e2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzhx
    public final zztz zza(zzub zzubVar) {
        zzjh zzb = zzjh.zzb();
        zztz zzb2 = zzb(zzubVar.zzj(), zzubVar.zzk());
        zzb.zzf();
        long zza = zzb.zza(TimeUnit.MICROSECONDS);
        int i7 = zzbk.zza;
        zzbk.zza(zzbl.zzh.zza(), zza);
        return zzb2;
    }
}
