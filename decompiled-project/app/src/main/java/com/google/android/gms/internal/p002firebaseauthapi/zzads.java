package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.TaskCompletionSource;
import o7.C1817g;
import o7.v;

/* loaded from: classes.dex */
final class zzads extends zzaex<Void, v> {
    private final String zzaa;
    private final String zzab;
    private final String zzac;
    private final boolean zzad;
    private final String zzu;
    private final String zzv;
    private final String zzw;
    private final long zzx;
    private final boolean zzy;
    private final boolean zzz;

    public zzads(C1817g c1817g, String str, String str2, long j, boolean z8, boolean z10, String str3, String str4, String str5, boolean z11) {
        super(8);
        G.g(c1817g);
        G.d(str);
        String str6 = c1817g.f22083a;
        G.d(str6);
        this.zzu = str6;
        this.zzv = str;
        this.zzw = str2;
        this.zzx = j;
        this.zzy = z8;
        this.zzz = z10;
        this.zzaa = str3;
        this.zzab = str4;
        this.zzac = str5;
        this.zzad = z11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final String zza() {
        return "startMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaefVar) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaefVar.zza(this.zzu, this.zzv, this.zzw, this.zzx, this.zzy, this.zzz, this.zzaa, this.zzab, this.zzac, this.zzad, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaex
    public final void zzb() {
    }
}
