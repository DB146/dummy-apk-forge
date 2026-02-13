package com.google.android.gms.internal.common;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class zzak extends zzag implements List, RandomAccess {
    private static final zzao zza = new zzai(zzam.zza, 0);

    public static zzak zzi(Object[] objArr, int i7) {
        return i7 == 0 ? zzam.zza : new zzam(objArr, i7);
    }

    public static zzak zzj(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return zzk((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return zzam.zza;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return zzm(next);
        }
        zzah zzahVar = new zzah(4);
        zzahVar.zzb(next);
        zzahVar.zzc(it);
        zzahVar.zzc = true;
        return zzi(zzahVar.zza, zzahVar.zzb);
    }

    public static zzak zzk(Collection collection) {
        if (!(collection instanceof zzag)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzal.zza(array, length);
            return zzi(array, length);
        }
        zzak zzd = ((zzag) collection).zzd();
        if (!zzd.zzf()) {
            return zzd;
        }
        Object[] array2 = zzd.toArray();
        return zzi(array2, array2.length);
    }

    public static zzak zzl() {
        return zzam.zza;
    }

    public static zzak zzm(Object obj) {
        Object[] objArr = {obj};
        zzal.zza(objArr, 1);
        return zzi(objArr, 1);
    }

    public static zzak zzn(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzal.zza(objArr, 2);
        return zzi(objArr, 2);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i7 = 0; i7 < size; i7++) {
                        if (zzu.zza(get(i7), list.get(i7))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !zzu.zza(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i7 = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i7 = (i7 * 31) + get(i10).hashCode();
        }
        return i7;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (obj.equals(get(i7))) {
                return i7;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzag, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.common.zzag
    public int zza(Object[] objArr, int i7) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = get(i10);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.common.zzag
    @Deprecated
    public final zzak zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.common.zzag
    /* renamed from: zze */
    public final zzan iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh */
    public zzak subList(int i7, int i10) {
        zzv.zzc(i7, i10, size());
        int i11 = i10 - i7;
        return i11 == size() ? this : i11 == 0 ? zzam.zza : new zzaj(this, i7, i11);
    }

    @Override // java.util.List
    /* renamed from: zzo, reason: merged with bridge method [inline-methods] */
    public final zzao listIterator(int i7) {
        zzv.zzb(i7, size(), "index");
        return isEmpty() ? zza : new zzai(this, i7);
    }
}
