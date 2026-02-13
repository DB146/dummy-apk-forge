package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.G;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzdl extends zzeq {
    final /* synthetic */ String zza;
    final /* synthetic */ zzfb zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdl(zzfb zzfbVar, String str) {
        super(zzfbVar, true);
        this.zza = str;
        Objects.requireNonNull(zzfbVar);
        this.zzb = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    public final void zza() {
        zzcr zzQ = this.zzb.zzQ();
        G.g(zzQ);
        zzQ.setUserId(this.zza, this.zzh);
    }
}
