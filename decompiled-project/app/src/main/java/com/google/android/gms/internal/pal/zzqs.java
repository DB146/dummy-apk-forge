package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzqs {

    @Deprecated
    public static final zzwx zza;

    @Deprecated
    public static final zzwx zzb;

    @Deprecated
    public static final zzwx zzc;

    static {
        new zzqr();
        zzwx zzc2 = zzwx.zzc();
        zza = zzc2;
        zzb = zzc2;
        zzc = zzc2;
        try {
            zza();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static void zza() {
        zzlf.zzo(new zzqx());
        zzlf.zzn(new zzqr(), true);
        if (zznb.zzb()) {
            return;
        }
        zzlf.zzn(new zzqh(), true);
        zzqo.zza();
    }
}
