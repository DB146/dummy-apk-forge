package com.google.ads.interactivemedia.v3.internal;

import java.sql.Date;
import java.sql.Timestamp;

/* loaded from: classes.dex */
public final class zzacs {
    public static final boolean zza;
    public static final zzzs zzb;
    public static final zzzs zzc;
    public static final zzxj zzd;
    public static final zzxj zze;
    public static final zzxj zzf;

    static {
        boolean z8;
        zzxj zzxjVar;
        try {
            Class.forName("java.sql.Date");
            z8 = true;
        } catch (ClassNotFoundException unused) {
            z8 = false;
        }
        zza = z8;
        if (z8) {
            zzb = new zzacq(Date.class);
            zzc = new zzacr(Timestamp.class);
            zzd = zzacj.zza;
            zze = zzacm.zza;
            zzxjVar = zzacp.zza;
        } else {
            zzxjVar = null;
            zzb = null;
            zzc = null;
            zzd = null;
            zze = null;
        }
        zzf = zzxjVar;
    }
}
