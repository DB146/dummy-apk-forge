package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0982x {
    private final F5.d[] zaa;
    private final boolean zab;
    private final int zac;

    public AbstractC0982x(F5.d[] dVarArr, boolean z8, int i7) {
        this.zaa = dVarArr;
        boolean z10 = false;
        if (dVarArr != null && z8) {
            z10 = true;
        }
        this.zab = z10;
        this.zac = i7;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.internal.w, java.lang.Object] */
    public static <A extends com.google.android.gms.common.api.b, ResultT> C0981w builder() {
        ?? obj = new Object();
        obj.f15004b = true;
        obj.f15006d = 0;
        return obj;
    }

    public abstract void doExecute(com.google.android.gms.common.api.b bVar, TaskCompletionSource taskCompletionSource);

    public boolean shouldAutoResolveMissingFeatures() {
        return this.zab;
    }

    public final int zaa() {
        return this.zac;
    }

    public final F5.d[] zab() {
        return this.zaa;
    }
}
