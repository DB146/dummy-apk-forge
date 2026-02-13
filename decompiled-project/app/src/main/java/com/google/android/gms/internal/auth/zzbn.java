package com.google.android.gms.internal.auth;

import c2.q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzbn extends zzbd {
    final /* synthetic */ TaskCompletionSource zza;

    public zzbn(zzbo zzboVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    public final void zzc(String str) {
        q.A(str != null ? Status.f14892e : new Status(3006, null, null, null), str, this.zza);
    }
}
