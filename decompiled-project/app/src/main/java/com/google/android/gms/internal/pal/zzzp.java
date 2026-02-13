package com.google.android.gms.internal.pal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class zzzp implements Iterator {
    zzzq zza;
    zzzq zzb = null;
    int zzc;
    final /* synthetic */ zzzr zzd;

    public zzzp(zzzr zzzrVar) {
        this.zzd = zzzrVar;
        this.zza = zzzrVar.zze.zzd;
        this.zzc = zzzrVar.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza != this.zzd.zze;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzzq zzzqVar = this.zzb;
        if (zzzqVar == null) {
            throw new IllegalStateException();
        }
        this.zzd.zze(zzzqVar, true);
        this.zzb = null;
        this.zzc = this.zzd.zzd;
    }

    public final zzzq zza() {
        zzzq zzzqVar = this.zza;
        zzzr zzzrVar = this.zzd;
        if (zzzqVar == zzzrVar.zze) {
            throw new NoSuchElementException();
        }
        if (zzzrVar.zzd != this.zzc) {
            throw new ConcurrentModificationException();
        }
        this.zza = zzzqVar.zzd;
        this.zzb = zzzqVar;
        return zzzqVar;
    }
}
