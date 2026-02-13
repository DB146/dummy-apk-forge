package com.google.android.gms.internal.p002firebaseauthapi;

import Y6.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.TaskCompletionSource;
import n7.AbstractC1712c;
import o7.C1815e;
import o7.v;

/* loaded from: classes.dex */
final class zzacx extends zzaex<Void, v> {
    private final zzait zzu;

    public zzacx(AbstractC1712c abstractC1712c, String str) {
        super(2);
        G.h(abstractC1712c, "credential cannot be null");
        this.zzu = b.A(abstractC1712c, str).zza(false);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "reauthenticateWithCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zza(this.zzu, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
        C1815e zza = zzach.zza(this.zzc, this.zzk);
        if (!((C1815e) this.zzd).f22070b.f22060a.equalsIgnoreCase(zza.f22070b.f22060a)) {
            zza(new Status(17024, null, null, null));
        } else {
            ((v) this.zze).a(this.zzj, zza);
            zzb(null);
        }
    }
}
