package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class zzvd extends zzvk {
    @SafeVarargs
    public static zzvc zza(zzvq... zzvqVarArr) {
        return new zzvc(false, zzso.zzl(zzvqVarArr), null);
    }

    public static Object zzb(Future future, Class cls) {
        return zzvi.zza(zzvh.zza, future, cls);
    }

    public static Object zzc(Future future) {
        Object obj;
        if (!future.isDone()) {
            throw new IllegalStateException(zzro.zzb("Future was expected to be done: %s", future));
        }
        boolean z8 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z8 = true;
            } catch (Throwable th) {
                if (z8) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static void zzd(zzvq zzvqVar, zzuz zzuzVar, Executor executor) {
        zzuzVar.getClass();
        zzvqVar.zzm(new zzva(zzvqVar, zzuzVar), executor);
    }
}
