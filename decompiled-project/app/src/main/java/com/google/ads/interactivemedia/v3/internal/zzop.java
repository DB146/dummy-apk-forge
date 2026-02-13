package com.google.ads.interactivemedia.v3.internal;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzop extends zzob {
    final /* synthetic */ TaskCompletionSource zza;

    public zzop(zzor zzorVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzoc
    public final void zzb(int i7) {
        this.zza.trySetException(new zzol(i7));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzoc
    public final void zzc(Bundle bundle) {
        this.zza.trySetResult(bundle.getString("newToken"));
    }
}
