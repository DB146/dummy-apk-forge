package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzamy implements Iterator {
    private int zza;
    private Iterator zzb;
    private final /* synthetic */ zzamw zzc;

    private zzamy(zzamw zzamwVar) {
        int i7;
        this.zzc = zzamwVar;
        i7 = zzamwVar.zzb;
        this.zza = i7;
    }

    private final Iterator zza() {
        Map map;
        if (this.zzb == null) {
            map = this.zzc.zzf;
            this.zzb = map.entrySet().iterator();
        }
        return this.zzb;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7;
        int i10 = this.zza;
        if (i10 > 0) {
            i7 = this.zzc.zzb;
            if (i10 <= i7) {
                return true;
            }
        }
        return zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Object[] objArr;
        if (zza().hasNext()) {
            return (Map.Entry) zza().next();
        }
        objArr = this.zzc.zza;
        int i7 = this.zza - 1;
        this.zza = i7;
        return (zzana) objArr[i7];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
