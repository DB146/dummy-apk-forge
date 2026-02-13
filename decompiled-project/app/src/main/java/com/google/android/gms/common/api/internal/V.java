package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class V extends K {

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f14962b;

    public V(int i7, TaskCompletionSource taskCompletionSource) {
        super(i7);
        this.f14962b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.W
    public final void a(Status status) {
        this.f14962b.trySetException(new com.google.android.gms.common.api.j(status));
    }

    @Override // com.google.android.gms.common.api.internal.W
    public final void b(RuntimeException runtimeException) {
        this.f14962b.trySetException(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.W
    public final void c(E e2) {
        try {
            h(e2);
        } catch (DeadObjectException e10) {
            a(W.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(W.e(e11));
        } catch (RuntimeException e12) {
            this.f14962b.trySetException(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.W
    public final /* bridge */ /* synthetic */ void d(A a9, boolean z8) {
    }

    @Override // com.google.android.gms.common.api.internal.K
    public final boolean f(E e2) {
        A3.c.p(e2.f14922f.get(null));
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.K
    public final F5.d[] g(E e2) {
        A3.c.p(e2.f14922f.get(null));
        return null;
    }

    public final void h(E e2) {
        A3.c.p(e2.f14922f.remove(null));
        this.f14962b.trySetResult(Boolean.FALSE);
    }
}
