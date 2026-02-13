package com.google.android.gms.common.api.internal;

import Y5.C0660y;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* loaded from: classes.dex */
public final class U extends K {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0982x f14959b;

    /* renamed from: c, reason: collision with root package name */
    public final TaskCompletionSource f14960c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0979u f14961d;

    public U(int i7, AbstractC0982x abstractC0982x, TaskCompletionSource taskCompletionSource, InterfaceC0979u interfaceC0979u) {
        super(i7);
        this.f14960c = taskCompletionSource;
        this.f14959b = abstractC0982x;
        this.f14961d = interfaceC0979u;
        if (i7 == 2 && abstractC0982x.shouldAutoResolveMissingFeatures()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.W
    public final void a(Status status) {
        ((C0660y) this.f14961d).getClass();
        this.f14960c.trySetException(com.google.android.gms.common.internal.G.l(status));
    }

    @Override // com.google.android.gms.common.api.internal.W
    public final void b(RuntimeException runtimeException) {
        this.f14960c.trySetException(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.W
    public final void c(E e2) {
        TaskCompletionSource taskCompletionSource = this.f14960c;
        try {
            this.f14959b.doExecute(e2.f14918b, taskCompletionSource);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(W.e(e11));
        } catch (RuntimeException e12) {
            taskCompletionSource.trySetException(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.W
    public final void d(A a9, boolean z8) {
        Boolean valueOf = Boolean.valueOf(z8);
        Map map = (Map) a9.f14906b;
        TaskCompletionSource taskCompletionSource = this.f14960c;
        map.put(taskCompletionSource, valueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new A(a9, taskCompletionSource));
    }

    @Override // com.google.android.gms.common.api.internal.K
    public final boolean f(E e2) {
        return this.f14959b.shouldAutoResolveMissingFeatures();
    }

    @Override // com.google.android.gms.common.api.internal.K
    public final F5.d[] g(E e2) {
        return this.f14959b.zab();
    }
}
