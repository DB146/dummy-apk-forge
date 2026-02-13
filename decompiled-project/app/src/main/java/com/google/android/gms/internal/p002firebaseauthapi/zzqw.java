package com.google.android.gms.internal.p002firebaseauthapi;

import A3.c;
import h3.o;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzqw extends zzrm {
    private final int zza;
    private final int zzb;
    private final zzb zzc;

    /* loaded from: classes.dex */
    public static final class zza {
        private Integer zza;
        private Integer zzb;
        private zzb zzc;

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = zzb.zzd;
        }

        public final zza zza(int i7) {
            if (i7 != 16 && i7 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i7 << 3)));
            }
            this.zza = Integer.valueOf(i7);
            return this;
        }

        public final zza zza(zzb zzbVar) {
            this.zzc = zzbVar;
            return this;
        }

        public final zzqw zza() {
            Integer num = this.zza;
            if (num == null) {
                throw new GeneralSecurityException("key size not set");
            }
            if (this.zzb == null) {
                throw new GeneralSecurityException("tag size not set");
            }
            if (this.zzc != null) {
                return new zzqw(num.intValue(), this.zzb.intValue(), this.zzc);
            }
            throw new GeneralSecurityException("variant not set");
        }

        public final zza zzb(int i7) {
            if (i7 < 10 || 16 < i7) {
                throw new GeneralSecurityException(o.l(i7, "Invalid tag size for AesCmacParameters: "));
            }
            this.zzb = Integer.valueOf(i7);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class zzb {
        public static final zzb zza = new zzb("TINK");
        public static final zzb zzb = new zzb("CRUNCHY");
        public static final zzb zzc = new zzb("LEGACY");
        public static final zzb zzd = new zzb("NO_PREFIX");
        private final String zze;

        private zzb(String str) {
            this.zze = str;
        }

        public final String toString() {
            return this.zze;
        }
    }

    private zzqw(int i7, int i10, zzb zzbVar) {
        this.zza = i7;
        this.zzb = i10;
        this.zzc = zzbVar;
    }

    public static zza zzd() {
        return new zza();
    }

    private final int zzf() {
        int i7;
        zzb zzbVar = this.zzc;
        if (zzbVar == zzb.zzd) {
            return this.zzb;
        }
        if (zzbVar == zzb.zza) {
            i7 = this.zzb;
        } else if (zzbVar == zzb.zzb) {
            i7 = this.zzb;
        } else {
            if (zzbVar != zzb.zzc) {
                throw new IllegalStateException("Unknown variant");
            }
            i7 = this.zzb;
        }
        return i7 + 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqw)) {
            return false;
        }
        zzqw zzqwVar = (zzqw) obj;
        return zzqwVar.zza == this.zza && zzqwVar.zzf() == zzf() && zzqwVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Objects.hash(zzqw.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        int i7 = this.zzb;
        int i10 = this.zza;
        StringBuilder sb2 = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb2.append(valueOf);
        sb2.append(", ");
        sb2.append(i7);
        sb2.append("-byte tags, and ");
        return c.k(sb2, i10, "-byte key)");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final boolean zza() {
        return this.zzc != zzb.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzb zze() {
        return this.zzc;
    }
}
