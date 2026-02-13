package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.TaskCompletionSource;
import n7.C1713d;
import o7.C1810A;
import o7.C1815e;
import o7.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzact extends zzaex<Object, v> {
    private final C1713d zzu;
    private final String zzv;

    public zzact(C1713d c1713d, String str) {
        super(2);
        G.h(c1713d, "credential cannot be null");
        this.zzu = c1713d;
        G.e(c1713d.f21281a, "email cannot be null");
        G.e(c1713d.f21282b, "password cannot be null");
        this.zzv = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "linkEmailAuthCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        C1713d c1713d = this.zzu;
        String str = c1713d.f21281a;
        String str2 = c1713d.f21282b;
        G.d(str2);
        zzaefVar.zza(str, str2, ((C1815e) this.zzd).f22069a.zzf(), this.zzd.t(), this.zzv, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
        C1815e zza = zzach.zza(this.zzc, this.zzk);
        ((v) this.zze).a(this.zzj, zza);
        zzb(new C1810A(zza));
    }
}
