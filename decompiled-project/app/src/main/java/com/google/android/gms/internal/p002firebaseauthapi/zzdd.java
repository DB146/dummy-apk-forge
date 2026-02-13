package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdk;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzdd extends zzcv {
    private final zzdk zza;
    private final zzaaf zzb;
    private final zzaaf zzc;
    private final zzaae zzd;
    private final Integer zze;

    /* loaded from: classes.dex */
    public static class zza {
        private zzdk zza;
        private zzaaf zzb;
        private zzaaf zzc;
        private Integer zzd;

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
        }

        public final zza zza(zzaaf zzaafVar) {
            this.zzb = zzaafVar;
            return this;
        }

        public final zza zza(zzdk zzdkVar) {
            this.zza = zzdkVar;
            return this;
        }

        public final zza zza(Integer num) {
            this.zzd = num;
            return this;
        }

        public final zzdd zza() {
            zzaae zzb;
            zzdk zzdkVar = this.zza;
            if (zzdkVar == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            if (this.zzb == null || this.zzc == null) {
                throw new GeneralSecurityException("Cannot build without key material");
            }
            if (zzdkVar.zzb() != this.zzb.zza()) {
                throw new GeneralSecurityException("AES key size mismatch");
            }
            if (this.zza.zzc() != this.zzc.zza()) {
                throw new GeneralSecurityException("HMAC key size mismatch");
            }
            if (this.zza.zza() && this.zzd == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.zza.zza() && this.zzd != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.zza.zzh() == zzdk.zzb.zzc) {
                zzb = zzpd.zza;
            } else if (this.zza.zzh() == zzdk.zzb.zzb) {
                zzb = zzpd.zza(this.zzd.intValue());
            } else {
                if (this.zza.zzh() != zzdk.zzb.zza) {
                    throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.zza.zzh())));
                }
                zzb = zzpd.zzb(this.zzd.intValue());
            }
            return new zzdd(this.zza, this.zzb, this.zzc, zzb, this.zzd);
        }

        public final zza zzb(zzaaf zzaafVar) {
            this.zzc = zzaafVar;
            return this;
        }
    }

    private zzdd(zzdk zzdkVar, zzaaf zzaafVar, zzaaf zzaafVar2, zzaae zzaaeVar, Integer num) {
        this.zza = zzdkVar;
        this.zzb = zzaafVar;
        this.zzc = zzaafVar2;
        this.zzd = zzaaeVar;
        this.zze = num;
    }

    public static zza zze() {
        return new zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcv, com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final /* synthetic */ zzce zza() {
        return (zzdk) zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final Integer zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcv
    /* renamed from: zzc */
    public final /* synthetic */ zzcx zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcv
    public final zzaae zzd() {
        return this.zzd;
    }

    public final zzaaf zzf() {
        return this.zzb;
    }

    public final zzaaf zzg() {
        return this.zzc;
    }
}
