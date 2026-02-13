package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public final class zzhc {
    private final Queue zza;
    private final zzfr zzb;
    private int zzc;
    private final zzhw zzd;

    public zzhc(zzfr zzfrVar) {
        zzhw zzhwVar = new zzhw();
        this.zza = new ConcurrentLinkedQueue();
        this.zzc = 1;
        this.zzd = zzhwVar;
        this.zzb = zzfrVar;
    }

    private final void zze(com.google.ads.interactivemedia.v3.impl.data.zzbg zzbgVar) {
        zzff zzffVar = new zzff(zzfd.adsLoader, zzfe.nativeInstrumentation, "*", zzbgVar);
        int i7 = this.zzc;
        int i10 = i7 - 1;
        if (i7 == 0) {
            throw null;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                return;
            }
            this.zzb.zzp(zzffVar);
        } else if (this.zza.size() > 2) {
            this.zzc = 3;
        } else {
            this.zza.add(zzffVar);
        }
    }

    public final void zza(AdErrorEvent adErrorEvent) {
        zze(com.google.ads.interactivemedia.v3.impl.data.zzbg.create(System.currentTimeMillis(), adErrorEvent));
    }

    public final void zzb(com.google.ads.interactivemedia.v3.impl.data.zzbe zzbeVar, com.google.ads.interactivemedia.v3.impl.data.zzbf zzbfVar, Exception exc) {
        zze(com.google.ads.interactivemedia.v3.impl.data.zzbg.create(System.currentTimeMillis(), zzbeVar, zzbfVar, exc));
    }

    public final void zzc(final zzvq zzvqVar, zzvr zzvrVar, final com.google.ads.interactivemedia.v3.impl.data.zzbe zzbeVar, final com.google.ads.interactivemedia.v3.impl.data.zzbf zzbfVar) {
        zzvqVar.zzm(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.zzhb
            @Override // java.lang.Runnable
            public final void run() {
                zzhc zzhcVar = zzhc.this;
                zzvq zzvqVar2 = zzvqVar;
                com.google.ads.interactivemedia.v3.impl.data.zzbe zzbeVar2 = zzbeVar;
                com.google.ads.interactivemedia.v3.impl.data.zzbf zzbfVar2 = zzbfVar;
                try {
                    zzvd.zzb(zzvqVar2, Exception.class);
                } catch (Exception e2) {
                    zzhd.zzb("Exception in " + String.valueOf(zzbeVar2) + "." + String.valueOf(zzbfVar2), e2);
                    zzhcVar.zzb(zzbeVar2, zzbfVar2, e2);
                }
            }
        }, zzvrVar);
    }

    public final void zzd(boolean z8) {
        if (!z8) {
            this.zzc = 3;
            this.zza.clear();
            return;
        }
        this.zzc = 2;
        zzff zzffVar = (zzff) this.zza.poll();
        while (zzffVar != null) {
            this.zzb.zzp(zzffVar);
            zzffVar = (zzff) this.zza.poll();
        }
    }
}
