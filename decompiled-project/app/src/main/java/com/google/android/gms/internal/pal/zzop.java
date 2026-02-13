package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
final class zzop implements zzoe {
    private final zzyv zza;
    private final zzyv zzb;

    private zzop(byte[] bArr, byte[] bArr2) {
        this.zza = zzyv.zzb(bArr);
        this.zzb = zzyv.zzb(bArr2);
    }

    public static zzop zza(byte[] bArr) {
        return new zzop(bArr, zzyt.zzc(bArr));
    }
}
