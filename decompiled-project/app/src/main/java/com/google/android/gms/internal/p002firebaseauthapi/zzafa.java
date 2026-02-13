package com.google.android.gms.internal.p002firebaseauthapi;

import n7.r;
import n7.t;

/* loaded from: classes.dex */
final class zzafa implements zzafe {
    private final /* synthetic */ r zza;

    public zzafa(zzaez zzaezVar, r rVar) {
        this.zza = rVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(t tVar, Object... objArr) {
        tVar.onVerificationCompleted(this.zza);
    }
}
