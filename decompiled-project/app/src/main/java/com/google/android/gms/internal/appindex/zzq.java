package com.google.android.gms.internal.appindex;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.AbstractC0982x;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import h3.o;
import java.util.Queue;
import m7.C1635a;
import m7.C1637c;
import m7.InterfaceC1639e;
import m7.f;

/* JADX INFO: Access modifiers changed from: package-private */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzq extends AbstractC0982x {
    final /* synthetic */ zzr zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzq(zzr zzrVar, zzp zzpVar) {
        super(null, false, 28901);
        this.zza = zzrVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0982x
    public final void doExecute(b bVar, TaskCompletionSource taskCompletionSource) {
        f fVar;
        Queue queue;
        Queue queue2;
        Queue queue3;
        TaskCompletionSource taskCompletionSource2;
        Queue queue4;
        int i7;
        Queue queue5;
        InterfaceC1639e interfaceC1639e = (InterfaceC1639e) ((zzv) bVar).getService();
        zzo zzoVar = new zzo(this, taskCompletionSource);
        fVar = this.zza.zzb;
        C1637c c1637c = (C1637c) interfaceC1639e;
        Parcel zza = c1637c.zza();
        zzc.zzd(zza, zzoVar);
        zzc.zzc(zza, fVar);
        Parcel zzb = c1637c.zzb(8, zza);
        C1635a c1635a = (C1635a) zzc.zza(zzb, C1635a.CREATOR);
        zzb.recycle();
        int i10 = c1635a == null ? 2 : c1635a.f20754a;
        boolean z8 = true;
        zzr zzrVar = null;
        if (i10 == 3) {
            if (zzw.zzb(4)) {
                Log.i(s5.b.APP_INDEXING_API_TAG, "Queue was full. API call will be retried.");
            }
            if (taskCompletionSource.trySetResult(null)) {
                queue4 = this.zza.zza.zzc;
                synchronized (queue4) {
                    try {
                        zzs zzsVar = this.zza.zza;
                        i7 = zzsVar.zzd;
                        if (i7 == 0) {
                            queue5 = zzsVar.zzc;
                            zzrVar = (zzr) queue5.peek();
                            G.j(zzrVar == this.zza);
                        } else {
                            zzsVar.zzd = 2;
                        }
                    } finally {
                    }
                }
            }
        } else {
            if (i10 != 1) {
                String l10 = o.l(i10, "API call failed. Status code: ");
                if (zzw.zzb(6)) {
                    Log.e(s5.b.APP_INDEXING_API_TAG, l10);
                }
                if (taskCompletionSource.trySetResult(null)) {
                    taskCompletionSource2 = this.zza.zzc;
                    taskCompletionSource2.setException(new Exception("Indexing error."));
                }
            }
            queue = this.zza.zza.zzc;
            synchronized (queue) {
                queue2 = this.zza.zza.zzc;
                if (((zzr) queue2.poll()) != this.zza) {
                    z8 = false;
                }
                G.j(z8);
                queue3 = this.zza.zza.zzc;
                zzrVar = (zzr) queue3.peek();
                this.zza.zza.zzd = 0;
            }
        }
        if (zzrVar != null) {
            zzrVar.zzd();
        }
    }
}
