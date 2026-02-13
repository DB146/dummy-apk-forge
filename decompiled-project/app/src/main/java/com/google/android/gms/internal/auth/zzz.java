package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v5.C2144c;

/* loaded from: classes.dex */
final class zzz extends zzl {
    final /* synthetic */ TaskCompletionSource zza;

    public zzz(zzab zzabVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.zzm
    public final void zzb(Status status, C2144c c2144c) {
        zzab.zzf(status, c2144c, this.zza);
    }
}
