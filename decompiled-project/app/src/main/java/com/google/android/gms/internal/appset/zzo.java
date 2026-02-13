package com.google.android.gms.internal.appset;

import c2.q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import u5.C2110b;
import u5.C2112d;

/* loaded from: classes.dex */
final class zzo extends zze {
    final /* synthetic */ TaskCompletionSource zza;

    public zzo(zzp zzpVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.appset.zzf
    public final void zzb(Status status, C2112d c2112d) {
        q.A(status, c2112d != null ? new C2110b(c2112d.f24873a, c2112d.f24874b) : null, this.zza);
    }
}
