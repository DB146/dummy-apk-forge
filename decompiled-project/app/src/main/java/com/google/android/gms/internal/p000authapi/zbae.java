package com.google.android.gms.internal.p000authapi;

import c2.q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import z5.m;

/* loaded from: classes.dex */
final class zbae extends zbt {
    final /* synthetic */ TaskCompletionSource zba;

    public zbae(zbaf zbafVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbu
    public final void zbb(Status status, m mVar) {
        q.A(status, mVar, this.zba);
    }
}
