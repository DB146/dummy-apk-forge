package com.google.android.gms.internal.pal;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzdc extends zzbi {
    public long zza;
    public long zzb;

    public zzdc() {
        this.zza = -1L;
        this.zzb = -1L;
    }

    public zzdc(String str) {
        this.zza = -1L;
        this.zzb = -1L;
        HashMap zza = zzbi.zza(str);
        if (zza != null) {
            this.zza = ((Long) zza.get(0)).longValue();
            this.zzb = ((Long) zza.get(1)).longValue();
        }
    }

    @Override // com.google.android.gms.internal.pal.zzbi
    public final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, Long.valueOf(this.zza));
        hashMap.put(1, Long.valueOf(this.zzb));
        return hashMap;
    }
}
