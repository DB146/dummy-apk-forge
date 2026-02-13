package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
final class zzwj extends zzxi {
    final /* synthetic */ zzxi zza;

    public zzwj(zzxi zzxiVar) {
        this.zza = zzxiVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) {
        return new AtomicLong(((Number) this.zza.read(zzacvVar)).longValue());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) {
        this.zza.write(zzacxVar, Long.valueOf(((AtomicLong) obj).get()));
    }
}
