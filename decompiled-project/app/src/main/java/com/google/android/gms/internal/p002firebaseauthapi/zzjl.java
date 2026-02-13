package com.google.android.gms.internal.p002firebaseauthapi;

import A3.c;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzjl implements zzqc<zzbi, zzbi> {
    private static final zzjl zza = new zzjl();
    private static final zzpr<zzoe, zzbi> zzb = zzpr.zza(new zzpt() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjo
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpt
        public final Object zza(zzbm zzbmVar) {
            return zzjy.zza((zzoe) zzbmVar);
        }
    }, zzoe.class, zzbi.class);

    public static void zzc() {
        zzoz.zza().zza(zza);
        zzoz.zza().zza(zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqc
    public final Class<zzbi> zza() {
        return zzbi.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqc
    public final /* synthetic */ zzbi zza(zzoa zzoaVar, zzoj zzojVar, zzqb<zzbi> zzqbVar) {
        zzon zzonVar;
        zzon zzonVar2;
        zzaae zzc;
        zzpq zzpqVar = new zzpq();
        for (int i7 = 0; i7 < zzoaVar.zza(); i7++) {
            zzod zza2 = zzoaVar.zza(i7);
            if (zza2.zzc().equals(zzbo.zza)) {
                zzbi zza3 = zzqbVar.zza(zza2);
                zzbm zzb2 = zza2.zzb();
                if (zzb2 instanceof zzjj) {
                    zzc = ((zzjj) zzb2).zze();
                } else {
                    if (!(zzb2 instanceof zzoe)) {
                        throw new GeneralSecurityException(c.j("Cannot get output prefix for key of class ", zzb2.getClass().getName(), " with parameters ", String.valueOf(zzb2.zza())));
                    }
                    zzc = ((zzoe) zzb2).zzc();
                }
                zzpqVar.zza(zzc, new zzjn(zza3, zza2.zza()));
            }
        }
        if (zzojVar.zza()) {
            zzonVar = zzoq.zza;
            zzonVar2 = zzonVar;
        } else {
            zzoo zza4 = zzov.zzb().zza();
            zzonVar = zza4.zza(zzoaVar, zzojVar, "daead", "encrypt");
            zzonVar2 = zza4.zza(zzoaVar, zzojVar, "daead", "decrypt");
        }
        return new zzjq(new zzjn(zzqbVar.zza(zzoaVar.zzc()), zzoaVar.zzc().zza()), zzpqVar.zza(), zzonVar, zzonVar2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqc
    public final Class<zzbi> zzb() {
        return zzbi.class;
    }
}
