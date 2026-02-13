package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import n7.AbstractC1712c;

/* loaded from: classes.dex */
public final class zzafh<ResultT, CallbackT> implements zzaey<ResultT> {
    private final zzaex<ResultT, CallbackT> zza;
    private final TaskCompletionSource<ResultT> zzb;

    public zzafh(zzaex<ResultT, CallbackT> zzaexVar, TaskCompletionSource<ResultT> taskCompletionSource) {
        this.zza = zzaexVar;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaey
    public final void zza(ResultT resultt, Status status) {
        G.h(this.zzb, "completion source cannot be null");
        if (status == null) {
            this.zzb.setResult(resultt);
            return;
        }
        zzaex<ResultT, CallbackT> zzaexVar = this.zza;
        if (zzaexVar.zzq != null) {
            TaskCompletionSource<ResultT> taskCompletionSource = this.zzb;
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(zzaexVar.zzc);
            zzaex<ResultT, CallbackT> zzaexVar2 = this.zza;
            taskCompletionSource.setException(zzaei.zza(firebaseAuth, zzaexVar2.zzq, ("reauthenticateWithCredential".equals(zzaexVar2.zza()) || "reauthenticateWithCredentialWithData".equals(this.zza.zza())) ? this.zza.zzd : null));
            return;
        }
        AbstractC1712c abstractC1712c = zzaexVar.zzn;
        if (abstractC1712c != null) {
            this.zzb.setException(zzaei.zza(status, abstractC1712c, zzaexVar.zzo, zzaexVar.zzp));
        } else {
            this.zzb.setException(zzaei.zza(status));
        }
    }
}
