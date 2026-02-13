package com.google.android.recaptcha.internal;

import X.c;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zznx extends zzkr implements RandomAccess, zznj, zzor {
    private static final long[] zza;
    private static final zznx zzb;
    private long[] zzc;
    private int zzd;

    static {
        long[] jArr = new long[0];
        zza = jArr;
        zzb = new zznx(jArr, 0, false);
    }

    public zznx() {
        this(zza, 0, true);
    }

    private zznx(long[] jArr, int i7, boolean z8) {
        super(z8);
        this.zzc = jArr;
        this.zzd = i7;
    }

    public static zznx zzf() {
        return zzb;
    }

    private static int zzi(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final String zzj(int i7) {
        return c.e(i7, this.zzd, "Index:", ", Size:");
    }

    private final void zzk(int i7) {
        if (i7 < 0 || i7 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzj(i7));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i10;
        long longValue = ((Long) obj).longValue();
        zza();
        if (i7 < 0 || i7 > (i10 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzj(i7));
        }
        int i11 = i7 + 1;
        long[] jArr = this.zzc;
        int length = jArr.length;
        if (i10 < length) {
            System.arraycopy(jArr, i7, jArr, i11, i10 - i7);
        } else {
            long[] jArr2 = new long[zzi(length)];
            System.arraycopy(this.zzc, 0, jArr2, 0, i7);
            System.arraycopy(this.zzc, i7, jArr2, i11, this.zzd - i7);
            this.zzc = jArr2;
        }
        this.zzc[i7] = longValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Long) obj).longValue());
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zznl.zzb;
        collection.getClass();
        if (!(collection instanceof zznx)) {
            return super.addAll(collection);
        }
        zznx zznxVar = (zznx) collection;
        int i7 = zznxVar.zzd;
        if (i7 == 0) {
            return false;
        }
        int i10 = this.zzd;
        if (f.API_PRIORITY_OTHER - i10 < i7) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i7;
        long[] jArr = this.zzc;
        if (i11 > jArr.length) {
            this.zzc = Arrays.copyOf(jArr, i11);
        }
        System.arraycopy(zznxVar.zzc, 0, this.zzc, this.zzd, zznxVar.zzd);
        this.zzd = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zznx)) {
            return super.equals(obj);
        }
        zznx zznxVar = (zznx) obj;
        if (this.zzd != zznxVar.zzd) {
            return false;
        }
        long[] jArr = zznxVar.zzc;
        for (int i7 = 0; i7 < this.zzd; i7++) {
            if (this.zzc[i7] != jArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        zzk(i7);
        return Long.valueOf(this.zzc[i7]);
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i10 = 0; i10 < this.zzd; i10++) {
            long j = this.zzc[i10];
            byte[] bArr = zznl.zzb;
            i7 = (i7 * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i7 = this.zzd;
        for (int i10 = 0; i10 < i7; i10++) {
            if (this.zzc[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        zza();
        zzk(i7);
        long[] jArr = this.zzc;
        long j = jArr[i7];
        if (i7 < this.zzd - 1) {
            System.arraycopy(jArr, i7 + 1, jArr, i7, (r3 - i7) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i10) {
        zza();
        if (i10 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzc;
        System.arraycopy(jArr, i10, jArr, i7, this.zzd - i10);
        this.zzd -= i10 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        long longValue = ((Long) obj).longValue();
        zza();
        zzk(i7);
        long[] jArr = this.zzc;
        long j = jArr[i7];
        jArr[i7] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zznk
    public final /* bridge */ /* synthetic */ zznk zzd(int i7) {
        if (i7 >= this.zzd) {
            return new zznx(i7 == 0 ? zza : Arrays.copyOf(this.zzc, i7), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final long zze(int i7) {
        zzk(i7);
        return this.zzc[i7];
    }

    public final void zzg(long j) {
        zza();
        int i7 = this.zzd;
        int length = this.zzc.length;
        if (i7 == length) {
            long[] jArr = new long[zzi(length)];
            System.arraycopy(this.zzc, 0, jArr, 0, this.zzd);
            this.zzc = jArr;
        }
        long[] jArr2 = this.zzc;
        int i10 = this.zzd;
        this.zzd = i10 + 1;
        jArr2[i10] = j;
    }

    public final void zzh(int i7) {
        int length = this.zzc.length;
        if (i7 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new long[Math.max(i7, 10)];
            return;
        }
        while (length < i7) {
            length = zzi(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }
}
