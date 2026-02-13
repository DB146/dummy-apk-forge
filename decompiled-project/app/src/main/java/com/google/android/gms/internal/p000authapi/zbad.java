package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.TaskCompletionSource;
import z5.k;

/* loaded from: classes.dex */
final class zbad extends zbr {
    final /* synthetic */ TaskCompletionSource zba;

    public zbad(zbaf zbafVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbs
    public final void zbb(Status status, k kVar) {
        if (status.t()) {
            this.zba.setResult(kVar);
        } else {
            this.zba.setException(G.l(status));
        }
    }
}
