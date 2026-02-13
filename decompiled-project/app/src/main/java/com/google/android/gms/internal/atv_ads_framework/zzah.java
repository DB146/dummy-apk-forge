package com.google.android.gms.internal.atv_ads_framework;

import java.util.AbstractMap;

/* loaded from: classes.dex */
final class zzah extends zzab {
    final /* synthetic */ zzai zza;

    public zzah(zzai zzaiVar) {
        this.zza = zzaiVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i7) {
        int i10;
        Object[] objArr;
        Object[] objArr2;
        i10 = this.zza.zzc;
        zzn.zza(i7, i10, "index");
        zzai zzaiVar = this.zza;
        objArr = zzaiVar.zzb;
        int i11 = i7 + i7;
        Object obj = objArr[i11];
        obj.getClass();
        objArr2 = zzaiVar.zzb;
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

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    public final boolean zzf() {
        return true;
    }
}
