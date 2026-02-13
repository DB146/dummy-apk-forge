package com.google.android.gms.internal.p002firebaseauthapi;

import h3.o;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzoe extends zzbm {
    private final zzqe zza;
    private final zzaae zzb;

    /* loaded from: classes.dex */
    public static class zza extends zzce {
        private final String zza;
        private final zzxu zzb;

        private zza(String str, zzxu zzxuVar) {
            this.zza = str;
            this.zzb = zzxuVar;
        }

        public final String toString() {
            String str = this.zza;
            int i7 = zzog.zza[this.zzb.ordinal()];
            return o.n("(typeUrl=", str, ", outputPrefixType=", i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
        public final boolean zza() {
            return this.zzb != zzxu.RAW;
        }
    }

    public zzoe(zzqe zzqeVar, zzck zzckVar) {
        zzaae zza2;
        zza(zzqeVar, zzckVar);
        this.zza = zzqeVar;
        if (zzqeVar.zzc().equals(zzxu.RAW)) {
            zza2 = zzaae.zza(new byte[0]);
        } else if (zzqeVar.zzc().equals(zzxu.TINK)) {
            zza2 = zzpd.zzb(zzqeVar.zze().intValue());
        } else {
            if (!zzqeVar.zzc().equals(zzxu.LEGACY) && !zzqeVar.zzc().equals(zzxu.CRUNCHY)) {
                throw new GeneralSecurityException("Unknown output prefix type");
            }
            zza2 = zzpd.zza(zzqeVar.zze().intValue());
        }
        this.zzb = zza2;
    }

    private static void zza(zzqe zzqeVar, zzck zzckVar) {
        int i7 = zzog.zzb[zzqeVar.zza().ordinal()];
        if (i7 == 1 || i7 == 2) {
            zzck.zza(zzckVar);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final zzce zza() {
        return new zza(this.zza.zzf(), this.zza.zzc());
    }

    public final zzqe zza(zzck zzckVar) {
        zza(this.zza, zzckVar);
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final Integer zzb() {
        return this.zza.zze();
    }

    public final zzaae zzc() {
        return this.zzb;
    }
}
