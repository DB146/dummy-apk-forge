package com.google.android.gms.internal.pal;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class zzafn extends AbstractList implements RandomAccess, zzadn {
    private final zzadn zza;

    public zzafn(zzadn zzadnVar) {
        this.zza = zzadnVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i7) {
        return ((zzadm) this.zza).get(i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzafm(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        return new zzafl(this, i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.pal.zzadn
    public final zzadn zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.pal.zzadn
    public final Object zzf(int i7) {
        return this.zza.zzf(i7);
    }

    @Override // com.google.android.gms.internal.pal.zzadn
    public final List zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.pal.zzadn
    public final void zzi(zzaby zzabyVar) {
        throw new UnsupportedOperationException();
    }
}
