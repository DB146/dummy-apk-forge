package com.google.android.gms.internal.appindex;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.AbstractC0982x;
import com.google.android.gms.common.api.internal.InterfaceC0964e;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
@VisibleForTesting
/* loaded from: classes.dex */
public abstract class zzaa extends AbstractC0982x implements InterfaceC0964e {
    protected TaskCompletionSource zzb;

    public zzaa() {
        super(null, false, 28902);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0982x
    public final /* bridge */ /* synthetic */ void doExecute(b bVar, TaskCompletionSource taskCompletionSource) {
        zzf zzfVar = (zzf) ((zzj) bVar).getService();
        this.zzb = taskCompletionSource;
        zza(zzfVar);
    }

    public final void setFailedResult(Status status) {
        G.a("Failed result must not be success.", !status.t());
        String str = status.f14898b;
        if (str == null) {
            str = "";
        }
        this.zzb.setException(zzac.zza(status, str));
    }

    public abstract void zza(zzf zzfVar);

    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void setResult(Status status) {
        if (status.t()) {
            this.zzb.setResult(null);
        } else {
            this.zzb.setException(zzac.zza(status, "User Action indexing error, please try again."));
        }
    }
}
