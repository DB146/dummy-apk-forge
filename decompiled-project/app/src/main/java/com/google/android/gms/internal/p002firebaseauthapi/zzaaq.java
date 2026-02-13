package com.google.android.gms.internal.p002firebaseauthapi;

import O5.b;
import n7.C1713d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaaq implements zzafn<zzahn> {
    private final /* synthetic */ C1713d zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzaeg zzc;
    private final /* synthetic */ zzaam zzd;

    public zzaaq(zzaam zzaamVar, C1713d c1713d, String str, zzaeg zzaegVar) {
        this.zza = c1713d;
        this.zzb = str;
        this.zzc = zzaegVar;
        this.zzd = zzaamVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafn
    public final /* synthetic */ void zza(zzahn zzahnVar) {
        this.zzd.zza(new zzagp(this.zza, zzahnVar.zzc(), this.zzb), this.zzc);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafk
    public final void zza(String str) {
        this.zzc.zza(b.K(str));
    }
}
