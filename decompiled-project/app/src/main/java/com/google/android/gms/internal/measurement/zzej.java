package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.G;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzej extends zzeq {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzfb zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzej(zzfb zzfbVar, boolean z8) {
        super(zzfbVar, true);
        this.zza = z8;
        Objects.requireNonNull(zzfbVar);
        this.zzb = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    public final void zza() {
        zzcr zzQ = this.zzb.zzQ();
        G.g(zzQ);
        zzQ.setDataCollectionEnabled(this.zza);
    }
}
