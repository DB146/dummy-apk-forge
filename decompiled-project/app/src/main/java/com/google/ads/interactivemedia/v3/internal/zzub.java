package com.google.ads.interactivemedia.v3.internal;

import A3.c;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class zzub<V> extends zzwb implements zzvq<V> {
    static final boolean zzb;
    private static final Logger zzba;
    private static final zza zzbb;
    private static final Object zzd;
    private volatile zzd listeners;
    private volatile Object value;
    private volatile zzk waiters;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public abstract class zza {
        public /* synthetic */ zza(zzua zzuaVar) {
        }

        public abstract zzd zza(zzub zzubVar, zzd zzdVar);

        public abstract zzk zzb(zzub zzubVar, zzk zzkVar);

        public abstract void zzc(zzk zzkVar, zzk zzkVar2);

        public abstract void zzd(zzk zzkVar, Thread thread);

        public abstract boolean zze(zzub zzubVar, zzd zzdVar, zzd zzdVar2);

        public abstract boolean zzf(zzub zzubVar, Object obj, Object obj2);

        public abstract boolean zzg(zzub zzubVar, zzk zzkVar, zzk zzkVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class zzb {
        static final zzb zza;
        static final zzb zzb;
        final boolean zzc;
        final Throwable zzd;

        static {
            if (zzub.zzb) {
                zzb = null;
                zza = null;
            } else {
                zzb = new zzb(false, null);
                zza = new zzb(true, null);
            }
        }

        public zzb(boolean z8, Throwable th) {
            this.zzc = z8;
            this.zzd = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.ads.interactivemedia.v3.internal.zzub.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        public zzc(Throwable th) {
            th.getClass();
            this.zzb = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class zzd {
        static final zzd zza = new zzd();
        zzd next;
        final Runnable zzb;
        final Executor zzc;

        public zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        public zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* loaded from: classes.dex */
    final class zze extends zza {
        final AtomicReferenceFieldUpdater<zzk, Thread> zza;
        final AtomicReferenceFieldUpdater<zzk, zzk> zzb;
        final AtomicReferenceFieldUpdater<zzub, zzk> zzc;
        final AtomicReferenceFieldUpdater<zzub, zzd> zzd;
        final AtomicReferenceFieldUpdater<zzub, Object> zze;

        public zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super(null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final zzd zza(zzub zzubVar, zzd zzdVar) {
            return this.zzd.getAndSet(zzubVar, zzdVar);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final zzk zzb(zzub zzubVar, zzk zzkVar) {
            return this.zzc.getAndSet(zzubVar, zzkVar);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final void zzc(zzk zzkVar, zzk zzkVar2) {
            this.zzb.lazySet(zzkVar, zzkVar2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            this.zza.lazySet(zzkVar, thread);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final boolean zze(zzub zzubVar, zzd zzdVar, zzd zzdVar2) {
            return zzuc.zza(this.zzd, zzubVar, zzdVar, zzdVar2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final boolean zzf(zzub zzubVar, Object obj, Object obj2) {
            return zzuc.zza(this.zze, zzubVar, obj, obj2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final boolean zzg(zzub zzubVar, zzk zzkVar, zzk zzkVar2) {
            return zzuc.zza(this.zzc, zzubVar, zzkVar, zzkVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class zzf<V> implements Runnable {
        final zzub<V> zza;
        final zzvq<? extends V> zzb;

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    final class zzg extends zza {
        private zzg() {
            super(null);
        }

        public /* synthetic */ zzg(zzud zzudVar) {
            super(null);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final zzd zza(zzub zzubVar, zzd zzdVar) {
            zzd zzdVar2;
            synchronized (zzubVar) {
                try {
                    zzdVar2 = zzubVar.listeners;
                    if (zzdVar2 != zzdVar) {
                        zzubVar.listeners = zzdVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final zzk zzb(zzub zzubVar, zzk zzkVar) {
            zzk zzkVar2;
            synchronized (zzubVar) {
                try {
                    zzkVar2 = zzubVar.waiters;
                    if (zzkVar2 != zzkVar) {
                        zzubVar.waiters = zzkVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzkVar2;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final void zzc(zzk zzkVar, zzk zzkVar2) {
            zzkVar.next = zzkVar2;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            zzkVar.thread = thread;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final boolean zze(zzub zzubVar, zzd zzdVar, zzd zzdVar2) {
            synchronized (zzubVar) {
                try {
                    if (zzubVar.listeners != zzdVar) {
                        return false;
                    }
                    zzubVar.listeners = zzdVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final boolean zzf(zzub zzubVar, Object obj, Object obj2) {
            synchronized (zzubVar) {
                try {
                    if (zzubVar.value != obj) {
                        return false;
                    }
                    zzubVar.value = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final boolean zzg(zzub zzubVar, zzk zzkVar, zzk zzkVar2) {
            synchronized (zzubVar) {
                try {
                    if (zzubVar.waiters != zzkVar) {
                        return false;
                    }
                    zzubVar.waiters = zzkVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface zzh<V> extends zzvq<V> {
    }

    /* loaded from: classes.dex */
    abstract class zzi<V> extends zzub<V> implements zzh<V> {
    }

    /* loaded from: classes.dex */
    final class zzj extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e2) {
                    throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.ads.interactivemedia.v3.internal.zzub.zzj.1
                    @Override // java.security.PrivilegedExceptionAction
                    public final /* bridge */ /* synthetic */ Unsafe run() {
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            }
            try {
                zzc = unsafe.objectFieldOffset(zzub.class.getDeclaredField("waiters"));
                zzb = unsafe.objectFieldOffset(zzub.class.getDeclaredField("listeners"));
                zzd = unsafe.objectFieldOffset(zzub.class.getDeclaredField("value"));
                zze = unsafe.objectFieldOffset(zzk.class.getDeclaredField("thread"));
                zzf = unsafe.objectFieldOffset(zzk.class.getDeclaredField("next"));
                zza = unsafe;
            } catch (NoSuchFieldException e10) {
                throw new RuntimeException(e10);
            } catch (RuntimeException e11) {
                throw e11;
            }
        }

        private zzj() {
            super(null);
        }

        public /* synthetic */ zzj(zzuf zzufVar) {
            super(null);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final zzd zza(zzub zzubVar, zzd zzdVar) {
            zzd zzdVar2;
            do {
                zzdVar2 = zzubVar.listeners;
                if (zzdVar == zzdVar2) {
                    return zzdVar2;
                }
            } while (!zze(zzubVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final zzk zzb(zzub zzubVar, zzk zzkVar) {
            zzk zzkVar2;
            do {
                zzkVar2 = zzubVar.waiters;
                if (zzkVar == zzkVar2) {
                    return zzkVar2;
                }
            } while (!zzg(zzubVar, zzkVar2, zzkVar));
            return zzkVar2;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final void zzc(zzk zzkVar, zzk zzkVar2) {
            zza.putObject(zzkVar, zzf, zzkVar2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            zza.putObject(zzkVar, zze, thread);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final boolean zze(zzub zzubVar, zzd zzdVar, zzd zzdVar2) {
            return zzue.zza(zza, zzubVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final boolean zzf(zzub zzubVar, Object obj, Object obj2) {
            return zzue.zza(zza, zzubVar, zzd, obj, obj2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final boolean zzg(zzub zzubVar, zzk zzkVar, zzk zzkVar2) {
            return zzue.zza(zza, zzubVar, zzc, zzkVar, zzkVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class zzk {
        static final zzk zza = new zzk(false);
        volatile zzk next;
        volatile Thread thread;

        public zzk() {
            zzub.zzbb.zzd(this, Thread.currentThread());
        }

        public zzk(boolean z8) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z8;
        Throwable th;
        Throwable th2;
        zza zzgVar;
        try {
            z8 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z8 = false;
        }
        zzb = z8;
        zzba = Logger.getLogger(zzub.class.getName());
        Object[] objArr = 0;
        try {
            zzgVar = new zzj(null);
            th2 = null;
            th = null;
        } catch (Error | RuntimeException e2) {
            try {
                th = null;
                th2 = e2;
                zzgVar = new zze(AtomicReferenceFieldUpdater.newUpdater(zzk.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzk.class, zzk.class, "next"), AtomicReferenceFieldUpdater.newUpdater(zzub.class, zzk.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zzub.class, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zzub.class, Object.class, "value"));
            } catch (Error | RuntimeException e10) {
                th = e10;
                th2 = e2;
                zzgVar = new zzg(objArr == true ? 1 : 0);
            }
        }
        zzbb = zzgVar;
        if (th != null) {
            Logger logger = zzba;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        zzd = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Object zzp(zzvq zzvqVar) {
        Throwable zzi2;
        if (zzvqVar instanceof zzh) {
            Object obj = ((zzub) zzvqVar).value;
            if (obj instanceof zzb) {
                zzb zzbVar = (zzb) obj;
                if (zzbVar.zzc) {
                    Throwable th = zzbVar.zzd;
                    obj = th != null ? new zzb(false, th) : zzb.zzb;
                }
            }
            obj.getClass();
            return obj;
        }
        if ((zzvqVar instanceof zzwb) && (zzi2 = ((zzwb) zzvqVar).zzi()) != null) {
            return new zzc(zzi2);
        }
        boolean isCancelled = zzvqVar.isCancelled();
        if ((!zzb) && isCancelled) {
            zzb zzbVar2 = zzb.zzb;
            zzbVar2.getClass();
            return zzbVar2;
        }
        try {
            Object zzq = zzq(zzvqVar);
            return isCancelled ? new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzvqVar)))) : zzq == null ? zzd : zzq;
        } catch (Error e2) {
            e = e2;
            return new zzc(e);
        } catch (CancellationException e10) {
            return !isCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(zzvqVar)), e10)) : new zzb(false, e10);
        } catch (RuntimeException e11) {
            e = e11;
            return new zzc(e);
        } catch (ExecutionException e12) {
            return isCancelled ? new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzvqVar)), e12)) : new zzc(e12.getCause());
        }
    }

    private static Object zzq(Future future) {
        Object obj;
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

    private final void zzr(StringBuilder sb2) {
        try {
            Object zzq = zzq(this);
            sb2.append("SUCCESS, result=[");
            if (zzq == null) {
                sb2.append("null");
            } else if (zzq == this) {
                sb2.append("this future");
            } else {
                sb2.append(zzq.getClass().getName());
                sb2.append("@");
                sb2.append(Integer.toHexString(System.identityHashCode(zzq)));
            }
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e2.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        }
    }

    private final void zzs(StringBuilder sb2) {
        String concat;
        int length = sb2.length();
        sb2.append("PENDING");
        Object obj = this.value;
        if (obj instanceof zzf) {
            sb2.append(", setFuture=[");
            zzt(sb2, ((zzf) obj).zzb);
            sb2.append("]");
        } else {
            try {
                concat = zzro.zza(zza());
            } catch (RuntimeException | StackOverflowError e2) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e2.getClass()));
            }
            if (concat != null) {
                sb2.append(", info=[");
                sb2.append(concat);
                sb2.append("]");
            }
        }
        if (isDone()) {
            sb2.delete(length, sb2.length());
            zzr(sb2);
        }
    }

    private final void zzt(StringBuilder sb2, Object obj) {
        try {
            if (obj == this) {
                sb2.append("this future");
            } else {
                sb2.append(obj);
            }
        } catch (RuntimeException e2) {
            e = e2;
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e.getClass());
        } catch (StackOverflowError e10) {
            e = e10;
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e.getClass());
        }
    }

    private static void zzu(zzub zzubVar, boolean z8) {
        zzd zzdVar = null;
        while (true) {
            for (zzk zzb2 = zzbb.zzb(zzubVar, zzk.zza); zzb2 != null; zzb2 = zzb2.next) {
                Thread thread = zzb2.thread;
                if (thread != null) {
                    zzb2.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z8) {
                zzubVar.zzn();
            }
            zzubVar.zzb();
            zzd zzdVar2 = zzdVar;
            zzd zza2 = zzbb.zza(zzubVar, zzd.zza);
            zzd zzdVar3 = zzdVar2;
            while (zza2 != null) {
                zzd zzdVar4 = zza2.next;
                zza2.next = zzdVar3;
                zzdVar3 = zza2;
                zza2 = zzdVar4;
            }
            while (zzdVar3 != null) {
                zzdVar = zzdVar3.next;
                Runnable runnable = zzdVar3.zzb;
                runnable.getClass();
                if (runnable instanceof zzf) {
                    zzf zzfVar = (zzf) runnable;
                    zzubVar = zzfVar.zza;
                    if (zzubVar.value == zzfVar) {
                        if (zzbb.zzf(zzubVar, zzfVar, zzp(zzfVar.zzb))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = zzdVar3.zzc;
                    executor.getClass();
                    zzv(runnable, executor);
                }
                zzdVar3 = zzdVar;
            }
            return;
            z8 = false;
        }
    }

    private static void zzv(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            zzba.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", c.j("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e2);
        }
    }

    private final void zzw(zzk zzkVar) {
        zzkVar.thread = null;
        while (true) {
            zzk zzkVar2 = this.waiters;
            if (zzkVar2 != zzk.zza) {
                zzk zzkVar3 = null;
                while (zzkVar2 != null) {
                    zzk zzkVar4 = zzkVar2.next;
                    if (zzkVar2.thread != null) {
                        zzkVar3 = zzkVar2;
                    } else if (zzkVar3 != null) {
                        zzkVar3.next = zzkVar4;
                        if (zzkVar3.thread == null) {
                            break;
                        }
                    } else if (!zzbb.zzg(this, zzkVar2, zzkVar4)) {
                        break;
                    }
                    zzkVar2 = zzkVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object zzx(Object obj) {
        if (obj instanceof zzb) {
            Throwable th = ((zzb) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        }
        if (obj == zzd) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean cancel(boolean z8) {
        zzb zzbVar;
        Object obj = this.value;
        if (!(obj instanceof zzf) && !(obj == null)) {
            return false;
        }
        if (zzb) {
            zzbVar = new zzb(z8, new CancellationException("Future.cancel() was called."));
        } else {
            zzbVar = z8 ? zzb.zza : zzb.zzb;
            zzbVar.getClass();
        }
        zzub<V> zzubVar = this;
        boolean z10 = false;
        while (true) {
            if (zzbb.zzf(zzubVar, obj, zzbVar)) {
                zzu(zzubVar, z8);
                if (!(obj instanceof zzf)) {
                    break;
                }
                zzvq<? extends V> zzvqVar = ((zzf) obj).zzb;
                if (!(zzvqVar instanceof zzh)) {
                    zzvqVar.cancel(z8);
                    break;
                }
                zzubVar = (zzub) zzvqVar;
                obj = zzubVar.value;
                if (!(obj == null) && !(obj instanceof zzf)) {
                    break;
                }
                z10 = true;
            } else {
                obj = zzubVar.value;
                if (!(obj instanceof zzf)) {
                    return z10;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof zzf))) {
            return zzx(obj2);
        }
        zzk zzkVar = this.waiters;
        if (zzkVar != zzk.zza) {
            zzk zzkVar2 = new zzk();
            do {
                zza zzaVar = zzbb;
                zzaVar.zzc(zzkVar2, zzkVar);
                if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zzw(zzkVar2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof zzf))));
                    return zzx(obj);
                }
                zzkVar = this.waiters;
            } while (zzkVar != zzk.zza);
        }
        Object obj3 = this.value;
        obj3.getClass();
        return zzx(obj3);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        boolean z8 = true;
        if ((obj != null) && (!(obj instanceof zzf))) {
            return zzx(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zzk zzkVar = this.waiters;
            if (zzkVar != zzk.zza) {
                zzk zzkVar2 = new zzk();
                do {
                    zza zzaVar = zzbb;
                    zzaVar.zzc(zzkVar2, zzkVar);
                    if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                zzw(zzkVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof zzf))) {
                                return zzx(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        zzw(zzkVar2);
                    } else {
                        zzkVar = this.waiters;
                    }
                } while (zzkVar != zzk.zza);
            }
            Object obj3 = this.value;
            obj3.getClass();
            return zzx(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.value;
            if ((obj4 != null) && (!(obj4 instanceof zzf))) {
                return zzx(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String zzubVar = toString();
        String obj5 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj5.toLowerCase(locale);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String concat = str.concat(" (plus ");
            long j10 = -nanos;
            long convert = timeUnit.convert(j10, TimeUnit.NANOSECONDS);
            long nanos2 = j10 - timeUnit.toNanos(convert);
            if (convert != 0 && nanos2 <= 1000) {
                z8 = false;
            }
            if (convert > 0) {
                String str2 = concat + convert + " " + lowerCase;
                if (z8) {
                    str2 = str2.concat(",");
                }
                concat = str2.concat(" ");
            }
            if (z8) {
                concat = concat + nanos2 + " nanoseconds ";
            }
            str = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(str.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(X.c.i(str, " for ", zzubVar));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof zzb;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.value != null) & (!(r0 instanceof zzf));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (this.value instanceof zzb) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            zzr(sb2);
        } else {
            zzs(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String zza() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public void zzb() {
    }

    public boolean zzc(Object obj) {
        if (obj == null) {
            obj = zzd;
        }
        if (!zzbb.zzf(this, null, obj)) {
            return false;
        }
        zzu(this, false);
        return true;
    }

    public boolean zzd(Throwable th) {
        th.getClass();
        if (!zzbb.zzf(this, null, new zzc(th))) {
            return false;
        }
        zzu(this, false);
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwb
    public final Throwable zzi() {
        if (!(this instanceof zzh)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzvq
    public final void zzm(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzrm.zzc(runnable, "Runnable was null.");
        zzrm.zzc(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listeners) != zzd.zza) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzbb.zze(this, zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.listeners;
                }
            } while (zzdVar != zzd.zza);
        }
        zzv(runnable, executor);
    }

    public void zzn() {
    }

    public final boolean zzo() {
        Object obj = this.value;
        return (obj instanceof zzb) && ((zzb) obj).zzc;
    }
}
