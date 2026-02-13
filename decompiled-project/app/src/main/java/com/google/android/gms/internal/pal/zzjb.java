package com.google.android.gms.internal.pal;

import com.google.android.gms.common.api.f;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzjb {
    Object[] zza = new Object[8];
    int zzb = 0;
    zzja zzc;

    private final void zzd(int i7) {
        int i10 = i7 + i7;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (i10 > length) {
            int i11 = length + (length >> 1) + 1;
            if (i11 < i10) {
                int highestOneBit = Integer.highestOneBit(i10 - 1);
                i11 = highestOneBit + highestOneBit;
            }
            if (i11 < 0) {
                i11 = f.API_PRIORITY_OTHER;
            }
            this.zza = Arrays.copyOf(objArr, i11);
        }
    }

    public final zzjb zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zziu.zza(obj, obj2);
        Object[] objArr = this.zza;
        int i7 = this.zzb;
        int i10 = i7 + i7;
        objArr[i10] = obj;
        objArr[i10 + 1] = obj2;
        this.zzb = i7 + 1;
        return this;
    }

    public final zzjb zzb(Map map) {
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet instanceof Collection) {
            zzd(entrySet.size() + this.zzb);
        }
        for (Map.Entry entry : entrySet) {
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzjc zzc() {
        zzja zzjaVar = this.zzc;
        if (zzjaVar != null) {
            throw zzjaVar.zza();
        }
        zzjj zzk = zzjj.zzk(this.zzb, this.zza, this);
        zzja zzjaVar2 = this.zzc;
        if (zzjaVar2 == null) {
            return zzk;
        }
        throw zzjaVar2.zza();
    }
}
