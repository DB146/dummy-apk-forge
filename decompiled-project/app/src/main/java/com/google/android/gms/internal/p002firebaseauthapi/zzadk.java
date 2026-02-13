package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.TaskCompletionSource;
import n7.C1710a;
import o7.v;

/* loaded from: classes.dex */
final class zzadk extends zzaex<Void, v> {
    private final zzahe zzu;
    private final String zzv;

    public zzadk(String str, C1710a c1710a, String str2, String str3, String str4) {
        super(4);
        G.e(str, "email cannot be null or empty");
        zzahe zzaheVar = new zzahe(c1710a.f21275w);
        this.zzu = zzaheVar;
        zzaheVar.zzb(str);
        zzaheVar.zza(c1710a);
        zzaheVar.zzc(str2);
        zzaheVar.zza(str3);
        this.zzv = str4;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zzb(this.zzu, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
        zzb(null);
    }
}
