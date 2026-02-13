package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class O extends AbstractC0982x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0981w f14953a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(C0981w c0981w, F5.d[] dVarArr, boolean z8, int i7) {
        super(dVarArr, z8, i7);
        this.f14953a = c0981w;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0982x
    public final void doExecute(com.google.android.gms.common.api.b bVar, TaskCompletionSource taskCompletionSource) {
        this.f14953a.f15003a.accept(bVar, taskCompletionSource);
    }
}
