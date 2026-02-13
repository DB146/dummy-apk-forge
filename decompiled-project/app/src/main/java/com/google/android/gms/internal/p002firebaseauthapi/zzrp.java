package com.google.android.gms.internal.p002firebaseauthapi;

import A3.c;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzrp implements zzqc<zzcb, zzcb> {
    private static final zzrp zza = new zzrp();
    private static final zzpr<zzoe, zzcb> zzb = zzpr.zza(new zzpt() { // from class: com.google.android.gms.internal.firebase-auth-api.zzro
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpt
        public final Object zza(zzbm zzbmVar) {
            return zzsm.zza((zzoe) zzbmVar);
        }
    }, zzoe.class, zzcb.class);

    public static void zzc() {
        zzoz.zza().zza(zza);
        zzoz.zza().zza(zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqc
    public final Class<zzcb> zza() {
        return zzcb.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqc
    public final /* synthetic */ zzcb zza(zzoa zzoaVar, zzoj zzojVar, zzqb<zzcb> zzqbVar) {
        zzon zzonVar;
        zzon zzonVar2;
        zzaae zzc;
        zzpq zzpqVar = new zzpq();
        for (int i7 = 0; i7 < zzoaVar.zza(); i7++) {
            zzod zza2 = zzoaVar.zza(i7);
            if (zza2.zzc().equals(zzbo.zza)) {
                zzcb zza3 = zzqbVar.zza(zza2);
                zzbm zzb2 = zza2.zzb();
                if (zzb2 instanceof zzrn) {
                    zzc = ((zzrn) zzb2).zze();
                } else {
                    if (!(zzb2 instanceof zzoe)) {
                        throw new GeneralSecurityException(c.j("Cannot get output prefix for key of class ", zzb2.getClass().getName(), " with parameters ", String.valueOf(zzb2.zza())));
                    }
                    zzc = ((zzoe) zzb2).zzc();
                }
                zzpqVar.zza(zzc, new zzrr(zza3, zza2.zza()));
            }
        }
        if (zzojVar.zza()) {
            zzonVar = zzoq.zza;
            zzonVar2 = zzonVar;
        } else {
            zzoo zza4 = zzov.zzb().zza();
            zzon zza5 = zza4.zza(zzoaVar, zzojVar, "mac", "compute");
            zzonVar2 = zza4.zza(zzoaVar, zzojVar, "mac", "verify");
            zzonVar = zza5;
        }
        return new zzrq(new zzrr(zzqbVar.zza(zzoaVar.zzc()), zzoaVar.zzc().zza()), zzpqVar.zza(), zzonVar, zzonVar2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqc
    public final Class<zzcb> zzb() {
        return zzcb.class;
    }
}
