package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzand implements Iterator {
    private int zza;
    private boolean zzb;
    private Iterator zzc;
    private final /* synthetic */ zzamw zzd;

    private zzand(zzamw zzamwVar) {
        this.zzd = zzamwVar;
        this.zza = -1;
    }

    private final Iterator zza() {
        Map map;
        if (this.zzc == null) {
            map = this.zzd.zzc;
            this.zzc = map.entrySet().iterator();
        }
        return this.zzc;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7;
        Map map;
        int i10 = this.zza + 1;
        i7 = this.zzd.zzb;
        if (i10 >= i7) {
            map = this.zzd.zzc;
            if (map.isEmpty() || !zza().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i7;
        Object[] objArr;
        this.zzb = true;
        int i10 = this.zza + 1;
        this.zza = i10;
        i7 = this.zzd.zzb;
        if (i10 >= i7) {
            return (Map.Entry) zza().next();
        }
        objArr = this.zzd.zza;
        return (zzana) objArr[this.zza];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i7;
        if (!this.zzb) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzb = false;
        this.zzd.zzg();
        int i10 = this.zza;
        i7 = this.zzd.zzb;
        if (i10 >= i7) {
            zza().remove();
            return;
        }
        zzamw zzamwVar = this.zzd;
        int i11 = this.zza;
        this.zza = i11 - 1;
        zzamwVar.zzb(i11);
    }
}
