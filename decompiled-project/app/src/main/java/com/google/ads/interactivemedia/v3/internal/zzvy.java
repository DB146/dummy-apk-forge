package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzvy extends zzvp {
    final /* synthetic */ zzvz zza;
    private final Callable zzb;

    public zzvy(zzvz zzvzVar, Callable callable) {
        this.zza = zzvzVar;
        callable.getClass();
        this.zzb = callable;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzvp
    public final Object zza() {
        return this.zzb.call();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzvp
    public final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzvp
    public final void zzd(Throwable th) {
        this.zza.zzd(th);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzvp
    public final void zze(Object obj) {
        this.zza.zzc(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzvp
    public final boolean zzg() {
        return this.zza.isDone();
    }
}
