package com.google.android.gms.internal.p002firebaseauthapi;

import h3.o;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzoh extends zzce {
    private final zzqd zza;

    public zzoh(zzqd zzqdVar) {
        this.zza = zzqdVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzoh)) {
            return false;
        }
        zzqd zzqdVar = ((zzoh) obj).zza;
        return this.zza.zza().zzd().equals(zzqdVar.zza().zzd()) && this.zza.zza().zzf().equals(zzqdVar.zza().zzf()) && this.zza.zza().zze().equals(zzqdVar.zza().zze());
    }

    public final int hashCode() {
        return Objects.hash(this.zza.zza(), this.zza.zzb());
    }

    public final String toString() {
        String zzf = this.zza.zza().zzf();
        int i7 = zzok.zza[this.zza.zza().zzd().ordinal()];
        return o.n("(typeUrl=", zzf, ", outputPrefixType=", i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final boolean zza() {
        return this.zza.zza().zzd() != zzxu.RAW;
    }

    public final zzqd zzb() {
        return this.zza;
    }
}
