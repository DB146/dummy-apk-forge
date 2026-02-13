package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class zzzg extends zzzk {
    final /* synthetic */ Method zza;
    final /* synthetic */ Object zzb;

    public zzzg(Method method, Object obj) {
        this.zza = method;
        this.zzb = obj;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzzk
    public final Object zza(Class cls) {
        zzzk.zzb(cls);
        return this.zza.invoke(this.zzb, cls);
    }
}
