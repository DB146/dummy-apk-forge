package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.G;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzdp extends zzeq {
    final /* synthetic */ zzfb zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdp(zzfb zzfbVar) {
        super(zzfbVar, true);
        Objects.requireNonNull(zzfbVar);
        this.zza = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    public final void zza() {
        zzcr zzQ = this.zza.zzQ();
        G.g(zzQ);
        zzQ.resetAnalyticsData(this.zzh);
    }
}
