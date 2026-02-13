package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class Q extends com.google.android.gms.common.api.u implements com.google.android.gms.common.api.s {

    /* renamed from: a, reason: collision with root package name */
    public Q f14955a = null;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14956b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f14957c;

    public Q(WeakReference weakReference) {
        com.google.android.gms.common.internal.G.h(weakReference, "GoogleApiClient reference must not be null");
        this.f14957c = weakReference;
        com.google.android.gms.common.api.o oVar = (com.google.android.gms.common.api.o) weakReference.get();
        new P(this, oVar != null ? ((H) oVar).f14936b.getLooper() : Looper.getMainLooper());
    }

    public final void a(Status status) {
        synchronized (this.f14956b) {
            synchronized (this.f14956b) {
            }
        }
    }
}
