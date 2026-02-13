package com.google.android.gms.common.internal;

import Y5.C0662z;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class x implements com.google.android.gms.common.api.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f15121a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15122b;

    public x(BasePendingResult basePendingResult, TaskCompletionSource taskCompletionSource, C0662z c0662z) {
        this.f15121a = basePendingResult;
        this.f15122b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.p
    public final void a(Status status) {
        boolean t5 = status.t();
        TaskCompletionSource taskCompletionSource = this.f15122b;
        if (!t5) {
            taskCompletionSource.setException(G.l(status));
            return;
        }
        this.f15121a.await(0L, TimeUnit.MILLISECONDS);
        taskCompletionSource.setResult(null);
    }
}
