package com.google.android.gms.internal.pal;

import java.nio.ByteBuffer;
import java.security.interfaces.ECPublicKey;

/* loaded from: classes.dex */
public final class zzxt implements zzjy {
    private static final byte[] zza = new byte[0];
    private final zzxw zzb;
    private final String zzc;
    private final byte[] zzd;
    private final zzxr zze;
    private final int zzf;

    public zzxt(ECPublicKey eCPublicKey, byte[] bArr, String str, int i7, zzxr zzxrVar) {
        zzxx.zzd(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.zzb = new zzxw(eCPublicKey);
        this.zzd = bArr;
        this.zzc = str;
        this.zzf = i7;
        this.zze = zzxrVar;
    }

    @Override // com.google.android.gms.internal.pal.zzjy
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        zzxv zza2 = this.zzb.zza(this.zzc, this.zzd, bArr2, this.zze.zza(), this.zzf);
        byte[] zza3 = this.zze.zzb(zza2.zzb()).zza(bArr, zza);
        byte[] zza4 = zza2.zza();
        return ByteBuffer.allocate(zza4.length + zza3.length).put(zza4).put(zza3).array();
    }
}
