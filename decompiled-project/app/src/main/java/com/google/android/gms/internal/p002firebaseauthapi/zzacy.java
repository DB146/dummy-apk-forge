package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.TaskCompletionSource;
import n7.C1713d;
import n7.l;
import o7.C1810A;
import o7.C1815e;
import o7.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzacy extends zzaex<Object, v> {
    private final C1713d zzu;

    public zzacy(C1713d c1713d) {
        super(2);
        G.h(c1713d, "credential cannot be null");
        this.zzu = c1713d;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "linkEmailAuthCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        C1713d c1713d = this.zzu;
        l lVar = this.zzd;
        c1713d.getClass();
        c1713d.f21284d = ((C1815e) lVar).f22069a.zzf();
        c1713d.f21285e = true;
        zzaefVar.zza(new zzagp(c1713d, null, null), this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
        C1815e zza = zzach.zza(this.zzc, this.zzk);
        ((v) this.zze).a(this.zzj, zza);
        zzb(new C1810A(zza));
    }
}
