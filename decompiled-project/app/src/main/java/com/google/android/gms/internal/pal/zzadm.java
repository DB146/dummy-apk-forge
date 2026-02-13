package com.google.android.gms.internal.pal;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class zzadm extends zzabj implements RandomAccess, zzadn {
    public static final zzadn zza;
    private static final zzadm zzb;
    private final List zzc;

    static {
        zzadm zzadmVar = new zzadm(10);
        zzb = zzadmVar;
        zzadmVar.zzb();
        zza = zzadmVar;
    }

    public zzadm() {
        this(10);
    }

    public zzadm(int i7) {
        this.zzc = new ArrayList(i7);
    }

    private zzadm(ArrayList arrayList) {
        this.zzc = arrayList;
    }

    private static String zzj(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzaby ? ((zzaby) obj).zzr(zzadg.zzb) : zzadg.zzh((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.pal.zzabj, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i7, Object obj) {
        zza();
        this.zzc.add(i7, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.pal.zzabj, java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        zza();
        if (collection instanceof zzadn) {
            collection = ((zzadn) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i7, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.pal.zzabj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.pal.zzabj, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.pal.zzabj, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        zza();
        Object remove = this.zzc.remove(i7);
        ((AbstractList) this).modCount++;
        return zzj(remove);
    }

    @Override // com.google.android.gms.internal.pal.zzabj, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        zza();
        return zzj(this.zzc.set(i7, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.pal.zzadf
    public final /* bridge */ /* synthetic */ zzadf zzd(int i7) {
        if (i7 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i7);
        arrayList.addAll(this.zzc);
        return new zzadm(arrayList);
    }

    @Override // com.google.android.gms.internal.pal.zzadn
    public final zzadn zze() {
        return zzc() ? new zzafn(this) : this;
    }

    @Override // com.google.android.gms.internal.pal.zzadn
    public final Object zzf(int i7) {
        return this.zzc.get(i7);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final String get(int i7) {
        Object obj = this.zzc.get(i7);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzaby) {
            zzaby zzabyVar = (zzaby) obj;
            String zzr = zzabyVar.zzr(zzadg.zzb);
            if (zzabyVar.zzk()) {
                this.zzc.set(i7, zzr);
            }
            return zzr;
        }
        byte[] bArr = (byte[]) obj;
        String zzh = zzadg.zzh(bArr);
        if (zzadg.zzi(bArr)) {
            this.zzc.set(i7, zzh);
        }
        return zzh;
    }

    @Override // com.google.android.gms.internal.pal.zzadn
    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    @Override // com.google.android.gms.internal.pal.zzadn
    public final void zzi(zzaby zzabyVar) {
        zza();
        this.zzc.add(zzabyVar);
        ((AbstractList) this).modCount++;
    }
}
