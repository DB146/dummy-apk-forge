package com.google.android.gms.internal.p002firebaseauthapi;

import b5.j;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import o7.v;

/* loaded from: classes.dex */
final class zzacn extends zzaex<Object, v> {
    private final String zzu;
    private final String zzv;

    public zzacn(String str, String str2) {
        super(3);
        G.e(str, "email cannot be null or empty");
        this.zzu = str;
        this.zzv = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "fetchSignInMethodsForEmail";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zze(this.zzu, this.zzv, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
        List<String> zza;
        if (this.zzl.zza() == null) {
            zza = zzaj.zzh();
        } else {
            zza = this.zzl.zza();
            G.g(zza);
        }
        zzb(new j(zza));
    }
}
