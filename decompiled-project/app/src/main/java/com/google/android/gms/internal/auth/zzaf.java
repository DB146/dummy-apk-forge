package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class zzaf extends zzah {
    final /* synthetic */ zzag zza;

    public zzaf(zzag zzagVar) {
        this.zza = zzagVar;
    }

    @Override // com.google.android.gms.internal.auth.zzah, w5.InterfaceC2220c
    public final void zzc(boolean z8) {
        this.zza.setResult((zzag) new zzak(z8 ? Status.f14892e : zzal.zza));
    }
}
