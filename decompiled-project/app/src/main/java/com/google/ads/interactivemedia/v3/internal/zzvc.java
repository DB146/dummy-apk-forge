package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzvc {
    private final zzso zza;

    public /* synthetic */ zzvc(boolean z8, zzso zzsoVar, zzvb zzvbVar) {
        this.zza = zzsoVar;
    }

    public final zzvq zza(Callable callable, Executor executor) {
        return new zzur(this.zza, false, executor, callable);
    }
}
