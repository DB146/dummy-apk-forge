package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzpb implements Iterator {
    final /* synthetic */ zzpe zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzpb(zzpe zzpeVar, zzpd zzpdVar) {
        this.zza = zzpeVar;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = zzpe.zzh(this.zza).entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7 = this.zzb + 1;
        zzpe zzpeVar = this.zza;
        if (i7 >= zzpe.zzb(zzpeVar)) {
            return !zzpe.zzh(zzpeVar).isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i7 = this.zzb + 1;
        this.zzb = i7;
        zzpe zzpeVar = this.zza;
        return i7 < zzpe.zzb(zzpeVar) ? (zzpa) zzpe.zzk(zzpeVar)[i7] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzpe.zzi(this.zza);
        int i7 = this.zzb;
        zzpe zzpeVar = this.zza;
        if (i7 >= zzpe.zzb(zzpeVar)) {
            zza().remove();
        } else {
            this.zzb = i7 - 1;
            zzpe.zze(zzpeVar, i7);
        }
    }
}
