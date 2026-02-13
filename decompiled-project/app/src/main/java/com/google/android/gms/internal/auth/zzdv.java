package com.google.android.gms.internal.auth;

import X.c;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzdv extends zzdr implements RandomAccess, zzez, zzge {
    private static final zzdv zza = new zzdv(new boolean[0], 0, false);
    private boolean[] zzb;
    private int zzc;

    public zzdv() {
        this(new boolean[10], 0, true);
    }

    private zzdv(boolean[] zArr, int i7, boolean z8) {
        super(z8);
        this.zzb = zArr;
        this.zzc = i7;
    }

    private final String zzf(int i7) {
        return c.e(i7, this.zzc, "Index:", ", Size:");
    }

    private final void zzg(int i7) {
        if (i7 < 0 || i7 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i7));
        }
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i10;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i7 < 0 || i7 > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i7));
        }
        boolean[] zArr = this.zzb;
        if (i10 < zArr.length) {
            System.arraycopy(zArr, i7, zArr, i7 + 1, i10 - i7);
        } else {
            boolean[] zArr2 = new boolean[c.b(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i7);
            System.arraycopy(this.zzb, i7, zArr2, i7 + 1, this.zzc - i7);
            this.zzb = zArr2;
        }
        this.zzb[i7] = booleanValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzfa.zzd;
        collection.getClass();
        if (!(collection instanceof zzdv)) {
            return super.addAll(collection);
        }
        zzdv zzdvVar = (zzdv) collection;
        int i7 = zzdvVar.zzc;
        if (i7 == 0) {
            return false;
        }
        int i10 = this.zzc;
        if (f.API_PRIORITY_OTHER - i10 < i7) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i7;
        boolean[] zArr = this.zzb;
        if (i11 > zArr.length) {
            this.zzb = Arrays.copyOf(zArr, i11);
        }
        System.arraycopy(zzdvVar.zzb, 0, this.zzb, this.zzc, zzdvVar.zzc);
        this.zzc = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdv)) {
            return super.equals(obj);
        }
        zzdv zzdvVar = (zzdv) obj;
        if (this.zzc != zzdvVar.zzc) {
            return false;
        }
        boolean[] zArr = zzdvVar.zzb;
        for (int i7 = 0; i7 < this.zzc; i7++) {
            if (this.zzb[i7] != zArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        zzg(i7);
        return Boolean.valueOf(this.zzb[i7]);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            i7 = (i7 * 31) + zzfa.zza(this.zzb[i10]);
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i7 = this.zzc;
        for (int i10 = 0; i10 < i7; i10++) {
            if (this.zzb[i10] == booleanValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        zza();
        zzg(i7);
        boolean[] zArr = this.zzb;
        boolean z8 = zArr[i7];
        if (i7 < this.zzc - 1) {
            System.arraycopy(zArr, i7 + 1, zArr, i7, (r2 - i7) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z8);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i10) {
        zza();
        if (i10 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzb;
        System.arraycopy(zArr, i10, zArr, i7, this.zzc - i10);
        this.zzc -= i10 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        zzg(i7);
        boolean[] zArr = this.zzb;
        boolean z8 = zArr[i7];
        zArr[i7] = booleanValue;
        return Boolean.valueOf(z8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ zzez zzd(int i7) {
        if (i7 >= this.zzc) {
            return new zzdv(Arrays.copyOf(this.zzb, i7), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(boolean z8) {
        zza();
        int i7 = this.zzc;
        boolean[] zArr = this.zzb;
        if (i7 == zArr.length) {
            boolean[] zArr2 = new boolean[c.b(i7, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i7);
            this.zzb = zArr2;
        }
        boolean[] zArr3 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        zArr3[i10] = z8;
    }
}
