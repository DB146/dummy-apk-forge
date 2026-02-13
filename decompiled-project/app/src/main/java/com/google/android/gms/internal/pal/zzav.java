package com.google.android.gms.internal.pal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class zzav extends zzbg {
    private final com.google.ads.interactivemedia.pal.zzx zza;
    private final Task zzb;
    private final Context zzc;

    public zzav(Handler handler, ExecutorService executorService, Context context, Task task, com.google.ads.interactivemedia.pal.zzx zzxVar) {
        super(handler, executorService, zzagc.zzb(2L));
        this.zzc = context;
        this.zzb = task;
        this.zza = zzxVar;
    }

    @Override // com.google.android.gms.internal.pal.zzbg
    public final zzil zza() {
        try {
            return zzil.zzf(((zzfm) Tasks.await(this.zzb)).zzb(this.zzc, null));
        } catch (RemoteException | InterruptedException | ExecutionException unused) {
            Log.e("NonceGenerator", "Unexpected exception while gathering request signals.");
            this.zza.zza(1);
            return zzil.zze();
        }
    }
}
