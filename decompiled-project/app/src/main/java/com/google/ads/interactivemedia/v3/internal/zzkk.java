package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzkk extends zzhz {
    public Long zza;
    public Boolean zzb;
    public Boolean zzc;

    public zzkk() {
    }

    public zzkk(String str) {
        HashMap zza = zzhz.zza(str);
        if (zza != null) {
            this.zza = (Long) zza.get(0);
            this.zzb = (Boolean) zza.get(1);
            this.zzc = (Boolean) zza.get(2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzhz
    public final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        hashMap.put(2, this.zzc);
        return hashMap;
    }
}
