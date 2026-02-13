package com.google.ads.interactivemedia.v3.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class zzsf implements Iterator {
    final /* synthetic */ zzsg zza;
    private int zzb;
    private int zzc = -1;
    private int zzd;
    private int zze;

    public zzsf(zzsg zzsgVar) {
        this.zza = zzsgVar;
        this.zzb = zzsh.zza(zzsgVar.zzb);
        zzsh zzshVar = zzsgVar.zzb;
        this.zzd = zzshVar.zzd;
        this.zze = zzshVar.zzc;
    }

    private final void zza() {
        if (this.zza.zzb.zzd != this.zzd) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zzb != -2 && this.zze > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object zza = this.zza.zza(this.zzb);
        this.zzc = this.zzb;
        this.zzb = zzsh.zzn(this.zza.zzb)[this.zzb];
        this.zze--;
        return zza;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zza();
        zzrm.zzh(this.zzc != -1, "no calls to next() since the last call to remove()");
        zzsh zzshVar = this.zza.zzb;
        int i7 = this.zzc;
        zzshVar.zzl(i7, zzsi.zzc(zzshVar.zza[i7]));
        int i10 = this.zzb;
        zzsh zzshVar2 = this.zza.zzb;
        if (i10 == zzshVar2.zzc) {
            this.zzb = this.zzc;
        }
        this.zzc = -1;
        this.zzd = zzshVar2.zzd;
    }
}
