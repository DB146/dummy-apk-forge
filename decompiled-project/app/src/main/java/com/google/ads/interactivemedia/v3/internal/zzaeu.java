package com.google.ads.interactivemedia.v3.internal;

import X.c;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzaeu extends zzadc implements RandomAccess, zzaey, zzagg {
    private static final zzaeu zza = new zzaeu(new int[0], 0, false);
    private int[] zzb;
    private int zzc;

    public zzaeu() {
        this(new int[10], 0, true);
    }

    private zzaeu(int[] iArr, int i7, boolean z8) {
        super(z8);
        this.zzb = iArr;
        this.zzc = i7;
    }

    public static zzaeu zzf() {
        return zza;
    }

    private final String zzh(int i7) {
        return c.e(i7, this.zzc, "Index:", ", Size:");
    }

    private final void zzi(int i7) {
        if (i7 < 0 || i7 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzh(i7));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadc, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        zza();
        if (i7 < 0 || i7 > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzh(i7));
        }
        int[] iArr = this.zzb;
        if (i10 < iArr.length) {
            System.arraycopy(iArr, i7, iArr, i7 + 1, i10 - i7);
        } else {
            int[] iArr2 = new int[c.b(i10, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i7);
            System.arraycopy(this.zzb, i7, iArr2, i7 + 1, this.zzc - i7);
            this.zzb = iArr2;
        }
        this.zzb[i7] = intValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadc, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Integer) obj).intValue());
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadc, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzafa.zzd;
        collection.getClass();
        if (!(collection instanceof zzaeu)) {
            return super.addAll(collection);
        }
        zzaeu zzaeuVar = (zzaeu) collection;
        int i7 = zzaeuVar.zzc;
        if (i7 == 0) {
            return false;
        }
        int i10 = this.zzc;
        if (f.API_PRIORITY_OTHER - i10 < i7) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i7;
        int[] iArr = this.zzb;
        if (i11 > iArr.length) {
            this.zzb = Arrays.copyOf(iArr, i11);
        }
        System.arraycopy(zzaeuVar.zzb, 0, this.zzb, this.zzc, zzaeuVar.zzc);
        this.zzc = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadc, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaeu)) {
            return super.equals(obj);
        }
        zzaeu zzaeuVar = (zzaeu) obj;
        if (this.zzc != zzaeuVar.zzc) {
            return false;
        }
        int[] iArr = zzaeuVar.zzb;
        for (int i7 = 0; i7 < this.zzc; i7++) {
            if (this.zzb[i7] != iArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        zzi(i7);
        return Integer.valueOf(this.zzb[i7]);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadc, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            i7 = (i7 * 31) + this.zzb[i10];
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i7 = this.zzc;
        for (int i10 = 0; i10 < i7; i10++) {
            if (this.zzb[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadc, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        zza();
        zzi(i7);
        int[] iArr = this.zzb;
        int i10 = iArr[i7];
        if (i7 < this.zzc - 1) {
            System.arraycopy(iArr, i7 + 1, iArr, i7, (r2 - i7) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i10) {
        zza();
        if (i10 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzb;
        System.arraycopy(iArr, i10, iArr, i7, this.zzc - i10);
        this.zzc -= i10 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadc, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zza();
        zzi(i7);
        int[] iArr = this.zzb;
        int i10 = iArr[i7];
        iArr[i7] = intValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaez
    public final /* bridge */ /* synthetic */ zzaez zzd(int i7) {
        if (i7 >= this.zzc) {
            return new zzaeu(Arrays.copyOf(this.zzb, i7), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final int zze(int i7) {
        zzi(i7);
        return this.zzb[i7];
    }

    public final void zzg(int i7) {
        zza();
        int i10 = this.zzc;
        int[] iArr = this.zzb;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[c.b(i10, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.zzb = iArr2;
        }
        int[] iArr3 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        iArr3[i11] = i7;
    }
}
