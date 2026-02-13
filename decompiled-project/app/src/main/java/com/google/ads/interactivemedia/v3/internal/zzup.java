package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zzup extends zzuq {
    final /* synthetic */ zzur zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzup(zzur zzurVar, Callable callable, Executor executor) {
        super(zzurVar, executor);
        this.zza = zzurVar;
        callable.getClass();
        this.zzc = callable;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzvp
    public final Object zza() {
        return this.zzc.call();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzvp
    public final String zzb() {
        return this.zzc.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzuq
    public final void zzc(Object obj) {
        this.zza.zzc(obj);
    }
}
