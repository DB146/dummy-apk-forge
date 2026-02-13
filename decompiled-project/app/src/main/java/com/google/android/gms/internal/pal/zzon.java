package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
final class zzon implements zzoe {
    private final zzyv zza;
    private final zzyv zzb;

    private zzon(byte[] bArr, byte[] bArr2) {
        this.zza = zzyv.zzb(bArr);
        this.zzb = zzyv.zzb(bArr2);
    }

    public static zzon zza(byte[] bArr, byte[] bArr2, int i7) {
        zzxx.zze(zzxx.zzj(zzxx.zzk(i7), 1, bArr2), zzxx.zzh(i7, bArr));
        return new zzon(bArr, bArr2);
    }
}
