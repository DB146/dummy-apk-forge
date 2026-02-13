package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes.dex */
public final class T extends W {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0963d f14958b;

    public T(int i7, AbstractC0963d abstractC0963d) {
        super(i7);
        com.google.android.gms.common.internal.G.h(abstractC0963d, "Null methods are not runnable.");
        this.f14958b = abstractC0963d;
    }

    @Override // com.google.android.gms.common.api.internal.W
    public final void a(Status status) {
        try {
            this.f14958b.setFailedResult(status);
        } catch (IllegalStateException e2) {
            Log.w("ApiCallRunner", "Exception reporting failure", e2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.W
    public final void b(RuntimeException runtimeException) {
        try {
            this.f14958b.setFailedResult(new Status(10, X.c.i(runtimeException.getClass().getSimpleName(), ": ", runtimeException.getLocalizedMessage()), null, null));
        } catch (IllegalStateException e2) {
            Log.w("ApiCallRunner", "Exception reporting failure", e2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.W
    public final void c(E e2) {
        try {
            this.f14958b.run(e2.f14918b);
        } catch (RuntimeException e10) {
            b(e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.W
    public final void d(A a9, boolean z8) {
        Boolean valueOf = Boolean.valueOf(z8);
        Map map = (Map) a9.f14905a;
        AbstractC0963d abstractC0963d = this.f14958b;
        map.put(abstractC0963d, valueOf);
        abstractC0963d.addStatusListener(new C0984z(a9, abstractC0963d));
    }
}
