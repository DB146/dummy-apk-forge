package com.google.android.gms.internal.p001authapiphone;

import c2.q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractBinderC0968i;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzu extends AbstractBinderC0968i {
    final /* synthetic */ TaskCompletionSource zza;

    public zzu(zzv zzvVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0969j
    public final void onResult(Status status) {
        if (status.f14897a == 6) {
            this.zza.trySetException(G.l(status));
        } else {
            q.A(status, null, this.zza);
        }
    }
}
