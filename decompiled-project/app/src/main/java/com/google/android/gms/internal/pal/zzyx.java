package com.google.android.gms.internal.pal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzyx extends zzyy implements Iterable {
    private final List zza = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof zzyx) && ((zzyx) obj).zza.equals(this.zza);
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    @Override // com.google.android.gms.internal.pal.zzyy
    public final int zza() {
        if (this.zza.size() == 1) {
            return ((zzyy) this.zza.get(0)).zza();
        }
        throw new IllegalStateException();
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final zzyy zzc(int i7) {
        return (zzyy) this.zza.get(i7);
    }

    @Override // com.google.android.gms.internal.pal.zzyy
    public final String zzd() {
        if (this.zza.size() == 1) {
            return ((zzyy) this.zza.get(0)).zzd();
        }
        throw new IllegalStateException();
    }

    public final void zze(zzyy zzyyVar) {
        this.zza.add(zzyyVar);
    }
}
