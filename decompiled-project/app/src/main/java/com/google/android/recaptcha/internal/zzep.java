package com.google.android.recaptcha.internal;

import cc.E;
import cc.F;
import java.util.TimerTask;

/* loaded from: classes.dex */
public final class zzep extends TimerTask {
    final /* synthetic */ zzes zza;

    public zzep(zzes zzesVar) {
        this.zza = zzesVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        E e2;
        zzes zzesVar = this.zza;
        e2 = zzesVar.zzd;
        F.B(e2, null, 0, new zzeq(zzesVar, null), 3);
    }
}
