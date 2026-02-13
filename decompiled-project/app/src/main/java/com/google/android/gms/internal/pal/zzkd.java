package com.google.android.gms.internal.pal;

import A3.c;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
class zzkd implements zzkb {
    private final zzpa zza;
    private final Class zzb;

    public zzkd(zzpa zzpaVar, Class cls) {
        if (!zzpaVar.zzl().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(c.j("Given internalKeyMananger ", zzpaVar.toString(), " does not support primitive class ", cls.getName()));
        }
        this.zza = zzpaVar;
        this.zzb = cls;
    }

    private final zzkc zzg() {
        return new zzkc(this.zza.zza());
    }

    private final Object zzh(zzaef zzaefVar) {
        if (Void.class.equals(this.zzb)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.zza.zze(zzaefVar);
        return this.zza.zzk(zzaefVar, this.zzb);
    }

    @Override // com.google.android.gms.internal.pal.zzkb
    public final zzvo zza(zzaby zzabyVar) {
        try {
            zzaef zza = zzg().zza(zzabyVar);
            zzvl zza2 = zzvo.zza();
            zza2.zzb(this.zza.zzd());
            zza2.zzc(zza.zzaI());
            zza2.zza(this.zza.zzb());
            return (zzvo) zza2.zzan();
        } catch (zzadi e2) {
            throw new GeneralSecurityException("Unexpected proto", e2);
        }
    }

    @Override // com.google.android.gms.internal.pal.zzkb
    public final zzaef zzb(zzaby zzabyVar) {
        try {
            return zzg().zza(zzabyVar);
        } catch (zzadi e2) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.zza.zza().zzg().getName()), e2);
        }
    }

    @Override // com.google.android.gms.internal.pal.zzkb
    public final Class zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.pal.zzkb
    public final Object zzd(zzaby zzabyVar) {
        try {
            return zzh(this.zza.zzc(zzabyVar));
        } catch (zzadi e2) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.zza.zzj().getName()), e2);
        }
    }

    @Override // com.google.android.gms.internal.pal.zzkb
    public final Object zze(zzaef zzaefVar) {
        String concat = "Expected proto of type ".concat(this.zza.zzj().getName());
        if (this.zza.zzj().isInstance(zzaefVar)) {
            return zzh(zzaefVar);
        }
        throw new GeneralSecurityException(concat);
    }

    @Override // com.google.android.gms.internal.pal.zzkb
    public final String zzf() {
        return this.zza.zzd();
    }
}
