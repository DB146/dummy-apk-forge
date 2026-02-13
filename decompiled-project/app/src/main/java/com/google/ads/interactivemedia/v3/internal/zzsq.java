package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzsq {
    Object[] zza;
    int zzb;
    zzsp zzc;

    public zzsq() {
        this(4);
    }

    public zzsq(int i7) {
        this.zza = new Object[i7 + i7];
        this.zzb = 0;
    }

    private final void zzd(int i7) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i10 = i7 + i7;
        if (i10 > length) {
            this.zza = Arrays.copyOf(objArr, zzsj.zza(length, i10));
        }
    }

    public final zzsq zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zzrv.zzb(obj, obj2);
        Object[] objArr = this.zza;
        int i7 = this.zzb;
        int i10 = i7 + i7;
        objArr[i10] = obj;
        objArr[i10 + 1] = obj2;
        this.zzb = i7 + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzsq zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzd(iterable.size() + this.zzb);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzsr zzc() {
        zzsp zzspVar = this.zzc;
        if (zzspVar != null) {
            throw zzspVar.zza();
        }
        zztn zzj = zztn.zzj(this.zzb, this.zza, this);
        zzsp zzspVar2 = this.zzc;
        if (zzspVar2 == null) {
            return zzj;
        }
        throw zzspVar2.zza();
    }
}
