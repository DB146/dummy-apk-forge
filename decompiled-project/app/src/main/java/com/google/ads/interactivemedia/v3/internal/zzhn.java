package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final /* synthetic */ class zzhn implements Continuation {
    public final /* synthetic */ zzhu zza;

    public /* synthetic */ zzhn(zzhu zzhuVar) {
        this.zza = zzhuVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return zzhu.zza(this.zza, task);
    }
}
