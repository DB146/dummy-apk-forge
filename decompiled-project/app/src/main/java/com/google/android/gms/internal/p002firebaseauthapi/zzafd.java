package com.google.android.gms.internal.p002firebaseauthapi;

import n7.t;

/* loaded from: classes.dex */
final class zzafd implements zzafe {
    private final /* synthetic */ String zza;

    public zzafd(zzaez zzaezVar, String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(t tVar, Object... objArr) {
        tVar.onCodeAutoRetrievalTimeOut(this.zza);
    }
}
