package com.google.android.gms.internal.p002firebaseauthapi;

import A3.c;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzqy implements zzqc<zzqz, zzqz> {
    private static final zzqy zza = new zzqy();

    private zzqy() {
    }

    public static void zzc() {
        zzoz.zza().zza(zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqc
    public final Class<zzqz> zza() {
        return zzqz.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqc
    public final /* synthetic */ zzqz zza(zzoa zzoaVar, zzoj zzojVar, zzqb<zzqz> zzqbVar) {
        zzaae zzc;
        zzod zzc2 = zzoaVar.zzc();
        if (zzc2 == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        zzpq zzpqVar = new zzpq();
        for (int i7 = 0; i7 < zzoaVar.zza(); i7++) {
            zzod zza2 = zzoaVar.zza(i7);
            if (zza2.zzc().equals(zzbo.zza)) {
                zzqz zza3 = zzqbVar.zza(zza2);
                zzbm zzb = zza2.zzb();
                if (zzb instanceof zzrn) {
                    zzc = ((zzrn) zzb).zze();
                } else {
                    if (!(zzb instanceof zzoe)) {
                        throw new GeneralSecurityException(c.j("Cannot get output prefix for key of class ", zzb.getClass().getName(), " with parameters ", String.valueOf(zzb.zza())));
                    }
                    zzc = ((zzoe) zzb).zzc();
                }
                zzpqVar.zza(zzc, zza3);
            }
        }
        return new zzrb(zzpqVar.zza(), zzqbVar.zza(zzc2));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqc
    public final Class<zzqz> zzb() {
        return zzqz.class;
    }
}
