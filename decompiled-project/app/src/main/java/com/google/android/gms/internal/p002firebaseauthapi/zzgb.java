package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzgg;
import h3.o;
import java.security.GeneralSecurityException;
import y.S;

/* loaded from: classes.dex */
public final class zzgb extends zzcv {
    private final zzgg zza;
    private final zzaaf zzb;
    private final zzaae zzc;
    private final Integer zzd;

    private zzgb(zzgg zzggVar, zzaaf zzaafVar, zzaae zzaaeVar, Integer num) {
        this.zza = zzggVar;
        this.zzb = zzaafVar;
        this.zzc = zzaaeVar;
        this.zzd = num;
    }

    public static zzgb zza(zzgg.zza zzaVar, zzaaf zzaafVar, Integer num) {
        zzaae zzb;
        zzgg.zza zzaVar2 = zzgg.zza.zzc;
        if (zzaVar != zzaVar2 && num == null) {
            throw new GeneralSecurityException(S.b("For given Variant ", String.valueOf(zzaVar), " the value of idRequirement must be non-null"));
        }
        if (zzaVar == zzaVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzaafVar.zza() != 32) {
            throw new GeneralSecurityException(o.l(zzaafVar.zza(), "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
        }
        zzgg zza = zzgg.zza(zzaVar);
        if (zza.zzb() == zzaVar2) {
            zzb = zzpd.zza;
        } else if (zza.zzb() == zzgg.zza.zzb) {
            zzb = zzpd.zza(num.intValue());
        } else {
            if (zza.zzb() != zzgg.zza.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(String.valueOf(zza.zzb())));
            }
            zzb = zzpd.zzb(num.intValue());
        }
        return new zzgb(zza, zzaafVar, zzb, num);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcv, com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final /* synthetic */ zzce zza() {
        return (zzgg) zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final Integer zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcv
    /* renamed from: zzc */
    public final /* synthetic */ zzcx zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcv
    public final zzaae zzd() {
        return this.zzc;
    }

    public final zzaaf zze() {
        return this.zzb;
    }
}
