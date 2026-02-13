package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzgh {
    private final List zzb = new ArrayList(1);
    private final Handler zza = new Handler(Looper.getMainLooper());

    public zzgh(long j) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        VideoProgressUpdate zza = zza();
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            ((zzgg) it.next()).zza(zza);
        }
        this.zza.postDelayed(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.zzgf
            @Override // java.lang.Runnable
            public final void run() {
                zzgh.this.zzg();
            }
        }, 200L);
    }

    public abstract VideoProgressUpdate zza();

    public final void zzc(zzgg zzggVar) {
        this.zzb.add(zzggVar);
    }

    public final void zzd(zzgg zzggVar) {
        this.zzb.remove(zzggVar);
    }

    public final void zze() {
        this.zza.removeCallbacksAndMessages(null);
        zzg();
    }

    public final void zzf() {
        this.zza.removeCallbacksAndMessages(null);
    }
}
