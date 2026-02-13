package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzoq {
    private final zzjt zza;
    private final zzjw zzb;

    public zzoq(zzjt zzjtVar) {
        this.zza = zzjtVar;
        this.zzb = null;
    }

    public zzoq(zzjw zzjwVar) {
        this.zza = null;
        this.zzb = zzjwVar;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        zzjt zzjtVar = this.zza;
        return zzjtVar != null ? zzjtVar.zza(bArr, bArr2) : this.zzb.zza(bArr, bArr2);
    }
}
