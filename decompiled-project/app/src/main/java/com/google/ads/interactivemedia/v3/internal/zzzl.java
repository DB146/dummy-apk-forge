package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
final class zzzl implements zzxj {
    @Override // com.google.ads.interactivemedia.v3.internal.zzxj
    public final zzxi zza(zzwm zzwmVar, zzact zzactVar) {
        Type zzd = zzactVar.zzd();
        boolean z8 = zzd instanceof GenericArrayType;
        if (!z8 && (!(zzd instanceof Class) || !((Class) zzd).isArray())) {
            return null;
        }
        Type genericComponentType = z8 ? ((GenericArrayType) zzd).getGenericComponentType() : ((Class) zzd).getComponentType();
        return new zzzm(zzwmVar, zzwmVar.zza(zzact.zzb(genericComponentType)), zzxr.zza(genericComponentType));
    }
}
