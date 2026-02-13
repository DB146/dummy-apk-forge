package com.google.android.gms.internal.pal;

import java.util.Set;

/* loaded from: classes.dex */
public final class zzzb extends zzyy {
    private final zzzr zza = new zzzr();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof zzzb) && ((zzzb) obj).zza.equals(this.zza);
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzyx zzb(String str) {
        return (zzyx) this.zza.get("key");
    }

    public final zzyy zzc(String str) {
        return (zzyy) this.zza.get(str);
    }

    public final zzzb zze(String str) {
        return (zzzb) this.zza.get("keyData");
    }

    public final Set zzg() {
        return this.zza.entrySet();
    }

    public final void zzh(String str, zzyy zzyyVar) {
        this.zza.put(str, zzyyVar);
    }

    public final boolean zzi(String str) {
        return this.zza.containsKey(str);
    }
}
