package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.TaskCompletionSource;
import n7.r;
import o7.C1810A;
import o7.C1815e;
import o7.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzadg extends zzaex<Object, v> {
    private final zzaai zzu;

    public zzadg(r rVar, String str) {
        super(2);
        G.h(rVar, "credential cannot be null");
        rVar.f21299d = false;
        this.zzu = new zzaai(rVar, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "reauthenticateWithPhoneCredentialWithData";
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
            zzb(new C1810A(zza));
        }
    }
}
