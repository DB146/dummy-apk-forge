package com.google.ads.interactivemedia.pal;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.pal.zzfm;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
final class zzas implements Continuation {
    final /* synthetic */ NonceManager zza;

    public zzas(NonceManager nonceManager) {
        this.zza = nonceManager;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ Object then(Task task) {
        Context context;
        Activity zza = NonceManager.zza(this.zza);
        zzfm zzfmVar = (zzfm) task.getResult();
        context = this.zza.zzd;
        return zzfmVar.zzc(context, null, zza);
    }
}
