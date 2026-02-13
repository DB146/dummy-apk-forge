package com.google.android.gms.internal.p000authapi;

import c2.q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import z5.g;

/* loaded from: classes.dex */
final class zbal extends zbk {
    final /* synthetic */ TaskCompletionSource zba;

    public zbal(zbap zbapVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbl
    public final void zbb(Status status, g gVar) {
        q.A(status, gVar, this.zba);
    }
}
