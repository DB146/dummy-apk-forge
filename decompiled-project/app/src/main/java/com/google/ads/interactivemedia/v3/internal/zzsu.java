package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractMap;

/* loaded from: classes.dex */
final class zzsu extends zzso {
    final /* synthetic */ zzsv zza;

    public zzsu(zzsv zzsvVar) {
        this.zza = zzsvVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i7) {
        zztp zztpVar;
        zzso zzsoVar;
        zztpVar = this.zza.zza.zzc;
        E e2 = zztpVar.zzd.get(i7);
        zzsoVar = this.zza.zza.zzd;
        return new AbstractMap.SimpleImmutableEntry(e2, zzsoVar.get(i7));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zza.size();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    public final boolean zzf() {
        return true;
    }
}
