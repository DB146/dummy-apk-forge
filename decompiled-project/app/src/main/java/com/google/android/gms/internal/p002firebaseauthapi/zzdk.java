package com.google.android.gms.internal.p002firebaseauthapi;

import A3.c;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzdk extends zzcx {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzb zze;
    private final zzc zzf;

    /* loaded from: classes.dex */
    public static final class zza {
        private Integer zza;
        private Integer zzb;
        private Integer zzc;
        private Integer zzd;
        private zzc zze;
        private zzb zzf;

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzf = zzb.zzc;
        }

        public final zza zza(int i7) {
            if (i7 != 16 && i7 != 24 && i7 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i7)));
            }
            this.zza = Integer.valueOf(i7);
            return this;
        }

        public final zza zza(zzb zzbVar) {
            this.zzf = zzbVar;
            return this;
        }

        public final zza zza(zzc zzcVar) {
            this.zze = zzcVar;
            return this;
        }

        public final zzdk zza() {
            if (this.zza == null) {
                throw new GeneralSecurityException("AES key size is not set");
            }
            if (this.zzb == null) {
                throw new GeneralSecurityException("HMAC key size is not set");
            }
            if (this.zzc == null) {
                throw new GeneralSecurityException("iv size is not set");
            }
            Integer num = this.zzd;
            if (num == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.zze == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.zzf == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            int intValue = num.intValue();
            zzc zzcVar = this.zze;
            if (zzcVar == zzc.zza) {
                if (intValue > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
                }
            } else if (zzcVar == zzc.zzb) {
                if (intValue > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
                }
            } else if (zzcVar == zzc.zzc) {
                if (intValue > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
                }
            } else if (zzcVar == zzc.zzd) {
                if (intValue > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
                }
            } else {
                if (zzcVar != zzc.zze) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                }
                if (intValue > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
                }
            }
            return new zzdk(this.zza.intValue(), this.zzb.intValue(), this.zzc.intValue(), this.zzd.intValue(), this.zzf, this.zze);
        }

        public final zza zzb(int i7) {
            if (i7 < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i7)));
            }
            this.zzb = Integer.valueOf(i7);
            return this;
        }

        public final zza zzc(int i7) {
            if (i7 < 12 || i7 > 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i7)));
            }
            this.zzc = Integer.valueOf(i7);
            return this;
        }

        public final zza zzd(int i7) {
            if (i7 < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i7)));
            }
            this.zzd = Integer.valueOf(i7);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class zzb {
        public static final zzb zza = new zzb("TINK");
        public static final zzb zzb = new zzb("CRUNCHY");
        public static final zzb zzc = new zzb("NO_PREFIX");
        private final String zzd;

        private zzb(String str) {
            this.zzd = str;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    /* loaded from: classes.dex */
    public static final class zzc {
        public static final zzc zza = new zzc("SHA1");
        public static final zzc zzb = new zzc("SHA224");
        public static final zzc zzc = new zzc("SHA256");
        public static final zzc zzd = new zzc("SHA384");
        public static final zzc zze = new zzc("SHA512");
        private final String zzf;

        private zzc(String str) {
            this.zzf = str;
        }

        public final String toString() {
            return this.zzf;
        }
    }

    private zzdk(int i7, int i10, int i11, int i12, zzb zzbVar, zzc zzcVar) {
        this.zza = i7;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = zzbVar;
        this.zzf = zzcVar;
    }

    public static zza zzf() {
        return new zza();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdk)) {
            return false;
        }
        zzdk zzdkVar = (zzdk) obj;
        return zzdkVar.zza == this.zza && zzdkVar.zzb == this.zzb && zzdkVar.zzc == this.zzc && zzdkVar.zzd == this.zzd && zzdkVar.zze == this.zze && zzdkVar.zzf == this.zzf;
    }

    public final int hashCode() {
        return Objects.hash(zzdk.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zze);
        String valueOf2 = String.valueOf(this.zzf);
        int i7 = this.zzc;
        int i10 = this.zzd;
        int i11 = this.zza;
        int i12 = this.zzb;
        StringBuilder o10 = c.o("AesCtrHmacAead Parameters (variant: ", valueOf, ", hashType: ", valueOf2, ", ");
        o10.append(i7);
        o10.append("-byte IV, and ");
        o10.append(i10);
        o10.append("-byte tags, and ");
        o10.append(i11);
        o10.append("-byte AES key, and ");
        o10.append(i12);
        o10.append("-byte HMAC key)");
        return o10.toString();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final boolean zza() {
        return this.zze != zzb.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final int zze() {
        return this.zzd;
    }

    public final zzc zzg() {
        return this.zzf;
    }

    public final zzb zzh() {
        return this.zze;
    }
}
