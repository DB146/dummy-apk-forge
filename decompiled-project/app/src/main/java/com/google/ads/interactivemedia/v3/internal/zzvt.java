package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class zzvt extends zzux implements ScheduledFuture, zzvq {
    private final ScheduledFuture zza;

    public zzvt(zzvq zzvqVar, ScheduledFuture scheduledFuture) {
        super(zzvqVar);
        this.zza = scheduledFuture;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzuw, java.util.concurrent.Future
    public final boolean cancel(boolean z8) {
        boolean cancel = zzb().cancel(z8);
        if (cancel) {
            this.zza.cancel(z8);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.zza.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.zza.getDelay(timeUnit);
    }
}
