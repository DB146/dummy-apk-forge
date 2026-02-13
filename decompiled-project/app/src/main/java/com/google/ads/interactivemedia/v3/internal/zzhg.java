package com.google.ads.interactivemedia.v3.internal;

import U9.j;
import android.content.Context;
import android.os.Build;
import com.google.ads.interactivemedia.pal.PlatformSignalCollector;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzhg {
    private final Context zza;
    private final ExecutorService zzb;
    private final PlatformSignalCollector zzc;
    private final zzhc zzd;
    private final TaskCompletionSource zze;

    public zzhg(Context context, ExecutorService executorService, zzhc zzhcVar, TestingConfiguration testingConfiguration) {
        j jVar = null;
        if (Build.VERSION.SDK_INT >= 26 && zzgq.zzb(context, testingConfiguration)) {
            jVar = new j(8);
            new com.google.android.gms.internal.atv_ads_framework.zzd();
        }
        this.zze = new TaskCompletionSource();
        this.zza = context;
        this.zzb = executorService;
        this.zzd = zzhcVar;
        this.zzc = jVar;
    }

    public final Task zza() {
        return this.zze.getTask();
    }

    public final void zzb(Integer num) {
        PlatformSignalCollector platformSignalCollector = this.zzc;
        if (platformSignalCollector == null || num == null) {
            this.zze.setResult(null);
            return;
        }
        Task withTimeout = Tasks.withTimeout(platformSignalCollector.collectSignals(this.zza, this.zzb), num.intValue(), TimeUnit.MILLISECONDS);
        final TaskCompletionSource taskCompletionSource = this.zze;
        withTimeout.addOnSuccessListener(new OnSuccessListener() { // from class: com.google.ads.interactivemedia.v3.internal.zzhe
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                TaskCompletionSource.this.setResult((Map) obj);
            }
        });
        withTimeout.addOnFailureListener(new OnFailureListener() { // from class: com.google.ads.interactivemedia.v3.internal.zzhf
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzhg.this.zzc(exc);
            }
        });
    }

    public final /* synthetic */ void zzc(Exception exc) {
        this.zzd.zzb(com.google.ads.interactivemedia.v3.impl.data.zzbe.PLATFORM_SIGNAL_COLLECTOR, com.google.ads.interactivemedia.v3.impl.data.zzbf.PLATFORM_COLLECT_SIGNALS, exc);
        this.zze.setException(exc);
    }
}
