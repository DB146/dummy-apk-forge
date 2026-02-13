package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzoy {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final Task zzd;
    private final boolean zze;

    public zzoy(Context context, Executor executor, Task task, boolean z8) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z8;
    }

    public static zzoy zza(final Context context, Executor executor, boolean z8) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z8) {
            executor.execute(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.zzou
                @Override // java.lang.Runnable
                public final void run() {
                    taskCompletionSource.setResult(zzqo.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.zzov
                @Override // java.lang.Runnable
                public final void run() {
                    TaskCompletionSource.this.setResult(zzqo.zzc());
                }
            });
        }
        return new zzoy(context, executor, taskCompletionSource.getTask(), z8);
    }

    public static void zzg(int i7) {
        zzf = i7;
    }

    private final Task zzh(final int i7, long j, Exception exc, String str, Map map, String str2) {
        if (!this.zze) {
            return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.ads.interactivemedia.v3.internal.zzow
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return Boolean.valueOf(task.isSuccessful());
                }
            });
        }
        final zzr zza2 = zzv.zza();
        zza2.zza(this.zzb.getPackageName());
        zza2.zze(j);
        zza2.zzg(zzf);
        if (exc != null) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            zza2.zzf(stringWriter.toString());
            zza2.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            zza2.zzb(str2);
        }
        if (str != null) {
            zza2.zzc(str);
        }
        return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.ads.interactivemedia.v3.internal.zzox
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                zzr zzrVar = zzr.this;
                int i10 = i7;
                if (!task.isSuccessful()) {
                    return Boolean.FALSE;
                }
                zzqn zza3 = ((zzqo) task.getResult()).zza(((zzv) zzrVar.zzak()).zzav());
                zza3.zza(i10);
                zza3.zzc();
                return Boolean.TRUE;
            }
        });
    }

    public final Task zzb(int i7, String str) {
        return zzh(i7, 0L, null, null, null, str);
    }

    public final Task zzc(int i7, long j, Exception exc) {
        return zzh(i7, j, exc, null, null, null);
    }

    public final Task zzd(int i7, long j) {
        return zzh(i7, j, null, null, null, null);
    }

    public final Task zze(int i7, long j, String str) {
        return zzh(i7, j, null, null, null, str);
    }

    public final Task zzf(int i7, long j, String str, Map map) {
        return zzh(i7, j, null, str, null, null);
    }
}
