package com.google.android.gms.internal.pal;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzdp extends zzbi {
    public Long zza;
    public Long zzb;

    public zzdp() {
    }

    public zzdp(String str) {
        HashMap zza = zzbi.zza(str);
        if (zza != null) {
            this.zza = (Long) zza.get(0);
            this.zzb = (Long) zza.get(1);
        }
    }

    @Override // com.google.android.gms.internal.pal.zzbi
    public final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        return hashMap;
    }
}
