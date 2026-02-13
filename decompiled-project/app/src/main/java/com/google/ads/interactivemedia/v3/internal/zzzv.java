package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Type;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzzv implements zzxj {
    private final zzyl zza;

    public zzzv(zzyl zzylVar, boolean z8) {
        this.zza = zzylVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxj
    public final zzxi zza(zzwm zzwmVar, zzact zzactVar) {
        Type zzd = zzactVar.zzd();
        Class zzc = zzactVar.zzc();
        if (!Map.class.isAssignableFrom(zzc)) {
            return null;
        }
        Type[] zzh = zzxr.zzh(zzd, zzc);
        Type type = zzh[0];
        return new zzzu(this, zzwmVar, zzh[0], (type == Boolean.TYPE || type == Boolean.class) ? zzaby.zzf : zzwmVar.zza(zzact.zzb(type)), zzh[1], zzwmVar.zza(zzact.zzb(zzh[1])), this.zza.zza(zzactVar));
    }
}
