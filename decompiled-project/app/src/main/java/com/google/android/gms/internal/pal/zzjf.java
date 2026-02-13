package com.google.android.gms.internal.pal;

import java.util.AbstractMap;

/* loaded from: classes.dex */
final class zzjf extends zziz {
    final /* synthetic */ zzjg zza;

    public zzjf(zzjg zzjgVar) {
        this.zza = zzjgVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i7) {
        int i10;
        Object[] objArr;
        Object[] objArr2;
        i10 = this.zza.zzc;
        zzip.zza(i7, i10, "index");
        zzjg zzjgVar = this.zza;
        int i11 = i7 + i7;
        objArr = zzjgVar.zzb;
        Object obj = objArr[i11];
        obj.getClass();
        objArr2 = zzjgVar.zzb;
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
}
