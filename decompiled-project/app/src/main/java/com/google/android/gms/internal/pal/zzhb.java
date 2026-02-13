package com.google.android.gms.internal.pal;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzhb extends zzgs {
    final /* synthetic */ TaskCompletionSource zza;

    public zzhb(zzhc zzhcVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.pal.zzgt
    public final void zzb(int i7) {
        this.zza.trySetException(new zzgy(i7));
    }

    @Override // com.google.android.gms.internal.pal.zzgt
    public final void zzc(Bundle bundle) {
        this.zza.trySetResult(bundle.getString("newToken"));
    }
}
