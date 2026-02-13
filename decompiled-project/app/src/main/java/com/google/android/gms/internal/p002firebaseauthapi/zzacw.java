package com.google.android.gms.internal.p002firebaseauthapi;

import Y6.b;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.TaskCompletionSource;
import n7.AbstractC1712c;
import o7.C1810A;
import o7.C1815e;
import o7.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzacw extends zzaex<Object, v> {
    private final zzait zzu;

    public zzacw(AbstractC1712c abstractC1712c) {
        super(2);
        G.h(abstractC1712c, "credential cannot be null");
        this.zzu = b.A(abstractC1712c, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "linkFederatedCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zza(((C1815e) this.zzd).f22069a.zzf(), this.zzu, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
        C1815e zza = zzach.zza(this.zzc, this.zzk);
        ((v) this.zze).a(this.zzj, zza);
        zzb(new C1810A(zza));
    }
}
