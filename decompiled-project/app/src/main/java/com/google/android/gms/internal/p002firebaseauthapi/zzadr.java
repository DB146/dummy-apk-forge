package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.TaskCompletionSource;
import o7.C1817g;

/* loaded from: classes.dex */
final class zzadr extends zzaex<zzaij, Void> {
    private final zzaim zzu;

    public zzadr(C1817g c1817g, String str) {
        super(12);
        G.g(c1817g);
        String str2 = c1817g.f22083a;
        G.d(str2);
        this.zzu = zzaim.zza(str2, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "startMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zza(this.zzu, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
        zzb(this.zzt);
    }
}
