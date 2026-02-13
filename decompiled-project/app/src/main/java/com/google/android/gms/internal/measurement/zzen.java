package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.G;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzen extends zzeq {
    final /* synthetic */ zzes zza;
    final /* synthetic */ zzfb zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzen(zzfb zzfbVar, zzes zzesVar) {
        super(zzfbVar, true);
        this.zza = zzesVar;
        Objects.requireNonNull(zzfbVar);
        this.zzb = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    public final void zza() {
        zzcr zzQ = this.zzb.zzQ();
        G.g(zzQ);
        zzQ.registerOnMeasurementEventListener(this.zza);
    }
}
