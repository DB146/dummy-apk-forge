package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* loaded from: classes.dex */
public final class zzaho extends AbstractList implements RandomAccess, zzafh {
    private final zzafh zza;

    public zzaho(zzafh zzafhVar) {
        this.zza = zzafhVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i7) {
        return ((zzafg) this.zza).get(i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzahn(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        return new zzahm(this, i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafh
    public final zzafh zze() {
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafh
    public final Object zzf(int i7) {
        return this.zza.zzf(i7);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafh
    public final List zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafh
    public final void zzi(zzadr zzadrVar) {
        throw new UnsupportedOperationException();
    }
}
