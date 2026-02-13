package com.google.ads.interactivemedia.v3.internal;

import A3.c;
import h3.o;

/* loaded from: classes.dex */
final class zzabm implements zzxj {
    final /* synthetic */ Class zza;
    final /* synthetic */ Class zzb;
    final /* synthetic */ zzxi zzc;

    public zzabm(Class cls, Class cls2, zzxi zzxiVar) {
        this.zza = cls;
        this.zzb = cls2;
        this.zzc = zzxiVar;
    }

    public final String toString() {
        String name = this.zza.getName();
        String name2 = this.zzb.getName();
        return o.p(c.o("Factory[type=", name, "+", name2, ",adapter="), this.zzc.toString(), "]");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxj
    public final zzxi zza(zzwm zzwmVar, zzact zzactVar) {
        Class zzc = zzactVar.zzc();
        if (zzc == this.zza || zzc == this.zzb) {
            return this.zzc;
        }
        return null;
    }
}
