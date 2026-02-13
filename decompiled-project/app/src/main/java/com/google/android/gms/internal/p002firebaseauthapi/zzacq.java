package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.TaskCompletionSource;
import n7.p;
import o7.v;

/* loaded from: classes.dex */
final class zzacq extends zzaex<Void, v> {
    private final p zzu;
    private final String zzv;
    private final String zzw;
    private final String zzx;

    public zzacq(p pVar, String str, String str2, String str3) {
        super(2);
        G.g(pVar);
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "finalizeMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zza((p) null, this.zzv, this.zzw, this.zzx, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
        ((v) this.zze).a(this.zzj, zzach.zza(this.zzc, this.zzk));
        zzb(null);
    }
}
