package com.google.android.gms.internal.p002firebaseauthapi;

import O5.b;
import n7.B;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzacb implements zzafn<zzahn> {
    private final /* synthetic */ B zza;
    private final /* synthetic */ zzaeg zzb;
    private final /* synthetic */ zzaam zzc;

    public zzacb(zzaam zzaamVar, B b2, zzaeg zzaegVar) {
        this.zza = b2;
        this.zzb = zzaegVar;
        this.zzc = zzaamVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafn
    public final void zza(zzahn zzahnVar) {
        zzahn zzahnVar2 = zzahnVar;
        zzaid zzaidVar = new zzaid();
        zzaidVar.zzd(zzahnVar2.zzc());
        B b2 = this.zza;
        if (b2.f21241c || b2.f21239a != null) {
            zzaidVar.zzb(b2.f21239a);
        }
        B b10 = this.zza;
        if (b10.f21242d || b10.f21243e != null) {
            zzaidVar.zzg(b10.f21240b);
        }
        zzaam.zza(this.zzc, this.zzb, zzahnVar2, zzaidVar, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafk
    public final void zza(String str) {
        this.zzb.zza(b.K(str));
    }
}
