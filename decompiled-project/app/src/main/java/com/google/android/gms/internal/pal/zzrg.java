package com.google.android.gms.internal.pal;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzrg {
    private final zzkj zza;
    private final int zzb;
    private final zzks zzc;

    public /* synthetic */ zzrg(zzkj zzkjVar, int i7, zzks zzksVar, zzrf zzrfVar) {
        this.zza = zzkjVar;
        this.zzb = i7;
        this.zzc = zzksVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzrg)) {
            return false;
        }
        zzrg zzrgVar = (zzrg) obj;
        return this.zza == zzrgVar.zza && this.zzb == zzrgVar.zzb && this.zzc.equals(zzrgVar.zzc);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb), Integer.valueOf(this.zzc.hashCode())});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, parameters='%s')", this.zza, Integer.valueOf(this.zzb), this.zzc);
    }

    public final int zza() {
        return this.zzb;
    }
}
