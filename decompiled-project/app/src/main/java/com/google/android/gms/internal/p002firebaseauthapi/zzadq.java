package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.TaskCompletionSource;
import n7.C1713d;
import o7.C1810A;
import o7.C1815e;
import o7.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzadq extends zzaex<Object, v> {
    private final zzagp zzu;

    public zzadq(C1713d c1713d, String str) {
        super(2);
        G.h(c1713d, "credential cannot be null");
        this.zzu = new zzagp(c1713d, null, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "sendSignInLinkToEmail";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zza(this.zzu, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
        C1815e zza = zzach.zza(this.zzc, this.zzk);
        ((v) this.zze).a(this.zzj, zza);
        zzb(new C1810A(zza));
    }
}
