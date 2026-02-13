package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.TaskCompletionSource;
import z5.C2596a;

/* loaded from: classes.dex */
final class zby extends zbh {
    final /* synthetic */ TaskCompletionSource zba;

    public zby(zbz zbzVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbi
    public final void zbb(Status status, C2596a c2596a) {
        if (status.t()) {
            this.zba.setResult(c2596a);
        } else {
            this.zba.setException(G.l(status));
        }
    }
}
