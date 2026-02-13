package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.G;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzei extends zzeq {
    final /* synthetic */ zzco zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzfb zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzei(zzfb zzfbVar, zzco zzcoVar, int i7) {
        super(zzfbVar, true);
        this.zza = zzcoVar;
        this.zzb = i7;
        Objects.requireNonNull(zzfbVar);
        this.zzc = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    public final void zza() {
        zzcr zzQ = this.zzc.zzQ();
        G.g(zzQ);
        zzQ.getTestFlag(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    public final void zzb() {
        this.zza.zzb(null);
    }
}
