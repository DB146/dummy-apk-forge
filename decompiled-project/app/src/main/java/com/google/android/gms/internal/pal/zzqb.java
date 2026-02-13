package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import y.S;

/* loaded from: classes.dex */
public final class zzqb {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public /* synthetic */ zzqb(zzpv zzpvVar, zzqa zzqaVar) {
        this.zza = new HashMap(zzpv.zzf(zzpvVar));
        this.zzb = new HashMap(zzpv.zze(zzpvVar));
        this.zzc = new HashMap(zzpv.zzh(zzpvVar));
        this.zzd = new HashMap(zzpv.zzg(zzpvVar));
    }

    public final zzka zza(zzpu zzpuVar, zzlg zzlgVar) {
        zzpx zzpxVar = new zzpx(zzpuVar.getClass(), zzpuVar.zzb(), null);
        if (this.zzb.containsKey(zzpxVar)) {
            return ((zzou) this.zzb.get(zzpxVar)).zza(zzpuVar, zzlgVar);
        }
        throw new GeneralSecurityException(S.b("No Key Parser for requested key type ", zzpxVar.toString(), " available"));
    }
}
