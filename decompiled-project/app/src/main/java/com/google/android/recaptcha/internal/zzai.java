package com.google.android.recaptcha.internal;

import cc.E;
import cc.F;
import java.util.TimerTask;

/* loaded from: classes.dex */
public final class zzai extends TimerTask {
    final /* synthetic */ zzan zza;

    public zzai(zzan zzanVar) {
        this.zza = zzanVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        E e2;
        zzan zzanVar = this.zza;
        e2 = zzanVar.zzb;
        F.B(e2, null, 0, new zzaj(zzanVar, null), 3);
    }
}
