package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzoq extends zznz {
    final /* synthetic */ TaskCompletionSource zza;

    public zzoq(zzor zzorVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzoa
    public final void zzb(int i7) {
        this.zza.trySetException(new zzol(i7));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzoa
    public final void zzc(zzoi zzoiVar) {
        this.zza.trySetResult(zzoiVar.zza());
    }
}
