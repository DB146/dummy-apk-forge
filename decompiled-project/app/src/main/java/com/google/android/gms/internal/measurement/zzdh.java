package com.google.android.gms.internal.measurement;

import P5.b;
import com.google.android.gms.common.internal.G;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdh extends zzeq {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzfb zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdh(zzfb zzfbVar, String str, String str2, Object obj, boolean z8) {
        super(zzfbVar, true);
        this.zza = str;
        this.zzb = str2;
        this.zzc = obj;
        this.zzd = z8;
        Objects.requireNonNull(zzfbVar);
        this.zze = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    public final void zza() {
        zzcr zzQ = this.zze.zzQ();
        G.g(zzQ);
        zzQ.setUserProperty(this.zza, this.zzb, new b(this.zzc), this.zzd, this.zzh);
    }
}
