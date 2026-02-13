package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.internal.zzub;
import y.S;

/* loaded from: classes.dex */
final class zzvu extends zzub.zzi implements Runnable {
    private final Runnable zza;

    public zzvu(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Error | RuntimeException e2) {
            zzd(e2);
            throw e2;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzub
    public final String zza() {
        return S.b("task=[", this.zza.toString(), "]");
    }
}
