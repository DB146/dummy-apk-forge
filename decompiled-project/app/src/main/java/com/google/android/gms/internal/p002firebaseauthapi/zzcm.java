package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzcm {
    public static zzce zza(byte[] bArr) {
        try {
            zzww zza = zzww.zza(bArr, zzakk.zza());
            zzpc zza2 = zzpc.zza();
            zzqd zza3 = zzqd.zza(zza);
            return !zza2.zzc(zza3) ? new zzoh(zza3) : zza2.zza((zzpc) zza3);
        } catch (IOException e2) {
            throw new GeneralSecurityException("Failed to parse proto", e2);
        }
    }

    public static byte[] zza(zzce zzceVar) {
        return zzceVar instanceof zzoh ? ((zzoh) zzceVar).zzb().zza().zzk() : ((zzqd) zzpc.zza().zza((zzpc) zzceVar, zzqd.class)).zza().zzk();
    }
}
