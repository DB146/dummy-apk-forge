package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.TaskCompletionSource;
import o7.v;

/* loaded from: classes.dex */
final class zzacm extends zzaex<Void, v> {
    private final zzahu zzu;

    public zzacm(String str, String str2, String str3) {
        super(4);
        G.e(str, "code cannot be null or empty");
        G.e(str2, "new password cannot be null or empty");
        this.zzu = new zzahu(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "confirmPasswordReset";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zza(this.zzu, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
        zzb(null);
    }
}
