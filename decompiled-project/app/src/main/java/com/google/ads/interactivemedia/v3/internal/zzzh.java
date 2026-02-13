package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class zzzh extends zzzk {
    final /* synthetic */ Method zza;
    final /* synthetic */ int zzb;

    public zzzh(Method method, int i7) {
        this.zza = method;
        this.zzb = i7;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzzk
    public final Object zza(Class cls) {
        zzzk.zzb(cls);
        return this.zza.invoke(null, cls, Integer.valueOf(this.zzb));
    }
}
