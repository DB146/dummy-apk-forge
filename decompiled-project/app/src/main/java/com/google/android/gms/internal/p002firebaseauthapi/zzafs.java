package com.google.android.gms.internal.p002firebaseauthapi;

import Y6.k;
import n7.r;
import n7.s;
import n7.t;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzafs extends t {
    private final /* synthetic */ t zza;
    private final /* synthetic */ String zzb;

    public zzafs(t tVar, String str) {
        this.zza = tVar;
        this.zzb = str;
    }

    @Override // n7.t
    public final void onCodeAutoRetrievalTimeOut(String str) {
        zzaft.zza.remove(this.zzb);
        this.zza.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // n7.t
    public final void onCodeSent(String str, s sVar) {
        this.zza.onCodeSent(str, sVar);
    }

    @Override // n7.t
    public final void onVerificationCompleted(r rVar) {
        zzaft.zza.remove(this.zzb);
        this.zza.onVerificationCompleted(rVar);
    }

    @Override // n7.t
    public final void onVerificationFailed(k kVar) {
        zzaft.zza.remove(this.zzb);
        this.zza.onVerificationFailed(kVar);
    }
}
