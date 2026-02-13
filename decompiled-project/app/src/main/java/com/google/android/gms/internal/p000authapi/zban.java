package com.google.android.gms.internal.p000authapi;

import android.app.PendingIntent;
import c2.q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zban extends zbp {
    final /* synthetic */ TaskCompletionSource zba;

    public zban(zbap zbapVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbq
    public final void zbb(Status status, PendingIntent pendingIntent) {
        q.A(status, pendingIntent, this.zba);
    }
}
