package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.TaskCompletionSource;
import o7.C1815e;
import o7.v;

/* loaded from: classes.dex */
final class zzadb extends zzaex<Void, v> {
    private final String zzu;
    private final String zzv;
    private final String zzw;
    private final String zzx;

    public zzadb(String str, String str2, String str3, String str4) {
        super(2);
        G.e(str, "email cannot be null or empty");
        G.e(str2, "password cannot be null or empty");
        this.zzu = str;
        this.zzv = str2;
        this.zzw = str3;
        this.zzx = str4;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "reauthenticateWithEmailPassword";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zzb(this.zzu, this.zzv, this.zzw, this.zzx, this.zzb);
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
