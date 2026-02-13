package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.TaskCompletionSource;
import n7.C1710a;
import o7.v;

/* loaded from: classes.dex */
final class zzadh extends zzaex<Void, v> {
    private final zzahe zzu;

    public zzadh(String str, C1710a c1710a) {
        super(6);
        G.e(str, "token cannot be null or empty");
        zzahe zzaheVar = new zzahe(4);
        this.zzu = zzaheVar;
        zzaheVar.zzd(str);
        if (c1710a != null) {
            zzaheVar.zza(c1710a);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "sendEmailVerification";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zza(this.zzu, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
        zzb(null);
    }
}
