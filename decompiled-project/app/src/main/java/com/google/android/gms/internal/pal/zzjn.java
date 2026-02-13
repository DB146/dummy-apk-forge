package com.google.android.gms.internal.pal;

import X.c;
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
public abstract class zzjn<V> extends zzjs implements zzjq<V> {
    static final boolean zza;
    private static final Logger zzb;
    private static final zza zzc;
    private static final Object zzd;
    private volatile zzd listeners;
    private volatile Object value;
    private volatile zzk waiters;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public abstract class zza {
        public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
        }

        public abstract zzd zza(zzjn zzjnVar, zzd zzdVar);

        public abstract zzk zzb(zzjn zzjnVar, zzk zzkVar);

        public abstract void zzc(zzk zzkVar, zzk zzkVar2);

        public abstract void zzd(zzk zzkVar, Thread thread);

        public abstract boolean zze(zzjn zzjnVar, Object obj, Object obj2);

        public abstract boolean zzf(zzjn zzjnVar, zzk zzkVar, zzk zzkVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class zzb {
        static final zzb zza;
        static final zzb zzb;
        final boolean zzc;
        final Throwable zzd;

        static {
            if (zzjn.zza) {
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
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.pal.zzjn.zzc.1
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
        final Runnable zzb = null;
        final Executor zzc = null;
    }

    /* loaded from: classes.dex */
    final class zze extends zza {
        final AtomicReferenceFieldUpdater<zzk, Thread> zza;
        final AtomicReferenceFieldUpdater<zzk, zzk> zzb;
        final AtomicReferenceFieldUpdater<zzjn, zzk> zzc;
        final AtomicReferenceFieldUpdater<zzjn, zzd> zzd;
        final AtomicReferenceFieldUpdater<zzjn, Object> zze;

        public zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super(null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.android.gms.internal.pal.zzjn.zza
        public final zzd zza(zzjn zzjnVar, zzd zzdVar) {
            return this.zzd.getAndSet(zzjnVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.pal.zzjn.zza
        public final zzk zzb(zzjn zzjnVar, zzk zzkVar) {
            return this.zzc.getAndSet(zzjnVar, zzkVar);
        }

        @Override // com.google.android.gms.internal.pal.zzjn.zza
        public final void zzc(zzk zzkVar, zzk zzkVar2) {
            this.zzb.lazySet(zzkVar, zzkVar2);
        }

        @Override // com.google.android.gms.internal.pal.zzjn.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            this.zza.lazySet(zzkVar, thread);
        }

        @Override // com.google.android.gms.internal.pal.zzjn.zza
        public final boolean zze(zzjn zzjnVar, Object obj, Object obj2) {
            return zzjo.zza(this.zze, zzjnVar, obj, obj2);
        }

        @Override // com.google.android.gms.internal.pal.zzjn.zza
        public final boolean zzf(zzjn zzjnVar, zzk zzkVar, zzk zzkVar2) {
            return zzjo.zza(this.zzc, zzjnVar, zzkVar, zzkVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class zzf<V> implements Runnable {
        final zzjn<V> zza;
        final zzjq<? extends V> zzb;

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

        public /* synthetic */ zzg(AnonymousClass1 anonymousClass1) {
            super(null);
        }

        @Override // com.google.android.gms.internal.pal.zzjn.zza
        public final zzd zza(zzjn zzjnVar, zzd zzdVar) {
            zzd zzdVar2;
            synchronized (zzjnVar) {
                try {
                    zzdVar2 = zzjnVar.listeners;
                    if (zzdVar2 != zzdVar) {
                        zzjnVar.listeners = zzdVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.pal.zzjn.zza
        public final zzk zzb(zzjn zzjnVar, zzk zzkVar) {
            zzk zzkVar2;
            synchronized (zzjnVar) {
                try {
                    zzkVar2 = zzjnVar.waiters;
                    if (zzkVar2 != zzkVar) {
                        zzjnVar.waiters = zzkVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.pal.zzjn.zza
        public final void zzc(zzk zzkVar, zzk zzkVar2) {
            zzkVar.next = zzkVar2;
        }

        @Override // com.google.android.gms.internal.pal.zzjn.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            zzkVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.pal.zzjn.zza
        public final boolean zze(zzjn zzjnVar, Object obj, Object obj2) {
            synchronized (zzjnVar) {
                try {
                    if (zzjnVar.value != obj) {
                        return false;
                    }
                    zzjnVar.value = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.android.gms.internal.pal.zzjn.zza
        public final boolean zzf(zzjn zzjnVar, zzk zzkVar, zzk zzkVar2) {
            synchronized (zzjnVar) {
                try {
                    if (zzjnVar.waiters != zzkVar) {
                        return false;
                    }
                    zzjnVar.waiters = zzkVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface zzh<V> extends zzjq<V> {
    }

    /* loaded from: classes.dex */
    abstract class zzi<V> extends zzjn<V> implements zzh<V> {
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
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.android.gms.internal.pal.zzjn.zzj.1
                    public static final Unsafe zza() {
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }

                    @Override // java.security.PrivilegedExceptionAction
                    public final /* bridge */ /* synthetic */ Unsafe run() {
                        return zza();
                    }
                });
            }
            try {
                zzc = unsafe.objectFieldOffset(zzjn.class.getDeclaredField("waiters"));
                zzb = unsafe.objectFieldOffset(zzjn.class.getDeclaredField("listeners"));
                zzd = unsafe.objectFieldOffset(zzjn.class.getDeclaredField("value"));
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

        public /* synthetic */ zzj(AnonymousClass1 anonymousClass1) {
            super(null);
        }

        @Override // com.google.android.gms.internal.pal.zzjn.zza
        public final zzd zza(zzjn zzjnVar, zzd zzdVar) {
            zzd zzdVar2;
            do {
                zzdVar2 = zzjnVar.listeners;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zzjp.zza(zza, zzjnVar, zzb, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.pal.zzjn.zza
        public final zzk zzb(zzjn zzjnVar, zzk zzkVar) {
            zzk zzkVar2;
            do {
                zzkVar2 = zzjnVar.waiters;
                if (zzkVar == zzkVar2) {
                    return zzkVar2;
                }
            } while (!zzf(zzjnVar, zzkVar2, zzkVar));
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.pal.zzjn.zza
        public final void zzc(zzk zzkVar, zzk zzkVar2) {
            zza.putObject(zzkVar, zzf, zzkVar2);
        }

        @Override // com.google.android.gms.internal.pal.zzjn.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            zza.putObject(zzkVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.pal.zzjn.zza
        public final boolean zze(zzjn zzjnVar, Object obj, Object obj2) {
            return zzjp.zza(zza, zzjnVar, zzd, obj, obj2);
        }

        @Override // com.google.android.gms.internal.pal.zzjn.zza
        public final boolean zzf(zzjn zzjnVar, zzk zzkVar, zzk zzkVar2) {
            return zzjp.zza(zza, zzjnVar, zzc, zzkVar, zzkVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class zzk {
        static final zzk zza = new zzk(false);
        volatile zzk next;
        volatile Thread thread;

        public zzk() {
            zzjn.zzc.zzd(this, Thread.currentThread());
        }

        public zzk(boolean z8) {
        }
    }

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
        zza = z8;
        zzb = Logger.getLogger(zzjn.class.getName());
        AnonymousClass1 anonymousClass1 = null;
        try {
            zzgVar = new zzj(anonymousClass1);
            th2 = null;
            th = null;
        } catch (Error | RuntimeException e2) {
            try {
                th = null;
                th2 = e2;
                zzgVar = new zze(AtomicReferenceFieldUpdater.newUpdater(zzk.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzk.class, zzk.class, "next"), AtomicReferenceFieldUpdater.newUpdater(zzjn.class, zzk.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zzjn.class, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zzjn.class, Object.class, "value"));
            } catch (Error | RuntimeException e10) {
                th = e10;
                th2 = e2;
                zzgVar = new zzg(anonymousClass1);
            }
        }
        zzc = zzgVar;
        if (th != null) {
            Logger logger = zzb;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        zzd = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Object zzj(zzjq zzjqVar) {
        Throwable zzh2;
        if (zzjqVar instanceof zzh) {
            Object obj = ((zzjn) zzjqVar).value;
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
        if ((zzjqVar instanceof zzjs) && (zzh2 = ((zzjs) zzjqVar).zzh()) != null) {
            return new zzc(zzh2);
        }
        boolean isCancelled = zzjqVar.isCancelled();
        if ((!zza) && isCancelled) {
            zzb zzbVar2 = zzb.zzb;
            zzbVar2.getClass();
            return zzbVar2;
        }
        try {
            Object zzk2 = zzk(zzjqVar);
            if (!isCancelled) {
                return zzk2 == null ? zzd : zzk2;
            }
            return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + zzjqVar));
        } catch (Error e2) {
            e = e2;
            return new zzc(e);
        } catch (CancellationException e10) {
            if (isCancelled) {
                return new zzb(false, e10);
            }
            zzjqVar.toString();
            return new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(zzjqVar)), e10));
        } catch (RuntimeException e11) {
            e = e11;
            return new zzc(e);
        } catch (ExecutionException e12) {
            if (!isCancelled) {
                return new zzc(e12.getCause());
            }
            zzjqVar.toString();
            return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzjqVar)), e12));
        }
    }

    private static Object zzk(Future future) {
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

    private final void zzl(StringBuilder sb2) {
        try {
            Object zzk2 = zzk(this);
            sb2.append("SUCCESS, result=[");
            if (zzk2 == null) {
                sb2.append("null");
            } else if (zzk2 == this) {
                sb2.append("this future");
            } else {
                sb2.append(zzk2.getClass().getName());
                sb2.append("@");
                sb2.append(Integer.toHexString(System.identityHashCode(zzk2)));
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzm(StringBuilder sb2) {
        String concat;
        String str;
        int length = sb2.length();
        sb2.append("PENDING");
        Object obj = this.value;
        if (obj instanceof zzf) {
            sb2.append(", setFuture=[");
            zzn(sb2, ((zzf) obj).zzb);
            sb2.append("]");
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
                concat = zzir.zza(str);
            } catch (RuntimeException e2) {
                e = e2;
                Class<?> cls = e.getClass();
                cls.toString();
                concat = "Exception thrown from implementation: ".concat(String.valueOf(cls));
                if (concat != null) {
                }
                if (isDone()) {
                }
            } catch (StackOverflowError e10) {
                e = e10;
                Class<?> cls2 = e.getClass();
                cls2.toString();
                concat = "Exception thrown from implementation: ".concat(String.valueOf(cls2));
                if (concat != null) {
                }
                if (isDone()) {
                }
            }
            if (concat != null) {
                sb2.append(", info=[");
                sb2.append(concat);
                sb2.append("]");
            }
        }
        if (isDone()) {
            sb2.delete(length, sb2.length());
            zzl(sb2);
        }
    }

    private final void zzn(StringBuilder sb2, Object obj) {
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

    private static void zzo(zzjn zzjnVar) {
        zzd zzdVar = null;
        while (true) {
            for (zzk zzb2 = zzc.zzb(zzjnVar, zzk.zza); zzb2 != null; zzb2 = zzb2.next) {
                Thread thread = zzb2.thread;
                if (thread != null) {
                    zzb2.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            zzd zzdVar2 = zzdVar;
            zzd zza2 = zzc.zza(zzjnVar, zzd.zza);
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
                    zzjnVar = zzfVar.zza;
                    if (zzjnVar.value == zzfVar) {
                        if (zzc.zze(zzjnVar, zzfVar, zzj(zzfVar.zzb))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = zzdVar3.zzc;
                    executor.getClass();
                    try {
                        executor.execute(runnable);
                    } catch (RuntimeException e2) {
                        zzb.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
                    }
                }
                zzdVar3 = zzdVar;
            }
            return;
        }
    }

    private final void zzp(zzk zzkVar) {
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
                    } else if (!zzc.zzf(this, zzkVar2, zzkVar4)) {
                        break;
                    }
                    zzkVar2 = zzkVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object zzq(Object obj) {
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
        if (!(obj == null) && !(obj instanceof zzf)) {
            return false;
        }
        if (zza) {
            zzbVar = new zzb(z8, new CancellationException("Future.cancel() was called."));
        } else {
            zzbVar = z8 ? zzb.zza : zzb.zzb;
            zzbVar.getClass();
        }
        zzjn<V> zzjnVar = this;
        boolean z10 = false;
        while (true) {
            if (zzc.zze(zzjnVar, obj, zzbVar)) {
                zzo(zzjnVar);
                if (!(obj instanceof zzf)) {
                    break;
                }
                zzjq<? extends V> zzjqVar = ((zzf) obj).zzb;
                if (!(zzjqVar instanceof zzh)) {
                    zzjqVar.cancel(z8);
                    break;
                }
                zzjnVar = (zzjn) zzjqVar;
                obj = zzjnVar.value;
                if (!(obj == null) && !(obj instanceof zzf)) {
                    break;
                }
                z10 = true;
            } else {
                obj = zzjnVar.value;
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
            return zzq(obj2);
        }
        zzk zzkVar = this.waiters;
        if (zzkVar != zzk.zza) {
            zzk zzkVar2 = new zzk();
            do {
                zza zzaVar = zzc;
                zzaVar.zzc(zzkVar2, zzkVar);
                if (zzaVar.zzf(this, zzkVar, zzkVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zzp(zzkVar2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof zzf))));
                    return zzq(obj);
                }
                zzkVar = this.waiters;
            } while (zzkVar != zzk.zza);
        }
        Object obj3 = this.value;
        obj3.getClass();
        return zzq(obj3);
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
            return zzq(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zzk zzkVar = this.waiters;
            if (zzkVar != zzk.zza) {
                zzk zzkVar2 = new zzk();
                do {
                    zza zzaVar = zzc;
                    zzaVar.zzc(zzkVar2, zzkVar);
                    if (zzaVar.zzf(this, zzkVar, zzkVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                zzp(zzkVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof zzf))) {
                                return zzq(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        zzp(zzkVar2);
                    } else {
                        zzkVar = this.waiters;
                    }
                } while (zzkVar != zzk.zza);
            }
            Object obj3 = this.value;
            obj3.getClass();
            return zzq(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.value;
            if ((obj4 != null) && (!(obj4 instanceof zzf))) {
                return zzq(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String zzjnVar = toString();
        String obj5 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj5.toLowerCase(locale);
        StringBuilder l10 = c.l(j, "Waited ", " ");
        l10.append(timeUnit.toString().toLowerCase(locale));
        String sb2 = l10.toString();
        if (nanos + 1000 < 0) {
            String concat = sb2.concat(" (plus ");
            long j10 = -nanos;
            long convert = timeUnit.convert(j10, TimeUnit.NANOSECONDS);
            long nanos2 = j10 - timeUnit.toNanos(convert);
            if (convert != 0 && nanos2 <= 1000) {
                z8 = false;
            }
            if (convert > 0) {
                String str = concat + convert + " " + lowerCase;
                if (z8) {
                    str = str.concat(",");
                }
                concat = str.concat(" ");
            }
            if (z8) {
                concat = concat + nanos2 + " nanoseconds ";
            }
            sb2 = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(sb2.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(c.i(sb2, " for ", zzjnVar));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof zzb;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof zzf)) & (this.value != null);
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
            zzl(sb2);
        } else {
            zzm(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.pal.zzjs
    public final Throwable zzh() {
        if (!(this instanceof zzh)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    public boolean zzi(Object obj) {
        if (obj == null) {
            obj = zzd;
        }
        if (!zzc.zze(this, null, obj)) {
            return false;
        }
        zzo(this);
        return true;
    }
}
