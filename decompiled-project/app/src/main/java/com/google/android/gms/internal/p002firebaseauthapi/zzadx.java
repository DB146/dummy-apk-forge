package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.TaskCompletionSource;
import o7.C1815e;
import o7.v;

/* loaded from: classes.dex */
final class zzadx extends zzaex<Void, v> {
    private final String zzu;

    public zzadx(String str) {
        super(2);
        G.e(str, "password cannot be null or empty");
        this.zzu = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "updatePassword";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zzc(((C1815e) this.zzd).f22069a.zzf(), this.zzu, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
        ((v) this.zze).a(this.zzj, zzach.zza(this.zzc, this.zzk));
        zzb(null);
    }
}
