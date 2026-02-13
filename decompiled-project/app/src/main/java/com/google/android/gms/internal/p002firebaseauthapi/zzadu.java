package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.TaskCompletionSource;
import n7.t;
import n7.v;

/* loaded from: classes.dex */
final class zzadu extends zzaex<Void, t> {
    private final zzaah zzu;

    public zzadu(v vVar, String str, String str2, long j, boolean z8, boolean z10, String str3, String str4, String str5, boolean z11) {
        super(8);
        G.g(vVar);
        G.d(str);
        this.zzu = new zzaah(vVar, str, str2, j, z8, z10, str3, str4, str5, z11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "startMfaSignInWithPhoneNumber";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zza(this.zzu, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
    }
}
