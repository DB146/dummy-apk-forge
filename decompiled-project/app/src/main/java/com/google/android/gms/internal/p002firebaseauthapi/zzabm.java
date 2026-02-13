package com.google.android.gms.internal.p002firebaseauthapi;

import O5.b;
import android.text.TextUtils;

/* loaded from: classes.dex */
final class zzabm implements zzafn<zzajd> {
    private final /* synthetic */ zzaeg zza;
    private final /* synthetic */ zzabj zzb;

    public zzabm(zzabj zzabjVar, zzaeg zzaegVar) {
        this.zza = zzaegVar;
        this.zzb = zzabjVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafn
    public final /* synthetic */ void zza(zzajd zzajdVar) {
        zzajd zzajdVar2 = zzajdVar;
        if (TextUtils.isEmpty(zzajdVar2.zza()) || TextUtils.isEmpty(zzajdVar2.zzb())) {
            this.zza.zza(b.K("INTERNAL_SUCCESS_SIGN_OUT"));
            return;
        }
        this.zzb.zza.zza(new zzahn(zzajdVar2.zzb(), zzajdVar2.zza(), Long.valueOf(zzahp.zza(zzajdVar2.zza())), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafk
    public final void zza(String str) {
        this.zza.zza(b.K(str));
    }
}
