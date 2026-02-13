package com.google.android.gms.internal.atv_ads_framework;

import java.util.Set;

/* loaded from: classes.dex */
public abstract class zzaf extends zzy implements Set {
    private transient zzab zza;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzam.zza(this);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    public zzab zzd() {
        zzab zzabVar = this.zza;
        if (zzabVar != null) {
            return zzabVar;
        }
        zzab zzh = zzh();
        this.zza = zzh;
        return zzh;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: zze */
    public abstract zzan iterator();

    public zzab zzh() {
        return zzab.zzi(toArray());
    }
}
