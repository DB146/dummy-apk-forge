package com.google.android.gms.internal.pal;

import android.os.Handler;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public abstract class zzbg {
    private final ExecutorService zza;
    private final zzagc zzb;
    private final Handler zzc;
    private Task zzd = Tasks.forResult(zzil.zze());

    public zzbg(Handler handler, ExecutorService executorService, zzagc zzagcVar) {
        this.zza = executorService;
        this.zzc = handler;
        this.zzb = zzagcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzf() {
        this.zzc.removeCallbacksAndMessages(null);
        this.zzc.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.pal.zzbe
            @Override // java.lang.Runnable
            public final void run() {
                zzbg.this.zzf();
            }
        }, (this.zzb.zzd() / 1000) * 1000);
        this.zzd = Tasks.call(this.zza, new Callable() { // from class: com.google.android.gms.internal.pal.zzbf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzbg.this.zza();
            }
        });
    }

    public abstract zzil zza();

    public final Task zzb() {
        if (this.zzd.isComplete() && !this.zzd.isSuccessful()) {
            zzf();
        }
        return this.zzd;
    }

    public final void zzd() {
        zzf();
    }

    public final void zze() {
        this.zzc.removeCallbacksAndMessages(null);
    }
}
