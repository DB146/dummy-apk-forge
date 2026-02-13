package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzur extends zzui {
    private zzuq zza;

    public zzur(zzsk zzskVar, boolean z8, Executor executor, Callable callable) {
        super(zzskVar, false, false);
        this.zza = new zzup(this, callable, executor);
        zzq();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzub
    public final void zzn() {
        zzuq zzuqVar = this.zza;
        if (zzuqVar != null) {
            zzuqVar.zzh();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzui
    public final void zzp() {
        zzuq zzuqVar = this.zza;
        if (zzuqVar != null) {
            zzuqVar.zzf();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzui
    public final void zzr(int i7) {
        super.zzr(i7);
        if (i7 == 1) {
            this.zza = null;
        }
    }
}
