package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzpf {
    public static final zzrc zza = new zzpe(null);

    public static zzri zza(zzlb zzlbVar) {
        zzkj zzkjVar;
        zzre zzreVar = new zzre();
        zzreVar.zzb(zzlbVar.zzb());
        Iterator it = zzlbVar.zzd().iterator();
        while (it.hasNext()) {
            for (zzkv zzkvVar : (List) it.next()) {
                int zze = zzkvVar.zze() - 2;
                if (zze == 1) {
                    zzkjVar = zzkj.zza;
                } else if (zze == 2) {
                    zzkjVar = zzkj.zzb;
                } else {
                    if (zze != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    zzkjVar = zzkj.zzc;
                }
                zzreVar.zza(zzkjVar, zzkvVar.zza(), zzkvVar.zzb());
            }
        }
        if (zzlbVar.zza() != null) {
            zzreVar.zzc(zzlbVar.zza().zza());
        }
        try {
            return zzreVar.zzd();
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
