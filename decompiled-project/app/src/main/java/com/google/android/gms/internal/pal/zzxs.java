package com.google.android.gms.internal.pal;

import java.security.interfaces.ECPrivateKey;

/* loaded from: classes.dex */
public final class zzxs implements zzjx {
    private final ECPrivateKey zza;
    private final zzxu zzb;
    private final String zzc;
    private final byte[] zzd;
    private final zzxr zze;

    public zzxs(ECPrivateKey eCPrivateKey, byte[] bArr, String str, int i7, zzxr zzxrVar) {
        this.zza = eCPrivateKey;
        this.zzb = new zzxu(eCPrivateKey);
        this.zzd = bArr;
        this.zzc = str;
        this.zze = zzxrVar;
    }
}
