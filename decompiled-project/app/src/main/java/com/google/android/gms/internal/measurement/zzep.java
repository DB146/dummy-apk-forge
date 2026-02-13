package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.G;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzep extends zzeq {
    final /* synthetic */ Long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ zzfb zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzep(zzfb zzfbVar, Long l10, String str, String str2, Bundle bundle, boolean z8, boolean z10) {
        super(zzfbVar, true);
        this.zza = l10;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bundle;
        this.zze = z8;
        this.zzf = z10;
        Objects.requireNonNull(zzfbVar);
        this.zzg = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    public final void zza() {
        Long l10 = this.zza;
        long longValue = l10 == null ? this.zzh : l10.longValue();
        zzcr zzQ = this.zzg.zzQ();
        G.g(zzQ);
        zzQ.logEvent(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, longValue);
    }
}
