package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.G;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzez extends zzeq {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzfa zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzez(zzfa zzfaVar, Activity activity) {
        super(zzfaVar.zza, true);
        this.zza = activity;
        Objects.requireNonNull(zzfaVar);
        this.zzb = zzfaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    public final void zza() {
        zzcr zzQ = this.zzb.zza.zzQ();
        G.g(zzQ);
        zzQ.onActivityDestroyedByScionActivityInfo(zzdf.zza(this.zza), this.zzi);
    }
}
