package com.google.android.gms.internal.atv_ads_framework;

import com.google.android.gms.common.api.f;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzad {
    Object[] zza = new Object[8];
    int zzb = 0;
    zzac zzc;

    private final void zzd(int i7) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i10 = i7 + i7;
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

    public final zzad zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zzw.zza(obj, obj2);
        Object[] objArr = this.zza;
        int i7 = this.zzb;
        int i10 = i7 + i7;
        objArr[i10] = obj;
        objArr[i10 + 1] = obj2;
        this.zzb = i7 + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzad zzb(Iterable iterable) {
        zzd(iterable.size() + this.zzb);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzae zzc() {
        zzac zzacVar = this.zzc;
        if (zzacVar != null) {
            throw zzacVar.zza();
        }
        zzal zzf = zzal.zzf(this.zzb, this.zza, this);
        zzac zzacVar2 = this.zzc;
        if (zzacVar2 == null) {
            return zzf;
        }
        throw zzacVar2.zza();
    }
}
