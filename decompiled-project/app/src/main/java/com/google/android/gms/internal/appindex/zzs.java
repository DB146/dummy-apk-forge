package com.google.android.gms.internal.appindex;

import android.os.Handler;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import m7.f;

/* JADX INFO: Access modifiers changed from: package-private */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzs implements OnCompleteListener, Executor {
    private final l zza;
    private final Handler zzb;
    private final Queue zzc = new ArrayDeque();
    private int zzd = 0;

    public zzs(l lVar) {
        this.zza = lVar;
        this.zzb = new zzad(lVar.getLooper());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zzb.post(runnable);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        zzr zzrVar;
        synchronized (this.zzc) {
            try {
                if (this.zzd == 2) {
                    zzrVar = (zzr) this.zzc.peek();
                    G.j(zzrVar != null);
                } else {
                    zzrVar = null;
                }
                this.zzd = 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zzrVar != null) {
            zzrVar.zzd();
        }
    }

    public final Task zzc(f fVar) {
        boolean isEmpty;
        zzr zzrVar = new zzr(this, fVar);
        Task zza = zzrVar.zza();
        zza.addOnCompleteListener(this, this);
        synchronized (this.zzc) {
            isEmpty = this.zzc.isEmpty();
            this.zzc.add(zzrVar);
        }
        if (isEmpty) {
            zzrVar.zzd();
        }
        return zza;
    }
}
