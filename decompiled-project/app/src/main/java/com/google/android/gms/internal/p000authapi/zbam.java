package com.google.android.gms.internal.p000authapi;

import c2.q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractBinderC0968i;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zbam extends AbstractBinderC0968i {
    final /* synthetic */ TaskCompletionSource zba;

    public zbam(zbap zbapVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0969j
    public final void onResult(Status status) {
        q.A(status, null, this.zba);
    }
}
