package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.G;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzef extends zzeq {
    final /* synthetic */ String zza;
    final /* synthetic */ zzco zzb;
    final /* synthetic */ zzfb zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzef(zzfb zzfbVar, String str, zzco zzcoVar) {
        super(zzfbVar, true);
        this.zza = str;
        this.zzb = zzcoVar;
        Objects.requireNonNull(zzfbVar);
        this.zzc = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    public final void zza() {
        zzcr zzQ = this.zzc.zzQ();
        G.g(zzQ);
        zzQ.getMaxUserProperties(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    public final void zzb() {
        this.zzb.zzb(null);
    }
}
