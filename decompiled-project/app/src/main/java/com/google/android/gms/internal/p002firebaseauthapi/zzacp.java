package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.TaskCompletionSource;
import n7.l;
import n7.p;
import o7.C1810A;
import o7.C1815e;
import o7.v;

/* loaded from: classes.dex */
final class zzacp extends zzaex<Object, v> {
    private final p zzu;
    private final String zzv;
    private final String zzw;

    public zzacp(p pVar, String str, String str2) {
        super(2);
        G.g(pVar);
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "finalizeMfaSignIn";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zza(this.zzv, (p) null, this.zzw, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
        C1815e zza = zzach.zza(this.zzc, this.zzk);
        l lVar = this.zzd;
        if (lVar != null && !((C1815e) lVar).f22070b.f22060a.equalsIgnoreCase(zza.f22070b.f22060a)) {
            zza(new Status(17024, null, null, null));
        } else {
            ((v) this.zze).a(this.zzj, zza);
            zzb(new C1810A(zza));
        }
    }
}
