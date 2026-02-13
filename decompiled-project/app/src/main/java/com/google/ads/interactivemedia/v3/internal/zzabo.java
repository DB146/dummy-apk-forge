package com.google.ads.interactivemedia.v3.internal;

import h3.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzabo implements zzxj {
    final /* synthetic */ Class zza;
    final /* synthetic */ zzxi zzb;

    public zzabo(Class cls, zzxi zzxiVar) {
        this.zza = cls;
        this.zzb = zzxiVar;
    }

    public final String toString() {
        return o.n("Factory[typeHierarchy=", this.zza.getName(), ",adapter=", this.zzb.toString(), "]");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxj
    public final zzxi zza(zzwm zzwmVar, zzact zzactVar) {
        Class<?> zzc = zzactVar.zzc();
        if (this.zza.isAssignableFrom(zzc)) {
            return new zzabn(this, zzc);
        }
        return null;
    }
}
