package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import n7.t;

/* loaded from: classes.dex */
final class zzafc implements zzafe {
    private final /* synthetic */ Status zza;

    public zzafc(zzaez zzaezVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(t tVar, Object... objArr) {
        tVar.onVerificationFailed(zzaei.zza(this.zza));
    }
}
