package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractMap;

/* loaded from: classes.dex */
final class zztj extends zzso {
    final /* synthetic */ zztk zza;

    public zztj(zztk zztkVar) {
        this.zza = zztkVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i7) {
        int i10;
        Object[] objArr;
        Object[] objArr2;
        i10 = this.zza.zzc;
        zzrm.zza(i7, i10, "index");
        zztk zztkVar = this.zza;
        objArr = zztkVar.zzb;
        int i11 = i7 + i7;
        Object obj = objArr[i11];
        obj.getClass();
        objArr2 = zztkVar.zzb;
        Object obj2 = objArr2[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i7;
        i7 = this.zza.zzc;
        return i7;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    public final boolean zzf() {
        return true;
    }
}
