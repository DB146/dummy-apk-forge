package com.google.android.gms.internal.pal;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzcx extends zzbi {
    public Long zza;
    public Long zzb;
    public Long zzc;

    public zzcx() {
    }

    public zzcx(String str) {
        HashMap zza = zzbi.zza(str);
        if (zza != null) {
            this.zza = (Long) zza.get(0);
            this.zzb = (Long) zza.get(1);
            this.zzc = (Long) zza.get(2);
        }
    }

    @Override // com.google.android.gms.internal.pal.zzbi
    public final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        hashMap.put(2, this.zzc);
        return hashMap;
    }
}
