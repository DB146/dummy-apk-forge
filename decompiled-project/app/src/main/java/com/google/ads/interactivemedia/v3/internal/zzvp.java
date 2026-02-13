package com.google.ads.interactivemedia.v3.internal;

import X.c;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import y.S;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzvp extends AtomicReference implements Runnable {
    private static final Runnable zza = new zzvo(null);
    private static final Runnable zzb = new zzvo(null);

    private final void zzc(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzvm zzvmVar = null;
        boolean z8 = false;
        int i7 = 0;
        while (true) {
            if (!(runnable instanceof zzvm)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzvmVar = (zzvm) runnable;
            }
            i7++;
            if (i7 > 1000) {
                Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z8 = Thread.interrupted() || z8;
                    LockSupport.park(zzvmVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z8) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean zzg = zzg();
            if (!zzg) {
                try {
                    obj = zza();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, zza)) {
                            zzc(currentThread);
                        }
                        zzd(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, zza)) {
                            zzc(currentThread);
                        }
                        zze(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, zza)) {
                zzc(currentThread);
            }
            if (zzg) {
                return;
            }
            zze(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        Runnable runnable = (Runnable) get();
        return c.i(runnable == zza ? "running=[DONE]" : runnable instanceof zzvm ? "running=[INTERRUPTED]" : runnable instanceof Thread ? S.b("running=[RUNNING ON ", ((Thread) runnable).getName(), "]") : "running=[NOT STARTED YET]", ", ", zzb());
    }

    public abstract Object zza();

    public abstract String zzb();

    public abstract void zzd(Throwable th);

    public abstract void zze(Object obj);

    public abstract boolean zzg();

    public final void zzh() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzvm zzvmVar = new zzvm(this, null);
            zzvmVar.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, zzvmVar)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }
}
