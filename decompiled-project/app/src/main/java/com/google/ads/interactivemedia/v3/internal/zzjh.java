package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzjh implements Runnable {
    final /* synthetic */ zzji zza;

    public zzjh(zzji zzjiVar) {
        this.zza = zzjiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z8;
        zzoy zzoyVar;
        Object obj2;
        obj = this.zza.zzo;
        synchronized (obj) {
            z8 = this.zza.zzp;
            if (z8) {
                return;
            }
            this.zza.zzp = true;
            try {
                zzji.zzj(this.zza);
            } catch (Exception e2) {
                zzoyVar = this.zza.zzh;
                zzoyVar.zzc(2023, -1L, e2);
            }
            obj2 = this.zza.zzo;
            synchronized (obj2) {
                this.zza.zzp = false;
            }
        }
    }
}
