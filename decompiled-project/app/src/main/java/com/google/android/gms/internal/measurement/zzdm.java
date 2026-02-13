package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.G;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdm extends zzeq {
    final /* synthetic */ zzdf zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzfb zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdm(zzfb zzfbVar, zzdf zzdfVar, String str, String str2) {
        super(zzfbVar, true);
        this.zza = zzdfVar;
        this.zzb = str;
        this.zzc = str2;
        Objects.requireNonNull(zzfbVar);
        this.zzd = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    public final void zza() {
        zzcr zzQ = this.zzd.zzQ();
        G.g(zzQ);
        zzQ.setCurrentScreenByScionActivityInfo(this.zza, this.zzb, this.zzc, this.zzh);
    }
}
