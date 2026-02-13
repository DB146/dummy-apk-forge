package com.google.android.recaptcha.internal;

import A3.c;
import ac.g;
import q3.f;

/* loaded from: classes.dex */
public final class zzbj implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        return c.m(c.o("avgExecutionTime: ", g.k0(10, String.valueOf(this.zzb / this.zza)), " us| maxExecutionTime: ", g.k0(10, String.valueOf(this.zzc)), " us| totalTime: "), g.k0(10, String.valueOf(this.zzb)), " us| #Usages: ", g.k0(5, String.valueOf(this.zza)));
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzbj zzbjVar) {
        return f.h(Long.valueOf(this.zzb), Long.valueOf(zzbjVar.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j) {
        this.zzc = j;
    }

    public final void zzf(long j) {
        this.zzb = j;
    }

    public final void zzg(int i7) {
        this.zza = i7;
    }
}
