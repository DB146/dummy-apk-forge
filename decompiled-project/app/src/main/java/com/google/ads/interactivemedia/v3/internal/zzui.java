package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Future;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzui extends zzuo {
    private static final Logger zza = Logger.getLogger(zzui.class.getName());
    private zzsk zzc;

    public zzui(zzsk zzskVar, boolean z8, boolean z10) {
        super(zzskVar.size());
        this.zzc = zzskVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzub
    public final String zza() {
        zzsk zzskVar = this.zzc;
        return zzskVar != null ? "futures=".concat(zzskVar.toString()) : super.zza();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzub
    public final void zzb() {
        zzsk zzskVar = this.zzc;
        zzr(1);
        if ((zzskVar != null) && isCancelled()) {
            boolean zzo = zzo();
            zztx listIterator = ((zzso) zzskVar).listIterator(0);
            while (listIterator.hasNext()) {
                ((Future) listIterator.next()).cancel(zzo);
            }
        }
    }

    public abstract void zzp();

    public final void zzq() {
        zzsk zzskVar = this.zzc;
        zzskVar.getClass();
        if (zzskVar.isEmpty()) {
            zzp();
            return;
        }
        final zzsk zzskVar2 = null;
        Runnable runnable = new Runnable(zzskVar2) { // from class: com.google.ads.interactivemedia.v3.internal.zzuh
            @Override // java.lang.Runnable
            public final void run() {
                zzui zzuiVar = zzui.this;
                int zzt = zzuiVar.zzt();
                zzrm.zzh(zzt >= 0, "Less than 0 remaining futures");
                if (zzt == 0) {
                    zzuiVar.zzv();
                    zzuiVar.zzp();
                    zzuiVar.zzr(2);
                }
            }
        };
        zztx listIterator = ((zzso) this.zzc).listIterator(0);
        while (listIterator.hasNext()) {
            ((zzvq) listIterator.next()).zzm(runnable, zzus.INSTANCE);
        }
    }

    public void zzr(int i7) {
        this.zzc = null;
    }
}
