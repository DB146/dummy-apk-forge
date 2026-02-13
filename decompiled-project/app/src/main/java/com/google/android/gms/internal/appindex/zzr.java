package com.google.android.gms.internal.appindex;

import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Queue;
import m7.f;

/* JADX INFO: Access modifiers changed from: package-private */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzr {
    final /* synthetic */ zzs zza;
    private final f zzb;
    private final TaskCompletionSource zzc = new TaskCompletionSource();

    public zzr(zzs zzsVar, f fVar) {
        this.zza = zzsVar;
        this.zzb = fVar;
    }

    public final Task zza() {
        return this.zzc.getTask();
    }

    public final void zzd() {
        Queue queue;
        int i7;
        l lVar;
        queue = this.zza.zzc;
        synchronized (queue) {
            i7 = this.zza.zzd;
            G.j(i7 == 0);
            this.zza.zzd = 1;
        }
        lVar = this.zza.zza;
        lVar.doWrite(new zzq(this, null)).addOnFailureListener(this.zza, new OnFailureListener() { // from class: com.google.android.gms.internal.appindex.zzn
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzr.this.zze(exc);
            }
        });
    }

    public final /* synthetic */ void zze(Exception exc) {
        Queue queue;
        Queue queue2;
        zzr zzrVar;
        Queue queue3;
        Queue queue4;
        queue = this.zza.zzc;
        synchronized (queue) {
            try {
                queue2 = this.zza.zzc;
                if (queue2.peek() == this) {
                    queue3 = this.zza.zzc;
                    queue3.remove();
                    this.zza.zzd = 0;
                    queue4 = this.zza.zzc;
                    zzrVar = (zzr) queue4.peek();
                } else {
                    zzrVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.zzc.trySetException(exc);
        if (zzrVar != null) {
            zzrVar.zzd();
        }
    }
}
