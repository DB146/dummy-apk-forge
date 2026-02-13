package com.google.android.gms.internal.appindex;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractBinderC0968i;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzo extends AbstractBinderC0968i {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zzq zzb;

    public zzo(zzq zzqVar, TaskCompletionSource taskCompletionSource) {
        this.zzb = zzqVar;
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0969j
    public final void onResult(Status status) {
        TaskCompletionSource taskCompletionSource;
        TaskCompletionSource taskCompletionSource2;
        if (this.zza.trySetResult(null)) {
            if (status.t()) {
                taskCompletionSource2 = this.zzb.zza.zzc;
                taskCompletionSource2.setResult(null);
            } else {
                taskCompletionSource = this.zzb.zza.zzc;
                taskCompletionSource.setException(zzac.zza(status, "Indexing error, please try again."));
            }
        }
    }
}
